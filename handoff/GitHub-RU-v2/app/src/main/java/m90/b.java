package m90;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import hc0.ev;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b implements h0 {
    public String a;
    public String b;
    public ev c;
    public boolean d;
    public a e;

    public b(String str, String str2, ev evVar, boolean z, a aVar) {
        k.g(str, "__typename");
        this.a = str;
        this.b = str2;
        this.c = evVar;
        this.d = z;
        this.e = aVar;
    }

    public static b a(b bVar, ev evVar, a aVar, int i) {
        String str = bVar.a;
        String str2 = bVar.b;
        if ((i & 4) != 0) {
            evVar = bVar.c;
        }
        ev evVar2 = evVar;
        boolean z = bVar.d;
        if ((i & 16) != 0) {
            aVar = bVar.e;
        }
        k.g(str, "__typename");
        return new b(str, str2, evVar2, z, aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && this.c == bVar.c && this.d == bVar.d && k.b(this.e, bVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        ev evVar = this.c;
        int e = i.e((i + (evVar == null ? 0 : evVar.hashCode())) * 31, 31, this.d);
        a aVar = this.e;
        return e + (aVar != null ? aVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("SubscribableFragment(__typename=", this.a, ", id=", this.b, ", viewerSubscription=");
        o.append(this.c);
        o.append(", viewerCanSubscribe=");
        o.append(this.d);
        o.append(", onRepository=");
        o.append(this.e);
        o.append(")");
        return o.toString();
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
