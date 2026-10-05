package ih0;

import aa.w;
import java.util.List;
import ri0.d3;
import ri0.p2;
import sy.d0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j implements aa.a {
    public static final j a = new j();
    public static final List b = d0.o(new String[]{"__typename", "id"});

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
        d3 d3Var = d3.a;
        p2 c = d3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new f(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, w wVar, Object obj) {
        f fVar2 = (f) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fVar2, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fVar2.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, fVar2.b);
        d3 d3Var = d3.a;
        d3.d(fVar, wVar, fVar2.c);
    }

}
