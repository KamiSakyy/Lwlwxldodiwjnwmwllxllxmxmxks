package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b7 implements aa.a {
    public static final b7 a = new b7();
    public static final List b = sy.d0.n("__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        while (eVar.r0(b) == 0) {
            str = (String) aa.c.a.a(eVar, wVar);
        }
        eVar.s0();
        cs.f c = cs.g.c(eVar, wVar);
        if (str != null) {
            return new jo.ra(str, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ra raVar = (jo.ra) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(raVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, raVar.a);
        List list = cs.g.a;
        cs.f fVar2 = raVar.b;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("currentUserCanApprove");
        jo.f4.C(fVar2.a, aa.c.f, fVar, wVar, "environment");
        aa.c.c(cs.h.a, false).b(fVar, wVar, fVar2.b);
        fVar.z0("reviewers");
        aa.c.c(cs.l.a, false).b(fVar, wVar, fVar2.c);
    }
}
