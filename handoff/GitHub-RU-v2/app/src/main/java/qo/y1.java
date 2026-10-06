package qo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 {
    public final String a;
    public final String b;
    public final z1 c;
    public final vo.a1 d;

    public y1(String str, String str2, z1 z1Var, vo.a1 a1Var) {
        this.a = str;
        this.b = str2;
        this.c = z1Var;
        this.d = a1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return k71.k.b(this.a, y1Var.a) && k71.k.b(this.b, y1Var.b) && k71.k.b(this.c, y1Var.c) && k71.k.b(this.d, y1Var.d);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        z1 z1Var = this.c;
        return this.d.hashCode() + ((i + (z1Var == null ? 0 : z1Var.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnCommit(__typename=", this.a, ", id=", this.b, ", status=");
        o.append(this.c);
        o.append(", commitCheckSuitesFragment=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
