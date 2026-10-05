package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r5 {
    public final String a;
    public final String b;
    public final p4 c;

    public r5(String str, String str2, p4 p4Var) {
        this.a = str;
        this.b = str2;
        this.c = p4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5)) {
            return false;
        }
        r5 r5Var = (r5) obj;
        return k71.k.b(this.a, r5Var.a) && k71.k.b(this.b, r5Var.b) && k71.k.b(this.c, r5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryFeedFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
