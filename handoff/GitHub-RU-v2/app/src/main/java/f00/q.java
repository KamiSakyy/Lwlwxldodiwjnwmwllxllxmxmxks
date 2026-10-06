package f00;

import dw.z6;
import java.time.ZonedDateTime;
import jo.f4Shadow;
import m10.wi;
import m10.yi;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public boolean f;
    public wi g;
    public ZonedDateTime h;
    public Integer i;
    public yi j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public boolean o;
    public ZonedDateTime p;
    public boolean q;
    public boolean r;
    public n s;
    public p t;
    public m u;
    public z6 v;
    public dw.s0 w;

    public q(String str, String str2, String str3, int i, String str4, boolean z, wi wiVar, ZonedDateTime zonedDateTime, Integer num, yi yiVar, int i2, int i3, boolean z2, boolean z3, boolean z4, ZonedDateTime zonedDateTime2, boolean z5, boolean z6, n nVar, p pVar, m mVar, z6 z6Var, dw.s0 s0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = z;
        this.g = wiVar;
        this.h = zonedDateTime;
        this.i = num;
        this.j = yiVar;
        this.k = i2;
        this.l = i3;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = zonedDateTime2;
        this.q = z5;
        this.r = z6;
        this.s = nVar;
        this.t = pVar;
        this.u = mVar;
        this.v = z6Var;
        this.w = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.a, qVar.a) && k71.k.b(this.b, qVar.b) && k71.k.b(this.c, qVar.c) && this.d == qVar.d && k71.k.b(this.e, qVar.e) && this.f == qVar.f && this.g == qVar.g && k71.k.b(this.h, qVar.h) && k71.k.b(this.i, qVar.i) && this.j == qVar.j && this.k == qVar.k && this.l == qVar.l && this.m == qVar.m && this.n == qVar.n && this.o == qVar.o && k71.k.b(this.p, qVar.p) && this.q == qVar.q && this.r == qVar.r && k71.k.b(this.s, qVar.s) && k71.k.b(this.t, qVar.t) && k71.k.b(this.u, qVar.u) && k71.k.b(this.v, qVar.v) && k71.k.b(this.w, qVar.w);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.h, (this.g.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), this.e, 31), 31, this.f)) * 31, 31);
        Integer num = this.i;
        int hashCode = (a + (num == null ? 0 : num.hashCode())) * 31;
        yi yiVar = this.j;
        int e = x.i.e(x.i.e(com.github.rudroid.m0.a(this.p, x.i.e(x.i.e(x.i.e(a0.s0.b(this.l, a0.s0.b(this.k, (hashCode + (yiVar == null ? 0 : yiVar.hashCode())) * 31, 31), 31), 31, this.m), 31, this.n), 31, this.o), 31), 31, this.q), 31, this.r);
        n nVar = this.s;
        int hashCode2 = (this.t.hashCode() + ((e + (nVar == null ? 0 : nVar.hashCode())) * 31)) * 31;
        m mVar = this.u;
        int hashCode3 = mVar != null ? mVar.hashCode() : 0;
        return this.w.hashCode() + ((this.v.hashCode() + ((hashCode2 + hashCode3) * 31)) * 31);
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
        o.append(", duplicateOf=");
        o.append(this.u);
        o.append(", subIssueProgressFragment=");
        o.append(this.v);
        o.append(", parentIssueFragment=");
        o.append(this.w);
        o.append(")");
        return o.toString();
    }
}
