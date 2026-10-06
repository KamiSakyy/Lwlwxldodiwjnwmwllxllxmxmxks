package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    public String a;
    public String b;
    public gv.e2 c;

    public h0(String str, String str2, gv.e2 e2Var) {
        this.a = str;
        this.b = str2;
        this.c = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b) && k71.k.b(this.c, h0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node3(__typename=", this.a, ", id=", this.b, ", linkedPullRequestFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
