package f00;

import java.time.ZonedDateTime;
import jo.f4;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w implements aa.h0 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final boolean f;
    public final b00 g;
    public final boolean h;
    public final boolean i;
    public final ZonedDateTime j;
    public final ZonedDateTime k;
    public final Integer l;
    public final int m;
    public final int n;
    public final String o;
    public final String p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final rt.e v;

    public w(String str, String str2, String str3, int i, String str4, boolean z, b00 b00Var, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, Integer num, int i2, int i3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, rt.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = z;
        this.g = b00Var;
        this.h = z2;
        this.i = z3;
        this.j = zonedDateTime;
        this.k = zonedDateTime2;
        this.l = num;
        this.m = i2;
        this.n = i3;
        this.o = str5;
        this.p = str6;
        this.q = z4;
        this.r = z5;
        this.s = z6;
        this.t = z7;
        this.u = z8;
        this.v = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return k71.k.b(this.a, wVar.a) && k71.k.b(this.b, wVar.b) && k71.k.b(this.c, wVar.c) && this.d == wVar.d && k71.k.b(this.e, wVar.e) && this.f == wVar.f && this.g == wVar.g && this.h == wVar.h && this.i == wVar.i && k71.k.b(this.j, wVar.j) && k71.k.b(this.k, wVar.k) && k71.k.b(this.l, wVar.l) && this.m == wVar.m && this.n == wVar.n && k71.k.b(this.o, wVar.o) && k71.k.b(this.p, wVar.p) && this.q == wVar.q && this.r == wVar.r && this.s == wVar.s && this.t == wVar.t && this.u == wVar.u && k71.k.b(this.v, wVar.v);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.k, com.github.rudroid.m0.a(this.j, x.i.e(x.i.e((this.g.hashCode() + x.i.e(com.github.rudroid.copilot.h1.i(a0.s0.b(this.d, com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), this.e, 31), 31, this.f)) * 31, 31, this.h), 31, this.i), 31), 31);
        Integer num = this.l;
        return this.v.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(a0.s0.b(this.n, a0.s0.b(this.m, (a + (num == null ? 0 : num.hashCode())) * 31, 31), 31), this.o, 31), this.p, 31), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("ProjectV2ContentPullRequest(__typename=", this.a, ", id=", this.b, ", title=");
        a0.s0.w(this.d, this.c, ", number=", ", url=", o);
        com.github.rudroid.m0.x(o, this.e, ", locked=", this.f, ", pullRequestState=");
        o.append(this.g);
        o.append(", isDraft=");
        o.append(this.h);
        o.append(", isInMergeQueue=");
        f4.B(", updatedAt=", ", createdAt=", o, this.j, this.i);
        o.append(this.k);
        o.append(", totalCommentsCount=");
        o.append(this.l);
        o.append(", completedTasksCount=");
        a0.s0.z(o, this.m, ", totalTaskCount=", this.n, ", baseRefName=");
        f1.e.x(o, this.o, ", headRefName=", this.p, ", viewerCanReopen=");
        com.github.rudroid.m0.A(o, this.q, ", viewerCanUpdate=", this.r, ", viewerDidAuthor=");
        com.github.rudroid.m0.A(o, this.s, ", viewerCanAssign=", this.t, ", viewerCanLabel=");
        o.append(this.u);
        o.append(", linkedIssues=");
        o.append(this.v);
        o.append(")");
        return o.toString();
    }
}
