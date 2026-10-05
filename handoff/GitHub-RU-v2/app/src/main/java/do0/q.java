package do0;

import com.apollographql.apollo.exception.ApolloNetworkException;
import com.apollographql.apollo.exception.SubscriptionOperationException;
import com.github.domain.database.GitHubDatabase;
import d1.e0;
import d1.z1;
import f0.h0;
import h1.z;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import k71.u;
import k71.w;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import l01.l0;
import l01.s0;
import m7.f0;
import s0.o0;
import sy.d0;
import sy.y;
import v71.a0;
import v71.b0;
import v71.d1;
import y71.y1;
import z71.x;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;

    public /* synthetic */ q(Serializable serializable, Object obj, Serializable serializable2, Object obj2, int i) {
        this.r = i;
        this.t = serializable;
        this.s = obj;
        this.u = serializable2;
        this.v = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(y71.i iVar, a71.c cVar) {
        z71.e eVar;
        int i;
        q qVar;
        if (cVar instanceof z71.e) {
            eVar = (z71.e) cVar;
            int i2 = eVar.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.y = i2 - Integer.MIN_VALUE;
                Object obj = eVar.w;
                b71.a aVar = b71.a.r;
                i = eVar.y;
                if (i != 0) {
                    y.j(obj);
                    d1 d1Var = (d1) this.s;
                    if (d1Var != null && !d1Var.f()) {
                        throw d1Var.N();
                    }
                    e81.i iVar2 = (e81.i) this.t;
                    eVar.u = this;
                    eVar.v = iVar;
                    eVar.y = 1;
                    if (iVar2.a(eVar) == aVar) {
                        return aVar;
                    }
                    qVar = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iVar = eVar.v;
                    qVar = eVar.u;
                    y.j(obj);
                }
                b0.z((x71.t) qVar.u, (a71.h) null, (a0) null, new yl.b(iVar, (x) qVar.v, (e81.i) qVar.t, (a71.c) null, 3), 3);
                return w61.a0.a;
            }
        }
        eVar = new z71.e(this, cVar);
        Object obj2 = eVar.w;
        b71.a aVar2 = b71.a.r;
        i = eVar.y;
        if (i != 0) {
        }
        b0.z((x71.t) qVar.u, (a71.h) null, (a0) null, new yl.b(iVar, (x) qVar.v, (e81.i) qVar.t, (a71.c) null, 3), 3);
        return w61.a0.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r1.c(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009a, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (r1.c(r15, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(int[] iArr, a71.c cVar) {
        f0 f0Var;
        int i;
        String[] strArr = (String[]) this.u;
        y71.j jVar = (y71.j) this.s;
        w wVar = (w) this.t;
        if (cVar instanceof f0) {
            f0Var = (f0) cVar;
            int i2 = f0Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0Var.x = i2 - Integer.MIN_VALUE;
                Object obj = f0Var.v;
                b71.a aVar = b71.a.r;
                i = f0Var.x;
                if (i != 0) {
                    y.j(obj);
                    if (wVar.r == null) {
                        Set j0 = x61.l.j0(strArr);
                        f0Var.u = iArr;
                        f0Var.x = 1;
                    } else {
                        int[] iArr2 = (int[]) this.v;
                        ArrayList arrayList = new ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            String str = strArr[i3];
                            int i5 = i4 + 1;
                            Object obj2 = wVar.r;
                            if (obj2 == null) {
                                throw new IllegalStateException("Required value was null.");
                            }
                            int i6 = iArr2[i4];
                            if (((int[]) obj2)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            Set K0 = x61.m.K0(arrayList);
                            f0Var.u = iArr;
                            f0Var.x = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    iArr = f0Var.u;
                    y.j(obj);
                }
                wVar.r = iArr;
                return w61.a0.a;
            }
        }
        f0Var = new f0(this, cVar);
        Object obj3 = f0Var.v;
        b71.a aVar2 = b71.a.r;
        i = f0Var.x;
        if (i != 0) {
        }
        wVar.r = iArr;
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:374:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0730  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        p pVar;
        b71.a aVar;
        int i;
        y71.j jVar;
        qn0.e eVar;
        int i2;
        y71.j jVar2;
        int i3;
        qn0.h hVar;
        qn0.m mVar;
        dp.k kVar;
        b71.a aVar2;
        int i4;
        y71.j jVar3;
        qo.e eVar2;
        int i5;
        y71.j jVar4;
        int i6;
        qo.h hVar2;
        qo.m mVar2;
        ed0.i iVar;
        b71.a aVar3;
        int i7;
        y71.j jVar5;
        rc0.e eVar3;
        int i8;
        y71.j jVar6;
        int i9;
        rc0.h hVar3;
        rc0.m mVar3;
        il.o oVar;
        int i10;
        Object obj2;
        la.e eVar4;
        int i12;
        ma.i iVar2;
        int i13;
        aa.f c;
        o20.i iVar3;
        b71.a aVar4;
        int i14;
        y71.j jVar7;
        b20.e eVar5;
        int i15;
        y71.j jVar8;
        int i16;
        b20.h hVar4;
        b20.m mVar4;
        um.m mVar5;
        b71.a aVar5;
        int i17;
        w61.a0 a0Var;
        y71.j jVar9;
        int i18;
        xk.i iVar4;
        b71.a aVar6;
        int i19;
        w61.a0 a0Var2;
        y71.j jVar10;
        int i20;
        z71.j jVar11;
        int i22;
        q qVar;
        switch (this.r) {
            case 0:
                if (cVar instanceof p) {
                    pVar = (p) cVar;
                    int i23 = pVar.v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        pVar.v = i23 - Integer.MIN_VALUE;
                        Object obj3 = pVar.u;
                        aVar = b71.a.r;
                        i = pVar.v;
                        if (i != 0) {
                            y.j(obj3);
                            jVar = (y71.j) this.s;
                            eVar = (qn0.e) obj;
                            qn0.g gVar = eVar.a;
                            i2 = 0;
                            if (((gVar == null || (hVar = gVar.c) == null || (mVar = hVar.c) == null) ? 0 : mVar.a) < ((u) this.t).r) {
                                eVar = null;
                                pVar.x = null;
                                pVar.y = null;
                                pVar.z = i2;
                                pVar.v = 2;
                                if (jVar.c(eVar, pVar) == aVar) {
                                    return aVar;
                                }
                                return w61.a0.a;
                            }
                            com.github.service.wrapper.b bVar = ((t) this.u).t;
                            qn0.p pVar2 = (qn0.p) this.v;
                            pVar.x = jVar;
                            pVar.y = eVar;
                            pVar.z = 0;
                            pVar.v = 1;
                            if (bVar.j(pVar2, eVar, pVar) == aVar) {
                                return aVar;
                            }
                            jVar2 = jVar;
                            i3 = 0;
                        } else {
                            if (i != 1) {
                                if (i != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj3);
                                return w61.a0.a;
                            }
                            i3 = pVar.z;
                            eVar = pVar.y;
                            jVar2 = pVar.x;
                            y.j(obj3);
                        }
                        i2 = i3;
                        jVar = jVar2;
                        pVar.x = null;
                        pVar.y = null;
                        pVar.z = i2;
                        pVar.v = 2;
                        if (jVar.c(eVar, pVar) == aVar) {
                        }
                        return w61.a0.a;
                    }
                }
                pVar = new p(this, cVar);
                Object obj32 = pVar.u;
                aVar = b71.a.r;
                i = pVar.v;
                if (i != 0) {
                }
                i2 = i3;
                jVar = jVar2;
                pVar.x = null;
                pVar.y = null;
                pVar.z = i2;
                pVar.v = 2;
                if (jVar.c(eVar, pVar) == aVar) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof dp.k) {
                    kVar = (dp.k) cVar;
                    int i24 = kVar.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        kVar.v = i24 - Integer.MIN_VALUE;
                        Object obj4 = kVar.u;
                        aVar2 = b71.a.r;
                        i4 = kVar.v;
                        if (i4 != 0) {
                            y.j(obj4);
                            jVar3 = (y71.j) this.s;
                            eVar2 = (qo.e) obj;
                            qo.g gVar2 = eVar2.a;
                            i5 = 0;
                            if (((gVar2 == null || (hVar2 = gVar2.c) == null || (mVar2 = hVar2.c) == null) ? 0 : mVar2.a) < ((u) this.t).r) {
                                eVar2 = null;
                                kVar.x = null;
                                kVar.y = null;
                                kVar.z = i5;
                                kVar.v = 2;
                                if (jVar3.c(eVar2, kVar) == aVar2) {
                                    return aVar2;
                                }
                                return w61.a0.a;
                            }
                            com.github.service.wrapper.b bVar2 = ((t) this.u).t;
                            qo.p pVar3 = (qo.p) this.v;
                            kVar.x = jVar3;
                            kVar.y = eVar2;
                            kVar.z = 0;
                            kVar.v = 1;
                            if (bVar2.j(pVar3, eVar2, kVar) == aVar2) {
                                return aVar2;
                            }
                            jVar4 = jVar3;
                            i6 = 0;
                        } else {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj4);
                                return w61.a0.a;
                            }
                            i6 = kVar.z;
                            eVar2 = kVar.y;
                            jVar4 = kVar.x;
                            y.j(obj4);
                        }
                        i5 = i6;
                        jVar3 = jVar4;
                        kVar.x = null;
                        kVar.y = null;
                        kVar.z = i5;
                        kVar.v = 2;
                        if (jVar3.c(eVar2, kVar) == aVar2) {
                        }
                        return w61.a0.a;
                    }
                }
                kVar = new dp.k(this, cVar);
                Object obj42 = kVar.u;
                aVar2 = b71.a.r;
                i4 = kVar.v;
                if (i4 != 0) {
                }
                i5 = i6;
                jVar3 = jVar4;
                kVar.x = null;
                kVar.y = null;
                kVar.z = i5;
                kVar.v = 2;
                if (jVar3.c(eVar2, kVar) == aVar2) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof ed0.i) {
                    iVar = (ed0.i) cVar;
                    int i25 = iVar.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        iVar.v = i25 - Integer.MIN_VALUE;
                        Object obj5 = iVar.u;
                        aVar3 = b71.a.r;
                        i7 = iVar.v;
                        if (i7 != 0) {
                            y.j(obj5);
                            jVar5 = (y71.j) this.s;
                            eVar3 = (rc0.e) obj;
                            rc0.g gVar3 = eVar3.a;
                            i8 = 0;
                            if (((gVar3 == null || (hVar3 = gVar3.c) == null || (mVar3 = hVar3.c) == null) ? 0 : mVar3.a) < ((u) this.t).r) {
                                eVar3 = null;
                                iVar.x = null;
                                iVar.y = null;
                                iVar.z = i8;
                                iVar.v = 2;
                                if (jVar5.c(eVar3, iVar) == aVar3) {
                                    return aVar3;
                                }
                                return w61.a0.a;
                            }
                            com.github.service.wrapper.b bVar3 = ((t) this.u).t;
                            rc0.p pVar4 = (rc0.p) this.v;
                            iVar.x = jVar5;
                            iVar.y = eVar3;
                            iVar.z = 0;
                            iVar.v = 1;
                            if (bVar3.j(pVar4, eVar3, iVar) == aVar3) {
                                return aVar3;
                            }
                            jVar6 = jVar5;
                            i9 = 0;
                        } else {
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj5);
                                return w61.a0.a;
                            }
                            i9 = iVar.z;
                            eVar3 = iVar.y;
                            jVar6 = iVar.x;
                            y.j(obj5);
                        }
                        i8 = i9;
                        jVar5 = jVar6;
                        iVar.x = null;
                        iVar.y = null;
                        iVar.z = i8;
                        iVar.v = 2;
                        if (jVar5.c(eVar3, iVar) == aVar3) {
                        }
                        return w61.a0.a;
                    }
                }
                iVar = new ed0.i(this, cVar);
                Object obj52 = iVar.u;
                aVar3 = b71.a.r;
                i7 = iVar.v;
                if (i7 != 0) {
                }
                i8 = i9;
                jVar5 = jVar6;
                iVar.x = null;
                iVar.y = null;
                iVar.z = i8;
                iVar.v = 2;
                if (jVar5.c(eVar3, iVar) == aVar3) {
                }
                return w61.a0.a;
            case 3:
                j0.h hVar5 = (j0.h) obj;
                u uVar = (u) this.u;
                u uVar2 = (u) this.s;
                u uVar3 = (u) this.t;
                boolean z = true;
                if (hVar5 instanceof j0.l) {
                    uVar3.r++;
                } else if (hVar5 instanceof j0.m) {
                    uVar3.r--;
                } else if (hVar5 instanceof j0.k) {
                    uVar3.r--;
                } else if (hVar5 instanceof j0.f) {
                    uVar2.r++;
                } else if (hVar5 instanceof j0.g) {
                    uVar2.r--;
                } else if (hVar5 instanceof j0.d) {
                    uVar.r++;
                } else if (hVar5 instanceof j0.e) {
                    uVar.r--;
                }
                int i26 = uVar3.r;
                boolean z2 = false;
                boolean z3 = i26 > 0;
                boolean z4 = uVar2.r > 0;
                boolean z5 = uVar.r > 0;
                h0 h0Var = (h0) this.v;
                if (h0Var.G != z3) {
                    h0Var.G = z3;
                    z2 = true;
                }
                if (h0Var.H != z4) {
                    h0Var.H = z4;
                    z2 = true;
                }
                if (h0Var.I != z5) {
                    h0Var.I = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    v2.l.k(h0Var);
                }
                return w61.a0.a;
            case 4:
                ((Number) obj).intValue();
                m0.o oVar2 = ((m0.s) this.s).e;
                int y = oVar2.b.y() / 12;
                int y2 = (oVar2.b.y() % 12) + 1;
                j71.c cVar2 = (j71.c) this.t;
                h1.b0 b0Var = (z) this.u;
                int i27 = ((q71.e) ((q71.g) this.v)).r + y;
                h1.b0 b0Var2 = b0Var;
                b0Var2.getClass();
                cVar2.k(new Long(b0Var2.e(LocalDate.of(i27, y2, 1)).e));
                return w61.a0.a;
            case 5:
                if (cVar instanceof il.o) {
                    oVar = (il.o) cVar;
                    int i28 = oVar.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i28 - Integer.MIN_VALUE;
                        Object obj6 = oVar.u;
                        b71.a aVar7 = b71.a.r;
                        i10 = oVar.v;
                        if (i10 != 0) {
                            y.j(obj6);
                            y71.j jVar12 = (y71.j) this.s;
                            s0 s0Var = (s0) obj;
                            String str = (String) this.t;
                            int i29 = 0;
                            Object obj7 = null;
                            if (t71.p.T(str)) {
                                ArrayList arrayList = s0Var.b;
                                int size = arrayList.size();
                                int i30 = 0;
                                while (true) {
                                    if (i30 < size) {
                                        obj2 = arrayList.get(i30);
                                        i30++;
                                        int i32 = ((l0) obj2).v;
                                        Integer num = (Integer) this.v;
                                        if (num != null && i32 == num.intValue()) {
                                        }
                                    } else {
                                        obj2 = null;
                                    }
                                }
                                l0 l0Var = (l0) obj2;
                                if (l0Var == null || (str = l0Var.r) == null) {
                                    str = s0Var.a.r;
                                }
                            }
                            ((y1) this.u).j(str);
                            ArrayList arrayList2 = s0Var.b;
                            int size2 = arrayList2.size();
                            while (true) {
                                if (i29 < size2) {
                                    Object obj8 = arrayList2.get(i29);
                                    i29++;
                                    if (k71.k.b(((l0) obj8).r, str)) {
                                        obj7 = obj8;
                                    }
                                }
                            }
                            l0 l0Var2 = (l0) obj7;
                            if (l0Var2 == null) {
                                l0Var2 = s0Var.a;
                            }
                            w61.k kVar2 = new w61.k(s0Var, l0Var2);
                            oVar.v = 1;
                            if (jVar12.c(kVar2, oVar) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                oVar = new il.o(this, cVar);
                Object obj62 = oVar.u;
                b71.a aVar72 = b71.a.r;
                i10 = oVar.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 6:
                w wVar = (w) this.v;
                if (cVar instanceof la.e) {
                    eVar4 = (la.e) cVar;
                    int i33 = eVar4.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eVar4.v = i33 - Integer.MIN_VALUE;
                        Object obj9 = eVar4.u;
                        b71.a aVar8 = b71.a.r;
                        i12 = eVar4.v;
                        if (i12 != 0) {
                            y.j(obj9);
                            y71.j jVar13 = (y71.j) this.s;
                            h91.j jVar14 = (h91.j) obj;
                            if (wVar.r == null) {
                                wVar.r = new com.apollographql.apollo.internal.a();
                            }
                            com.apollographql.apollo.internal.a aVar9 = (com.apollographql.apollo.internal.a) wVar.r;
                            aVar9.getClass();
                            k71.k.g(jVar14, "payload");
                            Object Q = m71.a.Q(new ea.b(jVar14));
                            k71.k.e(Q, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                            LinkedHashMap b = aVar9.b((Map) Q);
                            com.apollographql.apollo.internal.a aVar10 = (com.apollographql.apollo.internal.a) wVar.r;
                            LinkedHashSet linkedHashSet = aVar10.d;
                            boolean z6 = !aVar10.e;
                            aa.f fVar = null;
                            if (!aVar10.f) {
                                aa.e a = y9.a.D(new ea.g(b), (aa.s0) this.t, (UUID) null, (aa.w) this.u, linkedHashSet).a();
                                a.a = z6;
                                fVar = a.d();
                            }
                            if (fVar != null) {
                                eVar4.v = 1;
                                if (jVar13.c(fVar, eVar4) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                eVar4 = new la.e(this, cVar);
                Object obj92 = eVar4.u;
                b71.a aVar82 = b71.a.r;
                i12 = eVar4.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 7:
                return b((int[]) obj, cVar);
            case 8:
                ma.k kVar3 = (ma.k) this.v;
                com.apollographql.apollo.internal.a aVar11 = (com.apollographql.apollo.internal.a) this.u;
                aa.d dVar = (aa.d) this.t;
                if (cVar instanceof ma.i) {
                    iVar2 = (ma.i) cVar;
                    int i34 = iVar2.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        iVar2.v = i34 - Integer.MIN_VALUE;
                        Object obj10 = iVar2.u;
                        b71.a aVar12 = b71.a.r;
                        i13 = iVar2.v;
                        if (i13 != 0) {
                            y.j(obj10);
                            y71.j jVar15 = (y71.j) this.s;
                            na.j jVar16 = (na.d) obj;
                            if (jVar16 instanceof na.j) {
                                Map map = jVar16.b;
                                aa.w a2 = dVar.c.a(aa.w.d);
                                k71.k.d(a2);
                                aa.w wVar2 = a2;
                                w61.k kVar4 = map.keySet().contains("hasNext") ? new w61.k(aVar11.b(map), aVar11.d) : new w61.k(map, null);
                                Map map2 = (Map) kVar4.r;
                                Set set = (Set) kVar4.s;
                                k71.k.g(map2, "<this>");
                                c = y9.a.D(new ea.g(map2), dVar.a, dVar.b, wVar2, set);
                                if (!aVar11.e) {
                                    aVar11.a.clear();
                                    aVar11.c.clear();
                                    aVar11.e = true;
                                    aVar11.f = false;
                                }
                            } else if (jVar16 instanceof na.i) {
                                c = ma.k.c(kVar3, dVar, new SubscriptionOperationException("Operation error ".concat(dVar.a.name()), null));
                            } else {
                                if (!(jVar16 instanceof na.g)) {
                                    if (!(jVar16 instanceof na.b) && !(jVar16 instanceof na.h) && !(jVar16 instanceof na.e)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    throw new IllegalStateException(("Unexpected event " + jVar16).toString());
                                }
                                c = ma.k.c(kVar3, dVar, new ApolloNetworkException(((na.g) jVar16).a, "Network error while executing ".concat(dVar.a.name())));
                            }
                            iVar2.v = 1;
                            if (jVar15.c(c, iVar2) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                iVar2 = new ma.i(this, cVar);
                Object obj102 = iVar2.u;
                b71.a aVar122 = b71.a.r;
                i13 = iVar2.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof o20.i) {
                    iVar3 = (o20.i) cVar;
                    int i35 = iVar3.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        iVar3.v = i35 - Integer.MIN_VALUE;
                        Object obj11 = iVar3.u;
                        aVar4 = b71.a.r;
                        i14 = iVar3.v;
                        if (i14 != 0) {
                            y.j(obj11);
                            jVar7 = (y71.j) this.s;
                            eVar5 = (b20.e) obj;
                            b20.g gVar4 = eVar5.a;
                            i15 = 0;
                            if (((gVar4 == null || (hVar4 = gVar4.c) == null || (mVar4 = hVar4.c) == null) ? 0 : mVar4.a) < ((u) this.t).r) {
                                eVar5 = null;
                                iVar3.x = null;
                                iVar3.y = null;
                                iVar3.z = i15;
                                iVar3.v = 2;
                                if (jVar7.c(eVar5, iVar3) == aVar4) {
                                    return aVar4;
                                }
                                return w61.a0.a;
                            }
                            com.github.service.wrapper.b bVar4 = ((t) this.u).t;
                            b20.p pVar5 = (b20.p) this.v;
                            iVar3.x = jVar7;
                            iVar3.y = eVar5;
                            iVar3.z = 0;
                            iVar3.v = 1;
                            if (bVar4.j(pVar5, eVar5, iVar3) == aVar4) {
                                return aVar4;
                            }
                            jVar8 = jVar7;
                            i16 = 0;
                        } else {
                            if (i14 != 1) {
                                if (i14 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj11);
                                return w61.a0.a;
                            }
                            i16 = iVar3.z;
                            eVar5 = iVar3.y;
                            jVar8 = iVar3.x;
                            y.j(obj11);
                        }
                        i15 = i16;
                        jVar7 = jVar8;
                        iVar3.x = null;
                        iVar3.y = null;
                        iVar3.z = i15;
                        iVar3.v = 2;
                        if (jVar7.c(eVar5, iVar3) == aVar4) {
                        }
                        return w61.a0.a;
                    }
                }
                iVar3 = new o20.i(this, cVar);
                Object obj112 = iVar3.u;
                aVar4 = b71.a.r;
                i14 = iVar3.v;
                if (i14 != 0) {
                }
                i15 = i16;
                jVar7 = jVar8;
                iVar3.x = null;
                iVar3.y = null;
                iVar3.z = i15;
                iVar3.v = 2;
                if (jVar7.c(eVar5, iVar3) == aVar4) {
                }
                return w61.a0.a;
            case 10:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                z1 z1Var = (z1) this.u;
                o0 o0Var = (o0) this.s;
                if (booleanValue && o0Var.b()) {
                    s0.s.B((l3.w) this.t, o0Var, z1Var.n(), (l3.j) this.v, z1Var.b);
                } else {
                    s0.s.s(o0Var);
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof um.m) {
                    mVar5 = (um.m) cVar;
                    int i36 = mVar5.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        mVar5.v = i36 - Integer.MIN_VALUE;
                        Object obj12 = mVar5.u;
                        aVar5 = b71.a.r;
                        i17 = mVar5.v;
                        a0Var = w61.a0.a;
                        if (i17 != 0) {
                            y.j(obj12);
                            jVar9 = (y71.j) this.s;
                            um.s sVar = ((um.r) this.t).a;
                            oa.j jVar17 = (oa.j) this.u;
                            List n = d0.n((String) this.v);
                            mVar5.x = jVar9;
                            mVar5.y = 0;
                            mVar5.v = 1;
                            ek.d F = ((GitHubDatabase) sVar.a.a(jVar17)).F();
                            String[] strArr = (String[]) n.toArray(new String[0]);
                            String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
                            F.getClass();
                            StringBuilder sb = new StringBuilder();
                            sb.append("DELETE FROM shortcuts WHERE id IN (");
                            aa1.b.c(strArr2.length, sb);
                            sb.append(")");
                            String sb2 = sb.toString();
                            k71.k.f(sb2, "toString(...)");
                            Object M = m71.a.M(mVar5, F.a, false, true, new e0(16, sb2, strArr2));
                            if (M != aVar5) {
                                M = a0Var;
                            }
                            if (M != aVar5) {
                                M = a0Var;
                            }
                            if (M == aVar5) {
                                return aVar5;
                            }
                            i18 = 0;
                        } else {
                            if (i17 != 1) {
                                if (i17 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj12);
                                return a0Var;
                            }
                            i18 = mVar5.y;
                            jVar9 = mVar5.x;
                            y.j(obj12);
                        }
                        mVar5.x = null;
                        mVar5.y = i18;
                        mVar5.v = 2;
                        if (jVar9.c(a0Var, mVar5) == aVar5) {
                            return aVar5;
                        }
                        return a0Var;
                    }
                }
                mVar5 = new um.m(this, cVar);
                Object obj122 = mVar5.u;
                aVar5 = b71.a.r;
                i17 = mVar5.v;
                a0Var = w61.a0.a;
                if (i17 != 0) {
                }
                mVar5.x = null;
                mVar5.y = i18;
                mVar5.v = 2;
                if (jVar9.c(a0Var, mVar5) == aVar5) {
                }
                return a0Var;
            case 12:
                if (cVar instanceof xk.i) {
                    iVar4 = (xk.i) cVar;
                    int i37 = iVar4.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        iVar4.v = i37 - Integer.MIN_VALUE;
                        Object obj13 = iVar4.u;
                        aVar6 = b71.a.r;
                        i19 = iVar4.v;
                        a0Var2 = w61.a0.a;
                        if (i19 != 0) {
                            y.j(obj13);
                            jVar10 = (y71.j) this.s;
                            xk.l lVar = ((xk.j) this.t).a;
                            oa.j jVar18 = (oa.j) this.u;
                            List list = (List) this.v;
                            iVar4.x = jVar10;
                            iVar4.y = 0;
                            iVar4.v = 1;
                            m7.w wVar3 = (m7.w) lVar.a.a(jVar18);
                            Object O = y9.a.O(wVar3, new a10.b(wVar3, new nm.j(lVar, jVar18, list, (a71.c) null), (a71.c) null), iVar4);
                            if (O != aVar6) {
                                O = a0Var2;
                            }
                            if (O == aVar6) {
                                return aVar6;
                            }
                            i20 = 0;
                        } else {
                            if (i19 != 1) {
                                if (i19 != 2) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                y.j(obj13);
                                return a0Var2;
                            }
                            i20 = iVar4.y;
                            jVar10 = iVar4.x;
                            y.j(obj13);
                        }
                        iVar4.x = null;
                        iVar4.y = i20;
                        iVar4.v = 2;
                        if (jVar10.c(a0Var2, iVar4) == aVar6) {
                            return aVar6;
                        }
                        return a0Var2;
                    }
                }
                iVar4 = new xk.i(this, cVar);
                Object obj132 = iVar4.u;
                aVar6 = b71.a.r;
                i19 = iVar4.v;
                a0Var2 = w61.a0.a;
                if (i19 != 0) {
                }
                iVar4.x = null;
                iVar4.y = i20;
                iVar4.v = 2;
                if (jVar10.c(a0Var2, iVar4) == aVar6) {
                }
                return a0Var2;
            case 13:
                return a((y71.i) obj, cVar);
            default:
                if (cVar instanceof z71.j) {
                    jVar11 = (z71.j) cVar;
                    int i38 = jVar11.y;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        jVar11.y = i38 - Integer.MIN_VALUE;
                        Object obj14 = jVar11.w;
                        b71.a aVar13 = b71.a.r;
                        i22 = jVar11.y;
                        if (i22 != 0) {
                            y.j(obj14);
                            d1 d1Var = (d1) ((w) this.t).r;
                            if (d1Var != null) {
                                d1Var.m(new ChildCancelledException());
                                jVar11.u = this;
                                jVar11.v = obj;
                                jVar11.y = 1;
                                if (d1Var.O(jVar11) == aVar13) {
                                    return aVar13;
                                }
                            }
                            qVar = this;
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = jVar11.v;
                            qVar = jVar11.u;
                            y.j(obj14);
                        }
                        ((w) qVar.t).r = b0.z((v71.z) qVar.u, (a71.h) null, a0.u, new z71.i((z71.k) qVar.v, (y71.j) qVar.s, obj, (a71.c) null), 1);
                        return w61.a0.a;
                    }
                }
                jVar11 = new z71.j(this, cVar);
                Object obj142 = jVar11.w;
                b71.a aVar132 = b71.a.r;
                i22 = jVar11.y;
                if (i22 != 0) {
                }
                ((w) qVar.t).r = b0.z((v71.z) qVar.u, (a71.h) null, a0.u, new z71.i((z71.k) qVar.v, (y71.j) qVar.s, obj, (a71.c) null), 1);
                return w61.a0.a;
        }
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
    }

    public q(w wVar, v71.z zVar, z71.k kVar, y71.j jVar) {
        this.r = 14;
        this.t = wVar;
        this.u = zVar;
        this.v = kVar;
        this.s = jVar;
    }

    public q(y71.j jVar, aa.s0 s0Var, aa.w wVar, e1.g gVar, w wVar2) {
        this.r = 6;
        this.s = jVar;
        this.t = s0Var;
        this.u = wVar;
        this.v = wVar2;
    }
}
