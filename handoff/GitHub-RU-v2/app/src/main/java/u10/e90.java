package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e90 implements aa.v0 {
    public final i90 a;

    public e90(i90 i90Var) {
        this.a = i90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e90) && k71.k.b(this.a, ((e90) obj).a);
    }

    public final int hashCode() {
        i90 i90Var = this.a;
        if (i90Var == null) {
            return 0;
        }
        return i90Var.hashCode();
    }

    public final String toString() {
        return "Data(user=" + this.a + ")";
    }
}
