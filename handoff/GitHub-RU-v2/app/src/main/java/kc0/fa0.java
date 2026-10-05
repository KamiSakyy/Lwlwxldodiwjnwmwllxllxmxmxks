package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fa0 {
    public final ga0 a;

    public fa0(ga0 ga0Var) {
        this.a = ga0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fa0) && k71.k.b(this.a, ((fa0) obj).a);
    }

    public final int hashCode() {
        ga0 ga0Var = this.a;
        if (ga0Var == null) {
            return 0;
        }
        return ga0Var.hashCode();
    }

    public final String toString() {
        return "UpdateUserMobileTimeZone(user=" + this.a + ")";
    }
}
