package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class uc0 {
    public final String a;
    public final String b;
    public final oj0.v3 c;

    public uc0(String str, String str2, oj0.v3 v3Var) {
        this.a = str;
        this.b = str2;
        this.c = v3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc0)) {
            return false;
        }
        uc0 uc0Var = (uc0) obj;
        return k71.k.b(this.a, uc0Var.a) && k71.k.b(this.b, uc0Var.b) && k71.k.b(this.c, uc0Var.c);
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
