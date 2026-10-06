package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 implements aa.m0 {
    public s0 a;

    public q0(s0 s0Var) {
        this.a = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q0) && k71.k.b(this.a, ((q0) obj).a);
    }

    public final int hashCode() {
        s0 s0Var = this.a;
        if (s0Var == null) {
            return 0;
        }
        return s0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
