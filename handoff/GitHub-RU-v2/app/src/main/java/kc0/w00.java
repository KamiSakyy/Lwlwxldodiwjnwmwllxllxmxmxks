package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w00 {
    public final String a;
    public final String b;
    public final ck0.v c;

    public w00(String str, String str2, ck0.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w00)) {
            return false;
        }
        w00 w00Var = (w00) obj;
        return k71.k.b(this.a, w00Var.a) && k71.k.b(this.b, w00Var.b) && k71.k.b(this.c, w00Var.c);
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
