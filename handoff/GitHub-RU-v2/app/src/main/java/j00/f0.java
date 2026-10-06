package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f0 {
    public final String a;
    public final g0 b;

    public f0(String str, g0 g0Var) {
        this.a = str;
        this.b = g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return k71.k.b(this.a, f0Var.a) && k71.k.b(this.b, f0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        g0 g0Var = this.b;
        return hashCode + (g0Var != null ? g0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
