# Age-in-Days: A Medieval Timekeeper App

A simple yet charming Spring Boot web application that calculates your age in years, days, and hours, and shows a countdown to your next birthday. Styled with subtle medieval-inspired aesthetics, it brings a unique touch to your developer portfolio while remaining beginner-friendly and practical.

---

## Features

* Input your Date of Birth
* Calculates your exact age in:

  * Years
  * Days
  * Hours (since birth)
* Displays a countdown to your next birthday
* Clean UI with thematic flair
* Built using Spring Boot and Thymeleaf

---

## Quick Start

### 1. Prerequisites

* Java 17 or above
* Maven
* IDE (VS Code / Eclipse / IntelliJ)

### 2. Clone & Run

```bash
git clone https://github.com/Knight-Ron/age-in-days.git
cd age-in-days
mvn spring-boot:run
```

Then open your browser and visit:
[http://localhost:8080](http://localhost:8080)

---

## Tech Stack

| Technology  | Role                   |
| ----------- | ---------------------- |
| Spring Boot | Java backend framework |
| Thymeleaf   | HTML templating engine |
| Maven       | Build tool             |
| HTML & CSS  | UI Design              |

---

## Project Structure

```
age-in-days/
├── src/
│   ├── main/
│   │   ├── java/com/example/age/
│   │   │   └── AgeController.java
│   │   └── resources/
│   │       ├── templates/index.html
│   │       └── application.properties
└── pom.xml
```

---

## Future Enhancements

* Add dark mode or rustic theme switcher
* Save birthdays and notify via email
* Sound effects or ambient music toggle
* Refactor for REST API version

---

## License

This project is open-source and free to use for learning and customization.

---

## Credits

Crafted by [Knight-Ron](https://github.com/Knight-Ron)
"He who measures time shall not waste it."
