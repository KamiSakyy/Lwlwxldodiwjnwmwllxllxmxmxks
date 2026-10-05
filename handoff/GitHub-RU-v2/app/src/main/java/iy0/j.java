package iy0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id", "content"});

    public static e c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        a aVar = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                aVar = (a) aa.c.b(aa.c.c(f.a, true)).a(eVar, wVar);
            }
        }
        eVar.s0();
        e1 c = f1.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new e(str, str2, aVar, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, e eVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(eVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, eVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, eVar.b);
        fVar.z0("content");
        aa.c.b(aa.c.c(f.a, true)).b(fVar, wVar, eVar.c);
        List list = f1.a;
        f1.d(fVar, wVar, eVar.d);
    }
}
