package am0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s0 implements aa.v0 {
    public final y0 a;

    public s0(y0 y0Var) {
        this.a = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s0) && k71.k.b(this.a, ((s0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
