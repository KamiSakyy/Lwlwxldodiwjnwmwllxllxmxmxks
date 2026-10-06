package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cq {
    public final String a;
    public final String b;
    public final String c;
    public final pz0.cu d;
    public final iq e;
    public final String f;
    public final pz0.kt g;
    public final yp0.c h;
    public final gu0.c i;
    public final bw0.c j;
    public final gt0.a k;
    public final at0.a l;

    public cq(String str, String str2, String str3, pz0.cu cuVar, iq iqVar, String str4, pz0.kt ktVar, yp0.c cVar, gu0.c cVar2, bw0.c cVar3, gt0.a aVar, at0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cuVar;
        this.e = iqVar;
        this.f = str4;
        this.g = ktVar;
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
        if (!(obj instanceof cq)) {
            return false;
        }
        cq cqVar = (cq) obj;
        return k71.k.b(this.a, cqVar.a) && k71.k.b(this.b, cqVar.b) && k71.k.b(this.c, cqVar.c) && this.d == cqVar.d && k71.k.b(this.e, cqVar.e) && k71.k.b(this.f, cqVar.f) && this.g == cqVar.g && k71.k.b(this.h, cqVar.h) && k71.k.b(this.i, cqVar.i) && k71.k.b(this.j, cqVar.j) && k71.k.b(this.k, cqVar.k) && k71.k.b(this.l, cqVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        iq iqVar = this.e;
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (iqVar == null ? 0 : iqVar.hashCode())) * 31, this.f, 31)) * 31)) * 31)) * 31)) * 31)) * 31);
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
