public class cwh14 {
    public static void main(String[] args) {
        String name= "Harry";
        int value =name.length();
        System.out.println(value);
        String lstring=name.toLowerCase();
        System.out.println(lstring);
        String g=name.toUpperCase();
        System.out.println(g);
        String nonTrimmedString= "        Harry        ";
        System.out.println(nonTrimmedString);
        String Trimmedstring= nonTrimmedString.trim();
        System.out.println(Trimmedstring);
        System.out.println(name.substring(1));
        System.out.println(name.substring(2,4));
        System.out.println(name.replace('r','p'));
        System.out.println(name.replace("Harry","Soumik"));
        System.out.println(name.replace("r","ier"));
        System.out.println(name.startsWith("Ha"));
        System.out.println(name.endsWith("ry"));
        System.out.println(name.charAt(2));
        System.out.println(name.indexOf('r'));
        System.out.println(name.indexOf("r",0));
        String modifiedname="Harryrryrry";
        System.out.println(modifiedname.indexOf("rry",2));
        System.out.println(name.lastIndexOf('r'));
        System.out.println(modifiedname.lastIndexOf("rry",6));
        System.out.println(name.equals("Harry"));
        System.out.println(name.equalsIgnoreCase("harry"));
    }
}
