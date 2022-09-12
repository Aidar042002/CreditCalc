package App;

public class Annuitet extends Payment{
    public Annuitet(){}
    public Annuitet(int creditAmount, double percent, int month) {
        super(creditAmount, percent, month);
    }

    @Override
    public void monthCounting() {
         double c = (creditAmount * ((percent / 100 / 12) + (
                        (percent / 100 / 12) / (Math.pow(1+percent/100/12,month-1)))));
        System.out.println("Ежемесячный платеж равен:"+c);
    }

    @Override
    public void overPaymentCounting() {
        double c = 0;
        c =  ((creditAmount * ((percent / 100 / 12) + (
                (percent / 100 / 12) / (Math.pow(1+percent/100/12,month-1)))))*month) - creditAmount;
        System.out.println("Переплата:" + c);
    }

    @Override
    public void totalAmountCounting() {
        double c= (creditAmount * ((percent / 100 / 12) + (
                (percent / 100 / 12) / (Math.pow(1+percent/100/12,month-1)))))*month;
        System.out.println("Общая сумма выплат:" + c);
    }

    public  void startAnnuitet(){
        monthCounting();
        totalAmountCounting();
        overPaymentCounting();
    }
}
