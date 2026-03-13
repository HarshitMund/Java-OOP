package abstraction;

public class Businessman extends Person implements Richman, SocialWorker {
	
	public void earnMoney() {
        System.out.println("Businessman earning money");
    }

    public void donation() {
        System.out.println("Giving Donation");
    }

    public void party() {
        System.out.println("Businessman doing party");
    }

    public void helpToOthers() {
        System.out.println("Helping others");
    }


}
