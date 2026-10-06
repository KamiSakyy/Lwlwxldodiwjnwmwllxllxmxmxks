package mg0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import gn0.kw;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public String a;
    public String b;
    public boolean c;
    public kw d;
    public List e;
    public k f;
    public String g;

    public l(String str, String str2, boolean z, kw kwVar, List list, k kVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = kwVar;
        this.e = list;
        this.f = kVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && k71.k.b(this.b, lVar.b) && this.c == lVar.c && this.d == lVar.d && k71.k.b(this.e, lVar.e) && k71.k.b(this.f, lVar.f) && k71.k.b(this.g, lVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        kw kwVar = this.d;
        int hashCode = (e + (kwVar == null ? 0 : kwVar.hashCode())) * 31;
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
