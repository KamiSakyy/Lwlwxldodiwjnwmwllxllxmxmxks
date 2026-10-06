package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i90 {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public String e;
    public dw.t5 f;
    public dw.o g;

    public i90(String str, boolean z, boolean z2, boolean z3, String str2, dw.t5 t5Var, dw.o oVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = t5Var;
        this.g = oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i90)) {
            return false;
        }
        i90 i90Var = (i90) obj;
        return k71.k.b(this.a, i90Var.a) && this.b == i90Var.b && this.c == i90Var.c && this.d == i90Var.d && k71.k.b(this.e, i90Var.e) && k71.k.b(this.f, i90Var.f) && k71.k.b(this.g, i90Var.g);
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
    public i90(String p1, boolean p2, boolean p3, boolean p4, String p5, Object p6, Object p7) {
    }
}
