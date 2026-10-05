package c30;

import java.util.List;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 implements aa.a {
    public static final j0 a = new j0();
    public static final List b = sy.d0.o("id", "name", "viewerCanCommitToBranch", "target", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool2 = null;
        String str = null;
        String str2 = null;
        w wVar2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                bool = bool2;
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                bool = bool2;
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                bool2 = (Boolean) aa.c.f.a(eVar, wVar);
            } else if (r0 == 3) {
                bool = bool2;
                wVar2 = (w) aa.c.b(aa.c.c(l0.a, false)).a(eVar, wVar);
            } else {
                if (r0 != 4) {
                    break;
                }
                bool = bool2;
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
            bool2 = bool;
        }
        Boolean bool3 = bool2;
        if (str == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (bool3 == null) {
            k41.b.B(eVar, "viewerCanCommitToBranch");
            throw null;
        }
        boolean booleanValue = bool3.booleanValue();
        if (str3 != null) {
            return new v(str, str2, booleanValue, wVar2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        v vVar = (v) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(vVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, vVar.a);
        fVar.z0("name");
        bVar.b(fVar, wVar, vVar.b);
        fVar.z0("viewerCanCommitToBranch");
        f4.C(vVar.c, aa.c.f, fVar, wVar, "target");
        aa.c.b(aa.c.c(l0.a, false)).b(fVar, wVar, vVar.d);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, vVar.e);
    }
}
