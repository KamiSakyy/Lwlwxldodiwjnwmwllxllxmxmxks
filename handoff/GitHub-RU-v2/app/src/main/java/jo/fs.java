package jo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fs {
    public final String a;
    public final boolean b;
    public final ds c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final String h;
    public final nv.a i;

    public fs(String str, boolean z, ds dsVar, boolean z2, boolean z3, boolean z4, List list, String str2, nv.a aVar) {
        this.a = str;
        this.b = z;
        this.c = dsVar;
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
        if (!(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        return k71.k.b(this.a, fsVar.a) && this.b == fsVar.b && k71.k.b(this.c, fsVar.c) && this.d == fsVar.d && this.e == fsVar.e && this.f == fsVar.f && k71.k.b(this.g, fsVar.g) && k71.k.b(this.h, fsVar.h) && k71.k.b(this.i, fsVar.i);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        ds dsVar = this.c;
        int e2 = x.i.e(x.i.e(x.i.e((e + (dsVar == null ? 0 : dsVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
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
