package w80;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a2 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final x1 h;
    public final z1 i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final y1 p;
    public final u1 q;
    public final m3 r;

    public a2(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, x1 x1Var, z1 z1Var, boolean z3, String str6, boolean z4, boolean z5, boolean z6, boolean z7, y1 y1Var, u1 u1Var, m3 m3Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = x1Var;
        this.i = z1Var;
        this.j = z3;
        this.k = str6;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = y1Var;
        this.q = u1Var;
        this.r = m3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return k71.k.b(this.a, a2Var.a) && k71.k.b(this.b, a2Var.b) && k71.k.b(this.c, a2Var.c) && k71.k.b(this.d, a2Var.d) && k71.k.b(this.e, a2Var.e) && this.f == a2Var.f && this.g == a2Var.g && k71.k.b(this.h, a2Var.h) && k71.k.b(this.i, a2Var.i) && this.j == a2Var.j && k71.k.b(this.k, a2Var.k) && this.l == a2Var.l && this.m == a2Var.m && this.n == a2Var.n && this.o == a2Var.o && k71.k.b(this.p, a2Var.p) && k71.k.b(this.q, a2Var.q) && k71.k.b(this.r, a2Var.r);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31, this.f), 31, this.g)) * 31;
        z1 z1Var = this.i;
        int e = x.i.e(x.i.e(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(x.i.e((hashCode + (z1Var == null ? 0 : z1Var.hashCode())) * 31, 31, this.j), this.k, 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        y1 y1Var = this.p;
        return this.r.hashCode() + ((this.q.hashCode() + ((e + (y1Var != null ? y1Var.hashCode() : 0)) * 31)) * 31);
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
