package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h4 {
    public final String a;
    public final String b;
    public final j4 c;

    public h4(String str, String str2, j4 j4Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = j4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4)) {
            return false;
        }
        h4 h4Var = (h4) obj;
        return k71.k.b(this.a, h4Var.a) && k71.k.b(this.b, h4Var.b) && k71.k.b(this.c, h4Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        j4 j4Var = this.c;
        return i + (j4Var == null ? 0 : j4Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onPullRequest=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
