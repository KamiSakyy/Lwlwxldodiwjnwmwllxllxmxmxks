package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bd {
    public final String a;
    public final int b;
    public final int c;
    public final String d;
    public final oj0.e2 e;

    public bd(String str, int i, int i2, String str2, oj0.e2 e2Var) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = str2;
        this.e = e2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bd)) {
            return false;
        }
        bd bdVar = (bd) obj;
        return k71.k.b(this.a, bdVar.a) && this.b == bdVar.b && this.c == bdVar.c && k71.k.b(this.d, bdVar.d) && k71.k.b(this.e, bdVar.e);
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
