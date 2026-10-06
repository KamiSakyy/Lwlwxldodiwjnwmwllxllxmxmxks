package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b4 {
    public final String a;
    public final String b;
    public final t5 c;

    public b4(String str, String str2, t5 t5Var) {
        this.a = str;
        this.b = str2;
        this.c = t5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj;
        return k71.k.b(this.a, b4Var.a) && k71.k.b(this.b, b4Var.b) && k71.k.b(this.c, b4Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryFeedHeader=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
