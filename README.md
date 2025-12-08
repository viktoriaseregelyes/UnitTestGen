# Language2Tests

[![CI](https://github.com/viktoriaseregelyes/UnitTestGen/actions/workflows/ci.yml/badge.svg)]([https://github.com/Activiti/Activiti/actions/workflows/main.yml](https://github.com/viktoriaseregelyes/UnitTestGen/actions/workflows/ci.yml))

Automatic unit-test generator using ANTLR-based AST parsing + Spring Boot & Angular.

🛠 Tech stack
- Backend: Java Spring Boot
- Frontend: Angular
- Parsing / AST: ANTLR
- Testing framework for generated tests: JUnit, Mockito for mocks

✨ Features
- Parses Java source code into AST via JavaParser
- Accepts a test-specification (test cases defined by the user)
- Automatically generates corresponding unit tests
- Supports methods with parameters, return types, complex objects, mocking for dependencies if needed
- Provides a web UI (via Angular) to upload class + specification and fetch generated tests
- Exposes REST API (via Spring Boot) for integration

🚀 Getting started

To get started, it is best to have the latest JDK and Maven installed. For the frontend, you should download the latest Node.js + npm.

Run backend
```
mvn spring-boot:run
```

Run frontend
```
cd frontend
npm install
ng serve
```

Visit http://localhost:4200/ to open the web UI.

🧪 Usage
- In the UI or via REST API upload your Java class source file.
- Provide a test-specification describing test cases (inputs, expected outputs, mocks if needed).
- Trigger test generation — the tool will output a .java test file (JUnit) which you can compile & run.
- (Optional) Modify or extend generated tests manually if more complex logic is needed.
