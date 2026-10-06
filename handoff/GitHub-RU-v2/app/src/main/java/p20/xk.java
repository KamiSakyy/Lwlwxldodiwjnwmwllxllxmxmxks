package p20;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class xk implements aaShadow.a {
    public static final xk a = new xk();
    public static final List b = sy.d0Shadow.o("author", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        u10.cu cuVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                cuVar = (u10.cu) aa.c.b(aa.c.c(sk.a, true)).a(eVar, wVar);
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
            return new u10.iu(cuVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        u10.iu iuVar = (u10.iu) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iuVar, "value");
        fVar.z0("author");
        aa.c.b(aa.c.c(sk.a, true)).b(fVar, wVar, iuVar.a);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iuVar.b);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, iuVar.c);
    }
}
