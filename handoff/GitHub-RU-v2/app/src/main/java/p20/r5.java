package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r5 implements aa.a {
    public static final r5 a = new r5();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        y40.f c = y40.g.c(eVar, wVar);
        if (str != null) {
            return new u10.s8(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.s8 s8Var = (u10.s8) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(s8Var, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, s8Var.a);
        List list = y40.g.a;
        y40.f fVar2 = s8Var.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("currentUserCanApprove");
        jo.f4.C(fVar2.a, aa.c.f, fVar, wVar, "environment");
        aa.c.c(y40.h.a, false).b(fVar, wVar, fVar2.b);
        fVar.z0("reviewers");
        aa.c.c(y40.l.a, false).b(fVar, wVar, fVar2.c);
    }
}
