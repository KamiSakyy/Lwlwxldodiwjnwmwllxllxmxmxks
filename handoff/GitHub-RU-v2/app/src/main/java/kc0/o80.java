package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o80 implements aaShadow.m0 {
    public v80 a;

    public o80(v80 v80Var) {
        this.a = v80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o80) && k71.k.b(this.a, ((o80) obj).a);
    }

    public final int hashCode() {
        v80 v80Var = this.a;
        if (v80Var == null) {
            return 0;
        }
        return v80Var.hashCode();
    }

    public final String toString() {
        return "Data(requestReviews=" + this.a + ")";
    }
}
