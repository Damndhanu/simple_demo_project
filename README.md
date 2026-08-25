# 🚀 Demo Web Shop Automation (Selenium + Java + TestNG + POM)

This project automates key user flows of the **Demo Web Shop** application using  
**Selenium WebDriver, Java, TestNG, Maven, and Page Object Model (POM)**.

It is designed as a clean and beginner-friendly framework suitable for:
- Tutors teaching Selenium + Java
- Freshers showcasing automation skills
- Demo sessions
- GitHub portfolio

---

## 📌 **Tech Stack**
- **Java 8+**
- **Selenium WebDriver 4**
- **TestNG**
- **Maven**
- **WebDriverManager**
- **Page Object Model (POM)**

---

## 📁 **Project Structure**
```
DemoWebShopAutomation/
│── pom.xml
│── README.md
└── src/
    └── test/
        └── java/
            └── pages/
                BasePage.java
                LoginPage.java
                HomePage.java
                ElectronicsPage.java
                ProductPage.java
            └── tests/
                BaseTest.java
                LoginTest.java
                AddToWishlistTest.java
                LogoutTest.java
```

---

## 🧪 **Test Scenarios Automated**

### ✅ 1. **Login Test**
- Navigate to Demo Web Shop  
- Click Login  
- Enter Email & Password  
- Verify login is successful  

### ✅ 2. **Add Product to Wishlist**
- Login  
- Navigate to *Electronics → Cell Phones*  
- Open product  
- Add product to wishlist  
- Verify success notification  

### ✅ 3. **Logout Test**
- Login  
- Logout  
- Verify user is signed out  

---

## git 
1. Clone the repository  
2. Open in IntelliJ  
3. Run:
```
mvn clean test
```
or right-click → **Run TestNG tests**

---

## 🧱 **POM Implementation**
Each page is defined as a separate class containing:
- Page elements  
- Page actions  
- Clean reusable methods  

This improves:
- Code readability  
- Maintainability  
- Reusability  

---

## 📚 **Dependencies (pom.xml)**

```xml
<dependencies>
    <dependency>
        <groupId>org.seleniumhq.selenium</groupId>
        <artifactId>selenium-java</artifactId>
        <version>4.22.0</version>
    </dependency>

    <dependency>
        <groupId>org.testng</groupId>
        <artifactId>testng</artifactId>
        <version>7.8.0</version>
        <scope>test</scope>
    </dependency>

    <dependency>
        <groupId>io.github.bonigarcia</groupId>
        <artifactId>webdrivermanager</artifactId>
        <version>5.8.0</version>
    </dependency>
</dependencies>
```

---

## 🎯 **What You Will Learn from This Project**
- How to build a Selenium framework in IntelliJ  
- How to use POM (Page Object Model)  
- Writing reusable page methods  
- Creating TestNG test scripts  
- Creating Maven project structure  
- Logging in, navigating, clicking elements  
- Assertions in TestNG  

---

## 🙋‍♂️ **Author**
**Dhanush R**  
Selenium with Java Trainer  
Automation Testing | Manual Testing | Java  

---

## ⭐ **If you find this project useful, don't forget to star the repo!**
