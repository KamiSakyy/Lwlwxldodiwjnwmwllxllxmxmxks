package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class wr {
    public String a;
    public String b;
    public m10.fz c;
    public String d;
    public ar.c e;
    public pv.c f;
    public mx.c g;
    public pu.a h;
    public ju.a i;

    public wr(String str, String str2, m10.fz fzVar, String str3, ar.c cVar, pv.c cVar2, mx.c cVar3, pu.a aVar, ju.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = fzVar;
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
        if (!(obj instanceof wr)) {
            return false;
        }
        wr wrVar = (wr) obj;
        return k71.k.b(this.a, wrVar.a) && k71.k.b(this.b, wrVar.b) && this.c == wrVar.c && k71.k.b(this.d, wrVar.d) && k71.k.b(this.e, wrVar.e) && k71.k.b(this.f, wrVar.f) && k71.k.b(this.g, wrVar.g) && k71.k.b(this.h, wrVar.h) && k71.k.b(this.i, wrVar.i);
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
