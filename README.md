# ✉️ ReplyAI

> AI-powered Email Response Assistant built using Spring Boot, React, Chrome Extension APIs, and Google Gemini AI.

---

## Overview

ReplyAI is an AI-assisted productivity application that generates professional email replies directly inside Gmail or through a standalone React web application.

The project demonstrates backend API development, browser extension integration, reactive programming with Spring WebFlux, and AI-powered response generation.

---

## Problem Statement

Writing professional email responses is repetitive and time-consuming.

ReplyAI simplifies this process by extracting email content, generating context-aware responses using Gemini AI, and allowing users to customize the communication style.

---

## Architecture

```text
┌─────────────────┐
│ Gmail Extension │
└────────┬────────┘
         │
         ▼
┌─────────────────┐
│ Spring Boot API │
└────────┬────────┘
         │
         ▼
┌─────────────────┐
│ Gemini AI Model │
└─────────────────┘


┌───────────────┐
│ React Web App │
└───────┬───────┘
        │
        ▼
 Spring Boot API
```

---

## Components

### Chrome Extension

Responsible for:

- Gmail Integration
- Extracting Email Content
- Injecting AI Responses

---

### Spring Boot Backend

Responsible for:

- REST APIs
- Prompt Construction
- Gemini API Communication
- Response Formatting

---

### React Frontend

Responsible for:

- User Interface
- Tone Selection
- Manual Email Input
- Displaying Generated Responses

---

## Engineering Decisions

### Why Spring WebFlux?

Used to support reactive request handling while waiting for AI responses.

### Why Chrome Extension?

Allows AI assistance directly within Gmail without leaving the user's workflow.

### Why Gemini AI?

Provides natural language generation with customizable communication styles.

---

## Technology Stack

Backend

- Java
- Spring Boot
- Spring WebFlux

Frontend

- React
- Material UI

Browser Extension

- Chrome Extension API

AI

- Gemini 2.0 Flash

---

## Features

- Gmail Integration
- AI Reply Generation
- Five Communication Styles
- Reactive REST APIs
- Chrome Extension
- React Web Application

---

## API Overview

### Generate Reply

POST /api/email/generate

Request

```json
{
  "emailContent": "...",
  "tone": "Professional"
}
```

Response

```json
{
  "generatedReply": "..."
}
```

---

## Project Structure

```
ReplyAI
│
├── ReplyAI-ext
├── ReplyAI-react
└── ReplyAI-sb
```

---

## Running Locally

Backend

```bash
./mvnw spring-boot:run
```

Frontend

```bash
npm install
npm start
```

Chrome Extension

- Enable Developer Mode
- Load Unpacked
- Select ReplyAI-ext

---

## Production Improvements

Future improvements include:

- Authentication
- Conversation Context
- Outlook Support
- Prompt Templates
- Multi-language Support
- Redis Caching
- Docker Deployment
- Rate Limiting

---

## Challenges

- Injecting UI into Gmail
- Managing asynchronous AI requests
- Formatting AI responses consistently
- Synchronizing Chrome Extension with backend APIs

---

## Lessons Learned

This project strengthened my understanding of:

- Browser Extension Development
- Reactive Spring Applications
- REST API Design
- Frontend–Backend Communication
- AI-powered Productivity Tools

---

## 👨‍💻 Author

**Lokesh Siddi**

If you found this project useful, consider giving it a ⭐ on GitHub.
