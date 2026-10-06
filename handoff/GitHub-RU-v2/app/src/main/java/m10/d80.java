package m10;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d80 {
    public final aa1.b a = aa.t0.d;
    public ArrayList b;

    public d80(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d80)) {
            return false;
        }
        d80 d80Var = (d80) obj;
        return this.a.equals(d80Var.a) && this.b.equals(d80Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetDashboardSearchShortcutsInput(clientMutationId=" + this.a + ", shortcuts=" + this.b + ")";
    }
}
