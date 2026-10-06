package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e70 implements aaShadow.m0 {
    public final g70 a;

    public e70(g70 g70Var) {
        this.a = g70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e70) && k71.k.b(this.a, ((e70) obj).a);
    }

    public final int hashCode() {
        g70 g70Var = this.a;
        if (g70Var == null) {
            return 0;
        }
        return g70Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSchedules=" + this.a + ")";
    }
}
