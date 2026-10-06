package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z7 implements aaShadow.m0 {
    public final y7 a;

    public z7(y7 y7Var) {
        this.a = y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z7) && k71.k.b(this.a, ((z7) obj).a);
    }

    public final int hashCode() {
        y7 y7Var = this.a;
        if (y7Var == null) {
            return 0;
        }
        return y7Var.hashCode();
    }

    public final String toString() {
        return "Data(createGoogleIapSubscription=" + this.a + ")";
    }
}
