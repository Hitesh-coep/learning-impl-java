package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        /*Let's assume we have to design class BankCustomer for understanding OOPS concept.
        But we don't have Class concept.
        We need few properties for BankCustomer - customerId, CustomerName, age, address, accountType
        */

        // To save data of 3 customers, we will add these separate properties
//        int [] customerId = new int[3];
//        String [] customerName = new String[3];
//        int [] age = new int[3];
//        String [] address = new String[3];
//        String [] accountType = new String[3];

        /*What is the problem with above approach???
        The above properties are separate and are not part of an entity, so we won't be
        able to use this to add 3 customers.
        To add them we want all these properties to be part of one single entity called as class
        So we create a new class BankCustomer with above properties
         */

        /*We create an instance of class using object. Let's see how to create object.
         */

        //BankCustomer hitesh = new BankCustomer();

        /*One way of adding customer entries is below commented code. But what if there are many customers?
        It will lead to writing duplicate code. We can use parametrized constructors.
         */
//        hitesh.customerId=101;
//        hitesh.customerName="Hitesh Suryawanshi";
//        hitesh.age=26;
//        hitesh.address="Bangalore";
//        hitesh.accountType="Savings Account";

        /* We can avoid using instance variables again and again by using parametrized constructors.
           Adding multiple customers is easy this way.
         */

        BankCustomer hitesh = new BankCustomer(101,"Hitesh Suryawanshi",26,"Bangalore","Savings Account");
        BankCustomer yash = new BankCustomer(102,"Yash",25,"Pune","Current Account");

        //empty constructor
        BankCustomer defaultCustomer = new BankCustomer();
        System.out.println(defaultCustomer.customerName);

        //one parameter constructor
        BankCustomer randomCustomer = new BankCustomer(yash);
        System.out.println(randomCustomer.customerName);

        System.out.println(hitesh.customerId);
        System.out.println(hitesh.customerName);
        System.out.println(hitesh.age);
        System.out.println(hitesh.address);
        System.out.println(hitesh.accountType);
    }
}

class BankCustomer{
    Integer customerId;
    String customerName;
    Integer age;
    String address;
    String accountType;

    //This can be an example of default constructor. Also, how to call constructor from constructor.
    BankCustomer(){
        this(103,"DefaultCustomer",56,"Nagpur","Savings Account");
    }

    BankCustomer(BankCustomer other){
        this.customerId=other.customerId;
        this.customerName=other.customerName;
        this.age=other.age;
        this.address=other.address;
        this.accountType=other.accountType;
    }

    //This is an example of parametrized constructor
    BankCustomer(Integer customerId, String customerName, Integer age, String address, String accountType){
        this.customerId=customerId;
        this.customerName=customerName;
        this.age=age;
        this.address=address;
        this.accountType=accountType;
    }
}