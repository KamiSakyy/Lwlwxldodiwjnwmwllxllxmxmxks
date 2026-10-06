package c00;

import aa.w0;
import androidx.compose.runtime.f3;
import androidx.compose.runtime.l3;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import com.google.android.gms.internal.measurement.d5;
import d00.h0;
import d00.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jn0.yf0;
import jo.mi0;
import k71.w;
import kotlin.NoWhenBranchMatchedException;
import l01.c0;
import m10.st;
import pz0.no;
import rm0.ya;
import rz.z;
import sy.d0;
import sy.y;
import t00.f8;
import t00.ua;
import v71.v;
import w61.a0;
import y71.n1;
import z01.a1;
import z01.p0;
import z01.y0;
import z01.z0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u implements p0, mi0, yf0 {
    public final /* synthetic */ int r;
    public com.github.service.wrapper.j s;
    public com.github.service.wrapper.b t;
    public v u;
    public s01.p v;

    public u(com.github.service.wrapper.j jVar, com.github.service.wrapper.b bVar, v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new sw0.c(jVar, bVar, vVar, new ua(23), new sw0.b(20), s01.o.r, new sw0.b(21), new ua(24), new ua(25), new ua(26), new ua(27), (j71.e) null, (LinkedHashSet) null, 129024);
                break;
            default:
                k71.k.g(jVar, "client");
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = jVar;
                this.t = bVar;
                this.u = vVar;
                this.v = new jy.d(jVar, bVar, vVar, new rm0.s(17), new ya(1), s01.o.r, new ya(2), new rm0.s(18), new rm0.s(19), new rm0.s(20), new rm0.s(21), null, null, 129024);
                break;
        }
    }

    public static final y71.i m(u uVar, String str, List list) {
        u uVar2;
        String str2;
        z71.k l;
        if (list.isEmpty()) {
            return new f8(21, a0.a);
        }
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z0 z0Var = (a1) it.next();
            if (z0Var instanceof y0) {
                jy.d dVar = (jy.d) uVar.v;
                w0 w0Var = (w0) ((s01.l) dVar).d.k(new z(str, ""));
                uVar2 = uVar;
                str2 = str;
                l = n1.I(new f8(new a0.h(uVar, w0Var, (a71.c) null, 8)), new a((a71.c) null, uVar2, str2, w0Var, 1));
            } else {
                uVar2 = uVar;
                str2 = str;
                if (!(z0Var instanceof z0)) {
                    throw new NoWhenBranchMatchedException();
                }
                l = in.r.l(uVar2.k(str2, z0Var.a, ""));
            }
            arrayList.add(l);
            uVar = uVar2;
            str = str2;
        }
        return n1.y(in.r.l(new p((y71.i[]) x61.m.F0(arrayList).toArray(new y71.i[0]), 0)), uVar.u);
    }

    public static final y71.i n(u uVar, String str, List list) {
        u uVar2;
        String str2;
        z71.k l;
        if (list.isEmpty()) {
            return new f8(21, a0.a);
        }
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z0 z0Var = (a1) it.next();
            if (z0Var instanceof y0) {
                sw0.c cVar = uVar.v;
                w0 w0Var = (w0) ((s01.l) cVar).d.k(new ux0.z(str, ""));
                uVar2 = uVar;
                str2 = str;
                l = n1.I(new f8(new a0.h(uVar, w0Var, (a71.c) null, 18)), new a((a71.c) null, uVar2, str2, w0Var, 3));
            } else {
                uVar2 = uVar;
                str2 = str;
                if (!(z0Var instanceof z0)) {
                    throw new NoWhenBranchMatchedException();
                }
                l = in.r.l(uVar2.k(str2, z0Var.a, ""));
            }
            arrayList.add(l);
            uVar = uVar2;
            str = str2;
        }
        return n1.y(in.r.l(new p((y71.i[]) x61.m.F0(arrayList).toArray(new y71.i[0]), 1)), uVar.u);
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01dc, code lost:
    
        if (k71.k.b(r2 != null ? r2.b : null, r1) == false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object o(u uVar, String str, String str2, c71.c cVar) {
        t tVar;
        int i;
        w0 w0Var;
        String str3;
        Object f;
        vz.b bVar;
        vz.d dVar;
        w0 w0Var2;
        com.github.service.wrapper.b bVar2;
        b71.a aVar;
        String str4;
        vz.b bVar3;
        vz.e eVar;
        vz.f fVar;
        ArrayList arrayList;
        w0 w0Var3;
        com.github.service.wrapper.b bVar4;
        b71.a aVar2;
        Iterator it;
        vz.d dVar2;
        xz.m mVar;
        Object obj;
        xz.m mVar2;
        ArrayList j;
        Object obj2;
        com.github.service.wrapper.b bVar5 = uVar.t;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i2 = tVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tVar.z = i2 - Integer.MIN_VALUE;
                Object obj3 = tVar.x;
                b71.a aVar3 = b71.a.r;
                i = tVar.z;
                if (i != 0) {
                    y.j(obj3);
                    w0Var = (w0) ((s01.l) ((jy.d) uVar.v)).d.k(new z(str, ""));
                    str3 = str2;
                    tVar.u = str3;
                    tVar.v = w0Var;
                    tVar.z = 1;
                    f = bVar5.f(w0Var);
                    if (f == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        List list = tVar.w;
                        y.j(obj3);
                        return list;
                    }
                    w0Var = tVar.v;
                    String str5 = tVar.u;
                    y.j(obj3);
                    f = obj3;
                    str3 = str5;
                }
                bVar = (vz.b) f;
                if (bVar == null) {
                    Iterator it2 = sy.q.i(bVar).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        vz.d dVar3 = (vz.d) obj;
                        if (dVar3 == null || (j = sy.q.j(dVar3)) == null) {
                            mVar2 = null;
                        } else {
                            int size = j.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = j.get(i3);
                                i3++;
                                xz.m mVar3 = (xz.m) obj2;
                                if (k71.k.b(mVar3 != null ? mVar3.b : null, str3)) {
                                    break;
                                }
                            }
                            mVar2 = (xz.m) obj2;
                        }
                        if (mVar2 != null) {
                            break;
                        }
                    }
                    dVar = (vz.d) obj;
                } else {
                    dVar = null;
                }
                boolean z = dVar == null && dVar.c.c.b.a == 1;
                List list2 = x61.r.r;
                if (dVar != null) {
                    String str6 = dVar.b;
                    if (z) {
                        list2 = d0.n(new y0(""));
                    } else if (str6 != null && dVar.c.c.b.b.a) {
                        list2 = d0.n(new z0(str6));
                    }
                }
                if (bVar == null) {
                    vz.e eVar2 = bVar.a;
                    if (eVar2 != null) {
                        vz.f fVar2 = eVar2.c;
                        if (fVar2 != null) {
                            vz.c cVar2 = fVar2.b;
                            List list3 = cVar2.c;
                            if (z) {
                                if (list3 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj4 : list3) {
                                        vz.d dVar4 = (vz.d) obj4;
                                        if (!k71.k.b(dVar4 != null ? dVar4.b : null, dVar != null ? dVar.b : null)) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                    w0Var2 = w0Var;
                                    bVar2 = bVar5;
                                    aVar = aVar3;
                                    str4 = null;
                                    fVar = vz.f.a(fVar2, vz.c.a(cVar2, null, arrayList, 3));
                                }
                                w0Var2 = w0Var;
                                bVar2 = bVar5;
                                aVar = aVar3;
                                arrayList = null;
                                str4 = null;
                                fVar = vz.f.a(fVar2, vz.c.a(cVar2, null, arrayList, 3));
                            } else {
                                if (list3 != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        vz.d dVar5 = (vz.d) it3.next();
                                        if (dVar5 != null) {
                                            xz.v vVar = dVar5.c;
                                            xz.u uVar2 = vVar.c;
                                            xz.p pVar = uVar2.b;
                                            it = it3;
                                            List<xz.n> list4 = pVar.c;
                                            xz.o oVar = pVar.b;
                                            if (list4 != null && !list4.isEmpty()) {
                                                for (xz.n nVar : list4) {
                                                    List<xz.n> list5 = list4;
                                                    if (k71.k.b((nVar == null || (mVar = nVar.b) == null) ? null : mVar.b, str3)) {
                                                        int i4 = uVar2.b.a - 1;
                                                        aVar2 = aVar3;
                                                        if (oVar.a) {
                                                            oVar = xz.o.a(oVar, 4);
                                                        }
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (xz.n nVar2 : list5) {
                                                            w0 w0Var4 = w0Var;
                                                            com.github.service.wrapper.b bVar6 = bVar5;
                                                            if (nVar2 != null) {
                                                                xz.m mVar4 = nVar2.b;
                                                            }
                                                            nVar2 = null;
                                                            if (nVar2 != null) {
                                                                arrayList3.add(nVar2);
                                                            }
                                                            w0Var = w0Var4;
                                                            bVar5 = bVar6;
                                                        }
                                                        w0Var3 = w0Var;
                                                        bVar4 = bVar5;
                                                        dVar5 = vz.d.a(dVar5, null, xz.v.a(vVar, null, xz.u.a(uVar2, new xz.p(i4, oVar, arrayList3)), null, 11), 3);
                                                        dVar2 = dVar5;
                                                    } else {
                                                        list4 = list5;
                                                    }
                                                }
                                            }
                                            w0Var3 = w0Var;
                                            bVar4 = bVar5;
                                            aVar2 = aVar3;
                                            dVar2 = dVar5;
                                        } else {
                                            w0Var3 = w0Var;
                                            bVar4 = bVar5;
                                            aVar2 = aVar3;
                                            it = it3;
                                            dVar2 = null;
                                        }
                                        if (dVar2 != null) {
                                            arrayList2.add(dVar2);
                                        }
                                        it3 = it;
                                        aVar3 = aVar2;
                                        w0Var = w0Var3;
                                        bVar5 = bVar4;
                                    }
                                    w0Var2 = w0Var;
                                    bVar2 = bVar5;
                                    aVar = aVar3;
                                    arrayList = arrayList2;
                                    str4 = null;
                                    fVar = vz.f.a(fVar2, vz.c.a(cVar2, null, arrayList, 3));
                                }
                                w0Var2 = w0Var;
                                bVar2 = bVar5;
                                aVar = aVar3;
                                arrayList = null;
                                str4 = null;
                                fVar = vz.f.a(fVar2, vz.c.a(cVar2, null, arrayList, 3));
                            }
                        } else {
                            w0Var2 = w0Var;
                            bVar2 = bVar5;
                            aVar = aVar3;
                            str4 = null;
                            fVar = null;
                        }
                        eVar = vz.e.a(eVar2, fVar);
                    } else {
                        w0Var2 = w0Var;
                        bVar2 = bVar5;
                        aVar = aVar3;
                        str4 = null;
                        eVar = null;
                    }
                    bVar3 = vz.b.a(bVar, eVar);
                } else {
                    w0Var2 = w0Var;
                    bVar2 = bVar5;
                    aVar = aVar3;
                    str4 = null;
                    bVar3 = null;
                }
                if (bVar3 != null) {
                    tVar.u = str4;
                    tVar.v = str4;
                    tVar.w = list2;
                    tVar.z = 2;
                    b71.a aVar4 = aVar;
                    if (bVar2.j(w0Var2, bVar3, tVar) == aVar4) {
                        return aVar4;
                    }
                }
                return list2;
            }
        }
        tVar = new t(uVar, cVar);
        Object obj32 = tVar.x;
        b71.a aVar32 = b71.a.r;
        i = tVar.z;
        if (i != 0) {
        }
        bVar = (vz.b) f;
        if (bVar == null) {
        }
        if (dVar == null) {
        }
        List list22 = x61.r.r;
        if (dVar != null) {
        }
        if (bVar == null) {
        }
        if (bVar3 != null) {
        }
        return list22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x01dc, code lost:
    
        if (k71.k.b(r2 != null ? r2.b : null, r1) == false) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:145:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object p(u uVar, String str, String str2, c71.c cVar) {
        fy0.i iVar;
        int i;
        w0 w0Var;
        String str3;
        Object f;
        yx0.b bVar;
        yx0.d dVar;
        w0 w0Var2;
        com.github.service.wrapper.b bVar2;
        b71.a aVar;
        String str4;
        yx0.b bVar3;
        yx0.e eVar;
        yx0.f fVar;
        ArrayList arrayList;
        w0 w0Var3;
        com.github.service.wrapper.b bVar4;
        b71.a aVar2;
        Iterator it;
        yx0.d dVar2;
        ay0.m mVar;
        Object obj;
        ay0.m mVar2;
        ArrayList n;
        Object obj2;
        com.github.service.wrapper.b bVar5 = uVar.t;
        if (cVar instanceof fy0.i) {
            iVar = (fy0.i) cVar;
            int i2 = iVar.z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.z = i2 - Integer.MIN_VALUE;
                Object obj3 = iVar.x;
                b71.a aVar3 = b71.a.r;
                i = iVar.z;
                if (i != 0) {
                    y.j(obj3);
                    w0Var = (w0) ((s01.l) uVar.v).d.k(new ux0.z(str, ""));
                    str3 = str2;
                    iVar.u = str3;
                    iVar.v = w0Var;
                    iVar.z = 1;
                    f = bVar5.f(w0Var);
                    if (f == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        List list = iVar.w;
                        y.j(obj3);
                        return list;
                    }
                    w0Var = iVar.v;
                    String str5 = iVar.u;
                    y.j(obj3);
                    f = obj3;
                    str3 = str5;
                }
                bVar = (yx0.b) f;
                if (bVar == null) {
                    Iterator it2 = t.e.k(bVar).iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        yx0.d dVar3 = (yx0.d) obj;
                        if (dVar3 == null || (n = t.e.n(dVar3)) == null) {
                            mVar2 = null;
                        } else {
                            int size = n.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size) {
                                    obj2 = null;
                                    break;
                                }
                                obj2 = n.get(i3);
                                i3++;
                                ay0.m mVar3 = (ay0.m) obj2;
                                if (k71.k.b(mVar3 != null ? mVar3.b : null, str3)) {
                                    break;
                                }
                            }
                            mVar2 = (ay0.m) obj2;
                        }
                        if (mVar2 != null) {
                            break;
                        }
                    }
                    dVar = (yx0.d) obj;
                } else {
                    dVar = null;
                }
                boolean z = dVar == null && dVar.c.c.b.a == 1;
                List list2 = x61.r.r;
                if (dVar != null) {
                    String str6 = dVar.b;
                    if (z) {
                        list2 = d0.n(new y0(""));
                    } else if (str6 != null && dVar.c.c.b.b.a) {
                        list2 = d0.n(new z0(str6));
                    }
                }
                if (bVar == null) {
                    yx0.e eVar2 = bVar.a;
                    if (eVar2 != null) {
                        yx0.f fVar2 = eVar2.c;
                        if (fVar2 != null) {
                            yx0.c cVar2 = fVar2.b;
                            List list3 = cVar2.c;
                            if (z) {
                                if (list3 != null) {
                                    arrayList = new ArrayList();
                                    for (Object obj4 : list3) {
                                        yx0.d dVar4 = (yx0.d) obj4;
                                        if (!k71.k.b(dVar4 != null ? dVar4.b : null, dVar != null ? dVar.b : null)) {
                                            arrayList.add(obj4);
                                        }
                                    }
                                    w0Var2 = w0Var;
                                    bVar2 = bVar5;
                                    aVar = aVar3;
                                    str4 = null;
                                    fVar = yx0.f.a(fVar2, yx0.c.a(cVar2, (yx0.g) null, arrayList, 3));
                                }
                                w0Var2 = w0Var;
                                bVar2 = bVar5;
                                aVar = aVar3;
                                arrayList = null;
                                str4 = null;
                                fVar = yx0.f.a(fVar2, yx0.c.a(cVar2, (yx0.g) null, arrayList, 3));
                            } else {
                                if (list3 != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it3 = list3.iterator();
                                    while (it3.hasNext()) {
                                        yx0.d dVar5 = (yx0.d) it3.next();
                                        if (dVar5 != null) {
                                            ay0.v vVar = dVar5.c;
                                            ay0.u uVar2 = vVar.c;
                                            ay0.p pVar = uVar2.b;
                                            it = it3;
                                            List<ay0.n> list4 = pVar.c;
                                            ay0.o oVar = pVar.b;
                                            if (list4 != null && !list4.isEmpty()) {
                                                for (ay0.n nVar : list4) {
                                                    List<ay0.n> list5 = list4;
                                                    if (k71.k.b((nVar == null || (mVar = nVar.b) == null) ? null : mVar.b, str3)) {
                                                        int i4 = uVar2.b.a - 1;
                                                        aVar2 = aVar3;
                                                        if (oVar.a) {
                                                            oVar = ay0.o.a(oVar, 4);
                                                        }
                                                        ArrayList arrayList3 = new ArrayList();
                                                        for (ay0.n nVar2 : list5) {
                                                            w0 w0Var4 = w0Var;
                                                            com.github.service.wrapper.b bVar6 = bVar5;
                                                            if (nVar2 != null) {
                                                                ay0.m mVar4 = nVar2.b;
                                                            }
                                                            nVar2 = null;
                                                            if (nVar2 != null) {
                                                                arrayList3.add(nVar2);
                                                            }
                                                            w0Var = w0Var4;
                                                            bVar5 = bVar6;
                                                        }
                                                        w0Var3 = w0Var;
                                                        bVar4 = bVar5;
                                                        dVar5 = yx0.d.a(dVar5, (String) null, ay0.v.a(vVar, (String) null, ay0.u.a(uVar2, new ay0.p(i4, oVar, arrayList3)), (ay0.f) null, 11), 3);
                                                        dVar2 = dVar5;
                                                    } else {
                                                        list4 = list5;
                                                    }
                                                }
                                            }
                                            w0Var3 = w0Var;
                                            bVar4 = bVar5;
                                            aVar2 = aVar3;
                                            dVar2 = dVar5;
                                        } else {
                                            w0Var3 = w0Var;
                                            bVar4 = bVar5;
                                            aVar2 = aVar3;
                                            it = it3;
                                            dVar2 = null;
                                        }
                                        if (dVar2 != null) {
                                            arrayList2.add(dVar2);
                                        }
                                        it3 = it;
                                        aVar3 = aVar2;
                                        w0Var = w0Var3;
                                        bVar5 = bVar4;
                                    }
                                    w0Var2 = w0Var;
                                    bVar2 = bVar5;
                                    aVar = aVar3;
                                    arrayList = arrayList2;
                                    str4 = null;
                                    fVar = yx0.f.a(fVar2, yx0.c.a(cVar2, (yx0.g) null, arrayList, 3));
                                }
                                w0Var2 = w0Var;
                                bVar2 = bVar5;
                                aVar = aVar3;
                                arrayList = null;
                                str4 = null;
                                fVar = yx0.f.a(fVar2, yx0.c.a(cVar2, (yx0.g) null, arrayList, 3));
                            }
                        } else {
                            w0Var2 = w0Var;
                            bVar2 = bVar5;
                            aVar = aVar3;
                            str4 = null;
                            fVar = null;
                        }
                        eVar = yx0.e.a(eVar2, fVar);
                    } else {
                        w0Var2 = w0Var;
                        bVar2 = bVar5;
                        aVar = aVar3;
                        str4 = null;
                        eVar = null;
                    }
                    bVar3 = yx0.b.a(bVar, eVar);
                } else {
                    w0Var2 = w0Var;
                    bVar2 = bVar5;
                    aVar = aVar3;
                    str4 = null;
                    bVar3 = null;
                }
                if (bVar3 != null) {
                    iVar.u = str4;
                    iVar.v = str4;
                    iVar.w = list2;
                    iVar.z = 2;
                    b71.a aVar4 = aVar;
                    if (bVar2.j(w0Var2, bVar3, iVar) == aVar4) {
                        return aVar4;
                    }
                }
                return list2;
            }
        }
        iVar = new fy0.i(uVar, cVar);
        Object obj32 = iVar.x;
        b71.a aVar32 = b71.a.r;
        i = iVar.z;
        if (i != 0) {
        }
        bVar = (yx0.b) f;
        if (bVar == null) {
        }
        if (dVar == null) {
        }
        List list22 = x61.r.r;
        if (dVar != null) {
        }
        if (bVar == null) {
        }
        if (bVar3 != null) {
        }
        return list22;
    }

    public static String q(ay0.f fVar) {
        String str = fVar.b;
        if (str == null) {
            str = "";
        }
        ay0.e eVar = fVar.d;
        return eVar == null ? str : f1.e.h(str, "-", t.e.r(eVar.b));
    }

    public static String r(xz.f fVar) {
        String str = fVar.b;
        if (str == null) {
            str = "";
        }
        xz.e eVar = fVar.d;
        return eVar == null ? str : f1.e.h(str, "-", sy.q.l(eVar.b));
    }

    public final y71.i a(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "viewId");
                return n1.y(((jy.d) this.v).b(new z(str, str2)), this.u);
            default:
                k71.k.g(str, "viewId");
                return n1.y(this.v.b(new ux0.z(str, str2)), this.u);
        }
    }

    public final y71.i b(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "viewId");
                return ((jy.d) this.v).h(new z(str, str2));
            default:
                k71.k.g(str, "viewId");
                return this.v.h(new ux0.z(str, str2));
        }
    }

    public final y71.i c(String str) {
        switch (this.r) {
            case 0:
                return n1.y(new bz0.e(com.github.service.wrapper.b.a(this.t, new d00.o(str), ga.h.t, false, (LinkedHashSet) null, 56), 13), this.u);
            default:
                return n1.y(new bz0.e(com.github.service.wrapper.b.a(this.t, new gy0.o(str), ga.h.t, false, (LinkedHashSet) null, 56), 27), this.u);
        }
    }

    public final y71.i d(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "viewId");
                return n1.y(((jy.d) this.v).e(new z(str, str2)), this.u);
            default:
                k71.k.g(str, "viewId");
                return n1.y(this.v.e(new ux0.z(str, str2)), this.u);
        }
    }

    public final y71.i e(ProjectsMetaInfo projectsMetaInfo, String str, c0 c0Var, List list) {
        switch (this.r) {
            case 0:
                k71.k.g(projectsMetaInfo, "projectsMetaInfo");
                k71.k.g(list, "newSortValues");
                return n1.I(new f8(new f3(projectsMetaInfo, this, str, c0Var, list, (a71.c) null, 2)), new m((a71.c) null, this, projectsMetaInfo, 0));
            default:
                k71.k.g(projectsMetaInfo, "projectsMetaInfo");
                k71.k.g(list, "newSortValues");
                return n1.I(new f8(new f3(projectsMetaInfo, this, str, c0Var, list, (a71.c) null, 4)), new m((a71.c) null, this, projectsMetaInfo, 4));
        }
    }

    public final y71.i f(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "viewId");
                k71.k.g(str3, "itemId");
                w wVar = new w();
                wVar.r = x61.r.r;
                y71.y k = in.r.k(new y71.y(new an.b(wVar, this, str2, str3, null, 3), this.s.d(new rz.n(str, str3))));
                int i = 0;
                a71.c cVar = null;
                return n1.y(in.r.l(n1.I(new y71.s(k, new b(this, str2, str3, cVar, i)), new a(cVar, this, str2, wVar, i))), this.u);
            default:
                k71.k.g(str, "projectId");
                k71.k.g(str2, "viewId");
                k71.k.g(str3, "itemId");
                w wVar2 = new w();
                wVar2.r = x61.r.r;
                y71.y k2 = in.r.k(new y71.y(new an.b(wVar2, this, str2, str3, null, 5), this.s.d(new ux0.n(str, str3))));
                a71.c cVar2 = null;
                return n1.y(in.r.l(n1.I(new y71.s(k2, new b(this, str2, str3, cVar2, 1)), new a(cVar2, this, str2, wVar2, 2))), this.u);
        }
    }

    public final y71.i g(String str, int i) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectOwnerLogin");
                return n1.y(new b10.b(d5.R(com.github.service.wrapper.b.q(this.t, new x(str, i), ga.h.t, false, (Set) null, (Set) null, new l3(1, new bq.a(9)), new bq.a(10), 24)), 2), this.u);
            default:
                k71.k.g(str, "projectOwnerLogin");
                return n1.y(new b10.b(d5.R(com.github.service.wrapper.b.q(this.t, new gy0.x(str, i), ga.h.t, false, (Set) null, (Set) null, new l3(1, new fp.y(6)), new fp.y(7), 24)), 4), this.u);
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    public final y71.i i(String str, int i) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "projectOwnerLogin");
                return n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new d00.k(str, i), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58)), this.u);
            default:
                k71.k.g(str, "projectOwnerLogin");
                return n1.y(in.r.l(com.github.service.wrapper.a.o(this.t, new gy0.k(str, i), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58)), this.u);
        }
    }

    public final y71.i k(String str, String str2, String str3) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "viewId");
                st.Companion.getClass();
                ha.b i = y9.a.i(((aa.q) st.c).a, str2 == null ? "null" : str2, str3);
                return n1.y(n1.I(new f8(new a0.h(this, i, (a71.c) null, 7)), new d(null, this, str, str2, str3, i, 0)), this.u);
            default:
                k71.k.g(str, "viewId");
                no.Companion.getClass();
                ha.b i2 = y9.a.i(((aa.q) no.c).a, str2 == null ? "null" : str2, str3);
                return n1.y(n1.I(new f8(new a0.h(this, i2, (a71.c) null, 17)), new d(null, this, str, str2, str3, i2, 1)), this.u);
        }
    }

    public final y71.i l(String str, String str2) {
        switch (this.r) {
            case 0:
                k71.k.g(str, "fullDatabaseId");
                k71.k.g(str2, "selectedViewId");
                return n1.y(new bz0.e(com.github.service.wrapper.b.a(this.t, new h0(str, str2), ga.h.t, false, (LinkedHashSet) null, 56), 14), this.u);
            default:
                k71.k.g(str, "fullDatabaseId");
                k71.k.g(str2, "selectedViewId");
                return n1.y(new bz0.e(com.github.service.wrapper.b.a(this.t, new gy0.h0(str, str2), ga.h.t, false, (LinkedHashSet) null, 56), 28), this.u);
        }
    }
}
