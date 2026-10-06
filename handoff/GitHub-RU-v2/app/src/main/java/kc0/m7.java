package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m7 {
    public String a;
    public String b;
    public ck0.v c;

    public m7(String str, String str2, ck0.v vVar) {
        this.a = str;
        this.b = str2;
        this.c = vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7)) {
            return false;
        }
        m7 m7Var = (m7) obj;
        return k71.k.b(this.a, m7Var.a) && k71.k.b(this.b, m7Var.b) && k71.k.b(this.c, m7Var.c);
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
}
