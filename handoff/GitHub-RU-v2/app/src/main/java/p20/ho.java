package p20;

import java.util.List;
import u10.kz;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ho implements aaShadow.a {
    public static final ho a = new ho();
    public static final List b = sy.d0Shadow.o("__typename", "isArchived", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 2) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        w80.q3 c = w80.s3.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "isArchived");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new kz(str, booleanValue, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kz kzVar = (kz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(kzVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, kzVar.a);
        fVar.z0("isArchived");
        jo.f4Shadow.C(kzVar.b, aa.c.f, fVar, wVar, "id");
        bVar.b(fVar, wVar, kzVar.c);
        List list = w80.s3.a;
        w80.s3.d(fVar, wVar, kzVar.d);
    }
}
