package ub2;

public class VGAMonitor implements VGAPort{
    @Override
    public void connectVGA() {
        System.out.println("VGAMonitor connected to VGAPort");
    }
}
