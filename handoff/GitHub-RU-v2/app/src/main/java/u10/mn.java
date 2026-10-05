package u10;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class mn {
    public final String a;
    public final boolean b;
    public final kn c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final List g;
    public final String h;
    public final g80.a i;

    public mn(String str, boolean z, kn knVar, boolean z2, boolean z3, boolean z4, List list, String str2, g80.a aVar) {
        this.a = str;
        this.b = z;
        this.c = knVar;
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
        if (!(obj instanceof mn)) {
            return false;
        }
        mn mnVar = (mn) obj;
        return k71.k.b(this.a, mnVar.a) && this.b == mnVar.b && k71.k.b(this.c, mnVar.c) && this.d == mnVar.d && this.e == mnVar.e && this.f == mnVar.f && k71.k.b(this.g, mnVar.g) && k71.k.b(this.h, mnVar.h) && k71.k.b(this.i, mnVar.i);
    }

    public final int hashCode() {
        int e = x.i.e(this.a.hashCode() * 31, 31, this.b);
        kn knVar = this.c;
        int e2 = x.i.e(x.i.e(x.i.e((e + (knVar == null ? 0 : knVar.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f);
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
