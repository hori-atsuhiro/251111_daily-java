package day08.q02;

public class Sorcerer extends Magic {

	public Sorcerer(String name) {
		super(name);
	}

	@Override
	public void attack(int mp, Monster monster) {
		super.attack(mp, monster);
		int adddamege = (int)(mp * 0.5);
		System.out.println("追加で" + adddamege + "のダメージを与えた。");
		monster.setHp(monster.getHp()-adddamege);
	}

		
	
	}

