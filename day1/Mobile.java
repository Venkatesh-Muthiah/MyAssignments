package week1.day1;

public class Mobile {
		
		public void makeCall(){
			System.out.println("Calling");
		}
		public void makePayment(){
			System.out.println("Paying");
		}
		public void placeOrder(){
			System.out.println("Ordering");
		}
		public void shareDocument() {
			System.out.println("Document sharing");
		}
		public void takePhoto(){
			System.out.println("Capturing");
		}
		public void playMusic(){
			System.out.println("Playing");
		}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			Mobile features=new Mobile();
			features.makeCall();
			features.makePayment();
			features.placeOrder();
			features.takePhoto();
			features.shareDocument();
			features.playMusic();
		}
}
		
		