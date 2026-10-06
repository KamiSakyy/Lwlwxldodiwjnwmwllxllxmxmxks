package p01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.Avatar;
import java.util.ArrayList;
import java.util.List;
import yz0.l2;
import yz0.t7;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public final l2 A;
    public final boolean B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final boolean F;
    public final boolean G;
    public final e H;
    public final int I;
    public final d J;
    public final boolean K;
    public final boolean L;
    public final List M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final i01.a Q;
    public final List R;
    public final boolean S;
    public final boolean T;
    public final g U;
    public final g V;
    public final String W;
    public final boolean X;
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final Avatar g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final String s;
    public final int t;
    public final String u;
    public final int v;
    public final boolean w;
    public final ub.a x;
    public final boolean y;
    public final t7 z;

    public j(String str, String str2, String str3, String str4, String str5, String str6, Avatar avatar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, boolean z3, String str7, String str8, int i8, String str9, int i9, boolean z4, ub.a aVar, boolean z5, t7 t7Var, l2 l2Var, boolean z6, boolean z7, boolean z8, int i10, boolean z9, boolean z10, e eVar, int i12, d dVar, boolean z12, boolean z13, List list, boolean z14, boolean z15, boolean z16, i01.a aVar2, List list2, boolean z17, boolean z18, g gVar, g gVar2, String str10, boolean z19) {
        k71.k.g(avatar, "ownerAvatar");
        k71.k.g(t7Var, "repo");
        k71.k.g(gVar, "defaultHead");
        k71.k.g(gVar2, "head");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = avatar;
        this.h = i;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = i7;
        this.o = z;
        this.p = z2;
        this.q = z3;
        this.r = str7;
        this.s = str8;
        this.t = i8;
        this.u = str9;
        this.v = i9;
        this.w = z4;
        this.x = aVar;
        this.y = z5;
        this.z = t7Var;
        this.A = l2Var;
        this.B = z6;
        this.C = z7;
        this.D = z8;
        this.E = i10;
        this.F = z9;
        this.G = z10;
        this.H = eVar;
        this.I = i12;
        this.J = dVar;
        this.K = z12;
        this.L = z13;
        this.M = list;
        this.N = z14;
        this.O = z15;
        this.P = z16;
        this.Q = aVar2;
        this.R = list2;
        this.S = z17;
        this.T = z18;
        this.U = gVar;
        this.V = gVar2;
        this.W = str10;
        this.X = z19;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.util.List] */
    public static j a(j jVar, String str, String str2, int i, int i2, ub.a aVar, boolean z, boolean z2, ArrayList arrayList, i01.a aVar2, List list, g gVar, int i3, int i4) {
        boolean z3;
        ub.a aVar3;
        boolean z4;
        boolean z5;
        String str3 = jVar.a;
        String str4 = jVar.b;
        String str5 = jVar.c;
        String str6 = (i3 & 8) != 0 ? jVar.d : str;
        String str7 = (i3 & 16) != 0 ? jVar.e : str2;
        String str8 = str6;
        String str9 = jVar.f;
        String str10 = str7;
        Avatar avatar = jVar.g;
        int i5 = (i3 & 128) != 0 ? jVar.h : i;
        int i6 = (i3 & 256) != 0 ? jVar.i : i2;
        int i7 = i5;
        int i8 = jVar.j;
        int i9 = i6;
        int i10 = jVar.k;
        int i12 = jVar.l;
        int i13 = jVar.m;
        int i14 = jVar.n;
        boolean z6 = (i3 & 16384) != 0 ? jVar.o : true;
        boolean z7 = (i3 & 32768) != 0 ? jVar.p : false;
        boolean z8 = (i3 & 65536) != 0 ? jVar.q : true;
        String str11 = jVar.r;
        String str12 = jVar.s;
        int i15 = jVar.t;
        String str13 = jVar.u;
        int i16 = jVar.v;
        boolean z9 = jVar.w;
        if ((i3 & 8388608) != 0) {
            z3 = z9;
            aVar3 = jVar.x;
        } else {
            z3 = z9;
            aVar3 = aVar;
        }
        ub.a aVar4 = aVar3;
        boolean z10 = (i3 & 16777216) != 0 ? jVar.y : z;
        t7 t7Var = jVar.z;
        boolean z12 = z6;
        l2 l2Var = jVar.A;
        boolean z13 = jVar.B;
        boolean z14 = jVar.C;
        boolean z15 = jVar.D;
        int i17 = jVar.E;
        boolean z16 = jVar.F;
        if ((i4 & 1) != 0) {
            z4 = z16;
            z5 = jVar.G;
        } else {
            z4 = z16;
            z5 = false;
        }
        e eVar = jVar.H;
        int i18 = jVar.I;
        d dVar = jVar.J;
        boolean z17 = (i4 & 16) != 0 ? jVar.K : z2;
        boolean z18 = jVar.L;
        ArrayList arrayList2 = (i4 & 64) != 0 ? jVar.M : arrayList;
        boolean z19 = jVar.N;
        boolean z20 = jVar.O;
        boolean z22 = jVar.P;
        i01.a aVar5 = (i4 & 1024) != 0 ? jVar.Q : aVar2;
        List list2 = (i4 & 2048) != 0 ? jVar.R : list;
        boolean z23 = jVar.S;
        boolean z24 = jVar.T;
        g gVar2 = jVar.U;
        g gVar3 = (i4 & 32768) != 0 ? jVar.V : gVar;
        String str14 = jVar.W;
        boolean z25 = jVar.X;
        jVar.getClass();
        k71.k.g(avatar, "ownerAvatar");
        k71.k.g(t7Var, "repo");
        k71.k.g(gVar2, "defaultHead");
        k71.k.g(gVar3, "head");
        return new j(str3, str4, str5, str8, str10, str9, avatar, i7, i9, i8, i10, i12, i13, i14, z12, z7, z8, str11, str12, i15, str13, i16, z3, aVar4, z10, t7Var, l2Var, z13, z14, z15, i17, z4, z5, eVar, i18, dVar, z17, z18, arrayList2, z19, z20, z22, aVar5, list2, z23, z24, gVar2, gVar3, str14, z25);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return k71.k.b(this.a, jVar.a) && k71.k.b(this.b, jVar.b) && k71.k.b(this.c, jVar.c) && k71.k.b(this.d, jVar.d) && k71.k.b(this.e, jVar.e) && k71.k.b(this.f, jVar.f) && k71.k.b(this.g, jVar.g) && this.h == jVar.h && this.i == jVar.i && this.j == jVar.j && this.k == jVar.k && this.l == jVar.l && this.m == jVar.m && this.n == jVar.n && this.o == jVar.o && this.p == jVar.p && this.q == jVar.q && k71.k.b(this.r, jVar.r) && k71.k.b(this.s, jVar.s) && this.t == jVar.t && k71.k.b(this.u, jVar.u) && this.v == jVar.v && this.w == jVar.w && k71.k.b(this.x, jVar.x) && this.y == jVar.y && k71.k.b(this.z, jVar.z) && k71.k.b(this.A, jVar.A) && this.B == jVar.B && this.C == jVar.C && this.D == jVar.D && this.E == jVar.E && this.F == jVar.F && this.G == jVar.G && k71.k.b(this.H, jVar.H) && this.I == jVar.I && k71.k.b(this.J, jVar.J) && this.K == jVar.K && this.L == jVar.L && k71.k.b(this.M, jVar.M) && this.N == jVar.N && this.O == jVar.O && this.P == jVar.P && k71.k.b(this.Q, jVar.Q) && k71.k.b(this.R, jVar.R) && this.S == jVar.S && this.T == jVar.T && k71.k.b(this.U, jVar.U) && k71.k.b(this.V, jVar.V) && k71.k.b(this.W, jVar.W) && this.X == jVar.X;
    }

    public final int hashCode() {
        int hashCode = (this.z.hashCode() + x.i.e((this.x.hashCode() + x.i.e(s0.b(this.v, h1.i(s0.b(this.t, h1.i(h1.i(x.i.e(x.i.e(x.i.e(s0.b(this.n, s0.b(this.m, s0.b(this.l, s0.b(this.k, s0.b(this.j, s0.b(this.i, s0.b(this.h, h1.j(this.g, h1.i(h1.i(h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31), this.f, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.o), 31, this.p), 31, this.q), this.r, 31), this.s, 31), 31), this.u, 31), 31), 31, this.w)) * 31, 31, this.y)) * 31;
        l2 l2Var = this.A;
        int e = x.i.e(x.i.e(s0.b(this.E, x.i.e(x.i.e(x.i.e((hashCode + (l2Var == null ? 0 : l2Var.r.hashCode())) * 31, 31, this.B), 31, this.C), 31, this.D), 31), 31, this.F), 31, this.G);
        e eVar = this.H;
        int b = s0.b(this.I, (e + (eVar == null ? 0 : eVar.hashCode())) * 31, 31);
        d dVar = this.J;
        int e2 = x.i.e(x.i.e(x.i.e(f1.e.c(this.M, x.i.e(x.i.e((b + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.K), 31, this.L), 31), 31, this.N), 31, this.O), 31, this.P);
        i01.a aVar = this.Q;
        int hashCode2 = (this.V.hashCode() + ((this.U.hashCode() + x.i.e(x.i.e(f1.e.c(this.R, (e2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31), 31, this.S), 31, this.T)) * 31)) * 31;
        String str = this.W;
        return Boolean.hashCode(this.X) + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository(name=", this.a, ", shortDescriptionHtml=", this.b, ", description=");
        f1.e.x(o, this.c, ", readmeHtml=", this.d, ", readmePath=");
        f1.e.x(o, this.e, ", ownerLogin=", this.f, ", ownerAvatar=");
        o.append(this.g);
        o.append(", stargazersCount=");
        o.append(this.h);
        o.append(", watchersCount=");
        s0.z(o, this.i, ", issuesCount=", this.j, ", pullRequestsCount=");
        s0.z(o, this.k, ", projectsCount=", this.l, ", forkCount=");
        s0.z(o, this.m, ", contributorCount=", this.n, ", isPrivate=");
        m0.A(o, this.o, ", isArchived=", this.p, ", isTemplate=");
        m0.z(o, this.q, ", homepageUrl=", this.r, ", url=");
        s0.w(this.t, this.s, ", branchCount=", ", id=", o);
        s0.w(this.v, this.u, ", databaseId=", ", hasIssuesEnabled=", o);
        o.append(this.w);
        o.append(", subscription=");
        o.append(this.x);
        o.append(", isStarred=");
        o.append(this.y);
        o.append(", repo=");
        o.append(this.z);
        o.append(", license=");
        o.append(this.A);
        o.append(", isEmpty=");
        o.append(this.B);
        o.append(", isInOrganization=");
        m0.A(o, this.C, ", isDiscussionsEnabled=", this.D, ", discussionsCount=");
        m0.w(o, this.E, ", isFork=", this.F, ", forkingAllowed=");
        o.append(this.G);
        o.append(", parent=");
        o.append(this.H);
        o.append(", releasesCount=");
        o.append(this.I);
        o.append(", latestRelease=");
        o.append(this.J);
        o.append(", isFavoritedByViewer=");
        m0.A(o, this.K, ", hasBlockedContributors=", this.L, ", topContributors=");
        h1.C(o, this.M, ", viewerCanAdminister=", this.N, ", viewerCanPush=");
        m0.A(o, this.O, ", viewerBlockedByOwner=", this.P, ", mergeQueue=");
        o.append(this.Q);
        o.append(", listsMetadata=");
        o.append(this.R);
        o.append(", showActions=");
        m0.A(o, this.S, ", viewerCanEditRepoDescription=", this.T, ", defaultHead=");
        o.append(this.U);
        o.append(", head=");
        o.append(this.V);
        o.append(", existingForkUrl=");
        return m0.k(o, this.W, ", isAgentEnabled=", this.X, ")");
    }

    public Object i;
}
