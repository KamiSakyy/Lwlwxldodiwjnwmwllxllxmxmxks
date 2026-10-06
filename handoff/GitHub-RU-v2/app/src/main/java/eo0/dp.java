package eo0;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class dp implements aaShadow.a {
    public static final dp a = new dp();
    public static final List b = sy.d0.o(new String[]{"id", "gitObject", "ref", "__typename"});

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        jn0.wz wzVar = null;
        jn0.xz xzVar = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else if (r0 == 1) {
                wzVar = (jn0.wz) aa.c.b(aa.c.c(bp.a, true)).a(eVar, wVar);
            } else if (r0 == 2) {
                xzVar = (jn0.xz) aa.c.b(aa.c.c(cp.a, false)).a(eVar, wVar);
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
        if (str2 != null) {
            return new jn0.yz(str, wzVar, xzVar, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jn0.yz yzVar = (jn0.yz) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(yzVar, "value");
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, yzVar.a);
        fVar.z0("gitObject");
        aa.c.b(aa.c.c(bp.a, true)).b(fVar, wVar, yzVar.b);
        fVar.z0("ref");
        aa.c.b(aa.c.c(cp.a, false)).b(fVar, wVar, yzVar.c);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, yzVar.d);
    }
}
