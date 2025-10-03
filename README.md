# 📋 Online Clipboard - Full Stack Project

A simple yet powerful **Online Clipboard** application that allows users to create and retrieve text clips instantly.  
It provides a minimal and responsive UI with a Spring Boot backend, ensuring smooth and fast storage/retrieval of clipboard data.  

---

## 🚀 Features
- ✍️ **Create Clips** – Save text snippets to the clipboard  
- 📥 **Retrieve Clips** – Fetch text using a unique Clip ID  
- ⚡ **Fast & Lightweight** – Instant storage with in-memory H2 database  
- 🎨 **User-Friendly UI** – Clean and responsive frontend (HTML, CSS, JS)  
- 🔗 **Full Stack Integration** – Frontend and backend run within the same Spring Boot app  

---

## 🛠️ Tech Stack
- **Frontend:** HTML, CSS, JavaScript (inside Spring Boot `resources/static`)  
- **Backend:** Java, Spring Boot, Spring Data JPA
- **Database:** H2 (in-memory, dev mode)  
- **Build Tool:** Maven  

---

## 📂 Project Structure
```
Online-Clipboard/  
│  
├── src/main/java/com/example/OnlineClipboard1 
│   ├── Controller/  
│   │   └── clipsController.java        # Handles REST API endpoints  
│   ├── Service/  
│   │   └── clipsService.java           # Business logic  
│   ├── Model/  
│   │   └── clips.java                  # Entity class (represents Clip table)  
│   ├── Repository/  
│   │   └── clipsRepo.java        # JPA Repository interface  
│   └── OnlineClipboardApplication1.java      # Main Spring Boot entry point  
│  
├── src/main/resources/  
│   ├── static/  
│   │   └── index.html                 # Frontend (HTML, CSS, JS)  
│   └── application.properties         # Database & Server configurations  
│  
└── pom.xml                            # Maven dependencies  
```
---

## ⚙️ Installation & Setup

1. **Clone the repository**
   ```
   git clone https://github.com/leelamadhav07/Online-Clipboard.git
   cd Online-Clipboard
   ```
   
2. **Run the Application**
    Backend & Frontend will start at 👉 ```http://localhost:8080/index.html```

## 🌟 Future Enhancements

⏰ Add clip expiration time (minutes/hours/days)

📂 Support file sharing (images, videos, docs)

🛡️ Add authentication for private clips

☁️ Deploy on cloud platforms (AWS, GCP, Heroku)

📱 Develop a mobile app version

## 🤝 Contribution

Contributions are welcome! Follow these steps to contribute:

1. ### **Fork the repository**  

2. ### **Create your feature branch**  
```bash
git checkout -b feature-name
```
3. ### **Commit your changes**
```bash
git commit -m "Added new feature"
```
4. ### **Push to your branch**
```bash
git push origin feature-name
```
5. ### **Open a Pull Request**

## 📜 License

This project is licensed under the MIT License.

## 👨‍💻 Author

Developed by **S. Leela Madhav ✨**
If you like this project, consider giving it a **⭐ on GitHub!**
