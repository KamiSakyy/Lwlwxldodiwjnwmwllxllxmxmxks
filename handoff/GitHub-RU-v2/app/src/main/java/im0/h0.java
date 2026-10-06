package im0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h0 {
    public final f0 a;
    public final String b;
    public final String c;

    public h0(f0 f0Var, String str, String str2) {
        this.a = f0Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return k71.k.b(this.a, h0Var.a) && k71.k.b(this.b, h0Var.b) && k71.k.b(this.c, h0Var.c);
    }

    public final int hashCode() {
        f0 f0Var = this.a;
        return this.c.hashCode() + h1.i((f0Var == null ? 0 : Boolean.hashCode(f0Var.a)) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("User(mobilePushNotificationSettings=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
