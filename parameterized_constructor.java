public class ParaCon {
    int id;
    String name;

    //paramiterized constructor
    public ParaCon(int i , String n) {
        id = i;
        name = n;
    }
    void display(){
      System.out.println("id:" + id+ " name:" + name);
    }
    public static void main(String[] args) {
        ParaCon pc1 = new ParaCon(101,"Ami");
        ParaCon pc2 = new ParaCon(102, "Amit");

        pc1.display();
        pc2.display();
    }
}
