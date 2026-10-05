package w80;

import hc0.fq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c1 implements aa.h0 {
    public final String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final fq E;
    public final b1 F;
    public final q0 G;
    public final boolean H;
    public final int I;
    public final u0 J;
    public final y0 K;
    public final p0 L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final h P;
    public final m90.b Q;
    public final ea0.u0 R;
    public final v3 S;
    public final m3 T;
    public final String a;
    public final String b;
    public final Integer c;
    public final int d;
    public final n0 e;
    public final m0 f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final o0 q;
    public final String r;
    public final t0 s;
    public final v0 t;
    public final x0 u;
    public final w0 v;
    public final z0 w;
    public final String x;
    public final String y;
    public final String z;

    public c1(String str, String str2, Integer num, int i, n0 n0Var, m0 m0Var, int i2, boolean z, boolean z2, String str3, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, o0 o0Var, String str4, t0 t0Var, v0 v0Var, x0 x0Var, w0 w0Var, z0 z0Var, String str5, String str6, String str7, String str8, boolean z9, boolean z11, boolean z12, fq fqVar, b1 b1Var, q0 q0Var, boolean z13, int i3, u0 u0Var, y0 y0Var, p0 p0Var, boolean z14, boolean z15, boolean z16, h hVar, m90.b bVar, ea0.u0 u0Var2, v3 v3Var, m3 m3Var) {
        this.a = str;
        this.b = str2;
        this.c = num;
        this.d = i;
        this.e = n0Var;
        this.f = m0Var;
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
        this.q = o0Var;
        this.r = str4;
        this.s = t0Var;
        this.t = v0Var;
        this.u = x0Var;
        this.v = w0Var;
        this.w = z0Var;
        this.x = str5;
        this.y = str6;
        this.z = str7;
        this.A = str8;
        this.B = z9;
        this.C = z11;
        this.D = z12;
        this.E = fqVar;
        this.F = b1Var;
        this.G = q0Var;
        this.H = z13;
        this.I = i3;
        this.J = u0Var;
        this.K = y0Var;
        this.L = p0Var;
        this.M = z14;
        this.N = z15;
        this.O = z16;
        this.P = hVar;
        this.Q = bVar;
        this.R = u0Var2;
        this.S = v3Var;
        this.T = m3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return k71.k.b(this.a, c1Var.a) && k71.k.b(this.b, c1Var.b) && k71.k.b(this.c, c1Var.c) && this.d == c1Var.d && k71.k.b(this.e, c1Var.e) && k71.k.b(this.f, c1Var.f) && this.g == c1Var.g && this.h == c1Var.h && this.i == c1Var.i && k71.k.b(this.j, c1Var.j) && this.k == c1Var.k && this.l == c1Var.l && this.m == c1Var.m && this.n == c1Var.n && this.o == c1Var.o && this.p == c1Var.p && k71.k.b(this.q, c1Var.q) && k71.k.b(this.r, c1Var.r) && k71.k.b(this.s, c1Var.s) && k71.k.b(this.t, c1Var.t) && k71.k.b(this.u, c1Var.u) && k71.k.b(this.v, c1Var.v) && k71.k.b(this.w, c1Var.w) && k71.k.b(this.x, c1Var.x) && k71.k.b(this.y, c1Var.y) && k71.k.b(this.z, c1Var.z) && k71.k.b(this.A, c1Var.A) && this.B == c1Var.B && this.C == c1Var.C && this.D == c1Var.D && this.E == c1Var.E && k71.k.b(this.F, c1Var.F) && k71.k.b(this.G, c1Var.G) && this.H == c1Var.H && this.I == c1Var.I && k71.k.b(this.J, c1Var.J) && k71.k.b(this.K, c1Var.K) && k71.k.b(this.L, c1Var.L) && this.M == c1Var.M && this.N == c1Var.N && this.O == c1Var.O && k71.k.b(this.P, c1Var.P) && k71.k.b(this.Q, c1Var.Q) && k71.k.b(this.R, c1Var.R) && k71.k.b(this.S, c1Var.S) && k71.k.b(this.T, c1Var.T);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        Integer num = this.c;
        int b = a0.s0.b(this.d, (i + (num == null ? 0 : num.hashCode())) * 31, 31);
        n0 n0Var = this.e;
        int hashCode = (b + (n0Var == null ? 0 : n0Var.hashCode())) * 31;
        m0 m0Var = this.f;
        int e = x.i.e(x.i.e(a0.s0.b(this.g, (hashCode + (m0Var == null ? 0 : m0Var.hashCode())) * 31, 31), 31, this.h), 31, this.i);
        String str = this.j;
        int b2 = a0.s0.b(this.t.a, (this.s.hashCode() + com.github.rudroid.copilot.h1.i(a0.s0.b(this.q.a, x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e((e + (str == null ? 0 : str.hashCode())) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31), this.r, 31)) * 31, 31);
        x0 x0Var = this.u;
        int hashCode2 = (b2 + (x0Var == null ? 0 : Integer.hashCode(x0Var.a))) * 31;
        w0 w0Var = this.v;
        int i2 = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i((this.w.hashCode() + ((hashCode2 + (w0Var == null ? 0 : w0Var.hashCode())) * 31)) * 31, this.x, 31), this.y, 31), this.z, 31);
        String str2 = this.A;
        int e2 = x.i.e(x.i.e(x.i.e((i2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.B), 31, this.C), 31, this.D);
        fq fqVar = this.E;
        int b3 = a0.s0.b(this.F.a, (e2 + (fqVar == null ? 0 : fqVar.hashCode())) * 31, 31);
        q0 q0Var = this.G;
        int b4 = a0.s0.b(this.I, x.i.e((b3 + (q0Var == null ? 0 : q0Var.hashCode())) * 31, 31, this.H), 31);
        u0 u0Var = this.J;
        int b5 = a0.s0.b(this.K.a, (b4 + (u0Var == null ? 0 : u0Var.hashCode())) * 31, 31);
        p0 p0Var = this.L;
        return this.T.hashCode() + ((this.S.hashCode() + ((this.R.hashCode() + ((this.Q.hashCode() + ((this.P.hashCode() + x.i.e(x.i.e(x.i.e((b5 + (p0Var != null ? p0Var.hashCode() : 0)) * 31, 31, this.M), 31, this.N), 31, this.O)) * 31)) * 31)) * 31)) * 31);
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
        o.append(", issueTemplateFragment=");
        o.append(this.P);
        o.append(", subscribableFragment=");
        o.append(this.Q);
        o.append(", topContributorsFragment=");
        o.append(this.R);
        o.append(", userListMetadataForRepositoryFragment=");
        o.append(this.S);
        o.append(", repositoryStarsFragment=");
        o.append(this.T);
        o.append(")");
        return o.toString();
    }
}
