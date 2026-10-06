package yz0;

import com.github.service.models.response.Avatar;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p8 {
    public static final i8 Companion = new i8();
    public boolean A;
    public ArrayList B;
    public m8 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public String G;
    public boolean H;
    public int I;
    public d1 J;
    public Object K;
    public Object L;
    public String a;
    public String b;
    public Avatar c;
    public String d;
    public String e;
    public String f;
    public int g;
    public int h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public String o;
    public String p;
    public String q;
    public int r;
    public String s;
    public int t;
    public int u;
    public int v;
    public boolean w;
    public boolean x;
    public String y;
    public o8 z;

    public p8(String str, String str2, Avatar avatar, String str3, String str4, String str5, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, String str7, String str8, int i3, String str9, int i4, int i5, int i6, boolean z7, boolean z8, String str10, o8 o8Var, boolean z9, ArrayList arrayList, m8 m8Var, boolean z10, boolean z12, boolean z13, String str11, boolean z14, int i7, d1 d1Var, List list, List list2) {
        k71.k.g(str, "id");
        k71.k.g(str2, "url");
        k71.k.g(str7, "login");
        this.a = str;
        this.b = str2;
        this.c = avatar;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = i2;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = str6;
        this.p = str7;
        this.q = str8;
        this.r = i3;
        this.s = str9;
        this.t = i4;
        this.u = i5;
        this.v = i6;
        this.w = z7;
        this.x = z8;
        this.y = str10;
        this.z = o8Var;
        this.A = z9;
        this.B = arrayList;
        this.C = m8Var;
        this.D = z10;
        this.E = z12;
        this.F = z13;
        this.G = str11;
        this.H = z14;
        this.I = i7;
        this.J = d1Var;
        this.K = list;
        this.L = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p8)) {
            return false;
        }
        p8 p8Var = (p8) obj;
        return k71.k.b(this.a, p8Var.a) && k71.k.b(this.b, p8Var.b) && this.c.equals(p8Var.c) && this.d.equals(p8Var.d) && this.e.equals(p8Var.e) && this.f.equals(p8Var.f) && this.g == p8Var.g && this.h == p8Var.h && this.i == p8Var.i && this.j == p8Var.j && this.k == p8Var.k && this.l == p8Var.l && this.m == p8Var.m && this.n == p8Var.n && this.o.equals(p8Var.o) && k71.k.b(this.p, p8Var.p) && this.q.equals(p8Var.q) && this.r == p8Var.r && this.s.equals(p8Var.s) && this.t == p8Var.t && this.u == p8Var.u && this.v == p8Var.v && this.w == p8Var.w && this.x == p8Var.x && this.y.equals(p8Var.y) && k71.k.b(this.z, p8Var.z) && this.A == p8Var.A && this.B.equals(p8Var.B) && k71.k.b(this.C, p8Var.C) && this.D == p8Var.D && this.E == p8Var.E && this.F == p8Var.F && this.G.equals(p8Var.G) && this.H == p8Var.H && this.I == p8Var.I && k71.k.b(this.J, p8Var.J) && this.K.equals(p8Var.K) && this.L.equals(p8Var.L);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(a0.s0.b(this.v, a0.s0.b(this.u, a0.s0.b(this.t, com.github.rudroid.copilot.h1.i(a0.s0.b(this.r, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(a0.s0.b(this.h, a0.s0.b(this.g, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.j(this.c, com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31), this.d, 31), this.e, 31), this.f, 31), 31), 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), this.o, 31), this.p, 31), this.q, 31), 31), this.s, 31), 31), 31), 31), 31, this.w), 31, this.x), this.y, 31);
        o8 o8Var = this.z;
        int b = no.a.b(this.B, x.i.e((i + (o8Var == null ? 0 : o8Var.hashCode())) * 31, 31, this.A), 31);
        m8 m8Var = this.C;
        int b2 = a0.s0.b(this.I, x.i.e(com.github.rudroid.copilot.h1.i(x.i.e(x.i.e(x.i.e((b + (m8Var == null ? 0 : m8Var.hashCode())) * 31, 31, this.D), 31, this.E), 31, this.F), this.G, 31), 31, this.H), 31);
        d1 d1Var = this.J;
        return this.L.hashCode() + com.github.rudroid.copilot.h1.h((b2 + (d1Var != null ? d1Var.hashCode() : 0)) * 31, this.K, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("UserOrOrganization(id=", this.a, ", url=", this.b, ", avatar=");
        o.append(this.c);
        o.append(", bioHtml=");
        o.append(this.d);
        o.append(", companyHtml=");
        f1.e.x(o, this.e, ", email=", this.f, ", followersTotalCount=");
        a0.s0.z(o, this.g, ", followingTotalCount=", this.h, ", isDeveloperProgramMember=");
        com.github.rudroid.m0.A(o, this.i, ", isVerified=", this.j, ", isEmployee=");
        com.github.rudroid.m0.A(o, this.k, ", isFollowingViewer=", this.l, ", isViewer=");
        com.github.rudroid.m0.A(o, this.m, ", isBountyHunter=", this.n, ", location=");
        f1.e.x(o, this.o, ", login=", this.p, ", name=");
        a0.s0.w(this.r, this.q, ", organizationsCount=", ", pronouns=", o);
        a0.s0.w(this.t, this.s, ", repositoriesCount=", ", starredRepositoriesCount=", o);
        a0.s0.z(o, this.u, ", sponsoringCount=", this.v, ", viewerCanFollow=");
        com.github.rudroid.m0.A(o, this.w, ", viewerIsFollowing=", this.x, ", websiteUrl=");
        o.append(this.y);
        o.append(", status=");
        o.append(this.z);
        o.append(", hasPinnedItems=");
        o.append(this.A);
        o.append(", pinnedItems=");
        o.append(this.B);
        o.append(", readme=");
        o.append(this.C);
        o.append(", isOrganization=");
        o.append(this.D);
        o.append(", viewerCanBlock=");
        com.github.rudroid.m0.A(o, this.E, ", viewerCanUnblock=", this.F, ", xUsername=");
        com.github.rudroid.m0.x(o, this.G, ", profileIsPrivate=", this.H, ", projectsCount=");
        o.append(this.I);
        o.append(", discussionsOverview=");
        o.append(this.J);
        o.append(", achievementBadges=");
        o.append(this.K);
        o.append(", socialLinks=");
        o.append(this.L);
        o.append(")");
        return o.toString();
    }
}
