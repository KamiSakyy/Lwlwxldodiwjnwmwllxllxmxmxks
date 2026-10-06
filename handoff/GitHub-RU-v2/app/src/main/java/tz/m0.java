package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public final String a;
    public final String b;

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
    public Object a(Object p1, Object p2, Object p3) { return null; }
    public Object h(Object p1, Object p2, Object p3) { return null; }
    public Object j(Object p1, Object p2, Object p3) { return null; }
    public Object w(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public Object z(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
