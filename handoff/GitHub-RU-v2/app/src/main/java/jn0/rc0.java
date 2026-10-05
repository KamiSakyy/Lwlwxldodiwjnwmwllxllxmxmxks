package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class rc0 {
    public final String a;
    public final String b;
    public final bv0.d c;

    public rc0(String str, String str2, bv0.d dVar) {
        this.a = str;
        this.b = str2;
        this.c = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rc0)) {
            return false;
        }
        rc0 rc0Var = (rc0) obj;
        return k71.k.b(this.a, rc0Var.a) && k71.k.b(this.b, rc0Var.b) && k71.k.b(this.c, rc0Var.c);
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
