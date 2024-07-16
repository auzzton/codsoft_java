import java.util.Scanner;


public class grade_calculator {
    public static void main (String args [])
    {
        int m1,m2,m3,m4,m5;
        int total ;
        double avg ;
        char grade = '0';
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you marks in English, Maths, Physics, Chemsitry, Computer Science");
         m1 = sc.nextInt();
         m2 = sc.nextInt();
         m3 = sc.nextInt();
         m4 = sc.nextInt();
         m5 = sc.nextInt();
         total = (m1+m2+m3+m4+m5) ;
         avg = (m1+m2+m3+m4+m5)/5;
         if (avg>90 && avg<100) {
            grade = 'O';
         }
         if (avg>80 && avg<90) {
            grade = 'A';
         }
         if (avg>70 && avg<80) {
            grade = 'B';
         }
         if (avg>60 && avg<70) {
            grade = 'C';
         }
         if (avg>50 && avg<60) {
            grade = 'D';
         }
         if (avg>40 && avg<50) {
            grade = 'O';
         }
         if(avg<40)
         {
            grade = 'F';
         }

         System.out.println("Your total marks = "+total);
         System.out.println("Your average percentage = "+avg+"%");
         System.out.println("Your grade is  "+grade);

         

    }

}
