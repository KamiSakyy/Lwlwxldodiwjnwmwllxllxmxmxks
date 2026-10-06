package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p6 {
    public String a;
    public String b;
    public r6 c;
    public s6 d;
    public vx.a e;

    public p6(String str, String str2, r6 r6Var, s6 s6Var, vx.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = r6Var;
        this.d = s6Var;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6)) {
            return false;
        }
        p6 p6Var = (p6) obj;
        return k71.k.b(this.a, p6Var.a) && k71.k.b(this.b, p6Var.b) && k71.k.b(this.c, p6Var.c) && k71.k.b(this.d, p6Var.d) && k71.k.b(this.e, p6Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        r6 r6Var = this.c;
        int hashCode = (i + (r6Var == null ? 0 : r6Var.a.hashCode())) * 31;
        s6 s6Var = this.d;
        return this.e.hashCode() + ((hashCode + (s6Var != null ? s6Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(", onRepository=");
        o.append(this.d);
        o.append(", nodeIdFragment=");
        return f4.r(o, this.e, ")");
    }
}
