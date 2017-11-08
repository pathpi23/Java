package e.user.java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EdgeEffect;

import java.util.ArrayList;



public class Node {
    private int distanceFromSource = Integer.MAX_VALUE;

    private boolean visited;

    private ArrayList<Edge> edges = new ArrayList<Edge>();

    public int getDistanceFromSource(){
        return distanceFromSource;
    }
    public void setDistanceFromSource(int distanceFromSource){
        this.distanceFromSource = distanceFromSource;
    }
    public boolean isVisited(){
        return visited;
    }
    public void setVisited(boolean visited){
        this.visited = visited;
    }


}