package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q90 implements aaShadow.v0 {
    public final r90 a;

    public q90(r90 r90Var) {
        this.a = r90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q90) && k71.k.b(this.a, ((q90) obj).a);
    }

    public final int hashCode() {
        r90 r90Var = this.a;
        if (r90Var == null) {
            return 0;
        }
        return r90Var.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ")";
    }
}
