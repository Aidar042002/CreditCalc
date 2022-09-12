package App;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Программа вычисляет ежемесячную плату при выборе кредита.");
        System.out.println("Выберите тип кредита '1'(аннуитетный) или '2'(дифференцированный):");
        Scanner scanner = new Scanner(System.in);
        int choise = scanner.nextInt();
        if (choise == 1){
            Annuitet annuitet = new Annuitet();
            annuitet.enterValues();
            annuitet.startAnnuitet();
        } else if(choise == 2){

        } else{
            System.out.println("Такого типа нет.Программа закончена.");
            System.exit(0);
        }
    }
}
