
// GitHub Repository: https://github.com/AlphaKabineh2/COSC113-Maximum-CGPA

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MaximumCGPA {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("src/students.txt");
        Scanner input = new Scanner(file);

        String highestStudent = "";
        double highestCGPA = 0.0;

        while (input.hasNext()) {

            String name = input.next();
            double cgpa = input.nextDouble();

            if (cgpa > highestCGPA) {
                highestCGPA = cgpa;
                highestStudent = name;
            }
        }

        System.out.println("Student with maximum CGPA: " + highestStudent);
        System.out.println("Maximum CGPA: " + highestCGPA);

        input.close();
    }
}
