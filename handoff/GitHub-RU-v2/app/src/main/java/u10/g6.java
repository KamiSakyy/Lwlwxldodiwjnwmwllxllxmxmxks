package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g6 {
    public final String a;
    public final String b;
    public final e50.l0 c;

    public g6(String str, String str2, e50.l0 l0Var) {
        this.a = str;
        this.b = str2;
        this.c = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g6)) {
            return false;
        }
        g6 g6Var = (g6) obj;
        return k71.k.b(this.a, g6Var.a) && k71.k.b(this.b, g6Var.b) && k71.k.b(this.c, g6Var.c);
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
