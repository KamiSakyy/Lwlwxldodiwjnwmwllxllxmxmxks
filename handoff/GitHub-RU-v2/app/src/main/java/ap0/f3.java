package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f3 {
    public final String a;
    public final String b;
    public final x4 c;

    public f3(String str, String str2, x4 x4Var) {
        this.a = str;
        this.b = str2;
        this.c = x4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return k71.k.b(this.a, f3Var.a) && k71.k.b(this.b, f3Var.b) && k71.k.b(this.c, f3Var.c);
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
