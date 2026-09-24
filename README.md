# Giriraj Resort — Java Spring Boot

This is a multi-page resort website and management starter. It no longer uses React, Vite, TypeScript, JSX, Node.js, or Express.

## Structure

```
giriraj-resort/
├── backend/                 # Java Spring Boot application and database models
│   ├── pom.xml
│   └── src/main/java/in/giriraj/resort/
│       ├── controller/      # Website routes and REST endpoints
│       ├── model/           # JPA user and booking models
│       └── config/          # Static resource configuration
└── frontend/                # Individual public HTML pages, CSS and browser JavaScript
    ├── index.html
    ├── assets/
    └── pages/
```

## Requirements

- JDK 21 or newer
- Maven 3.9+
- PostgreSQL 16+ (optional; the app uses an in-memory H2 database by default)

## Run

1. Verify `mvn -version` works in a *new* PowerShell window. If it does not, finish Maven installation and add Maven's `bin` directory to `PATH`.
2. The application starts with an in-memory H2 database, so no database installation is needed. To use PostgreSQL, set `DATABASE_URL`, `DB_USERNAME`, and `DB_PASSWORD` before starting.
4. In PowerShell:

```powershell
cd D:\giriraj-resort\backend
mvn spring-boot:run
```

Open `http://localhost:8081`.

## Pages

- `/` — public homepage
- `/rooms` — rooms and suites
- `/experiences` — activities and resort experiences
- `/contact` — enquiry form
- `/login` — sign-in screen
- `/dashboard` — guest dashboard
- `/admin` — administrator dashboard

Guest registration, sign-in, enquiries, booking requests, guest booking history, and admin overview are connected to the Java API. The administrator account is `girirajresortmulshi@gmail.com` with password `giriraj`. The default local H2 database is stored under `backend/data`, so rooms, users, bookings, and enquiries remain after a restart.
