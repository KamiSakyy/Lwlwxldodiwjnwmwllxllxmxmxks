package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class lk implements aa.a {
    public static final lk a = new lk();
    public static final List b = sy.d0.o("id", "viewerCanPush", "branchInfo", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        Boolean bool = null;
        u10.pt ptVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 2) {
                ptVar = (u10.pt) aa.c.b(aa.c.c(jk.a, true)).a(eVar, wVar);
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
            return new u10.st(str, booleanValue, ptVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.st stVar = (u10.st) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(stVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, stVar.a);
        fVar.z0("viewerCanPush");
        jo.f4.C(stVar.b, aa.c.f, fVar, wVar, "branchInfo");
        aa.c.b(aa.c.c(jk.a, true)).b(fVar, wVar, stVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, stVar.d);
    }
}
