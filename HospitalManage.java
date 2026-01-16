import java.util.Scanner;

class Staff{

    String name;
    int id;

    Staff(String name , int id ){
        this.name = name;
        this.id = id;
    }

    void work(){
        System.out.println("Staff working....");
    }

    void displayInfo(){
        System.out.println("Staff name:" + this.name + " Id:" + this.id);
    }
}

abstract class MedicalStaff extends Staff{

    public MedicalStaff(String name , int id) {
        super(name, id);
    }

    abstract void work();
} 

class Doctor extends MedicalStaff{

    Doctor (String name , int id){
        super(name, id);
    }

    @Override
    void work() {
        System.out.println("Doctor " + name +" is treating patients.");
    }
}

class Nurses extends MedicalStaff{

    Nurses( String name , int id){
        super(name, id);
    }

    @Override
    void work() {
        System.out.println("Nurse " + name + " is assisting doctors.");
    }
}

// Corrected: AdminStaff now extends Staff, not MedicalStaff
class AdminStaff extends Staff{
    AdminStaff(String name, int id) {
        super(name, id);
    }

    @Override
    void work() {
        System.out.println("Admin staff " + name + " is managing hospital records.");
    }
}

final class FinanceTeam extends AdminStaff {

    FinanceTeam(String name, int id) {
        super(name, id);
    }

    @Override
    void work() {
        System.out.println("Finance team member " + name + " is handling financial matters.");
    }
}

public class HospitalManage {

    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Hospital Management System");

        System.out.println("enter docotor name and id");
        String dn = scanner.nextLine();
        int id1 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("You have entered: " + dn);
        System.out.println("Your ID is: " + id1);

        System.out.println("enter nurse name and id");
        String nu = scanner.nextLine();
        int id2 = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("You have entered: " + nu);
        System.out.println("Your ID is: " + id2);

        System.out.println("enter admin staff name and id");
        String ad = scanner.nextLine();
        int id3 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You have entered: " + ad);
        System.out.println("Your ID is: " + id3);

        System.out.println("enter finance team member name and id");
        String fi = scanner.nextLine();
        int id4 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You have entered: " + fi);
        System.out.println("Your ID is: " + id4);
        
        Staff staff1 = new Doctor(dn,id1);
        Staff staff2 = new Nurses(nu, id2);
        Staff staff3 = new AdminStaff(ad, id3);
        Staff staff4 = new FinanceTeam( fi, id4);

        System.out.println("------------------------------------------------------");
        staff1.work();
        staff1.displayInfo();
        System.out.println("------------------------------------------------------");
        staff2.work();
        staff2.displayInfo();
        System.out.println("------------------------------------------------------");
        staff3.work();
        staff3.displayInfo();
        System.out.println("------------------------------------------------------");
        staff4.work();
        staff4.displayInfo();
        System.out.println("------------------------------------------------------");
        System.out.println("All staff members work has been displayed.");
        System.out.println("------------------------------------------------------");
    }
}
