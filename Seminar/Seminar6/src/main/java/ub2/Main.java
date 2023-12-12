package ub2;

public class Main {
    public static void main(String[] args) {
        VGAMonitor vgaMonitor = new VGAMonitor();
        HDMIMonitor hdmiMonitor = new HDMIMonitor();

        VGAToHDMIAdapter adapter = new VGAToHDMIAdapter(hdmiMonitor);
        Computer computer = new Computer(adapter);
        computer.display();
    }
}
