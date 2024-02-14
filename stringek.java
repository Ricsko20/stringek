import java.util.Scanner;

public class stringek {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a vezetéknevet: ");
        String vnev = scanner.nextLine();
        System.out.println("Add meg a keresztnevet: ");
        String knev = scanner.nextLine();
        System.out.println("Add meg a születési helyet: ");
        String szulhely = scanner.nextLine();
        System.out.println("Add meg az életkort: ");
        int eletkor = scanner.nextInt();

        String fullName = (vnev + " " + knev);
        System.out.println(fullName.toUpperCase());

        System.out.println(fullName.indexOf(knev));

        System.out.println(fullName.toLowerCase() + " " + szulhely.toLowerCase());

        System.out.println("A felhasználó " + eletkor + " éves, " + fullName + " a neve és " + szulhely + " a születési helye");

        System.out.println(knev.startsWith("A"));

        System.out.println(vnev.endsWith("t"));

        System.out.println(fullName.length());

        String replacedName = fullName.replace('i', 'y');
        System.out.println(replacedName);

    }
}
