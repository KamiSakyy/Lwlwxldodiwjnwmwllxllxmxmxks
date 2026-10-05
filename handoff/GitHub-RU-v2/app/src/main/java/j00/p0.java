package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p0 implements aa.m0 {
    public final r0 a;

    public p0(r0 r0Var) {
        this.a = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p0) && k71.k.b(this.a, ((p0) obj).a);
    }

    public final int hashCode() {
        r0 r0Var = this.a;
        if (r0Var == null) {
            return 0;
        }
        return r0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
