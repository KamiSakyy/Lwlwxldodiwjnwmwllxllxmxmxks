package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 implements aa.m0 {
    public final l0 a;

    public j0(l0 l0Var) {
        this.a = l0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && k71.k.b(this.a, ((j0) obj).a);
    }

    public final int hashCode() {
        l0 l0Var = this.a;
        if (l0Var == null) {
            return 0;
        }
        return l0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
