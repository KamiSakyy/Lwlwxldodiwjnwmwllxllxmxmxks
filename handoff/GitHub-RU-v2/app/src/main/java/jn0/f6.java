package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f6 {
    public final String a;
    public final String b;
    public final h6 c;
    public final i6 d;
    public final kw0.a e;

    public f6(String str, String str2, h6 h6Var, i6 i6Var, kw0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = h6Var;
        this.d = i6Var;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6)) {
            return false;
        }
        f6 f6Var = (f6) obj;
        return k71.k.b(this.a, f6Var.a) && k71.k.b(this.b, f6Var.b) && k71.k.b(this.c, f6Var.c) && k71.k.b(this.d, f6Var.d) && k71.k.b(this.e, f6Var.e);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        h6 h6Var = this.c;
        int hashCode = (i + (h6Var == null ? 0 : h6Var.a.hashCode())) * 31;
        i6 i6Var = this.d;
        return this.e.hashCode() + ((hashCode + (i6Var != null ? i6Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(", onRepository=");
        o.append(this.d);
        o.append(", nodeIdFragment=");
        return f1.e.n(o, this.e, ")");
    }

    public Object e;
}
