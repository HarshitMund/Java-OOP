package abstraction;

public class TestBusinessman {

	public static void main(String[] args) {

		Richman rm = new Businessman();
        rm.earnMoney();
        rm.donation();
        rm.party();

        SocialWorker sw = new Businessman();
        sw.helpToOthers();

        Businessman bm = new Businessman();
        bm.earnMoney();
        bm.donation();
        bm.party();
        bm.helpToOthers();

	}

}
