package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gh implements aaShadow.a {
    public static final gh a = new gh();
    public static final List b = sy.d0Shadow.o("organization", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.sp spVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                spVar = (jo.sp) aa.c.b(aa.c.c(jh.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
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
            return new jo.pp(spVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.pp ppVar = (jo.pp) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ppVar, "value");
        fVar.z0("organization");
        aa.c.b(aa.c.c(jh.a, false)).b(fVar, wVar, ppVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ppVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, ppVar.c);
    }
}
