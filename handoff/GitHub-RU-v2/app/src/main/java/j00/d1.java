package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1 {
    public String a;
    public e1 b;

    public d1(String str, e1 e1Var) {
        this.a = str;
        this.b = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        e1 e1Var = this.b;
        return hashCode + (e1Var != null ? e1Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
