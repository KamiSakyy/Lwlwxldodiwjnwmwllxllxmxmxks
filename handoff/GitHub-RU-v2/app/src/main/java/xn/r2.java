package xn;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r2 {
    public final List a;
    public final List b;
    public final List c;

    public r2(List list, List list2, List list3) {
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return k71.k.b(this.a, r2Var.a) && k71.k.b(this.b, r2Var.b) && k71.k.b(this.c, r2Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + f1.e.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobileCopilotPaywall(allFeatures=");
        sb.append(this.a);
        sb.append(", disclaimers=");
        sb.append(this.b);
        sb.append(", paywallProducts=");
        return x.i.l(sb, this.c, ")");
    }
}
