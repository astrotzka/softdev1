public class lab8{
    public static void main (String[] args){
        int grade = 32;
        int level = 0;
        int age = 20;
        boolean hasID = true;
        boolean isweekend = true, isholidays = false;

        if (age >= 18 && hasID){
            System.out.println("You may enter");
        }else{
            System.out.println("You may not enter");
        }
        if (isweekend || isholidays){
            System.out.println("relax");
        }else{
            System.out.println("Get back to work, peasent");
        }
        if ((age >= 18 && hasID) || isholidays){
            System.out.println("and and or together evaluating to true");
        }else{
            System.out.println("and and or together evaluating to false");

        }

        if (grade >= 70){
            System.out.println("First class honours");
        }else if (grade>= 60){
            System.out.println("Second class honours higher");
        }else if (grade>= 50){
            System.out.println("Second class honours lower");
        }else if (grade>= 40){
            System.out.println("pass");
            level = 4;
        }else{
            System.out.println("Fail");
        }

        switch(level){
            case 1:
                System.out.println("1.1");
                break;
            case 2:
                System.out.println("2.1");
                break;
            case 3:
                System.out.println("2.2");
                break;
            case 4:
                System.out.println("3");
                break;
            default:
                System.out.println("F");
        }
    }
}