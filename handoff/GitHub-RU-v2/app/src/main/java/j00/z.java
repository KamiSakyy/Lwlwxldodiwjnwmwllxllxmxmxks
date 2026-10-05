package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z {
    public final String a;
    public final a0 b;

    public z(String str, a0 a0Var) {
        this.a = str;
        this.b = a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return k71.k.b(this.a, zVar.a) && k71.k.b(this.b, zVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        a0 a0Var = this.b;
        return hashCode + (a0Var != null ? a0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
}
