package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bp {
    public final int a;
    public final String b;
    public final xo c;
    public final yo d;
    public final String e;
    public final String f;

    public bp(int i, String str, xo xoVar, yo yoVar, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = xoVar;
        this.d = yoVar;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bp)) {
            return false;
        }
        bp bpVar = (bp) obj;
        return this.a == bpVar.a && k71.k.b(this.b, bpVar.b) && k71.k.b(this.c, bpVar.c) && k71.k.b(this.d, bpVar.d) && k71.k.b(this.e, bpVar.e) && k71.k.b(this.f, bpVar.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(Integer.hashCode(this.a) * 31, this.b, 31);
        xo xoVar = this.c;
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i((this.d.hashCode() + ((i + (xoVar == null ? 0 : xoVar.hashCode())) * 31)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "Discussion(number=", ", title=", this.b, ", author=");
        n.append(this.c);
        n.append(", category=");
        n.append(this.d);
        n.append(", id=");
        return x.i.k(n, this.e, ", __typename=", this.f, ")");
    }
}
