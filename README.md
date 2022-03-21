Тестовый проект для практики с Microservices

#### Microservices:
- projects - создание и редактирование проектов
- emails - отправка писем на почту
- configServer - содержит настройки для остальных сервисов
- eurekaServer - содержит информацию обо всех сервисах
- apiGateway - прокси для общения к микросервисам
#### Взаимодействие:
1. Редактировании проекта 
2. Отправляется email уведомление об изменениях 
   в проекте. Email указан в проекте

#### Инструменты: 
- Exposed - ORM framework для Kotlin
- Netflix-eureka-server - реализация Service Discovery от netflix. 
  Позволяет microservices находить друг друга
- Openfeign - Позволяет описать REST запросы в виде классов и вызывать их
- LoadBalancer - помогает распределять входящий траффик (incomming traffic) равно между репликами.
- Spring-cloud-starter-gateway - Реализация шаблона Reverse Proxy
- Resilience4J - библиотека отказоустойчивости реализует перретны CircuitBreaker, Bulkhead, RateLimiter, Retry
- RabbitMQ - брокер сообщений

#### Инструменты для тестов:
- Testcontainers - позволяет запускать в JUnit тестах Docker-контейнер. 
  Для интеграционных тестов с PostgreSQL и RabbitMQ
- Awaitility - позволяет удобнее тестировать асинхронные события.
К примеру дождаться пока будет обработано событие из RabbitMQ

### На заметку
- Тесты проходят для двух микросервисов в одной базе
- Микросервисы используют одну базу

## Запуск Rabbitmq
`docker run -d -p 5672:5672 rabbitmq:3`

