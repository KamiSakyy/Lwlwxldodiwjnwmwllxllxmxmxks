package py;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public final String a;
    public final boolean b;
    public final l c;
    public final m d;
    public final String e;

    public o(String str, boolean z, l lVar, m mVar, String str2) {
        this.a = str;
        this.b = z;
        this.c = lVar;
        this.d = mVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && this.b == oVar.b && k71.k.b(this.c, oVar.c) && k71.k.b(this.d, oVar.d) && k71.k.b(this.e, oVar.e);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        l lVar = this.c;
        int hashCode = (e + (lVar == null ? 0 : lVar.hashCode())) * 31;
        m mVar = this.d;
        return this.e.hashCode() + ((hashCode + (mVar != null ? mVar.hashCode() : 0)) * 31);
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
