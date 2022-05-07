
public class NumOfSides {
	
	private int numSides;
	private int overflow;
	private int underflow;
	
	public int getnumSides()
	{return numSides;}
	
	public void setnumSides(String numSidesIn)
	{numSides = Integer.parseInt(numSidesIn);}
	
	public void resetnumSides()
	{numSides = 0;}
	
	public void plusNumberofsides()
	{numSides +=1;}
	
	public void minusNumberofsides()
	{numSides -=1;}

	public void resetOverflow()
	{overflow = 8;}
	
	public int  getOverflow()
	{overflow+=1;
	return overflow;}
	
	public void resetUnderflow()
	{underflow = 4;}
	
	public int  getUnderflow()
	{underflow-=1;
	return underflow;}
}
