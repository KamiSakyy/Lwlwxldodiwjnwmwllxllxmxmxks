package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q8 implements aaShadow.a {
    public static final q8 a = new q8();
    public static final List b = sy.d0.o(new String[]{"id", "repositories", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.wc wcVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                wcVar = (kc0.wc) aa.c.c(p8.a, false).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (wcVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str2 != null) {
            return new kc0.xc(str, wcVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.xc xcVar = (kc0.xc) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xcVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xcVar.a);
        fVar.z0("repositories");
        aa.c.c(p8.a, false).b(fVar, wVar, xcVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xcVar.c);
    }
}
