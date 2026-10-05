package uu0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k3 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final h3 h;
    public final j3 i;
    public final boolean j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final i3 p;
    public final e3 q;
    public final u4 r;

    public k3(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, h3 h3Var, j3 j3Var, boolean z3, String str6, boolean z4, boolean z5, boolean z6, boolean z7, i3 i3Var, e3 e3Var, u4 u4Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = z;
        this.g = z2;
        this.h = h3Var;
        this.i = j3Var;
        this.j = z3;
        this.k = str6;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = i3Var;
        this.q = e3Var;
        this.r = u4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return k71.k.b(this.a, k3Var.a) && k71.k.b(this.b, k3Var.b) && k71.k.b(this.c, k3Var.c) && k71.k.b(this.d, k3Var.d) && k71.k.b(this.e, k3Var.e) && this.f == k3Var.f && this.g == k3Var.g && k71.k.b(this.h, k3Var.h) && k71.k.b(this.i, k3Var.i) && this.j == k3Var.j && k71.k.b(this.k, k3Var.k) && this.l == k3Var.l && this.m == k3Var.m && this.n == k3Var.n && this.o == k3Var.o && k71.k.b(this.p, k3Var.p) && k71.k.b(this.q, k3Var.q) && k71.k.b(this.r, k3Var.r);
    }

    public final int hashCode() {
        int hashCode = (this.h.hashCode() + x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), 31, this.f), 31, this.g)) * 31;
        j3 j3Var = this.i;
        int e = x.i.e(x.i.e(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(x.i.e((hashCode + (j3Var == null ? 0 : j3Var.hashCode())) * 31, 31, this.j), this.k, 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        i3 i3Var = this.p;
        return this.r.hashCode() + ((this.q.hashCode() + ((e + (i3Var != null ? i3Var.hashCode() : 0)) * 31)) * 31);
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
