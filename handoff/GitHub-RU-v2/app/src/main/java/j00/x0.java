package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 {
    public String a;
    public y0 b;

    public x0(String str, y0 y0Var) {
        this.a = str;
        this.b = y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return k71.k.b(this.a, x0Var.a) && k71.k.b(this.b, x0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        y0 y0Var = this.b;
        return hashCode + (y0Var != null ? y0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
