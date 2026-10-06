package oa0;

import java.util.List;
import jo.f4Shadow;
import w80.l2;
import w80.o2;
import w80.p2;
import w80.q2;
import w80.r2;
import w80.s2;
import w80.v2;

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
        l2 c = v2.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new na0.i(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        na0.i iVar = (na0.i) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(iVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, iVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, iVar.b);
        List list = v2.a;
        l2 l2Var = iVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(l2Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, l2Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, l2Var.b);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(s2.a, true)).b(fVar, wVar, l2Var.c);
        List list2 = r2.a;
        o2 o2Var = l2Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(o2Var, "value");
        fVar.z0("__typename");
        aa.b bVar3 = aa.c.a;
        bVar3.b(fVar, wVar, o2Var.a);
        fVar.z0("name");
        bVar3.b(fVar, wVar, o2Var.b);
        fVar.z0("url");
        bVar3.b(fVar, wVar, o2Var.c);
        fVar.z0("isInOrganization");
        aa.b bVar4 = aa.c.f;
        f4Shadow.C(o2Var.d, bVar4, fVar, wVar, "owner");
        aa.c.c(q2.a, true).b(fVar, wVar, o2Var.e);
        fVar.z0("id");
        bVar3.b(fVar, wVar, o2Var.f);
        fVar.z0("viewerPermission");
        aa.c.b(ic0.b.h).b(fVar, wVar, o2Var.g);
        fVar.z0("squashMergeAllowed");
        f4Shadow.C(o2Var.h, bVar4, fVar, wVar, "rebaseMergeAllowed");
        f4Shadow.C(o2Var.i, bVar4, fVar, wVar, "mergeCommitAllowed");
        f4Shadow.C(o2Var.j, bVar4, fVar, wVar, "viewerDefaultCommitEmail");
        aa.c.i.b(fVar, wVar, o2Var.k);
        fVar.z0("viewerDefaultMergeMethod");
        fVar.I(o2Var.l.r);
        fVar.z0("viewerPossibleCommitEmails");
        aa.c.b(aa.c.a(bVar3)).b(fVar, wVar, o2Var.m);
        fVar.z0("planSupports");
        f4Shadow.C(o2Var.n, bVar4, fVar, wVar, "allowUpdateBranch");
        f4Shadow.C(o2Var.o, bVar4, fVar, wVar, "defaultBranchRef");
        aa.c.b(aa.c.c(p2.a, false)).b(fVar, wVar, o2Var.p);
        m90.e eVar = m90.e.a;
        m90.e.d(fVar, wVar, l2Var.e);
    }
}
