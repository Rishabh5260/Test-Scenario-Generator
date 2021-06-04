package test_tracer;

import java.util.Vector;

public class ActivityNode {
    String id;
    String type;
    String name;
    Vector<OutTransition> outTransitions;
    Vector<InTransition> inTransitions;
    String documentation;
    String ownerId;
    Vector<String> ownedIds;

    public ActivityNode() {
        outTransitions = new Vector<OutTransition>();
        inTransitions = new Vector<InTransition>();
        ownedIds = new Vector<String>();
    }
}
