package o40;

import a0.s0;
import com.github.rudroid.copilot.h1;
import hc0.fm;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final String a;
    public final int b;
    public final String c;
    public final fm d;
    public final f e;
    public final boolean f;
    public final String g;

    public c(String str, int i, String str2, fm fmVar, f fVar, boolean z, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = fmVar;
        this.e = fVar;
        this.f = z;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k71.k.b(this.a, cVar.a) && this.b == cVar.b && k71.k.b(this.c, cVar.c) && this.d == cVar.d && k71.k.b(this.e, cVar.e) && this.f == cVar.f && k71.k.b(this.g, cVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + x.i.e((this.e.hashCode() + ((this.d.hashCode() + h1.i(s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "OnPullRequest(__typename=", this.a, ", number=", ", title=");
        n.append(this.c);
        n.append(", pullRequestState=");
        n.append(this.d);
        n.append(", repository=");
        n.append(this.e);
        n.append(", isDraft=");
        n.append(this.f);
        n.append(", id=");
        return h1.p(n, this.g, ")");
    }
    public Object b(Object p1) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public static final Object a = null;
    public static final Object f = null;
}
