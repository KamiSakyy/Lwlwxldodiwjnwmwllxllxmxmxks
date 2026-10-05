package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b1 implements aa.m0 {
    public final d1 a;

    public b1(d1 d1Var) {
        this.a = d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b1) && k71.k.b(this.a, ((b1) obj).a);
    }

    public final int hashCode() {
        d1 d1Var = this.a;
        if (d1Var == null) {
            return 0;
        }
        return d1Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
