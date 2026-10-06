package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d9 {
    public String a;
    public String b;
    public e9 c;

    public d9(String str, String str2, e9 e9Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = e9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        return k71.k.b(this.a, d9Var.a) && k71.k.b(this.b, d9Var.b) && k71.k.b(this.c, d9Var.c);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        e9 e9Var = this.c;
        return i + (e9Var == null ? 0 : e9Var.hashCode());
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", onCheckSuite=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
