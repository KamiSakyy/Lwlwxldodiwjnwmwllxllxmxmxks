package z70;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q3 {
    public final String a;
    public final int b;
    public final p3 c;
    public final List d;

    public q3(String str, int i, p3 p3Var, List list) {
        this.a = str;
        this.b = i;
        this.c = p3Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q3)) {
            return false;
        }
        q3 q3Var = (q3) obj;
        return k71.k.b(this.a, q3Var.a) && this.b == q3Var.b && k71.k.b(this.c, q3Var.c) && k71.k.b(this.d, q3Var.d);
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
