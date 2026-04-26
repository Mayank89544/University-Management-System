# 🎓 CampusManagement — University Management System

A **Java-based desktop application** designed to streamline and automate the core administrative and academic operations of a university — managing students, courses, faculty, and more through a clean, intuitive interface.

![Java](https://img.shields.io/badge/Java-17%2B-orange?style=flat-square&logo=java)
![IDE](https://img.shields.io/badge/IDE-VS%20Code-blue?style=flat-square&logo=visualstudiocode)
![Status](https://img.shields.io/badge/Status-Active-brightgreen?style=flat-square)

---

## 📌 Overview

**CampusManagement** is a comprehensive University Management System built entirely in Java. It provides administrators, faculty, and students with a centralized platform to handle academic records, course enrollments, and institutional data — reducing manual effort and improving operational efficiency.

---

## ✨ Features

- 🧑‍🎓 **Student Management** — Add, update, view, and remove student records
- 👨‍🏫 **Faculty Management** — Manage instructor profiles and assignments
- 📚 **Course Management** — Create and manage courses, assign faculty, track enrollments
- 📝 **Result & Grade Management** — Record and view student academic results
- 🔍 **Search & Filter** — Quickly look up students, faculty, or courses by name or ID
- 🏛️ **Department Management** — Organize data by departments for structured access
- 🔐 **Role-based Access** — Separate views/permissions for admin, faculty, and students

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| Java 17+ | Core application logic & OOP design |
| Java Swing / AWT | Graphical User Interface |
| JDBC | Database connectivity |
| VS Code | Development environment |

---

## 📁 Project Structure

```
University-Management-System/
├── src/                  # Java source files (all modules)
├── lib/                  # External dependencies / JAR files
├── bin/                  # Compiled .class output files
├── .vscode/
│   └── settings.json     # VS Code workspace configuration
└── README.md
```

> The `bin/` folder is auto-generated on build. Do not manually edit files there.

---

## 🚀 Getting Started

### Prerequisites

- **Java JDK 17+** — [Download here](https://adoptium.net/)
- **VS Code** with the [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
- A database (MySQL recommended) if DB integration is configured

### Running the Project

1. **Clone the repository**
   ```bash
   git clone https://github.com/Mayank89544/University-Management-System.git
   cd University-Management-System
   ```

2. **Open in VS Code**
   ```bash
   code .
   ```

3. **Build & Run**
   - Open the `src/` folder and locate the main entry point (e.g., `Main.java`)
   - Press `F5` or click **Run** in VS Code
   - Alternatively, compile manually:
     ```bash
     javac -cp lib/* -d bin src/*.java
     java -cp bin:lib/* Main
     ```

> **Windows users:** Replace `:` with `;` in the classpath — `bin;lib/*`

---

## 🖼️ Usage Guide

| Role | Capabilities |
|---|---|
| **Admin** | Full access — manage students, faculty, courses, departments |
| **Faculty** | View assigned courses, enter/update student grades |
| **Student** | View personal profile, enrolled courses, and results |

---

## ⚙️ VS Code Configuration

This project uses a `.vscode/settings.json` file for workspace settings. To customize source and output directories:

```json
{
  "java.project.sourcePaths": ["src"],
  "java.project.outputPath": "bin",
  "java.project.referencedLibraries": ["lib/**/*.jar"]
}
```

---

## 🤝 Contributing

Contributions, bug reports, and feature suggestions are welcome!

1. Fork the repository
2. Create a new branch: `git checkout -b feature/your-feature`
3. Commit your changes: `git commit -m "Add: your feature"`
4. Push: `git push origin feature/your-feature`
5. Open a Pull Request

Please follow standard Java naming conventions and add comments for complex logic.

---

## 🗺️ Roadmap

- [ ] Add database persistence with MySQL/PostgreSQL
- [ ] Implement login/authentication system
- [ ] Export reports to PDF or Excel
- [ ] Add timetable / schedule management module
- [ ] Migrate UI to JavaFX for a modern look
- [ ] Add email notification support

---

## 👤 Author

**Mayank** — [@Mayank89544](https://github.com/Mayank89544)

---

> ⭐ If this project helped you, give it a star on GitHub — it means a lot!
