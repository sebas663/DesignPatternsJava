package example.facade.bank;


public class Client {

    public static void main(String[] args) {

        BankFacade accesingBank = new BankFacade(1234567890, 1234);

        accesingBank.withdrawCash(50.00);
        accesingBank.withdrawCash(900.00);
        accesingBank.depositCash(200.00);

        accesingBank.withdrawCash(900.00);

    }
}
