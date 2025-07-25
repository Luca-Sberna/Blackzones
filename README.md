# BlockZones Backend

### Tech Stack
- Java 17
- Spring Boot
- PostgreSQL
- Railway-ready
- JPA + REST API

### How to run
1. Configura il database in `application.yml` oppure usa Railway
2. Esegui con:
```bash
./mvnw spring-boot:run
```

### API disponibili

**User**
- `POST /api/users/register?wallet=0x...&nickname=abc`
- `GET /api/users/{id}`

**Land**
- `GET /api/lands/user/{userId}`

---

Sistema di login via wallet in arrivo (Web3).
