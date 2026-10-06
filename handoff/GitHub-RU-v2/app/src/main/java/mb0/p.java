package mb0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class p {
    public n a;
    public String b;
    public String c;

    public p(n nVar, String str, String str2) {
        this.a = nVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return k71.k.b(this.a, pVar.a) && k71.k.b(this.b, pVar.b) && k71.k.b(this.c, pVar.c);
    }

    public final int hashCode() {
        n nVar = this.a;
        return this.c.hashCode() + h1.i((nVar == null ? 0 : Boolean.hashCode(nVar.a)) * 31, this.b, 31);
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
