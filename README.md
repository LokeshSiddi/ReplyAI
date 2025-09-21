ReplyAI 📧🤖
============

ReplyAI is your personal assistant for crafting email replies effortlessly. This project offers two convenient ways to generate AI-powered email responses: a seamless **Gmail Chrome Extension** and a versatile **full-stack web application**.

Features ✨
----------

### Chrome Extension 🚀

*   **Effortless Integration:** Adds a "ReplyAI" button directly into your Gmail compose window.
    
*   **Automatic Content Parsing:** Intelligently reads the email content you're replying to.
    
*   **Instant AI-Generated Replies:** Get a professionally toned reply with a single click.
    

### Web Application 💻

*   **Full-Fledged Interface:** A user-friendly web app built with React and Spring Boot.
    
*   **Copy-Paste Functionality:** Simply paste the email content you want to reply to.
    
*   **Tone Selection:** Choose from a variety of tones like **Friendly**, **Professional**, **Casual**, and more to tailor your response.
    
*   **AI-Powered Generation:** Leverages the power of AI to generate well-crafted replies based on the selected tone.
    

How It Works 🤔
---------------

### Chrome Extension

When you click the "ReplyAI" button in Gmail, the extension automatically extracts the content of the email you are replying to. It then sends this content to the backend, which uses an AI model to generate a suitable reply in a professional tone. The generated reply is then inserted into the reply box.

### Web Application

In the web application, you can manually paste the email content into a text area. You can then select your desired tone from a dropdown menu. The application sends the content and the selected tone to the backend, which then generates and displays an AI-crafted reply.

Installation and Usage 🛠️
--------------------------

### Chrome Extension

1.  Download the extension files from this repository.
    
2.  Open Google Chrome and navigate to chrome://extensions.
    
3.  Enable "Developer mode".
    
4.  Click on "Load unpacked" and select the extension folder.
    
5.  You will now see the ReplyAI button in your Gmail compose window!
    

### Web Application

1.  **Backend (Spring Boot):**
    
    *   Clone the repository.
        
    *   Navigate to the backend directory.

    *   Provide necessary environment variables
        
    *   Run the application using your favorite Java IDE or by using the command line: ./mvnw spring-boot:run
        
3.  **Frontend (React):**
    
    *   Navigate to the frontend directory.
        
    *   Install the dependencies: npm install
        
    *   Start the development server: npm start
        
    *   Open your browser and go to http://localhost:3000 to use the application.
        

Tech Stack 👨‍💻
----------------

*   **Frontend:** React, Material UI
    
*   **Backend:** Spring Boot, Reactive Web
    
*   **AI Model:** Gemini 2.0 Flash
    

Contributing 🤝
---------------

Contributions are welcome! Please feel free to submit a pull request or open an issue for any bugs or feature requests.

License 📜
----------

This project is licensed under the MIT License. See the [LICENSE](License) file for more details.
