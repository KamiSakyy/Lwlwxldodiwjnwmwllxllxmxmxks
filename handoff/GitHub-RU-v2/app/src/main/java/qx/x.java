package qx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x {
    public String a;
    public String b;
    public t c;
    public String d;

    public x(String str, String str2, t tVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = tVar;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c) && k71.k.b(this.d, xVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository1(id=", this.a, ", name=", this.b, ", owner=");
        o.append(this.c);
        o.append(", __typename=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
