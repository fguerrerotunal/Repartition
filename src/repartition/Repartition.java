package repartition;
import java.util.*;
public class Repartition {
    public static void main(String[] args) {

        Vector<int[]> tiles = new Vector();
        
        for (int i = 6; i>=0; i--) {
            for(int j=i;j>=0;j--){
                int[] tile = new int[2];
                tile[0] = i;tile[1] = j;
                tiles.add(tile);
            }
        }         
        Random randomTile = new Random();
        while(tiles.size()>0){
            int numberRandomTile = randomTile.nextInt(tiles.size());
            int[] tempTile = tiles.get(numberRandomTile);
            tiles.removeElement(tiles.get(numberRandomTile));
            System.out.println("funciona");
        }
        
        
    }
     
}
