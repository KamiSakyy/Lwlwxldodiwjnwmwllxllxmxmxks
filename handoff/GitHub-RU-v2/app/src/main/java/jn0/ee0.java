package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ee0 implements aaShadow.m0 {
    public final fe0 a;

    public ee0(fe0 fe0Var) {
        this.a = fe0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ee0) && k71.k.b(this.a, ((ee0) obj).a);
    }

    public final int hashCode() {
        fe0 fe0Var = this.a;
        if (fe0Var == null) {
            return 0;
        }
        return fe0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserMobileTimeZone=" + this.a + ")";
    }
}
