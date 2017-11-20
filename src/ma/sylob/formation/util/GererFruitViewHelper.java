package ma.sylob.formation.util;


public class GererFruitViewHelper {
	
private static GererFruitViewHelper instance;

public static synchronized GererFruitViewHelper getInstance(){
	if(GererFruitViewHelper.instance == null){
		GererFruitViewHelper.instance = new GererFruitViewHelper();
	}
	return GererFruitViewHelper.instance;
}

private GererFruitViewHelper() {
	super();
}

}
