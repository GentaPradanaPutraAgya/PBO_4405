import java.util.ArrayList;

public class Cellphone implements Phone{
	ArrayList<Contact> contact;
    String merek;
    String type;
	int pulsa = 0;
    int batteryLevel;
    int status;
    int volume;

    public Cellphone(String merek,String type)
    {
        this.merek = merek;
        this.type = type;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);
		this.contact = new ArrayList<>();
    }

	public boolean isOn(){
		if(this.status==1)
			return true;
		else{
			System.out.println("HP Belum Dihidupkan.");
			return false;
		}
	}

    public void powerOn(){
        this.status = 1;
        System.out.println("HP Hidup");
    }
    
    public void powerOff(){
        this.status = 0;
        System.out.println("HP mati");
    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("HP Mati: Tidak Bisa VolumeUp");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown(){
        if(this.status == 0){
            System.out.println("HP Mati: Tidak Bisa VolumeUp");
        }
        else
        {
            this.volume--;
            if(this.volume<=0)
            {
                this.volume = 0;
            }
        }
    }

    public int getVolume(){
		if(isOn())
			return this.volume;
		else{
			return 0;
		}
    }
	
	public void topUpPulsa(int val){
		if(isOn())
			this.pulsa += val;
		
	}
	
	public int getPulsa(){
		if(isOn())
			return this.pulsa;
		else{
			return 0;
		}
	}
	
	public void addContact(String nama, String nomor){
		if(isOn()){
			contact.add(new Contact(nama,nomor));
		}
	}
	
	public void showContact(){
		if(isOn()){
			if(contact.isEmpty()){
				System.out.println("Kontak Kosong.");
			} else{
				System.out.println("-----> List Kontak <-----");
				for(int i=0; i<contact.size();i++){
					Contact kt = contact.get(i);
					System.out.println((i+1)+". "+kt.nama+" - "+kt.nomor);
				}
			}
		}
	}
	
	public void findContact(String nama){
		if(isOn()){
			if(contact.isEmpty()){
				System.out.println("Kontak Kosong.");
			} else{
				System.out.println("Cari Kontak Menggunakan Nama "+nama+"...");
				String nama2 = nama.toLowerCase();
				boolean found = false;
				int count = 1;
				for(int i=0; i<contact.size();i++){
					Contact kt = contact.get(i);
					if(kt.nama.toLowerCase().equals(nama2)){
						System.out.println(kt.nama+" - "+kt.nomor);
						found = true;
						count++;
					}
				}
				if(!found)
					System.out.println("Kontak Dengan Nama "+nama+" Tidak Ditemukan...");
			}
		}
	}
	
}