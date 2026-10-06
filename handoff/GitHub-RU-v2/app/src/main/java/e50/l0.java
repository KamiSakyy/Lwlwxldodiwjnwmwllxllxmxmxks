package e50;

import com.github.rudroid.copilot.h1;
import hc0.p3;
import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 implements aa.h0 {
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
    public final p3 k;
    public final String l;
    public final k0 m;
    public final ZonedDateTime n;
    public final c0 o;
    public final e0 p;
    public final d0 q;
    public final f0 r;
    public final i0 s;
    public final c60.j t;
    public final d1 u;
    public final j v;

    public l0(String str, String str2, String str3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, int i, boolean z, boolean z2, boolean z3, p3 p3Var, String str4, k0 k0Var, ZonedDateTime zonedDateTime4, c0 c0Var, e0 e0Var, d0 d0Var, f0 f0Var, i0 i0Var, c60.j jVar, d1 d1Var, j jVar2) {
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
        this.k = p3Var;
        this.l = str4;
        this.m = k0Var;
        this.n = zonedDateTime4;
        this.o = c0Var;
        this.p = e0Var;
        this.q = d0Var;
        this.r = f0Var;
        this.s = i0Var;
        this.t = jVar;
        this.u = d1Var;
        this.v = jVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b) && k71.k.b(this.c, l0Var.c) && k71.k.b(this.d, l0Var.d) && k71.k.b(this.e, l0Var.e) && k71.k.b(this.f, l0Var.f) && this.g == l0Var.g && this.h == l0Var.h && this.i == l0Var.i && this.j == l0Var.j && this.k == l0Var.k && k71.k.b(this.l, l0Var.l) && k71.k.b(this.m, l0Var.m) && k71.k.b(this.n, l0Var.n) && k71.k.b(this.o, l0Var.o) && k71.k.b(this.p, l0Var.p) && k71.k.b(this.q, l0Var.q) && k71.k.b(this.r, l0Var.r) && k71.k.b(this.s, l0Var.s) && k71.k.b(this.t, l0Var.t) && k71.k.b(this.u, l0Var.u) && k71.k.b(this.v, l0Var.v);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.e, com.github.rudroid.m0.a(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), 31);
        ZonedDateTime zonedDateTime = this.f;
        int hashCode = (this.m.hashCode() + h1.i((this.k.hashCode() + x.i.e(x.i.e(x.i.e(a0.s0.b(this.g, (a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31, 31), 31, this.h), 31, this.i), 31, this.j)) * 31, this.l, 31)) * 31;
        ZonedDateTime zonedDateTime2 = this.n;
        int hashCode2 = (hashCode + (zonedDateTime2 == null ? 0 : zonedDateTime2.hashCode())) * 31;
        c0 c0Var = this.o;
        int hashCode3 = (this.p.hashCode() + ((hashCode2 + (c0Var == null ? 0 : c0Var.hashCode())) * 31)) * 31;
        d0 d0Var = this.q;
        int b = a0.s0.b(this.r.a, (hashCode3 + (d0Var == null ? 0 : d0Var.hashCode())) * 31, 31);
        i0 i0Var = this.s;
        return this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((b + (i0Var != null ? i0Var.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionFragment(__typename=", this.a, ", id=", this.b, ", title=");
        h1.A(this.c, ", updatedAt=", ", createdAt=", o, this.d);
        h1.B(o, this.e, ", lastEditedAt=", this.f, ", number=");
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
}
