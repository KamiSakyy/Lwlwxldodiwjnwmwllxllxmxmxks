package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0 {
    public k0 a;
    public String b;
    public String c;

    public m0(k0 k0Var, String str, String str2) {
        this.a = k0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        return k71.k.b(this.a, m0Var.a) && k71.k.b(this.b, m0Var.b) && k71.k.b(this.c, m0Var.c);
    }

    public final int hashCode() {
        k0 k0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((k0Var == null ? 0 : Boolean.hashCode(k0Var.a)) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(mobilePushNotificationSettings=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
    public static Object A(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
    public static Object e(Object p1, Object p2, Object p3) { return null; }
    public static Object i(Object p1, Object p2, Object p3) { return null; }
}
