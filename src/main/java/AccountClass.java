/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Gallegos
 */
public class AccountClass {
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private int actNumber;
    private int routeNumber;
    private double savingBalance;
    private double checkingBalance;
    
    double deposit(double ammount){
        return ammount+savingBalance;
    }
    double withdraw(double ammount){
        return checkingBalance-ammount;
    }
}
