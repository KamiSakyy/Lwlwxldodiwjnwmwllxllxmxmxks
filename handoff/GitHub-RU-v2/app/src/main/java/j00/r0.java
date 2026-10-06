package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 {
    public final String a;
    public final s0 b;

    public r0(String str, s0 s0Var) {
        this.a = str;
        this.b = s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return k71.k.b(this.a, r0Var.a) && k71.k.b(this.b, r0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        s0 s0Var = this.b;
        return hashCode + (s0Var != null ? s0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
