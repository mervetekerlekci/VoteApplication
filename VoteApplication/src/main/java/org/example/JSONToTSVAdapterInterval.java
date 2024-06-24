package org.example;

import java.util.List;

public class JSONToTSVAdapterInterval implements OutputAdapter {

    @Override
    public String format(List<Voter> voters) {
        StringBuilder sb = new StringBuilder();
        sb.append("id\tcity\tvote\n");
        for (Voter voter : voters) {
            sb.append(voter.getId()).append("\t")
                    .append(voter.getCity()).append("\t")
                    .append(voter.getParty()).append("\n");
        }
        return sb.toString();
    }
}
