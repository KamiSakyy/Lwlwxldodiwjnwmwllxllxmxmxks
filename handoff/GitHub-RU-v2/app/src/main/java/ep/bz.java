package ep;

import java.util.Iterator;
import java.util.List;
import jo.he0;
import jo.ie0;
import jo.je0;
import jo.ke0;
import jo.le0;
import jo.ne0;
import jo.pe0;
import jo.qe0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bz implements aaShadow.a {
    public static final bz a = new bz();
    public static final List b = sy.d0.o("__typename", "id", "headRefOid", "state", "mergeStateStatus", "repository", "headRef", "baseRefName", "viewerCanMergeAsAdmin", "mergedBy", "mergeCommit", "mergeQueueEntry", "mergeQueue", "viewerCanUpdate", "timelineItems");

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
        m10.b00 b00Var = null;
        m10.wm wmVar = null;
        pe0 pe0Var = null;
        he0 he0Var = null;
        String str4 = null;
        Boolean bool5 = null;
        le0 le0Var = null;
        ie0 ie0Var = null;
        ke0 ke0Var = null;
        je0 je0Var = null;
        qe0 qe0Var = null;
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
                    m10.b00.Companion.getClass();
                    Iterator it = m10.b00.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj = it.next();
                            if (((m10.b00) obj).r.equals(u)) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    b00Var = (m10.b00) obj;
                    if (b00Var == null) {
                        b00Var = m10.b00.v;
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 4:
                    bool2 = bool4;
                    bool3 = bool5;
                    String u2 = eVar.u();
                    k71.k.d(u2);
                    m10.wm.Companion.getClass();
                    Iterator it2 = m10.wm.v.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj2 = it2.next();
                            if (((m10.wm) obj2).r.equals(u2)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    wmVar = (m10.wm) obj2;
                    if (wmVar == null) {
                        wmVar = m10.wm.t;
                    }
                    bool4 = bool2;
                    bool5 = bool3;
                case 5:
                    bool = bool4;
                    pe0Var = (pe0) aa.c.c(dz.a, false).a(eVar, wVar);
                    bool4 = bool;
                case 6:
                    bool = bool4;
                    he0Var = (he0) aa.c.b(aa.c.c(vy.a, false)).a(eVar, wVar);
                    bool4 = bool;
                case 7:
                    str4 = (String) aa.c.a.a(eVar, wVar);
                case 8:
                    bool4 = (Boolean) aa.c.f.a(eVar, wVar);
                case 9:
                    bool = bool4;
                    le0Var = (le0) aa.c.b(aa.c.c(zy.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 10:
                    bool = bool4;
                    ie0Var = (ie0) aa.c.b(aa.c.c(wy.a, false)).a(eVar, wVar);
                    bool4 = bool;
                case 11:
                    bool = bool4;
                    ke0Var = (ke0) aa.c.b(aa.c.c(yy.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 12:
                    bool = bool4;
                    je0Var = (je0) aa.c.b(aa.c.c(xy.a, true)).a(eVar, wVar);
                    bool4 = bool;
                case 13:
                    bool5 = (Boolean) aa.c.f.a(eVar, wVar);
                case 14:
                    bool = bool4;
                    qe0Var = (qe0) aa.c.c(ez.a, false).a(eVar, wVar);
                    bool4 = bool;
            }
            eVar.s0();
            gv.b c = gv.d.c(eVar, wVar);
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
            if (b00Var == null) {
                k41.b.B(eVar, "state");
                throw null;
            }
            if (wmVar == null) {
                k41.b.B(eVar, "mergeStateStatus");
                throw null;
            }
            if (pe0Var == null) {
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
            if (qe0Var != null) {
                return new ne0(str, str2, str3, b00Var, wmVar, pe0Var, he0Var, str4, booleanValue, le0Var, ie0Var, ke0Var, je0Var, booleanValue2, qe0Var, c);
            }
            k41.b.B(eVar, "timelineItems");
            throw null;
        }
    }

    public final void b(ea.f fVar, aa.w wVar, Object obj) {
        ne0 ne0Var = (ne0) obj;
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(ne0Var, "value");
        fVar.z0("__typename");
        aa.b bVar = aa.c.a;
        bVar.b(fVar, wVar, ne0Var.a);
        fVar.z0("id");
        bVar.b(fVar, wVar, ne0Var.b);
        fVar.z0("headRefOid");
        bVar.b(fVar, wVar, ne0Var.c);
        fVar.z0("state");
        fVar.I(ne0Var.d.r);
        fVar.z0("mergeStateStatus");
        fVar.I(ne0Var.e.r);
        fVar.z0("repository");
        aa.c.c(dz.a, false).b(fVar, wVar, ne0Var.f);
        fVar.z0("headRef");
        aa.c.b(aa.c.c(vy.a, false)).b(fVar, wVar, ne0Var.g);
        fVar.z0("baseRefName");
        bVar.b(fVar, wVar, ne0Var.h);
        fVar.z0("viewerCanMergeAsAdmin");
        aa.b bVar2 = aa.c.f;
        jo.f4.C(ne0Var.i, bVar2, fVar, wVar, "mergedBy");
        aa.c.b(aa.c.c(zy.a, true)).b(fVar, wVar, ne0Var.j);
        fVar.z0("mergeCommit");
        aa.c.b(aa.c.c(wy.a, false)).b(fVar, wVar, ne0Var.k);
        fVar.z0("mergeQueueEntry");
        aa.c.b(aa.c.c(yy.a, true)).b(fVar, wVar, ne0Var.l);
        fVar.z0("mergeQueue");
        aa.c.b(aa.c.c(xy.a, true)).b(fVar, wVar, ne0Var.m);
        fVar.z0("viewerCanUpdate");
        jo.f4.C(ne0Var.n, bVar2, fVar, wVar, "timelineItems");
        aa.c.c(ez.a, false).b(fVar, wVar, ne0Var.o);
        List list = gv.d.a;
        gv.d.d(fVar, wVar, ne0Var.p);
    }
}
