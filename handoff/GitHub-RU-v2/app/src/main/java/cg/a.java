package cg;

import k71.k;
import x.i;
import x9.l;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final l a;
    public final e1 b;
    public final boolean c;
    public final eg.a d;

    public a(l lVar, e1 e1Var, boolean z, eg.a aVar) {
        this.a = lVar;
        this.b = e1Var;
        this.c = z;
        this.d = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c && k.b(this.d, aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + i.e((this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "CopilotManageSubscriptionItem(productDetails=" + this.a + ", licenseType=" + this.b + ", isCurrentSubscription=" + this.c + ", copilotChatMonthlyLicenseDetails=" + this.d + ")";
    }
}
