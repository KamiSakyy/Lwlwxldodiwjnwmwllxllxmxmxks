package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class v0 implements aa.m0 {
    public final x0 a;

    public v0(x0 x0Var) {
        this.a = x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v0) && k71.k.b(this.a, ((v0) obj).a);
    }

    public final int hashCode() {
        x0 x0Var = this.a;
        if (x0Var == null) {
            return 0;
        }
        return x0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
