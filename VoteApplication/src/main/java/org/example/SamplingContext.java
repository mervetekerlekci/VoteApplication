package org.example;
import java.util.List;

public class SamplingContext {
    private SamplingStrategy strategy;

    public void setStrategy(SamplingStrategy strategy) {
        this.strategy = strategy;
    }

    public List<Voter> executeStrategy(List<Voter> voters, int sampleSize) {
        return strategy.selectSamples(voters, sampleSize);
    }
}
