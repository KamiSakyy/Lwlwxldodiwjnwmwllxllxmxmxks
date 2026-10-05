package eo0;

import java.util.Iterator;
import java.util.List;
import jn0.bc0;
import jn0.cc0;
import jn0.tb0;
import jn0.ub0;
import jn0.vb0;
import jn0.wb0;
import jn0.xb0;
import jn0.zb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class fx implements aa.a {
    public static final fx a = new fx();
    public static final List b = sy.d0.o(new String[]{"__typename", "id", "headRefOid", "state", "mergeStateStatus", "repository", "headRef", "baseRefName", "viewerCanMergeAsAdmin", "mergedBy", "mergeCommit", "mergeQueueEntry", "mergeQueue", "viewerCanUpdate", "timelineItems"});

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x002a. Please report as an issue. */
    public final Object a(ea.e eVar, aa.w wVar) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Object obj;
        Object obj2;
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        Boolean bool4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        pz0.gu guVar = null;
        pz0.si siVar = null;
        bc0 bc0Var = null;
        tb0 tb0Var = null;
        String str4 = null;
        Boolean bool5 = null;
        xb0 xb0Var = null;
        ub0 ub0Var = null;
        wb0 wb0Var = null;
        vb0 vb0Var = null;
        cc0 cc0Var = null;
        while (true) {
            switch (eVar.r0(b)) {
                case 0:
                    str = (String) aa.c.a.a(eVar, wVar);
                case 1:
                    str2 = (String) aa.c.a.a(eVar, wVar);
                case 2:
                    str3 = (String) aa.c.a.a(eVar, wVar);
                case 3:
                    bool2 = bool4;
                    bool3 = bool5;
                    String u = eVar.u();
                    k71.k.d(u);
                    pz0.gu.Companion.getClass();
                    Iterator it = pz0.gu.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((pz0.gu) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    guVar = (pz0.gu) obj;
                    if (guVar == null) {
                        guVar = pz0.gu.v;
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 4:
                    bool2 = bool4;
                    bool3 = bool5;
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    pz0.si.Companion.getClass();
                    Iterator it2 = pz0.si.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((pz0.si) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    siVar = (pz0.si) obj2;
                    if (siVar == null) {
                        siVar = pz0.si.t;
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 5:
                    bool = bool4;
                    bc0Var = (bc0) aa.c.c(hx.a, false).a(eVar, wVar);
                    bool4 = bool;
                case 6:
                    bool = bool4;
                    tb0Var = (tb0) aa.c.b(aa.c.c(zw.a, false)).a(eVar, wVar);
                    bool4 = bool;
                case 7:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                case 8:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 9:
                    bool = bool4;
                    xb0Var = (xb0) aa.c.b(aa.c.c(dx.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 10:
                    bool = bool4;
                    ub0Var = (ub0) aa.c.b(aa.c.c(ax.a, false)).a(eVar, wVar);
                    bool4 = bool;
                case 11:
                    bool = bool4;
                    wb0Var = (wb0) aa.c.b(aa.c.c(cx.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 12:
                    bool = bool4;
                    vb0Var = (vb0) aa.c.b(aa.c.c(bx.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 13:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                case 14:
                    bool = bool4;
                    cc0Var = (cc0) aa.c.c(ix.a, false).a(eVar, wVar);
                    bool4 = bool;
            }
            eVar.s0();
            xt0.b c = xt0.d.c(eVar, wVar);
            Boolean bool6 = bool4;
            if (str == null) {
                k41.b.B(eVar, "__typename");
                throw null;
            }
            if (str2 == null) {
                k41.b.B(eVar, "id");
                throw null;
            }
            if (str3 == null) {
                k41.b.B(eVar, "headRefOid");
                throw null;
            }
            if (guVar == null) {
                k41.b.B(eVar, "state");
                throw null;
            }
            if (siVar == null) {
                k41.b.B(eVar, "mergeStateStatus");
                throw null;
            }
            if (bc0Var == null) {
                k41.b.B(eVar, "repository");
                throw null;
            }
            if (str4 == null) {
                k41.b.B(eVar, "baseRefName");
                throw null;
            }
            if (bool6 == null) {
                k41.b.B(eVar, "viewerCanMergeAsAdmin");
                throw null;
            }
            Boolean bool7 = bool5;
            boolean booleanValue = bool6.booleanValue();
            if (bool7 == null) {
                k41.b.B(eVar, "viewerCanUpdate");
                throw null;
            }
            boolean booleanValue2 = bool7.booleanValue();
            if (cc0Var != null) {
                return new zb0(str, str2, str3, guVar, siVar, bc0Var, tb0Var, str4, booleanValue, xb0Var, ub0Var, wb0Var, vb0Var, booleanValue2, cc0Var, c);
            }
            k41.b.B(eVar, "timelineItems");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        zb0 zb0Var = (zb0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(zb0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, zb0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, zb0Var.b);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, zb0Var.c);
        fVar.z0("state");
        fVar.I(zb0Var.d.r);
        fVar.z0("mergeStateStatus");
        fVar.I(zb0Var.e.r);
        fVar.z0("repository");
        aa.c.c(hx.a, false).b(fVar, wVar, zb0Var.f);
        fVar.z0("headRef");
        aa.c.b(aa.c.c(zw.a, false)).b(fVar, wVar, zb0Var.g);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, zb0Var.h);
        fVar.z0("viewerCanMergeAsAdmin");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(zb0Var.i, bVar2, fVar, wVar, "mergedBy");
        aa.c.b(aa.c.c(dx.a, true)).b(fVar, wVar, zb0Var.j);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(ax.a, false)).b(fVar, wVar, zb0Var.k);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(cx.a, true)).b(fVar, wVar, zb0Var.l);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(bx.a, true)).b(fVar, wVar, zb0Var.m);
        fVar.z0("viewerCanUpdate");
        jo.f4.C(zb0Var.n, bVar2, fVar, wVar, "timelineItems");
        aa.c.c(ix.a, false).b(fVar, wVar, zb0Var.o);
        List list = xt0.d.a;
        xt0.d.d(fVar, wVar, zb0Var.p);
    }
}
