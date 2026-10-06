package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public String a;
    public String b;

    public m0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("OnProjectV2FieldCommon1(id=", this.a, ", name=", this.b, ")");
    }
    public static Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
    public static Object j(Object p1, Object p2, Object p3) { return null; }
    public static Object w(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
