# 🏠 PG Management & Visitor Log System

## 📌 Overview
A Spring Boot-based backend system for managing Paying Guest (PG) accommodations.  
It handles tenants, rooms, rent tracking, complaints, and secure visitor entry logs.

---

## 🚀 Features

### 👤 Tenant Management
- Add tenants
- Assign room & bed
- View all tenants

### 🏠 Room & Bed Management
- Create rooms
- Track occupancy

### 💰 Rent Management
- Store rent, electricity, mess charges
- Auto calculate total rent
- Track payment status

### 🚪 Visitor Management (Core Feature)
- Add visitor entry (by guard)
- Status flow: `PENDING → APPROVED / DENIED`
- Track check-in and check-out

### 🛠 Complaint System
- Raise issues
- Status tracking: `OPEN → IN_PROGRESS → RESOLVED`

### 📢 Notice Board
- Add and view notices

---

## 🛠 Tech Stack

- Java 21
- Spring Boot
- MongoDB Atlas
- Maven

---

## 📁 Project Structure
