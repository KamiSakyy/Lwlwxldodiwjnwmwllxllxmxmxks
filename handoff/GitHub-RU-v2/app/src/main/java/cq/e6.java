package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e6 {
    public String a;
    public String b;
    public l5 c;

    public e6(String str, String str2, l5 l5Var) {
        this.a = str;
        this.b = str2;
        this.c = l5Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return false;
        }
        e6 e6Var = (e6) obj;
        return k71.k.b(this.a, e6Var.a) && k71.k.b(this.b, e6Var.b) && k71.k.b(this.c, e6Var.c);
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
