package kq0;

import a0.s0;
import com.github.rudroid.copilot.h1;
import pz0.bf;
import pz0.df;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public String a;
    public int b;
    public String c;
    public bf d;
    public g e;
    public df f;
    public String g;

    public b(String str, int i, String str2, bf bfVar, g gVar, df dfVar, String str3) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = bfVar;
        this.e = gVar;
        this.f = dfVar;
        this.g = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && this.b == bVar.b && k71.k.b(this.c, bVar.c) && this.d == bVar.d && k71.k.b(this.e, bVar.e) && this.f == bVar.f && k71.k.b(this.g, bVar.g);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + h1.i(s0.b(this.b, this.a.hashCode() * 31, 31), this.c, 31)) * 31)) * 31;
        df dfVar = this.f;
        return this.g.hashCode() + ((hashCode + (dfVar == null ? 0 : dfVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "OnIssue(__typename=", this.a, ", number=", ", title=");
        n.append(this.c);
        n.append(", issueState=");
        n.append(this.d);
        n.append(", repository=");
        n.append(this.e);
        n.append(", stateReason=");
        n.append(this.f);
        n.append(", id=");
        return h1.p(n, this.g, ")");
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
}
