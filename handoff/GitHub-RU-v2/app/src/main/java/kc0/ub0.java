package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ub0 implements aaShadow.v0 {
    public wb0 a;

    public ub0(wb0 wb0Var) {
        this.a = wb0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ub0) && k71.k.b(this.a, ((ub0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Data(viewer=" + this.a + ")";
    }
}
