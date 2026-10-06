package a40;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import hc0.fm;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public final int a;
    public final String b;
    public final fm c;
    public final k d;
    public final boolean e;
    public final String f;

    public f(int i, String str, fm fmVar, k kVar, boolean z, String str2) {
        this.a = i;
        this.b = str;
        this.c = fmVar;
        this.d = kVar;
        this.e = z;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a == fVar.a && k71.k.b(this.b, fVar.b) && this.c == fVar.c && k71.k.b(this.d, fVar.d) && this.e == fVar.e && k71.k.b(this.f, fVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + x.i.e((this.d.hashCode() + ((this.c.hashCode() + h1.i(Integer.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "OnPullRequest(number=", ", title=", this.b, ", state=");
        n.append(this.c);
        n.append(", repository=");
        n.append(this.d);
        n.append(", isDraft=");
        return m0.l(n, this.e, ", id=", this.f, ")");
    }
}
