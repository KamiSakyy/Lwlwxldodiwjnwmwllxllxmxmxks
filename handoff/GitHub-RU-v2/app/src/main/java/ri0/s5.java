package ri0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s5 {
    public final String a;
    public final String b;
    public final l5 c;

    public s5(String str, String str2, l5 l5Var) {
        this.a = str;
        this.b = str2;
        this.c = l5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5)) {
            return false;
        }
        s5 s5Var = (s5) obj;
        return k71.k.b(this.a, s5Var.a) && k71.k.b(this.b, s5Var.b) && k71.k.b(this.c, s5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Reviewer(__typename=", this.a, ", id=", this.b, ", onUser=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
