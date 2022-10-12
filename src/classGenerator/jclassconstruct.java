package classGenerator;
import java.util.Scanner;
import classGenerator.abstclass;
import classGenerator.classes;
import classGenerator.intrfcs;
import classGenerator.methods;
import classGenerator.objs;

/**
 * This program will be used to print out the skeleton code for classes
 * 
 * @author Jonathan Hsin
 * @version 10/2/2022
 *
 */
public class jclassconstruct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // making the classes
        System.out.println("What kind of class would you like to make? (c=class"
            + " i=interface a=abstract class)");
        classes c;
        String classtype = scan.next();
        System.out.println("What's the name of the class?");
        String classname = scan.next();
        if (classtype.equals("c")) {
            c = new classes(classname);
        }
        else if (classtype.equals("i")) {
            c = new intrfcs(classname);
        }
        else if (classtype.equals("a")) {
            c = new abstclass(classname);
        }
        else {
            System.out.println("Incorrect input, please restart program");
            c = new classes("null");
        }

        // fields
        String type;
        String name;
        int vis;
        System.out.println("How many fields are in your class?");
        int numf = scan.nextInt();
        for (int i = 0; i < numf; i++) {
            System.out.println("field " + (i + 1) + ":");
            System.out.println("Is this field private or public?"
                + "(0=private 1=public)");
            vis = scan.nextInt();
            System.out.println("What is the field type?");
            type = scan.next();
            System.out.println("What is the name of the field?");
            name = scan.next();
            c.addField(new objs(name, type, vis));
        }

        // methods
        System.out.println("How many methods are in your class?");
        int numm = scan.nextInt();
        for (int i = 0; i < numm; i++) {
            System.out.println("method " + (i + 1) + ":");
            System.out.println("Is this method private or public?"
                + "(0=private 1=public)");
            vis = scan.nextInt();
            System.out.println("What is the return type? (type \"n/a\" if "
                + "constructor)");
            type = scan.next();
            System.out.println("What is the name of the method?");
            name = scan.next();
            methods m = new methods((vis == 1), name, type);

            // parameters
            System.out.println("How many parameters are in this method?");
            int param = scan.nextInt();
            for (int j = 0; j < param; j++) {
                System.out.println("parameter " + (j + 1) + ":");
                System.out.println("What is the type of the parameter?");
                type = scan.next();
                System.out.println("What is the parameter name?");
                name = scan.next();
                m.addParam(new objs(name, type));
            }
            c.addMethod(m);
        }
        System.out.println(c.toString());
        scan.close();
    }
}
