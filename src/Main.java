import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        AnswerKeyList answerKey = new AnswerKeyList();
        ApplicantList applicants = new ApplicantList();


        try (BufferedReader br = new BufferedReader(new FileReader("answer_key.txt"))) {
            String line = br.readLine();
            for (char ch : line.toCharArray()) {
                if (ch != ',') {
                    answerKey.add(ch);
                }
            }
        } catch (IOException e) {
            System.out.println("Answer key file can not be read.");
            return;
        }



        try (BufferedReader br = new BufferedReader(new FileReader("applicants.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0].trim());
                String Name = parts[1].trim();
                int resumeScore = Integer.parseInt(parts[2].trim());

                ApplicantNode applicant = new ApplicantNode(id, Name, resumeScore);


                for (int i = 6; i < parts.length; i++) {
                    applicant.addAnswer(parts[i].trim().charAt(0));
                }
                applicants.add(applicant);
            }
        } catch (IOException e) {
            System.out.println("Applicants file can not be read.");
            return;
        }


        ApplicantNode tempApplicant = applicants.head;
        while (tempApplicant != null) {
            int totalPoints = tempApplicant.resumeScore;

            AnswerNode answerKeyTemp = answerKey.head;
            AnswerNode answerApplicantTemp = tempApplicant.answersHead;

            while (answerKeyTemp != null && answerApplicantTemp != null) {
                if (answerKeyTemp.answer == answerApplicantTemp.answer) {
                    totalPoints += 5;
                }
                answerKeyTemp = answerKeyTemp.next;
                answerApplicantTemp = answerApplicantTemp.next;
            }

            System.out.println(tempApplicant.Name + " - Total Score: " + totalPoints);
            tempApplicant = tempApplicant.next;
        }


    }
}