package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s7 {
    public String a;
    public String b;
    public is.p0 c;

    public s7(String str, String str2, is.p0 p0Var) {
        this.a = str;
        this.b = str2;
        this.c = p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7)) {
            return false;
        }
        s7 s7Var = (s7) obj;
        return k71.k.b(this.a, s7Var.a) && k71.k.b(this.b, s7Var.b) && k71.k.b(this.c, s7Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
