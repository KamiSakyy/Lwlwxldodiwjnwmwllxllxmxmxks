package iy0;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import jo.f4;
import pz0.bf;
import pz0.df;
import uu0.d6;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final bf g;
    public final ZonedDateTime h;
    public final Integer i;
    public final df j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final ZonedDateTime p;
    public final boolean q;
    public final boolean r;
    public final m s;
    public final o t;
    public final d6 u;
    public final uu0.r0 v;

    public p(String str, String str2, String str3, int i, String str4, boolean z, bf bfVar, ZonedDateTime zonedDateTime, Integer num, df dfVar, int i2, int i3, boolean z2, boolean z3, boolean z4, ZonedDateTime zonedDateTime2, boolean z5, boolean z6, m mVar, o oVar, d6 d6Var, uu0.r0 r0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = z;
        this.g = bfVar;
        this.h = zonedDateTime;
        this.i = num;
        this.j = dfVar;
        this.k = i2;
        this.l = i3;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = zonedDateTime2;
        this.q = z5;
        this.r = z6;
        this.s = mVar;
        this.t = oVar;
        this.u = d6Var;
        this.v = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c) && this.d == pVar.d && k71.k.b(this.e, pVar.e) && this.f == pVar.f && this.g == pVar.g && k71.k.b(this.h, pVar.h) && k71.k.b(this.i, pVar.i) && this.j == pVar.j && this.k == pVar.k && this.l == pVar.l && this.m == pVar.m && this.n == pVar.n && this.o == pVar.o && k71.k.b(this.p, pVar.p) && this.q == pVar.q && this.r == pVar.r && k71.k.b(this.s, pVar.s) && k71.k.b(this.t, pVar.t) && k71.k.b(this.u, pVar.u) && k71.k.b(this.v, pVar.v);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.h, (this.g.hashCode() + x.i.e(h1.i(a0.s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), this.e, 31), 31, this.f)) * 31, 31);
        Integer num = this.i;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        df dfVar = this.j;
        int e = x.i.e(x.i.e(com.github.rudroid.m0.a(this.p, x.i.e(x.i.e(x.i.e(a0.s0.b(this.l, a0.s0.b(this.k, (hashCode + (dfVar == null ? 0 : dfVar.hashCode())) * 31, 31), 31), 31, this.m), 31, this.n), 31, this.o), 31), 31, this.q), 31, this.r);
        m mVar = this.s;
        return this.v.hashCode() + ((this.u.hashCode() + ((this.t.hashCode() + ((e + (mVar != null ? mVar.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2ContentIssue(__typename=", this.a, ", id=", this.b, ", title=");
        a0.s0.w(this.d, this.c, ", number=", ", url=", o);
        com.github.rudroid.m0.x(o, this.e, ", locked=", this.f, ", issueState=");
        o.append(this.g);
        o.append(", updatedAt=");
        o.append(this.h);
        o.append(", totalCommentsCount=");
        o.append(this.i);
        o.append(", stateReason=");
        o.append(this.j);
        o.append(", completedTasksCount=");
        a0.s0.z(o, this.k, ", totalTaskCount=", this.l, ", viewerCanReopen=");
        com.github.rudroid.m0.A(o, this.m, ", viewerCanUpdate=", this.n, ", viewerDidAuthor=");
        f4.B(", createdAt=", ", viewerCanAssign=", o, this.p, this.o);
        com.github.rudroid.m0.A(o, this.q, ", viewerCanLabel=", this.r, ", issueType=");
        o.append(this.s);
        o.append(", repository=");
        o.append(this.t);
        o.append(", subIssueProgressFragment=");
        o.append(this.u);
        o.append(", parentIssueFragment=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }
}
