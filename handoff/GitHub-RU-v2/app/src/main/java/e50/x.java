package e50;

import com.github.rudroid.copilot.h1;
import hc0.ev;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xShadow implements aa.h0 {
    public String a;
    public String b;
    public w c;
    public String d;
    public String e;
    public ev f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public l0 k;
    public i80.c l;
    public g70.a m;

    public Object x(String str, String str2, w wVar, String str3, String str4, ev evVar, boolean z, boolean z2, boolean z3, boolean z4, l0 l0Var, i80.c cVar, g70.a aVar) {
        this.a = str;
        this.b = str2;
        this.c = wVar;
        this.d = str3;
        this.e = str4;
        this.f = evVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = l0Var;
        this.l = cVar;
        this.m = aVar;
    }

    public static x a(xShadow xVar, l0 l0Var, g70.a aVar, int i) {
        String str = xVar.a;
        String str2 = xVar.b;
        w wVar = xVar.c;
        String str3 = xVar.d;
        String str4 = xVar.e;
        ev evVar = xVar.f;
        boolean z = xVar.g;
        boolean z2 = xVar.h;
        boolean z3 = xVar.i;
        boolean z4 = xVar.j;
        l0 l0Var2 = (i & 1024) != 0 ? xVar.k : l0Var;
        i80.c cVar = xVar.l;
        g70.a aVar2 = (i & 4096) != 0 ? xVar.m : aVar;
        xVar.getClass();
        return new xShadow(str, str2, wVar, str3, str4, evVar, z, z2, z3, z4, l0Var2, cVar, aVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xShadow)) {
            return false;
        }
        xShadow xVar = (xShadow) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b) && k71.k.b(this.c, xVar.c) && k71.k.b(this.d, xVar.d) && k71.k.b(this.e, xVar.e) && this.f == xVar.f && this.g == xVar.g && this.h == xVar.h && this.i == xVar.i && this.j == xVar.j && k71.k.b(this.k, xVar.k) && k71.k.b(this.l, xVar.l) && k71.k.b(this.m, xVar.m);
    }

    public final int hashCode() {
        int i = h1.i(h1.i((this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31, this.d, 31), this.e, 31);
        ev evVar = this.f;
        return this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + x.i.e(x.i.e(x.i.e(x.i.e((i + (evVar == null ? 0 : evVar.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("DiscussionDetailsFragment(__typename=", this.a, ", id=", this.b, ", repository=");
        o.append(this.c);
        o.append(", bodyHTML=");
        o.append(this.d);
        o.append(", body=");
        o.append(this.e);
        o.append(", viewerSubscription=");
        o.append(this.f);
        o.append(", locked=");
        com.github.rudroid.m0.A(o, this.g, ", viewerCanDelete=", this.h, ", viewerCanUpdate=");
        com.github.rudroid.m0.A(o, this.i, ", viewerCanUpvote=", this.j, ", discussionFragment=");
        o.append(this.k);
        o.append(", reactionFragment=");
        o.append(this.l);
        o.append(", orgBlockableFragment=");
        o.append(this.m);
        o.append(")");
        return o.toString();
    }
}
