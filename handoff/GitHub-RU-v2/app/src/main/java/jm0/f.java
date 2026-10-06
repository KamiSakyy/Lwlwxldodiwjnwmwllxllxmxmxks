package jm0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = sy.d0Shadow.o(new String[]{"clientMutationId", "user"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        im0.j jVar = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    return new im0.i(str, jVar);
                }
                jVar = (im0.j) aa.c.b(aa.c.c(g.a, false)).a(eVar, wVar);
            }
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        im0.i iVar = (im0.i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("clientMutationId");
        aa.c.i.b(fVar, wVar, iVar.a);
        fVar.z0("user");
        aa.c.b(aa.c.c(g.a, false)).b(fVar, wVar, iVar.b);
    }
}
