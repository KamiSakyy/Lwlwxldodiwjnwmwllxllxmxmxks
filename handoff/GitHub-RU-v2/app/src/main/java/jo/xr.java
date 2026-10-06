package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xr {
    public String a;
    public String b;
    public yr c;

    public xr(String str, String str2, yr yrVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = yrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xr)) {
            return false;
        }
        xr xrVar = (xr) obj;
        return k71.k.b(this.a, xrVar.a) && k71.k.b(this.b, xrVar.b) && k71.k.b(this.c, xrVar.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        yr yrVar = this.c;
        return i + (yrVar == null ? 0 : yrVar.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequestReview=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
