package e.user.java;

/**
 * Created by User on 8/11/2560.
 */

public class Edge {

        private int fromNodeIndex;
        private int toNodeIndex;
        private int length;

        public Edge(int fromNodeIndex, int toNodeIndex, int length){
            this.fromNodeIndex = fromNodeIndex;
            this.toNodeIndex = toNodeIndex;
            this.length = length;
        }
        public int getFromNodeIndex(){
            return  fromNodeIndex;
        }
        public int getToNodeIndex(){
            return toNodeIndex;
        }
        public int getLength(){
            return length;
        }

        public int getNeighbouringIndex(int nodeIndex)
        {
            if(this.fromNodeIndex == nodeIndex)
            {
                return this.toNodeIndex
            }
            else {
                return this.fromNodeIndex;
            }
        }


}
