import java.util.*;

public class Prac1 {
    String id;
    String name;
    String department;
    int salary;

    public Prac1() {}

    public Prac1(String id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void contract() {
        System.out.println("This employee is with contract");
    }

    void permanent() {
        System.out.println("This employee is permanent");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of employees: ");
        int e = sc.nextInt();
        sc.nextLine();

        String[] id = new String[e];
        String[] name = new String[e];
        String[] department = new String[e];
        int[] salary = new int[e];
        int[] n = new int[e];

        for (int i = 0; i < e; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Enter id: ");
            id[i] = sc.nextLine();

            System.out.print("Enter name: ");
            name[i] = sc.nextLine();

            System.out.print("Enter department: ");
            department[i] = sc.nextLine();

            System.out.print("Enter salary: ");
            salary[i] = sc.nextInt();

            System.out.print("If employee has contract then type 1, else 0: ");
            n[i] = sc.nextInt();
            sc.nextLine();

            Prac1 p1 = new Prac1(id[i], name[i], department[i], salary[i]);

            if (n[i] == 1) {
                p1.contract();
            } else if(n[i] == 0) {
                p1.permanent();
            } else {
                System.out.println("Enter valid detail");
            }
        }

        System.out.println("\nEmployee Details:");
        for (int i = 0; i < e; i++) {
            System.out.println("id: " + id[i] + ", name: " + name[i] + ", department: " + department[i] + ", salary: " + salary[i]);
        }

        sc.close();
    }
}
