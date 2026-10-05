package p20;

import java.util.List;
import u10.lz;
import u10.mz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class jo implements aa.a {
    public static final jo a = new jo();
    public static final List b = sy.d0.o("pageInfo", "nodes");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        lz lzVar = null;
        List list = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                lzVar = (lz) aa.c.c(io.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                list = (List) aa.c.b(aa.c.a(aa.c.b(aa.c.c(ho.a, true)))).a(eVar, wVar);
            }
        }
        if (lzVar != null) {
            return new mz(lzVar, list);
        }
        k41.b.B(eVar, "pageInfo");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        mz mzVar = (mz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mzVar, "value");
        fVar.z0("pageInfo");
        aa.c.c(io.a, false).b(fVar, wVar, mzVar.a);
        fVar.z0("nodes");
        aa.c.b(aa.c.a(aa.c.b(aa.c.c(ho.a, true)))).b(fVar, wVar, mzVar.b);
    }
}
