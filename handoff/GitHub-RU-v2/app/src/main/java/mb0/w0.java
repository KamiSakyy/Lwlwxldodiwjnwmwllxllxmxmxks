package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class w0 implements aa.m0 {
    public final y0 a;

    public w0(y0 y0Var) {
        this.a = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && k71.k.b(this.a, ((w0) obj).a);
    }

    public final int hashCode() {
        y0 y0Var = this.a;
        if (y0Var == null) {
            return 0;
        }
        return y0Var.hashCode();
    }

    public final String toString() {
        return "Data(updateMobilePushNotificationSettings=" + this.a + ")";
    }
}
