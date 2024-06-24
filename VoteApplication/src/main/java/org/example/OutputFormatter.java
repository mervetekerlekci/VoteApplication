package org.example;
import java.util.List;

public class OutputFormatter {
    private OutputAdapter adapter;

    public OutputFormatter(OutputAdapter adapter) {
        this.adapter = adapter;
    }

    public String format(List<Voter> voters) {
        return adapter.format(voters);
    }
}
