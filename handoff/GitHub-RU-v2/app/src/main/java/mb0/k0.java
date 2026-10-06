package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 implements aa.m0 {
    public m0 a;

    public k0(m0 m0Var) {
        this.a = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k0) && k71.k.b(this.a, ((k0) obj).a);
    }

    public final int hashCode() {
        m0 m0Var = this.a;
        if (m0Var == null) {
            return 0;
        }
        return m0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
