package am0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d1 {
    public String a;
    public String b;
    public wh0.a c;

    public d1(String str, String str2, wh0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return k71.k.b(this.a, d1Var.a) && k71.k.b(this.b, d1Var.b) && k71.k.b(this.c, d1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Node(__typename=", this.a, ", id=", this.b, ", notificationListItem=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
