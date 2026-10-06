package cg;

import java.util.List;
import k71.k;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final List a;
    public final e1 b;
    public final c c;

    public b(List list, e1 e1Var, c cVar) {
        k.g(list, "copilotManageSubscriptionItems");
        k.g(e1Var, "currentLicenseType");
        this.a = list;
        this.b = e1Var;
        this.c = cVar;
    }

    public static b a(b bVar, c cVar) {
        List list = bVar.a;
        e1 e1Var = bVar.b;
        k.g(list, "copilotManageSubscriptionItems");
        k.g(e1Var, "currentLicenseType");
        return new b(list, e1Var, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && this.b == bVar.b && k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        c cVar = this.c;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return "CopilotManageSubscriptionUiModel(copilotManageSubscriptionItems=" + this.a + ", currentLicenseType=" + this.b + ", downgradeDialogData=" + this.c + ")";
    }
}
