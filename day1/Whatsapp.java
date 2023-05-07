package week1.day1;

public class Whatsapp {
	
	public void makeCall(){
		System.out.println("Calling");
	}
	public void makeVideoCall(){
		System.out.println("Video Calling");
	}
	public void chat(){
		System.out.println("Chating");
	}
	public void makePayment(){
		System.out.println("Paying");
	}
	public void statusUpload(){
		System.out.println("Status uploading");
	}


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Whatsapp features=new Whatsapp();
		features.makeCall();
		features.makePayment();
		features.chat();
		features.makeVideoCall();
	}

	
	
	
	
}
