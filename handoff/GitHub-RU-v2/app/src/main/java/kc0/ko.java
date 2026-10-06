package kc0;

import java.time.ZonedDateTime;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ko {
    public String a;
    public String b;
    public gn0.xm c;
    public String d;
    public boolean e;
    public ZonedDateTime f;
    public no g;
    public ao h;
    public oo i;
    public so j;
    public se0.c k;
    public aj0.c l;
    public sk0.c m;
    public yh0.a n;

    public ko(String str, String str2, gn0.xm xmVar, String str3, boolean z, ZonedDateTime zonedDateTime, no noVar, ao aoVar, oo ooVar, so soVar, se0.c cVar, aj0.c cVar2, sk0.c cVar3, yh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = xmVar;
        this.d = str3;
        this.e = z;
        this.f = zonedDateTime;
        this.g = noVar;
        this.h = aoVar;
        this.i = ooVar;
        this.j = soVar;
        this.k = cVar;
        this.l = cVar2;
        this.m = cVar3;
        this.n = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ko)) {
            return false;
        }
        ko koVar = (ko) obj;
        return k71.k.b(this.a, koVar.a) && k71.k.b(this.b, koVar.b) && this.c == koVar.c && k71.k.b(this.d, koVar.d) && this.e == koVar.e && k71.k.b(this.f, koVar.f) && k71.k.b(this.g, koVar.g) && k71.k.b(this.h, koVar.h) && k71.k.b(this.i, koVar.i) && k71.k.b(this.j, koVar.j) && k71.k.b(this.k, koVar.k) && k71.k.b(this.l, koVar.l) && k71.k.b(this.m, koVar.m) && k71.k.b(this.n, koVar.n);
    }

    public final int hashCode() {
        int e = x.i.e(com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), 31, this.e);
        ZonedDateTime zonedDateTime = this.f;
        int hashCode = (this.g.hashCode() + ((e + (zonedDateTime == null ? 0 : zonedDateTime.hashCode())) * 31)) * 31;
        ao aoVar = this.h;
        int hashCode2 = (this.i.hashCode() + ((hashCode + (aoVar == null ? 0 : aoVar.hashCode())) * 31)) * 31;
        so soVar = this.j;
        return this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((hashCode2 + (soVar != null ? soVar.hashCode() : 0)) * 31)) * 31)) * 31)) * 31);
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
