package Inheritance;

public class WhatsAppTest {

	public static void main(String[] args) {
		WhatsAppVe002 WA=new WhatsAppVe002();
		System.out.println(WA.version);
		System.out.println(WA.name);
		WA.WhatsAppVersion();
		WA.voiceCall();
		WA.chat();
		WA.groupCreate();
	}

}
