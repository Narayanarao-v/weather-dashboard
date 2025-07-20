# Weather Dashboard 🌦️

This is a full-stack Weather Dashboard web application built using **Spring Boot** and **OpenWeatherMap API**. It fetches real-time weather information for any city and displays it with a clean UI using **HTML** and **CSS**.

## 🚀 Features
- 🌍 Search weather by city
- 🌡️ Real-time temperature, pressure, wind speed, humidity
- ⚠️ Error handling for invalid input
- 📱 Responsive user interface
- 🔄 REST API integration

## 🔧 Technologies Used

- Java + Spring Boot (Backend)
- HTML + CSS (Frontend)
- OpenWeatherMap API
- Maven
- Git & GitHub

## 📁 Project Structure
weather-dashboard/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── weatherdashboard/
│       │           ├── controller/
│       │           │   └── WeatherController.java
│       │           ├── service/
│       │           │   └── WeatherService.java
│       │           ├── model/
│       │           │   └── WeatherResponse.java
│       │           └── WeatherDashboardApplication.java
│       └── resources/
│           ├── static/
│           │   ├── dashboard.html
│           │   ├── css/
│           │   │   └── style.css         
│           │   ├── js/
│           │   │   └── script.js         
│           ├── application.properties
├── .gitignore
├── README.md
├── pom.xml


## 🔑 API Key
```properties
openweathermap.api.key=67876ec343d0e9b88b653974c8430b82


Output Screenshot
•	Shown working at: http://localhost:8086/dashboard.html
•	Input: City Name
•	Output: Weather, Temperature







