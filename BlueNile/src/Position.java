
public class Position {
	private int y;
	private int x;
	protected Position(int y, int x) {
		super();
		this.y = y;
		this.x = x;
	}
	public Position up_left() {
		if((y == 0) || (y==1 && x==0) || (y==2 && x==0) || (y==3 && x==0) || (y==4 && x==0)) 
		{
			return null;
		}
		if(y>5)
		{
			return new Position(y-1, x);
		}
		if(y<6)
		{
			return new Position(y-1, x-1);
		}
		return null;
	}
	
	public Position up_right() {
		if((y==0) || (y==1 && x==6) || (y==2 && x==7) || (y==3 && x==8) || (y==4 && x==9)) 
		{
			return null;
		}
		if(y>5)
		{
			return new Position(y-1, x+1);
		}
		if(y<6)
		{
			return new Position(y-1, x);
		}
		return null;
	}
	
	public Position left() {
		if(x>0) {
			return new Position(x-1,y);
		}
		return null;
	}
	
	public Position right() {
		if((y==0 && x<5) || (y==1 && x<6) || (y==2 && x<7) || (y==3 && x<8) || (y==4 && x<9) || 
				(y==5 && x<8) || (y==6 && x<7) || (y==7 && x<6) || (y==8 && x<5)) {
			return null;
		}
		
		return new Position(x+1,y);
	}
	
	public Position down_left() {
		if((y==8) || (y==7 && x==0) || (y==6 && x==0) || (y==5 && x==0) || (y==4 && x==0))  
		{
			return null;
		}
		if(y<4)
		{
			return new Position(y+1, x);
		}
		if(y>3)
		{
			return new Position(y+1, x-1);
		}
		return null;
	}
	
	public Position down_right() {
		if((y==8) || (y==7 && x==6) || (y==6 && x==7) || (y==5 && x==8) || (y==4 && x==9))  
		{
			return null;
		}
		if(y<4)
		{
			return new Position(y+1, x+1);
		}
		if(y>3)
		{
			return new Position(y+1, x);
		}
		return null;
	}
}
