package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vg {
    public String a;
    public String b;
    public er.l1 c;

    public vg(String str, String str2, er.l1 l1Var) {
        this.a = str;
        this.b = str2;
        this.c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg)) {
            return false;
        }
        vg vgVar = (vg) obj;
        return k71.k.b(this.a, vgVar.a) && k71.k.b(this.b, vgVar.b) && k71.k.b(this.c, vgVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", commitFields=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
