package gn0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class su {
    public final aa1.b a = aa.t0.d;
    public final ArrayList b;

    public su(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su)) {
            return false;
        }
        su suVar = (su) obj;
        return this.a.equals(suVar.a) && this.b.equals(suVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SetDashboardSearchShortcutsInput(clientMutationId=" + this.a + ", shortcuts=" + this.b + ")";
    }
}
