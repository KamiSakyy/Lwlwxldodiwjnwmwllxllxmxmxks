package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e80 implements aa.m0 {
    public final f80 a;

    public e80(f80 f80Var) {
        this.a = f80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e80) && k71.k.b(this.a, ((e80) obj).a);
    }

    public final int hashCode() {
        f80 f80Var = this.a;
        if (f80Var == null) {
            return 0;
        }
        return f80Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserMobileTimeZone=" + this.a + ")";
    }










}
