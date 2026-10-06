package iy0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public String a;
    public String b;
    public n c;
    public String d;
    public kw0.a e;

    public o(String str, String str2, n nVar, String str3, kw0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = nVar;
        this.d = str3;
        this.e = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && k71.k.b(this.b, oVar.b) && k71.k.b(this.c, oVar.c) && k71.k.b(this.d, oVar.d) && k71.k.b(this.e, oVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + h1.i((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", id=");
        o.append(this.d);
        o.append(", nodeIdFragment=");
        return f1.e.n(o, this.e, ")");
    }

    public Object e;
}
