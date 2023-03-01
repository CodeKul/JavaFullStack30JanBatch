package common.controlflowstatements;

public class IfStatementDemo {
    public static void main(String[] args) {
        int a = 30;
        int b = 40;
        if (a > b){
            System.out.println(a +" is greater than "+b);
        }else {
            System.out.println(a +" is smaller than "+b);
        }

        System.out.println(a>b ? a +" is greater than "+b : a +" is smaller than "+b);


        //if--else--if

        String country = "USA";
        String city = "Goa";

        if (country != "India"){
            System.out.println("You are not from India");
        }else {
            if (city == "Pune"){
                System.out.println("You are from India & lived in Pune.");
            }
            else {
                System.out.println("You are from India but lived outside Pune.");
            }
        }
        //Nested If

        if (country == "India"){
            if (city == "Pune"){
                System.out.println("You are from Pune");
            }else {
                if (city == "Mumbai") {
                    System.out.println("You are from Mumbai");
                }
                else {
                    System.out.println("Yor are not from Pune/Mumbai");
                }
            }
        }else {
            System.out.println("Other than India");
        }
    }
}
