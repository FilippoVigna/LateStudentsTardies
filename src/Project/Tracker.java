package Project;

import java.sql.SQLOutput;
import java.util.*;

public class Tracker {
    private static Student[] students;
    private static int numStuds;


    public Tracker() {
        students = new Student[50];
        numStuds = 0;
    }

    public static void enterData() {
        Scanner keyboard = new Scanner(System.in);
        Student a = new Student();

        System.out.println("Enter last name --> ");
        a.setLastName(keyboard.nextLine());
        System.out.println("Enter fist name --> ");
        a.setFirstName(keyboard.nextLine());
        System.out.println("Enter number of tardies --> ");
        a.setTardies(keyboard.nextInt());

        students[numStuds] = a;
        numStuds = numStuds + 1;
    }

    public static void totalTardies() {
        int totalTardies = 0;
        for (int i = 0; i <= numStuds-1; i ++)
            totalTardies = totalTardies + students[i].getTardies();
        System.out.println(totalTardies);
    }

    public static void summaryReport() {
        for (int f = 0; f <= numStuds-1; f++) {
            System.out.println(students[f].toString());
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Tracker app = new Tracker();

        System.out.println(" ");
        System.out.println("====================");
        System.out.println("Enter Studednt Data");
        System.out.println("====================");

       
        enterData();
        for (int j = 1; j <= numStuds; j++) {
            System.out.print("Enter another student[y/n]? ");
            if (Objects.equals(keyboard.nextLine(), "y"))
                enterData();
            else
                break;
        }
            System.out.println(" ");
            System.out.println("============================");
            System.out.print("Class summary - Tardy total = " );
            totalTardies();
            System.out.println("============================");
            System.out.println(" "); 
            summaryReport();
    }
}
