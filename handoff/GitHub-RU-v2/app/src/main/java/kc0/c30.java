package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c30 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final oj0.v3 f;
    public final oj0.h g;

    public c30(String str, boolean z, boolean z2, boolean z3, String str2, oj0.v3 v3Var, oj0.h hVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = v3Var;
        this.g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c30)) {
            return false;
        }
        c30 c30Var = (c30) obj;
        return k71.k.b(this.a, c30Var.a) && this.b == c30Var.b && this.c == c30Var.c && this.d == c30Var.d && k71.k.b(this.e, c30Var.e) && k71.k.b(this.f, c30Var.f) && k71.k.b(this.g, c30Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), this.e, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("Node(__typename=", this.a, ", hasIssuesEnabled=", ", isDiscussionsEnabled=", this.b);
        com.github.rudroid.m0.A(o, this.c, ", isArchived=", this.d, ", id=");
        o.append(this.e);
        o.append(", simpleRepositoryFragment=");
        o.append(this.f);
        o.append(", issueTemplateFragment=");
        o.append(this.g);
        o.append(")");
        return o.toString();
    }
}
