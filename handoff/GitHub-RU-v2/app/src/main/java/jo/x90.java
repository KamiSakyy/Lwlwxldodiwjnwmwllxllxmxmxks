package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x90 implements aaShadow.m0 {
    public y90 a;

    public x90(y90 y90Var) {
        this.a = y90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x90) && k71.k.b(this.a, ((x90) obj).a);
    }

    public final int hashCode() {
        y90 y90Var = this.a;
        if (y90Var == null) {
            return 0;
        }
        return y90Var.hashCode();
    }

    public final String toString() {
        return "Data(unblockUser=" + this.a + ")";
    }
}
