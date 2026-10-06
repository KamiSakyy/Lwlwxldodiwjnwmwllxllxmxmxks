package xt0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c5 {
    public String a;
    public String b;
    public cu0.l c;

    public c5(String str, String str2, cu0.l lVar) {
        this.a = str;
        this.b = str2;
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return k71.k.b(this.a, c5Var.a) && k71.k.b(this.b, c5Var.b) && k71.k.b(this.c, c5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node2(__typename=", this.a, ", id=", this.b, ", reviewFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
