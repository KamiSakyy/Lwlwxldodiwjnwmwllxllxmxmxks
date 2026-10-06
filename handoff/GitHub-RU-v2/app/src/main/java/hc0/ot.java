package hc0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ot {
    public final aa1.b a = aa.t0.d;
    public ArrayList b;

    public ot(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot)) {
            return false;
        }
        ot otVar = (ot) obj;
        return this.a.equals(otVar.a) && this.b.equals(otVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetDashboardSearchShortcutsInput(clientMutationId=" + this.a + ", shortcuts=" + this.b + ")";
    }
}
