package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String name = scanner.nextLine();

        System.out.print("Nota do primeiro trimestre: ");
        double grade1 = scanner.nextDouble();
        
        System.out.print("Nota do segundo trimestre: ");
        double grade2 = scanner.nextDouble();
        
        System.out.print("Nota do terceiro trimestre: ");
        double grade3 = scanner.nextDouble();

        Student student = new Student(name, grade1, grade2, grade3);
        
        
        System.out.println("\n" + student);

        scanner.close();
    }
}