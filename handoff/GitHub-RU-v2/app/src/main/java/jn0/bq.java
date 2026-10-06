package jn0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class bq {
    public final String a;
    public final String b;
    public final pz0.wt c;
    public final String d;
    public final boolean e;
    public final ZonedDateTime f;
    public final eq g;
    public final sp h;
    public final fq i;
    public final jq j;
    public final yp0.c k;
    public final gu0.c l;
    public final bw0.c m;
    public final gt0.a n;

    public bq(String str, String str2, pz0.wt wtVar, String str3, boolean z, ZonedDateTime zonedDateTime, eq eqVar, sp spVar, fq fqVar, jq jqVar, yp0.c cVar, gu0.c cVar2, bw0.c cVar3, gt0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = wtVar;
        this.d = str3;
        this.e = z;
        this.f = zonedDateTime;
        this.g = eqVar;
        this.h = spVar;
        this.i = fqVar;
        this.j = jqVar;
        this.k = cVar;
        this.l = cVar2;
        this.m = cVar3;
        this.n = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq)) {
            return false;
        }
        bq bqVar = (bq) obj;
        return k71.k.b(this.a, bqVar.a) && k71.k.b(this.b, bqVar.b) && this.c == bqVar.c && k71.k.b(this.d, bqVar.d) && this.e == bqVar.e && k71.k.b(this.f, bqVar.f) && k71.k.b(this.g, bqVar.g) && k71.k.b(this.h, bqVar.h) && k71.k.b(this.i, bqVar.i) && k71.k.b(this.j, bqVar.j) && k71.k.b(this.k, bqVar.k) && k71.k.b(this.l, bqVar.l) && k71.k.b(this.m, bqVar.m) && k71.k.b(this.n, bqVar.n);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), 31, this.e);
        ZonedDateTime zonedDateTime = this.f;
        int hashCode = (this.g.hashCode() + ((e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        sp spVar = this.h;
        int hashCode2 = (this.i.hashCode() + ((hashCode + (spVar == null ? 0 : spVar.hashCode())) * 31)) * 31;
        jq jqVar = this.j;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((hashCode2 + (jqVar != null ? jqVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequestReview(__typename=", this.a, ", id=", this.b, ", state=");
        o.append(this.c);
        o.append(", url=");
        o.append(this.d);
        o.append(", authorCanPushToRepository=");
        jo.f4.B(", submittedAt=", ", pullRequest=", o, this.f, this.e);
        o.append(this.g);
        o.append(", author=");
        o.append(this.h);
        o.append(", repository=");
        o.append(this.i);
        o.append(", threadsAndReplies=");
        o.append(this.j);
        o.append(", commentFragment=");
        o.append(this.k);
        o.append(", reactionFragment=");
        o.append(this.l);
        o.append(", updatableFragment=");
        o.append(this.m);
        o.append(", orgBlockableFragment=");
        o.append(this.n);
        o.append(")");
        return o.toString();
    }
}
