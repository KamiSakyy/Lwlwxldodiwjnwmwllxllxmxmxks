package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r5 {
    public final String a;
    public final String b;
    public final t5 c;
    public final u5 d;
    public final ja0.a e;

    public r5(String str, String str2, t5 t5Var, u5 u5Var, ja0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = t5Var;
        this.d = u5Var;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return k71.k.b(this.a, r5Var.a) && k71.k.b(this.b, r5Var.b) && k71.k.b(this.c, r5Var.c) && k71.k.b(this.d, r5Var.d) && k71.k.b(this.e, r5Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        t5 t5Var = this.c;
        int hashCode = (i + (t5Var == null ? 0 : t5Var.a.hashCode())) * 31;
        u5 u5Var = this.d;
        return this.e.hashCode() + ((hashCode + (u5Var != null ? u5Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(", onRepository=");
        o.append(this.d);
        o.append(", nodeIdFragment=");
        return no.a.p(o, this.e, ")");
    }
}
