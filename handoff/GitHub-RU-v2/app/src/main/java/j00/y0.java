package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public w0 a;
    public String b;
    public String c;

    public y0(w0 w0Var, String str, String str2) {
        this.a = w0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b) && k71.k.b(this.c, y0Var.c);
    }

    public final int hashCode() {
        w0 w0Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((w0Var == null ? 0 : w0Var.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(mobilePushNotificationSettings=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
