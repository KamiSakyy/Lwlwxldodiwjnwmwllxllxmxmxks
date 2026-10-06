package kc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lq {
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public pq f;
    public xp g;
    public String h;
    public boolean i;
    public boolean j;
    public boolean k;
    public ZonedDateTime l;
    public ZonedDateTime m;
    public mq n;
    public bq o;
    public cq p;
    public aj0.c q;

    public lq(String str, String str2, String str3, String str4, String str5, pq pqVar, xp xpVar, String str6, boolean z, boolean z2, boolean z3, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, mq mqVar, bq bqVar, cq cqVar, aj0.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = pqVar;
        this.g = xpVar;
        this.h = str6;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = zonedDateTime;
        this.m = zonedDateTime2;
        this.n = mqVar;
        this.o = bqVar;
        this.p = cqVar;
        this.q = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq)) {
            return false;
        }
        lq lqVar = (lq) obj;
        return k71.k.b(this.a, lqVar.a) && k71.k.b(this.b, lqVar.b) && k71.k.b(this.c, lqVar.c) && k71.k.b(this.d, lqVar.d) && k71.k.b(this.e, lqVar.e) && k71.k.b(this.f, lqVar.f) && k71.k.b(this.g, lqVar.g) && k71.k.b(this.h, lqVar.h) && this.i == lqVar.i && this.j == lqVar.j && this.k == lqVar.k && k71.k.b(this.l, lqVar.l) && k71.k.b(this.m, lqVar.m) && k71.k.b(this.n, lqVar.n) && k71.k.b(this.o, lqVar.o) && k71.k.b(this.p, lqVar.p) && k71.k.b(this.q, lqVar.q);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
        String str = this.d;
        int i2 = com.github.rudroid.copilot.h1.i((i + (str == null ? 0 : str.hashCode())) * 31, this.e, 31);
        pq pqVar = this.f;
        int hashCode = (i2 + (pqVar == null ? 0 : pqVar.hashCode())) * 31;
        xp xpVar = this.g;
        int hashCode2 = (hashCode + (xpVar == null ? 0 : xpVar.hashCode())) * 31;
        String str2 = this.h;
        int a = com.github.rudroid.m0.a(this.l, x.i.e(x.i.e(x.i.e((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k), 31);
        ZonedDateTime zonedDateTime = this.m;
        int hashCode3 = (this.n.hashCode() + ((a + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        bq bqVar = this.o;
        int hashCode4 = (hashCode3 + (bqVar == null ? 0 : bqVar.hashCode())) * 31;
        cq cqVar = this.p;
        return this.q.hashCode() + ((hashCode4 + (cqVar != null ? cqVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Release(__typename=", this.a, ", id=", this.b, ", url=");
        f1.e.x(o, this.c, ", name=", this.d, ", tagName=");
        o.append(this.e);
        o.append(", tagCommit=");
        o.append(this.f);
        o.append(", author=");
        o.append(this.g);
        o.append(", descriptionHTML=");
        o.append(this.h);
        o.append(", isPrerelease=");
        com.github.rudroid.m0.A(o, this.i, ", isDraft=", this.j, ", isLatest=");
        jo.f4.B(", createdAt=", ", publishedAt=", o, this.l, this.k);
        o.append(this.m);
        o.append(", releaseAssets=");
        o.append(this.n);
        o.append(", discussion=");
        o.append(this.o);
        o.append(", mentions=");
        o.append(this.p);
        o.append(", reactionFragment=");
        o.append(this.q);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
