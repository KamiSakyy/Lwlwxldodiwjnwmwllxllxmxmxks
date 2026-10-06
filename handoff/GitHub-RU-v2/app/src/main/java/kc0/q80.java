package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q80 {
    public final String a;
    public final String b;
    public final wi0.l c;

    public q80(String str, String str2, wi0.l lVar) {
        this.a = str;
        this.b = str2;
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q80)) {
            return false;
        }
        q80 q80Var = (q80) obj;
        return k71.k.b(this.a, q80Var.a) && k71.k.b(this.b, q80Var.b) && k71.k.b(this.c, q80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", reviewFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
