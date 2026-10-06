package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n1 implements aa.m0 {
    public p1 a;

    public n1(p1 p1Var) {
        this.a = p1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n1) && k71.k.b(this.a, ((n1) obj).a);
    }

    public final int hashCode() {
        p1 p1Var = this.a;
        if (p1Var == null) {
            return 0;
        }
        return p1Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
