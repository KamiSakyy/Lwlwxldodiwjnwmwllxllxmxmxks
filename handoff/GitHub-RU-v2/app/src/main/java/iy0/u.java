package iy0;

import com.github.rudroid.copilot.h1;
import java.time.ZonedDateTime;
import jo.f4;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u implements aa.h0 {
    public String a;
    public String b;
    public String c;
    public int d;
    public String e;
    public boolean f;
    public gu g;
    public boolean h;
    public boolean i;
    public ZonedDateTime j;
    public ZonedDateTime k;
    public Integer l;
    public int m;
    public int n;
    public String o;
    public String p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public is0.e v;

    public u(String str, String str2, String str3, int i, String str4, boolean z, gu guVar, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, Integer num, int i2, int i3, String str5, String str6, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, is0.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = z;
        this.g = guVar;
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
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && k71.k.b(this.b, uVar.b) && k71.k.b(this.c, uVar.c) && this.d == uVar.d && k71.k.b(this.e, uVar.e) && this.f == uVar.f && this.g == uVar.g && this.h == uVar.h && this.i == uVar.i && k71.k.b(this.j, uVar.j) && k71.k.b(this.k, uVar.k) && k71.k.b(this.l, uVar.l) && this.m == uVar.m && this.n == uVar.n && k71.k.b(this.o, uVar.o) && k71.k.b(this.p, uVar.p) && this.q == uVar.q && this.r == uVar.r && this.s == uVar.s && this.t == uVar.t && this.u == uVar.u && k71.k.b(this.v, uVar.v);
    }

    public final int hashCode() {
        int a = com.github.rudroid.m0.a(this.k, com.github.rudroid.m0.a(this.j, x.i.e(x.i.e((this.g.hashCode() + x.i.e(h1.i(a0.s0.b(this.d, h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), 31), this.e, 31), 31, this.f)) * 31, 31, this.h), 31, this.i), 31), 31);
        Integer num = this.l;
        return this.v.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e(x.i.e(h1.i(h1.i(a0.s0.b(this.n, a0.s0.b(this.m, (a + (num == null ? 0 : num.hashCode())) * 31, 31), 31), this.o, 31), this.p, 31), 31, this.q), 31, this.r), 31, this.s), 31, this.t), 31, this.u);
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

    public Object i;
}
