public class ThisCon {
    int id;
    String name;

    public ThisCon(){
       // this(101,"Ami");// calls paramiterized constructor
    }

    //paramiterized constructor
    public ThisCon (int id , String name) {
        this.id = id;
        this.name = name;
    }
    void display(){
      System.out.println("id:" + id+ " name:" + name);
    }
    public static void main(String[] args) {
        ThisCon pc1 = new ThisCon(101,"Ami");
        ThisCon pc2 = new ThisCon(102, "Amit");

        pc1.display();
        pc2.display();
    }
}
