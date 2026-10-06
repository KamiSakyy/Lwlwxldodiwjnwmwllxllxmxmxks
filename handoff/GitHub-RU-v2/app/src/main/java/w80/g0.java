package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g0 {
    public final String a;
    public final String b;
    public final e0 c;

    public g0(String str, String str2, e0 e0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = e0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b) && k71.k.b(this.c, g0Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        e0 e0Var = this.c;
        return i + (e0Var == null ? 0 : e0Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object o() { return null; }
    public Object w() { return null; }
    public Object y() { return null; }
    public Object X = null;
    public Object s = null;
}
