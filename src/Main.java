//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
         public static void main(String[] args) {
             // Dəyişənlərin elan edilməsi
             String studentName = "Orxan";
             int age = 20;
             double averageScore = 85.5;
             boolean isPassed = true;

             // Hesab əməliyyatı
             int bonus = 5;
             double finalScore = averageScore + bonus;

             // Ekrana çap etmək
             System.out.println("Tələbə: " + studentName);
             System.out.println("Yaş: " + age);
             System.out.println("Yekun Bal: " + finalScore);

             // Müqayisə və Məntiq
             boolean isScholarship = isPassed && (finalScore > 90);
             System.out.println("Təqaüd alır? " + isScholarship);


    }
}