package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class se {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final dw.m3 e;

    public se(String str, int i, int i2, String str2, dw.m3 m3Var) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = m3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof se)) {
            return false;
        }
        se seVar = (se) obj;
        return k71.k.b(this.a, seVar.a) && this.b == seVar.b && this.c == seVar.c && k71.k.b(this.d, seVar.d) && k71.k.b(this.e, seVar.e);
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
