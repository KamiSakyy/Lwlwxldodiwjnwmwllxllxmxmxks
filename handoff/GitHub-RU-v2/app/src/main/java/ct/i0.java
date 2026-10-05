package ct;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 {
    public final String a;
    public final int b;
    public final h0 c;
    public final List d;

    public i0(String str, int i, h0 h0Var, List list) {
        this.a = str;
        this.b = i;
        this.c = h0Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && this.b == i0Var.b && k71.k.b(this.c, i0Var.c) && k71.k.b(this.d, i0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        List list = this.d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "TimelineItems(__typename=", this.a, ", beforeFocusCount=", ", pageInfo=");
        n.append(this.c);
        n.append(", nodes=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
