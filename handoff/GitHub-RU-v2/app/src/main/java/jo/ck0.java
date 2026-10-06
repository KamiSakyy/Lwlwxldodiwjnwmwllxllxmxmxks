package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ck0 {
    public final String a;
    public final String b;
    public final dw.t5 c;

    public ck0(String str, String str2, dw.t5 t5Var) {
        this.a = str;
        this.b = str2;
        this.c = t5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck0)) {
            return false;
        }
        ck0 ck0Var = (ck0) obj;
        return k71.k.b(this.a, ck0Var.a) && k71.k.b(this.b, ck0Var.b) && k71.k.b(this.c, ck0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", simpleRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
