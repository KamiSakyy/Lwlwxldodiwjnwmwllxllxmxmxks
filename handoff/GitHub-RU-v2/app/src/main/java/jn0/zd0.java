package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class zd0 implements aaShadow.m0 {
    public final be0 a;

    public zd0(be0 be0Var) {
        this.a = be0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zd0) && k71.k.b(this.a, ((zd0) obj).a);
    }

    public final int hashCode() {
        be0 be0Var = this.a;
        if (be0Var == null) {
            return 0;
        }
        return be0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateSubscription=" + this.a + ")";
    }
}
