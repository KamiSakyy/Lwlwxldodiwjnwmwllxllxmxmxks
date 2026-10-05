package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class xa implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static kc0.dg c(ea.e eVar, aa.w wVar) {
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
        mg0.s sVar = mg0.s.a;
        mg0.m c = mg0.s.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.dg(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, kc0.dg dgVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dgVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dgVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dgVar.b);
        mg0.s sVar = mg0.s.a;
        mg0.s.d(fVar, wVar, dgVar.c);
    }
}
