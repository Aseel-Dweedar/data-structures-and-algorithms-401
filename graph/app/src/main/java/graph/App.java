
package graph;

public class App {

    public static void main(String[] args) {

        Graph myGraph = new Graph();
        myGraph.addNode("8");
        myGraph.addNode("1");
        myGraph.addNode("2");
        myGraph.addNode("9");
        myGraph.addNode("7");
        myGraph.addNode("5");
        myGraph.addEdge("8" , "1" , 50);
        myGraph.addEdge("5" , "1" , 70);
        myGraph.addEdge("7" , "5", 20);
        myGraph.addEdge("8" , "9", 100);
        myGraph.addEdge("8" , "2", 40);
        String[] trip = {"8" , "1" , "5"};
        String[] trip2 = {"8" , "5"};
        String[] trip3 = {"8" , "1" , "5" , "7" , "5" , "1" , "8" , "9"};
        String[] trip4 = {"8" , "9" , "5" };
        String[] trip5 = {"8"};
        String[] trip6 = {"8" , "2"};
//        System.out.println(myGraph);
//        System.out.println(myGraph.getNodes());
//        System.out.println(myGraph.getNeighbors("8"));
//        System.out.println(myGraph.getNeighbors("7"));
//        System.out.println(myGraph.getNeighbors("5"));
//        System.out.println(myGraph.size());
//        System.out.println(myGraph.breadthFirst("8"));
//        System.out.println(myGraph.weightList);
//        System.out.println(myGraph.breadthFirst("7"));
//        System.out.println(myGraph.breadthFirst("5"));
        System.out.println(myGraph.businessTrip("8",trip));
        System.out.println(myGraph.businessTrip("8",trip2));
        System.out.println(myGraph.businessTrip("8",trip3));
        System.out.println(myGraph.businessTrip("8",trip4));
        System.out.println(myGraph.businessTrip("8",trip5));
        System.out.println(myGraph.businessTrip("8",trip6));
    }
}
