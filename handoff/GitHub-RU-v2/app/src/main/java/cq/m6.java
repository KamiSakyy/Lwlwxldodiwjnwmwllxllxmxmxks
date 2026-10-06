package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m6 {
    public String a;
    public String b;
    public eq.c c;

    public m6(String str, String str2, eq.c cVar) {
        this.a = str;
        this.b = str2;
        this.c = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m6)) {
            return false;
        }
        m6 m6Var = (m6) obj;
        return k71.k.b(this.a, m6Var.a) && k71.k.b(this.b, m6Var.b) && k71.k.b(this.c, m6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Actor(__typename=", this.a, ", id=", this.b, ", actorFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
