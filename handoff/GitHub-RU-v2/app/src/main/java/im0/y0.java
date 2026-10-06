package im0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y0 {
    public final String a;
    public final z0 b;

    public y0(String str, z0 z0Var) {
        this.a = str;
        this.b = z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        z0 z0Var = this.b;
        return hashCode + (z0Var != null ? z0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
