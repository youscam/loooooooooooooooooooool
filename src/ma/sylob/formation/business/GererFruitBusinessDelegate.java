package ma.sylob.formation.business;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import ma.sylob.formation.models.Fruit;
import ma.sylob.formation.util.BDDUtil;

public class GererFruitBusinessDelegate {

	private static GererFruitBusinessDelegate instance;
	private BDDUtil bDDUtil;
	
	public static synchronized GererFruitBusinessDelegate getInstance(){
		if(GererFruitBusinessDelegate.instance == null){
			GererFruitBusinessDelegate.instance = new GererFruitBusinessDelegate();
		}
		return GererFruitBusinessDelegate.instance;
	}
	private GererFruitBusinessDelegate() {
		super();
		this.bDDUtil = BDDUtil.getInstance();

	}
	public List<Fruit> getListFruit() {
		return bDDUtil.getListFruit();
	}
	
	public void DeleteFruit(String fruitId){
		this.bDDUtil.getListFruit().listIterator();
		Iterator<Fruit> iterator = this.bDDUtil.getListFruit().listIterator();
		while(iterator.hasNext())
		{
		    String id = iterator.next().getId();
		    if (fruitId.equals(id))
		    {
		        iterator.remove();
		        break;
		    }
		}
	}
	public void setListFruit(List<Fruit> listFruit) {
		this.bDDUtil.setListFruit(listFruit);
	}
}
