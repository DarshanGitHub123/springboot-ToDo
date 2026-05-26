# Spring Boot ToDo Application

A simple ToDo application built using Spring Boot that supports basic CRUD operations.

## Features

- Create a new task
- View all tasks
- Delete tasks

## Technologies Used

- Java
- Spring Boot
- Maven

## Project Structure

- Controller – Handles API requests
- Service – Contains business logic
- Repository – Data access layer
- Model – Entity classes

## Run the Application

Clone the repository:

```bash
git clone <your-repository-url>
```

Move into the project directory:

```bash
cd SpringBootToDo
```

Run the application:

```bash
./mvnw spring-boot:run
```

For Windows:

```bash
mvnw.cmd spring-boot:run
```

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|-------------|
| POST | `/todos` | Create a task |
| GET | `/todos` | Get all tasks |
| DELETE | `/todos/{id}` | Delete a task |


