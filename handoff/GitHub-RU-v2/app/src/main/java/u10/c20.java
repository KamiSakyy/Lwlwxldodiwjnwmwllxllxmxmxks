package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c20 implements aa.m0 {
    public final d20 a;

    public c20(d20 d20Var) {
        this.a = d20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c20) && k71.k.b(this.a, ((c20) obj).a);
    }

    public final int hashCode() {
        d20 d20Var = this.a;
        if (d20Var == null) {
            return 0;
        }
        return d20Var.hashCode();
    }

    public final String toString() {
        return "Data(unfollowUser=" + this.a + ")";
    }
}
