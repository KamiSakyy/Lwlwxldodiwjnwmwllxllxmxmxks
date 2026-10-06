package p20;

import java.util.List;
import u10.xz;
import u10.zz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class so implements aaShadow.a {
    public static final so a = new so();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        xz xzVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                xzVar = (xz) aa.c.c(qo.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(oo.a, true)))).a(eVar, wVar);
            }
        }
        if (xzVar != null) {
            return new zz(xzVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zz zzVar = (zz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zzVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(qo.a, false).b(fVar, wVar, zzVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(oo.a, true)))).b(fVar, wVar, zzVar.b);
    }
}
