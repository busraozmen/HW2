package edu.bim313;

/**
 * Created by Pc on 5.12.2016.
 */

import java.util.List;

public class Route {

    private List<Integer> list;

    public Route(List<Integer> list) {
        this.list = list;
    }

    public int distance() {
        int d = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i != list.size() - 1) d += TurkishNetwork.distance[list.get(i)][list.get(i + 1)];
            else d += TurkishNetwork.distance[list.get(0)][list.get(list.size() - 1)];
        }
        return d;
    }

    public String toString() {
        String result = distance() + "km:";
        for (int i = 0; i < list.size(); i++) {
            result += TurkishNetwork.cities[list.get(i)] + "->";
            if (i == list.size() - 1) result += TurkishNetwork.cities[list.get(0)];
        }
        return result;
    }
}