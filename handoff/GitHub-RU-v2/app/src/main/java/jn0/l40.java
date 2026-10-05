package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l40 {
    public final String a;
    public final String b;
    public final jv0.t c;

    public l40(String str, String str2, jv0.t tVar) {
        this.a = str;
        this.b = str2;
        this.c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l40)) {
            return false;
        }
        l40 l40Var = (l40) obj;
        return k71.k.b(this.a, l40Var.a) && k71.k.b(this.b, l40Var.b) && k71.k.b(this.c, l40Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Shortcut(__typename=", this.a, ", id=", this.b, ", shortcutFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
