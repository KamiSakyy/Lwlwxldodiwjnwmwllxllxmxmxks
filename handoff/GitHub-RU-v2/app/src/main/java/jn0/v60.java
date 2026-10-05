package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v60 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final uu0.z4 f;
    public final uu0.o g;

    public v60(String str, boolean z, boolean z2, boolean z3, String str2, uu0.z4 z4Var, uu0.o oVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = z4Var;
        this.g = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v60)) {
            return false;
        }
        v60 v60Var = (v60) obj;
        return k71.k.b(this.a, v60Var.a) && this.b == v60Var.b && this.c == v60Var.c && this.d == v60Var.d && k71.k.b(this.e, v60Var.e) && k71.k.b(this.f, v60Var.f) && k71.k.b(this.g, v60Var.g);
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
