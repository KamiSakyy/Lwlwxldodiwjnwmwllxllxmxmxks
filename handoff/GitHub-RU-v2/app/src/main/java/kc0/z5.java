package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z5 {
    public final String a;
    public final String b;
    public final b6 c;
    public final c6 d;
    public final bl0.a e;

    public z5(String str, String str2, b6 b6Var, c6 c6Var, bl0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = b6Var;
        this.d = c6Var;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5)) {
            return false;
        }
        z5 z5Var = (z5) obj;
        return k71.k.b(this.a, z5Var.a) && k71.k.b(this.b, z5Var.b) && k71.k.b(this.c, z5Var.c) && k71.k.b(this.d, z5Var.d) && k71.k.b(this.e, z5Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        b6 b6Var = this.c;
        int hashCode = (i + (b6Var == null ? 0 : b6Var.a.hashCode())) * 31;
        c6 c6Var = this.d;
        return this.e.hashCode() + ((hashCode + (c6Var != null ? c6Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(", onRepository=");
        o.append(this.d);
        o.append(", nodeIdFragment=");
        return jo.f4.q(o, this.e, ")");
    }
}
