package Weakly_Assignment_1;
import java.util.ArrayList;
import java.util.Scanner;
public class Assignment1 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> personalAttentionList = new ArrayList<>();
        System.out.println("enter the number of student");
        int numOfStudent = sc.nextInt();
        sc.nextLine();
        String FirstTopperName = null;
        double firsttopperAvg = -1;
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("enter the name of students");
            String name = sc.next();

            System.out.println("enter java marks");
            double java = sc.nextDouble();
            System.out.println("enter python marks");
            double python = sc.nextDouble();
            System.out.println("enter c++ marks");
            double cpp = sc.nextDouble();
            sc.nextLine();
            double avg = (java + python + cpp) / 3;
            System.out.println("Avg marks is" + avg);
            // check the threshold
            if (avg > 90) {
                System.out.println(name + "excelence average");
            } else if (avg < 40) {
                System.out.println(name + " need personal attention");
                personalAttentionList.add(name); // adding the name of student in personal attention list
            }
            // find topper
//            System.out.println(avg);
//            System.out.println(firsttopperAvg);
            if (avg > firsttopperAvg) {

             FirstTopperName = name;
               firsttopperAvg = avg;
//                System.out.println(avg);
//                System.out.println(firsttopperAvg);

            }


        }
        System.out.println("first topper is " + FirstTopperName + "with average marks" + firsttopperAvg);
        // segregate student according to thir avg marks
        double Maxthreshold = 90;
        double Minthreshold = 40;
        ArrayList<String> aboveMaxthreshold = new ArrayList<>();
        ArrayList<String> withineMaxthreshold = new ArrayList<>();
        ArrayList<String> belowMinthreshold = new ArrayList<>();
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("enter the name of students");
            String name = sc.next();

            System.out.println("enter java marks");
            double java = sc.nextDouble();
            System.out.println("enter python marks");
            double python = sc.nextDouble();
            System.out.println("enter c++ marks");
            double cpp = sc.nextDouble();
            sc.nextLine();
            double avg = (java + python + cpp) / 3;
            sc.nextLine();
            if (avg > Maxthreshold) {
                aboveMaxthreshold.add(name);
            } else if (avg >= Minthreshold) {
                withineMaxthreshold.add(name);
            } else {
                belowMinthreshold.add(name);
            }
        }
        System.out.println("student above max threshold");
        aboveMaxthreshold.forEach(System.out::println);
        System.out.println("student within threshold");
        withineMaxthreshold.forEach(System.out::println);

        System.out.println("student above max threshold");
        belowMinthreshold.forEach(System.out::println);
        for (int i = 0; i < numOfStudent; i++) {
            System.out.println("enter the name of students");
            String name = sc.next();

            System.out.println("enter java marks");
            double java = sc.nextDouble();
            System.out.println("enter python marks");
            double python = sc.nextDouble();
            System.out.println("enter c++ marks");
            double cpp = sc.nextDouble();
            sc.nextLine();
            if (java < 40 || python < 40 || cpp < 40) {
                System.out.println(name + " failed in one subject need in personal attention list ");
                personalAttentionList.forEach(System.out::println);
            }


        }
    }
}
