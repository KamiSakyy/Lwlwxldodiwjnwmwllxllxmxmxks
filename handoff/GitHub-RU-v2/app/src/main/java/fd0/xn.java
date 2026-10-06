package fd0;

import java.util.List;
import kc0.xy;

/* loaded from: /home/user/work/p/classes4.dex */
public final class xn implements aaShadow.a {
    public static final xn a = new xn();
    public static final List b = sy.d0Shadow.o(new String[]{"__typename", "id"});

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
        mg0.s sVar = mg0.s.a;
        mg0.m c = mg0.s.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new xy(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        xy xyVar = (xy) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xyVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xyVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, xyVar.b);
        mg0.s sVar = mg0.s.a;
        mg0.s.d(fVar, wVar, xyVar.c);
    }
}
