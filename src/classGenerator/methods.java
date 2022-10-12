package classGenerator;
import java.util.ArrayList;
import classGenerator.objs;

/**
 * The purpose of this object is to represent a java method, completed with
 * method name, return type, and parameters
 * 
 * @author Jonathan Hsin
 * @version 10/2/2022
 *
 */
public class methods {
    boolean pub;
    String name;
    String ret;
    ArrayList<objs> params;

    /**
     * 
     * @param p
     *            represents the visibility of the public, True if it is public,
     *            False if it is private
     * @param n
     *            represents the name of the method
     * @param r
     *            the return type of the method
     */
    public methods(boolean p, String n, String r) {
        pub = p;
        name = n;
        ret = r;
        params = new ArrayList<objs>();
    }


    /**
     * @param o
     *            represents the parameter
     * @return True if the parameter is added, False if it isn't
     */
    public boolean addParam(objs o) {
        return params.add(o);
    }


    /**
     * @return the method as a String
     */
    public String toString() {
        String vis;
        // converts the boolean for visibility into String
        if (pub) {
            vis = "public";
        }
        else {
            vis = "private";
        }
        String retstring;
        if (ret.equals("n/a")) {
            retstring = vis + " " + name + "(";
        }
        else {
            retstring = vis + " " + ret + " " + name + "(";
        }

        // fenceposting for the parameters
        if (params.size() == 0) {
            return retstring + ")";
        }
        for (int i = 0; i < params.size() - 1; i++) {
            retstring += params.get(i).toString() + ", ";
        }
        retstring += params.get(params.size() - 1);
        return retstring + ")";
    }
}
