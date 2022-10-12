package classGenerator;
import java.util.ArrayList;
import classGenerator.methods;
import classGenerator.objs;

/**
 * The purpose of this object is to represent Java classes, with class fields
 * and methods
 * 
 * @author Jonathan Hsin
 * @version 10/2/2022
 *
 */
public class classes {
    String name;
    ArrayList<objs> fields;
    ArrayList<methods> meths;

    /**
     * 
     * @param n
     *            the name of the class
     */
    public classes(String n) {
        name = n;
        fields = new ArrayList<objs>();
        meths = new ArrayList<methods>();
    }


    /**
     * 
     * @param o
     *            the fields of the class
     * @return True if the field is added, false if it isn't
     */
    public boolean addField(objs o) {
        return fields.add(o);
    }


    /**
     * 
     * @param m
     *            the methods of the class
     * @return True if the method is added, false if it isn't
     */
    public boolean addMethod(methods m) {
        return meths.add(m);
    }


    /**
     * @return the skeleton code of the class
     */
    public String toString() {
        String retstring = "public class " + name + " {\n";

        // The fields
        for (int i = 0; i < fields.size(); i++) {
            retstring += "\t" + fields.get(i).toString() + ";\n";
        }

        // The methods
        for (int i = 0; i < meths.size(); i++) {
            retstring += "\t" + meths.get(i).toString() + " {}\n";
        }
        return retstring + "}";
    }
}
