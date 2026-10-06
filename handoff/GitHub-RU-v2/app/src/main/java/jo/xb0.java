package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xb0 {
    public String a;
    public String b;
    public is.a0 c;

    public xb0(String str, String str2, is.a0 a0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0Var = (xb0) obj;
        return k71.k.b(this.a, xb0Var.a) && k71.k.b(this.b, xb0Var.b) && k71.k.b(this.c, xb0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Discussion(__typename=", this.a, ", id=", this.b, ", discussionDetailsFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
