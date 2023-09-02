# Advanced Shopping Application

## Overview

This is an advanced shopping application, a modern e-commerce platform built on a microservices architecture. This application is designed to provide a seamless shopping experience for users, offering a variety of services to manage products, inventory, and orders. Below are the core components of this system:

- **API Gateway**: Serves as the entry point for client requests and routes them to the appropriate microservices, powered by Spring Cloud Gateway for enhanced routing and management.
- **Server Discovery**: Utilizes Spring Cloud Netflix Eureka for service registration and discovery, enhancing system scalability and performance.
- **Inventory Service**: Manages product availability and inventory data, ensuring accurate stock information.
- **Order Service**: Handles order processing and ensures a smooth shopping experience for customers.
- **Product Service**: Allows sellers to add products to the platform.


## How It Works

Here's how the Advanced Shopping Application operates:

1. **Product Management**: Sellers use the Product Service to add new products to the platform, providing product details, and pricing.

2. **Order Placement**: Customers initiate orders through the Client Order Service. To ensure security, OAuth 2.0 authentication is required (implemented with KeyCloak).

3. **Product Availability Check**: Before confirming an order, the Client Order Service sends a request to the Inventory Service to check product availability.

4. **Order Processing**: Once product availability is confirmed, the Client Order Service invokes the Order Service to process the order.

5. **Circuit Breaker (Resilience4j)**: Resilience4j is implemented to support synchronous processing. It monitors service health and prevents system overload. If inventory check available, then the final order service is executed and order data saved into mysql database (recorded).

6. **Asynchronous Processing (Kafka)**: Kafka is used to ensure seamless data flow throughout the system, supporting asynchronous processing for tasks like order notifications, ensuring high system efficiency and scalability.

## Technology Stack

- **Framework**: The application leverages the Spring framework, providing a robust foundation for building microservices.
- **Data Storage**: MySQL is used to store inventory and order data, while MongoDB is employed for product data storage.
- **Processing**: Asynchronous processing with Kafka, synchronous processing with Resilience4j circuit breaker.
- **Authentication**: Implements OAuth 2.0 for robust and secure user authentication using Keycloak.
- **Distributed Tracing**: Zipkin is integrated for distributed tracing, aiding in system monitoring and diagnostics.
- **Monitoring**: Service performance is monitored using Prometheus and Grafana, ensuring system health.

## Getting Started

To get started with this application, follow these steps:

1. Build Docker images for the microservices.
2. Start the containers and services.
3. Send requests to the application using your preferred method, such as `curl` or Postman.
