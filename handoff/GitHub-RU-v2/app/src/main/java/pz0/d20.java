package pz0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d20 {
    public final aa1.b a = aa.t0.d;
    public ArrayList b;

    public d20(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d20)) {
            return false;
        }
        d20 d20Var = (d20) obj;
        return this.a.equals(d20Var.a) && this.b.equals(d20Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetDashboardSearchShortcutsInput(clientMutationId=" + this.a + ", shortcuts=" + this.b + ")";
    }
}
