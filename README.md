# YouTube Tools 🚀

YouTube Tools is a **SaaS-style full-stack web application** built using **Java and Spring Boot**, designed to help YouTube creators optimize, analyze, and enhance their video content using real-time data from the **YouTube Data API v3**.

---

## ✨ Features

- **YouTube SEO Tag Generator**  
  Extracts optimized SEO tags by analyzing related videos to improve discoverability.

- **High-Resolution Thumbnail Generator**  
  Generates and allows downloading of 1280×720 thumbnails from any YouTube video URL or ID.

- **YouTube Video Data Retriever**  
  Fetches complete video metadata including title, description, channel information, publish date, tags, and the best available thumbnail.

---

## 🏗 Architecture

- Clean **MVC architecture**
- Proper separation of Controller, Service, and Model layers
- External API communication using **Spring WebClient**
- Server-side rendering using **Thymeleaf**

---

## 🛠 Tech Stack

- Java  
- Spring Boot  
- Spring MVC  
- Spring WebClient (WebFlux)  
- REST APIs  
- YouTube Data API v3  
- Thymeleaf  
- Tailwind CSS  
- Maven  
- Lombok  

---

## 🚀 Getting Started

### Prerequisites
- Java 21+
- Maven
- YouTube Data API Key

### Configuration
Add the following to `application.properties`:

- youtube.api.key=YOUR_API_KEY
- youtube.api.base.url=https://www.googleapis.com/youtube/v3
- youtube.api.max.related.videos=3

###Run the Application :
mvn spring-boot:run

###Access the application at:
http://localhost:8080

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

📌 Use Cases

Content creators optimizing YouTube SEO

Quick thumbnail extraction for design workflows

Developers learning API-driven Spring Boot applications

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

📈 Future Enhancements

User authentication & accounts

Analytics dashboard (views, likes, engagement)

Rate limiting & caching

Deployment as a hosted SaaS platform

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

👨‍💻 Author

Gaurav Choudhary

Java & Spring Boot Developer
