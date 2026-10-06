package oj0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e2 implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public b2 h;
    public d2 i;
    public boolean j;
    public String k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public c2 p;
    public y1 q;
    public q3 r;

    public e2(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, b2 b2Var, d2 d2Var, boolean z3, String str6, boolean z4, boolean z5, boolean z6, boolean z7, c2 c2Var, y1 y1Var, q3 q3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = b2Var;
        this.i = d2Var;
        this.j = z3;
        this.k = str6;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = c2Var;
        this.q = y1Var;
        this.r = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e2)) {
            return false;
        }
        e2 e2Var = (e2) obj;
        return k71.k.b(this.a, e2Var.a) && k71.k.b(this.b, e2Var.b) && k71.k.b(this.c, e2Var.c) && k71.k.b(this.d, e2Var.d) && k71.k.b(this.e, e2Var.e) && this.f == e2Var.f && this.g == e2Var.g && k71.k.b(this.h, e2Var.h) && k71.k.b(this.i, e2Var.i) && this.j == e2Var.j && k71.k.b(this.k, e2Var.k) && this.l == e2Var.l && this.m == e2Var.m && this.n == e2Var.n && this.o == e2Var.o && k71.k.b(this.p, e2Var.p) && k71.k.b(this.q, e2Var.q) && k71.k.b(this.r, e2Var.r);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31, this.f), 31, this.g)) * 31;
        d2 d2Var = this.i;
        int e = x.i.e(x.i.e(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(x.i.e((hashCode + (d2Var == null ? 0 : d2Var.hashCode())) * 31, 31, this.j), this.k, 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        c2 c2Var = this.p;
        return this.r.hashCode() + ((this.q.hashCode() + ((e + (c2Var != null ? c2Var.hashCode() : 0)) * 31)) * 31);
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
