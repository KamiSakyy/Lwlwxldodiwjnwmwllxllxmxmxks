package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pa0 implements aaShadow.m0 {
    public ra0 a;

    public pa0(ra0 ra0Var) {
        this.a = ra0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pa0) && k71.k.b(this.a, ((pa0) obj).a);
    }

    public final int hashCode() {
        ra0 ra0Var = this.a;
        if (ra0Var == null) {
            return 0;
        }
        return ra0Var.hashCode();
    }

    public final String toString() {
        return "Data(unlockLockable=" + this.a + ")";
    }
}
