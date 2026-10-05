package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i0 implements aa.h0 {
    public final String a;
    public final String b;
    public final g0 c;
    public final pu.a d;

    public i0(String str, String str2, g0 g0Var, pu.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = g0Var;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return k71.k.b(this.a, i0Var.a) && k71.k.b(this.b, i0Var.b) && k71.k.b(this.c, i0Var.c) && k71.k.b(this.d, i0Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        g0 g0Var = this.c;
        return this.d.hashCode() + ((i + (g0Var == null ? 0 : g0Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OrgBlockablePullRequestFragment(__typename=", this.a, ", id=", this.b, ", author=");
        o.append(this.c);
        o.append(", orgBlockableFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
