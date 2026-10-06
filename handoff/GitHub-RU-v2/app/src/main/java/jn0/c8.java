package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c8 {
    public String a;
    public String b;
    public jv0.t c;

    public c8(String str, String str2, jv0.t tVar) {
        this.a = str;
        this.b = str2;
        this.c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c8)) {
            return false;
        }
        c8 c8Var = (c8) obj;
        return k71.k.b(this.a, c8Var.a) && k71.k.b(this.b, c8Var.b) && k71.k.b(this.c, c8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", shortcutFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
