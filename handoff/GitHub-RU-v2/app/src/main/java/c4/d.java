package c4;

import java.util.ArrayList;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends b {
    static {
        ArrayList arrayList = new ArrayList();
        arrayList.add("ConstraintSets");
        arrayList.add("Variables");
        arrayList.add("Generate");
        arrayList.add("Transitions");
        arrayList.add("KeyFrames");
        arrayList.add("KeyAttributes");
        arrayList.add("KeyPositions");
        arrayList.add("KeyCycles");
    }

    @Override // c4.b, c4.c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d) || Objects.equals(b(), ((d) obj).b())) {
            return super.equals(obj);
        }
        return false;
    }
}
