package dw;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o6 {
    public String a;
    public String b;
    public e6 c;

    public o6(String str, String str2, e6 e6Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = e6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6)) {
            return false;
        }
        o6 o6Var = (o6) obj;
        return k71.k.b(this.a, o6Var.a) && k71.k.b(this.b, o6Var.b) && k71.k.b(this.c, o6Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", subIssueFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
