package Util;

import Model.Reactor;

import java.util.ArrayList;

public class Repository {
    ArrayList<Reactor> list = new ArrayList<>();

    public void setList(ArrayList<Reactor> list) {
        this.list = list;
    }

    public ArrayList<Reactor> getList() {
        return list;
    }
}
