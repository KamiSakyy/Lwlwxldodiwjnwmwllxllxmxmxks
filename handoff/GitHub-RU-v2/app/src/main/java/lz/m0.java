package lz;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public final String a;
    public final d0 b;
    public final String c;
    public final String d;

    public m0(String str, d0 d0Var, String str2, String str3) {
        this.a = str;
        this.b = d0Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b) && k71.k.b(this.c, m0Var.c) && k71.k.b(this.d, m0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(name=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
    public Object f(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object l(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object y(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
