package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r1 {
    public String a;
    public String b;
    public s1 c;

    public r1(String str, String str2, s1 s1Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = s1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return k71.k.b(this.a, r1Var.a) && k71.k.b(this.b, r1Var.b) && k71.k.b(this.c, r1Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        s1 s1Var = this.c;
        return i + (s1Var == null ? 0 : s1Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCommit=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
