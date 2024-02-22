package dsa.graph;

import java.util.Scanner;

public class AdjencyMatrix {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Size of the matrix:");
        int n=kb.nextInt();
        int [] [] adjMat=new int [n][n];
        for(int i=0;i<adjMat.length;i++){
            for(int j=0;j< adjMat.length;j++){
                System.out.print("Is [V"+(i+1)+"] Connected to [V"+(j+1)+"] :");
                String input=kb.next();
                adjMat[i][j]=input.equalsIgnoreCase("yes")?1:0;
            }
        }
        System.out.println("Adjacency Matrix is");
        for(int i=0;i<adjMat.length;i++){
            for(int j=0;j< adjMat.length;j++) {
                System.out.print(adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
