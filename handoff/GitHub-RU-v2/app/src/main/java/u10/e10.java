package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e10 {
    public String a;
    public boolean b;
    public boolean c;
    public boolean d;
    public String e;
    public w80.q3 f;
    public w80.h g;

    public e10(String str, boolean z, boolean z2, boolean z3, String str2, w80.q3 q3Var, w80.h hVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = str2;
        this.f = q3Var;
        this.g = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e10)) {
            return false;
        }
        e10 e10Var = (e10) obj;
        return k71.k.b(this.a, e10Var.a) && this.b == e10Var.b && this.c == e10Var.c && this.d == e10Var.d && k71.k.b(this.e, e10Var.e) && k71.k.b(this.f, e10Var.f) && k71.k.b(this.g, e10Var.g);
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
    public e10(String p1, boolean p2, boolean p3, boolean p4, String p5, Object p6, Object p7) {
    }
}
