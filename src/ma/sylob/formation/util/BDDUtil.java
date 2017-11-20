package ma.sylob.formation.util;

import java.util.ArrayList;
import java.util.List;

import ma.sylob.formation.models.Fruit;

public class BDDUtil {

	private static BDDUtil instance;
	private List<Fruit> listFruit;
	public static synchronized BDDUtil getInstance(){
		if(BDDUtil.instance == null){
			BDDUtil.instance = new BDDUtil();
		}
		return BDDUtil.instance;
	}
	private BDDUtil() {
		super();
		this.listFruit = new ArrayList<>();
		this.listFruit.add(new Fruit("12","Pomme","ffefefdsjnf"));
		this.listFruit.add(new Fruit("15","Banane","ffefefdsjnf"));
		this.listFruit.add(new Fruit("17","Orange","ffefefdsgdvcdff"));
	}
	public List<Fruit> getListFruit() {
		return listFruit;
	}
	public void setListFruit(List<Fruit> listFruit) {
		this.listFruit = listFruit;
	}

}
