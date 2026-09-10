public class wrapper {
    public static void main(String[] args) {
        //Wrapper Classes = Allow primitive values (int, char,  double , boolean)
        //                  to be used as objects. "Wrap them in an object"
        //                  Generaly, don't wrap primitives unless you need an object.
        //                  Allows use of collections Framework and static Utility Methods.

        /* Integer a = new Integer(123);
        Double b = new Double(3.14);
        Character c = new Character("$");
        Boolean d = new Boolean(true); */

        //Autoboxing
        Integer a = 123;
        Double b = 3.14;
        Character c = '$';
        Boolean d = true;


        //Unboxing

        String h = Integer.toString(123);
        String i = Double.toString(3.14);
        String j = Character.toString('$');
        String k = Boolean.toString(false);

            String x = h + i + j + k;


            System.out.println(x);
        
        int l = Integer.parseInt(x);

    }
}
