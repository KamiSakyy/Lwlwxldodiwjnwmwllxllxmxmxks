package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m50 {
    public final String a;
    public final String b;
    public final uf0.a0 c;

    public m50(String str, String str2, uf0.a0 a0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m50)) {
            return false;
        }
        m50 m50Var = (m50) obj;
        return k71.k.b(this.a, m50Var.a) && k71.k.b(this.b, m50Var.b) && k71.k.b(this.c, m50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
