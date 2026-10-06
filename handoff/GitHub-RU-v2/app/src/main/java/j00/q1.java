package j00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class q1 {
    public final o1 a;
    public final String b;
    public final String c;

    public q1(o1 o1Var, String str, String str2) {
        this.a = o1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        return k71.k.b(this.a, q1Var.a) && k71.k.b(this.b, q1Var.b) && k71.k.b(this.c, q1Var.c);
    }

    public final int hashCode() {
        o1 o1Var = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((o1Var == null ? 0 : Boolean.hashCode(o1Var.a)) * 31, this.b, 31);
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
