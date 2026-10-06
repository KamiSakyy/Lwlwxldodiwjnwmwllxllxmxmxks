package fw0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j2 implements aa.h0 {
    public i2 a;
    public String b;
    public String c;

    public j2(i2 i2Var, String str, String str2) {
        this.a = i2Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return k71.k.b(this.a, j2Var.a) && k71.k.b(this.b, j2Var.b) && k71.k.b(this.c, j2Var.c);
    }

    public final int hashCode() {
        i2 i2Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((i2Var == null ? 0 : i2Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebNotificationsEnabled(notificationSettings=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
