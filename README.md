## 헥사고날 아키텍처 구조
```tree
├── build
│   ├── classes
│   │   └── java
│   │       └── main
│   │           └── com
│   │               └── study
│   │                   └── jjjserver
│   │                       ├── configuration
│   │                       │   ├── properties
│   │                       │   └── security
│   │                       │       └── token
│   │                       │           └── data
│   │                       ├── filter
│   │                       └── models
│   │                           ├── common
│   │                           │   ├── adapter
│   │                           │   │   └── out
│   │                           │   └── enums
│   │                           └── user
│   │                               └── adapter
│   │                                   └── out
│   │                                       └── persistence
│   │                                           └── entity
│   ├── generated
│   │   └── sources
│   │       ├── annotationProcessor
│   │       │   └── java
│   │       │       └── main
│   │       └── headers
│   │           └── java
│   │               └── main
│   ├── resources
│   │   └── main
│   └── tmp
│       └── compileJava
│           └── compileTransaction
│               ├── backup-dir
│               └── stash-dir
├── gradle
│   └── wrapper
└── src
    ├── main
    │   ├── java
    │   │   └── com
    │   │       └── study
    │   │           └── jjjserver
    │   │               ├── configuration
    │   │               │   ├── properties
    │   │               │   └── security
    │   │               │       └── token
    │   │               │           └── data
    │   │               ├── filter
    │   │               └── models
    │   │                   ├── common
    │   │                   │   ├── adapter
    │   │                   │   │   └── out
    │   │                   │   └── enums
    │   │                   └── user
    │   │                       ├── adapter
    │   │                       │   ├── in
    │   │                       │   └── out
    │   │                       │       └── persistence
    │   │                       │           └── entity
    │   │                       ├── application
    │   │                       └── domain
    │   └── resources
    └── test
        └── java
            └── com
                └── study
                    └── jjjserver
```

## Security Architecture
![image](https://github.com/JaeJun1130/jjj-api/assets/51310681/143308bf-76e0-459d-b7a4-b8fe07712d8c)
