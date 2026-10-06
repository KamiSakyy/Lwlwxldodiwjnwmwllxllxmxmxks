package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i5 {
    public String a;
    public String b;
    public p4 c;

    public i5(String str, String str2, p4 p4Var) {
        this.a = str;
        this.b = str2;
        this.c = p4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5)) {
            return false;
        }
        i5 i5Var = (i5) obj;
        return k71.k.b(this.a, i5Var.a) && k71.k.b(this.b, i5Var.b) && k71.k.b(this.c, i5Var.c);
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
