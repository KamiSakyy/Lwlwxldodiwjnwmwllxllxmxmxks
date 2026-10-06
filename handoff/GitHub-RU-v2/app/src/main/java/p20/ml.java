package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ml implements aaShadow.a {
    public static final ml a = new ml();
    public static final List b = sy.d0Shadow.o("id", "labels", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        u10.cv cvVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                cvVar = (u10.cv) aa.c.b(aa.c.c(jl.a, false)).a(eVar, wVar);
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
            return new u10.fv(str, cvVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.fv fvVar = (u10.fv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(fvVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, fvVar.a);
        fVar.z0("labels");
        aa.c.b(aa.c.c(jl.a, false)).b(fVar, wVar, fvVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, fvVar.c);
    }
}
