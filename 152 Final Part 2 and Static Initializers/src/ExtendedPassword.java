public class ExtendedPassword extends Password{
    private int decryptedPassword;

    public ExtendedPassword(int password) {
        super(password);
        this.decryptedPassword=password;
    }



    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
