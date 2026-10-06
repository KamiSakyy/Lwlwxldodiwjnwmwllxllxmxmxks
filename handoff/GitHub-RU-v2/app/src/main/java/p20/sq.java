package p20;

import java.util.List;
import u10.v20;
import u10.x20;

/* loaded from: /home/user/work/p/classes3.dex */
public final class sq implements aaShadow.a {
    public static final sq a = new sq();
    public static final List b = sy.d0Shadow.o("owner", "name", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        v20 v20Var = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                v20Var = (v20) aa.c.c(qq.a, true).a(eVar, wVar);
            } else if (r0 == 1) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 2) {
                str2 = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 3) {
                    break;
                }
                str3 = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (v20Var == null) {
            k41.b.B(eVar, "owner");
            throw null;
        }
        if (str == null) {
            k41.b.B(eVar, "name");
            throw null;
        }
        if (str2 == null) {
            k41.b.B(eVar, "id");
            throw null;
        }
        if (str3 != null) {
            return new x20(v20Var, str, str2, str3);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        x20 x20Var = (x20) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(x20Var, "value");
        fVar.z0("owner");
        aa.c.c(qq.a, true).b(fVar, wVar, x20Var.a);
        fVar.z0("name");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, x20Var.b);
        fVar.z0("id");
        bVar.b(fVar, wVar, x20Var.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, x20Var.d);
    }
}
