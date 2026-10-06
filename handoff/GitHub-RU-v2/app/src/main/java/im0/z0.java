package im0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 {
    public final String a;
    public final x0 b;
    public final String c;

    public z0(String str, x0 x0Var, String str2) {
        this.a = str;
        this.b = x0Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return k71.k.b(this.a, z0Var.a) && k71.k.b(this.b, z0Var.b) && k71.k.b(this.c, z0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x0 x0Var = this.b;
        return this.c.hashCode() + ((hashCode + (x0Var == null ? 0 : Boolean.hashCode(x0Var.a))) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(id=");
        sb.append(this.a);
        sb.append(", mobilePushNotificationSettings=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
