package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l60 {
    public String a;
    public String b;
    public sw.t c;

    public l60(String str, String str2, sw.t tVar) {
        this.a = str;
        this.b = str2;
        this.c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l60)) {
            return false;
        }
        l60 l60Var = (l60) obj;
        return k71.k.b(this.a, l60Var.a) && k71.k.b(this.b, l60Var.b) && k71.k.b(this.c, l60Var.c);
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
