package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SimpleRandomSampling implements SamplingStrategy {
    @Override
    public List<Voter> selectSamples(List<Voter> voters, int sampleSize) {
        Collections.shuffle(voters);
        return new ArrayList<>(voters.subList(0, sampleSize));
    }
}
