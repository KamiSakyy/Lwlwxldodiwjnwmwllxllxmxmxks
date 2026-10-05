package gv;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d implements aa.a {
    public static final List a = x61.l.r(new String[]{"id", "viewerCanDisableAutoMerge", "viewerCanEnableAutoMerge", "autoMergeRequest", "__typename"});

    public static b c(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        Boolean bool3 = null;
        a aVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                bool = bool2;
                bool3 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                aVar = (a) aa.c.b(aa.c.c(c.a, false)).a(eVar, wVar);
                bool2 = bool2;
                bool3 = bool3;
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool4 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (bool4 == null) {
            k41.b.B(eVar, "viewerCanDisableAutoMerge");
            throw null;
        }
        Boolean bool5 = bool3;
        boolean booleanValue = bool4.booleanValue();
        if (bool5 == null) {
            k41.b.B(eVar, "viewerCanEnableAutoMerge");
            throw null;
        }
        boolean booleanValue2 = bool5.booleanValue();
        if (str2 != null) {
            return new b(str, booleanValue, booleanValue2, aVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, b bVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bVar, "value");
        fVar.z0("id");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, bVar.a);
        fVar.z0("viewerCanDisableAutoMerge");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(bVar.b, bVar3, fVar, wVar, "viewerCanEnableAutoMerge");
        jo.f4.C(bVar.c, bVar3, fVar, wVar, "autoMergeRequest");
        aa.c.b(aa.c.c(c.a, false)).b(fVar, wVar, bVar.d);
        fVar.z0("__typename");
        bVar2.b(fVar, wVar, bVar.e);
    }
}
