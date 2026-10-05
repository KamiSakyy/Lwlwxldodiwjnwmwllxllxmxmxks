package py;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final String a;
    public final boolean b;
    public final d c;
    public final e d;
    public final String e;

    public g(String str, boolean z, d dVar, e eVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = dVar;
        this.d = eVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return k71.k.b(this.a, gVar.a) && this.b == gVar.b && k71.k.b(this.c, gVar.c) && k71.k.b(this.d, gVar.d) && k71.k.b(this.e, gVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        d dVar = this.c;
        int hashCode = (e + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e eVar = this.d;
        return this.e.hashCode() + ((hashCode + (eVar != null ? eVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder o = m0.o("PullRequest(id=", this.a, ", isInMergeQueue=", ", mergeQueue=", this.b);
        o.append(this.c);
        o.append(", mergeQueueEntry=");
        o.append(this.d);
        o.append(", __typename=");
        return h1.p(o, this.e, ")");
    }
}
