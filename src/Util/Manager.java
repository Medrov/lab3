package Util;

import Reader.FileReader;
import Reader.JSONReader;
import Reader.XMLReader;
import Reader.YAMLReader;
import Model.Reactor;

import java.io.File;
import java.util.ArrayList;

public class Manager {

    Repository repository = new Repository();
    FileReader XMLfilereader = new XMLReader();

    public Manager() {
        FileReader YAMLfilereader = new YAMLReader();
        FileReader JSONfilereader = new JSONReader();
        XMLfilereader.setNextReader(YAMLfilereader);
        YAMLfilereader.setNextReader(JSONfilereader);
    }

    public void setList(File file) {
        repository.setList(XMLfilereader.read(file));
        for (Reactor reactor : repository.getList()){
            reactor.setParameters();
        }
    }

    public ArrayList<Reactor> getList() {
        return repository.getList();
    }

}
