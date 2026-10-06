package p20;

import java.util.List;
import u10.ez;

/* loaded from: /home/user/work/p/classes3.dex */
public final class co implements aaShadow.a {
    public static final co a = new co();
    public static final List b = sy.d0.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
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
        k90.v c = k90.r0.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new ez(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ez ezVar = (ez) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ezVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ezVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ezVar.b);
        List list = k90.r0.a;
        k90.r0.d(fVar, wVar, ezVar.c);
    }
}
