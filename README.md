# Resume Keyword Matcher (Java)

A simple Java program that checks how well a resume matches a set of job keywords.  
This helps recruiters or job seekers identify skill gaps and improve resumes.

## Features

- Input resume text directly
- Input job keywords (comma-separated)
- Calculate match percentage between resume and keywords
- Display matched and missing keywords

## Technologies Used

- **Java 8+**
- Standard Java libraries: `java.util`, `java.util.Scanner`, `java.util.HashSet`

## How It Works

1. User inputs the text of the resume.
2. User inputs the job keywords, separated by commas.
3. The program splits both the resume and keywords into words.
4. It checks which keywords are present in the resume.
5. Calculates the **match percentage**:
   \[
   \text{Match Percentage} = \frac{\text{Number of Matched Keywords}}{\text{Total Keywords}} \times 100
   \]
6. Outputs:
   - Match percentage
   - Number of matched keywords
   - List of missing keywords

## How to Run

1. Clone the repository:
```bash
git clone https://github.com/chinnikusuma973/Resume-Keyword-Matcher.git
2. Compile and run the program
javac ResumeKeywordMatcher.java
java ResumeKeywordMatcher

