package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gn {
    public final String a;
    public final String b;
    public final String c;
    public final hc0.bm d;
    public final mn e;
    public final String f;
    public final hc0.jl g;
    public final c40.c h;
    public final i80.c i;
    public final aa0.c j;
    public final g70.a k;
    public final y60.a l;

    public gn(String str, String str2, String str3, hc0.bm bmVar, mn mnVar, String str4, hc0.jl jlVar, c40.c cVar, i80.c cVar2, aa0.c cVar3, g70.a aVar, y60.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bmVar;
        this.e = mnVar;
        this.f = str4;
        this.g = jlVar;
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
        if (!(obj instanceof gn)) {
            return false;
        }
        gn gnVar = (gn) obj;
        return k71.k.b(this.a, gnVar.a) && k71.k.b(this.b, gnVar.b) && k71.k.b(this.c, gnVar.c) && this.d == gnVar.d && k71.k.b(this.e, gnVar.e) && k71.k.b(this.f, gnVar.f) && this.g == gnVar.g && k71.k.b(this.h, gnVar.h) && k71.k.b(this.i, gnVar.i) && k71.k.b(this.j, gnVar.j) && k71.k.b(this.k, gnVar.k) && k71.k.b(this.l, gnVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        mn mnVar = this.e;
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (mnVar == null ? 0 : mnVar.hashCode())) * 31, this.f, 31)) * 31)) * 31)) * 31)) * 31)) * 31);
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
