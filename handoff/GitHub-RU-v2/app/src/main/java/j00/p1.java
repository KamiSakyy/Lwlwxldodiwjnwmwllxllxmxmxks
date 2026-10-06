package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p1 {
    public final String a;
    public final q1 b;

    public p1(String str, q1 q1Var) {
        this.a = str;
        this.b = q1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj;
        return k71.k.b(this.a, p1Var.a) && k71.k.b(this.b, p1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        q1 q1Var = this.b;
        return hashCode + (q1Var != null ? q1Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
