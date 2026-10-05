package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zr {
    public final String a;
    public final String b;
    public final String c;
    public final m10.xz d;
    public final fs e;
    public final String f;
    public final m10.fz g;
    public final ar.c h;
    public final pv.c i;
    public final mx.c j;
    public final pu.a k;
    public final ju.a l;

    public zr(String str, String str2, String str3, m10.xz xzVar, fs fsVar, String str4, m10.fz fzVar, ar.c cVar, pv.c cVar2, mx.c cVar3, pu.a aVar, ju.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xzVar;
        this.e = fsVar;
        this.f = str4;
        this.g = fzVar;
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
        if (!(obj instanceof zr)) {
            return false;
        }
        zr zrVar = (zr) obj;
        return k71.k.b(this.a, zrVar.a) && k71.k.b(this.b, zrVar.b) && k71.k.b(this.c, zrVar.c) && this.d == zrVar.d && k71.k.b(this.e, zrVar.e) && k71.k.b(this.f, zrVar.f) && this.g == zrVar.g && k71.k.b(this.h, zrVar.h) && k71.k.b(this.i, zrVar.i) && k71.k.b(this.j, zrVar.j) && k71.k.b(this.k, zrVar.k) && k71.k.b(this.l, zrVar.l);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31;
        fs fsVar = this.e;
        return this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (fsVar == null ? 0 : fsVar.hashCode())) * 31, this.f, 31)) * 31)) * 31)) * 31)) * 31)) * 31);
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
