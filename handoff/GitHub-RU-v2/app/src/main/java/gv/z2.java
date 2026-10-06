package gv;

import java.time.ZonedDateTime;
import m10.b00;
import m10.jz;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z2 implements aa.h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final String d;
    public final String e;
    public final int f;
    public final ZonedDateTime g;
    public final q2 h;
    public final r2 i;
    public final Boolean j;
    public final Integer k;
    public final b00 l;
    public final x2 m;
    public final String n;
    public final ya0 o;
    public final jz p;
    public final m2 q;
    public final p2 r;
    public final n2 s;
    public final boolean t;
    public final t2 u;
    public final s2 v;
    public final lt.j w;
    public final l8 x;

    public z2(String str, String str2, boolean z, String str3, String str4, int i, ZonedDateTime zonedDateTime, q2 q2Var, r2 r2Var, Boolean bool, Integer num, b00 b00Var, x2 x2Var, String str5, ya0 ya0Var, jz jzVar, m2 m2Var, p2 p2Var, n2 n2Var, boolean z2, t2 t2Var, s2 s2Var, lt.j jVar, l8 l8Var) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = zonedDateTime;
        this.h = q2Var;
        this.i = r2Var;
        this.j = bool;
        this.k = num;
        this.l = b00Var;
        this.m = x2Var;
        this.n = str5;
        this.o = ya0Var;
        this.p = jzVar;
        this.q = m2Var;
        this.r = p2Var;
        this.s = n2Var;
        this.t = z2;
        this.u = t2Var;
        this.v = s2Var;
        this.w = jVar;
        this.x = l8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj;
        return k71.k.b(this.a, z2Var.a) && k71.k.b(this.b, z2Var.b) && this.c == z2Var.c && k71.k.b(this.d, z2Var.d) && k71.k.b(this.e, z2Var.e) && this.f == z2Var.f && k71.k.b(this.g, z2Var.g) && k71.k.b(this.h, z2Var.h) && k71.k.b(this.i, z2Var.i) && k71.k.b(this.j, z2Var.j) && k71.k.b(this.k, z2Var.k) && this.l == z2Var.l && k71.k.b(this.m, z2Var.m) && k71.k.b(this.n, z2Var.n) && this.o == z2Var.o && this.p == z2Var.p && k71.k.b(this.q, z2Var.q) && k71.k.b(this.r, z2Var.r) && k71.k.b(this.s, z2Var.s) && this.t == z2Var.t && k71.k.b(this.u, z2Var.u) && k71.k.b(this.v, z2Var.v) && k71.k.b(this.w, z2Var.w) && k71.k.b(this.x, z2Var.x);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.g, a0.s0.b(this.f, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(x.i.e(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c), this.d, 31), this.e, 31), 31), 31);
        q2 q2Var = this.h;
        int hashCode = (a + (q2Var == null ? 0 : q2Var.hashCode())) * 31;
        r2 r2Var = this.i;
        int hashCode2 = (hashCode + (r2Var == null ? 0 : r2Var.hashCode())) * 31;
        Boolean bool = this.j;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.k;
        int i = com.github.rudroid.copilot.h1.i((this.m.hashCode() + ((this.l.hashCode() + ((hashCode3 + (num == null ? 0 : num.hashCode())) * 31)) * 31)) * 31, this.n, 31);
        ya0 ya0Var = this.o;
        int hashCode4 = (i + (ya0Var == null ? 0 : ya0Var.hashCode())) * 31;
        jz jzVar = this.p;
        int hashCode5 = (this.r.hashCode() + ((this.q.hashCode() + ((hashCode4 + (jzVar == null ? 0 : jzVar.hashCode())) * 31)) * 31)) * 31;
        n2 n2Var = this.s;
        int e = x.i.e((hashCode5 + (n2Var == null ? 0 : Integer.hashCode(n2Var.a))) * 31, 31, this.t);
        t2 t2Var = this.u;
        int hashCode6 = (e + (t2Var == null ? 0 : t2Var.hashCode())) * 31;
        s2 s2Var = this.v;
        return this.x.hashCode() + ((this.w.hashCode() + ((hashCode6 + (s2Var != null ? s2Var.hashCode() : 0)) * 31)) * 31);
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
        o.append(", assignedActors=");
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
