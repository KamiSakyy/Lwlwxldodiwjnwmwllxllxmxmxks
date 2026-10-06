package wx0;

import pz0.ko;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m0 {
    public String a;
    public ko b;
    public String c;

    public m0(String str, ko koVar, String str2) {
        this.a = str;
        this.b = koVar;
        this.c = str2;
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
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnProjectV2FieldCommon2(id=");
        sb.append(this.a);
        sb.append(", dataType=");
        sb.append(this.b);
        sb.append(", name=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
    public static Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
    public static Object j(Object p1, Object p2, Object p3) { return null; }
    public static Object w(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
