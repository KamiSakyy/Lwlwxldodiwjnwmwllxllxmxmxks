package p20;

import java.util.List;
import u10.wz;
import u10.zz;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class po implements aaShadow.a {
    public static final List a = x61.l.r(new String[]{"starredRepositories", "id"});

    public static wz c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        zz zzVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                zzVar = (zz) aa.c.c(so.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (zzVar == null) {
            k41.b.B(eVar, "starredRepositories");
            throw null;
        }
        if (str != null) {
            return new wz(zzVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, wz wzVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(wzVar, "value");
        fVar.z0("starredRepositories");
        aa.c.c(so.a, false).b(fVar, wVar, wzVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, wzVar.b);
    }
}
