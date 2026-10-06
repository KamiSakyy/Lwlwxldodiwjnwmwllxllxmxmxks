package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sf0 implements aaShadow.m0 {
    public final uf0 a;

    public sf0(uf0 uf0Var) {
        this.a = uf0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sf0) && k71.k.b(this.a, ((sf0) obj).a);
    }

    public final int hashCode() {
        uf0 uf0Var = this.a;
        if (uf0Var == null) {
            return 0;
        }
        return uf0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSchedules=" + this.a + ")";
    }
}
