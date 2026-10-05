package my0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g0 {
    public final String a;
    public final h0 b;

    public g0(String str, h0 h0Var) {
        this.a = str;
        this.b = h0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return k71.k.b(this.a, g0Var.a) && k71.k.b(this.b, g0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        h0 h0Var = this.b;
        return hashCode + (h0Var != null ? h0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
