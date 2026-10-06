package is;

import java.time.ZonedDateTime;
import m10.p5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final ZonedDateTime d;
    public final ZonedDateTime e;
    public final ZonedDateTime f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final p5 k;
    public final String l;
    public final o0 m;
    public final ZonedDateTime n;
    public final g0 o;
    public final i0 p;
    public final h0 q;
    public final j0 r;
    public final m0 s;
    public final lt.j t;
    public final i1 u;
    public final k v;

    public p0(String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, int i, boolean z, boolean z2, boolean z3, p5 p5Var, String str4, o0 o0Var, ZonedDateTime zonedDateTime4, g0 g0Var, i0 i0Var, h0 h0Var, j0 j0Var, m0 m0Var, lt.j jVar, i1 i1Var, k kVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zonedDateTime;
        this.e = zonedDateTime2;
        this.f = zonedDateTime3;
        this.g = i;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.k = p5Var;
        this.l = str4;
        this.m = o0Var;
        this.n = zonedDateTime4;
        this.o = g0Var;
        this.p = i0Var;
        this.q = h0Var;
        this.r = j0Var;
        this.s = m0Var;
        this.t = jVar;
        this.u = i1Var;
        this.v = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return k71.k.b(this.a, p0Var.a) && k71.k.b(this.b, p0Var.b) && k71.k.b(this.c, p0Var.c) && k71.k.b(this.d, p0Var.d) && k71.k.b(this.e, p0Var.e) && k71.k.b(this.f, p0Var.f) && this.g == p0Var.g && this.h == p0Var.h && this.i == p0Var.i && this.j == p0Var.j && this.k == p0Var.k && k71.k.b(this.l, p0Var.l) && k71.k.b(this.m, p0Var.m) && k71.k.b(this.n, p0Var.n) && k71.k.b(this.o, p0Var.o) && k71.k.b(this.p, p0Var.p) && k71.k.b(this.q, p0Var.q) && k71.k.b(this.r, p0Var.r) && k71.k.b(this.s, p0Var.s) && k71.k.b(this.t, p0Var.t) && k71.k.b(this.u, p0Var.u) && k71.k.b(this.v, p0Var.v);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.e, com.github.rudroid.m0.a(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), 31);
        ZonedDateTime zonedDateTime = this.f;
        int hashCode = (this.m.hashCode() + com.github.rudroid.copilot.h1.i((this.k.hashCode() + x.i.e(x.i.e(x.i.e(a0.s0.b(this.g, (a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31), 31, this.h), 31, this.i), 31, this.j)) * 31, this.l, 31)) * 31;
        ZonedDateTime zonedDateTime2 = this.n;
        int hashCode2 = (hashCode + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        g0 g0Var = this.o;
        int hashCode3 = (this.p.hashCode() + ((hashCode2 + (g0Var == null ? 0 : g0Var.hashCode())) * 31)) * 31;
        h0 h0Var = this.q;
        int b = a0.s0.b(this.r.a, (hashCode3 + (h0Var == null ? 0 : h0Var.hashCode())) * 31, 31);
        m0 m0Var = this.s;
        return this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((b + (m0Var != null ? m0Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionFragment(__typename=", this.a, ", id=", this.b, ", title=");
        com.github.rudroid.copilot.h1.A(this.c, ", updatedAt=", ", createdAt=", o, this.d);
        com.github.rudroid.copilot.h1.B(o, this.e, ", lastEditedAt=", this.f, ", number=");
        com.github.rudroid.m0.w(o, this.g, ", viewerDidAuthor=", this.h, ", viewerCanUpdate=");
        com.github.rudroid.m0.A(o, this.i, ", viewerCanUpvote=", this.j, ", authorAssociation=");
        o.append(this.k);
        o.append(", url=");
        o.append(this.l);
        o.append(", repository=");
        o.append(this.m);
        o.append(", answerChosenAt=");
        o.append(this.n);
        o.append(", answer=");
        o.append(this.o);
        o.append(", category=");
        o.append(this.p);
        o.append(", author=");
        o.append(this.q);
        o.append(", comments=");
        o.append(this.r);
        o.append(", poll=");
        o.append(this.s);
        o.append(", labelsFragment=");
        o.append(this.t);
        o.append(", upvoteFragment=");
        o.append(this.u);
        o.append(", discussionClosedStateFragment=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1) { return null; }
}
