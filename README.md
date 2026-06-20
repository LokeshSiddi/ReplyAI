# 🚀 ReplyAI

> One Click. One Reply. All AI.

ReplyAI is an AI-powered email response assistant that helps users generate professional, personalized email replies instantly.

It is available in two forms:

- 🧩 Gmail Chrome Extension
- 🌐 Full-Stack Web Application (React + Spring Boot)

Powered by Google's Gemini AI, ReplyAI transforms incoming emails into polished responses with minimal effort.

---

## ✨ Features

### 🧩 Gmail Chrome Extension

- Adds a **ReplyAI** button directly inside Gmail
- Automatically extracts email content
- Generates AI-powered responses instantly
- Inserts generated replies into the compose window
- Professional email drafting with one click

### 🌐 Web Application

- Clean and responsive React interface
- Paste email content manually
- Select reply tone:
  - Professional
  - Friendly
  - Casual
  - Formal
  - Custom styles
- AI-generated responses tailored to the selected tone
- Copy generated responses instantly

---

## 🏗️ Architecture

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

## 🛠️ Tech Stack

### Frontend

- React
- Material UI
- JavaScript

### Backend

- Spring Boot
- Spring WebFlux (Reactive)

### AI

- Gemini 2.0 Flash

### Browser Extension

- Chrome Extension APIs
- JavaScript
- HTML/CSS

---

## 📂 Project Structure

```text
ReplyAI/
│
├── ReplyAI-ext/      # Chrome Extension
├── ReplyAI-react/    # React Frontend
├── ReplyAI-sb/       # Spring Boot Backend
│
└── README.md
```

---

## ⚡ Getting Started

### 1. Clone Repository

```bash
git clone https://github.com/LokeshSiddi/ReplyAI.git
cd ReplyAI
```

---

## 🔧 Backend Setup

Navigate to the backend:

```bash
cd ReplyAI-sb
```

Configure environment variables:

```env
GEMINI_API_KEY=your_api_key_here
```

Run the application:

```bash
./mvnw spring-boot:run
```

Backend starts on:

```text
http://localhost:8080
```

---

## 🎨 Frontend Setup

Navigate to frontend:

```bash
cd ReplyAI-react
```

Install dependencies:

```bash
npm install
```

Run:

```bash
npm start
```

Open:

```text
http://localhost:3000
```

---

## 🧩 Chrome Extension Setup

1. Open Chrome
2. Navigate to:

```text
chrome://extensions
```

3. Enable **Developer Mode**
4. Click **Load Unpacked**
5. Select the `ReplyAI-ext` folder
6. Open Gmail and start replying with AI

---

## 📸 Use Cases

- Customer Support Emails
- Business Communication
- Follow-up Emails
- Job Applications
- Client Responses
- Professional Networking

---

## 🔮 Future Enhancements

- Multiple AI Providers
- Email Summarization
- Custom Prompt Templates
- Multi-language Support
- Outlook Integration
- Conversation Context Awareness

---

## 🤝 Contributing

Contributions are welcome!

1. Fork the repository
2. Create a feature branch

```bash
git checkout -b feature/new-feature
```

3. Commit your changes

```bash
git commit -m "Add new feature"
```

4. Push and create a Pull Request

---

## 📜 License

Licensed under the MIT License.

See the `LICENSE` file for details.

---

## 👨‍💻 Author

**Lokesh Siddi**

If you found this project useful, consider giving it a ⭐ on GitHub.
