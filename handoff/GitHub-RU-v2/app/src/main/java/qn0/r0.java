package qn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r0 {
    public String a;
    public String b;
    public s0 c;

    public r0(String str, String str2, s0 s0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && k71.k.b(this.b, r0Var.b) && k71.k.b(this.c, r0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        s0 s0Var = this.c;
        return i + (s0Var == null ? 0 : s0Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckSuite=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public r0(String p1, String p2, Object p3) {
    }
}
