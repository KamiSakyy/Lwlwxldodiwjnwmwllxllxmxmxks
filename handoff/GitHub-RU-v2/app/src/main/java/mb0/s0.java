package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s0 {
    public String a;
    public t0 b;

    public s0(String str, t0 t0Var) {
        this.a = str;
        this.b = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return k71.k.b(this.a, s0Var.a) && k71.k.b(this.b, s0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        t0 t0Var = this.b;
        return hashCode + (t0Var != null ? t0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
