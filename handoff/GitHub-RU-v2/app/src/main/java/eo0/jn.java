package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jn implements aa.a {
    public static final jn a = new jn();
    public static final List b = sy.d0.o(new String[]{"id", "viewerCanPush", "branchInfo", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        jn0.nx nxVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                nxVar = (jn0.nx) aa.c.b(aa.c.c(hn.a, true)).a(eVar, wVar);
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
            return new jn0.qx(str, booleanValue, nxVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.qx qxVar = (jn0.qx) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(qxVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, qxVar.a);
        fVar.z0("viewerCanPush");
        jo.f4.C(qxVar.b, aa.c.f, fVar, wVar, "branchInfo");
        aa.c.b(aa.c.c(hn.a, true)).b(fVar, wVar, qxVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, qxVar.d);
    }
}
