public class rival extends Room
{
	Runner cla = new Runner();
	
	public rival(int x, int y) 
	{
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	
	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	}

