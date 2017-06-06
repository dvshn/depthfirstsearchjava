package depthfirstsearch;

class DFSApp {
   public static void main(String[] args)
      {
      Graph theGraph = new Graph();
      theGraph.addVertex('A');    
      theGraph.addVertex('B');    
      theGraph.addVertex('C');    
      theGraph.addVertex('D');    
      theGraph.addVertex('E');  
      theGraph.addVertex('F');
      theGraph.addVertex('G');
      theGraph.addVertex('H');
      theGraph.addVertex('I');
      theGraph.addVertex('J');
      theGraph.addVertex('K');
      theGraph.addVertex('L');
      theGraph.addVertex('M');
      theGraph.addVertex('N');
      theGraph.addVertex('O');

      theGraph.addEdge(0, 1);     
      theGraph.addEdge(1, 2);     
      theGraph.addEdge(0, 3);    
      theGraph.addEdge(3, 4);   
      theGraph.addEdge(0, 5);
      theGraph.addEdge(5, 6);
      theGraph.addEdge(0, 7);
      theGraph.addEdge(7, 8);
      theGraph.addEdge(0, 9);
      theGraph.addEdge(9, 10);
      theGraph.addEdge(0, 11);
      theGraph.addEdge(11, 12);
      theGraph.addEdge(0, 13);
      theGraph.addEdge(13, 14);
      

      System.out.print("Visits: ");
      theGraph.dfs();           
      System.out.println();
      }  
   }  