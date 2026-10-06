package rm0;

import gn0.hn;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import jn0.tg0;
import jn0.ug0;
import jn0.wg0;
import jn0.yg0;
import kc0.as;
import kc0.bs;
import kc0.cs;
import kc0.iy;
import kc0.jb;
import kc0.kb;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class s implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ s(int i) {
        this.r = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00e9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x019b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    @Override // j71.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        Object g = null;
        Object r9 = null;
        Object r8 = null;
        String str;
        String str2;
        List list;
        kc0.k3Shadow k3Var;
        vz.f fVar;
        vz.c cVar;
        List list2;
        vz.f fVar2;
        vz.c cVar2;
        vz.g gVar;
        vz.f fVar3;
        vz.c cVar3;
        vz.f fVar4;
        String str3;
        String str4;
        String str5;
        l01.n0 n0Var;
        java.util.List r4;
        xz.m mVar;
        xz.e eVar;
        String l;
        xz.a aVar;
        vz.f fVar5;
        int i = this.r;
        aa1.bShadow bVar = aa.t0.d;
        w61.a0 a0Var = w61.a0.a;
        Collection collection = x61.rShadow.r;
        r8 = null;
        r8 = null;
        List list3 = null;
        int i2 = 0;
        r9 = false;
        boolean z = false;
        r9 = false;
        r9 = false;
        r9 = false;
        boolean z2 = false;
        r9 = false;
        boolean z3 = false;
        switch (i) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 1:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 2:
                sd0.k kVar = (sd0.k) obj;
                k71.k.g(kVar, "it");
                sd0.i iVar = kVar.b;
                if (iVar != null) {
                    gn0.a9.Companion.getClass();
                    str = ((aa.q) gn0.a9.l).a;
                } else {
                    gn0.i9.Companion.getClass();
                    str = ((aa.q) gn0.i9.c).a;
                }
                sd0.i a = iVar != null ? sd0.i.a(iVar, iVar.b - 1, false) : null;
                sd0.j jVar = kVar.c;
                return new as(new bs(new cs(str, sd0.k.a(kVar, a, jVar != null ? sd0.j.a(jVar, jVar.b - 1, false) : null))));
            case 3:
                sd0.k kVar2 = (sd0.k) obj;
                k71.k.g(kVar2, "it");
                sd0.i iVar2 = kVar2.b;
                if (iVar2 != null) {
                    gn0.a9.Companion.getClass();
                    str2 = ((aa.q) gn0.a9.l).a;
                } else {
                    gn0.i9.Companion.getClass();
                    str2 = ((aa.q) gn0.i9.c).a;
                }
                sd0.i a2 = iVar2 != null ? sd0.i.a(iVar2, iVar2.b + 1, true) : null;
                sd0.j jVar2 = kVar2.c;
                return new kc0.y1(new kc0.w1(new kc0.z1(str2, sd0.k.a(kVar2, a2, jVar2 != null ? sd0.j.a(jVar2, jVar2.b + 1, true) : null))));
            case 4:
                dl0.h hVar = (dl0.h) obj;
                k71.k.g(hVar, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(hVar.b != null);
            case 5:
                jb jbVar = (jb) obj;
                k71.k.g(jbVar, "$this$fetchWithPartialResultErrors");
                kb kbVar = jbVar.a;
                return Boolean.valueOf((kbVar != null ? kbVar.a : null) != null);
            case 6:
                ri0.u3 u3Var = (ri0.u3) obj;
                k71.k.g(u3Var, "state");
                return ri0.u3.a(u3Var, hn.t);
            case 7:
                ri0.g4 g4Var = (ri0.g4) obj;
                k71.k.g(g4Var, "fragment");
                String str6 = g4Var.a;
                String str7 = g4Var.c;
                k71.k.g(str6, "id");
                k71.k.g(str7, "__typename");
                return new ri0.g4(str6, str7, false);
            case 8:
                ri0.u3 u3Var2 = (ri0.u3) obj;
                k71.k.g(u3Var2, "state");
                return ri0.u3.a(u3Var2, hn.u);
            case 9:
                iy iyVar = (iy) obj;
                k71.k.g(iyVar, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(iyVar.a != null);
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 11:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            case 12:
                k71.k.g((s01.n) obj, "it");
                return new kc0.n3(bVar);
            case 13:
                kc0.i3 i3Var = (kc0.i3) obj;
                k71.k.g(i3Var, "data");
                kc0.l3Shadow l3Var = i3Var.a.b;
                if (l3Var != null && (list = l3Var.b) != null) {
                    z3 = !list.isEmpty();
                }
                return Boolean.valueOf(z3);
            case 14:
                kc0.i3 i3Var2 = (kc0.i3) obj;
                k71.k.g(i3Var2, "data");
                kc0.l3Shadow l3Var2 = i3Var2.a.b;
                if (l3Var2 == null || (k3Var = l3Var2.a) == null) {
                    return null;
                }
                return new x01.i(k3Var.c, k3Var.a, !k3Var.b);
            case 15:
                kc0.i3 i3Var3 = (kc0.i3) obj;
                k71.k.g(i3Var3, "data");
                kc0.l3Shadow l3Var3 = i3Var3.a.b;
                List list4 = l3Var3 != null ? l3Var3.b : null;
                return list4 == null ? collection : list4;
            case 16:
                kc0.i3 i3Var4 = (kc0.i3) obj;
                k71.k.g(i3Var4, "data");
                kc0.l3Shadow l3Var4 = i3Var4.a.b;
                Collection collection2 = l3Var4 != null ? l3Var4.b : null;
                if (collection2 != null) {
                    collection = collection2;
                }
                ArrayList S = x61.m.S(collection);
                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                int size = S.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj2 = S.get(i3);
                    i3++;
                    kc0.j3 j3Var = (kc0.j3) obj2;
                    arrayList.add(new yz0.h4(j3Var.b, j3Var.c));
                }
                kc0.k3Shadow k3Var2 = l3Var4 != null ? l3Var4.a : null;
                return new yz0.i4(arrayList, k3Var2 != null ? new x01.i(k3Var2.c, k3Var2.a, !k3Var2.b) : new x01.i(null, false, true));
            case 17:
                rz.z zVar = (rz.z) obj;
                k71.k.g(zVar, "params");
                return new vz.h(new aa.u0(10), new aa.u0(zVar.b), zVar.a);
            case 18:
                vz.b bVar2 = (vz.b) obj;
                k71.k.g(bVar2, "data");
                vz.e eVar2 = bVar2.a;
                if (eVar2 != null && (fVar = eVar2.c) != null && (cVar = fVar.b) != null && (list2 = cVar.c) != null) {
                    z2 = !list2.isEmpty();
                }
                return Boolean.valueOf(z2);
            case 19:
                vz.b bVar3 = (vz.b) obj;
                k71.k.g(bVar3, "data");
                vz.e eVar3 = bVar3.a;
                if (eVar3 == null || (fVar2 = eVar3.c) == null || (cVar2 = fVar2.b) == null || (gVar = cVar2.b) == null) {
                    return null;
                }
                return new x01.i(gVar.b, gVar.a, !gVar.c);
            case 20:
                vz.b bVar4 = (vz.b) obj;
                k71.k.g(bVar4, "data");
                vz.e eVar4 = bVar4.a;
                if (eVar4 != null && (fVar3 = eVar4.c) != null && (cVar3 = fVar3.b) != null) {
                    list3 = cVar3.c;
                }
                return list3 == null ? collection : list3;
            case 21:
                vz.b bVar5 = (vz.b) obj;
                k71.k.g(bVar5, "data");
                vz.e eVar5 = bVar5.a;
                Collection<vz.d> collection3 = (eVar5 == null || (fVar5 = eVar5.c) == null) ? null : fVar5.b.c;
                if (collection3 == null) {
                    collection3 = collection;
                }
                ArrayList arrayList2 = new ArrayList();
                for (vz.d dVar : collection3) {
                    if (dVar != null && (aVar = dVar.c.d.c) != null) {
                        xz.bShadow bVar6 = aVar.b;
                        if (bVar6 != null) {
                            str3 = bVar6.a;
                        } else {
                            xz.c cVar4 = aVar.d;
                            if (cVar4 != null) {
                                str3 = cVar4.a;
                            } else {
                                xz.d dVar2 = aVar.c;
                                if (dVar2 != null) {
                                    str3 = dVar2.a;
                                }
                            }
                        }
                        str4 = "";
                        if (str3 == null) {
                            str3 = "";
                        }
                        str5 = dVar == null ? dVar.c.d.b : null;
                        if (str5 == null) {
                            str5 = "";
                        }
                        String str8 = dVar == null ? dVar.c.b : null;
                        if (dVar != null && (eVar = dVar.c.d.d) != null && (l = sy.q.l(eVar.b)) != null) {
                            str4 = l;
                        }
                        if (dVar == null) {
                            xz.u uVar = dVar.c.c;
                            l01.m0 m0Var = new l01.m0(str3, str4, str5, str8);
                            List<xz.n> list5 = uVar.b.c;
                            if (list5 != null) {
                                r4 = new ArrayList();
                                for (xz.n nVar : list5) {
                                    l01.v g = (nVar == null || (mVar = nVar.b) == null) ? null : b31.b.g(mVar.c, com.google.android.gms.internal.measurement.d5.u(nVar != null ? nVar.c : null));
                                    if (g != null) {
                                        r4.add(g);
                                    }
                                }
                            } else {
                                r4 = 0;
                            }
                            if (r4 == 0) {
                                r4 = collection;
                            }
                            xz.p pVar = uVar.b;
                            n0Var = new l01.n0(m0Var, r4, pVar.b.a, pVar.a);
                        } else {
                            n0Var = null;
                        }
                        if (n0Var == null) {
                            arrayList2.add(n0Var);
                        }
                    }
                    str3 = null;
                    str4 = "";
                    if (str3 == null) {
                    }
                    if (dVar == null) {
                    }
                    if (str5 == null) {
                    }
                    if (dVar == null) {
                    }
                    if (dVar != null) {
                        str4 = l;
                    }
                    if (dVar == null) {
                    }
                    if (n0Var == null) {
                    }
                }
                if (eVar5 != null && (fVar4 = eVar5.c) != null) {
                    z = fVar4.b.b.a;
                }
                return new l01.o0(arrayList2, z);
            case 22:
                rz0.a aVar2 = (rz0.a) obj;
                k71.k.g(aVar2, "parameters");
                String str9 = aVar2.a;
                return new yg0(bVar, str9 == null ? bVar : new aa.u0(str9));
            case 23:
                tg0 tg0Var = (tg0) obj;
                k71.k.g(tg0Var, "data");
                return Boolean.valueOf(tg0Var.a.a.b != null ? !r13.isEmpty() : false);
            case 24:
                tg0 tg0Var2 = (tg0) obj;
                k71.k.g(tg0Var2, "data");
                mw0.a aVar3 = tg0Var2.a.a.a.b;
                return new x01.i(aVar3.a, aVar3.b, !aVar3.c);
            case 25:
                tg0 tg0Var3 = (tg0) obj;
                k71.k.g(tg0Var3, "data");
                List list6 = tg0Var3.a.a.b;
                return list6 == null ? collection : list6;
            case 26:
                tg0 tg0Var4 = (tg0) obj;
                k71.k.g(tg0Var4, "data");
                wg0 wg0Var = tg0Var4.a.a;
                Collection collection4 = wg0Var.b;
                if (collection4 != null) {
                    collection = collection4;
                }
                ArrayList S2 = x61.m.S(collection);
                ArrayList arrayList3 = new ArrayList(x61.n.F(S2, 10));
                int size2 = S2.size();
                while (i2 < size2) {
                    Object obj3 = S2.get(i2);
                    i2++;
                    arrayList3.add(w8.s.H(((ug0) obj3).c));
                }
                mw0.a aVar4 = wg0Var.a.b;
                return new p01.p(arrayList3, new x01.i(aVar4.a, aVar4.b, !aVar4.c));
            case 27:
                int i4 = s0.g.a;
                return a0Var;
            case 28:
                Long l2 = (Long) obj;
                l2.longValue();
                return l2;
            default:
                return a0Var;
        }
    }
    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object n0(Object p1) { return null; }
    public static final Object d = null;
    public Object S(int p1, boolean p2) { return null; }
}
