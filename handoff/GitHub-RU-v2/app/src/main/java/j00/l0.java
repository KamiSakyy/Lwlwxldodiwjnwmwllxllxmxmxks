package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l0 {
    public final String a;
    public final m0 b;

    public l0(String str, m0 m0Var) {
        this.a = str;
        this.b = m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return k71.k.b(this.a, l0Var.a) && k71.k.b(this.b, l0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        m0 m0Var = this.b;
        return hashCode + (m0Var != null ? m0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
