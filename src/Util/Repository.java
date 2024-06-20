package Util;

import Model.Database;
import Model.Reactor;

import java.util.ArrayList;

public class Repository {
    ArrayList<Reactor> list = new ArrayList<>();
    private ArrayList<Database> reactors;
    public ArrayList<Database> getReactors() {
        return reactors;
    }
    public void setReactors(ArrayList<Database> reactors) {
        this.reactors = reactors;
    }
    public void setList(ArrayList<Reactor> list) {
        this.list = list;
    }
    public ArrayList<Reactor> getReactorTypes() {
        return list;
    }

    public ArrayList<Reactor> getList() {
        return list;
    }
}
