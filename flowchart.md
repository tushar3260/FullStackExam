```mermaid
flowchart TD

A[Start] --> B[Admin Setup PG]
B --> C[Add Rooms & Beds]
C --> D[Add Tenant]

D --> E[Tenant Assigned to Bed]

E --> F[Visitor Arrives]
F --> G[Guard Adds Visitor Entry]

G --> H[Status = PENDING]

H --> I{Tenant Decision}
I -->|Approve| J[Status = APPROVED]
I -->|Reject| K[Status = DENIED]

J --> L[Visitor Check-In]
L --> M[Visitor Check-Out]

E --> N[Rent Generation]
N --> O[Tenant Pays Rent]
O --> P[Owner Verifies Payment]

E --> Q[Raise Complaint]
Q --> R[Admin Resolves]
R --> S[Status = RESOLVED]

P --> T[End]
M --> T
S --> T