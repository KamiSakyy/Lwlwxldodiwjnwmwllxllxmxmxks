package wp0;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public final int a;
    public final String b;
    public final gu c;
    public final k d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public f(int i, String str, gu guVar, k kVar, boolean z, boolean z2, String str2) {
        this.a = i;
        this.b = str;
        this.c = guVar;
        this.d = kVar;
        this.e = z;
        this.f = z2;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && k71.k.b(this.b, fVar.b) && this.c == fVar.c && k71.k.b(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && k71.k.b(this.g, fVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + x.i.e(x.i.e((this.d.hashCode() + ((this.c.hashCode() + h1.i(Integer.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "OnPullRequest(number=", ", title=", this.b, ", state=");
        n.append(this.c);
        n.append(", repository=");
        n.append(this.d);
        n.append(", isInMergeQueue=");
        m0.A(n, this.e, ", isDraft=", this.f, ", id=");
        return h1.p(n, this.g, ")");
    }
}
