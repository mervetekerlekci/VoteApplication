package org.example;
import java.util.List;
import java.util.List;

public class JSONToTSVAdapterStratified implements OutputAdapter {

    @Override
    public String format(List<Voter> voters) {
        StringBuilder sb = new StringBuilder();
        sb.append("id\tcity\tvote\tage\tjob\n");
        for (Voter voter : voters) {
            sb.append(voter.getId()).append("\t")
                    .append(voter.getCity()).append("\t")
                    .append(voter.getParty()).append("\t")
                    .append(voter.getAge()).append("\t")
                    .append(voter.getOccupation()).append("\n");
        }
        return sb.toString();
    }
}
