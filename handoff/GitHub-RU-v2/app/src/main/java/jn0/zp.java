package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zp {
    public String a;
    public String b;
    public pz0.kt c;
    public String d;
    public yp0.c e;
    public gu0.c f;
    public bw0.c g;
    public gt0.a h;
    public at0.a i;

    public zp(String str, String str2, pz0.kt ktVar, String str3, yp0.c cVar, gu0.c cVar2, bw0.c cVar3, gt0.a aVar, at0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = ktVar;
        this.d = str3;
        this.e = cVar;
        this.f = cVar2;
        this.g = cVar3;
        this.h = aVar;
        this.i = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zp)) {
            return false;
        }
        zp zpVar = (zp) obj;
        return k71.k.b(this.a, zpVar.a) && k71.k.b(this.b, zpVar.b) && this.c == zpVar.c && k71.k.b(this.d, zpVar.d) && k71.k.b(this.e, zpVar.e) && k71.k.b(this.f, zpVar.f) && k71.k.b(this.g, zpVar.g) && k71.k.b(this.h, zpVar.h) && k71.k.b(this.i, zpVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", url=", this.b, ", state=");
        o.append(this.c);
        o.append(", id=");
        o.append(this.d);
        o.append(", commentFragment=");
        o.append(this.e);
        o.append(", reactionFragment=");
        o.append(this.f);
        o.append(", updatableFragment=");
        o.append(this.g);
        o.append(", orgBlockableFragment=");
        o.append(this.h);
        o.append(", minimizableCommentFragment=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
