package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e40 {
    public d40 a;

    public e40(d40 d40Var) {
        this.a = d40Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e40) && k71.k.b(this.a, ((e40) obj).a);
    }

    public final int hashCode() {
        d40 d40Var = this.a;
        if (d40Var == null) {
            return 0;
        }
        return d40Var.hashCode();
    }

    public final String toString() {
        return "UpdateDiscussion(discussion=" + this.a + ")";
    }
}
