import java.utiil.Scanner;
import java.io.*;

public class MoneyProcessor throws IOException{
  public static void main(String[] args){
    Scanner input = new Scanner(new File("money.txt");
    while(input.hasNext)){
      String line = input.nextLine();
      String [] tokens = line.split(",");
        Dollar bill = new Dollar(Integer.parseInt(token[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3]));
        bill.showBill();
    }

    input = new Scanner(new File("money.txt));
    Dollar [] wallet = new Dollar[10];
    for(int i = 0; input.hasNext(); i++){
      String line = input.nextLine();
      String [] tokens = line.split(",");
      Dollar bill = new Dollar(Integer.parseInt(token[0]), tokens[1], tokens[2], Integer.parseInt(tokens[3]));
      wallet[i] = bill;
    }
    System.out.print("**** printBills() ****");
    printBills(wallet);
    System.out.print("**** printOnlyDenominations() ****");
    printOnlyDenominations(wallet);
    System.out.print("**** getTotalAmountInWallet ****");
    System.out.print(getTotalAmountInWallet(wallet));
    
  }
  public static void printBills(Dollar [] array){
    for(Dollar d: array){
      d.showBill();
    }
  }
  public static void printOnlyDenominations(Dollar[] array){
    for(int i = 0; i < array.length; i++){
    System.out.print(array[i].getDenomination() + " ")
      }
    System.out.println();
  }
  public static int getTotalAmountInWallet(Dollar [] array){
    int sum = 0;
    for(int i = 0; i < array.length; i++){
      sum += array[i].getDenomination();
    }
    return sum;
  }
}
