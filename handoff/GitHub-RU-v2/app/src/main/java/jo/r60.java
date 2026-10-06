package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r60 {
    public String a;
    public String b;
    public sw.t c;

    public r60(String str, String str2, sw.t tVar) {
        this.a = str;
        this.b = str2;
        this.c = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r60)) {
            return false;
        }
        r60 r60Var = (r60) obj;
        return k71.k.b(this.a, r60Var.a) && k71.k.b(this.b, r60Var.b) && k71.k.b(this.c, r60Var.c);
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
    public r60(String p1, String p2, Object p3) {
    }
}
