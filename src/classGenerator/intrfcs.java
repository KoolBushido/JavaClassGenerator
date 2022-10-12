package classGenerator;
/**
 * The purpose of this object is to represent Java interfaces, with class fields
 * and methods
 * 
 * @author Jonathan Hsin
 * @version 10/2/2022
 *
 */
public class intrfcs extends classes {
    /**
     * @param n
     *            the name of the interface
     */
    public intrfcs(String n) {
        super(n);
    }


    /**
     * @return the skeleton code for the interface
     */
    @Override
    public String toString() {
        String retstring = "public interface " + name + " {\n";

        // The fields
        for (int i = 0; i < fields.size(); i++) {
            retstring += "\t" + fields.get(i).toString() + ";\n";
        }

        // The methods
        for (int i = 0; i < meths.size(); i++) {
            retstring += "\t" + meths.get(i).toString() + ";\n";
        }
        return retstring + "}";
    }
}
