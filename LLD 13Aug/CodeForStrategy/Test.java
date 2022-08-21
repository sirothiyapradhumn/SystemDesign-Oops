package CodeForStrategy;

import CodeForStrategy.Kicks.NoKick;
import CodeForStrategy.Kicks.RoundHouseKick;
import CodeForStrategy.Punches.HookPunch;
import CodeForStrategy.Punches.NoPunch;
import CodeForStrategy.Wrestle.NoWrestle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter o1 = new Fighter();

    	o1.kb = new RoundHouseKick();
		o1.wb = new ChokeMove();
		o1.pb = new NoPunch();
		
		o1.fight();
	}

}