package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m3 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public j3 h;
    public l3 i;
    public boolean j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public k3 p;
    public g3 q;
    public o5 r;

    public m3(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, j3 j3Var, l3 l3Var, boolean z3, String str6, boolean z4, boolean z5, boolean z6, boolean z7, k3 k3Var, g3 g3Var, o5 o5Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = j3Var;
        this.i = l3Var;
        this.j = z3;
        this.k = str6;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = k3Var;
        this.q = g3Var;
        this.r = o5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return false;
        }
        m3 m3Var = (m3) obj;
        return k71.k.b(this.a, m3Var.a) && k71.k.b(this.b, m3Var.b) && k71.k.b(this.c, m3Var.c) && k71.k.b(this.d, m3Var.d) && k71.k.b(this.e, m3Var.e) && this.f == m3Var.f && this.g == m3Var.g && k71.k.b(this.h, m3Var.h) && k71.k.b(this.i, m3Var.i) && this.j == m3Var.j && k71.k.b(this.k, m3Var.k) && this.l == m3Var.l && this.m == m3Var.m && this.n == m3Var.n && this.o == m3Var.o && k71.k.b(this.p, m3Var.p) && k71.k.b(this.q, m3Var.q) && k71.k.b(this.r, m3Var.r);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31, this.f), 31, this.g)) * 31;
        l3 l3Var = this.i;
        int e = x.i.e(x.i.e(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(x.i.e((hashCode + (l3Var == null ? 0 : l3Var.hashCode())) * 31, 31, this.j), this.k, 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        k3 k3Var = this.p;
        return this.r.hashCode() + ((this.q.hashCode() + ((e + (k3Var != null ? k3Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryListItemFragment(__typename=", this.a, ", shortDescriptionHTML=", this.b, ", id=");
        f1.e.x(o, this.c, ", name=", this.d, ", url=");
        com.github.rudroid.m0.x(o, this.e, ", isPrivate=", this.f, ", isArchived=");
        o.append(this.g);
        o.append(", owner=");
        o.append(this.h);
        o.append(", primaryLanguage=");
        o.append(this.i);
        o.append(", usesCustomOpenGraphImage=");
        o.append(this.j);
        o.append(", openGraphImageUrl=");
        com.github.rudroid.m0.x(o, this.k, ", isInOrganization=", this.l, ", hasIssuesEnabled=");
        com.github.rudroid.m0.A(o, this.m, ", isDiscussionsEnabled=", this.n, ", isFork=");
        o.append(this.o);
        o.append(", parent=");
        o.append(this.p);
        o.append(", lists=");
        o.append(this.q);
        o.append(", repositoryStarsFragment=");
        o.append(this.r);
        o.append(")");
        return o.toString();
    }
}
