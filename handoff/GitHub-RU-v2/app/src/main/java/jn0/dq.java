package jn0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dq {
    public final String a;
    public final String b;
    public final String c;
    public final pz0.cu d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final hq h;
    public final boolean i;
    public final List j;
    public final tp k;
    public final eu0.a l;

    public dq(String str, String str2, String str3, pz0.cu cuVar, boolean z, boolean z2, boolean z3, hq hqVar, boolean z4, List list, tp tpVar, eu0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = cuVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = hqVar;
        this.i = z4;
        this.j = list;
        this.k = tpVar;
        this.l = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq)) {
            return false;
        }
        dq dqVar = (dq) obj;
        return k71.k.b(this.a, dqVar.a) && k71.k.b(this.b, dqVar.b) && k71.k.b(this.c, dqVar.c) && this.d == dqVar.d && this.e == dqVar.e && this.f == dqVar.f && this.g == dqVar.g && k71.k.b(this.h, dqVar.h) && this.i == dqVar.i && k71.k.b(this.j, dqVar.j) && k71.k.b(this.k, dqVar.k) && k71.k.b(this.l, dqVar.l);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        hq hqVar = this.h;
        int e2 = x.i.e((e + (hqVar == null ? 0 : hqVar.hashCode())) * 31, 31, this.i);
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
}
