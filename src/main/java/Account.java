
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gallegos
 */
public class Account {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private int actNumber;
    private int routeNumber;
    private double savingBalance;
    private double checkingBalance;
    // Account constructor class class will be given account number and routing number
    Account(String firstName, String lastName, String username, String password){
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
    }
    public void deposit(double ammount){
        Scanner scn = new Scanner(System.in);
        System.out.println("Type 1 to deposit into your checking,2 to deposit into your savings, and 3 if you would like to cancel: ");
        int x= scn.nextInt();
        if(x==1){
            checkingBalance += ammount;
        }else if(x==2){
            savingBalance += ammount;
        }else{
            System.out.println("No money was added to your account.");
        }
        
    }
    public void withdraw(double ammount){
        Scanner scn = new Scanner(System.in);
        System.out.println("Type 1 to withdraw from your checking,2 to withdraw your savings, and 3 if you would like to cancel: ");
        int x= scn.nextInt();
        if(x==1){
            checkingBalance -= ammount;
        }else if(x==2){
            savingBalance -= ammount;
        }else{
            System.out.println("No money was taken from your account.");
        }
        
    }

    public double getSavingBalance() {
        return savingBalance;
    }
    public double getCheckingBalance() {
        return checkingBalance;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public int getRouteNumber() {
        return routeNumber;
    }

    public void setRouteNumber(int routeNumber) {
        this.routeNumber = routeNumber;
    }
}