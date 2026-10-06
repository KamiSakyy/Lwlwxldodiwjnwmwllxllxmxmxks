package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j1 {
    public String a;
    public k1 b;

    public j1(String str, k1 k1Var) {
        this.a = str;
        this.b = k1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return k71.k.b(this.a, j1Var.a) && k71.k.b(this.b, j1Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        k1 k1Var = this.b;
        return hashCode + (k1Var != null ? k1Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
