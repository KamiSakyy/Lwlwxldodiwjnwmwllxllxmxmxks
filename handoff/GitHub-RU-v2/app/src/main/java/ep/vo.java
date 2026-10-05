package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class vo implements aa.a {
    public static final vo a = new vo();
    public static final List b = sy.d0.o("id", "viewerCanPush", "branchInfo", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        jo.oz ozVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                ozVar = (jo.oz) aa.c.b(aa.c.c(to.a, true)).a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool == null) {
            k41.b.B(eVar, "viewerCanPush");
            throw null;
        }
        boolean booleanValue = bool.booleanValue();
        if (str2 != null) {
            return new jo.rz(str, booleanValue, ozVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.rz rzVar = (jo.rz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(rzVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, rzVar.a);
        fVar.z0("viewerCanPush");
        jo.f4.C(rzVar.b, aa.c.f, fVar, wVar, "branchInfo");
        aa.c.b(aa.c.c(to.a, true)).b(fVar, wVar, rzVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, rzVar.d);
    }
}
