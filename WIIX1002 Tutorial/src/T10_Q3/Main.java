package T10_Q3;

class Person implements Comparable<Person>{
    private String name;

    public Person(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public void display(){
        System.out.println("Name: " + name);
    }

    public int compareTo(Person a){
        return name.compareToIgnoreCase(a.getName());
    }
}
public class Main {
    public static void main(String[] args) {
        final int MAX = 5;
        Person[] p = new Person[MAX];
        Person temp;
        p[0] = new Person("Wan Ahmad");
        p[1] = new Person("Lim");
        p[2] = new Person("Abu");
        p[3] = new Person("Siti");
        p[4] = new Person("Mutu");

        System.out.println("List of Participant");
        for (int i = 0; i < 5; i++)
            System.out.println(p[i].getName());

        for (int i = 0; i < p.length; i++)
            for (int j = 0; i < p.length - 1; j++)
                if (p[j].compareTo(p[j + 1]) > 0) {
                    temp = p[j];
                    p[j] = p[j + 1];
                    p[j + 1] = temp;
                }
        System.out.println("The sorted list : ");
        for(int i=0; i<5; i++)
            System.out.println(p[i].getName());
    }
}
