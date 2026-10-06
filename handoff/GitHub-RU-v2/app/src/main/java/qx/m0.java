package qx;

import cq.u2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public final String a;
    public final String b;
    public final u2 c;

    public m0(String str, String str2, u2 u2Var) {
        this.a = str;
        this.b = str2;
        this.c = u2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b) && k71.k.b(this.c, m0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Organization(__typename=", this.a, ", id=", this.b, ", organizationNameAndAvatar=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object o(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
