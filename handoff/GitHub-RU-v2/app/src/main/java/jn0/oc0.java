package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class oc0 implements aaShadow.m0 {
    public vc0 a;

    public oc0(vc0 vc0Var) {
        this.a = vc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oc0) && k71.k.b(this.a, ((oc0) obj).a);
    }

    public final int hashCode() {
        vc0 vc0Var = this.a;
        if (vc0Var == null) {
            return 0;
        }
        return vc0Var.hashCode();
    }

    public final String toString() {
        return "Data(requestReviews=" + this.a + ")";
    }
}
