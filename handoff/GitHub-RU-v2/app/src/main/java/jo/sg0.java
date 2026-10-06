package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sg0 implements aaShadow.m0 {
    public final tg0 a;

    public sg0(tg0 tg0Var) {
        this.a = tg0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sg0) && k71.k.b(this.a, ((sg0) obj).a);
    }

    public final int hashCode() {
        tg0 tg0Var = this.a;
        if (tg0Var == null) {
            return 0;
        }
        return tg0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateUserMobileTimeZone=" + this.a + ")";
    }
}
