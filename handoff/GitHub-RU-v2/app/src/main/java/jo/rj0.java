package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class rj0 {
    public final m10.ry a;
    public final ArrayList b;
    public final m10.ny c;

    public rj0(m10.ry ryVar, ArrayList arrayList, m10.ny nyVar) {
        this.a = ryVar;
        this.b = arrayList;
        this.c = nyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rj0)) {
            return false;
        }
        rj0 rj0Var = (rj0) obj;
        return this.a == rj0Var.a && this.b.equals(rj0Var.b) && this.c == rj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ViewerMergeAction(allowableStatus=" + this.a + ", mergeMethods=" + this.b + ", name=" + this.c + ")";
    }
}
