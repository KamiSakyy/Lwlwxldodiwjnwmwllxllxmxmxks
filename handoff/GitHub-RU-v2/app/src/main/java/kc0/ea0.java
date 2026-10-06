package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ea0 implements aaShadow.m0 {
    public fa0 a;

    public ea0(fa0 fa0Var) {
        this.a = fa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ea0) && k71.k.b(this.a, ((ea0) obj).a);
    }

    public final int hashCode() {
        fa0 fa0Var = this.a;
        if (fa0Var == null) {
            return 0;
        }
        return fa0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserMobileTimeZone=" + this.a + ")";
    }
}
