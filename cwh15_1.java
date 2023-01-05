public class cwh15_1 {
    public static void main(String[] args) {
        //problem1
        String name="HARRY";
        name =name.toLowerCase();
        System.out.println(name);
        //problem2
        String name1="To Lower Case";
        name1=name1.replace(" ","_");
        System.out.println(name1);
        //program3
        String name2="Dear <|name|> ,Thanks a Lot";
        name2=name2.replace("<|name|>","Soumik");
        System.out.println(name2);
        //problem4
        String myname="This string contains double space  and triple    space";
        System.out.println(myname.indexOf("  "));
        System.out.println(myname.indexOf("   "));
        //problem5
        String myletter="dear\n\t harry this\n\t course is good";
        System.out.println(myletter);



    }
}
