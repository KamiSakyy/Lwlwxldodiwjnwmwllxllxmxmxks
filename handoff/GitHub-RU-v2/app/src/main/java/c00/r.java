package c00;

import a0.c0;
import a0.g2;
import a0.y1;
import aa.v0;
import androidx.compose.runtime.f1;
import com.github.domain.discussions.data.DiscussionCategoryData;
import d1.y0;
import f1.k4;
import f1.s5;
import f1.xb;
import ik.b0;
import ik.d0;
import ik.e0;
import ik.f0;
import ik.g0;
import ik.n0;
import ik.p0;
import ik.q0;
import ik.r0;
import ik.t0;
import ik.v;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kc0.p3;
import l01.w;
import m10.ix;
import m10.st;
import pz0.no;
import pz0.xr;
import sy.y;
import vz.z;
import w61.a0;
import xn.s0;
import xn.xShadow;
import z01.z0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ r(int i, Object obj, Object obj2) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        lk.d dVar;
        int i;
        if (cVar instanceof lk.d) {
            dVar = (lk.d) cVar;
            int i2 = dVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = dVar.u;
                b71.a aVar = b71.a.r;
                i = dVar.v;
                if (i != 0) {
                    y.j(obj2);
                    y71.j jVar = (y71.j) this.s;
                    b01.a aVar2 = (b01.a) obj;
                    kk.a aVar3 = ((lk.e) this.t).b;
                    k71.k.g(aVar2, "serviceObject");
                    kk.e eVar = (kk.e) aVar3.s;
                    jk.d a = eVar.a(aVar2.a);
                    ArrayList arrayList = aVar2.b;
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(eVar.a((b01.g) obj3));
                    }
                    jk.a aVar4 = new jk.a(a, arrayList2, aVar2.c, aVar2.d, aVar2.e, aVar2.f, aVar2.g, aVar2.h, aVar2.i, aVar2.j, aVar2.k);
                    dVar.v = 1;
                    if (jVar.c(aVar4, dVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        dVar = new lk.d(this, cVar);
        Object obj22 = dVar.u;
        b71.a aVar5 = b71.a.r;
        i = dVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        ma.h hVar;
        int i;
        if (cVar instanceof ma.h) {
            hVar = (ma.h) cVar;
            int i2 = hVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = hVar.u;
                b71.a aVar = b71.a.r;
                i = hVar.v;
                if (i != 0) {
                    y.j(obj2);
                    y71.j jVar = (y71.j) this.s;
                    if (!((com.apollographql.apollo.internal.a) this.t).f) {
                        hVar.v = 1;
                        if (jVar.c(obj, hVar) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        hVar = new ma.h(this, cVar);
        Object obj22 = hVar.u;
        b71.a aVar2 = b71.a.r;
        i = hVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        nj.g gVar;
        int i;
        if (cVar instanceof nj.g) {
            gVar = (nj.g) cVar;
            int i2 = gVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = gVar.u;
                b71.a aVar = b71.a.r;
                i = gVar.v;
                if (i != 0) {
                    y.j(obj2);
                    y71.j jVar = (y71.j) this.s;
                    xShadow xVar = (xShadow) obj;
                    xShadow a = xShadow.a(xVar, ((s0) this.t).a, xVar.c, null, null, xVar.j, 15865);
                    gVar.v = 1;
                    if (jVar.c(a, gVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        gVar = new nj.g(this, cVar);
        Object obj22 = gVar.u;
        b71.a aVar2 = b71.a.r;
        i = gVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        nl.b bVar;
        int i;
        if (cVar instanceof nl.b) {
            bVar = (nl.b) cVar;
            int i2 = bVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = bVar.u;
                b71.a aVar = b71.a.r;
                i = bVar.v;
                if (i != 0) {
                    y.j(obj2);
                    y71.j jVar = (y71.j) this.s;
                    String str = ((yz0.j) this.t).d;
                    bVar.v = 1;
                    if (jVar.c(str, bVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        bVar = new nl.b(this, cVar);
        Object obj22 = bVar.u;
        b71.a aVar2 = b71.a.r;
        i = bVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        o20.e eVar;
        int i;
        if (cVar instanceof o20.e) {
            eVar = (o20.e) cVar;
            int i2 = eVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar.u;
                b71.a aVar = b71.a.r;
                i = eVar.v;
                if (i != 0) {
                    y.j(obj2);
                    y71.j jVar = (y71.j) this.s;
                    Object k = ((np.h) this.t).k((b20.s) obj);
                    eVar.v = 1;
                    if (jVar.c(k, eVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj2);
                }
                return a0.a;
            }
        }
        eVar = new o20.e(this, cVar);
        Object obj22 = eVar.u;
        b71.a aVar2 = b71.a.r;
        i = eVar.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0995  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x09d4  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x09e2  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x0a88  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0a97  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        Object f = null;
        q qVar;
        int i;
        y71.j jVar;
        b71.a aVar;
        w61.k kVar;
        vz.e eVar;
        vz.f fVar;
        ArrayList arrayList;
        y71.j jVar2;
        b71.a aVar2;
        int i2;
        int i3;
        LinkedHashMap linkedHashMap;
        vz.d dVar;
        vz.d a;
        z zVar;
        List list;
        z zVar2;
        do0.k kVar2;
        int i4;
        dp.g gVar;
        int i5;
        ed0.e eVar2;
        int i6;
        fy0.g gVar2;
        int i7;
        y71.j jVar3;
        b71.a aVar3;
        w61.k kVar3;
        yx0.e eVar3;
        yx0.f fVar2;
        ArrayList arrayList2;
        y71.j jVar4;
        b71.a aVar4;
        int i8;
        int i9;
        LinkedHashMap linkedHashMap2;
        yx0.d dVar2;
        yx0.d a2;
        yx0.z zVar3;
        List list2;
        yx0.z zVar4;
        ik.a aVar5;
        int i11;
        ik.f fVar3;
        int i12;
        ik.l lVar;
        int i13;
        ik.o oVar;
        int i14;
        DiscussionCategoryData discussionCategoryData;
        ik.s sVar;
        int i15;
        v vVar;
        int i16;
        b0 b0Var;
        int i17;
        d0 d0Var;
        int i18;
        f0 f0Var;
        int i19;
        n0 n0Var;
        int i21;
        q0 q0Var;
        int i22;
        ik.s0 s0Var;
        int i23;
        il.l lVar2;
        int i24;
        ma.g gVar3;
        int i25;
        rm0.p pVar;
        int i26;
        switch (this.r) {
            case 0:
                if (cVar instanceof q) {
                    qVar = (q) cVar;
                    int i27 = qVar.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        qVar.v = i27 - Integer.MIN_VALUE;
                        Object obj2 = qVar.u;
                        b71.a aVar6 = b71.a.r;
                        i = qVar.v;
                        if (i != 0) {
                            y.j(obj2);
                            y71.j jVar5 = (y71.j) this.s;
                            vz.b bVar = (vz.b) this.t;
                            vz.y yVar = ((vz.v) obj).a;
                            vz.a0 a0Var = (yVar == null || (zVar2 = yVar.c) == null) ? null : zVar2.b.b;
                            ArrayList S = (yVar == null || (zVar = yVar.c) == null || (list = zVar.b.c) == null) ? null : x61.m.S(list);
                            x61.rShadow rVar = x61.rShadow.r;
                            if (a0Var == null || S == null) {
                                jVar = jVar5;
                                aVar = aVar6;
                                kVar = new w61.k(bVar, rVar);
                            } else {
                                ArrayList S2 = x61.m.S(sy.q.i(bVar));
                                int s = x61.xShadow.s(x61.n.F(S2, 10));
                                if (s < 16) {
                                    s = 16;
                                }
                                LinkedHashMap linkedHashMap3 = new LinkedHashMap(s);
                                int size = S2.size();
                                int i28 = 0;
                                while (i28 < size) {
                                    Object obj3 = S2.get(i28);
                                    i28++;
                                    vz.d dVar3 = (vz.d) obj3;
                                    String str = dVar3.b;
                                    linkedHashMap3.put((str == null || t71.p.T(str)) ? u.r(dVar3.c.d) : dVar3.b, obj3);
                                }
                                ArrayList arrayList3 = new ArrayList();
                                ArrayList arrayList4 = new ArrayList();
                                int size2 = S.size();
                                int i29 = 0;
                                while (i29 < size2) {
                                    Object obj4 = S.get(i29);
                                    int i31 = i29 + 1;
                                    vz.x xVar = (vz.x) obj4;
                                    String str2 = xVar.b;
                                    xz.f fVar4 = xVar.c;
                                    if (str2 == null) {
                                        arrayList = S;
                                        jVar2 = jVar5;
                                        aVar2 = aVar6;
                                        i2 = size2;
                                        i3 = i31;
                                        linkedHashMap = linkedHashMap3;
                                        a = null;
                                    } else {
                                        vz.d dVar4 = (vz.d) linkedHashMap3.get(str2);
                                        arrayList = S;
                                        vz.d dVar5 = (vz.d) linkedHashMap3.get(u.r(fVar4));
                                        vz.d dVar6 = (vz.d) linkedHashMap3.get(fVar4.b);
                                        if (dVar4 == null) {
                                            if (dVar5 != null) {
                                                arrayList3.add(new z0(str2));
                                            } else if (dVar6 != null) {
                                                dVar5 = dVar6;
                                                arrayList3.add(new z0(str2));
                                            } else {
                                                arrayList3.add(new z0(str2));
                                                st.Companion.getClass();
                                                String str3 = ((aa.q) st.c).a;
                                                ix.Companion.getClass();
                                                i2 = size2;
                                                i3 = i31;
                                                linkedHashMap = linkedHashMap3;
                                                jVar2 = jVar5;
                                                aVar2 = aVar6;
                                                dVar = new vz.d(str3, str2, new xz.v(str3, str2, new xz.u(((aa.q) ix.a).a, new xz.p(0, new xz.o(null, false, false), rVar)), fVar4));
                                            }
                                            jVar2 = jVar5;
                                            aVar2 = aVar6;
                                            i3 = i31;
                                            linkedHashMap = linkedHashMap3;
                                            dVar = dVar5;
                                            i2 = size2;
                                        } else {
                                            jVar2 = jVar5;
                                            aVar2 = aVar6;
                                            i2 = size2;
                                            i3 = i31;
                                            linkedHashMap = linkedHashMap3;
                                            dVar = dVar4;
                                        }
                                        String str4 = xVar.b;
                                        a = vz.d.a(dVar, str4, xz.v.a(dVar.c, str4, null, fVar4, 5), 1);
                                    }
                                    if (a != null) {
                                        arrayList4.add(a);
                                    }
                                    jVar5 = jVar2;
                                    S = arrayList;
                                    size2 = i2;
                                    i29 = i3;
                                    linkedHashMap3 = linkedHashMap;
                                    aVar6 = aVar2;
                                }
                                jVar = jVar5;
                                aVar = aVar6;
                                vz.e eVar4 = bVar.a;
                                if (eVar4 != null) {
                                    vz.f fVar5 = eVar4.c;
                                    if (fVar5 != null) {
                                        vz.c cVar2 = fVar5.b;
                                        fVar = vz.f.a(fVar5, vz.c.a(cVar2, new vz.g(a0Var.b, a0Var.a, cVar2.b.c), arrayList4, 1));
                                    } else {
                                        fVar = null;
                                    }
                                    eVar = vz.e.a(eVar4, fVar);
                                } else {
                                    eVar = null;
                                }
                                kVar = new w61.k(vz.b.a(bVar, eVar), arrayList3);
                            }
                            qVar.v = 1;
                            b71.a aVar7 = aVar;
                            if (jVar.c(kVar, qVar) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj2);
                        }
                        return a0.a;
                    }
                }
                qVar = new q(this, cVar);
                Object obj22 = qVar.u;
                b71.a aVar62 = b71.a.r;
                i = qVar.v;
                if (i != 0) {
                }
                return a0.a;
            case 1:
                long j = ((c2.b) obj).a;
                a0.e eVar5 = (a0.e) this.s;
                long j2 = ((c2.b) eVar5.d()).a & 9223372034707292159L;
                a0 a0Var2 = a0.a;
                if (j2 == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((c2.b) eVar5.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
                    Object f = eVar5.f(cVar, new c2.b(j));
                    return f == b71.a.r ? f : a0Var2;
                }
                v71.b0.z((v71.z) this.t, (a71.h) null, (v71.a0Shadow) null, new y0(eVar5, j, (a71.c) null, 0), 3);
                return a0Var2;
            case 2:
                if (cVar instanceof do0.k) {
                    kVar2 = (do0.k) cVar;
                    int i32 = kVar2.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        kVar2.v = i32 - Integer.MIN_VALUE;
                        Object obj5 = kVar2.u;
                        b71.a aVar8 = b71.a.r;
                        i4 = kVar2.v;
                        if (i4 != 0) {
                            y.j(obj5);
                            y71.j jVar6 = (y71.j) this.s;
                            Object k = ((d9.l) this.t).k((qn0.s) obj);
                            kVar2.v = 1;
                            if (jVar6.c(k, kVar2) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj5);
                        }
                        return a0.a;
                    }
                }
                kVar2 = new do0.k(this, cVar);
                Object obj52 = kVar2.u;
                b71.a aVar82 = b71.a.r;
                i4 = kVar2.v;
                if (i4 != 0) {
                }
                return a0.a;
            case 3:
                if (cVar instanceof dp.g) {
                    gVar = (dp.g) cVar;
                    int i33 = gVar.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        gVar.v = i33 - Integer.MIN_VALUE;
                        Object obj6 = gVar.u;
                        b71.a aVar9 = b71.a.r;
                        i5 = gVar.v;
                        if (i5 != 0) {
                            y.j(obj6);
                            y71.j jVar7 = (y71.j) this.s;
                            Object k2 = ((d9.l) this.t).k((qo.s) obj);
                            gVar.v = 1;
                            if (jVar7.c(k2, gVar) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj6);
                        }
                        return a0.a;
                    }
                }
                gVar = new dp.g(this, cVar);
                Object obj62 = gVar.u;
                b71.a aVar92 = b71.a.r;
                i5 = gVar.v;
                if (i5 != 0) {
                }
                return a0.a;
            case 4:
                j0.n nVar = (j0.h) obj;
                e1.a aVar10 = (e1.a) this.s;
                if (!(nVar instanceof j0.n)) {
                    v71.z zVar5 = (v71.z) this.t;
                    e1.g gVar4 = aVar10.K;
                    if (gVar4 == null) {
                        boolean z = aVar10.G;
                        k4 k4Var = aVar10.J;
                        gVar4 = new e1.g();
                        gVar4.a = z;
                        gVar4.b = k4Var;
                        gVar4.c = a0.f.a(0.0f);
                        gVar4.d = new ArrayList();
                        v2.l.k(aVar10);
                        aVar10.K = gVar4;
                    }
                    ArrayList arrayList5 = (ArrayList) gVar4.d;
                    if (nVar instanceof j0.f) {
                        arrayList5.add(nVar);
                    } else if (nVar instanceof j0.g) {
                        arrayList5.remove(((j0.g) nVar).a);
                    } else if (nVar instanceof j0.d) {
                        arrayList5.add(nVar);
                    } else if (nVar instanceof j0.e) {
                        arrayList5.remove(((j0.e) nVar).a);
                    } else if (nVar instanceof j0.b) {
                        arrayList5.add(nVar);
                    } else if (nVar instanceof j0.c) {
                        arrayList5.remove(((j0.c) nVar).a);
                    } else if (nVar instanceof j0.a) {
                        arrayList5.remove(((j0.a) nVar).a);
                    }
                    j0.h hVar = (j0.h) x61.m.f0(arrayList5);
                    if (!k71.k.b((j0.h) gVar4.e, hVar)) {
                        if (hVar != null) {
                            ((k4) gVar4.b).a();
                            boolean z2 = hVar instanceof j0.f;
                            float f2 = z2 ? 0.08f : hVar instanceof j0.d ? 0.1f : hVar instanceof j0.b ? 0.16f : 0.0f;
                            g2 g2Var = e1.f.a;
                            if (!z2) {
                                if (hVar instanceof j0.d) {
                                    g2Var = new g2(45, 0, c0.d);
                                } else if (hVar instanceof j0.b) {
                                    g2Var = new g2(45, 0, c0.d);
                                }
                            }
                            v71.b0.z(zVar5, (a71.h) null, (v71.a0Shadow) null, new y1(gVar4, f2, g2Var, (a71.c) null), 3);
                        } else {
                            j0.h hVar2 = (j0.h) gVar4.e;
                            g2 g2Var2 = e1.f.a;
                            if (!(hVar2 instanceof j0.f) && !(hVar2 instanceof j0.d) && (hVar2 instanceof j0.b)) {
                                g2Var2 = new g2(150, 0, c0.d);
                            }
                            v71.b0.z(zVar5, (a71.h) null, (v71.a0Shadow) null, new a61.n0(gVar4, g2Var2, (a71.c) null, 20), 3);
                        }
                        gVar4.e = hVar;
                    }
                } else if (aVar10.N) {
                    aVar10.O0(nVar);
                } else {
                    aVar10.O.a(nVar);
                }
                return a0.a;
            case 5:
                if (cVar instanceof ed0.e) {
                    eVar2 = (ed0.e) cVar;
                    int i34 = eVar2.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        eVar2.v = i34 - Integer.MIN_VALUE;
                        Object obj7 = eVar2.u;
                        b71.a aVar11 = b71.a.r;
                        i6 = eVar2.v;
                        if (i6 != 0) {
                            y.j(obj7);
                            y71.j jVar8 = (y71.j) this.s;
                            Object k3 = ((d9.l) this.t).k((rc0.s) obj);
                            eVar2.v = 1;
                            if (jVar8.c(k3, eVar2) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj7);
                        }
                        return a0.a;
                    }
                }
                eVar2 = new ed0.e(this, cVar);
                Object obj72 = eVar2.u;
                b71.a aVar112 = b71.a.r;
                i6 = eVar2.v;
                if (i6 != 0) {
                }
                return a0.a;
            case 6:
                j0.e eVar6 = (j0.h) obj;
                ArrayList arrayList6 = (ArrayList) this.s;
                if (eVar6 instanceof j0.d) {
                    arrayList6.add(eVar6);
                } else if (eVar6 instanceof j0.e) {
                    arrayList6.remove(eVar6.a);
                }
                boolean z3 = !arrayList6.isEmpty();
                s5 s5Var = (s5) this.t;
                if (z3 != s5Var.M) {
                    s5Var.M = z3;
                    s5Var.S0();
                }
                return a0.a;
            case 7:
                j0.h hVar3 = (j0.h) obj;
                k71.u uVar = (k71.u) this.s;
                if (hVar3 instanceof j0.l) {
                    uVar.r++;
                } else if (hVar3 instanceof j0.m) {
                    uVar.r--;
                } else if (hVar3 instanceof j0.k) {
                    uVar.r--;
                }
                boolean z4 = uVar.r > 0;
                xb xbVar = (xb) this.t;
                if (xbVar.I != z4) {
                    xbVar.I = z4;
                    v2.l.l(xbVar);
                }
                return a0.a;
            case 8:
                if (cVar instanceof fy0.g) {
                    gVar2 = (fy0.g) cVar;
                    int i35 = gVar2.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        gVar2.v = i35 - Integer.MIN_VALUE;
                        Object obj8 = gVar2.u;
                        b71.a aVar12 = b71.a.r;
                        i7 = gVar2.v;
                        if (i7 != 0) {
                            y.j(obj8);
                            y71.j jVar9 = (y71.j) this.s;
                            yx0.b bVar2 = (yx0.b) this.t;
                            yx0.y yVar2 = ((yx0.v) obj).a;
                            yx0.a0 a0Var3 = (yVar2 == null || (zVar4 = yVar2.c) == null) ? null : zVar4.b.b;
                            ArrayList S3 = (yVar2 == null || (zVar3 = yVar2.c) == null || (list2 = zVar3.b.c) == null) ? null : x61.m.S(list2);
                            x61.rShadow rVar2 = x61.rShadow.r;
                            if (a0Var3 == null || S3 == null) {
                                jVar3 = jVar9;
                                aVar3 = aVar12;
                                kVar3 = new w61.k(bVar2, rVar2);
                            } else {
                                ArrayList S4 = x61.m.S(t.e.k(bVar2));
                                int s2 = x61.xShadow.s(x61.n.F(S4, 10));
                                if (s2 < 16) {
                                    s2 = 16;
                                }
                                LinkedHashMap linkedHashMap4 = new LinkedHashMap(s2);
                                int size3 = S4.size();
                                int i36 = 0;
                                while (i36 < size3) {
                                    Object obj9 = S4.get(i36);
                                    i36++;
                                    yx0.d dVar7 = (yx0.d) obj9;
                                    String str5 = dVar7.b;
                                    linkedHashMap4.put((str5 == null || t71.p.T(str5)) ? u.q(dVar7.c.d) : dVar7.b, obj9);
                                }
                                ArrayList arrayList7 = new ArrayList();
                                ArrayList arrayList8 = new ArrayList();
                                int size4 = S3.size();
                                int i37 = 0;
                                while (i37 < size4) {
                                    Object obj10 = S3.get(i37);
                                    int i38 = i37 + 1;
                                    yx0.x xVar2 = (yx0.x) obj10;
                                    String str6 = xVar2.b;
                                    ay0.f fVar6 = xVar2.c;
                                    if (str6 == null) {
                                        arrayList2 = S3;
                                        jVar4 = jVar9;
                                        aVar4 = aVar12;
                                        i8 = size4;
                                        i9 = i38;
                                        linkedHashMap2 = linkedHashMap4;
                                        a2 = null;
                                    } else {
                                        yx0.d dVar8 = (yx0.d) linkedHashMap4.get(str6);
                                        arrayList2 = S3;
                                        yx0.d dVar9 = (yx0.d) linkedHashMap4.get(u.q(fVar6));
                                        yx0.d dVar10 = (yx0.d) linkedHashMap4.get(fVar6.b);
                                        if (dVar8 == null) {
                                            if (dVar9 != null) {
                                                arrayList7.add(new z0(str6));
                                            } else if (dVar10 != null) {
                                                dVar9 = dVar10;
                                                arrayList7.add(new z0(str6));
                                            } else {
                                                arrayList7.add(new z0(str6));
                                                no.Companion.getClass();
                                                String str7 = ((aa.q) no.c).a;
                                                i8 = size4;
                                                xr.Companion.getClass();
                                                i9 = i38;
                                                linkedHashMap2 = linkedHashMap4;
                                                jVar4 = jVar9;
                                                aVar4 = aVar12;
                                                dVar2 = new yx0.d(str7, str6, new ay0.v(str7, str6, new ay0.u(((aa.q) xr.a).a, new ay0.p(0, new ay0.o((String) null, false, false), rVar2)), fVar6));
                                            }
                                            jVar4 = jVar9;
                                            aVar4 = aVar12;
                                            i9 = i38;
                                            linkedHashMap2 = linkedHashMap4;
                                            dVar2 = dVar9;
                                            i8 = size4;
                                        } else {
                                            jVar4 = jVar9;
                                            aVar4 = aVar12;
                                            i8 = size4;
                                            i9 = i38;
                                            linkedHashMap2 = linkedHashMap4;
                                            dVar2 = dVar8;
                                        }
                                        String str8 = xVar2.b;
                                        a2 = yx0.d.a(dVar2, str8, ay0.v.a(dVar2.c, str8, (ay0.u) null, fVar6, 5), 1);
                                    }
                                    if (a2 != null) {
                                        arrayList8.add(a2);
                                    }
                                    jVar9 = jVar4;
                                    S3 = arrayList2;
                                    size4 = i8;
                                    i37 = i9;
                                    linkedHashMap4 = linkedHashMap2;
                                    aVar12 = aVar4;
                                }
                                jVar3 = jVar9;
                                aVar3 = aVar12;
                                yx0.e eVar7 = bVar2.a;
                                if (eVar7 != null) {
                                    yx0.f fVar7 = eVar7.c;
                                    if (fVar7 != null) {
                                        yx0.c cVar3 = fVar7.b;
                                        fVar2 = yx0.f.a(fVar7, yx0.c.a(cVar3, new yx0.g(a0Var3.b, a0Var3.a, cVar3.b.c), arrayList8, 1));
                                    } else {
                                        fVar2 = null;
                                    }
                                    eVar3 = yx0.e.a(eVar7, fVar2);
                                } else {
                                    eVar3 = null;
                                }
                                kVar3 = new w61.k(yx0.b.a(bVar2, eVar3), arrayList7);
                            }
                            gVar2.v = 1;
                            Object c = jVar3.c(kVar3, gVar2);
                            b71.a aVar13 = aVar3;
                            if (c == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj8);
                        }
                        return a0.a;
                    }
                }
                gVar2 = new fy0.g(this, cVar);
                Object obj82 = gVar2.u;
                b71.a aVar122 = b71.a.r;
                i7 = gVar2.v;
                if (i7 != 0) {
                }
                return a0.a;
            case 9:
                if (cVar instanceof ik.a) {
                    aVar5 = (ik.a) cVar;
                    int i39 = aVar5.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        aVar5.v = i39 - Integer.MIN_VALUE;
                        Object obj11 = aVar5.u;
                        b71.a aVar14 = b71.a.r;
                        i11 = aVar5.v;
                        if (i11 != 0) {
                            y.j(obj11);
                            y71.j jVar10 = (y71.j) this.s;
                            jk.d a3 = ((ik.b) this.t).b.a((b01.g) obj);
                            aVar5.v = 1;
                            if (jVar10.c(a3, aVar5) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj11);
                        }
                        return a0.a;
                    }
                }
                aVar5 = new ik.a(this, cVar);
                Object obj112 = aVar5.u;
                b71.a aVar142 = b71.a.r;
                i11 = aVar5.v;
                if (i11 != 0) {
                }
                return a0.a;
            case 10:
                if (cVar instanceof ik.f) {
                    fVar3 = (ik.f) cVar;
                    int i41 = fVar3.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        fVar3.v = i41 - Integer.MIN_VALUE;
                        Object obj12 = fVar3.u;
                        b71.a aVar15 = b71.a.r;
                        i12 = fVar3.v;
                        if (i12 != 0) {
                            y.j(obj12);
                            y71.j jVar11 = (y71.j) this.s;
                            jk.f a4 = ((ik.h) this.t).b.a((b01.b) obj);
                            fVar3.v = 1;
                            if (jVar11.c(a4, fVar3) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj12);
                        }
                        return a0.a;
                    }
                }
                fVar3 = new ik.f(this, cVar);
                Object obj122 = fVar3.u;
                b71.a aVar152 = b71.a.r;
                i12 = fVar3.v;
                if (i12 != 0) {
                }
                return a0.a;
            case 11:
                if (cVar instanceof ik.l) {
                    lVar = (ik.l) cVar;
                    int i42 = lVar.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        lVar.v = i42 - Integer.MIN_VALUE;
                        Object obj13 = lVar.u;
                        b71.a aVar16 = b71.a.r;
                        i13 = lVar.v;
                        if (i13 != 0) {
                            y.j(obj13);
                            y71.j jVar12 = (y71.j) this.s;
                            b01.d dVar11 = (b01.d) obj;
                            kk.c cVar4 = ((ik.n) this.t).b;
                            cVar4.getClass();
                            k71.k.g(dVar11, "serverDiscussionCategoriesPage");
                            ArrayList arrayList9 = dVar11.a;
                            ArrayList arrayList10 = new ArrayList(x61.n.F(arrayList9, 10));
                            int size5 = arrayList9.size();
                            int i43 = 0;
                            while (i43 < size5) {
                                Object obj14 = arrayList9.get(i43);
                                i43++;
                                b01.e eVar8 = (b01.e) obj14;
                                cVar4.a.getClass();
                                k71.k.g(eVar8, "serverDiscussionCategory");
                                arrayList10.add(b31.b.e0(eVar8));
                            }
                            jk.c cVar5 = new jk.c(dVar11.c, arrayList10, dVar11.b);
                            lVar.v = 1;
                            if (jVar12.c(cVar5, lVar) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj13);
                        }
                        return a0.a;
                    }
                }
                lVar = new ik.l(this, cVar);
                Object obj132 = lVar.u;
                b71.a aVar162 = b71.a.r;
                i13 = lVar.v;
                if (i13 != 0) {
                }
                return a0.a;
            case 12:
                if (cVar instanceof ik.o) {
                    oVar = (ik.o) cVar;
                    int i44 = oVar.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i44 - Integer.MIN_VALUE;
                        Object obj15 = oVar.u;
                        b71.a aVar17 = b71.a.r;
                        i14 = oVar.v;
                        if (i14 != 0) {
                            y.j(obj15);
                            y71.j jVar13 = (y71.j) this.s;
                            b01.e eVar9 = (b01.e) obj;
                            if (eVar9 != null) {
                                ((ik.p) this.t).b.getClass();
                                discussionCategoryData = b31.b.e0(eVar9);
                            } else {
                                discussionCategoryData = null;
                            }
                            oVar.v = 1;
                            if (jVar13.c(discussionCategoryData, oVar) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj15);
                        }
                        return a0.a;
                    }
                }
                oVar = new ik.o(this, cVar);
                Object obj152 = oVar.u;
                b71.a aVar172 = b71.a.r;
                i14 = oVar.v;
                if (i14 != 0) {
                }
                return a0.a;
            case 13:
                if (cVar instanceof ik.s) {
                    sVar = (ik.s) cVar;
                    int i45 = sVar.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        sVar.v = i45 - Integer.MIN_VALUE;
                        Object obj16 = sVar.u;
                        b71.a aVar18 = b71.a.r;
                        i15 = sVar.v;
                        if (i15 != 0) {
                            y.j(obj16);
                            y71.j jVar14 = (y71.j) this.s;
                            jk.f a5 = ((ik.u) this.t).b.a((b01.b) obj);
                            sVar.v = 1;
                            if (jVar14.c(a5, sVar) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj16);
                        }
                        return a0.a;
                    }
                }
                sVar = new ik.s(this, cVar);
                Object obj162 = sVar.u;
                b71.a aVar182 = b71.a.r;
                i15 = sVar.v;
                if (i15 != 0) {
                }
                return a0.a;
            case 14:
                if (cVar instanceof v) {
                    vVar = (v) cVar;
                    int i46 = vVar.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        vVar.v = i46 - Integer.MIN_VALUE;
                        Object obj17 = vVar.u;
                        b71.a aVar19 = b71.a.r;
                        i16 = vVar.v;
                        if (i16 != 0) {
                            y.j(obj17);
                            y71.j jVar15 = (y71.j) this.s;
                            ArrayList E = ((ik.x) this.t).b.E((List) obj);
                            vVar.v = 1;
                            if (jVar15.c(E, vVar) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj17);
                        }
                        return a0.a;
                    }
                }
                vVar = new v(this, cVar);
                Object obj172 = vVar.u;
                b71.a aVar192 = b71.a.r;
                i16 = vVar.v;
                if (i16 != 0) {
                }
                return a0.a;
            case 15:
                if (cVar instanceof b0) {
                    b0Var = (b0) cVar;
                    int i47 = b0Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        b0Var.v = i47 - Integer.MIN_VALUE;
                        Object obj18 = b0Var.u;
                        b71.a aVar20 = b71.a.r;
                        i17 = b0Var.v;
                        if (i17 != 0) {
                            y.j(obj18);
                            y71.j jVar16 = (y71.j) this.s;
                            b01.i iVar = (b01.i) obj;
                            kk.f fVar8 = ((ik.c0) this.t).b;
                            fVar8.getClass();
                            k71.k.g(iVar, "serviceDiscussionCommentsPage");
                            ArrayList arrayList11 = iVar.a;
                            ArrayList arrayList12 = new ArrayList(x61.n.F(arrayList11, 10));
                            int size6 = arrayList11.size();
                            int i48 = 0;
                            while (i48 < size6) {
                                Object obj19 = arrayList11.get(i48);
                                i48++;
                                arrayList12.add(fVar8.a.a((b01.g) obj19));
                            }
                            jk.e eVar10 = new jk.e(false, arrayList12, iVar.b);
                            b0Var.v = 1;
                            if (jVar16.c(eVar10, b0Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj18);
                        }
                        return a0.a;
                    }
                }
                b0Var = new b0(this, cVar);
                Object obj182 = b0Var.u;
                b71.a aVar202 = b71.a.r;
                i17 = b0Var.v;
                if (i17 != 0) {
                }
                return a0.a;
            case 16:
                if (cVar instanceof d0) {
                    d0Var = (d0) cVar;
                    int i49 = d0Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        d0Var.v = i49 - Integer.MIN_VALUE;
                        Object obj20 = d0Var.u;
                        b71.a aVar21 = b71.a.r;
                        i18 = d0Var.v;
                        if (i18 != 0) {
                            y.j(obj20);
                            y71.j jVar17 = (y71.j) this.s;
                            jk.g a6 = ((e0) this.t).b.a((b01.j) obj);
                            d0Var.v = 1;
                            if (jVar17.c(a6, d0Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj20);
                        }
                        return a0.a;
                    }
                }
                d0Var = new d0(this, cVar);
                Object obj202 = d0Var.u;
                b71.a aVar212 = b71.a.r;
                i18 = d0Var.v;
                if (i18 != 0) {
                }
                return a0.a;
            case 17:
                if (cVar instanceof f0) {
                    f0Var = (f0) cVar;
                    int i51 = f0Var.v;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        f0Var.v = i51 - Integer.MIN_VALUE;
                        Object obj21 = f0Var.u;
                        b71.a aVar22 = b71.a.r;
                        i19 = f0Var.v;
                        if (i19 != 0) {
                            y.j(obj21);
                            y71.j jVar18 = (y71.j) this.s;
                            b01.o oVar2 = (b01.o) obj;
                            e51.a aVar23 = ((g0) this.t).b;
                            k71.k.g(oVar2, "serviceDiscussionsPage");
                            String str9 = oVar2.a;
                            ArrayList arrayList13 = oVar2.b;
                            ArrayList arrayList14 = new ArrayList(x61.n.F(arrayList13, 10));
                            int size7 = arrayList13.size();
                            int i52 = 0;
                            while (i52 < size7) {
                                Object obj23 = arrayList13.get(i52);
                                i52++;
                                arrayList14.add(((kk.g) aVar23.s).a((b01.b) obj23));
                            }
                            jk.h hVar4 = new jk.h(str9, arrayList14, aVar23.E(x61.rShadow.r), oVar2.c);
                            f0Var.v = 1;
                            if (jVar18.c(hVar4, f0Var) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj21);
                        }
                        return a0.a;
                    }
                }
                f0Var = new f0(this, cVar);
                Object obj212 = f0Var.u;
                b71.a aVar222 = b71.a.r;
                i19 = f0Var.v;
                if (i19 != 0) {
                }
                return a0.a;
            case 18:
                if (cVar instanceof n0) {
                    n0Var = (n0) cVar;
                    int i53 = n0Var.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        n0Var.v = i53 - Integer.MIN_VALUE;
                        Object obj24 = n0Var.u;
                        b71.a aVar24 = b71.a.r;
                        i21 = n0Var.v;
                        if (i21 != 0) {
                            y.j(obj24);
                            y71.j jVar19 = (y71.j) this.s;
                            jk.g a7 = ((p0) this.t).b.a((b01.j) obj);
                            n0Var.v = 1;
                            if (jVar19.c(a7, n0Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj24);
                        }
                        return a0.a;
                    }
                }
                n0Var = new n0(this, cVar);
                Object obj242 = n0Var.u;
                b71.a aVar242 = b71.a.r;
                i21 = n0Var.v;
                if (i21 != 0) {
                }
                return a0.a;
            case 19:
                if (cVar instanceof q0) {
                    q0Var = (q0) cVar;
                    int i54 = q0Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        q0Var.v = i54 - Integer.MIN_VALUE;
                        Object obj25 = q0Var.u;
                        b71.a aVar25 = b71.a.r;
                        i22 = q0Var.v;
                        if (i22 != 0) {
                            y.j(obj25);
                            y71.j jVar20 = (y71.j) this.s;
                            b01.e eVar11 = (b01.e) obj;
                            ((r0) this.t).b.getClass();
                            k71.k.g(eVar11, "serverDiscussionCategory");
                            DiscussionCategoryData e0 = b31.b.e0(eVar11);
                            q0Var.v = 1;
                            if (jVar20.c(e0, q0Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj25);
                        }
                        return a0.a;
                    }
                }
                q0Var = new q0(this, cVar);
                Object obj252 = q0Var.u;
                b71.a aVar252 = b71.a.r;
                i22 = q0Var.v;
                if (i22 != 0) {
                }
                return a0.a;
            case 20:
                if (cVar instanceof ik.s0) {
                    s0Var = (ik.s0) cVar;
                    int i55 = s0Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        s0Var.v = i55 - Integer.MIN_VALUE;
                        Object obj26 = s0Var.u;
                        b71.a aVar26 = b71.a.r;
                        i23 = s0Var.v;
                        if (i23 != 0) {
                            y.j(obj26);
                            y71.j jVar21 = (y71.j) this.s;
                            jk.d a8 = ((t0) this.t).b.a((b01.g) obj);
                            s0Var.v = 1;
                            if (jVar21.c(a8, s0Var) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj26);
                        }
                        return a0.a;
                    }
                }
                s0Var = new ik.s0(this, cVar);
                Object obj262 = s0Var.u;
                b71.a aVar262 = b71.a.r;
                i23 = s0Var.v;
                if (i23 != 0) {
                }
                return a0.a;
            case 21:
                if (cVar instanceof il.l) {
                    lVar2 = (il.l) cVar;
                    int i56 = lVar2.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        lVar2.v = i56 - Integer.MIN_VALUE;
                        Object obj27 = lVar2.u;
                        b71.a aVar27 = b71.a.r;
                        i24 = lVar2.v;
                        if (i24 != 0) {
                            y.j(obj27);
                            y71.j jVar22 = (y71.j) this.s;
                            il.s sVar2 = new il.s((l01.v) this.t, (w) obj);
                            lVar2.v = 1;
                            if (jVar22.c(sVar2, lVar2) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj27);
                        }
                        return a0.a;
                    }
                }
                lVar2 = new il.l(this, cVar);
                Object obj272 = lVar2.u;
                b71.a aVar272 = b71.a.r;
                i24 = lVar2.v;
                if (i24 != 0) {
                }
                return a0.a;
            case 22:
                j0.e eVar12 = (j0.h) obj;
                ArrayList arrayList15 = (ArrayList) this.s;
                if (eVar12 instanceof j0.d) {
                    arrayList15.add(eVar12);
                } else if (eVar12 instanceof j0.e) {
                    arrayList15.remove(eVar12.a);
                }
                ((f1) this.t).setValue(Boolean.valueOf(!arrayList15.isEmpty()));
                return a0.a;
            case 23:
                return a(cVar, obj);
            case 24:
                if (cVar instanceof ma.g) {
                    gVar3 = (ma.g) cVar;
                    int i57 = gVar3.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        gVar3.v = i57 - Integer.MIN_VALUE;
                        Object obj28 = gVar3.u;
                        b71.a aVar28 = b71.a.r;
                        i25 = gVar3.v;
                        if (i25 != 0) {
                            y.j(obj28);
                            y71.j jVar23 = (y71.j) this.s;
                            na.d dVar12 = (na.d) obj;
                            if (k71.k.b(dVar12.getId(), ((aa.d) this.t).b.toString()) || dVar12.getId() == null) {
                                gVar3.v = 1;
                                if (jVar23.c(obj, gVar3) == aVar28) {
                                    return aVar28;
                                }
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj28);
                        }
                        return a0.a;
                    }
                }
                gVar3 = new ma.g(this, cVar);
                Object obj282 = gVar3.u;
                b71.a aVar282 = b71.a.r;
                i25 = gVar3.v;
                if (i25 != 0) {
                }
                return a0.a;
            case 25:
                return b(cVar, obj);
            case 26:
                return d(cVar, obj);
            case 27:
                return e(cVar, obj);
            case 28:
                return f(cVar, obj);
            default:
                if (cVar instanceof rm0.p) {
                    pVar = (rm0.p) cVar;
                    int i58 = pVar.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        pVar.v = i58 - Integer.MIN_VALUE;
                        Object obj29 = pVar.u;
                        b71.a aVar29 = b71.a.r;
                        i26 = pVar.v;
                        if (i26 != 0) {
                            y.j(obj29);
                            y71.j jVar24 = (y71.j) this.s;
                            wn.b bVar3 = ((rm0.q) this.t).u;
                            List list3 = ((p3) obj).a;
                            bVar3.getClass();
                            LinkedHashSet a9 = wn.b.a(list3);
                            pVar.v = 1;
                            if (jVar24.c(a9, pVar) == aVar29) {
                                return aVar29;
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj29);
                        }
                        return a0.a;
                    }
                }
                pVar = new rm0.p(this, cVar);
                Object obj292 = pVar.u;
                b71.a aVar292 = b71.a.r;
                i26 = pVar.v;
                if (i26 != 0) {
                }
                return a0.a;
        }
    }

    public /* synthetic */ r(y71.j jVar, Object obj, v0 v0Var, int i) {
        this.r = i;
        this.s = jVar;
        this.t = v0Var;
    }
}
