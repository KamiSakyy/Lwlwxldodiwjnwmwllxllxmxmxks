package u80;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public final String a;
    public final String b;
    public final b c;
    public final a d;
    public final String e;

    public c(String str, String str2, b bVar, a aVar, String str3) {
        this.a = str;
        this.b = str2;
        this.c = bVar;
        this.d = aVar;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && k.b(this.c, cVar.c) && k.b(this.d, cVar.d) && k.b(this.e, cVar.e);
    }

    public final int hashCode() {
        int i = h1.i(this.a.hashCode() * 31, this.b, 31);
        b bVar = this.c;
        return this.e.hashCode() + ((this.d.hashCode() + ((i + (bVar == null ? 0 : bVar.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("RepoBranchFragment(id=", this.a, ", name=", this.b, ", target=");
        o.append(this.c);
        o.append(", repository=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
