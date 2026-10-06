package wk0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s1 implements aa.h0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final m1 D;
    public final o1 E;
    public final f1 F;
    public final ud0.c G;
    public final sd0.b1 H;
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
    public final p1 t;
    public final q1 u;
    public final boolean v;
    public final l1 w;
    public final boolean x;
    public final boolean y;
    public final String z;

    public s1(String str, String str2, String str3, String str4, String str5, String str6, g1 g1Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, h1 h1Var, String str7, String str8, String str9, k1 k1Var, String str10, n1 n1Var, p1 p1Var, q1 q1Var, boolean z6, l1 l1Var, boolean z7, boolean z8, String str11, boolean z9, boolean z10, boolean z12, m1 m1Var, o1 o1Var, f1 f1Var, ud0.c cVar, sd0.b1 b1Var) {
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
        this.t = p1Var;
        this.u = q1Var;
        this.v = z6;
        this.w = l1Var;
        this.x = z7;
        this.y = z8;
        this.z = str11;
        this.A = z9;
        this.B = z10;
        this.C = z12;
        this.D = m1Var;
        this.E = o1Var;
        this.F = f1Var;
        this.G = cVar;
        this.H = b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return k71.k.b(this.a, s1Var.a) && k71.k.b(this.b, s1Var.b) && k71.k.b(this.c, s1Var.c) && k71.k.b(this.d, s1Var.d) && k71.k.b(this.e, s1Var.e) && k71.k.b(this.f, s1Var.f) && k71.k.b(this.g, s1Var.g) && this.h == s1Var.h && this.i == s1Var.i && this.j == s1Var.j && this.k == s1Var.k && this.l == s1Var.l && k71.k.b(this.m, s1Var.m) && k71.k.b(this.n, s1Var.n) && k71.k.b(this.o, s1Var.o) && k71.k.b(this.p, s1Var.p) && k71.k.b(this.q, s1Var.q) && k71.k.b(this.r, s1Var.r) && k71.k.b(this.s, s1Var.s) && k71.k.b(this.t, s1Var.t) && k71.k.b(this.u, s1Var.u) && this.v == s1Var.v && k71.k.b(this.w, s1Var.w) && this.x == s1Var.x && this.y == s1Var.y && k71.k.b(this.z, s1Var.z) && this.A == s1Var.A && this.B == s1Var.B && this.C == s1Var.C && k71.k.b(this.D, s1Var.D) && k71.k.b(this.E, s1Var.E) && k71.k.b(this.F, s1Var.F) && k71.k.b(this.G, s1Var.G) && k71.k.b(this.H, s1Var.H);
    }

    public final int hashCode() {
        int hashCode = (this.m.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(a0.s0.b(this.g.a, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l)) * 31;
        String str = this.n;
        int i = com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.o, 31);
        String str2 = this.p;
        int b = a0.s0.b(this.q.a, (i + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        String str3 = this.r;
        int b2 = a0.s0.b(this.t.a, a0.s0.b(this.s.a, (b + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        q1 q1Var = this.u;
        int e = x.i.e((b2 + (q1Var == null ? 0 : q1Var.hashCode())) * 31, 31, this.v);
        l1 l1Var = this.w;
        int e2 = x.i.e(x.i.e((e + (l1Var == null ? 0 : l1Var.hashCode())) * 31, 31, this.x), 31, this.y);
        String str4 = this.z;
        return this.H.hashCode() + ((this.G.hashCode() + ((this.F.hashCode() + ((this.E.hashCode() + a0.s0.b(this.D.a, x.i.e(x.i.e(x.i.e((e2 + (str4 != null ? str4.hashCode() : 0)) * 31, 31, this.A), 31, this.B), 31, this.C), 31)) * 31)) * 31)) * 31);
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
        o.append(", status=");
        o.append(this.u);
        o.append(", showProfileReadme=");
        o.append(this.v);
        o.append(", profileReadme=");
        o.append(this.w);
        o.append(", viewerCanFollow=");
        o.append(this.x);
        o.append(", viewerIsFollowing=");
        com.github.rudroid.m0.z(o, this.y, ", websiteUrl=", this.z, ", viewerCanBlock=");
        com.github.rudroid.m0.A(o, this.A, ", viewerCanUnblock=", this.B, ", privateProfile=");
        o.append(this.C);
        o.append(", projectsV2=");
        o.append(this.D);
        o.append(", socialAccounts=");
        o.append(this.E);
        o.append(", achievements=");
        o.append(this.F);
        o.append(", avatarFragment=");
        o.append(this.G);
        o.append(", userFollowersFragment=");
        o.append(this.H);
        o.append(")");
        return o.toString();
    }

    public Object e;
}
