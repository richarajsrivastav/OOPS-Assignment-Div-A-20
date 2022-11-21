import java.util.*;

public class ListOfNames {

    public ArrayList<String> list = new ArrayList<String>();

    public ListOfNames() {
        list.add("EMMA");
        list.add("ANNABELLA");
        list.add("SKY");
        list.add("PETER");
        list.add("RICHA");
    }

    public void add(String tname) {
        list.add(tname);
    }

    public void remove(String tname) {
        list.remove(tname);
    }

    public void get(int num) {
        list.get(num);
    }

    public void printNames() {
        System.out.println("");
        System.out.println("List : ");
        for (int r = 0; r < list.size(); r++) {
            System.out.println(list.get(r));
            // char ch;
            // int i = 0;
            // for (int j = 0; j < list.get(r).length(); j++) {
            // ch = list.get(r).charAt(j);
            // if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            // i = 1;
            // // System.out.println(ch);
            // // System.out.println("--------------");
            // }
            // }
            // System.out.println("The name " + list.get(r) + " contains vowels, and the
            // vowels are : ");
            // if (i == 0)
            // System.out.println("There are no vowels in a entered string");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter 1 to Add the Record In List : ");
        System.out.println(" Enter 2 to Remove the Record from the List : ");
        System.out.println(" Enter 3 to Get Record from List : ");
        System.out.println(" Enter 4 to Print All the records in the List : ");
        System.out.println("");
        System.out.print(" Enter Your Choice : ");
        int ch = sc.nextInt();

        ListOfNames l1 = new ListOfNames();

        switch (ch) {
            case 1:
                System.out.println("");
                System.out.print(" Enter Your Name : ");
                String name = sc.next();

                if (name.equals(name.toUpperCase())) {
                    l1.add(name);
                    l1.printNames();
                } else {
                    System.out.println(" Enter String In uppercase.");
                }
                break;
            case 2:
                System.out.println("");
                System.out.print(" Enter Your Name : ");
                String rname = sc.next();

                if (rname.equals(rname.toUpperCase())) {
                    l1.remove(rname);
                    l1.printNames();
                } else {
                    System.out.println(" Enter String In uppercase.");
                }
                break;
            case 3:
                System.out.println("");
                System.out.print(" Enter Key Number Of Name : ");
                int val = sc.nextInt();
                l1.get(val);
                break;
            case 4:
                l1.printNames();
                break;
            default:
                System.out.println("Invalid Choice !!");
        }
    }
}