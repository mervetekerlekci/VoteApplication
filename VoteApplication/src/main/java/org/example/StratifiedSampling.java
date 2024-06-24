package org.example;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StratifiedSampling implements SamplingStrategy {
    @Override
    public List<Voter> selectSamples(List<Voter> voters, int sampleSize) {
        List<Voter> sample = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < sampleSize; i++) {

            Voter selectedVoter = voters.get(random.nextInt(voters.size()));

            selectedVoter.setAge(generateRandomAge());
            selectedVoter.setOccupation(generateRandomJob());
            sample.add(selectedVoter);
        }

        return sample;
    }

    private int generateRandomAge() {

        return new Random().nextInt(63) + 18;
    }

    private String generateRandomJob() {

        String[] jobs = {"Engineer", "Teacher", "Doctor", "Artist", "Writer"};
        int index = new Random().nextInt(jobs.length);
        return jobs[index];
    }
}
