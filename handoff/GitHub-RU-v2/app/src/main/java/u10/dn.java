package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class dn {
    public String a;
    public String b;
    public hc0.jl c;
    public String d;
    public c40.c e;
    public i80.c f;
    public aa0.c g;
    public g70.a h;
    public y60.a i;

    public dn(String str, String str2, hc0.jl jlVar, String str3, c40.c cVar, i80.c cVar2, aa0.c cVar3, g70.a aVar, y60.a aVar2) {
        this.a = str;
        this.b = str2;
        this.c = jlVar;
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
        if (!(obj instanceof dn)) {
            return false;
        }
        dn dnVar = (dn) obj;
        return k71.k.b(this.a, dnVar.a) && k71.k.b(this.b, dnVar.b) && this.c == dnVar.c && k71.k.b(this.d, dnVar.d) && k71.k.b(this.e, dnVar.e) && k71.k.b(this.f, dnVar.f) && k71.k.b(this.g, dnVar.g) && k71.k.b(this.h, dnVar.h) && k71.k.b(this.i, dnVar.i);
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
    public dn(String p1, String p2, Object p3, String p4, Object p5, Object p6, Object p7, Object p8, Object p9) {
    }
}
