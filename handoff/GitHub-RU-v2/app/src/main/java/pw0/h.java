package pw0;

import java.util.List;
import jo.f4;
import uu0.a4;
import uu0.b4;
import uu0.c4;
import uu0.d4;
import uu0.e4;
import uu0.h4;
import uu0.v3;
import uu0.z3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h implements aa.a {
    public static final h a = new h();
    public static final List b = sy.d0.o(new String[]{"__typename", "id"});

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
        v3 c = h4.c(eVar, wVar);
        if (str == null) {
            k41.b.B(eVar, "__typename");
            throw null;
        }
        if (str2 != null) {
            return new ow0.m(str, str2, c);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ow0.m mVar = (ow0.m) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(mVar, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, mVar.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, mVar.b);
        List list = h4.a;
        v3 v3Var = mVar.c;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(v3Var, "value");
        fVar.z0("__typename");
        aa.b bVar2 = aa.c.a;
        bVar2.b(fVar, wVar, v3Var.a);
        fVar.z0("id");
        bVar2.b(fVar, wVar, v3Var.b);
        fVar.z0("issueOrPullRequest");
        aa.c.b(aa.c.c(e4.a, true)).b(fVar, wVar, v3Var.c);
        List list2 = d4.a;
        z3 z3Var = v3Var.d;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(z3Var, "value");
        fVar.z0("__typename");
        aa.b bVar3 = aa.c.a;
        bVar3.b(fVar, wVar, z3Var.a);
        fVar.z0("name");
        bVar3.b(fVar, wVar, z3Var.b);
        fVar.z0("url");
        bVar3.b(fVar, wVar, z3Var.c);
        fVar.z0("isInOrganization");
        aa.b bVar4 = aa.c.f;
        f4.C(z3Var.d, bVar4, fVar, wVar, "owner");
        aa.c.c(c4.a, true).b(fVar, wVar, z3Var.e);
        fVar.z0("id");
        bVar3.b(fVar, wVar, z3Var.f);
        fVar.z0("viewerPermission");
        aa.c.b(qz0.b.o).b(fVar, wVar, z3Var.g);
        fVar.z0("squashMergeAllowed");
        f4.C(z3Var.h, bVar4, fVar, wVar, "rebaseMergeAllowed");
        f4.C(z3Var.i, bVar4, fVar, wVar, "mergeCommitAllowed");
        f4.C(z3Var.j, bVar4, fVar, wVar, "viewerDefaultCommitEmail");
        aa.c.i.b(fVar, wVar, z3Var.k);
        fVar.z0("viewerDefaultMergeMethod");
        fVar.I(z3Var.l.r);
        fVar.z0("viewerPossibleCommitEmails");
        aa.c.b(aa.c.a(bVar3)).b(fVar, wVar, z3Var.m);
        fVar.z0("planSupports");
        f4.C(z3Var.n, bVar4, fVar, wVar, "allowUpdateBranch");
        f4.C(z3Var.o, bVar4, fVar, wVar, "issueTypes");
        aa.c.b(aa.c.c(b4.a, false)).b(fVar, wVar, z3Var.p);
        fVar.z0("defaultBranchRef");
        aa.c.b(aa.c.c(a4.a, false)).b(fVar, wVar, z3Var.q);
        nv0.f fVar2 = nv0.f.a;
        nv0.f.d(fVar, wVar, v3Var.e);
    }
}
