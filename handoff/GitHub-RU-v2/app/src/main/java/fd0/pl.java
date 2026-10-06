package fd0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class pl implements aaShadow.a {
    public static final pl a = new pl();
    public static final List b = sy.d0.o(new String[]{"id", "viewerCanPush", "branchInfo", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        kc0.dv dvVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                dvVar = (kc0.dv) aa.c.b(aa.c.c(nl.a, true)).a(eVar, wVar);
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
            return new kc0.gv(str, booleanValue, dvVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        kc0.gv gvVar = (kc0.gv) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(gvVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, gvVar.a);
        fVar.z0("viewerCanPush");
        jo.f4.C(gvVar.b, aa.c.f, fVar, wVar, "branchInfo");
        aa.c.b(aa.c.c(nl.a, true)).b(fVar, wVar, gvVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, gvVar.d);
    }
}
