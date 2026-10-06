package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qb implements aaShadow.a {
    public static final qb a = new qb();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "activeLockReason"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        gn0.xd xdVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                xdVar = (gn0.xd) aa.c.b(hn0.a.v).a(eVar, wVar);
            }
        }
        eVar.s0();
        ah0.h hVar = ah0.h.a;
        ah0.e c = ah0.h.c(eVar, wVar);
        if (str != null) {
            return new kc0.eh(str, xdVar, c);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.eh ehVar = (kc0.eh) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ehVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, ehVar.a);
        fVar.z0("activeLockReason");
        aa.c.b(hn0.a.v).b(fVar, wVar, ehVar.b);
        ah0.h hVar = ah0.h.a;
        ah0.h.d(fVar, wVar, ehVar.c);
    }
}
