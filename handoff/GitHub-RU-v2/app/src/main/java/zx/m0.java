package zx;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public final String a;
    public final int b;
    public final List c;

    public m0(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && this.b == m0Var.b && k71.k.b(this.c, m0Var.c);
    }

    public final int hashCode() {
        int b = a0.s0.b(this.b, this.a.hashCode() * 31, 31);
        List list = this.c;
        return b + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return x.i.l(a0.s0.n(this.b, "Commits(__typename=", this.a, ", totalCount=", ", nodes="), this.c, ")");
    }
    public Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public Object b(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
}
