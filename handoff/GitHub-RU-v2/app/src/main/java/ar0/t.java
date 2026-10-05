package ar0;

import java.util.List;
import jo.f4;
import pz0.ba;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t implements aa.i0 {
    public static final s Companion = new s();
    public final aa1.b r;
    public final aa1.b s;
    public final aa1.b t;

    public t(aa.u0 u0Var, aa.u0 u0Var2, int i) {
        int i2 = i & 1;
        aa.u0 u0Var3 = aa.t0.d;
        u0Var = i2 != 0 ? u0Var3 : u0Var;
        u0Var2 = (i & 4) != 0 ? u0Var3 : u0Var2;
        this.r = u0Var;
        this.s = u0Var3;
        this.t = u0Var2;
    }

    public final aa.m d() {
        ba.Companion.getClass();
        aa.q0 q0Var = ba.l;
        k71.k.g(q0Var, "type");
        List list = br0.c.a;
        List list2 = br0.c.a;
        k71.k.g(list2, "selections");
        x61.r rVar = x61.r.r;
        return new aa.m("data", q0Var, (String) null, rVar, rVar, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.r, tVar.r) && k71.k.b(this.s, tVar.s) && k71.k.b(this.t, tVar.t);
    }

    public final aa.p0 g() {
        return aa.c.c(v.a, true);
    }

    public final int hashCode() {
        return this.t.hashCode() + f1.e.a(this.s, this.r.hashCode() * 31, 31);
    }

    public final void o(ea.f fVar, aa.w wVar, boolean z) {
        k71.k.g(wVar, "customScalarAdapters");
        aa.u0 u0Var = this.r;
        boolean z2 = u0Var instanceof aa.u0;
        nn.a aVar = ro0.a.a;
        if (z2) {
            ea.k kVar = (ea.k) fVar;
            kVar.z0("number");
            aa.c.d(aa.c.b(aVar)).d(kVar, wVar, u0Var);
        }
        aa.u0 u0Var2 = this.s;
        if (u0Var2 instanceof aa.u0) {
            ea.k kVar2 = (ea.k) fVar;
            kVar2.z0("before");
            aa.c.d(aa.c.i).d(kVar2, wVar, u0Var2);
        }
        aa.u0 u0Var3 = this.t;
        if (u0Var3 instanceof aa.u0) {
            ea.k kVar3 = (ea.k) fVar;
            kVar3.z0("previewCount");
            aa.c.d(aa.c.b(aVar)).d(kVar3, wVar, u0Var3);
        }
    }

    public final String toString() {
        return f1.e.k(f4.u("DiscussionCommentsFragmentImpl(number=", this.r, ", before=", this.s, ", previewCount="), this.t, ")");
    }
}
