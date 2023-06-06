public class CellphoneMain {
    public static void main(String[] args){
        Cellphone cp = new Cellphone("Ipon", "Pro");
        cp.volumeUp();
		cp.powerOn();
		System.out.println("Volume : "+cp.getVolume());
		cp.volumeUp();
		cp.volumeUp();
		cp.volumeUp();
		cp.volumeDown();
		System.out.println("Volume : "+cp.getVolume());
		System.out.println("Battery : "+cp.batteryLevel);
		cp.topUpPulsa(55000);
		System.out.println("Pulsa : "+cp.getPulsa());
		cp.addContact("Tono","0856123321");
		cp.addContact("Tunu","0856321123");
		cp.addContact("Tini","0856121314");
		cp.showContact();
		cp.findContact("Tini");
        cp.powerOff();
    }
}