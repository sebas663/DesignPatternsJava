package example.facade.bank;


public class SecurityCodeCheck {

    private int securityCode = 1234;

    public int getSecurityCode() { return securityCode; }

    public boolean isCodeCorrect(int securityCode){

        if(securityCode == getSecurityCode()) {
            return true;
        } else {
            return false;
        }
    }
}
