package ri0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a4 {
    public final String a;
    public final int b;
    public final z3 c;
    public final List d;

    public a4(String str, int i, z3 z3Var, List list) {
        this.a = str;
        this.b = i;
        this.c = z3Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4)) {
            return false;
        }
        a4 a4Var = (a4) obj;
        return k71.k.b(this.a, a4Var.a) && this.b == a4Var.b && k71.k.b(this.c, a4Var.c) && k71.k.b(this.d, a4Var.d);
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
