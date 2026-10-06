package b20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o2 implements aa.v0 {
    public final p2 a;

    public o2(p2 p2Var) {
        this.a = p2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && k71.k.b(this.a, ((o2) obj).a);
    }

    public final int hashCode() {
        p2 p2Var = this.a;
        if (p2Var == null) {
            return 0;
        }
        return p2Var.hashCode();
    }

    public final String toString() {
        return "Data(repository=" + this.a + ")";
    }
}
