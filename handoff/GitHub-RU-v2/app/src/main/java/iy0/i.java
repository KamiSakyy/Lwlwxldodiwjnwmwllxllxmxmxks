package iy0;

import java.util.List;
import jo.f4;
import pz0.o7;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i implements aa.a {
    public static final List a = x61.l.r(new String[]{"__typename", "id"});

    public static d c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        String str = null;
        String str2 = null;
        while (true) {
            int r0 = eVar.r0(a);
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
        u c = v.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new d(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, d dVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(dVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, dVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, dVar.b);
        List list = v.a;
        u uVar = dVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(uVar, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, uVar.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, uVar.b);
        fVar.z0("title");
        bVar2.b(fVar, wVar, uVar.c);
        fVar.z0("number");
        int i = uVar.d;
        nn.a aVar = ro0.a.a;
        f1.e.v(i, aVar, fVar, wVar, "url");
        bVar2.b(fVar, wVar, uVar.e);
        fVar.z0("locked");
        aa.b bVar3 = aa.c.f;
        f4.C(uVar.f, bVar3, fVar, wVar, "pullRequestState");
        fVar.I(uVar.g.r);
        fVar.z0("isDraft");
        f4.C(uVar.h, bVar3, fVar, wVar, "isInMergeQueue");
        f4.C(uVar.i, bVar3, fVar, wVar, "updatedAt");
        o7.Companion.getClass();
        aa.x xVar = o7.a;
        wVar.e(xVar).b(fVar, wVar, uVar.j);
        fVar.z0("createdAt");
        wVar.e(xVar).b(fVar, wVar, uVar.k);
        fVar.z0("totalCommentsCount");
        aa.c.b(aVar).b(fVar, wVar, uVar.l);
        fVar.z0("completedTasksCount");
        f1.e.v(uVar.m, aVar, fVar, wVar, "totalTaskCount");
        f1.e.v(uVar.n, aVar, fVar, wVar, "baseRefName");
        bVar2.b(fVar, wVar, uVar.o);
        fVar.z0("headRefName");
        bVar2.b(fVar, wVar, uVar.p);
        fVar.z0("viewerCanReopen");
        f4.C(uVar.q, bVar3, fVar, wVar, "viewerCanUpdate");
        f4.C(uVar.r, bVar3, fVar, wVar, "viewerDidAuthor");
        f4.C(uVar.s, bVar3, fVar, wVar, "viewerCanAssign");
        f4.C(uVar.t, bVar3, fVar, wVar, "viewerCanLabel");
        bVar3.b(fVar, wVar, Boolean.valueOf(uVar.u));
        List list2 = is0.g.a;
        is0.g.d(fVar, wVar, uVar.v);
    }
}
