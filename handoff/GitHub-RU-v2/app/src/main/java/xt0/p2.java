package xt0;

import java.time.ZonedDateTime;
import pz0.f40;
import pz0.gu;
import pz0.ot;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 implements aa.h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final int f;
    public final ZonedDateTime g;
    public final g2 h;
    public final h2 i;
    public final Boolean j;
    public final Integer k;
    public final gu l;
    public final n2 m;
    public final String n;
    public final f40 o;
    public final ot p;
    public final c2 q;
    public final f2 r;
    public final d2 s;
    public final boolean t;
    public final j2 u;
    public final i2 v;
    public final cs0.j w;
    public final z7 x;

    public p2(String str, String str2, boolean z, String str3, String str4, int i, ZonedDateTime zonedDateTime, g2 g2Var, h2 h2Var, Boolean bool, Integer num, gu guVar, n2 n2Var, String str5, f40 f40Var, ot otVar, c2 c2Var, f2 f2Var, d2 d2Var, boolean z2, j2 j2Var, i2 i2Var, cs0.j jVar, z7 z7Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = zonedDateTime;
        this.h = g2Var;
        this.i = h2Var;
        this.j = bool;
        this.k = num;
        this.l = guVar;
        this.m = n2Var;
        this.n = str5;
        this.o = f40Var;
        this.p = otVar;
        this.q = c2Var;
        this.r = f2Var;
        this.s = d2Var;
        this.t = z2;
        this.u = j2Var;
        this.v = i2Var;
        this.w = jVar;
        this.x = z7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2)) {
            return false;
        }
        p2 p2Var = (p2) obj;
        return k71.k.b(this.a, p2Var.a) && k71.k.b(this.b, p2Var.b) && this.c == p2Var.c && k71.k.b(this.d, p2Var.d) && k71.k.b(this.e, p2Var.e) && this.f == p2Var.f && k71.k.b(this.g, p2Var.g) && k71.k.b(this.h, p2Var.h) && k71.k.b(this.i, p2Var.i) && k71.k.b(this.j, p2Var.j) && k71.k.b(this.k, p2Var.k) && this.l == p2Var.l && k71.k.b(this.m, p2Var.m) && k71.k.b(this.n, p2Var.n) && this.o == p2Var.o && this.p == p2Var.p && k71.k.b(this.q, p2Var.q) && k71.k.b(this.r, p2Var.r) && k71.k.b(this.s, p2Var.s) && this.t == p2Var.t && k71.k.b(this.u, p2Var.u) && k71.k.b(this.v, p2Var.v) && k71.k.b(this.w, p2Var.w) && k71.k.b(this.x, p2Var.x);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.g, a0.s0.b(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31), this.e, 31), 31), 31);
        g2 g2Var = this.h;
        int hashCode = (a + (g2Var == null ? 0 : g2Var.hashCode())) * 31;
        h2 h2Var = this.i;
        int hashCode2 = (hashCode + (h2Var == null ? 0 : h2Var.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.k;
        int i = com.github.rudroid.copilot.h1.i((this.m.hashCode() + ((this.l.hashCode() + ((hashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, this.n, 31);
        f40 f40Var = this.o;
        int hashCode4 = (i + (f40Var == null ? 0 : f40Var.hashCode())) * 31;
        ot otVar = this.p;
        int hashCode5 = (this.r.hashCode() + ((this.q.hashCode() + ((hashCode4 + (otVar == null ? 0 : otVar.hashCode())) * 31)) * 31)) * 31;
        d2 d2Var = this.s;
        int e = x.i.e((hashCode5 + (d2Var == null ? 0 : Integer.hashCode(d2Var.a))) * 31, 31, this.t);
        j2 j2Var = this.u;
        int hashCode6 = (e + (j2Var == null ? 0 : j2Var.hashCode())) * 31;
        i2 i2Var = this.v;
        return this.x.hashCode() + ((this.w.hashCode() + ((hashCode6 + (i2Var != null ? i2Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("PullRequestItemFragment(__typename=", this.a, ", id=", this.b, ", isDraft=");
        com.github.rudroid.m0.z(o, this.c, ", title=", this.d, ", titleHTMLString=");
        a0.s0.w(this.f, this.e, ", number=", ", createdAt=", o);
        o.append(this.g);
        o.append(", headRepository=");
        o.append(this.h);
        o.append(", headRepositoryOwner=");
        o.append(this.i);
        o.append(", isReadByViewer=");
        o.append(this.j);
        o.append(", totalCommentsCount=");
        o.append(this.k);
        o.append(", pullRequestState=");
        o.append(this.l);
        o.append(", repository=");
        o.append(this.m);
        o.append(", url=");
        o.append(this.n);
        o.append(", viewerSubscription=");
        o.append(this.o);
        o.append(", reviewDecision=");
        o.append(this.p);
        o.append(", assignees=");
        o.append(this.q);
        o.append(", commits=");
        o.append(this.r);
        o.append(", closingIssuesReferences=");
        o.append(this.s);
        o.append(", isInMergeQueue=");
        o.append(this.t);
        o.append(", mergeQueueEntry=");
        o.append(this.u);
        o.append(", mergeQueue=");
        o.append(this.v);
        o.append(", labelsFragment=");
        o.append(this.w);
        o.append(", viewerLatestReviewRequestStateFragment=");
        o.append(this.x);
        o.append(")");
        return o.toString();
    }
}
