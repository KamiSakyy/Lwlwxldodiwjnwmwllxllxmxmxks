package gv;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m5 {
    public final String a;
    public final String b;
    public final lv.m c;

    public m5(String str, String str2, lv.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m5)) {
            return false;
        }
        m5 m5Var = (m5) obj;
        return k71.k.b(this.a, m5Var.a) && k71.k.b(this.b, m5Var.b) && k71.k.b(this.c, m5Var.c);
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
