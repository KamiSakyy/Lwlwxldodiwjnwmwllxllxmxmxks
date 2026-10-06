package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j90 {
    public String a;
    public String b;
    public ar0.a0Shadow c;

    public j90(String str, String str2, ar0.a0Shadow a0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j90)) {
            return false;
        }
        j90 j90Var = (j90) obj;
        return k71.k.b(this.a, j90Var.a) && k71.k.b(this.b, j90Var.b) && k71.k.b(this.c, j90Var.c);
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
