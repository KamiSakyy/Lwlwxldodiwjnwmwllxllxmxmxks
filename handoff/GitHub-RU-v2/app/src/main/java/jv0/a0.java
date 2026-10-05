package jv0;

import aa.o0;
import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a0 implements aa.a {
    public static final List a = x61.l.r(new String[]{"name", "descriptionHTML", "viewerIsFollowing", "id"});

    public static g c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        Boolean bool = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                str = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 1) {
                str2 = (String) aa.c.i.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (bool == null) {
            k41.b.B(eVar, "viewerIsFollowing");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str3 != null) {
            return new g(str, str2, str3, booleanValue);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, g gVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gVar, "value");
        fVar.z0("name");
        o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, gVar.a);
        fVar.z0("descriptionHTML");
        o0Var.b(fVar, wVar, gVar.b);
        fVar.z0("viewerIsFollowing");
        f4.C(gVar.c, aa.c.f, fVar, wVar, "id");
        aa.c.a.b(fVar, wVar, gVar.d);
    }
}
