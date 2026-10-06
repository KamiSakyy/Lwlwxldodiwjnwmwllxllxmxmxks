package qx;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l2 implements aa.h0 {
    public final k2 a;
    public final String b;
    public final String c;

    public l2(k2 k2Var, String str, String str2) {
        this.a = k2Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return k71.k.b(this.a, l2Var.a) && k71.k.b(this.b, l2Var.b) && k71.k.b(this.c, l2Var.c);
    }

    public final int hashCode() {
        k2 k2Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((k2Var == null ? 0 : k2Var.hashCode()) * 31, this.b, 31);
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
