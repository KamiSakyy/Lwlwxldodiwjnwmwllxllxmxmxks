package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e90 implements aaShadow.m0 {
    public g90 a;

    public e90(g90 g90Var) {
        this.a = g90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e90) && k71.k.b(this.a, ((e90) obj).a);
    }

    public final int hashCode() {
        g90 g90Var = this.a;
        if (g90Var == null) {
            return 0;
        }
        return g90Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSchedules=" + this.a + ")";
    }
}
