package ur0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import java.util.List;
import pz0.f40;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n {
    public final String a;
    public final String b;
    public final boolean c;
    public final f40 d;
    public final List e;
    public final l f;
    public final String g;

    public n(String str, String str2, boolean z, f40 f40Var, List list, l lVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = f40Var;
        this.e = list;
        this.f = lVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && this.c == nVar.c && this.d == nVar.d && k71.k.b(this.e, nVar.e) && k71.k.b(this.f, nVar.f) && k71.k.b(this.g, nVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        f40 f40Var = this.d;
        int hashCode = (e + (f40Var == null ? 0 : f40Var.hashCode())) * 31;
        List list = this.e;
        return this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("Repository(id=", this.a, ", name=", this.b, ", isPrivate=");
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
