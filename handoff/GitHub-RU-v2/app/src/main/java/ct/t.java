package ct;

import com.github.rudroid.copilot.h1;
import java.util.List;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public String a;
    public String b;
    public boolean c;
    public ya0 d;
    public List e;
    public r f;
    public String g;

    public t(String str, String str2, boolean z, ya0 ya0Var, List list, r rVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = ya0Var;
        this.e = list;
        this.f = rVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b) && this.c == tVar.c && this.d == tVar.d && k71.k.b(this.e, tVar.e) && k71.k.b(this.f, tVar.f) && k71.k.b(this.g, tVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        ya0 ya0Var = this.d;
        int hashCode = (e + (ya0Var == null ? 0 : ya0Var.hashCode())) * 31;
        List list = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(id=", this.a, ", name=", this.b, ", isPrivate=");
        o.append(this.c);
        o.append(", viewerSubscription=");
        o.append(this.d);
        o.append(", viewerSubscriptionTypes=");
        o.append(this.e);
        o.append(", owner=");
        o.append(this.f);
        o.append(", __typename=");
        return h1.p(o, this.g, ")");
    }
}
