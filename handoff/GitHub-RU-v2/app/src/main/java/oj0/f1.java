package oj0;

import gn0.jr;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f1 implements aa.h0 {
    public String A;
    public boolean B;
    public boolean C;
    public boolean D;
    public jr E;
    public e1 F;
    public s0 G;
    public boolean H;
    public int I;
    public x0 J;
    public b1 K;
    public r0 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public t0 P;
    public h Q;
    public ek0.b R;
    public wk0.u0 S;
    public a4 T;
    public q3 U;
    public String a;
    public String b;
    public Integer c;
    public int d;
    public p0 e;
    public o0 f;
    public int g;
    public boolean h;
    public boolean i;
    public String j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public q0 q;
    public String r;
    public w0 s;
    public y0 t;
    public a1 u;
    public z0 v;
    public c1 w;
    public String x;
    public String y;
    public String z;

    public f1(String str, String str2, Integer num, int i, p0 p0Var, o0 o0Var, int i2, boolean z, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, q0 q0Var, String str4, w0 w0Var, y0 y0Var, a1 a1Var, z0 z0Var, c1 c1Var, String str5, String str6, String str7, String str8, boolean z9, boolean z10, boolean z12, jr jrVar, e1 e1Var, s0 s0Var, boolean z13, int i3, x0 x0Var, b1 b1Var, r0 r0Var, boolean z14, boolean z15, boolean z16, t0 t0Var, h hVar, ek0.b bVar, wk0.u0 u0Var, a4 a4Var, q3 q3Var) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = i;
        this.e = p0Var;
        this.f = o0Var;
        this.g = i2;
        this.h = z;
        this.i = z2;
        this.j = str3;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = z8;
        this.q = q0Var;
        this.r = str4;
        this.s = w0Var;
        this.t = y0Var;
        this.u = a1Var;
        this.v = z0Var;
        this.w = c1Var;
        this.x = str5;
        this.y = str6;
        this.z = str7;
        this.A = str8;
        this.B = z9;
        this.C = z10;
        this.D = z12;
        this.E = jrVar;
        this.F = e1Var;
        this.G = s0Var;
        this.H = z13;
        this.I = i3;
        this.J = x0Var;
        this.K = b1Var;
        this.L = r0Var;
        this.M = z14;
        this.N = z15;
        this.O = z16;
        this.P = t0Var;
        this.Q = hVar;
        this.R = bVar;
        this.S = u0Var;
        this.T = a4Var;
        this.U = q3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return k71.k.b(this.a, f1Var.a) && k71.k.b(this.b, f1Var.b) && k71.k.b(this.c, f1Var.c) && this.d == f1Var.d && k71.k.b(this.e, f1Var.e) && k71.k.b(this.f, f1Var.f) && this.g == f1Var.g && this.h == f1Var.h && this.i == f1Var.i && k71.k.b(this.j, f1Var.j) && this.k == f1Var.k && this.l == f1Var.l && this.m == f1Var.m && this.n == f1Var.n && this.o == f1Var.o && this.p == f1Var.p && k71.k.b(this.q, f1Var.q) && k71.k.b(this.r, f1Var.r) && k71.k.b(this.s, f1Var.s) && k71.k.b(this.t, f1Var.t) && k71.k.b(this.u, f1Var.u) && k71.k.b(this.v, f1Var.v) && k71.k.b(this.w, f1Var.w) && k71.k.b(this.x, f1Var.x) && k71.k.b(this.y, f1Var.y) && k71.k.b(this.z, f1Var.z) && k71.k.b(this.A, f1Var.A) && this.B == f1Var.B && this.C == f1Var.C && this.D == f1Var.D && this.E == f1Var.E && k71.k.b(this.F, f1Var.F) && k71.k.b(this.G, f1Var.G) && this.H == f1Var.H && this.I == f1Var.I && k71.k.b(this.J, f1Var.J) && k71.k.b(this.K, f1Var.K) && k71.k.b(this.L, f1Var.L) && this.M == f1Var.M && this.N == f1Var.N && this.O == f1Var.O && k71.k.b(this.P, f1Var.P) && k71.k.b(this.Q, f1Var.Q) && k71.k.b(this.R, f1Var.R) && k71.k.b(this.S, f1Var.S) && k71.k.b(this.T, f1Var.T) && k71.k.b(this.U, f1Var.U);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        Integer num = this.c;
        int b = a0.s0.b(this.d, (i + (num == null ? 0 : num.hashCode())) * 31, 31);
        p0 p0Var = this.e;
        int hashCode = (b + (p0Var == null ? 0 : p0Var.hashCode())) * 31;
        o0 o0Var = this.f;
        int e = x.i.e(x.i.e(a0.s0.b(this.g, (hashCode + (o0Var == null ? 0 : o0Var.hashCode())) * 31, 31), 31, this.h), 31, this.i);
        String str = this.j;
        int b2 = a0.s0.b(this.t.a, (this.s.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.q.a, x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31), this.r, 31)) * 31, 31);
        a1 a1Var = this.u;
        int hashCode2 = (b2 + (a1Var == null ? 0 : Integer.hashCode(a1Var.a))) * 31;
        z0 z0Var = this.v;
        int i2 = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.w.hashCode() + ((hashCode2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31)) * 31, this.x, 31), this.y, 31), this.z, 31);
        String str2 = this.A;
        int e2 = x.i.e(x.i.e(x.i.e((i2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.B), 31, this.C), 31, this.D);
        jr jrVar = this.E;
        int b3 = a0.s0.b(this.F.a, (e2 + (jrVar == null ? 0 : jrVar.hashCode())) * 31, 31);
        s0 s0Var = this.G;
        int b4 = a0.s0.b(this.I, x.i.e((b3 + (s0Var == null ? 0 : s0Var.hashCode())) * 31, 31, this.H), 31);
        x0 x0Var = this.J;
        int b5 = a0.s0.b(this.K.a, (b4 + (x0Var == null ? 0 : x0Var.hashCode())) * 31, 31);
        r0 r0Var = this.L;
        int e3 = x.i.e(x.i.e(x.i.e((b5 + (r0Var == null ? 0 : r0Var.hashCode())) * 31, 31, this.M), 31, this.N), 31, this.O);
        t0 t0Var = this.P;
        return this.U.hashCode() + ((this.T.hashCode() + ((this.S.hashCode() + ((this.R.hashCode() + ((this.Q.hashCode() + ((e3 + (t0Var != null ? t0Var.hashCode() : 0)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("RepositoryDetailsFragment(__typename=", this.a, ", id=", this.b, ", databaseId=");
        o.append(this.c);
        o.append(", contributorsCount=");
        o.append(this.d);
        o.append(", defaultBranchRef=");
        o.append(this.e);
        o.append(", branchInfo=");
        o.append(this.f);
        o.append(", forkCount=");
        com.github.rudroid.m0.w(o, this.g, ", hasIssuesEnabled=", this.h, ", showActions=");
        com.github.rudroid.m0.z(o, this.i, ", homepageUrl=", this.j, ", isPrivate=");
        com.github.rudroid.m0.A(o, this.k, ", isArchived=", this.l, ", isTemplate=");
        com.github.rudroid.m0.A(o, this.m, ", isFork=", this.n, ", isEmpty=");
        com.github.rudroid.m0.A(o, this.o, ", isInOrganization=", this.p, ", issues=");
        o.append(this.q);
        o.append(", name=");
        o.append(this.r);
        o.append(", owner=");
        o.append(this.s);
        o.append(", pullRequests=");
        o.append(this.t);
        o.append(", refs=");
        o.append(this.u);
        o.append(", readme=");
        o.append(this.v);
        o.append(", repositoryTopics=");
        o.append(this.w);
        o.append(", url=");
        o.append(this.x);
        o.append(", shortDescriptionHTML=");
        f1.e.x(o, this.y, ", descriptionHTML=", this.z, ", description=");
        com.github.rudroid.m0.x(o, this.A, ", viewerCanAdminister=", this.B, ", viewerCanPush=");
        com.github.rudroid.m0.A(o, this.C, ", viewerCanSubscribe=", this.D, ", viewerPermission=");
        o.append(this.E);
        o.append(", watchers=");
        o.append(this.F);
        o.append(", licenseInfo=");
        o.append(this.G);
        o.append(", isDiscussionsEnabled=");
        o.append(this.H);
        o.append(", discussionsCount=");
        o.append(this.I);
        o.append(", parent=");
        o.append(this.J);
        o.append(", releases=");
        o.append(this.K);
        o.append(", latestRelease=");
        o.append(this.L);
        o.append(", isViewersFavorite=");
        com.github.rudroid.m0.A(o, this.M, ", viewerHasBlockedContributors=", this.N, ", viewerBlockedByOwner=");
        o.append(this.O);
        o.append(", mergeQueue=");
        o.append(this.P);
        o.append(", issueTemplateFragment=");
        o.append(this.Q);
        o.append(", subscribableFragment=");
        o.append(this.R);
        o.append(", topContributorsFragment=");
        o.append(this.S);
        o.append(", userListMetadataForRepositoryFragment=");
        o.append(this.T);
        o.append(", repositoryStarsFragment=");
        o.append(this.U);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
