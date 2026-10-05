package ar0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w implements aa.a {
    public static final w a = new w();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        er0.i c = er0.l.c(eVar, wVar);
        eVar.s0();
        gu0.f fVar = gu0.f.a;
        gu0.c c2 = gu0.f.c(eVar, wVar);
        eVar.s0();
        er0.o c3 = er0.p.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new p(str, str2, c, c2, c3);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        p pVar = (p) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(pVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, pVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, pVar.b);
        List list = er0.l.a;
        er0.l.d(fVar, wVar, pVar.c);
        gu0.f fVar2 = gu0.f.a;
        gu0.f.d(fVar, wVar, pVar.d);
        List list2 = er0.p.a;
        er0.p.d(fVar, wVar, pVar.e);
    }
}
