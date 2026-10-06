package cn;

import com.apollographql.apollo.exception.ApolloException;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import gn0.a9;
import gn0.u9;
import java.util.ArrayList;
import java.util.Map;
import jo.a3;
import jo.c3;
import jo.d3;
import jo.gc0;
import jo.h3;
import jo.ic0;
import jo.j3;
import jo.wb0;
import jo.yb0;
import kc0.l50;
import kc0.n50;
import kc0.p2;
import kc0.r2;
import kc0.s2;
import kc0.t2;
import kc0.v2;
import kc0.v50;
import kc0.x50;
import m10.fd;
import nj.w0;
import rm0.u1;
import rm0.w5;
import rm0.x1;
import rm0.z1;
import sn0.t;
import sn0.v;
import so.u;
import so.x;
import so.z;
import sy.d0;
import sy.e0;
import sy.y;
import t00.n1;
import t00.p1;
import t00.q1;
import t00.x5;
import w61.a0;
import yz0.e4;
import yz0.m3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ String t;

    public /* synthetic */ n(y71.j jVar, String str, int i) {
        this.r = i;
        this.s = jVar;
        this.t = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        n1 n1Var;
        int i;
        if (cVar instanceof n1) {
            n1Var = (n1) cVar;
            int i2 = n1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = n1Var.u;
                b71.a aVar = b71.a.r;
                i = n1Var.v;
                if (i != 0) {
                    y.j(obj2);
                    is.k kVar = (is.k) obj;
                    np.k kVar2 = null;
                    if (kVar != null) {
                        fd.Companion.getClass();
                        kVar2 = new np.k(new np.m(new np.l(((aa.q) fd.l).a, this.t, is.k.a(kVar, false, null))));
                    }
                    n1Var.v = 1;
                    if (this.s.c(kVar2, n1Var) == aVar) {
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
        n1Var = new n1(this, cVar);
        Object obj22 = n1Var.u;
        b71.a aVar2 = b71.a.r;
        i = n1Var.v;
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
        p1 p1Var;
        int i;
        if (cVar instanceof p1) {
            p1Var = (p1) cVar;
            int i2 = p1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = p1Var.u;
                b71.a aVar = b71.a.r;
                i = p1Var.v;
                if (i != 0) {
                    y.j(obj2);
                    ic0 ic0Var = ((gc0) obj).a;
                    if ((ic0Var != null ? ic0Var.a : null) == null) {
                        throw new ApiFailure(ApiFailureType.SERVER_ERROR, f1.e.g("Invalid Discussion id: ", this.t), (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                    }
                    b01.j e = e0.e(ic0Var.a.c);
                    p1Var.v = 1;
                    if (this.s.c(e, p1Var) == aVar) {
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
        p1Var = new p1(this, cVar);
        Object obj22 = p1Var.u;
        b71.a aVar2 = b71.a.r;
        i = p1Var.v;
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
        q1 q1Var;
        int i;
        if (cVar instanceof q1) {
            q1Var = (q1) cVar;
            int i2 = q1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = q1Var.u;
                b71.a aVar = b71.a.r;
                i = q1Var.v;
                if (i != 0) {
                    y.j(obj2);
                    yb0 yb0Var = ((wb0) obj).a;
                    if ((yb0Var != null ? yb0Var.a : null) == null) {
                        throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid Discussion id: ".concat(this.t), (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                    }
                    b01.e eVar = e0.e(yb0Var.a.c).c.m;
                    q1Var.v = 1;
                    if (this.s.c(eVar, q1Var) == aVar) {
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
        q1Var = new q1(this, cVar);
        Object obj22 = q1Var.u;
        b71.a aVar2 = b71.a.r;
        i = q1Var.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0438  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0446  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x0527  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0581  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05f3  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x064d  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x065b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:421:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0747  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0755  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x07ab  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x07b9  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0821  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x0873  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x08e9  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x093f  */
    /* JADX WARN: Removed duplicated region for block: B:597:0x094d  */
    /* JADX WARN: Removed duplicated region for block: B:618:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:624:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x0a15  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        m mVar;
        int i;
        go0.h hVar;
        int i2;
        sn0.d dVar;
        String str;
        go0.k kVar;
        int i3;
        sn0.i iVar;
        String str2;
        go0.l lVar;
        int i4;
        sn0.q qVar;
        String str3;
        go0.m mVar2;
        int i5;
        v vVar;
        String str4;
        hd0.f fVar;
        int i6;
        tc0.d dVar2;
        String str5;
        hd0.h hVar2;
        int i7;
        tc0.i iVar2;
        String str6;
        hd0.i iVar3;
        int i8;
        tc0.q qVar2;
        String str7;
        hl0.c cVar2;
        int i9;
        in.o oVar;
        int i11;
        kp.i iVar4;
        int i12;
        so.h hVar3;
        String str8;
        kp.k kVar2;
        int i13;
        so.m mVar3;
        String str9;
        kp.l lVar2;
        int i14;
        u uVar;
        String str10;
        kp.m mVar4;
        int i15;
        z zVar;
        String str11;
        ky.f fVar2;
        int i16;
        ml.b bVar;
        int i17;
        w0 w0Var;
        int i18;
        r20.f fVar3;
        int i19;
        d20.d dVar3;
        String str12;
        r20.h hVar4;
        int i21;
        d20.i iVar5;
        String str13;
        r20.i iVar6;
        int i22;
        d20.q qVar3;
        String str14;
        rm0.bShadow bVar2;
        int i23;
        t2 t2Var;
        u1 u1Var;
        int i24;
        x1 x1Var;
        int i25;
        z1 z1Var;
        int i26;
        w5 w5Var;
        int i27;
        t00.f fVar4;
        int i28;
        h3 h3Var;
        x5 x5Var;
        int i29;
        switch (this.r) {
            case 0:
                if (cVar instanceof m) {
                    mVar = (m) cVar;
                    int i31 = mVar.v;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        mVar.v = i31 - Integer.MIN_VALUE;
                        Object obj2 = mVar.u;
                        b71.a aVar = b71.a.r;
                        i = mVar.v;
                        if (i != 0) {
                            y.j(obj2);
                            if (k71.k.b(((i) obj).a, this.t)) {
                                mVar.v = 1;
                                if (this.s.c(obj, mVar) == aVar) {
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
                mVar = new m(this, cVar);
                Object obj22 = mVar.u;
                b71.a aVar2 = b71.a.r;
                i = mVar.v;
                if (i != 0) {
                }
                return a0.a;
            case 1:
                if (cVar instanceof go0.h) {
                    hVar = (go0.h) cVar;
                    int i32 = hVar.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i32 - Integer.MIN_VALUE;
                        Object obj3 = hVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = hVar.v;
                        if (i2 != 0) {
                            y.j(obj3);
                            sn0.c cVar3 = ((sn0.b) obj).a;
                            qn.g gVar = null;
                            if (cVar3 != null && (dVar = cVar3.c) != null && (str = dVar.c) != null) {
                                gVar = new qn.g(str, x61.l.r(new String[]{dVar.b, this.t}));
                            }
                            hVar.v = 1;
                            if (this.s.c(gVar, hVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return a0.a;
                    }
                }
                hVar = new go0.h(this, cVar);
                Object obj32 = hVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = hVar.v;
                if (i2 != 0) {
                }
                return a0.a;
            case 2:
                if (cVar instanceof go0.k) {
                    kVar = (go0.k) cVar;
                    int i33 = kVar.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        kVar.v = i33 - Integer.MIN_VALUE;
                        Object obj4 = kVar.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = kVar.v;
                        if (i3 != 0) {
                            y.j(obj4);
                            sn0.h hVar5 = ((sn0.g) obj).a;
                            qn.g gVar2 = null;
                            if (hVar5 != null && (iVar = hVar5.c) != null && (str2 = iVar.c) != null) {
                                y61.b i34 = d0.i();
                                String str15 = iVar.b;
                                if (str15 != null) {
                                    i34.add(str15);
                                }
                                i34.add(this.t);
                                gVar2 = new qn.g(str2, d0.h(i34));
                            }
                            kVar.v = 1;
                            if (this.s.c(gVar2, kVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj4);
                        }
                        return a0.a;
                    }
                }
                kVar = new go0.k(this, cVar);
                Object obj42 = kVar.u;
                b71.a aVar42 = b71.a.r;
                i3 = kVar.v;
                if (i3 != 0) {
                }
                return a0.a;
            case 3:
                if (cVar instanceof go0.l) {
                    lVar = (go0.l) cVar;
                    int i35 = lVar.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        lVar.v = i35 - Integer.MIN_VALUE;
                        Object obj5 = lVar.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = lVar.v;
                        if (i4 != 0) {
                            y.j(obj5);
                            sn0.p pVar = ((sn0.o) obj).a;
                            qn.g gVar3 = null;
                            if (pVar != null && (qVar = pVar.c) != null && (str3 = qVar.c) != null) {
                                gVar3 = new qn.g(str3, x61.l.r(new String[]{String.valueOf(qVar.b), this.t}));
                            }
                            lVar.v = 1;
                            if (this.s.c(gVar3, lVar) == aVar5) {
                                return aVar5;
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
                lVar = new go0.l(this, cVar);
                Object obj52 = lVar.u;
                b71.a aVar52 = b71.a.r;
                i4 = lVar.v;
                if (i4 != 0) {
                }
                return a0.a;
            case 4:
                if (cVar instanceof go0.m) {
                    mVar2 = (go0.m) cVar;
                    int i36 = mVar2.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        mVar2.v = i36 - Integer.MIN_VALUE;
                        Object obj6 = mVar2.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = mVar2.v;
                        if (i5 != 0) {
                            y.j(obj6);
                            sn0.u uVar2 = ((t) obj).a;
                            qn.g gVar4 = null;
                            if (uVar2 != null && (vVar = uVar2.c) != null && (str4 = vVar.c) != null) {
                                y61.b i37 = d0.i();
                                String str16 = vVar.b;
                                if (str16 != null) {
                                    i37.add(str16);
                                }
                                i37.add(this.t);
                                gVar4 = new qn.g(str4, d0.h(i37));
                            }
                            mVar2.v = 1;
                            if (this.s.c(gVar4, mVar2) == aVar6) {
                                return aVar6;
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
                mVar2 = new go0.m(this, cVar);
                Object obj62 = mVar2.u;
                b71.a aVar62 = b71.a.r;
                i5 = mVar2.v;
                if (i5 != 0) {
                }
                return a0.a;
            case 5:
                if (cVar instanceof hd0.f) {
                    fVar = (hd0.f) cVar;
                    int i38 = fVar.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i38 - Integer.MIN_VALUE;
                        Object obj7 = fVar.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = fVar.v;
                        if (i6 != 0) {
                            y.j(obj7);
                            tc0.c cVar4 = ((tc0.b) obj).a;
                            qn.g gVar5 = null;
                            if (cVar4 != null && (dVar2 = cVar4.c) != null && (str5 = dVar2.c) != null) {
                                gVar5 = new qn.g(str5, x61.l.r(new String[]{dVar2.b, this.t}));
                            }
                            fVar.v = 1;
                            if (this.s.c(gVar5, fVar) == aVar7) {
                                return aVar7;
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
                fVar = new hd0.f(this, cVar);
                Object obj72 = fVar.u;
                b71.a aVar72 = b71.a.r;
                i6 = fVar.v;
                if (i6 != 0) {
                }
                return a0.a;
            case 6:
                if (cVar instanceof hd0.h) {
                    hVar2 = (hd0.h) cVar;
                    int i39 = hVar2.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        hVar2.v = i39 - Integer.MIN_VALUE;
                        Object obj8 = hVar2.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = hVar2.v;
                        if (i7 != 0) {
                            y.j(obj8);
                            tc0.h hVar6 = ((tc0.g) obj).a;
                            qn.g gVar6 = null;
                            if (hVar6 != null && (iVar2 = hVar6.c) != null && (str6 = iVar2.c) != null) {
                                y61.b i41 = d0.i();
                                String str17 = iVar2.b;
                                if (str17 != null) {
                                    i41.add(str17);
                                }
                                i41.add(this.t);
                                gVar6 = new qn.g(str6, d0.h(i41));
                            }
                            hVar2.v = 1;
                            if (this.s.c(gVar6, hVar2) == aVar8) {
                                return aVar8;
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
                hVar2 = new hd0.h(this, cVar);
                Object obj82 = hVar2.u;
                b71.a aVar82 = b71.a.r;
                i7 = hVar2.v;
                if (i7 != 0) {
                }
                return a0.a;
            case 7:
                if (cVar instanceof hd0.i) {
                    iVar3 = (hd0.i) cVar;
                    int i42 = iVar3.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        iVar3.v = i42 - Integer.MIN_VALUE;
                        Object obj9 = iVar3.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = iVar3.v;
                        if (i8 != 0) {
                            y.j(obj9);
                            tc0.p pVar2 = ((tc0.o) obj).a;
                            qn.g gVar7 = null;
                            if (pVar2 != null && (qVar2 = pVar2.c) != null && (str7 = qVar2.c) != null) {
                                gVar7 = new qn.g(str7, x61.l.r(new String[]{String.valueOf(qVar2.b), this.t}));
                            }
                            iVar3.v = 1;
                            if (this.s.c(gVar7, iVar3) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj9);
                        }
                        return a0.a;
                    }
                }
                iVar3 = new hd0.i(this, cVar);
                Object obj92 = iVar3.u;
                b71.a aVar92 = b71.a.r;
                i8 = iVar3.v;
                if (i8 != 0) {
                }
                return a0.a;
            case 8:
                if (cVar instanceof hl0.c) {
                    cVar2 = (hl0.c) cVar;
                    int i43 = cVar2.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i43 - Integer.MIN_VALUE;
                        Object obj10 = cVar2.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = cVar2.v;
                        if (i9 != 0) {
                            y.j(obj10);
                            e4 e4Var = (e4) obj;
                            if (e4Var.a == null && this.t != null) {
                                e4Var = null;
                            }
                            if (e4Var != null) {
                                cVar2.v = 1;
                                if (this.s.c(e4Var, cVar2) == aVar10) {
                                    return aVar10;
                                }
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj10);
                        }
                        return a0.a;
                    }
                }
                cVar2 = new hl0.c(this, cVar);
                Object obj102 = cVar2.u;
                b71.a aVar102 = b71.a.r;
                i9 = cVar2.v;
                if (i9 != 0) {
                }
                return a0.a;
            case 9:
                if (cVar instanceof in.o) {
                    oVar = (in.o) cVar;
                    int i44 = oVar.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i44 - Integer.MIN_VALUE;
                        Object obj11 = oVar.u;
                        b71.a aVar11 = b71.a.r;
                        i11 = oVar.v;
                        if (i11 != 0) {
                            y.j(obj11);
                            aa.f fVar5 = (aa.f) obj;
                            ApolloException apolloException = fVar5.e;
                            if (apolloException != null) {
                                throw in.r.b(apolloException, this.t);
                            }
                            oVar.v = 1;
                            if (this.s.c(fVar5, oVar) == aVar11) {
                                return aVar11;
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
                oVar = new in.o(this, cVar);
                Object obj112 = oVar.u;
                b71.a aVar112 = b71.a.r;
                i11 = oVar.v;
                if (i11 != 0) {
                }
                return a0.a;
            case 10:
                if (cVar instanceof kp.i) {
                    iVar4 = (kp.i) cVar;
                    int i45 = iVar4.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        iVar4.v = i45 - Integer.MIN_VALUE;
                        Object obj12 = iVar4.u;
                        b71.a aVar12 = b71.a.r;
                        i12 = iVar4.v;
                        if (i12 != 0) {
                            y.j(obj12);
                            so.g gVar8 = ((so.f) obj).a;
                            qn.g gVar9 = null;
                            if (gVar8 != null && (hVar3 = gVar8.c) != null && (str8 = hVar3.c) != null) {
                                gVar9 = new qn.g(str8, x61.l.r(new String[]{hVar3.b, this.t}));
                            }
                            iVar4.v = 1;
                            if (this.s.c(gVar9, iVar4) == aVar12) {
                                return aVar12;
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
                iVar4 = new kp.i(this, cVar);
                Object obj122 = iVar4.u;
                b71.a aVar122 = b71.a.r;
                i12 = iVar4.v;
                if (i12 != 0) {
                }
                return a0.a;
            case 11:
                if (cVar instanceof kp.k) {
                    kVar2 = (kp.k) cVar;
                    int i46 = kVar2.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        kVar2.v = i46 - Integer.MIN_VALUE;
                        Object obj13 = kVar2.u;
                        b71.a aVar13 = b71.a.r;
                        i13 = kVar2.v;
                        if (i13 != 0) {
                            y.j(obj13);
                            so.l lVar3 = ((so.k) obj).a;
                            qn.g gVar10 = null;
                            if (lVar3 != null && (mVar3 = lVar3.c) != null && (str9 = mVar3.c) != null) {
                                y61.b i47 = d0.i();
                                String str18 = mVar3.b;
                                if (str18 != null) {
                                    i47.add(str18);
                                }
                                i47.add(this.t);
                                gVar10 = new qn.g(str9, d0.h(i47));
                            }
                            kVar2.v = 1;
                            if (this.s.c(gVar10, kVar2) == aVar13) {
                                return aVar13;
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
                kVar2 = new kp.k(this, cVar);
                Object obj132 = kVar2.u;
                b71.a aVar132 = b71.a.r;
                i13 = kVar2.v;
                if (i13 != 0) {
                }
                return a0.a;
            case 12:
                if (cVar instanceof kp.l) {
                    lVar2 = (kp.l) cVar;
                    int i48 = lVar2.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        lVar2.v = i48 - Integer.MIN_VALUE;
                        Object obj14 = lVar2.u;
                        b71.a aVar14 = b71.a.r;
                        i14 = lVar2.v;
                        if (i14 != 0) {
                            y.j(obj14);
                            so.t tVar = ((so.s) obj).a;
                            qn.g gVar11 = null;
                            if (tVar != null && (uVar = tVar.c) != null && (str10 = uVar.c) != null) {
                                gVar11 = new qn.g(str10, x61.l.r(new String[]{String.valueOf(uVar.b), this.t}));
                            }
                            lVar2.v = 1;
                            if (this.s.c(gVar11, lVar2) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj14);
                        }
                        return a0.a;
                    }
                }
                lVar2 = new kp.l(this, cVar);
                Object obj142 = lVar2.u;
                b71.a aVar142 = b71.a.r;
                i14 = lVar2.v;
                if (i14 != 0) {
                }
                return a0.a;
            case 13:
                if (cVar instanceof kp.m) {
                    mVar4 = (kp.m) cVar;
                    int i49 = mVar4.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        mVar4.v = i49 - Integer.MIN_VALUE;
                        Object obj15 = mVar4.u;
                        b71.a aVar15 = b71.a.r;
                        i15 = mVar4.v;
                        if (i15 != 0) {
                            y.j(obj15);
                            so.y yVar = ((x) obj).a;
                            qn.g gVar12 = null;
                            if (yVar != null && (zVar = yVar.c) != null && (str11 = zVar.c) != null) {
                                y61.b i51 = d0.i();
                                String str19 = zVar.b;
                                if (str19 != null) {
                                    i51.add(str19);
                                }
                                i51.add(this.t);
                                gVar12 = new qn.g(str11, d0.h(i51));
                            }
                            mVar4.v = 1;
                            if (this.s.c(gVar12, mVar4) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj15);
                        }
                        return a0.a;
                    }
                }
                mVar4 = new kp.m(this, cVar);
                Object obj152 = mVar4.u;
                b71.a aVar152 = b71.a.r;
                i15 = mVar4.v;
                if (i15 != 0) {
                }
                return a0.a;
            case 14:
                if (cVar instanceof ky.f) {
                    fVar2 = (ky.f) cVar;
                    int i52 = fVar2.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        fVar2.v = i52 - Integer.MIN_VALUE;
                        Object obj16 = fVar2.u;
                        b71.a aVar16 = b71.a.r;
                        i16 = fVar2.v;
                        if (i16 != 0) {
                            y.j(obj16);
                            e4 e4Var2 = (e4) obj;
                            if (e4Var2.a == null && this.t != null) {
                                e4Var2 = null;
                            }
                            if (e4Var2 != null) {
                                fVar2.v = 1;
                                if (this.s.c(e4Var2, fVar2) == aVar16) {
                                    return aVar16;
                                }
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj16);
                        }
                        return a0.a;
                    }
                }
                fVar2 = new ky.f(this, cVar);
                Object obj162 = fVar2.u;
                b71.a aVar162 = b71.a.r;
                i16 = fVar2.v;
                if (i16 != 0) {
                }
                return a0.a;
            case 15:
                if (cVar instanceof ml.b) {
                    bVar = (ml.b) cVar;
                    int i53 = bVar.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i53 - Integer.MIN_VALUE;
                        Object obj17 = bVar.u;
                        b71.a aVar17 = b71.a.r;
                        i17 = bVar.v;
                        if (i17 != 0) {
                            y.j(obj17);
                            ml.n nVar = new ml.n(this.t, (String) obj);
                            bVar.v = 1;
                            if (this.s.c(nVar, bVar) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj17);
                        }
                        return a0.a;
                    }
                }
                bVar = new ml.b(this, cVar);
                Object obj172 = bVar.u;
                b71.a aVar172 = b71.a.r;
                i17 = bVar.v;
                if (i17 != 0) {
                }
                return a0.a;
            case 16:
                if (cVar instanceof w0) {
                    w0Var = (w0) cVar;
                    int i54 = w0Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        w0Var.v = i54 - Integer.MIN_VALUE;
                        Object obj18 = w0Var.u;
                        b71.a aVar18 = b71.a.r;
                        i18 = w0Var.v;
                        if (i18 != 0) {
                            y.j(obj18);
                            if (k71.k.b((String) obj, this.t)) {
                                w0Var.v = 1;
                                if (this.s.c(obj, w0Var) == aVar18) {
                                    return aVar18;
                                }
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj18);
                        }
                        return a0.a;
                    }
                }
                w0Var = new w0(this, cVar);
                Object obj182 = w0Var.u;
                b71.a aVar182 = b71.a.r;
                i18 = w0Var.v;
                if (i18 != 0) {
                }
                return a0.a;
            case 17:
                if (cVar instanceof r20.f) {
                    fVar3 = (r20.f) cVar;
                    int i55 = fVar3.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        fVar3.v = i55 - Integer.MIN_VALUE;
                        Object obj19 = fVar3.u;
                        b71.a aVar19 = b71.a.r;
                        i19 = fVar3.v;
                        if (i19 != 0) {
                            y.j(obj19);
                            d20.c cVar5 = ((d20.b) obj).a;
                            qn.g gVar13 = null;
                            if (cVar5 != null && (dVar3 = cVar5.c) != null && (str12 = dVar3.c) != null) {
                                gVar13 = new qn.g(str12, x61.l.r(new String[]{dVar3.b, this.t}));
                            }
                            fVar3.v = 1;
                            if (this.s.c(gVar13, fVar3) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj19);
                        }
                        return a0.a;
                    }
                }
                fVar3 = new r20.f(this, cVar);
                Object obj192 = fVar3.u;
                b71.a aVar192 = b71.a.r;
                i19 = fVar3.v;
                if (i19 != 0) {
                }
                return a0.a;
            case 18:
                if (cVar instanceof r20.h) {
                    hVar4 = (r20.h) cVar;
                    int i56 = hVar4.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        hVar4.v = i56 - Integer.MIN_VALUE;
                        Object obj20 = hVar4.u;
                        b71.a aVar20 = b71.a.r;
                        i21 = hVar4.v;
                        if (i21 != 0) {
                            y.j(obj20);
                            d20.h hVar7 = ((d20.g) obj).a;
                            qn.g gVar14 = null;
                            if (hVar7 != null && (iVar5 = hVar7.c) != null && (str13 = iVar5.c) != null) {
                                y61.b i57 = d0.i();
                                String str20 = iVar5.b;
                                if (str20 != null) {
                                    i57.add(str20);
                                }
                                i57.add(this.t);
                                gVar14 = new qn.g(str13, d0.h(i57));
                            }
                            hVar4.v = 1;
                            if (this.s.c(gVar14, hVar4) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj20);
                        }
                        return a0.a;
                    }
                }
                hVar4 = new r20.h(this, cVar);
                Object obj202 = hVar4.u;
                b71.a aVar202 = b71.a.r;
                i21 = hVar4.v;
                if (i21 != 0) {
                }
                return a0.a;
            case 19:
                if (cVar instanceof r20.i) {
                    iVar6 = (r20.i) cVar;
                    int i58 = iVar6.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        iVar6.v = i58 - Integer.MIN_VALUE;
                        Object obj21 = iVar6.u;
                        b71.a aVar21 = b71.a.r;
                        i22 = iVar6.v;
                        if (i22 != 0) {
                            y.j(obj21);
                            d20.p pVar3 = ((d20.o) obj).a;
                            qn.g gVar15 = null;
                            if (pVar3 != null && (qVar3 = pVar3.c) != null && (str14 = qVar3.c) != null) {
                                gVar15 = new qn.g(str14, x61.l.r(new String[]{String.valueOf(qVar3.b), this.t}));
                            }
                            iVar6.v = 1;
                            if (this.s.c(gVar15, iVar6) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj21);
                        }
                        return a0.a;
                    }
                }
                iVar6 = new r20.i(this, cVar);
                Object obj212 = iVar6.u;
                b71.a aVar212 = b71.a.r;
                i22 = iVar6.v;
                if (i22 != 0) {
                }
                return a0.a;
            case 20:
                if (cVar instanceof rm0.bShadow) {
                    bVar2 = (rm0.bShadow) cVar;
                    int i59 = bVar2.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        bVar2.v = i59 - Integer.MIN_VALUE;
                        Object obj23 = bVar2.u;
                        b71.a aVar22 = b71.a.r;
                        i23 = bVar2.v;
                        if (i23 != 0) {
                            y.j(obj23);
                            p2 p2Var = (p2) obj;
                            r2 r2Var = p2Var.b;
                            if (r2Var == null || (t2Var = r2Var.c) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid Repository Data", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            v2 v2Var = t2Var.a;
                            s2 s2Var = r2Var.d;
                            if (s2Var == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid Assignee Data", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            wl0.m mVar5 = new wl0.m(p2Var, v2Var, s2Var.a, t71.p.T(this.t));
                            bVar2.v = 1;
                            if (this.s.c(mVar5, bVar2) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj23);
                        }
                        return a0.a;
                    }
                }
                bVar2 = new rm0.bShadow(this, cVar);
                Object obj232 = bVar2.u;
                b71.a aVar222 = b71.a.r;
                i23 = bVar2.v;
                if (i23 != 0) {
                }
                return a0.a;
            case 21:
                if (cVar instanceof u1) {
                    u1Var = (u1) cVar;
                    int i61 = u1Var.v;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        u1Var.v = i61 - Integer.MIN_VALUE;
                        Object obj24 = u1Var.u;
                        b71.a aVar23 = b71.a.r;
                        i24 = u1Var.v;
                        if (i24 != 0) {
                            y.j(obj24);
                            uf0.k kVar3 = (uf0.k) obj;
                            id0.j jVar = null;
                            if (kVar3 != null) {
                                a9.Companion.getClass();
                                jVar = new id0.j(new id0.l(new id0.k(((aa.q) a9.l).a, this.t, uf0.k.a(kVar3, false, (u9) null))));
                            }
                            u1Var.v = 1;
                            if (this.s.c(jVar, u1Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj24);
                        }
                        return a0.a;
                    }
                }
                u1Var = new u1(this, cVar);
                Object obj242 = u1Var.u;
                b71.a aVar232 = b71.a.r;
                i24 = u1Var.v;
                if (i24 != 0) {
                }
                return a0.a;
            case 22:
                if (cVar instanceof x1) {
                    x1Var = (x1) cVar;
                    int i62 = x1Var.v;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        x1Var.v = i62 - Integer.MIN_VALUE;
                        Object obj25 = x1Var.u;
                        b71.a aVar24 = b71.a.r;
                        i25 = x1Var.v;
                        if (i25 != 0) {
                            y.j(obj25);
                            x50 x50Var = ((v50) obj).a;
                            if ((x50Var != null ? x50Var.a : null) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, f1.e.g("Invalid Discussion id: ", this.t), (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            b01.j d = w8.s.d(x50Var.a.c);
                            x1Var.v = 1;
                            if (this.s.c(d, x1Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj25);
                        }
                        return a0.a;
                    }
                }
                x1Var = new x1(this, cVar);
                Object obj252 = x1Var.u;
                b71.a aVar242 = b71.a.r;
                i25 = x1Var.v;
                if (i25 != 0) {
                }
                return a0.a;
            case 23:
                if (cVar instanceof z1) {
                    z1Var = (z1) cVar;
                    int i63 = z1Var.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        z1Var.v = i63 - Integer.MIN_VALUE;
                        Object obj26 = z1Var.u;
                        b71.a aVar25 = b71.a.r;
                        i26 = z1Var.v;
                        if (i26 != 0) {
                            y.j(obj26);
                            n50 n50Var = ((l50) obj).a;
                            if ((n50Var != null ? n50Var.a : null) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid Discussion id: ".concat(this.t), (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            b01.e eVar = w8.s.d(n50Var.a.c).c.m;
                            z1Var.v = 1;
                            if (this.s.c(eVar, z1Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj26);
                        }
                        return a0.a;
                    }
                }
                z1Var = new z1(this, cVar);
                Object obj262 = z1Var.u;
                b71.a aVar252 = b71.a.r;
                i26 = z1Var.v;
                if (i26 != 0) {
                }
                return a0.a;
            case 24:
                if (cVar instanceof w5) {
                    w5Var = (w5) cVar;
                    int i64 = w5Var.v;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        w5Var.v = i64 - Integer.MIN_VALUE;
                        Object obj27 = w5Var.u;
                        b71.a aVar26 = b71.a.r;
                        i27 = w5Var.v;
                        if (i27 != 0) {
                            y.j(obj27);
                            m3 m3Var = (m3) obj;
                            if (m3Var.a == null && this.t != null) {
                                m3Var = null;
                            }
                            if (m3Var != null) {
                                w5Var.v = 1;
                                if (this.s.c(m3Var, w5Var) == aVar26) {
                                    return aVar26;
                                }
                            }
                        } else {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj27);
                        }
                        return a0.a;
                    }
                }
                w5Var = new w5(this, cVar);
                Object obj272 = w5Var.u;
                b71.a aVar262 = b71.a.r;
                i27 = w5Var.v;
                if (i27 != 0) {
                }
                return a0.a;
            case 25:
                if (cVar instanceof t00.f) {
                    fVar4 = (t00.f) cVar;
                    int i65 = fVar4.v;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        fVar4.v = i65 - Integer.MIN_VALUE;
                        Object obj28 = fVar4.u;
                        b71.a aVar27 = b71.a.r;
                        i28 = fVar4.v;
                        if (i28 != 0) {
                            y.j(obj28);
                            a3 a3Var = (a3) obj;
                            c3 c3Var = a3Var.b;
                            if (c3Var == null || (h3Var = c3Var.c) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid Repository Data", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            j3 j3Var = h3Var.a;
                            d3 d3Var = c3Var.d;
                            if (d3Var == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid Assignee Data", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            fz.m mVar6 = new fz.m(a3Var, j3Var, d3Var.a, t71.p.T(this.t));
                            fVar4.v = 1;
                            if (this.s.c(mVar6, fVar4) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i28 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj28);
                        }
                        return a0.a;
                    }
                }
                fVar4 = new t00.f(this, cVar);
                Object obj282 = fVar4.u;
                b71.a aVar272 = b71.a.r;
                i28 = fVar4.v;
                if (i28 != 0) {
                }
                return a0.a;
            case 26:
                return a(cVar, obj);
            case 27:
                return b(cVar, obj);
            case 28:
                return d(cVar, obj);
            default:
                if (cVar instanceof x5) {
                    x5Var = (x5) cVar;
                    int i66 = x5Var.v;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        x5Var.v = i66 - Integer.MIN_VALUE;
                        Object obj29 = x5Var.u;
                        b71.a aVar28 = b71.a.r;
                        i29 = x5Var.v;
                        if (i29 != 0) {
                            y.j(obj29);
                            m3 m3Var2 = (m3) obj;
                            if (m3Var2.a == null && this.t != null) {
                                m3Var2 = null;
                            }
                            if (m3Var2 != null) {
                                x5Var.v = 1;
                                if (this.s.c(m3Var2, x5Var) == aVar28) {
                                    return aVar28;
                                }
                            }
                        } else {
                            if (i29 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj29);
                        }
                        return a0.a;
                    }
                }
                x5Var = new x5(this, cVar);
                Object obj292 = x5Var.u;
                b71.a aVar282 = b71.a.r;
                i29 = x5Var.v;
                if (i29 != 0) {
                }
                return a0.a;
        }
    }
}
