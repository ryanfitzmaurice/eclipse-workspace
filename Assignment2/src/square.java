public class square
{
	private int sideLength;
	private int area;
/**
 * Square to square - syntax error
 * @param initialLength
 */
	public square(int initialLength)
	{
		sideLength = initialLength;
		area = sideLength * sideLength;
	}

	public int area(){ return area;}
	public void grow(){ sideLength = 2* sideLength;}
	}
