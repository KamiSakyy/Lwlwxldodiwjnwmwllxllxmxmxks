package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public String a;
    public String b;
    public String c;

    public m0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
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
        return com.github.rudroid.copilot.h1.p(a0.s0.o("Workflow(name=", this.a, ", id=", this.b, ", __typename="), this.c, ")");
    }
    public static Object a(Object p1, Object p2, Object p3) { return null; }
    public static Object h(Object p1, Object p2, Object p3) { return null; }
}
