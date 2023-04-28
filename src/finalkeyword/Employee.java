package finalkeyword;

public  class Employee {
    int empId;
    final String PAN_NO = "MDPSE5630L";
    final String AADHAR_NO; //blank final variable or uninitialized final variable
    static final String LICENCE_NO; //blank final variable or uninitialized final variable

    Employee(){
        AADHAR_NO = "986148392456";
    }
    static {
        LICENCE_NO = "456465464";
    }
//     final void display(){
//        System.out.println("PAN NO "+PAN_NO);
//    }

//    void show(){ // not possible
//        AADHAR_NO = "986148392456";
//
//    }


}
 class Manager extends Employee{

 }