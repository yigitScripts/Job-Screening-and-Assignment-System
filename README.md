# JOSYS - Job Screening and Assignment System

This project is a console-based application developed for the **CME1212 Algorithms and Programming II** course. It simulates a job application system where candidates are evaluated based on skills tests and resumes, and then assigned to companies based on their scores, preferences, and company quotas.

## 🎯 Project Objective
The main goal of JOSYS is to process applicant data, grade their exams using a robust algorithm that handles potential errors, and match them with companies. The system evaluates shifting possibilities in the answer sheets (left or right shifts) to calculate the highest possible score for each applicant.

## 🛠️ Data Structures
In compliance with the assignment rules, **no built-in Java collections** (like ArrayList, HashMap, etc.) or Arrays were used. All data structures were manually implemented:

* **Single Linked List:** Used to store the skills test answers of each applicant and the correct answer key.
* **Double Linked List:** Used to store graded applicants, ordered primarily by descending skills test score and secondarily by resume score.
* **Multi Linked List:** Used to manage company data and the list of applicants assigned to each company.

## 🚀 Key Features

1.  **Smart Grading Algorithm:**
    * Each correct answer is worth 5 points.
    * The system checks for "one-position shifts" (left or right) in the applicant's answers to account for common marking errors and assigns the highest possible score.
2.  **Dynamic Ranking:**
    * Applicants are stored in a Double Linked List sorted by score.
    * **Tie-Breaker:** If skills test scores are equal, the applicant with the higher resume score is prioritized.
3.  **Automated Assignment (Matchmaking):**
    * The system processes applicants based on their rank and preferences (p1, p2, p3).
    * Applicants are assigned to the first preferred company with available quota.

## 💻 CLI Commands

The program supports the following command-line operations:

* `load`: Loads the Applicants, Companies, and Answer Key files into memory.
* `top`: Displays the top 5 applicants based on total score (Skills + Resume).
* `companies`: Displays statistics for each company, including highest/lowest scores and quota fill ratios.
* `assignments`: Lists the assignments for each company (ordered by score) and displays unassigned applicants.

## 📂 Data File Formats
The system parses text files in the following formats:
* **Applicants:** `<id>,<name>,<resume_score>,<p1>,<p2>,<p3>,<answers...>`
* **Companies:** `<id>,<name>,<quota>`
* **Answer Key:** `<s1>,<s2>,...,<s20>`

---
