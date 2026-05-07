# HR Service (osm-hr)

Microservice for managing employees, payroll, and human resources.

## 📖 Functional Overview
Manages the human element of the production facility, ensuring that staff data, contracts, and compensation are handled accurately.

### Key Features
- **Employee Lifecycle**: From onboarding to contract termination, tracks all staff-related data.
- **Payroll Management**: Calculates and tracks employee compensation and bonuses.
- **Attendance & Leave**: Monitors staff presence and leave requests.
- **Contract Management**: Digitally manages employment agreements and renewals.


## 🛠 Tech Stack
- **Java 21**
- **Spring Boot 3.4.4**
- **PostgreSQL** (`osmRh`)
- **Resilience4j** (Circuit Breaker & Retry)

## 🚀 Getting Started
```bash
./mvnw spring-boot:run
```

## ⚙️ Configuration
| Variable | Default | Description |
| :--- | :--- | :--- |
| `SERVER_PORT` | `8086` | Service Port |
| `DB_URL` | `jdbc:postgresql://localhost:5432/osmRh` | Database URL |