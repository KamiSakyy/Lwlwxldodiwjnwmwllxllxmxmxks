package p20;

import java.util.List;
import u10.m90;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ev implements aa.a {
    public static final ev a = new ev();
    public static final List b = sy.d0.o("__typename", "id");

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
        k70.i c = k70.l.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new m90(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        m90 m90Var = (m90) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(m90Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, m90Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, m90Var.b);
        List list = k70.l.a;
        k70.i iVar = m90Var.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, iVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, iVar.b);
        fVar.z0("url");
        bVar2.b(fVar, wVar, iVar.c);
        fVar.z0("descriptionHTML");
        aa.o0 o0Var = aa.c.i;
        o0Var.b(fVar, wVar, iVar.d);
        fVar.z0("organizationEmail");
        o0Var.b(fVar, wVar, iVar.e);
        fVar.z0("isVerified");
        aa.b bVar3 = aa.c.f;
        jo.f4.C(iVar.f, bVar3, fVar, wVar, "organizationItemShowcase");
        aa.c.c(k70.m.a, true).b(fVar, wVar, iVar.g);
        fVar.z0("location");
        o0Var.b(fVar, wVar, iVar.h);
        fVar.z0("login");
        bVar2.b(fVar, wVar, iVar.i);
        fVar.z0("name");
        o0Var.b(fVar, wVar, iVar.j);
        fVar.z0("viewerIsFollowing");
        jo.f4.C(iVar.k, bVar3, fVar, wVar, "organizationRepositories");
        aa.c.c(k70.n.a, false).b(fVar, wVar, iVar.l);
        fVar.z0("readme");
        aa.c.b(aa.c.c(k70.p.a, true)).b(fVar, wVar, iVar.m);
        fVar.z0("websiteUrl");
        o0Var.b(fVar, wVar, iVar.n);
        fVar.z0("twitterUsername");
        o0Var.b(fVar, wVar, iVar.o);
        fVar.z0("projectsV2");
        aa.c.c(k70.o.a, false).b(fVar, wVar, iVar.p);
        fVar.z0("organizationDiscussionsRepository");
        aa.c.b(aa.c.c(k70.k.a, false)).b(fVar, wVar, iVar.q);
        List list2 = e30.d.a;
        e30.d.d(fVar, wVar, iVar.r);
    }
}
