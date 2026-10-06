package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k1 {
    public String a;
    public String b;
    public i1 c;

    public k1(String str, String str2, i1 i1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj;
        return k71.k.b(this.a, k1Var.a) && k71.k.b(this.b, k1Var.b) && k71.k.b(this.c, k1Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        i1 i1Var = this.c;
        return i + (i1Var == null ? 0 : i1Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Target(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
