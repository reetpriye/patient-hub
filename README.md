# HealthSync  
*A scalable microservices-based healthcare platform built with Java, Spring Boot, gRPC, Kafka, and PostgreSQL.*

---

## 🚀 Overview

**HealthSync** is a modular microservices architecture built with Java and Spring Boot that simulates a real-world healthcare application. It comprises independent, decoupled services such as authentication, patient management, billing, analytics, and notifications. Communication is handled via REST, gRPC, and Apache Kafka, ensuring high scalability and loose coupling.

This backend system is built with extensibility in mind, and a frontend integration layer is planned for full-stack implementation.

---

## 🎯 Purpose

This project is being developed as a hands-on learning experience to master the following technologies and architecture patterns:

- ✅ **Java, Spring Boot & Docker Microservices**: Building containerized, modular services that are independently deployable.
- ✅ **PostgreSQL Databases**: Implementing persistent data layers for microservices.
- ✅ **Load Balancers & API Gateways**: Efficiently routing and managing external/internal service requests.
- ✅ **Event-Driven Communication with Kafka**: Asynchronous, decoupled service coordination using Kafka topics.
- ✅ **Real-time Communication**: RESTful APIs and gRPC for synchronous communication between services.
- ✅ **Authentication & Secure APIs**: Securing endpoints using bearer tokens and role-based access.
- ✅ **Integration Testing**: Ensuring service compatibility and stability across components.
- ✅ **AWS Deployment**: Deploying to AWS using LocalStack and Infrastructure as Code (IaC) tools.

---

## 📦 Microservices Included

- **Auth Service** – JWT-based authentication and authorization
- **Patient Service** – Patient registration and management
- **Billing Service** – Tracks services and invoices
- **Analytics Service** – Kafka consumer for tracking events
- **Notification Service** – Sends real-time updates via Kafka topics

---



## 🤝 Contributing

This is a solo learning project, but feel free to fork or suggest improvements via pull requests!
