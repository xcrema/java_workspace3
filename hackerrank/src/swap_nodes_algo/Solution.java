package swap_nodes_algo;
import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the swapNodes function below.
     */
    static int[][] swapNodes(int[][] indexes, int[] queries) {
       
    	for(int i=0; i<queries.length; i++) {
    		//swapNodesAtDepth(indexes, queries[i]);
    		//if(queries[i][0] != 0)
    	}
    	return indexes;
    }
    	
    private static void swapNodesAtDepth(int[][] indexes, int query) {
		// TODO Auto-generated method stub
    	if(query == 1) {
    		
    	}
		
	}

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scanner.nextLine().trim());

        int[][] indexes = new int[n][2];

        for (int indexesRowItr = 0; indexesRowItr < n; indexesRowItr++) {
            String[] indexesRowItems = scanner.nextLine().split(" ");

            for (int indexesColumnItr = 0; indexesColumnItr < 2; indexesColumnItr++) {
                int indexesItem = Integer.parseInt(indexesRowItems[indexesColumnItr].trim());
                indexes[indexesRowItr][indexesColumnItr] = indexesItem;
            }
        }

        int queriesCount = Integer.parseInt(scanner.nextLine().trim());

        int[] queries = new int[queriesCount];

        for (int queriesItr = 0; queriesItr < queriesCount; queriesItr++) {
            int queriesItem = Integer.parseInt(scanner.nextLine().trim());
            queries[queriesItr] = queriesItem;
        }

        int[][] result = swapNodes(indexes, queries);

        for (int resultRowItr = 0; resultRowItr < result.length; resultRowItr++) {
            for (int resultColumnItr = 0; resultColumnItr < result[resultRowItr].length; resultColumnItr++) {
                //bufferedWriter.write(String.valueOf(result[resultRowItr][resultColumnItr]));
            	System.out.print(String.valueOf(result[resultRowItr][resultColumnItr]));

                if (resultColumnItr != result[resultRowItr].length - 1) {
                    //bufferedWriter.write(" ");
                	System.out.print(" ");
                }
            }

            if (resultRowItr != result.length - 1) {
                //bufferedWriter.write("\n");
            	System.out.print("\n");
            }
        }

        //bufferedWriter.newLine();

        //bufferedWriter.close();
    }
}
