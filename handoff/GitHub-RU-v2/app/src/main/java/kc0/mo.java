package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class mo {
    public String a;
    public String b;
    public String c;
    public gn0.dn d;
    public boolean e;
    public boolean f;
    public boolean g;
    public qo h;
    public boolean i;
    public List j;
    public bo k;
    public yi0.a l;

    public mo(String str, String str2, String str3, gn0.dn dnVar, boolean z, boolean z2, boolean z3, qo qoVar, boolean z4, List list, bo boVar, yi0.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dnVar;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = qoVar;
        this.i = z4;
        this.j = list;
        this.k = boVar;
        this.l = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo)) {
            return false;
        }
        mo moVar = (mo) obj;
        return k71.k.b(this.a, moVar.a) && k71.k.b(this.b, moVar.b) && k71.k.b(this.c, moVar.c) && this.d == moVar.d && this.e == moVar.e && this.f == moVar.f && this.g == moVar.g && k71.k.b(this.h, moVar.h) && this.i == moVar.i && k71.k.b(this.j, moVar.j) && k71.k.b(this.k, moVar.k) && k71.k.b(this.l, moVar.l);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e((this.d.hashCode() + com.github.rudroid.copilot.h1.i(com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31)) * 31, 31, this.e), 31, this.f), 31, this.g);
        qo qoVar = this.h;
        int e2 = x.i.e((e + (qoVar == null ? 0 : qoVar.hashCode())) * 31, 31, this.i);
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
