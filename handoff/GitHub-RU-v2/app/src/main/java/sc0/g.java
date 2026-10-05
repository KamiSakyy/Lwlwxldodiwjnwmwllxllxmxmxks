package sc0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "checkSuite", "steps"});

    public static rc0.h c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        rc0.c cVar = null;
        rc0.m mVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                cVar = (rc0.c) aa.c.c(c.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                mVar = (rc0.m) aa.c.b(aa.c.c(l.a, false)).a(eVar, wVar);
            }
        }
        eVar.s0();
        wc0.s1 c = wc0.t1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (cVar != null) {
            return new rc0.h(str, cVar, mVar, c);
        }
        k41.b.B(eVar, "checkSuite");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, rc0.h hVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("__typename");
        aa.c.a.b(fVar, wVar, hVar.a);
        fVar.z0("checkSuite");
        aa.c.c(c.a, false).b(fVar, wVar, hVar.b);
        fVar.z0("steps");
        aa.c.b(aa.c.c(l.a, false)).b(fVar, wVar, hVar.c);
        List list = wc0.t1.a;
        wc0.t1.d(fVar, wVar, hVar.d);
    }
}
