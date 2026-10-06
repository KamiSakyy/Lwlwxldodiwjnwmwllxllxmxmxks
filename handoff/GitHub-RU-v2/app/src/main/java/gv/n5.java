package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n5 {
    public final String a;
    public final String b;
    public final lv.m c;

    public n5(String str, String str2, lv.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj;
        return k71.k.b(this.a, n5Var.a) && k71.k.b(this.b, n5Var.b) && k71.k.b(this.c, n5Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node3(__typename=", this.a, ", id=", this.b, ", reviewFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
