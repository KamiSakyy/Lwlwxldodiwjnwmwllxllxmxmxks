package my0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c1 implements aa.m0 {
    public e1 a;

    public c1(e1 e1Var) {
        this.a = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c1) && k71.k.b(this.a, ((c1) obj).a);
    }

    public final int hashCode() {
        e1 e1Var = this.a;
        if (e1Var == null) {
            return 0;
        }
        return e1Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
