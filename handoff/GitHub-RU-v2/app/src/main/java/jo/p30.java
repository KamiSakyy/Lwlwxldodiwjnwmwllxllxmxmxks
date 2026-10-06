package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p30 {
    public String a;
    public String b;
    public dw.k2 c;

    public p30(String str, String str2, dw.k2 k2Var) {
        this.a = str;
        this.b = str2;
        this.c = k2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p30)) {
            return false;
        }
        p30 p30Var = (p30) obj;
        return k71.k.b(this.a, p30Var.a) && k71.k.b(this.b, p30Var.b) && k71.k.b(this.c, p30Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", repositoryDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
