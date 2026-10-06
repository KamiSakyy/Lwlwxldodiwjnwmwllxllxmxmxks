package ay;

import dw.g4;
import dw.h5;
import dw.i5;
import dw.l5;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements aa.a {
    public static final f a = new f();
    public static final List b = sy.d0Shadow.o("__typename", "id");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str2 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        eVar.s0();
        h5 c = l5.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new zx.i(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zx.i iVar = (zx.i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, iVar.b);
        List list = l5.a;
        h5 h5Var = iVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(h5Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, h5Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, h5Var.b);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(i5.a, true)).b(fVar, wVar, h5Var.c);
        List list2 = g4.a;
        g4.d(fVar, wVar, h5Var.d);
        yw.f fVar2 = yw.f.a;
        yw.f.d(fVar, wVar, h5Var.e);
    }
}
