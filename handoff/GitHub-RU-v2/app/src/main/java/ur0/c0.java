package ur0;

import a0.s0;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public String a;
    public int b;
    public b0 c;
    public List d;

    public c0(String str, int i, b0 b0Var, List list) {
        this.a = str;
        this.b = i;
        this.c = b0Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && this.b == c0Var.b && k71.k.b(this.c, c0Var.c) && k71.k.b(this.d, c0Var.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + s0.b(this.b, this.a.hashCode() * 31, 31)) * 31;
        List list = this.d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "TimelineItems(__typename=", this.a, ", beforeFocusCount=", ", pageInfo=");
        n.append(this.c);
        n.append(", nodes=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
