package w50;

import a0.s0;
import com.github.rudroid.copilot.h1;
import hc0.ev;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public String b;
    public boolean c;
    public ev d;
    public List e;
    public j f;
    public String g;

    public k(String str, String str2, boolean z, ev evVar, List list, j jVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = evVar;
        this.e = list;
        this.f = jVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && k71.k.b(this.b, kVar.b) && this.c == kVar.c && this.d == kVar.d && k71.k.b(this.e, kVar.e) && k71.k.b(this.f, kVar.f) && k71.k.b(this.g, kVar.g);
    }

    public final int hashCode() {
        int e = x.i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        ev evVar = this.d;
        int hashCode = (e + (evVar == null ? 0 : evVar.hashCode())) * 31;
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
