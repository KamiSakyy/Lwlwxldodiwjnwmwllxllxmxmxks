package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aaShadow.a {
    public static final f a = new f();
    public static final List b = sy.d0.o(new String[]{"__typename", "discussion", "id"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        kc0.l lVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                lVar = (kc0.l) aa.c.b(aa.c.c(i.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        yf0.i c = yf0.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new kc0.h(str, lVar, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.h hVar = (kc0.h) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(hVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, hVar.a);
        fVar.z0("discussion");
        aa.c.b(aa.c.c(i.a, false)).b(fVar, wVar, hVar.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, hVar.c);
        List list = yf0.l.a;
        yf0.l.d(fVar, wVar, hVar.d);
    }
}
