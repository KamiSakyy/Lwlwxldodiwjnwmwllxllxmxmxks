package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z90 implements aaShadow.m0 {
    public ba0 a;

    public z90(ba0 ba0Var) {
        this.a = ba0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z90) && k71.k.b(this.a, ((z90) obj).a);
    }

    public final int hashCode() {
        ba0 ba0Var = this.a;
        if (ba0Var == null) {
            return 0;
        }
        return ba0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ")";
    }
}
