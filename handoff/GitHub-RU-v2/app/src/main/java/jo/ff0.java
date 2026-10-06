package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ff0 {
    public String a;
    public String b;
    public kw.e c;

    public ff0(String str, String str2, kw.e eVar) {
        this.a = str;
        this.b = str2;
        this.c = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ff0)) {
            return false;
        }
        ff0 ff0Var = (ff0) obj;
        return k71.k.b(this.a, ff0Var.a) && k71.k.b(this.b, ff0Var.b) && k71.k.b(this.c, ff0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", reviewRequestFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
