package Util;

import Model.Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Aggregator {
    Map<String, Map<Integer, Double>> aggregateByOperator(ArrayList<Database> reactors) {
        Map<String, Map<Integer, Double>> map = new HashMap<>();
        for (Database reactor : reactors) {
            if (map.containsKey(reactor.getOperator())) {
                Map<Integer, Double> fuelLoad = map.get(reactor.getOperator());
                for (int year = 2014; year < 2025; year++) {
                    fuelLoad.put(year, reactor.getFuelLoad().get(year) + fuelLoad.get(year));
                }
            } else {
                map.put(reactor.getOperator(), new HashMap<>());
                Map<Integer, Double> fuelLoad = map.get(reactor.getOperator());
                fuelLoad.putAll(reactor.getFuelLoad());
            }
        }
        return map;
    }

    Map<String, Map<Integer, Double>> aggregateByCountry(ArrayList<Database> reactors) {
        Map<String, Map<Integer, Double>> map = new HashMap<>();
        for (Database reactor : reactors) {
            if (map.containsKey(reactor.getCountry())) {
                Map<Integer, Double> fuelLoad = map.get(reactor.getCountry());
                for (int year = 2014; year < 2025; year++) {
                    fuelLoad.put(year, reactor.getFuelLoad().get(year) + fuelLoad.get(year));
                }
            } else {
                map.put(reactor.getCountry(), new HashMap<>());
                Map<Integer, Double> fuelLoad = map.get(reactor.getCountry());
                fuelLoad.putAll(reactor.getFuelLoad());
            }
        }
        return map;
    }

    Map<String, Map<Integer, Double>> aggregateByRegion(ArrayList<Database> reactors) {
        Map<String, Map<Integer, Double>> map = new HashMap<>();
        for (Database reactor : reactors) {
            if (map.containsKey(reactor.getRegion())) {
                Map<Integer, Double> fuelLoad = map.get(reactor.getRegion());
                for (int year = 2014; year < 2025; year++) {
                    fuelLoad.put(year, reactor.getFuelLoad().get(year) + fuelLoad.get(year));
                }
            } else {
                map.put(reactor.getRegion(), new HashMap<>());
                Map<Integer, Double> fuelLoad = map.get(reactor.getRegion());
                fuelLoad.putAll(reactor.getFuelLoad());
            }
        }
        return map;
    }
    public void calculateFuelLoad(ArrayList<Database> reactors) {
        for (Database reactor : reactors) {
            int year = 2014;
            while (year < 2025) {
                double fuelLoad = 0;
                if (reactor.getLoadFactor().containsKey(year)) {
                    fuelLoad = reactor.getThermalCapacity() * reactor.getLoadFactor().get(year) / 100;
                } else if (reactor.getShutdownYear() >= year & reactor.getConnectionYear() <= year) {
                    fuelLoad = reactor.getThermalCapacity() * 85 / 100;
                }
                reactor.getFuelLoad().put(year, fuelLoad);
                year++;
            }
        }
    }
}
