package classGenerator;
/**
 * The purpose of this object is to represent a java parameter or class fields
 * with type and name
 * 
 * @author Jonathan Hsin
 * @version 10/2/2022
 *
 */
public class objs {
    String type;
    String name;
    int vis;

    /**
     * 
     * @param t
     *            The type of the parameter
     * @param n
     *            The name of the parameter
     */
    public objs(String n, String t) {
        this(n, t, -1);
    }


    /**
     * 
     * @param t
     *            The type of the parameter
     * @param n
     *            The name of the parameter
     * @param v
     *            The visibility of the object,
     *            -1 if visibility is unnecessary (such as in parameters),
     *            0 if it is private,
     *            1 if it is public
     */
    public objs(String n, String t, int v) {
        type = t;
        name = n;
        vis = v;
    }


    /**
     * @return the object as a String
     */
    public String toString() {
        if (vis == -1) {
            return type + " " + name;
        }
        else if (vis == 0) {
            return "private " + type + " " + name;
        }
        else {
            return "public " + type + " " + name;
        }

    }
}
