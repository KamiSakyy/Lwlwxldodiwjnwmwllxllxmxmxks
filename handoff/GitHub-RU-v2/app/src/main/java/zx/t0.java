package zx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t0 {
    public String a;
    public String b;
    public v0 c;

    public t0(String str, String str2, v0 v0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return k71.k.b(this.a, t0Var.a) && k71.k.b(this.b, t0Var.b) && k71.k.b(this.c, t0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        v0 v0Var = this.c;
        return i + (v0Var == null ? 0 : v0Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public static final Object d = null;
}
