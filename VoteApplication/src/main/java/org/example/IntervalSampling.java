package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IntervalSampling implements SamplingStrategy {
    @Override
    public List<Voter> selectSamples(List<Voter> voters, int sampleSize) {
        List<Voter> sample = new ArrayList<>();
        int interval = 10;

        Collections.shuffle(voters);


        for (int i = 0; i < sampleSize * interval; i += interval) {
            Voter selectedVoter = voters.get(i);
            sample.add(selectedVoter);
        }

        updateIds(sample);

        return sample;
    }

    private void updateIds(List<Voter> sample) {

        int id = 1;
        for (Voter voter : sample) {
            voter.setId(id);
            id += 10;
        }
    }
}
