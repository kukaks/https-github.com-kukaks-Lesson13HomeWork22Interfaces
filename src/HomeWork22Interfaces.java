import claseS.Androids;
import claseS.iPhones;
import interfacess.LinuxOS;
import interfacess.Smartphones;
import interfacess.iOS;

public class HomeWork22Interfaces {
    public static void main(String[] args) {

        Smartphones samungC300 = new Androids();
        samungC300.call();
        samungC300.sms();
        samungC300.internet();

        Smartphones iPhoneXX = new iPhones();
        iPhoneXX.call();
        iPhoneXX.sms();
        iPhoneXX.internet();


        Androids androidOnePlus = new Androids();
        androidOnePlus.call();
        androidOnePlus.sms();
        androidOnePlus.internet();
        androidOnePlus.runLinuxCommands();

        iPhones iPhoneDevice = new iPhones();
        iPhoneDevice.call();
        iPhoneDevice.sms();
        iPhoneDevice.internet();
        iPhoneDevice.useFaceID();

        LinuxOS linuxDevice = new Androids();
        linuxDevice.runLinuxCommands();


        iOS iosDevice = new iPhones();
        iosDevice.useFaceID();
    }
}
