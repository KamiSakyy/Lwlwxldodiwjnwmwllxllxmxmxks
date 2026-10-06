package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h20 implements aaShadow.m0 {
    public i20 a;

    public h20(i20 i20Var) {
        this.a = i20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h20) && k71.k.b(this.a, ((h20) obj).a);
    }

    public final int hashCode() {
        i20 i20Var = this.a;
        if (i20Var == null) {
            return 0;
        }
        return i20Var.hashCode();
    }

    public final String toString() {
        return "Data(unlockLockable=" + this.a + ")";
    }
}
