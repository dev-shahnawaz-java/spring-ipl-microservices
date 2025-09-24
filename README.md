IPL Microservices Mini Project
A Spring Boot-based microservices mini project demonstrating a distributed system for IPL (Indian Premier League) player and team management.

📋 Project Overview
This project implements a microservices architecture for managing IPL players and teams using Spring Boot and Spring Cloud technologies.

🏗️ Architecture Components
Core Microservices
IPL Player Service (IPLPlayerService-ChildMs)

Manages player information and details

Child microservice in the ecosystem

IPL Team Service (IPLTeamService_ProviderMS2)

Provider service for team management

Handles team-related operations and data

IPL Player Service Consumer (IPLPlayerService-ConsumerMS2)

Consumer service that interacts with player data

Demonstrates service-to-service communication

Infrastructure Services
Eureka Server (MiniProject-EurekaServer2)

Service discovery and registration

Enables dynamic service location

Config Server (MiniProject-ConfigServer2)

Centralized configuration management

Externalized configuration for all microservices

API Gateway (MiniProject-CloudApiGateway2)

Single entry point for all client requests

Handles routing, filtering, and cross-cutting concerns

Admin Server (MiniProject-AdminServer2)

Monitoring and management dashboard

Provides insights into microservices health and metrics

🚀 Technology Stack
Framework: Spring Boot

Service Discovery: Eureka Server

API Gateway: Spring Cloud Gateway

Configuration: Spring Cloud Config

Monitoring: Spring Boot Admin

Build Tool: Maven
