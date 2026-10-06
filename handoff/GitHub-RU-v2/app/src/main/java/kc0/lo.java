package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class lo {
    public String a;
    public String b;
    public String c;
    public gn0.dn d;
    public ro e;
    public String f;
    public gn0.lm g;
    public se0.c h;
    public aj0.c i;
    public sk0.c j;
    public yh0.a k;
    public qh0.a l;

    public lo(String str, String str2, String str3, gn0.dn dnVar, ro roVar, String str4, gn0.lm lmVar, se0.c cVar, aj0.c cVar2, sk0.c cVar3, yh0.a aVar, qh0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dnVar;
        this.e = roVar;
        this.f = str4;
        this.g = lmVar;
        this.h = cVar;
        this.i = cVar2;
        this.j = cVar3;
        this.k = aVar;
        this.l = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lo)) {
            return false;
        }
        lo loVar = (lo) obj;
        return k71.k.b(this.a, loVar.a) && k71.k.b(this.b, loVar.b) && k71.k.b(this.c, loVar.c) && this.d == loVar.d && k71.k.b(this.e, loVar.e) && k71.k.b(this.f, loVar.f) && this.g == loVar.g && k71.k.b(this.h, loVar.h) && k71.k.b(this.i, loVar.i) && k71.k.b(this.j, loVar.j) && k71.k.b(this.k, loVar.k) && k71.k.b(this.l, loVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        ro roVar = this.e;
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (roVar == null ? 0 : roVar.hashCode())) * 31, this.f, 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequestReviewComment(__typename=", this.a, ", id=", this.b, ", path=");
        o.append(this.c);
        o.append(", subjectType=");
        o.append(this.d);
        o.append(", thread=");
        o.append(this.e);
        o.append(", url=");
        o.append(this.f);
        o.append(", state=");
        o.append(this.g);
        o.append(", commentFragment=");
        o.append(this.h);
        o.append(", reactionFragment=");
        o.append(this.i);
        o.append(", updatableFragment=");
        o.append(this.j);
        o.append(", orgBlockableFragment=");
        o.append(this.k);
        o.append(", minimizableCommentFragment=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }
}
