package mb0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public String a;
    public n0 b;

    public m0(String str, n0 n0Var) {
        this.a = str;
        this.b = n0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        n0 n0Var = this.b;
        return hashCode + (n0Var != null ? n0Var.hashCode() : 0);
    }

    public final String toString() {
        return "UpdateMobilePushNotificationSettings(clientMutationId=" + this.a + ", user=" + this.b + ")";
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object i(Object p1, Object p2, Object p3) { return null; }
    public static Object m(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
