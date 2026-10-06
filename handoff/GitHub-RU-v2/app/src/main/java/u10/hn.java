package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class hn {
    public String a;
    public String b;
    public String c;
    public hc0.bm d;
    public boolean e;
    public boolean f;
    public boolean g;
    public ln h;
    public boolean i;
    public List j;
    public xm k;
    public g80.a l;

    public hn(String str, String str2, String str3, hc0.bm bmVar, boolean z, boolean z2, boolean z3, ln lnVar, boolean z4, List list, xm xmVar, g80.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = bmVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = lnVar;
        this.i = z4;
        this.j = list;
        this.k = xmVar;
        this.l = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) obj;
        return k71.k.b(this.a, hnVar.a) && k71.k.b(this.b, hnVar.b) && k71.k.b(this.c, hnVar.c) && this.d == hnVar.d && this.e == hnVar.e && this.f == hnVar.f && this.g == hnVar.g && k71.k.b(this.h, hnVar.h) && this.i == hnVar.i && k71.k.b(this.j, hnVar.j) && k71.k.b(this.k, hnVar.k) && k71.k.b(this.l, hnVar.l);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        ln lnVar = this.h;
        int e2 = x.i.e((e + (lnVar == null ? 0 : lnVar.hashCode())) * 31, 31, this.i);
        List list = this.j;
        return this.l.hashCode() + ((this.k.hashCode() + ((e2 + (list != null ? list.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("OnPullRequestReviewThread(__typename=", this.a, ", id=", this.b, ", path=");
        o.append(this.c);
        o.append(", subjectType=");
        o.append(this.d);
        o.append(", isResolved=");
        com.github.rudroid.m0.A(o, this.e, ", viewerCanResolve=", this.f, ", viewerCanUnresolve=");
        o.append(this.g);
        o.append(", resolvedBy=");
        o.append(this.h);
        o.append(", viewerCanReply=");
        o.append(this.i);
        o.append(", diffLines=");
        o.append(this.j);
        o.append(", comments=");
        o.append(this.k);
        o.append(", multiLineCommentFields=");
        o.append(this.l);
        o.append(")");
        return o.toString();
    }

    public Object i;
}
