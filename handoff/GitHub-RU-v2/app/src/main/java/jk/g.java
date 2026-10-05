package jk;

import b01.k;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import com.github.service.models.response.type.CommentAuthorAssociation;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final boolean A;
    public final boolean a;
    public final lj.a b;
    public final String c;
    public final f d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final String o;
    public final String p;
    public final List q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final k y;
    public final CommentAuthorAssociation z;

    public g(boolean z, lj.a aVar, String str, f fVar, String str2, String str3, String str4, String str5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, String str6, String str7, String str8, List list, boolean z7, boolean z8, boolean z9, boolean z11, boolean z12, boolean z13, boolean z14, k kVar, CommentAuthorAssociation commentAuthorAssociation, boolean z15) {
        k71.k.g(commentAuthorAssociation, "authorAssociation");
        this.a = z;
        this.b = aVar;
        this.c = str;
        this.d = fVar;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z2;
        this.j = z3;
        this.k = z4;
        this.l = z5;
        this.m = z6;
        this.n = str6;
        this.o = str7;
        this.p = str8;
        this.q = list;
        this.r = z7;
        this.s = z8;
        this.t = z9;
        this.u = z11;
        this.v = z12;
        this.w = z13;
        this.x = z14;
        this.y = kVar;
        this.z = commentAuthorAssociation;
        this.A = z15;
    }

    public static g a(g gVar, boolean z, k kVar, int i) {
        boolean z2 = (i & 1) != 0 ? gVar.a : z;
        lj.a aVar = gVar.b;
        String str = gVar.c;
        f fVar = gVar.d;
        String str2 = gVar.e;
        String str3 = gVar.f;
        String str4 = gVar.g;
        String str5 = gVar.h;
        boolean z3 = gVar.i;
        boolean z4 = gVar.j;
        boolean z5 = gVar.k;
        boolean z6 = gVar.l;
        boolean z7 = gVar.m;
        String str6 = gVar.n;
        String str7 = gVar.o;
        String str8 = gVar.p;
        List list = gVar.q;
        boolean z8 = gVar.r;
        boolean z9 = gVar.s;
        boolean z11 = gVar.t;
        boolean z12 = gVar.u;
        boolean z13 = gVar.v;
        boolean z14 = gVar.w;
        boolean z15 = gVar.x;
        k kVar2 = (i & 16777216) != 0 ? gVar.y : kVar;
        CommentAuthorAssociation commentAuthorAssociation = gVar.z;
        boolean z16 = gVar.A;
        k71.k.g(commentAuthorAssociation, "authorAssociation");
        return new g(z2, aVar, str, fVar, str2, str3, str4, str5, z3, z4, z5, z6, z7, str6, str7, str8, list, z8, z9, z11, z12, z13, z14, z15, kVar2, commentAuthorAssociation, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && k71.k.b(this.b, gVar.b) && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d) && k71.k.b(this.e, gVar.e) && k71.k.b(this.f, gVar.f) && k71.k.b(this.g, gVar.g) && k71.k.b(this.h, gVar.h) && this.i == gVar.i && this.j == gVar.j && this.k == gVar.k && this.l == gVar.l && this.m == gVar.m && k71.k.b(this.n, gVar.n) && k71.k.b(this.o, gVar.o) && k71.k.b(this.p, gVar.p) && k71.k.b(this.q, gVar.q) && this.r == gVar.r && this.s == gVar.s && this.t == gVar.t && this.u == gVar.u && this.v == gVar.v && this.w == gVar.w && this.x == gVar.x && k71.k.b(this.y, gVar.y) && this.z == gVar.z && this.A == gVar.A;
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(f1.e.c(this.q, h1.i(h1.i(h1.i(x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(h1.i(h1.i(h1.i(h1.i((this.d.hashCode() + h1.i((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31, this.c, 31)) * 31, this.e, 31), this.f, 31), this.g, 31), this.h, 31), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), this.n, 31), this.o, 31), this.p, 31), 31), 31, this.r), 31, this.s), 31, this.t), 31, this.u), 31, this.v), 31, this.w), 31, this.x);
        k kVar = this.y;
        return Boolean.hashCode(this.A) + ((this.z.hashCode() + ((e + (kVar == null ? 0 : kVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionDetailData(isLoading=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", authorId=");
        sb.append(this.c);
        sb.append(", discussionData=");
        sb.append(this.d);
        sb.append(", repoId=");
        f1.e.x(sb, this.e, ", repoOwner=", this.f, ", repoOwnerId=");
        f1.e.x(sb, this.g, ", repoName=", this.h, ", viewerIsAuthor=");
        m0.A(sb, this.i, ", viewerCanManage=", this.j, ", viewerCanUpdate=");
        m0.A(sb, this.k, ", viewerCanCommentIfLocked=", this.l, ", viewerCanReactIfLocked=");
        m0.z(sb, this.m, ", bodyHtml=", this.n, ", bodyText=");
        f1.e.x(sb, this.o, ", url=", this.p, ", reactions=");
        h1.C(sb, this.q, ", viewerCanReact=", this.r, ", viewerCanUpvote=");
        m0.A(sb, this.s, ", isSubscribed=", this.t, ", isLocked=");
        m0.A(sb, this.u, ", viewerCanDelete=", this.v, ", viewerCanBlockFromOrg=");
        m0.A(sb, this.w, ", viewerCanUnblockFromOrg=", this.x, ", poll=");
        sb.append(this.y);
        sb.append(", authorAssociation=");
        sb.append(this.z);
        sb.append(", isOrganizationDiscussion=");
        return f4.s(sb, this.A, ")");
    }
}
