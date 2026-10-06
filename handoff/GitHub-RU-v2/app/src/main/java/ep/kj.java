package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kj implements aaShadow.a {
    public static final kj a = new kj();
    public static final List b = sy.d0Shadow.o("created", "assigned", "mentioned", "requested", "id", "__typename");

    public final Object a(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.ksShadow ksVar = null;
        jo.isShadow isVar = null;
        jo.msShadow msVar = null;
        jo.rs rsVar = null;
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(b);
            if (r0 == 0) {
                ksVar = (jo.ks) aa.c.b(aa.c.c(jj.a, false)).a(eVar, wVar);
            } else if (r0 == 1) {
                isVar = (jo.is) aa.c.b(aa.c.c(ij.a, false)).a(eVar, wVar);
            } else if (r0 == 2) {
                msVar = (jo.ms) aa.c.b(aa.c.c(lj.a, false)).a(eVar, wVar);
            } else if (r0 == 3) {
                rsVar = (jo.rs) aa.c.b(aa.c.c(qj.a, false)).a(eVar, wVar);
            } else if (r0 == 4) {
                str = (String) aa.c.a.a(eVar, wVar);
            } else {
                if (r0 != 5) {
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
            return new jo.ls(ksVar, isVar, msVar, rsVar, str, str2);
        }
        k41.b.B(eVar, "__typename");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        jo.ls lsVar = (jo.ls) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(lsVar, "value");
        fVar.z0("created");
        aa.c.b(aa.c.c(jj.a, false)).b(fVar, wVar, lsVar.a);
        fVar.z0("assigned");
        aa.c.b(aa.c.c(ij.a, false)).b(fVar, wVar, lsVar.b);
        fVar.z0("mentioned");
        aa.c.b(aa.c.c(lj.a, false)).b(fVar, wVar, lsVar.c);
        fVar.z0("requested");
        aa.c.b(aa.c.c(qj.a, false)).b(fVar, wVar, lsVar.d);
        fVar.z0("id");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, lsVar.e);
        fVar.z0("__typename");
        bVar.b(fVar, wVar, lsVar.f);
    }
}
