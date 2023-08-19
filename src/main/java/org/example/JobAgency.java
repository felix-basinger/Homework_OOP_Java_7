package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Агенство занимается поиском сотрудников
 */
public class JobAgency implements Publisher {


    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(String companyName, int salary, JobVacancyType jobVacancyType) {
        for (Observer observer : observers){
            observer.receiveOffer(companyName, salary, jobVacancyType);
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
}
