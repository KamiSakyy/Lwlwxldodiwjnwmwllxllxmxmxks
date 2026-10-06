package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j10 {
    public final String a;
    public final String b;
    public final ws0.a c;

    public j10(String str, String str2, ws0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j10)) {
            return false;
        }
        j10 j10Var = (j10) obj;
        return k71.k.b(this.a, j10Var.a) && k71.k.b(this.b, j10Var.b) && k71.k.b(this.c, j10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", milestoneFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
