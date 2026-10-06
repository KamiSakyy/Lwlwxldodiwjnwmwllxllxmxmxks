package z70;

import hc0.uu;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k2 {
    public String a;
    public uu b;
    public String c;

    public k2(uu uuVar, String str, String str2) {
        this.a = str;
        this.b = uuVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return k71.k.b(this.a, k2Var.a) && this.b == k2Var.b && k71.k.b(this.c, k2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatusCheckRollup(id=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
