import java.util.Arrays;

public class Position {
	public boolean grid[][];
	
	protected Position(boolean[][] grid) {
		super();
		this.grid = grid;
	}
	
	public int close() {
		int val = 0;
		for(int i = 0; i < 5 ; i++) {
			for(int j = 0; j < 5; j++)
			{
				if(grid[i][j] == false)
					val++;
			}
		}
		return val;
	}
	
	public Position zerozero() {
		int x = 0;
		int y = 0;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	public Position zeroone() {
		int x = 0;
		int y = 1;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	public Position zerotwo() {
		int x = 0;
		int y = 2;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	public Position onezero() {
		int x = 1;
		int y = 0;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	public Position oneone() {
		int x = 1;
		int y = 1;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	public Position onetwo() {
		int x = 1;
		int y = 2;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	public Position twozero() {
		int x = 2;
		int y = 0;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	public Position twoone() {
		int x = 2;
		int y = 1;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	public Position twotwo() {
		int x = 2;
		int y = 2;
		grid[x][y] = !grid[x][y];
		if(!(x-1<0))
			grid[x-1][y] = !grid[x-1][y];
		if(!(x+1>5))
			grid[x+1][y] = !grid[x+1][y];
		if(!(y-1<0))
			grid[x][y-1] = !grid[x][y-1];
		if(!(y+1>5))
			grid[x][y+1] = !grid[x][y+1];
		return new Position(grid);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.deepHashCode(grid);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Position other = (Position) obj;
		if (!Arrays.deepEquals(grid, other.grid))
			return false;
		return true;
	}
	
}
