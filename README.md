# Multi-restaurant-food-ordering-platform-
Developed a multi-restaurant food ordering platform where customers can order food from different restaurants, restaurant owners manage menus and orders, and multiple shippers handle delivery assignments and order tracking.
# Food Ordering System

A Java Web Application for managing restaurants in a food ordering system. The project is developed using Java Servlet/JSP following the MVC architecture with JDBC and SQL Server.

---

## Features

### Authentication
- User Login
- User Logout
- Session Management
- BCrypt Password Encryption

### Authorization
- Authentication Filter
- Role-based Authorization
- Admin-only Restaurant Management
- 403 Access Denied Page

### Restaurant Management
- View Restaurant List
- Search Restaurant by Name
- Add New Restaurant
- Update Restaurant
- Delete Restaurant

---

## Technology Stack

| Technology | Version |
|------------|---------|
| Java | 17 |
| Jakarta Servlet | 6.x |
| JSP | 3.x |
| JSTL | Jakarta Tags |
| Maven | Latest |
| SQL Server | 2019+ |
| JDBC | Microsoft JDBC Driver |
| Bootstrap | 5.3 |

---

## Project Structure

```
src
├── main
│   ├── java
│   │   └── com.chinh.foodordering
│   │       ├── config
│   │       ├── constant
│   │       ├── controller
│   │       ├── dao
│   │       ├── filter
│   │       ├── mapper
│   │       ├── model
│   │       ├── service
│   │       └── validation
│   └── webapp
│       ├── views
│       ├── css
│       ├── js
│       └── images
```

---

## Database

Main tables:

- User
- Role
- Restaurant
- Category

---

## Application Workflow

```
Login
   │
   ▼
Authentication Filter
   │
   ▼
Role Authorization
   │
   ▼
Dashboard
   │
   ▼
Restaurant Management
   ├── View
   ├── Search
   ├── Create
   ├── Update
   └── Delete
```

---

## Screenshots

### Login

![Login](docs/images/login.png)

### Dashboard

![Dashboard](docs/images/dashboard.png)

### Restaurant List

![Restaurant List](docs/images/restaurant-list.png)

### Create Restaurant

![Create Restaurant](docs/images/create.png)

### Search Restaurant

![Search Restaurant](docs/images/search.png)

### 403 Access Denied

![403](docs/images/403.png)

---

## Installation

### Clone Repository

```bash
git clone https://github.com/nguyentranbaochinh2006/food-ordering-system.git
```

### Configure Database

1. Create SQL Server database.
2. Execute the provided SQL script.
3. Update database connection in `DBUtils.java`.

### Build Project

```bash
mvn clean install
```

### Run

Deploy the generated WAR file on Apache Tomcat.

---

## Future Improvements

- Customer Management
- Restaurant Owner Portal
- Menu Management
- Shopping Cart
- Order Management
- Payment Integration
- Delivery Tracking

---

## Author

**Nguyễn Trần Bảo Chinh**

Software Engineering Student

FPT University

GitHub:
https://github.com/nguyentranbaochinh2006
