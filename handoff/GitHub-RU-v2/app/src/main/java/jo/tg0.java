package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class tg0 {
    public final ug0 a;

    public tg0(ug0 ug0Var) {
        this.a = ug0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tg0) && k71.k.b(this.a, ((tg0) obj).a);
    }

    public final int hashCode() {
        ug0 ug0Var = this.a;
        if (ug0Var == null) {
            return 0;
        }
        return ug0Var.hashCode();
    }

    public final String toString() {
        return "UpdateUserMobileTimeZone(user=" + this.a + ")";
    }
}
