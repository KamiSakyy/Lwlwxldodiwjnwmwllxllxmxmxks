package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class vd {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final uu0.k3 e;

    public vd(String str, int i, int i2, String str2, uu0.k3 k3Var) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = k3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd)) {
            return false;
        }
        vd vdVar = (vd) obj;
        return k71.k.b(this.a, vdVar.a) && this.b == vdVar.b && this.c == vdVar.c && k71.k.b(this.d, vdVar.d) && k71.k.b(this.e, vdVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.c, a0.s0.b(this.b, this.a.hashCode() * 31, 31), 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "TrendingRepository(__typename=", this.a, ", starsSince=", ", contributorsCount=");
        x.i.r(this.c, ", id=", this.d, ", repositoryListItemFragment=", n);
        n.append(this.e);
        n.append(")");
        return n.toString();
    }
}
