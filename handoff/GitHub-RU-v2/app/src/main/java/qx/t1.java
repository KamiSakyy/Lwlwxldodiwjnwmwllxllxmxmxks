package qx;

import cq.z6;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t1 implements aa.h0 {
    public final String A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final m1 E;
    public final o1 F;
    public final f1 G;
    public final eq.g H;
    public final z6 I;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final g1 g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final h1 m;
    public final String n;
    public final String o;
    public final String p;
    public final k1 q;
    public final String r;
    public final n1 s;
    public final q1 t;
    public final p1 u;
    public final r1 v;
    public final boolean w;
    public final l1 x;
    public final boolean y;
    public final boolean z;

    public t1(String str, String str2, String str3, String str4, String str5, String str6, g1 g1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, h1 h1Var, String str7, String str8, String str9, k1 k1Var, String str10, n1 n1Var, q1 q1Var, p1 p1Var, r1 r1Var, boolean z6, l1 l1Var, boolean z7, boolean z8, String str11, boolean z9, boolean z11, boolean z12, m1 m1Var, o1 o1Var, f1 f1Var, eq.g gVar, z6 z6Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = g1Var;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = h1Var;
        this.n = str7;
        this.o = str8;
        this.p = str9;
        this.q = k1Var;
        this.r = str10;
        this.s = n1Var;
        this.t = q1Var;
        this.u = p1Var;
        this.v = r1Var;
        this.w = z6;
        this.x = l1Var;
        this.y = z7;
        this.z = z8;
        this.A = str11;
        this.B = z9;
        this.C = z11;
        this.D = z12;
        this.E = m1Var;
        this.F = o1Var;
        this.G = f1Var;
        this.H = gVar;
        this.I = z6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return k71.k.b(this.a, t1Var.a) && k71.k.b(this.b, t1Var.b) && k71.k.b(this.c, t1Var.c) && k71.k.b(this.d, t1Var.d) && k71.k.b(this.e, t1Var.e) && k71.k.b(this.f, t1Var.f) && k71.k.b(this.g, t1Var.g) && this.h == t1Var.h && this.i == t1Var.i && this.j == t1Var.j && this.k == t1Var.k && this.l == t1Var.l && k71.k.b(this.m, t1Var.m) && k71.k.b(this.n, t1Var.n) && k71.k.b(this.o, t1Var.o) && k71.k.b(this.p, t1Var.p) && k71.k.b(this.q, t1Var.q) && k71.k.b(this.r, t1Var.r) && k71.k.b(this.s, t1Var.s) && k71.k.b(this.t, t1Var.t) && k71.k.b(this.u, t1Var.u) && k71.k.b(this.v, t1Var.v) && this.w == t1Var.w && k71.k.b(this.x, t1Var.x) && this.y == t1Var.y && this.z == t1Var.z && k71.k.b(this.A, t1Var.A) && this.B == t1Var.B && this.C == t1Var.C && this.D == t1Var.D && k71.k.b(this.E, t1Var.E) && k71.k.b(this.F, t1Var.F) && k71.k.b(this.G, t1Var.G) && k71.k.b(this.H, t1Var.H) && k71.k.b(this.I, t1Var.I);
    }

    public final int hashCode() {
        int hashCode = (this.m.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(a0.s0.b(this.g.a, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31;
        String str = this.n;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.o, 31);
        String str2 = this.p;
        int b = a0.s0.b(this.q.a, (i + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.r;
        int b2 = a0.s0.b(this.u.a, a0.s0.b(this.t.a, a0.s0.b(this.s.a, (b + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31), 31);
        r1 r1Var = this.v;
        int e = x.i.e((b2 + (r1Var == null ? 0 : r1Var.hashCode())) * 31, 31, this.w);
        l1 l1Var = this.x;
        int e2 = x.i.e(x.i.e((e + (l1Var == null ? 0 : l1Var.hashCode())) * 31, 31, this.y), 31, this.z);
        String str4 = this.A;
        return this.I.hashCode() + ((this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + a0.s0.b(this.E.a, x.i.e(x.i.e(x.i.e((e2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.B), 31, this.C), 31, this.D), 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UserProfileFragment(__typename=", this.a, ", id=", this.b, ", url=");
        f1.e.x(o, this.c, ", bioHTML=", this.d, ", companyHTML=");
        f1.e.x(o, this.e, ", userEmail=", this.f, ", following=");
        o.append(this.g);
        o.append(", isDeveloperProgramMember=");
        o.append(this.h);
        o.append(", isEmployee=");
        com.github.rudroid.m0.A(o, this.i, ", isFollowingViewer=", this.j, ", isViewer=");
        com.github.rudroid.m0.A(o, this.k, ", isBountyHunter=", this.l, ", itemShowcase=");
        o.append(this.m);
        o.append(", location=");
        o.append(this.n);
        o.append(", login=");
        f1.e.x(o, this.o, ", name=", this.p, ", organizations=");
        o.append(this.q);
        o.append(", pronouns=");
        o.append(this.r);
        o.append(", repositories=");
        o.append(this.s);
        o.append(", starredRepositories=");
        o.append(this.t);
        o.append(", sponsorshipsAsSponsor=");
        o.append(this.u);
        o.append(", status=");
        o.append(this.v);
        o.append(", showProfileReadme=");
        o.append(this.w);
        o.append(", profileReadme=");
        o.append(this.x);
        o.append(", viewerCanFollow=");
        com.github.rudroid.m0.A(o, this.y, ", viewerIsFollowing=", this.z, ", websiteUrl=");
        com.github.rudroid.m0.x(o, this.A, ", viewerCanBlock=", this.B, ", viewerCanUnblock=");
        com.github.rudroid.m0.A(o, this.C, ", privateProfile=", this.D, ", projectsV2=");
        o.append(this.E);
        o.append(", socialAccounts=");
        o.append(this.F);
        o.append(", achievements=");
        o.append(this.G);
        o.append(", avatarFragment=");
        o.append(this.H);
        o.append(", userFollowersFragment=");
        o.append(this.I);
        o.append(")");
        return o.toString();
    }

    public Object e;
}
