package ri0;

import gn0.hn;
import gn0.kw;
import gn0.pm;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p2 implements aa.h0 {
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public int f;
    public ZonedDateTime g;
    public g2 h;
    public h2 i;
    public Boolean j;
    public Integer k;
    public hn l;
    public n2 m;
    public String n;
    public kw o;
    public pm p;
    public c2 q;
    public f2 r;
    public d2 s;
    public boolean t;
    public j2 u;
    public i2 v;
    public sg0.j w;
    public h8 x;

    public p2(String str, String str2, boolean z, String str3, String str4, int i, ZonedDateTime zonedDateTime, g2 g2Var, h2 h2Var, Boolean bool, Integer num, hn hnVar, n2 n2Var, String str5, kw kwVar, pm pmVar, c2 c2Var, f2 f2Var, d2 d2Var, boolean z2, j2 j2Var, i2 i2Var, sg0.j jVar, h8 h8Var) {
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
        this.l = hnVar;
        this.m = n2Var;
        this.n = str5;
        this.o = kwVar;
        this.p = pmVar;
        this.q = c2Var;
        this.r = f2Var;
        this.s = d2Var;
        this.t = z2;
        this.u = j2Var;
        this.v = i2Var;
        this.w = jVar;
        this.x = h8Var;
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
        kw kwVar = this.o;
        int hashCode4 = (i + (kwVar == null ? 0 : kwVar.hashCode())) * 31;
        pm pmVar = this.p;
        int hashCode5 = (this.r.hashCode() + ((this.q.hashCode() + ((hashCode4 + (pmVar == null ? 0 : pmVar.hashCode())) * 31)) * 31)) * 31;
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
