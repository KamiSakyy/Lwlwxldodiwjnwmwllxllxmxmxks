package f00;

import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public String a;
    public String b;
    public o c;
    public String d;
    public vx.a e;

    public p(String str, String str2, o oVar, String str3, vx.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = oVar;
        this.d = str3;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c) && k71.k.b(this.d, pVar.d) && k71.k.b(this.e, pVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + com.github.rudroid.copilot.h1.i((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", id=");
        o.append(this.d);
        o.append(", nodeIdFragment=");
        return f4.r(o, this.e, ")");
    }
}
