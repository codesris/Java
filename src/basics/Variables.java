package src.basics;

public class Variables {
    public static void main(String[] args){
        String name = "Cha Sris";
        int gta = 6;
        double pi = 3.15159;
        char gender = 'M';
        boolean isAdmin = true;

        System.out.println(name);
        System.out.println(gta);
        System.out.println(pi);
        System.out.println(gender);

        if(isAdmin==true){
                    System.out.println("Srisan Chaudhary "+ name +" " +gender + " has scored " +pi+ " in gta "+gta);
        }
        else{
            System.out.println("Error");
        }
    }
}
