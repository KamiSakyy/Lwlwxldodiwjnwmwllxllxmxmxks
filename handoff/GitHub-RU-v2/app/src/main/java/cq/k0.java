package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    public final String a;
    public final String b;
    public final t5 c;

    public k0(String str, String str2, t5 t5Var) {
        this.a = str;
        this.b = str2;
        this.c = t5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return k71.k.b(this.a, k0Var.a) && k71.k.b(this.b, k0Var.b) && k71.k.b(this.c, k0Var.c);
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
