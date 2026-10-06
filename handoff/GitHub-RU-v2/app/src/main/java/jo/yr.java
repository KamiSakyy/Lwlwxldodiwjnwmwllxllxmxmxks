package jo;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yr {
    public final String a;
    public final String b;
    public final m10.rz c;
    public final String d;
    public final boolean e;
    public final ZonedDateTime f;
    public final bs g;
    public final pr h;
    public final cs i;
    public final gs j;
    public final ar.c k;
    public final pv.c l;
    public final mx.c m;
    public final pu.a n;

    public yr(String str, String str2, m10.rz rzVar, String str3, boolean z, ZonedDateTime zonedDateTime, bs bsVar, pr prVar, cs csVar, gs gsVar, ar.c cVar, pv.c cVar2, mx.c cVar3, pu.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = rzVar;
        this.d = str3;
        this.e = z;
        this.f = zonedDateTime;
        this.g = bsVar;
        this.h = prVar;
        this.i = csVar;
        this.j = gsVar;
        this.k = cVar;
        this.l = cVar2;
        this.m = cVar3;
        this.n = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yr)) {
            return false;
        }
        yr yrVar = (yr) obj;
        return k71.k.b(this.a, yrVar.a) && k71.k.b(this.b, yrVar.b) && this.c == yrVar.c && k71.k.b(this.d, yrVar.d) && this.e == yrVar.e && k71.k.b(this.f, yrVar.f) && k71.k.b(this.g, yrVar.g) && k71.k.b(this.h, yrVar.h) && k71.k.b(this.i, yrVar.i) && k71.k.b(this.j, yrVar.j) && k71.k.b(this.k, yrVar.k) && k71.k.b(this.l, yrVar.l) && k71.k.b(this.m, yrVar.m) && k71.k.b(this.n, yrVar.n);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), 31, this.e);
        ZonedDateTime zonedDateTime = this.f;
        int hashCode = (this.g.hashCode() + ((e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        pr prVar = this.h;
        int hashCode2 = (this.i.hashCode() + ((hashCode + (prVar == null ? 0 : prVar.hashCode())) * 31)) * 31;
        gs gsVar = this.j;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((hashCode2 + (gsVar != null ? gsVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequestReview(__typename=", this.a, ", id=", this.b, ", state=");
        o.append(this.c);
        o.append(", url=");
        o.append(this.d);
        o.append(", authorCanPushToRepository=");
        f4.B(", submittedAt=", ", pullRequest=", o, this.f, this.e);
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
