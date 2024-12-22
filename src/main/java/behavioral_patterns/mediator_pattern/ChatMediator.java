package behavioral_patterns.mediator_pattern;

import java.util.ArrayList;
import java.util.List;

public class ChatMediator implements Mediator {

    private List<Colleague> colleagues = new ArrayList<>();

    public void addColleague(Colleague colleague) {
        colleagues.add(colleague);
    }

    @Override
    public void sendMessage(String message, Colleague sender) {
        for (Colleague colleague : colleagues) {
            if (colleague != sender) {
                colleague.receive(message);
            }
        }
    }

}
