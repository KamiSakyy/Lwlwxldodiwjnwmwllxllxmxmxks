package kp;

import a0.s0;
import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public int b;
    public String c;

    public d(String str, int i, String str2) {
        k71.k.g(str2, "subscriptionId");
        this.a = str;
        this.b = i;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && this.b == dVar.b && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + s0.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return h1.p(s0.n(this.b, "CountWithOffSetAndSubscriptionId(offSet=", this.a, ", count=", ", subscriptionId="), this.c, ")");
    }
}
