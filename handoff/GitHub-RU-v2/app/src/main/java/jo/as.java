package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class as {
    public final String a;
    public final String b;
    public final String c;
    public final m10.xz d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final es h;
    public final boolean i;
    public final List j;
    public final qr k;
    public final nv.a l;

    public as(String str, String str2, String str3, m10.xz xzVar, boolean z, boolean z2, boolean z3, es esVar, boolean z4, List list, qr qrVar, nv.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = xzVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = esVar;
        this.i = z4;
        this.j = list;
        this.k = qrVar;
        this.l = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as)) {
            return false;
        }
        as asVar = (as) obj;
        return k71.k.b(this.a, asVar.a) && k71.k.b(this.b, asVar.b) && k71.k.b(this.c, asVar.c) && this.d == asVar.d && this.e == asVar.e && this.f == asVar.f && this.g == asVar.g && k71.k.b(this.h, asVar.h) && this.i == asVar.i && k71.k.b(this.j, asVar.j) && k71.k.b(this.k, asVar.k) && k71.k.b(this.l, asVar.l);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        es esVar = this.h;
        int e2 = x.i.e((e + (esVar == null ? 0 : esVar.hashCode())) * 31, 31, this.i);
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
