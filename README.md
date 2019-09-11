REST Controllers and Services
=============================
## Overview

In this assignment students are tasked with creating a small RESTful API that simulates a backend for a quiz-like application. Data will be store in a postgreSQL database and the student will use JPA/Hibernate to interface with the database. Students will implement the API using the previous day's assignment as a skeleton.

### Summary of the API

Each `Quiz` is identified by a unique `name` field. Each `Quiz` contains a collection of `Question` elements. These questions are also uniquely identified by their own `text` field representing the text of the question. Each question contains a collection of `Answer` elements which are uniquely identified by their own `text` field representing the text of the answer. The answer will also contain a field signifying if it is the correct answer for the question it belongs to.

---

This assignment is intentionally lacking in it's description of required services, queries, and entities/models. It is up to the student to decide how to model the requests, responses, and organize the business logic, and how to best utilize JPA/Hibernate to persist data in order to meet the specified requirements.

### Requirements

You will need to create/implement the following endpoints and their required services, repositories, and entities.

- [ ] `GET quiz`
    - Returns the collection of `Quiz` elements

- [ ] `GET quiz/{quizName}`
    - Returns the specified `Quiz`

- [ ] `POST quiz`

    Creates a quiz and adds to collection
    - Returns the `Quiz` that it created

- [ ] `DELETE quiz/{quizName}`

    Deletes the specified quiz from collection
    - Returns the deleted `Quiz`

- [ ] `PATCH quiz/{quizName}/rename/{newName}`

    Rename the specified quiz using the new name given
    - Returns the renamed `Quiz`

- [ ] `GET quiz/{quizName}/random`
    - Returns a random `Question` from the specified quiz

- [ ] `PATCH quiz/{quizName}/add`

    Adds a question to the specified quiz
    - Receives a `Question`
    - Returns the modified `Quiz`

- [ ] `DELETE quiz/{quizName}/delete/{question}`

    Deletes the specified question from the specified quiz
    - Returns the deleted `Question`


