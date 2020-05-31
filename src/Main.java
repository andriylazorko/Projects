public class Main {
    public static void main(String[] args) {
        System.out.println("122. Interfaces");
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new MobilPhone(24565);
        //timsPhone.powerOn();\
        timsPhone.callPhone(24565);
        timsPhone.answer();
    }
}
