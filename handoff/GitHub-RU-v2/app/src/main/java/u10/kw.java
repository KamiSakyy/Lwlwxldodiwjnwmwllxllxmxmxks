package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kw {
    public String a;
    public String b;
    public w80.c1 c;

    public kw(String str, String str2, w80.c1 c1Var) {
        this.a = str;
        this.b = str2;
        this.c = c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kw)) {
            return false;
        }
        kw kwVar = (kw) obj;
        return k71.k.b(this.a, kwVar.a) && k71.k.b(this.b, kwVar.b) && k71.k.b(this.c, kwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public kw(String p1, String p2, Object p3) {
    }
}
