package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y implements aa.m0 {
    public final a0 a;

    public y(a0 a0Var) {
        this.a = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && k71.k.b(this.a, ((y) obj).a);
    }

    public final int hashCode() {
        a0 a0Var = this.a;
        if (a0Var == null) {
            return 0;
        }
        return a0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
