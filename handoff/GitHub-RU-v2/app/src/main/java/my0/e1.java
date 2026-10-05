package my0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 {
    public final String a;
    public final f1 b;

    public e1(String str, f1 f1Var) {
        this.a = str;
        this.b = f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj;
        return k71.k.b(this.a, e1Var.a) && k71.k.b(this.b, e1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        f1 f1Var = this.b;
        return hashCode + (f1Var != null ? f1Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
