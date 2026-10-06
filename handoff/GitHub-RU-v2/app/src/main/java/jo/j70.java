package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j70 {
    public final String a;
    public final String b;
    public final k70 c;

    public j70(String str, String str2, k70 k70Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = k70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j70)) {
            return false;
        }
        j70 j70Var = (j70) obj;
        return k71.k.b(this.a, j70Var.a) && k71.k.b(this.b, j70Var.b) && k71.k.b(this.c, j70Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        k70 k70Var = this.c;
        return i + (k70Var == null ? 0 : k70Var.a.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onSponsorable=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
