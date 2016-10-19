/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaBasic;

import java.util.ArrayList;

/**
 *
 * @author Ratnesh Kushwaha
 */

class BankAccount {
String acctNumber;
int acctType;
public boolean equals(Object anObject) { 
if (anObject instanceof BankAccount) {
BankAccount b = (BankAccount)anObject;
return (acctNumber.equals(b.acctNumber) &&
acctType == b.acctType);
}
else
return false;
}
}
class TestMethodEquals {
public static void main(String args[]) {
BankAccount b1 = new BankAccount(); 
b1.acctNumber = "0023490"; b1.acctType = 4; 

ArrayList <BankAccount> list = new ArrayList<BankAccount>();
list.add(b1); 
BankAccount b2 = new BankAccount(); 
b2.acctNumber = "0023490"; b2.acctType = 4; 

System.out.println(list.contains(b2)); 
}
}