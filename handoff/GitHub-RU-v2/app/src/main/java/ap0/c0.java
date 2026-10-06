package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c0 {
    public final String a;
    public final String b;
    public final x4 c;

    public c0(String str, String str2, x4 x4Var) {
        this.a = str;
        this.b = str2;
        this.c = x4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return k71.k.b(this.a, c0Var.a) && k71.k.b(this.b, c0Var.b) && k71.k.b(this.c, c0Var.c);
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
