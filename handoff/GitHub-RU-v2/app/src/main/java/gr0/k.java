package gr0;

import aa.w;
import java.util.List;
import jo.f4Shadow;
import sy.d0Shadow;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements aa.a {
    public static final k a = new k();
    public static final List b = d0Shadow.o(new String[]{"__typename", "id"});

    public final Object a(ea.e eVar, w wVar) {
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
        ir0.a c = ir0.b.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new g(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        g gVar = (g) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, gVar.b);
        List list = ir0.b.a;
        ir0.a aVar = gVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(aVar, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, aVar.a);
        fVar.z0("option");
        bVar2.b(fVar, wVar, aVar.b);
        fVar.z0("viewerHasVoted");
        f4Shadow.C(aVar.c, aa.c.f, fVar, wVar, "totalVoteCount");
        fVar.z(aVar.d);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, aVar.e);
    }

}
