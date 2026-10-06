package tz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final String b;
    public final b5 c;

    public a(String str, String str2, b5 b5Var) {
        this.a = str;
        this.b = str2;
        this.c = b5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && k71.k.b(this.b, aVar.b) && k71.k.b(this.c, aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", simpleProjectV2Fragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public Object O(Object p1) { return null; }
}
