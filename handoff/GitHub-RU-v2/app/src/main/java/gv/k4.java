package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k4 {
    public String a;
    public int b;
    public j4 c;
    public List d;

    public k4(String str, int i, j4 j4Var, List list) {
        this.a = str;
        this.b = i;
        this.c = j4Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k4)) {
            return false;
        }
        k4 k4Var = (k4) obj;
        return k71.k.b(this.a, k4Var.a) && this.b == k4Var.b && k71.k.b(this.c, k4Var.c) && k71.k.b(this.d, k4Var.d);
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
