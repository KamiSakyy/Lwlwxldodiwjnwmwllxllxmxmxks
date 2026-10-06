package ri0;

import gn0.dn;

/* loaded from: /home/user/work/p/classes4.dex */
public class s {
    public String a;
    public dn b;
    public String c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public t h;
    public boolean i;
    public q j;
    public yi0.a k;

    public s(String str, dn dnVar, String str2, boolean z, boolean z2, boolean z3, boolean z4, t tVar, boolean z5, q qVar, yi0.a aVar) {
        this.a = str;
        this.b = dnVar;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = tVar;
        this.i = z5;
        this.j = qVar;
        this.k = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return k71.k.b(this.a, sVar.a) && this.b == sVar.b && k71.k.b(this.c, sVar.c) && this.d == sVar.d && this.e == sVar.e && this.f == sVar.f && this.g == sVar.g && k71.k.b(this.h, sVar.h) && this.i == sVar.i && k71.k.b(this.j, sVar.j) && k71.k.b(this.k, sVar.k);
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(x.i.e(x.i.e(com.github.rudroid.copilot.h1.i((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        t tVar = this.h;
        return this.k.hashCode() + ((this.j.hashCode() + x.i.e((e + (tVar == null ? 0 : tVar.hashCode())) * 31, 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(__typename=");
        sb.append(this.a);
        sb.append(", subjectType=");
        sb.append(this.b);
        sb.append(", id=");
        com.github.rudroid.m0.x(sb, this.c, ", isResolved=", this.d, ", isOutdated=");
        com.github.rudroid.m0.A(sb, this.e, ", viewerCanResolve=", this.f, ", viewerCanUnresolve=");
        sb.append(this.g);
        sb.append(", resolvedBy=");
        sb.append(this.h);
        sb.append(", viewerCanReply=");
        sb.append(this.i);
        sb.append(", comments=");
        sb.append(this.j);
        sb.append(", multiLineCommentFields=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }

    public Object i;
}
