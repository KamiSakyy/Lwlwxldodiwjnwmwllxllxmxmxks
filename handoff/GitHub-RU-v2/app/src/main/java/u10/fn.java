package u10;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fn {
    public final String a;
    public final String b;
    public final hc0.vl c;
    public final String d;
    public final boolean e;
    public final ZonedDateTime f;
    public final in g;
    public final wm h;
    public final jn i;
    public final nnShadow j;
    public final c40.c k;
    public final i80.c l;
    public final aa0.c m;
    public final g70.a n;

    public fn(String str, String str2, hc0.vl vlVar, String str3, boolean z, ZonedDateTime zonedDateTime, in inVar, wm wmVar, jn jnVar, nnShadow nnVar, c40.c cVar, i80.c cVar2, aa0.c cVar3, g70.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = vlVar;
        this.d = str3;
        this.e = z;
        this.f = zonedDateTime;
        this.g = inVar;
        this.h = wmVar;
        this.i = jnVar;
        this.j = nnVar;
        this.k = cVar;
        this.l = cVar2;
        this.m = cVar3;
        this.n = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn)) {
            return false;
        }
        fn fnVar = (fn) obj;
        return k71.k.b(this.a, fnVar.a) && k71.k.b(this.b, fnVar.b) && this.c == fnVar.c && k71.k.b(this.d, fnVar.d) && this.e == fnVar.e && k71.k.b(this.f, fnVar.f) && k71.k.b(this.g, fnVar.g) && k71.k.b(this.h, fnVar.h) && k71.k.b(this.i, fnVar.i) && k71.k.b(this.j, fnVar.j) && k71.k.b(this.k, fnVar.k) && k71.k.b(this.l, fnVar.l) && k71.k.b(this.m, fnVar.m) && k71.k.b(this.n, fnVar.n);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), 31, this.e);
        ZonedDateTime zonedDateTime = this.f;
        int hashCode = (this.g.hashCode() + ((e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        wm wmVar = this.h;
        int hashCode2 = (this.i.hashCode() + ((hashCode + (wmVar == null ? 0 : wmVar.hashCode())) * 31)) * 31;
        nnShadow nnVar = this.j;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((hashCode2 + (nnVar != null ? nnVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
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
