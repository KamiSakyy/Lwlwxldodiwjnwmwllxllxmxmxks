package fp;

import com.apollographql.apollo.exception.CacheMissException;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kc0.fs;
import kc0.gs;
import kc0.hs;
import kc0.m60;
import kc0.q4;
import kc0.r6;
import kc0.s4;
import kc0.s6;
import kc0.t4;
import kc0.t6;
import yz0.w7;
import yz0.x7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ m(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        in.p pVar;
        int i;
        if (cVar instanceof in.p) {
            pVar = (in.p) cVar;
            int i2 = pVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = pVar.u;
                b71.a aVar = b71.a.r;
                i = pVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Object obj3 = ((in.p0) obj).a;
                    pVar.v = 1;
                    if (this.s.c(obj3, pVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        pVar = new in.p(this, cVar);
        Object obj22 = pVar.u;
        b71.a aVar2 = b71.a.r;
        i = pVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:431:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x06b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x071c  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x0729  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x07d0  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0874  */
    /* JADX WARN: Removed duplicated region for block: B:668:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x08bf  */
    /* JADX WARN: Removed duplicated region for block: B:695:0x08cb  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0936  */
    /* JADX WARN: Removed duplicated region for block: B:726:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0131  */
    /* JADX WARN: Type inference failed for: r1v65, types: [java.lang.Iterable, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l lVar;
        int i;
        e eVar;
        n nVar;
        int i2;
        fy0.c cVar2;
        int i3;
        yx0.n nVar2;
        yx0.k kVar;
        fy0.d dVar;
        int i4;
        iy0.k0 k0Var;
        iy0.e0 e0Var;
        fy0.e eVar2;
        int i5;
        gy0.t tVar;
        fy0.f fVar;
        int i6;
        gy0.b0 b0Var;
        gy0.g0 g0Var;
        List list;
        gy0.d0 d0Var;
        List list2;
        g1.a aVar;
        int i7;
        gl.e eVar3;
        int i8;
        go0.j jVar;
        int i9;
        go0.r rVar;
        int i11;
        go0.v vVar;
        int i12;
        go0.w wVar;
        int i13;
        go0.x xVar;
        int i14;
        h9.h hVar;
        int i15;
        hd0.g gVar;
        int i16;
        hd0.l lVar2;
        int i17;
        hd0.o oVar;
        int i18;
        hd0.p pVar;
        int i19;
        hd0.q qVar;
        int i21;
        hl0.a aVar2;
        int i22;
        t4 t4Var;
        hl0.b bVar;
        int i23;
        t6 t6Var;
        t6 t6Var2;
        t6 t6Var3;
        hl0.d dVar2;
        int i24;
        gs gsVar;
        hl0.e eVar4;
        int i25;
        il.n nVar3;
        int i26;
        in.i iVar;
        int i27;
        in.j jVar2;
        int i28;
        in.k kVar2;
        int i29;
        in.m mVar;
        int i31;
        in.q qVar2;
        int i32;
        int i33 = this.r;
        x7<gy0.s> x7Var = x61.rShadow.r;
        x7 x7Var2 = null;
        y71.j jVar3 = this.s;
        w61.a0 a0Var = w61.a0.a;
        switch (i33) {
            case 0:
                if (cVar instanceof l) {
                    lVar = (l) cVar;
                    int i34 = lVar.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        lVar.v = i34 - Integer.MIN_VALUE;
                        Object obj2 = lVar.u;
                        b71.a aVar3 = b71.a.r;
                        i = lVar.v;
                        if (i == 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                            return a0Var;
                        }
                        sy.y.j(obj2);
                        d dVar3 = ((c) obj).a;
                        if (dVar3 != null && (eVar = dVar3.c) != null) {
                            x7Var2 = k41.b.U(eVar.b);
                        }
                        if (x7Var2 == null) {
                            return a0Var;
                        }
                        lVar.v = 1;
                        return jVar3.c(x7Var2, lVar) == aVar3 ? aVar3 : a0Var;
                    }
                }
                lVar = new l(this, cVar);
                Object obj22 = lVar.u;
                b71.a aVar32 = b71.a.r;
                i = lVar.v;
                if (i == 0) {
                }
                break;
            case 1:
                if (cVar instanceof n) {
                    nVar = (n) cVar;
                    int i35 = nVar.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        nVar.v = i35 - Integer.MIN_VALUE;
                        Object obj3 = nVar.u;
                        b71.a aVar4 = b71.a.r;
                        i2 = nVar.v;
                        if (i2 == 0) {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                            return a0Var;
                        }
                        sy.y.j(obj3);
                        l0 l0Var = ((j0) obj).a.a;
                        if (l0Var != null) {
                            hp.y yVar = l0Var.c;
                            String str = yVar.a;
                            String str2 = yVar.b;
                            on.c Z = k41.b.Z(yVar.c);
                            ZonedDateTime zonedDateTime = yVar.d;
                            ZonedDateTime zonedDateTime2 = yVar.e;
                            ZonedDateTime zonedDateTime3 = yVar.f;
                            hp.xShadow xVar2 = yVar.g;
                            if (xVar2 != null) {
                                hp.w wVar2 = xVar2.b;
                                if ((wVar2 != null ? wVar2.c : null) != null) {
                                    x7Var2 = k41.b.U(wVar2.c);
                                }
                            }
                            x7Var2 = new on.a(str, str2, Z, zonedDateTime, zonedDateTime2, zonedDateTime3, x7Var2);
                        }
                        if (x7Var2 == null) {
                            return a0Var;
                        }
                        nVar.v = 1;
                        return jVar3.c(x7Var2, nVar) == aVar4 ? aVar4 : a0Var;
                    }
                }
                nVar = new n(this, cVar);
                Object obj32 = nVar.u;
                b71.a aVar42 = b71.a.r;
                i2 = nVar.v;
                if (i2 == 0) {
                }
            case 2:
                if (cVar instanceof fy0.c) {
                    cVar2 = (fy0.c) cVar;
                    int i36 = cVar2.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i36 - Integer.MIN_VALUE;
                        Object obj4 = cVar2.u;
                        b71.a aVar5 = b71.a.r;
                        i3 = cVar2.v;
                        if (i3 == 0) {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                            return a0Var;
                        }
                        sy.y.j(obj4);
                        yx0.m mVar2 = ((yx0.j) obj).a;
                        if (mVar2 != null && (nVar2 = mVar2.c) != null && (kVar = nVar2.b) != null) {
                            x7Var2 = kVar.b.b;
                        }
                        if (x7Var2 == null) {
                            return a0Var;
                        }
                        cVar2.v = 1;
                        return jVar3.c(x7Var2, cVar2) == aVar5 ? aVar5 : a0Var;
                    }
                }
                cVar2 = new fy0.c(this, cVar);
                Object obj42 = cVar2.u;
                b71.a aVar52 = b71.a.r;
                i3 = cVar2.v;
                if (i3 == 0) {
                }
                break;
            case 3:
                if (cVar instanceof fy0.d) {
                    dVar = (fy0.d) cVar;
                    int i37 = dVar.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i37 - Integer.MIN_VALUE;
                        Object obj5 = dVar.u;
                        b71.a aVar6 = b71.a.r;
                        i4 = dVar.v;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                            return a0Var;
                        }
                        sy.y.j(obj5);
                        gy0.n nVar4 = ((gy0.m) obj).a;
                        if (nVar4 != null && (e0Var = nVar4.c) != null) {
                            List<iy0.c0> list3 = e0Var.c.a;
                            if (list3 != null) {
                                x7 arrayList = new ArrayList();
                                for (iy0.c0 c0Var : list3) {
                                    l01.w0 Q = c0Var != null ? v8.l0.Q(c0Var.c) : null;
                                    if (Q != null) {
                                        arrayList.add(Q);
                                    }
                                }
                                x7Var2 = arrayList;
                            }
                            if (x7Var2 != null) {
                                x7Var = x7Var2;
                            }
                            x7Var2 = new l01.w(x7Var);
                        } else if (nVar4 != null && (k0Var = nVar4.d) != null) {
                            List<iy0.i0> list4 = k0Var.c.a;
                            if (list4 != null) {
                                x7Var = new ArrayList();
                                for (iy0.i0 i0Var : list4) {
                                    l01.w0 Q2 = i0Var != null ? v8.l0.Q(i0Var.c) : null;
                                    if (Q2 != null) {
                                        x7Var.add(Q2);
                                    }
                                }
                            }
                            x7Var2 = new l01.w(x7Var);
                        }
                        if (x7Var2 == null) {
                            return a0Var;
                        }
                        dVar.v = 1;
                        return jVar3.c(x7Var2, dVar) == aVar6 ? aVar6 : a0Var;
                    }
                }
                dVar = new fy0.d(this, cVar);
                Object obj52 = dVar.u;
                b71.a aVar62 = b71.a.r;
                i4 = dVar.v;
                if (i4 == 0) {
                }
                break;
            case 4:
                if (cVar instanceof fy0.e) {
                    eVar2 = (fy0.e) cVar;
                    int i38 = eVar2.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        eVar2.v = i38 - Integer.MIN_VALUE;
                        Object obj6 = eVar2.u;
                        b71.a aVar7 = b71.a.r;
                        i5 = eVar2.v;
                        if (i5 == 0) {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                            return a0Var;
                        }
                        sy.y.j(obj6);
                        gy0.q qVar3 = (gy0.q) obj;
                        k71.k.g(qVar3, "<this>");
                        gy0.v vVar2 = qVar3.a;
                        gy0.u uVar = (gy0.u) in.rShadow.j((vVar2 == null || (tVar = vVar2.c) == null) ? null : tVar.a, "Project is null", new io0.f(20));
                        gy0.r rVar2 = uVar.b;
                        l01.l0 l0Var2 = (l01.l0) in.rShadow.j(rVar2 != null ? rVar2.c : null, "Default view is null", new io0.f(21));
                        x7 x7Var3 = uVar.c.a;
                        if (x7Var3 != null) {
                            x7Var = x7Var3;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (gy0.s sVar : x7Var) {
                            l01.l0 m = sVar != null ? m7.y.m(sVar.c) : null;
                            if (m != null) {
                                arrayList2.add(m);
                            }
                        }
                        l01.s0 s0Var = new l01.s0(l0Var2, arrayList2, m71.a.m(uVar.e));
                        eVar2.v = 1;
                        return jVar3.c(s0Var, eVar2) == aVar7 ? aVar7 : a0Var;
                    }
                }
                eVar2 = new fy0.e(this, cVar);
                Object obj62 = eVar2.u;
                b71.a aVar72 = b71.a.r;
                i5 = eVar2.v;
                if (i5 == 0) {
                }
                break;
            case 5:
                if (cVar instanceof fy0.f) {
                    fVar = (fy0.f) cVar;
                    int i39 = fVar.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i39 - Integer.MIN_VALUE;
                        Object obj7 = fVar.u;
                        b71.a aVar8 = b71.a.r;
                        i6 = fVar.v;
                        if (i6 == 0) {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                            return a0Var;
                        }
                        sy.y.j(obj7);
                        gy0.f0 f0Var = ((gy0.z) obj).a;
                        gy0.e0 e0Var2 = (f0Var == null || (g0Var = f0Var.c) == null || (list = g0Var.a.a) == null || (d0Var = (gy0.d0) x61.m.W(list)) == null || (list2 = d0Var.a.a) == null) ? null : (gy0.e0) x61.m.W(list2);
                        List g = k41.b.g(e0Var2 != null ? e0Var2.c : null);
                        if (e0Var2 != null && (b0Var = e0Var2.b) != null) {
                            x7Var2 = m7.y.l(b0Var.c, g);
                        }
                        if (x7Var2 == null) {
                            return a0Var;
                        }
                        fVar.v = 1;
                        return jVar3.c(x7Var2, fVar) == aVar8 ? aVar8 : a0Var;
                    }
                }
                fVar = new fy0.f(this, cVar);
                Object obj72 = fVar.u;
                b71.a aVar82 = b71.a.r;
                i6 = fVar.v;
                if (i6 == 0) {
                }
                break;
            case 6:
                if (cVar instanceof g1Shadow.a) {
                    aVar = (g1.a) cVar;
                    int i41 = aVar.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i41 - Integer.MIN_VALUE;
                        Object obj8 = aVar.u;
                        b71.a aVar9 = b71.a.r;
                        i7 = aVar.v;
                        if (i7 == 0) {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                            return a0Var;
                        }
                        sy.y.j(obj8);
                        java.lang.Object r1 = (java.lang.Object) (((p8.h) obj).a);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj9 : r1) {
                            if (obj9 instanceof p8.c) {
                                arrayList3.add(obj9);
                            }
                        }
                        aVar.v = 1;
                        return jVar3.c(arrayList3, aVar) == aVar9 ? aVar9 : a0Var;
                    }
                }
                aVar = new g1.a(this, cVar);
                Object obj82 = aVar.u;
                b71.a aVar92 = b71.a.r;
                i7 = aVar.v;
                if (i7 == 0) {
                }
            case 7:
                if (cVar instanceof gl.e) {
                    eVar3 = (gl.e) cVar;
                    int i42 = eVar3.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        eVar3.v = i42 - Integer.MIN_VALUE;
                        Object obj10 = eVar3.u;
                        b71.a aVar10 = b71.a.r;
                        i8 = eVar3.v;
                        if (i8 == 0) {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                            return a0Var;
                        }
                        sy.y.j(obj10);
                        Map t = x61.x.t(new w61.k(ak.a.t, Boolean.valueOf(((n01.a) obj).b)));
                        eVar3.v = 1;
                        return jVar3.c(t, eVar3) == aVar10 ? aVar10 : a0Var;
                    }
                }
                eVar3 = new gl.e(this, cVar);
                Object obj102 = eVar3.u;
                b71.a aVar102 = b71.a.r;
                i8 = eVar3.v;
                if (i8 == 0) {
                }
            case 8:
                if (cVar instanceof go0.j) {
                    jVar = (go0.j) cVar;
                    int i43 = jVar.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        jVar.v = i43 - Integer.MIN_VALUE;
                        Object obj11 = jVar.u;
                        b71.a aVar11 = b71.a.r;
                        i9 = jVar.v;
                        if (i9 == 0) {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                            return a0Var;
                        }
                        sy.y.j(obj11);
                        String str3 = ((sn0.l) obj).a;
                        jVar.v = 1;
                        return jVar3.c(str3, jVar) == aVar11 ? aVar11 : a0Var;
                    }
                }
                jVar = new go0.j(this, cVar);
                Object obj112 = jVar.u;
                b71.a aVar112 = b71.a.r;
                i9 = jVar.v;
                if (i9 == 0) {
                }
            case 9:
                if (cVar instanceof go0.r) {
                    rVar = (go0.r) cVar;
                    int i44 = rVar.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        rVar.v = i44 - Integer.MIN_VALUE;
                        Object obj12 = rVar.u;
                        b71.a aVar12 = b71.a.r;
                        i11 = rVar.v;
                        if (i11 == 0) {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                            return a0Var;
                        }
                        sy.y.j(obj12);
                        String str4 = (String) obj;
                        if (k71.k.b(str4, "APOLLO_ALIVE_SERVICE_IO")) {
                            throw new ApiFailure(ApiFailureType.HTTP_ERROR, "io error on socket", (String) null, new Integer(0), (ArrayList) null, (Map) null, (Throwable) null, 112);
                        }
                        rVar.v = 1;
                        return jVar3.c(str4, rVar) == aVar12 ? aVar12 : a0Var;
                    }
                }
                rVar = new go0.r(this, cVar);
                Object obj122 = rVar.u;
                b71.a aVar122 = b71.a.r;
                i11 = rVar.v;
                if (i11 == 0) {
                }
            case 10:
                if (cVar instanceof go0.v) {
                    vVar = (go0.v) cVar;
                    int i45 = vVar.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        vVar.v = i45 - Integer.MIN_VALUE;
                        Object obj13 = vVar.u;
                        b71.a aVar13 = b71.a.r;
                        i12 = vVar.v;
                        if (i12 == 0) {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                            return a0Var;
                        }
                        sy.y.j(obj13);
                        if (!(obj instanceof qn.d)) {
                            return a0Var;
                        }
                        vVar.v = 1;
                        return jVar3.c(obj, vVar) == aVar13 ? aVar13 : a0Var;
                    }
                }
                vVar = new go0.v(this, cVar);
                Object obj132 = vVar.u;
                b71.a aVar132 = b71.a.r;
                i12 = vVar.v;
                if (i12 == 0) {
                }
            case 11:
                if (cVar instanceof go0.w) {
                    wVar = (go0.w) cVar;
                    int i46 = wVar.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        wVar.v = i46 - Integer.MIN_VALUE;
                        Object obj14 = wVar.u;
                        b71.a aVar14 = b71.a.r;
                        i13 = wVar.v;
                        if (i13 == 0) {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                            return a0Var;
                        }
                        sy.y.j(obj14);
                        a.a L = aa1.b.L((String) obj);
                        wVar.v = 1;
                        return jVar3.c(L, wVar) == aVar14 ? aVar14 : a0Var;
                    }
                }
                wVar = new go0.w(this, cVar);
                Object obj142 = wVar.u;
                b71.a aVar142 = b71.a.r;
                i13 = wVar.v;
                if (i13 == 0) {
                }
            case 12:
                if (cVar instanceof go0.x) {
                    xVar = (go0.x) cVar;
                    int i47 = xVar.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        xVar.v = i47 - Integer.MIN_VALUE;
                        Object obj15 = xVar.u;
                        b71.a aVar15 = b71.a.r;
                        i14 = xVar.v;
                        if (i14 == 0) {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                            return a0Var;
                        }
                        sy.y.j(obj15);
                        qn.f fVar2 = ((qn.d) obj).c;
                        xVar.v = 1;
                        return jVar3.c(fVar2, xVar) == aVar15 ? aVar15 : a0Var;
                    }
                }
                xVar = new go0.x(this, cVar);
                Object obj152 = xVar.u;
                b71.a aVar152 = b71.a.r;
                i14 = xVar.v;
                if (i14 == 0) {
                }
            case 13:
                if (cVar instanceof h9.h) {
                    hVar = (h9.h) cVar;
                    int i48 = hVar.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i48 - Integer.MIN_VALUE;
                        Object obj16 = hVar.u;
                        b71.a aVar16 = b71.a.r;
                        i15 = hVar.v;
                        if (i15 == 0) {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                            return a0Var;
                        }
                        sy.y.j(obj16);
                        long j = ((c2.e) obj).a;
                        if (j == 9205357640488583168L) {
                            x7Var2 = s9.h.c;
                        } else {
                            int i49 = h9.n.a;
                            if (c2.e.e(j) >= 0.5d && c2.e.c(j) >= 0.5d) {
                                float e = c2.e.e(j);
                                boolean isInfinite = Float.isInfinite(e);
                                s9.a aVar17 = s9.b.a;
                                s9.a aVar18 = (isInfinite || Float.isNaN(e)) ? aVar17 : new s9.a(m71.a.W(c2.e.e(j)));
                                float c = c2.e.c(j);
                                if (!Float.isInfinite(c) && !Float.isNaN(c)) {
                                    aVar17 = new s9.a(m71.a.W(c2.e.c(j)));
                                }
                                x7Var2 = new s9.h(aVar18, aVar17);
                            }
                        }
                        if (x7Var2 == null) {
                            return a0Var;
                        }
                        hVar.v = 1;
                        return jVar3.c(x7Var2, hVar) == aVar16 ? aVar16 : a0Var;
                    }
                }
                hVar = new h9.h(this, cVar);
                Object obj162 = hVar.u;
                b71.a aVar162 = b71.a.r;
                i15 = hVar.v;
                if (i15 == 0) {
                }
                break;
            case 14:
                if (cVar instanceof hd0.g) {
                    gVar = (hd0.g) cVar;
                    int i51 = gVar.v;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        gVar.v = i51 - Integer.MIN_VALUE;
                        Object obj17 = gVar.u;
                        b71.a aVar19 = b71.a.r;
                        i16 = gVar.v;
                        if (i16 == 0) {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                            return a0Var;
                        }
                        sy.y.j(obj17);
                        String str5 = ((tc0.l) obj).a;
                        gVar.v = 1;
                        return jVar3.c(str5, gVar) == aVar19 ? aVar19 : a0Var;
                    }
                }
                gVar = new hd0.g(this, cVar);
                Object obj172 = gVar.u;
                b71.a aVar192 = b71.a.r;
                i16 = gVar.v;
                if (i16 == 0) {
                }
            case 15:
                if (cVar instanceof hd0.l) {
                    lVar2 = (hd0.l) cVar;
                    int i52 = lVar2.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        lVar2.v = i52 - Integer.MIN_VALUE;
                        Object obj18 = lVar2.u;
                        b71.a aVar20 = b71.a.r;
                        i17 = lVar2.v;
                        if (i17 == 0) {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                            return a0Var;
                        }
                        sy.y.j(obj18);
                        String str6 = (String) obj;
                        if (k71.k.b(str6, "APOLLO_ALIVE_SERVICE_IO")) {
                            throw new ApiFailure(ApiFailureType.HTTP_ERROR, "io error on socket", (String) null, new Integer(0), (ArrayList) null, (Map) null, (Throwable) null, 112);
                        }
                        lVar2.v = 1;
                        return jVar3.c(str6, lVar2) == aVar20 ? aVar20 : a0Var;
                    }
                }
                lVar2 = new hd0.l(this, cVar);
                Object obj182 = lVar2.u;
                b71.a aVar202 = b71.a.r;
                i17 = lVar2.v;
                if (i17 == 0) {
                }
            case 16:
                if (cVar instanceof hd0.o) {
                    oVar = (hd0.o) cVar;
                    int i53 = oVar.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i53 - Integer.MIN_VALUE;
                        Object obj19 = oVar.u;
                        b71.a aVar21 = b71.a.r;
                        i18 = oVar.v;
                        if (i18 == 0) {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                            return a0Var;
                        }
                        sy.y.j(obj19);
                        if (!(obj instanceof qn.d)) {
                            return a0Var;
                        }
                        oVar.v = 1;
                        return jVar3.c(obj, oVar) == aVar21 ? aVar21 : a0Var;
                    }
                }
                oVar = new hd0.o(this, cVar);
                Object obj192 = oVar.u;
                b71.a aVar212 = b71.a.r;
                i18 = oVar.v;
                if (i18 == 0) {
                }
            case 17:
                if (cVar instanceof hd0.p) {
                    pVar = (hd0.p) cVar;
                    int i54 = pVar.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        pVar.v = i54 - Integer.MIN_VALUE;
                        Object obj20 = pVar.u;
                        b71.a aVar22 = b71.a.r;
                        i19 = pVar.v;
                        if (i19 == 0) {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                            return a0Var;
                        }
                        sy.y.j(obj20);
                        a.a L2 = aa1.b.L((String) obj);
                        pVar.v = 1;
                        return jVar3.c(L2, pVar) == aVar22 ? aVar22 : a0Var;
                    }
                }
                pVar = new hd0.p(this, cVar);
                Object obj202 = pVar.u;
                b71.a aVar222 = b71.a.r;
                i19 = pVar.v;
                if (i19 == 0) {
                }
            case 18:
                if (cVar instanceof hd0.q) {
                    qVar = (hd0.q) cVar;
                    int i55 = qVar.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        qVar.v = i55 - Integer.MIN_VALUE;
                        Object obj21 = qVar.u;
                        b71.a aVar23 = b71.a.r;
                        i21 = qVar.v;
                        if (i21 == 0) {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                            return a0Var;
                        }
                        sy.y.j(obj21);
                        qn.f fVar3 = ((qn.d) obj).c;
                        qVar.v = 1;
                        return jVar3.c(fVar3, qVar) == aVar23 ? aVar23 : a0Var;
                    }
                }
                qVar = new hd0.q(this, cVar);
                Object obj212 = qVar.u;
                b71.a aVar232 = b71.a.r;
                i21 = qVar.v;
                if (i21 == 0) {
                }
            case 19:
                if (cVar instanceof hl0.a) {
                    aVar2 = (hl0.a) cVar;
                    int i56 = aVar2.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        aVar2.v = i56 - Integer.MIN_VALUE;
                        Object obj23 = aVar2.u;
                        b71.a aVar24 = b71.a.r;
                        i22 = aVar2.v;
                        if (i22 == 0) {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                            return a0Var;
                        }
                        sy.y.j(obj23);
                        q4 q4Var = ((s4) obj).a;
                        if (q4Var != null && (t4Var = q4Var.a) != null) {
                            x7Var2 = i21.a.T(t4Var.c);
                        }
                        if (x7Var2 == null) {
                            return a0Var;
                        }
                        aVar2.v = 1;
                        return jVar3.c(x7Var2, aVar2) == aVar24 ? aVar24 : a0Var;
                    }
                }
                aVar2 = new hl0.a(this, cVar);
                Object obj232 = aVar2.u;
                b71.a aVar242 = b71.a.r;
                i22 = aVar2.v;
                if (i22 == 0) {
                }
                break;
            case 20:
                if (cVar instanceof hl0.b) {
                    bVar = (hl0.b) cVar;
                    int i57 = bVar.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i57 - Integer.MIN_VALUE;
                        Object obj24 = bVar.u;
                        b71.a aVar25 = b71.a.r;
                        i23 = bVar.v;
                        if (i23 == 0) {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                            return a0Var;
                        }
                        sy.y.j(obj24);
                        s6 s6Var = (s6) obj;
                        k71.k.g(s6Var, "<this>");
                        r6 r6Var = s6Var.a;
                        String str7 = (r6Var == null || (t6Var3 = r6Var.a) == null) ? null : t6Var3.a;
                        if (str7 == null) {
                            str7 = "";
                        }
                        String str8 = (r6Var == null || (t6Var2 = r6Var.a) == null) ? null : t6Var2.b;
                        String str9 = str8 != null ? str8 : "";
                        if (r6Var != null && (t6Var = r6Var.a) != null) {
                            x7Var2 = Integer.valueOf(t6Var.c);
                        }
                        yz0.y0 y0Var = new yz0.y0(x7Var2, str7, str9);
                        bVar.v = 1;
                        return jVar3.c(y0Var, bVar) == aVar25 ? aVar25 : a0Var;
                    }
                }
                bVar = new hl0.b(this, cVar);
                Object obj242 = bVar.u;
                b71.a aVar252 = b71.a.r;
                i23 = bVar.v;
                if (i23 == 0) {
                }
                break;
            case 21:
                if (cVar instanceof hl0.d) {
                    dVar2 = (hl0.d) cVar;
                    int i58 = dVar2.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        dVar2.v = i58 - Integer.MIN_VALUE;
                        Object obj25 = dVar2.u;
                        b71.a aVar26 = b71.a.r;
                        i24 = dVar2.v;
                        if (i24 == 0) {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                            return a0Var;
                        }
                        sy.y.j(obj25);
                        hs hsVar = ((fs) obj).a;
                        if (hsVar != null && (gsVar = hsVar.a) != null) {
                            x7Var2 = i21.a.T(gsVar.c);
                        }
                        if (x7Var2 == null) {
                            return a0Var;
                        }
                        dVar2.v = 1;
                        return jVar3.c(x7Var2, dVar2) == aVar26 ? aVar26 : a0Var;
                    }
                }
                dVar2 = new hl0.d(this, cVar);
                Object obj252 = dVar2.u;
                b71.a aVar262 = b71.a.r;
                i24 = dVar2.v;
                if (i24 == 0) {
                }
                break;
            case 22:
                if (cVar instanceof hl0.e) {
                    eVar4 = (hl0.e) cVar;
                    int i59 = eVar4.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        eVar4.v = i59 - Integer.MIN_VALUE;
                        Object obj26 = eVar4.u;
                        b71.a aVar27 = b71.a.r;
                        i25 = eVar4.v;
                        if (i25 == 0) {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                            return a0Var;
                        }
                        sy.y.j(obj26);
                        w7 Y = com.google.common.util.concurrent.a.Y((m60) obj);
                        eVar4.v = 1;
                        return jVar3.c(Y, eVar4) == aVar27 ? aVar27 : a0Var;
                    }
                }
                eVar4 = new hl0.e(this, cVar);
                Object obj262 = eVar4.u;
                b71.a aVar272 = b71.a.r;
                i25 = eVar4.v;
                if (i25 == 0) {
                }
            case 23:
                if (cVar instanceof il.n) {
                    nVar3 = (il.n) cVar;
                    int i61 = nVar3.v;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        nVar3.v = i61 - Integer.MIN_VALUE;
                        Object obj27 = nVar3.u;
                        b71.a aVar28 = b71.a.r;
                        i26 = nVar3.v;
                        if (i26 == 0) {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                            return a0Var;
                        }
                        sy.y.j(obj27);
                        if (t71.p.T((String) obj)) {
                            return a0Var;
                        }
                        nVar3.v = 1;
                        return jVar3.c(obj, nVar3) == aVar28 ? aVar28 : a0Var;
                    }
                }
                nVar3 = new il.n(this, cVar);
                Object obj272 = nVar3.u;
                b71.a aVar282 = b71.a.r;
                i26 = nVar3.v;
                if (i26 == 0) {
                }
            case 24:
                if (cVar instanceof in.i) {
                    iVar = (in.i) cVar;
                    int i62 = iVar.v;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        iVar.v = i62 - Integer.MIN_VALUE;
                        Object obj28 = iVar.u;
                        b71.a aVar29 = b71.a.r;
                        i27 = iVar.v;
                        if (i27 == 0) {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                            return a0Var;
                        }
                        sy.y.j(obj28);
                        if (((aa.f) obj).e instanceof CacheMissException) {
                            return a0Var;
                        }
                        iVar.v = 1;
                        return jVar3.c(obj, iVar) == aVar29 ? aVar29 : a0Var;
                    }
                }
                iVar = new in.i(this, cVar);
                Object obj282 = iVar.u;
                b71.a aVar292 = b71.a.r;
                i27 = iVar.v;
                if (i27 == 0) {
                }
            case 25:
                if (cVar instanceof in.j) {
                    jVar2 = (in.j) cVar;
                    int i63 = jVar2.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        jVar2.v = i63 - Integer.MIN_VALUE;
                        Object obj29 = jVar2.u;
                        b71.a aVar30 = b71.a.r;
                        i28 = jVar2.v;
                        if (i28 == 0) {
                            if (i28 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                            return a0Var;
                        }
                        sy.y.j(obj29);
                        Boolean bool = Boolean.TRUE;
                        jVar2.v = 1;
                        return jVar3.c(bool, jVar2) == aVar30 ? aVar30 : a0Var;
                    }
                }
                jVar2 = new in.j(this, cVar);
                Object obj292 = jVar2.u;
                b71.a aVar302 = b71.a.r;
                i28 = jVar2.v;
                if (i28 == 0) {
                }
            case 26:
                if (cVar instanceof in.k) {
                    kVar2 = (in.k) cVar;
                    int i64 = kVar2.v;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        kVar2.v = i64 - Integer.MIN_VALUE;
                        Object obj30 = kVar2.u;
                        b71.a aVar31 = b71.a.r;
                        i29 = kVar2.v;
                        if (i29 == 0) {
                            if (i29 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                            return a0Var;
                        }
                        sy.y.j(obj30);
                        Boolean bool2 = Boolean.FALSE;
                        kVar2.v = 1;
                        return jVar3.c(bool2, kVar2) == aVar31 ? aVar31 : a0Var;
                    }
                }
                kVar2 = new in.k(this, cVar);
                Object obj302 = kVar2.u;
                b71.a aVar312 = b71.a.r;
                i29 = kVar2.v;
                if (i29 == 0) {
                }
            case 27:
                if (cVar instanceof in.m) {
                    mVar = (in.m) cVar;
                    int i65 = mVar.v;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        mVar.v = i65 - Integer.MIN_VALUE;
                        Object obj31 = mVar.u;
                        b71.a aVar33 = b71.a.r;
                        i31 = mVar.v;
                        if (i31 == 0) {
                            if (i31 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj31);
                            return a0Var;
                        }
                        sy.y.j(obj31);
                        Object obj33 = ((in.p0) obj).a;
                        mVar.v = 1;
                        return jVar3.c(obj33, mVar) == aVar33 ? aVar33 : a0Var;
                    }
                }
                mVar = new in.m(this, cVar);
                Object obj312 = mVar.u;
                b71.a aVar332 = b71.a.r;
                i31 = mVar.v;
                if (i31 == 0) {
                }
            case 28:
                return a(cVar, obj);
            default:
                if (cVar instanceof in.q) {
                    qVar2 = (in.q) cVar;
                    int i66 = qVar2.v;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        qVar2.v = i66 - Integer.MIN_VALUE;
                        Object obj34 = qVar2.u;
                        b71.a aVar34 = b71.a.r;
                        i32 = qVar2.v;
                        if (i32 != 0) {
                            sy.y.j(obj34);
                            qVar2.v = 1;
                            return jVar3.c(a0Var, qVar2) == aVar34 ? aVar34 : a0Var;
                        }
                        if (i32 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj34);
                        return a0Var;
                    }
                }
                qVar2 = new in.q(this, cVar);
                Object obj342 = qVar2.u;
                b71.a aVar342 = b71.a.r;
                i32 = qVar2.v;
                if (i32 != 0) {
                }
        }
    }
}
