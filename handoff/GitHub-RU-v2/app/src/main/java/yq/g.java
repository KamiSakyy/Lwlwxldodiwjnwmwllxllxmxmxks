package yq;

import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public final int a;
    public final String b;
    public final b00 c;
    public final l d;
    public final boolean e;
    public final boolean f;
    public final String g;

    public g(int i, String str, b00 b00Var, l lVar, boolean z, boolean z2, String str2) {
        this.a = i;
        this.b = str;
        this.c = b00Var;
        this.d = lVar;
        this.e = z;
        this.f = z2;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && k71.k.b(this.b, gVar.b) && this.c == gVar.c && k71.k.b(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && k71.k.b(this.g, gVar.g);
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
