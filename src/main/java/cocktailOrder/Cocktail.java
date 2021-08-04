package cocktailOrder;

public class Cocktail {

	
	public String cocktailName;
	public String theBase;
	public String theModifier;
	public String theFlavouring;
	public double theCost;
	public boolean fancyGlass;
	
	public Cocktail(String cocktailName, String theBase, String theModifier, String theFlavouring, double theCost,
			boolean fancyGlass) {
		super();
		this.cocktailName = cocktailName;
		this.theBase = theBase;
		this.theModifier = theModifier;
		this.theFlavouring = theFlavouring;
		this.theCost = theCost;
		this.fancyGlass = fancyGlass;
	}
	

	
	
}
