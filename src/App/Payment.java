package App;

import App.methods.MonthPayment;
import App.methods.OverPayment;
import App.methods.TotalAmount;

import java.util.Scanner;

public abstract class Payment implements MonthPayment, OverPayment, TotalAmount {
    public int creditAmount;
    public double percent;
    public int month;

    public Payment(){}

    public Payment(int creditAmount, double percent, int month) {
        this.creditAmount = creditAmount;
        this.percent = percent;
        this.month = month;
    }

    public void enterValues(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Введите сумму кредита:");
        creditAmount = scanner.nextInt();
        System.out.println("Введите процентную ставку:");
        percent = scanner.nextDouble();
        System.out.println("Введите количество месяцев :");
        month = scanner.nextInt();
    }

    @Override
    public void monthCounting() {
        //
    }

    @Override
    public void overPaymentCounting() {
        //
    }

    @Override
    public void totalAmountCounting() {
        //
    }
}
