package Transport;

public class WarTransport implements Transport {
    @Override
    public void gas() {
        System.out.println("gas gas gas!!!!!");
    }

    @Override
    public void breaking() {
        System.out.println("Transport stop");
    }

    @Override
    public void light() {
        System.out.println("Tranport light");
    }

    @Override
    public void signal() {
        System.out.println("bip bip!");
    }
}
