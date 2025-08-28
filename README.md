# 🌱 Eco-Points Recycling Tracker (Java CLI Application)

A simple **command-line recycling tracker** written in Java.  
This program allows households to log recycling events, track eco-points, view individual and community statistics, and save/load data from a file.

---

## ✨ Features

- ➕ **Register Households**  
  Record a household with:  
  - Unique ID  
  - Name  
  - Address  
  - Automatic join date  

- ♻️ **Log Recycling Events**  
  Track recycling activity with:  
  - Material type (plastic, glass, metal, paper)  
  - Weight in kilograms  
  - Automatic eco-points calculation  

- 📋 **View Households**  
  List all registered households along with their details.  

- 🗂️ **View Household Events**  
  - List all recycling events for a specific household  
  - Display total weight and total points earned  

- 📊 **Generate Reports**  
  - Identify household with highest eco-points  
  - Calculate total community recycling weight  

- 💾 **Save and Load Data**  
  - Persist household and event data using Java serialization (`.ser` file)  
  - Automatically load saved data when program starts  

---

## 🛠️ Tech Stack

- **Language:** Java (JDK 8+ recommended)  
- **Libraries:**  
  - `java.util` (HashMap, ArrayList, Scanner, Set)  
  - `java.time` (LocalDate)  
  - `java.io` (FileInputStream, FileOutputStream, ObjectInputStream, ObjectOutputStream)  

---

## 📂 Project Structure

```text
eco-points-recycling-tracker/
├── Household.java          # Represents a household and tracks events & points
├── RecyclingEvent.java     # Represents a recycling event (material, weight, points)
├── EcoPointsRecyclingTracker.java # Main driver class with CLI menu and logic
└── README.md               # Project documentation

---
```
## 🔮 Future Improvements

- Add GUI interface for better usability
- Export reports to CSV or JSON
- Add a leaderboard for multiple households
- Validate material input with strict options
- Add notifications or reminders for households to log recycling events
- Implement unit tests for better code reliability
- Enhance reports with charts or visual summaries
