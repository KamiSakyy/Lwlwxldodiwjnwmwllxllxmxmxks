package ri0;

import gn0.kw;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n2 {
    public final String a;
    public final String b;
    public final kw c;
    public final List d;
    public final m2 e;
    public final String f;

    public n2(String str, String str2, kw kwVar, List list, m2 m2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = kwVar;
        this.d = list;
        this.e = m2Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj;
        return k71.k.b(this.a, n2Var.a) && k71.k.b(this.b, n2Var.b) && this.c == n2Var.c && k71.k.b(this.d, n2Var.d) && k71.k.b(this.e, n2Var.e) && k71.k.b(this.f, n2Var.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        kw kwVar = this.c;
        int hashCode = (i + (kwVar == null ? 0 : kwVar.hashCode())) * 31;
        List list = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", viewerSubscription=");
        o.append(this.c);
        o.append(", viewerSubscriptionTypes=");
        o.append(this.d);
        o.append(", owner=");
        o.append(this.e);
        o.append(", __typename=");
        o.append(this.f);
        o.append(")");
        return o.toString();
    }
}
