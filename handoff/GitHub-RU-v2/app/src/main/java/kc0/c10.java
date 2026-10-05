package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c10 {
    public final String a;
    public final String b;
    public final ck0.v c;

    public c10(String str, String str2, ck0.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) obj;
        return k71.k.b(this.a, c10Var.a) && k71.k.b(this.b, c10Var.b) && k71.k.b(this.c, c10Var.c);
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
