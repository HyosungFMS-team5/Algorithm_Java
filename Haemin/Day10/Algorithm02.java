package f0318;

import java.io.IOException;
import java.lang.reflect.Array;

import javax.annotation.processing.AbstractProcessor;

// 색칠하기
/*
 * 00000
 * 00110
 * 
 * 결과
 * 22222
 * 22112
 */
public class Algorithm02 {
	static final int Size = 5;
	static final int color = 2;
	
	static int [][] map = {
			{0,0,0,0,0},
			{0,0,1,1,0},
			{0,0,0,0,1},
			{0,0,0,0,0},
			{0,0,1,0,0}
	};
	
	public static void color(int x, int y) {
		if(map[x][y] != 1)
			map[x][y] = color;
		
		if(x-1 >= 0 && map[x-1][y] != color && map[x][y] !=1)
			color(x-1,y);
		
		if(x+1 <= Size-1 && map[x+1][y] != color && map[x+1][y] !=1)
			color(x+1,y);
		
		if(y+1 <= Size-1 && map[x][y+1] != color && map[x][y+1] !=1)
			color(x,y+1);
		
		if(y-1 >= 0 && map[x][y-1] != color && map[x][y-1] !=1)
			color(x,y-1);
		
	}
	
	public static void main(String[] args) throws IOException {
		for(int i =0; i < Size; i++) {
			for(int j = 0; j < Size; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		
		color(0,0);
		
		for(int i = 0; i < Size; i++) {
			for(int j = 0; j < Size; j++) {
				System.out.println(map[i][j] + " ");
			}
			System.out.println();
		}
	}


}
