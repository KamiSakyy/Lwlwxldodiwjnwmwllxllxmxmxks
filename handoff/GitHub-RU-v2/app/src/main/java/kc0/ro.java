package kc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ro {
    public final String a;
    public final boolean b;
    public final po c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final String h;
    public final yi0.a i;

    public ro(String str, boolean z, po poVar, boolean z2, boolean z3, boolean z4, List list, String str2, yi0.a aVar) {
        this.a = str;
        this.b = z;
        this.c = poVar;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = list;
        this.h = str2;
        this.i = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro)) {
            return false;
        }
        ro roVar = (ro) obj;
        return k71.k.b(this.a, roVar.a) && this.b == roVar.b && k71.k.b(this.c, roVar.c) && this.d == roVar.d && this.e == roVar.e && this.f == roVar.f && k71.k.b(this.g, roVar.g) && k71.k.b(this.h, roVar.h) && k71.k.b(this.i, roVar.i);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        po poVar = this.c;
        int e2 = x.i.e(x.i.e(x.i.e((e + (poVar == null ? 0 : poVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
        List list = this.g;
        return this.i.hashCode() + com.github.rudroid.copilot.h1.i((e2 + (list != null ? list.hashCode() : 0)) * 31, this.h, 31);
    }

    public final String toString() {
        StringBuilder o = com.github.rudroid.m0.o("Thread(__typename=", this.a, ", isResolved=", ", resolvedBy=", this.b);
        o.append(this.c);
        o.append(", viewerCanResolve=");
        o.append(this.d);
        o.append(", viewerCanUnresolve=");
        com.github.rudroid.m0.A(o, this.e, ", viewerCanReply=", this.f, ", diffLines=");
        o.append(this.g);
        o.append(", id=");
        o.append(this.h);
        o.append(", multiLineCommentFields=");
        o.append(this.i);
        o.append(")");
        return o.toString();
    }
}
