package org.example;

import java.util.List;


public interface SamplingStrategy {
    List<Voter> selectSamples(List<Voter> voters, int sampleSize);
}
