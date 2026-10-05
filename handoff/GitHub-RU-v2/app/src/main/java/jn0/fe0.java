package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fe0 {
    public final ge0 a;

    public fe0(ge0 ge0Var) {
        this.a = ge0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe0) && k71.k.b(this.a, ((fe0) obj).a);
    }

    public final int hashCode() {
        ge0 ge0Var = this.a;
        if (ge0Var == null) {
            return 0;
        }
        return ge0Var.hashCode();
    }

    public final String toString() {
        return "UpdateUserMobileTimeZone(user=" + this.a + ")";
    }
}
