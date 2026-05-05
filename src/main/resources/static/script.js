const API_BASE = "http://localhost:8080";

function showSection(sectionId) {
    document.querySelectorAll('.content-section').forEach(section => {
        section.style.display = 'none';
    });
    document.getElementById(sectionId).style.display = 'block';
    
    document.querySelectorAll('.sidebar nav li').forEach(li => {
        li.classList.remove('active');
    });
    event.currentTarget.classList.add('active');
    
    const titles = {
        'dashboard': 'Dashboard',
        'tenants': 'Tenants Management',
        'rooms': 'Rooms Management',
        'complaints': 'Complaints Box',
        'notices': 'Notice Board',
        'visitors': 'Visitor Log',
        'rent': 'Rent Tracking'
    };
    document.getElementById('section-title').innerText = titles[sectionId];

    if (sectionId === 'tenants') loadTenants();
    if (sectionId === 'rooms') loadRooms();
    if (sectionId === 'notices') loadNotices();
    if (sectionId === 'complaints') loadComplaints();
    if (sectionId === 'dashboard') loadDashboardStats();
}

function openModal(modalId) {
    document.getElementById(modalId).style.display = 'block';
}

function closeModal(modalId) {
    document.getElementById(modalId).style.display = 'none';
}

// Load Data functions
async function loadTenants() {
    const res = await fetch(`${API_BASE}/tenant/all`);
    const tenants = await res.json();
    const tbody = document.getElementById('tenant-list');
    tbody.innerHTML = tenants.map(t => `
        <tr>
            <td>${t.name}</td>
            <td>${t.phone}</td>
            <td>${t.email}</td>
            <td>${t.roomId || 'N/A'}</td>
            <td><span class="badge ${t.active ? 'badge-active' : 'badge-inactive'}">${t.active ? 'Active' : 'Inactive'}</span></td>
            <td>
                <button class="btn-icon" onclick="deleteTenant('${t.id}')"><i class="fas fa-trash"></i></button>
            </td>
        </tr>
    `).join('');
}

async function loadRooms() {
    const res = await fetch(`${API_BASE}/room/all`);
    const rooms = await res.json();
    const tbody = document.getElementById('room-list');
    tbody.innerHTML = rooms.map(r => `
        <tr>
            <td>Room ${r.roomNumber}</td>
            <td>${r.floorNumber}</td>
            <td>${r.totalBeds}</td>
            <td>${r.occupiedBeds}</td>
            <td>
                 <button class="btn-icon" onclick="deleteRoom('${r.id}')"><i class="fas fa-trash"></i></button>
            </td>
        </tr>
    `).join('');
}

async function loadNotices() {
    const res = await fetch(`${API_BASE}/notice/all`);
    const notices = await res.json();
    const container = document.getElementById('notice-list');
    container.innerHTML = notices.map(n => `
        <div class="notice-card">
            <h3>${n.title}</h3>
            <p>${n.message}</p>
            <span class="date">${new Date(n.createdAt).toLocaleDateString()}</span>
            <button onclick="deleteNotice('${n.id}')" style="background:none; border:none; color:var(--danger); cursor:pointer; margin-top:10px;">Delete</button>
        </div>
    `).join('');
}

async function loadComplaints() {
    const res = await fetch(`${API_BASE}/complaint/all`);
    const complaints = await res.json();
    const tbody = document.getElementById('complaint-list');
    tbody.innerHTML = complaints.map(c => `
        <tr>
            <td>
                <strong>${c.title}</strong><br>
                <small style="color:var(--text-muted)">${c.description || ''}</small>
            </td>
            <td><span class="badge ${c.status === 'OPEN' ? 'badge-inactive' : 'badge-resolved'}">${c.status}</span></td>
            <td>${new Date(c.createdAt).toLocaleDateString()}</td>
            <td>
                <div style="display:flex; gap:0.5rem;">
                    ${c.status === 'OPEN' ? `<button class="btn-icon" title="Resolve" onclick="resolveComplaint('${c.id}')"><i class="fas fa-check"></i></button>` : ''}
                    <button class="btn-icon" title="Delete" style="color:var(--danger)" onclick="deleteComplaint('${c.id}')"><i class="fas fa-trash"></i></button>
                </div>
            </td>
        </tr>
    `).join('');
}

async function loadDashboardStats() {
    const tenants = await (await fetch(`${API_BASE}/tenant/all`)).json();
    const rooms = await (await fetch(`${API_BASE}/room/all`)).json();
    const complaints = await (await fetch(`${API_BASE}/complaint/all`)).json();
    
    document.getElementById('total-tenants').innerText = tenants.length;
    document.getElementById('total-rooms').innerText = rooms.length;
    document.getElementById('open-complaints').innerText = complaints.filter(c => c.status === 'OPEN').length;
}

// Form submissions
document.getElementById('tenant-form').addEventListener('submit', async (e) => {
    e.preventDefault();
    const data = {
        name: document.getElementById('t-name').value,
        phone: document.getElementById('t-phone').value,
        email: document.getElementById('t-email').value,
        roomId: document.getElementById('t-roomId').value,
        active: true
    };
    await fetch(`${API_BASE}/tenant/add`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });
    closeModal('tenant-modal');
    loadTenants();
});

document.getElementById('room-form').addEventListener('submit', async (e) => {
    e.preventDefault();
    const data = {
        roomNumber: parseInt(document.getElementById('r-number').value),
        floorNumber: parseInt(document.getElementById('r-floor').value),
        totalBeds: parseInt(document.getElementById('r-beds').value),
        occupiedBeds: 0
    };
    await fetch(`${API_BASE}/room/add`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });
    closeModal('room-modal');
    loadRooms();
});

document.getElementById('notice-form').addEventListener('submit', async (e) => {
    e.preventDefault();
    const data = {
        title: document.getElementById('n-title').value,
        message: document.getElementById('n-message').value
    };
    await fetch(`${API_BASE}/notice/add`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });
    closeModal('notice-modal');
    loadNotices();
});

document.getElementById('complaint-form').addEventListener('submit', async (e) => {
    e.preventDefault();
    const data = {
        title: document.getElementById('c-title').value,
        description: document.getElementById('c-description').value
    };
    await fetch(`${API_BASE}/complaint/add`, {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(data)
    });
    closeModal('complaint-modal');
    loadComplaints();
});

// Delete functions
async function deleteNotice(id) {
    if (confirm('Delete this notice?')) {
        await fetch(`${API_BASE}/notice/delete/${id}`, { method: 'DELETE' });
        loadNotices();
    }
}

async function resolveComplaint(id) {
    await fetch(`${API_BASE}/complaint/resolve/${id}`, { method: 'PUT' });
    loadComplaints();
}

async function deleteComplaint(id) {
    if (confirm('Delete this complaint?')) {
        await fetch(`${API_BASE}/complaint/delete/${id}`, { method: 'DELETE' });
        loadComplaints();
    }
}

// Initial load
window.onload = loadDashboardStats;
