package Transport;

public class SocialTransport implements Transport {
    @Override
    public void gas() {
        System.out.println("Social! gas gas gas!!!!!");
    }

    @Override
    public void breaking() {
        System.out.println("Social Transport stop");
    }

    @Override
    public void light() {
        System.out.println("Social Tranport light");
    }

    @Override
    public void signal() {
        System.out.println("Social bip bip!");
    }
}
