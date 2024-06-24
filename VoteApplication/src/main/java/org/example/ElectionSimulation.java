package org.example;

import java.util.ArrayList;
import java.util.List;

public class ElectionSimulation {
    public static void main(String[] args) {
        List<Voter> voters = generateVoters(100);
        SamplingContext context = new SamplingContext();


        context.setStrategy(new SimpleRandomSampling());
        List<Voter> randomSamples = context.executeStrategy(voters, 10);
        OutputFormatter randomFormatter = new OutputFormatter(new TSVOutputAdapter());
        System.out.println("Simple Random Sampling :\n" + randomFormatter.format(randomSamples));

        context.setStrategy(new IntervalSampling());
        List<Voter> intervalSamples = context.executeStrategy(voters, 10);
        OutputFormatter intervalFormatter = new OutputFormatter(new JSONToTSVAdapterInterval());
        System.out.println("Interval Sampling:\n" + intervalFormatter.format(intervalSamples));

        context.setStrategy(new StratifiedSampling());
        List<Voter> stratifiedSamples = context.executeStrategy(voters, 10);
        OutputFormatter stratifiedFormatter = new OutputFormatter(new JSONToTSVAdapterStratified());
        System.out.println("Stratified Sampling :\n" + stratifiedFormatter.format(stratifiedSamples));
    }

    public static List<Voter> generateVoters(int numberOfVoters) {
        List<Voter> voters = new ArrayList<>();
        String[] cities = {"İzmir", "İstanbul", "Ankara"};
        String[] parties = {"A", "B", "C"};
        int currentId = 1;

        for (int i = 0; i < numberOfVoters; i++) {
            String city = cities[(int) (Math.random() * cities.length)];
            String party = parties[(int) (Math.random() * parties.length)];
            int age = generateRandomAge();
            String job = generateRandomJob();
            voters.add(new Voter(currentId++, city, party, age, job));
        }

        return voters;
    }

    private static int generateRandomAge() {

        return (int) (Math.random() * 63) + 18;
    }

    private static String generateRandomJob() {

        String[] jobs = {"Engineer", "Teacher", "Doctor", "Artist", "Writer"};
        int index = (int) (Math.random() * jobs.length);
        return jobs[index];
    }
}
