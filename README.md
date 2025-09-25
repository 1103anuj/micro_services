# Microservices Hotel Rating System

This project is a **microservices-based application** where users can rate hotels.  
It demonstrates **inter-service communication, resilience, and fault tolerance** using Spring Cloud components and modern microservices best practices.


---

## 🚀 Features

- **User Service:** Register and manage users  
- **Hotel Service:** Maintain hotel information  
- **Rating Service:** Users can rate hotels  
- **API Gateway:** Provides a single entry point to access all microservices  
- **Service Discovery:** All microservices register with **Eureka Server**  
- **Resilience & Fault Tolerance:**  
  - Circuit Breaking with **Resilience4j**  
  - **Retry mechanism** for temporary failures  
  - **Rate Limiter** to control traffic  
- **Inter-service Communication:**  
  - **Feign Client** for REST calls  

---

## 🛠️ Technologies Used

- **Java 17**  
- **Spring Boot**  
- **Spring Cloud Netflix Eureka** (Service Registry)  
- **Spring Cloud Gateway** (API Gateway)  
- **Spring Cloud OpenFeign** (Declarative REST clients)  
- **Resilience4j** (Fault tolerance, circuit breaker, retry, rate limiting)  
- **Maven** (Build and dependency management)  

---

## 🔄 How It Works

1. **Service Registration:**  
   All services (`userservice`, `hotelservice`, `ratingservice`) register with **Eureka Server**.  

2. **API Gateway:**  
   Routes requests to appropriate microservices via a single endpoint.  

3. **Communication:**  
   `ratingservice` fetches user and hotel information using **Feign Clients**.  

4. **Resilience & Fault Tolerance:**  
   - Fallback methods handle failures  
   - Retry mechanism retries failed requests  
   - Rate limiting ensures stability during high load  

---

## 📝 References

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)  
- [Spring Cloud Netflix Eureka](https://spring.io/projects/spring-cloud-netflix)  
- [Spring Cloud Gateway](https://spring.io/projects/spring-cloud-gateway)  
- [Spring Cloud OpenFeign](https://spring.io/projects/spring-cloud-openfeign)  
- [Resilience4j Documentation](https://resilience4j.readme.io/)  
- [Maven Build Tool](https://maven.apache.org/)  
- [Microservices Architecture Guide](https://microservices.io/) 




 



