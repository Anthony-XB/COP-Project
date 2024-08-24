import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.xml.stream.events.Characters;

public class Leetcode {
	public static class MinStack {
		List<Integer> elements;
		int minVal = Integer.MAX_VALUE;
		int prevVal = Integer.MAX_VALUE;

		public MinStack() {
			elements = new ArrayList<>();
		}

		public void push(int val) {
			
					
			if (val <= minVal) {
				prevVal = minVal;
				minVal = val;
				
			}
			elements.add(val);	
			
			
		}

		public void pop() {
			int lastMin = elements.lastIndexOf(minVal);
	        int popEle = elements.remove(elements.size() - 1);
					if(popEle == minVal ){
						minVal = prevVal;
					}
					if(popEle == prevVal){
						minVal = lastMin;
					}

		}

		public int top() {
			return elements.get(elements.size() - 1);

		}

		public int getMin() {
			return minVal;
		}

		/**
		 * Your MinStack object will be instantiated and called as such: MinStack obj =
		 * new MinStack(); obj.push(val); obj.pop(); int param_3 = obj.top(); int
		 * param_4 = obj.getMin();
		 */

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final char[][] table = 
//				{{'5','3','.','.','7','.','.','.','.'}, 
//				{'6','.','.','1','9','5','.','.','.'}, 
//				{'.','9','8','.','.','.','.','6','.'},
//				{'8','.','.','.','6','.','.','.','3'} ,
//				{'4','.','.','8','.','3','.','.','1'} ,
//				{'7','.','.','.','2','.','.','.','6'} ,
//				{'.','6','.','.','.','.','2','8','.'} ,
//				{'.','.','.','4','1','9','.','.','5'} ,
//				{'.','.','.','.','8','.','.','7','9'}};
//		
//		System.out.println(validSudoku(table));

//		MinStack minStack = new MinStack();
//		minStack.push(-2);
//		minStack.push(0);
//		minStack.push(-3);
//		minStack.getMin(); // return -3
//		minStack.pop();
//		minStack.top();    // return 0
//		minStack.getMin(); // return -2

		MinStack stack = new MinStack();
		stack.push(0);
		stack.push(1);
		stack.push(0);
		stack.getMin();
		stack.pop();
		stack.getMin();

		System.out.println(stack.getMin());

	}

}

//	private static String boxNumber(int row, int col) {
//		int addToRow = (row % 3 == 0) ? 0 : 1; //1
//		int addToCol = (col % 3 == 0) ? 0 : 1;// 1
//		int boxRow = (row / 3) + addToRow; //2
//		int boxCol = (col / 3) + addToCol; //1
//		
//		return String.valueOf(boxRow) + "," + String.valueOf(boxCol);
//	}
//	
//	public static boolean validSudoku(char[][] board) {
//		
//		Map<String, Set<Character>> seenBefore = new HashMap<>();
//		
//		
//		
//		for(int i = 0; i < board.length; i++) {
//			for(int j = 0; j < board.length; j++) {
//				
//				if(board[i][j] == '.') {
//					continue;
//				}				
//				//row num, column num, box num
//				int currRow = i + 1;
//				int currCol = j + 1;
//				
//				String currBox = boxNumber(currRow, currCol);			
//				Set<Character> rowSet = seenBefore.get("row" + currRow);				
//				if(rowSet == null) {
//					rowSet = new HashSet<Character>();
//					seenBefore.put("row" + currRow,rowSet);
//				}
//				
//				if(!rowSet.add(board[i][j])) {
//					return false;
//				}
//				System.out.println(seenBefore.get("row" + currRow));
//				//col
//				Set<Character> colSet = seenBefore.get("col" + currCol);				
//				if(colSet == null) {
//					colSet = new HashSet<Character>();
//					seenBefore.put("col" + currCol,colSet);
//				}				
//				if(!colSet.add(board[i][j])) {
//					return false;
//				}
//				//box
//				Set<Character> boxSet = seenBefore.get("box" + currBox);				
//				if(boxSet == null) {
//					boxSet = new HashSet<Character>();
//					seenBefore.put("box" + currBox,boxSet);
//				}				
//				if(!boxSet.add(board[i][j])) {
//					return false;
//				}
//				
//				
//			}
//			
//		}
//		return true;
//		
//	}
