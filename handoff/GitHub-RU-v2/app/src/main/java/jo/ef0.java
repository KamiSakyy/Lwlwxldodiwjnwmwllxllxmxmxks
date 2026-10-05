package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ef0 {
    public final String a;
    public final String b;
    public final lv.m c;

    public ef0(String str, String str2, lv.m mVar) {
        this.a = str;
        this.b = str2;
        this.c = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ef0)) {
            return false;
        }
        ef0 ef0Var = (ef0) obj;
        return k71.k.b(this.a, ef0Var.a) && k71.k.b(this.b, ef0Var.b) && k71.k.b(this.c, ef0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node1(__typename=", this.a, ", id=", this.b, ", reviewFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
