package org.example;

import java.util.Random;

public class Company {

    private final Random random = new Random();

    Publisher jobAgency;

    private final String name;

    private final int maxSalary;
    private final JobVacancyType jobVacancyType;

    public Company(Publisher jobAgency, String name, int maxSalary, JobVacancyType jobVacancyType) {
        this.jobAgency = jobAgency;
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobVacancyType = jobVacancyType;
    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary,jobVacancyType);
    }

}
