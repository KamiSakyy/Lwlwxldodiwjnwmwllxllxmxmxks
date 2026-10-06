package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class io {
    public String a;
    public String b;
    public gn0.lm c;
    public String d;
    public se0.c e;
    public aj0.c f;
    public sk0.c g;
    public yh0.a h;
    public qh0.a i;

    public io(String str, String str2, gn0.lm lmVar, String str3, se0.c cVar, aj0.c cVar2, sk0.c cVar3, yh0.a aVar, qh0.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = lmVar;
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
        if (!(obj instanceof io)) {
            return false;
        }
        io ioVar = (io) obj;
        return k71.k.b(this.a, ioVar.a) && k71.k.b(this.b, ioVar.b) && this.c == ioVar.c && k71.k.b(this.d, ioVar.d) && k71.k.b(this.e, ioVar.e) && k71.k.b(this.f, ioVar.f) && k71.k.b(this.g, ioVar.g) && k71.k.b(this.h, ioVar.h) && k71.k.b(this.i, ioVar.i);
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
