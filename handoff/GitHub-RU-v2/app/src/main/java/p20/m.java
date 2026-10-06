package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements aaShadow.a {
    public static final m a = new m();
    public static final List b = sy.d0Shadow.o("id", "poll", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.q qVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                qVar = (u10.q) aa.c.b(aa.c.c(l.a, true)).a(eVar, wVar);
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
        if (str2 != null) {
            return new u10.r(str, qVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.r rVar = (u10.r) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rVar.a);
        fVar.z0("poll");
        aa.c.b(aa.c.c(l.a, true)).b(fVar, wVar, rVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, rVar.c);
    }
}
