package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0 {
    public String a;
    public b0 b;

    public a0(String str, b0 b0Var) {
        this.a = str;
        this.b = b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return k71.k.b(this.a, a0Var.a) && k71.k.b(this.b, a0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        b0 b0Var = this.b;
        return hashCode + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
