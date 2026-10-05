package p20;

import java.util.List;
import u10.bz;
import u10.fz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class zn implements aa.a {
    public static final zn a = new zn();
    public static final List b = sy.d0.o("shortcuts", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        fz fzVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                fzVar = (fz) aa.c.c(eo.a, false).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (fzVar == null) {
            k41.b.B(eVar, "shortcuts");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 != null) {
            return new bz(fzVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        bz bzVar = (bz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bzVar, "value");
        fVar.z0("shortcuts");
        aa.c.c(eo.a, false).b(fVar, wVar, bzVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, bzVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, bzVar.c);
    }
}
