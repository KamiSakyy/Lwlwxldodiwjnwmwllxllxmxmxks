package z70;

import hc0.ev;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j2 {
    public String a;
    public String b;
    public ev c;
    public List d;
    public i2 e;
    public String f;

    public j2(String str, String str2, ev evVar, List list, i2 i2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = evVar;
        this.d = list;
        this.e = i2Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2)) {
            return false;
        }
        j2 j2Var = (j2) obj;
        return k71.k.b(this.a, j2Var.a) && k71.k.b(this.b, j2Var.b) && this.c == j2Var.c && k71.k.b(this.d, j2Var.d) && k71.k.b(this.e, j2Var.e) && k71.k.b(this.f, j2Var.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ev evVar = this.c;
        int hashCode = (i + (evVar == null ? 0 : evVar.hashCode())) * 31;
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
