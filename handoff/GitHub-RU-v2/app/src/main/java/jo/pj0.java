package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pj0 {
    public final String a;
    public final ArrayList b;

    public pj0(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pj0)) {
            return false;
        }
        pj0 pj0Var = (pj0) obj;
        return this.a.equals(pj0Var.a) && this.b.equals(pj0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OnPullRequest(id=" + this.a + ", viewerMergeActions=" + this.b + ")";
    }
}
