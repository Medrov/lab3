package Util;

import Reader.*;
import Model.Reactor;

import java.io.File;
import java.util.ArrayList;
import java.util.Map;

public class Manager {

    Repository repository = new Repository();
    private Aggregator aggregator = new Aggregator();
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

    public void readDatabase() {
        DatabaseReader reader = new DatabaseReader();
        if (repository.getReactorTypes() != null) {
            repository.setReactors(reader.readDB(repository.getReactorTypes()));
            aggregator.calculateFuelLoad(repository.getReactors());
        } else {
            System.out.println("Сначала прочитайте типы реакторов!");
        }
    }
    public Map<String, Map<Integer, Double>> aggregateByOperator() {
        if (repository.getReactors() != null) {
            return aggregator.aggregateByOperator(repository.getReactors());
        } else {
            System.out.println("Сначала прочитайте БД!");
            return null;
        }
    }
    public Map<String, Map<Integer, Double>> aggregateByCountry() {
        if (repository.getReactors() != null) {
            return aggregator.aggregateByCountry(repository.getReactors());
        } else {
            System.out.println("Сначала прочитайте БД!");
            return null;
        }
    }
    public Map<String, Map<Integer, Double>> aggregateByRegion() {
        if (repository.getReactors() != null) {
            return aggregator.aggregateByRegion(repository.getReactors());
        } else {
            System.out.println("Сначала прочитайте БД!");
            return null;
        }
    }

}
