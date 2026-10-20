# ðŸ“š Enterprise Library Management System

An automated desktop library catalog and circulation management system developed in Java with a relational SQL database backend.

## ðŸš€ Key Features
- **User & Membership Management**: Role-based access control for librarians and registered student/faculty patrons.
- **Book Catalog & Inventory**: ISBN barcode lookup, category indexing, and live stock tracking.
- **Issue & Return Lifecycle**: Automated calculation of overdue fines and loan period reminders.
- **Transactional Database**: Normalized SQL schema ensuring ACID compliance for circulation logs.

## ðŸ› ï¸ Technology Stack
- **Language**: Java (JDK 8+)
- **GUI Framework**: Java Swing / AWT
- **Database**: MySQL / MariaDB (JDBC Driver)
- **Architecture**: Model-View-Controller (MVC) Pattern

## ðŸ“¦ Getting Started
1. Clone the repository:
   ```bash
   git clone https://github.com/ReaduanulFaridFahim/Libray-Managment-System-RFF-WRT.git
   ```
2. Import database schema into MySQL:
   ```sql
   CREATE DATABASE library_db;
   USE library_db;
   -- Import database.sql
   ```
3. Compile and execute:
   ```bash
   javac Main.java
   java Main
   ```
