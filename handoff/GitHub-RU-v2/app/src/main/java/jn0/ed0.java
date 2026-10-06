package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ed0 implements aaShadow.m0 {
    public gd0 a;

    public ed0(gd0 gd0Var) {
        this.a = gd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ed0) && k71.k.b(this.a, ((ed0) obj).a);
    }

    public final int hashCode() {
        gd0 gd0Var = this.a;
        if (gd0Var == null) {
            return 0;
        }
        return gd0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSchedules=" + this.a + ")";
    }
}
