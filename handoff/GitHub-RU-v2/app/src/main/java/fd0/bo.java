package fd0;

import java.util.List;
import kc0.bz;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class bo implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static bz c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        ri0.d3 d3Var = ri0.d3.a;
        ri0.p2 c = ri0.d3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new bz(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, bz bzVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bzVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bzVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, bzVar.b);
        ri0.d3 d3Var = ri0.d3.a;
        ri0.d3.d(fVar, wVar, bzVar.c);
    }
}
