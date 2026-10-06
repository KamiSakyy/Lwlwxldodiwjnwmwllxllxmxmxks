package gv;

import java.util.List;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x2 {
    public String a;
    public String b;
    public ya0 c;
    public List d;
    public w2 e;
    public String f;

    public x2(String str, String str2, ya0 ya0Var, List list, w2 w2Var, String str3) {
        this.a = str;
        this.b = str2;
        this.c = ya0Var;
        this.d = list;
        this.e = w2Var;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x2)) {
            return false;
        }
        x2 x2Var = (x2) obj;
        return k71.k.b(this.a, x2Var.a) && k71.k.b(this.b, x2Var.b) && this.c == x2Var.c && k71.k.b(this.d, x2Var.d) && k71.k.b(this.e, x2Var.e) && k71.k.b(this.f, x2Var.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
        ya0 ya0Var = this.c;
        int hashCode = (i + (ya0Var == null ? 0 : ya0Var.hashCode())) * 31;
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
