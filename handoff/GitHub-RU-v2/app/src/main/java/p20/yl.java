package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class yl implements aaShadow.a {
    public static final yl a = new yl();
    public static final List b = sy.d0Shadow.o("milestones", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.uv uvVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                uvVar = (u10.uv) aa.c.b(aa.c.c(vl.a, false)).a(eVar, wVar);
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
            return new u10.xv(uvVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.xv xvVar = (u10.xv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(xvVar, "value");
        fVar.z0("milestones");
        aa.c.b(aa.c.c(vl.a, false)).b(fVar, wVar, xvVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, xvVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, xvVar.c);
    }
}
