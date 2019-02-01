
public class CloneTestMain
{
	public static void main(String[] args)
	{
		CloneFactory animalMake = new CloneFactory();
		Sheep dolly = new Sheep();
		
		Sheep clonedSheep = (Sheep) animalMake.getClone(dolly);
		
		System.out.println(dolly);
		
		System.out.println(clonedSheep);
	}
}