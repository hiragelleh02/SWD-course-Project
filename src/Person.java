public class Person implements Printable {
    String name;
    int age;
    String address;



    //Constructor
    public Person(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;

    }
    
   public String getName(){ return name; }
   public int getAge(){ return age; }
   public String getAddress(){ return address; }

    @Override
    public void printInfo(){
        System.out.println("Person Information: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}