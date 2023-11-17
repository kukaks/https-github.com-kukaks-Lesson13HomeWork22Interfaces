package claseS;


import interfacess.Smartphones;
import interfacess.iOS;

public class iPhones implements Smartphones, iOS {
    @Override
    public void call() {
        System.out.println("Making a call from an iPhone.");
    }

    @Override
    public void sms() {
        System.out.println("Sending an SMS from an iPhone.");
    }

    @Override
    public void internet() {
        System.out.println("Browsing the internet on an iPhone.");
    }

    @Override
    public void useFaceID() {
        System.out.println("Using Face ID on an iPhone.");
    }
}
