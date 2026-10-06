package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z60 implements aaShadow.m0 {
    public b70 a;

    public z60(b70 b70Var) {
        this.a = b70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z60) && k71.k.b(this.a, ((z60) obj).a);
    }

    public final int hashCode() {
        b70 b70Var = this.a;
        if (b70Var == null) {
            return 0;
        }
        return b70Var.hashCode();
    }

    public final String toString() {
        return "Data(updatePullRequest=" + this.a + ")";
    }
}
