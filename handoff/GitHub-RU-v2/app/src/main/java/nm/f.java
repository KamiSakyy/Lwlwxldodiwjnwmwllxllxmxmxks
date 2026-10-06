package nm;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.MobileAuthRequestType;
import com.github.service.models.response.type.PullRequestReviewCommentState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.z3;
import g20.m1;
import j20.n;
import java.io.File;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kc0.il;
import kc0.j00;
import kc0.jl;
import kc0.kl;
import kc0.l00;
import kc0.m00;
import kc0.o0;
import kc0.r0;
import kc0.ry;
import kc0.s0;
import kc0.sy;
import kc0.t0;
import kc0.ty;
import kc0.u0;
import kotlin.NoWhenBranchMatchedException;
import lz0.r;
import lz0.u;
import r20.l;
import r20.o;
import r20.p;
import r20.q;
import ri0.o7;
import ri0.p7;
import ri0.q7;
import ri0.r7;
import ri0.s7;
import rm0.b0;
import rm0.d0;
import rm0.g0;
import rm0.t;
import rm0.v;
import rm0.w;
import rm0.xShadow;
import sy.y;
import v8.l0;
import w61.a0;
import wk0.c1;
import x61.m;
import yz0.b2;
import yz0.g4;
import yz0.o6;
import yz0.s;
import yz0.x2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ f(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        d0 d0Var;
        int i;
        kl klVar;
        if (cVar instanceof d0) {
            d0Var = (d0) cVar;
            int i2 = d0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = d0Var.u;
                b71.a aVar = b71.a.r;
                i = d0Var.v;
                if (i != 0) {
                    y.j(obj2);
                    jl jlVar = ((il) obj).a;
                    x2 j = (jlVar == null || (klVar = jlVar.a) == null) ? null : l0.j(klVar.c);
                    if (j != null) {
                        d0Var.v = 1;
                        if (this.s.c(j, d0Var) == aVar) {
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
        d0Var = new d0(this, cVar);
        Object obj22 = d0Var.u;
        b71.a aVar2 = b71.a.r;
        i = d0Var.v;
        if (i != 0) {
        }
        return a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:364:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x05d0  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0601  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x065d  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x066c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0702  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0753  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x0792  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x07e0  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x083c  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x084a  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x08c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:611:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0913  */
    /* JADX WARN: Removed duplicated region for block: B:635:0x0955  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0963  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0999  */
    /* JADX WARN: Removed duplicated region for block: B:658:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:673:0x09ed  */
    /* JADX WARN: Removed duplicated region for block: B:679:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x0a34  */
    /* JADX WARN: Removed duplicated region for block: B:696:0x0a42  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:711:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:717:0x0a8f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        e eVar;
        int i;
        o20.a aVar;
        int i2;
        o20.b bVar;
        int i3;
        o20.c cVar2;
        int i4;
        o20.f fVar;
        int i5;
        o20.g gVar;
        int i6;
        j20.i iVar;
        o20.h hVar;
        int i7;
        n nVar;
        o20.j jVar;
        int i8;
        b20.g gVar2;
        b20.i iVar2;
        b20.g gVar3;
        m1 m1Var;
        b20.g gVar4;
        b20.h hVar2;
        oz0.a aVar2;
        int i9;
        ZonedDateTime plusDays;
        oz0.b bVar2;
        int i11;
        ZonedDateTime plusDays2;
        oz0.c cVar3;
        int i12;
        oz0.d dVar;
        int i13;
        oz0.e eVar2;
        int i14;
        f11.b bVar3;
        r rVar;
        MobileAuthRequestType mobileAuthRequestType;
        oz0.f fVar2;
        int i15;
        oz0.g gVar5;
        int i16;
        r20.g gVar6;
        int i17;
        l lVar;
        int i18;
        o oVar;
        int i19;
        p pVar;
        int i21;
        q qVar;
        int i22;
        rm0.d dVar2;
        int i23;
        yl0.a aVar3;
        rm0.e eVar3;
        int i24;
        yd0.b bVar4;
        yd0.a aVar4;
        j00 j00Var;
        t tVar;
        int i25;
        o6 p;
        kc0.b bVar5;
        kc0.e eVar4;
        v vVar;
        int i26;
        w wVar;
        int i27;
        f01.g gVar7;
        String str;
        DiffLineType diffLineType;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        q7 q7Var;
        List list;
        o7 o7Var;
        List list2;
        o7 o7Var2;
        xShadow xVar;
        int i28;
        rm0.a0 a0Var;
        int i29;
        b0 b0Var;
        int i31;
        g0 g0Var;
        int i32;
        ty tyVar;
        switch (this.r) {
            case 0:
                if (cVar instanceof e) {
                    eVar = (e) cVar;
                    int i33 = eVar.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i33 - Integer.MIN_VALUE;
                        Object obj2 = eVar.u;
                        b71.a aVar5 = b71.a.r;
                        i = eVar.v;
                        a0 a0Var2 = a0.a;
                        if (i != 0) {
                            y.j(obj2);
                            eVar.v = 1;
                            if (this.s.c(a0Var2, eVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj2);
                        }
                        return a0Var2;
                    }
                }
                eVar = new e(this, cVar);
                Object obj22 = eVar.u;
                b71.a aVar52 = b71.a.r;
                i = eVar.v;
                a0 a0Var22 = a0.a;
                if (i != 0) {
                }
                return a0Var22;
            case 1:
                if (cVar instanceof o20.a) {
                    aVar = (o20.a) cVar;
                    int i34 = aVar.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i34 - Integer.MIN_VALUE;
                        Object obj3 = aVar.u;
                        b71.a aVar6 = b71.a.r;
                        i2 = aVar.v;
                        if (i2 != 0) {
                            y.j(obj3);
                            j20.f fVar3 = ((j20.g) obj).a;
                            String str3 = fVar3 != null ? fVar3.a : null;
                            aVar.v = 1;
                            if (this.s.c(str3, aVar) == aVar6) {
                                return aVar6;
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
                aVar = new o20.a(this, cVar);
                Object obj32 = aVar.u;
                b71.a aVar62 = b71.a.r;
                i2 = aVar.v;
                if (i2 != 0) {
                }
                return a0.a;
            case 2:
                if (cVar instanceof o20.b) {
                    bVar = (o20.b) cVar;
                    int i35 = bVar.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i35 - Integer.MIN_VALUE;
                        Object obj4 = bVar.u;
                        b71.a aVar7 = b71.a.r;
                        i3 = bVar.v;
                        if (i3 != 0) {
                            y.j(obj4);
                            File file = new File((String) obj);
                            bVar.v = 1;
                            if (this.s.c(file, bVar) == aVar7) {
                                return aVar7;
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
                bVar = new o20.b(this, cVar);
                Object obj42 = bVar.u;
                b71.a aVar72 = b71.a.r;
                i3 = bVar.v;
                if (i3 != 0) {
                }
                return a0.a;
            case 3:
                if (cVar instanceof o20.c) {
                    cVar2 = (o20.c) cVar;
                    int i36 = cVar2.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i36 - Integer.MIN_VALUE;
                        Object obj5 = cVar2.u;
                        b71.a aVar8 = b71.a.r;
                        i4 = cVar2.v;
                        if (i4 != 0) {
                            y.j(obj5);
                            j20.a aVar9 = ((j20.c) obj).a;
                            Boolean valueOf = Boolean.valueOf(aVar9 != null ? k71.k.b(aVar9.a, Boolean.TRUE) : false);
                            cVar2.v = 1;
                            if (this.s.c(valueOf, cVar2) == aVar8) {
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
                cVar2 = new o20.c(this, cVar);
                Object obj52 = cVar2.u;
                b71.a aVar82 = b71.a.r;
                i4 = cVar2.v;
                if (i4 != 0) {
                }
                return a0.a;
            case 4:
                if (cVar instanceof o20.f) {
                    fVar = (o20.f) cVar;
                    int i37 = fVar.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i37 - Integer.MIN_VALUE;
                        Object obj6 = fVar.u;
                        b71.a aVar10 = b71.a.r;
                        i5 = fVar.v;
                        if (i5 != 0) {
                            y.j(obj6);
                            String str4 = ((b20.t) obj).a;
                            fVar.v = 1;
                            if (this.s.c(str4, fVar) == aVar10) {
                                return aVar10;
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
                fVar = new o20.f(this, cVar);
                Object obj62 = fVar.u;
                b71.a aVar102 = b71.a.r;
                i5 = fVar.v;
                if (i5 != 0) {
                }
                return a0.a;
            case 5:
                if (cVar instanceof o20.g) {
                    gVar = (o20.g) cVar;
                    int i38 = gVar.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        gVar.v = i38 - Integer.MIN_VALUE;
                        Object obj7 = gVar.u;
                        b71.a aVar11 = b71.a.r;
                        i6 = gVar.v;
                        if (i6 != 0) {
                            y.j(obj7);
                            j20.l lVar2 = ((j20.k) obj).a;
                            String str5 = (lVar2 == null || (iVar = lVar2.a) == null) ? null : iVar.a;
                            if (str5 != null) {
                                gVar.v = 1;
                                if (this.s.c(str5, gVar) == aVar11) {
                                    return aVar11;
                                }
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
                gVar = new o20.g(this, cVar);
                Object obj72 = gVar.u;
                b71.a aVar112 = b71.a.r;
                i6 = gVar.v;
                if (i6 != 0) {
                }
                return a0.a;
            case 6:
                if (cVar instanceof o20.h) {
                    hVar = (o20.h) cVar;
                    int i39 = hVar.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i39 - Integer.MIN_VALUE;
                        Object obj8 = hVar.u;
                        b71.a aVar12 = b71.a.r;
                        i7 = hVar.v;
                        if (i7 != 0) {
                            y.j(obj8);
                            j20.q qVar2 = ((j20.p) obj).a;
                            String str6 = (qVar2 == null || (nVar = qVar2.a) == null) ? null : nVar.a;
                            if (str6 != null) {
                                hVar.v = 1;
                                if (this.s.c(str6, hVar) == aVar12) {
                                    return aVar12;
                                }
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
                hVar = new o20.h(this, cVar);
                Object obj82 = hVar.u;
                b71.a aVar122 = b71.a.r;
                i7 = hVar.v;
                if (i7 != 0) {
                }
                return a0.a;
            case 7:
                if (cVar instanceof o20.j) {
                    jVar = (o20.j) cVar;
                    int i41 = jVar.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        jVar.v = i41 - Integer.MIN_VALUE;
                        Object obj9 = jVar.u;
                        b71.a aVar13 = b71.a.r;
                        i8 = jVar.v;
                        if (i8 != 0) {
                            y.j(obj9);
                            b20.e eVar5 = (b20.e) obj;
                            mn.d dVar3 = null;
                            dVar3 = null;
                            dVar3 = null;
                            if (eVar5 != null && (gVar4 = eVar5.a) != null && (hVar2 = gVar4.c) != null) {
                                b20.o oVar2 = hVar2.b.e;
                                dVar3 = i20.a.d(hVar2, oVar2 != null ? oVar2.c.b : null);
                            } else if (eVar5 != null && (gVar3 = eVar5.a) != null && (m1Var = gVar3.e) != null) {
                                dVar3 = i20.a.f(m1Var);
                            } else if (eVar5 != null && (gVar2 = eVar5.a) != null && (iVar2 = gVar2.d) != null) {
                                dVar3 = i20.a.e(iVar2);
                            }
                            jVar.v = 1;
                            if (this.s.c(dVar3, jVar) == aVar13) {
                                return aVar13;
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
                jVar = new o20.j(this, cVar);
                Object obj92 = jVar.u;
                b71.a aVar132 = b71.a.r;
                i8 = jVar.v;
                if (i8 != 0) {
                }
                return a0.a;
            case 8:
                if (cVar instanceof oz0.a) {
                    aVar2 = (oz0.a) cVar;
                    int i42 = aVar2.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        aVar2.v = i42 - Integer.MIN_VALUE;
                        Object obj10 = aVar2.u;
                        b71.a aVar14 = b71.a.r;
                        i9 = aVar2.v;
                        if (i9 != 0) {
                            y.j(obj10);
                            lz0.a aVar15 = ((lz0.c) obj).a;
                            if (aVar15 == null || (plusDays = aVar15.a) == null) {
                                plusDays = ZonedDateTime.now().plusDays(30L);
                            }
                            k71.k.d(plusDays);
                            f11.d dVar4 = new f11.d(plusDays);
                            aVar2.v = 1;
                            if (this.s.c(dVar4, aVar2) == aVar14) {
                                return aVar14;
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
                aVar2 = new oz0.a(this, cVar);
                Object obj102 = aVar2.u;
                b71.a aVar142 = b71.a.r;
                i9 = aVar2.v;
                if (i9 != 0) {
                }
                return a0.a;
            case 9:
                if (cVar instanceof oz0.b) {
                    bVar2 = (oz0.b) cVar;
                    int i43 = bVar2.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        bVar2.v = i43 - Integer.MIN_VALUE;
                        Object obj11 = bVar2.u;
                        b71.a aVar16 = b71.a.r;
                        i11 = bVar2.v;
                        if (i11 != 0) {
                            y.j(obj11);
                            lz0.a aVar17 = ((lz0.c) obj).a;
                            if (aVar17 == null || (plusDays2 = aVar17.a) == null) {
                                plusDays2 = ZonedDateTime.now().plusDays(30L);
                            }
                            k71.k.d(plusDays2);
                            f11.d dVar5 = new f11.d(plusDays2);
                            bVar2.v = 1;
                            if (this.s.c(dVar5, bVar2) == aVar16) {
                                return aVar16;
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
                bVar2 = new oz0.b(this, cVar);
                Object obj112 = bVar2.u;
                b71.a aVar162 = b71.a.r;
                i11 = bVar2.v;
                if (i11 != 0) {
                }
                return a0.a;
            case 10:
                if (cVar instanceof oz0.c) {
                    cVar3 = (oz0.c) cVar;
                    int i44 = cVar3.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        cVar3.v = i44 - Integer.MIN_VALUE;
                        Object obj12 = cVar3.u;
                        b71.a aVar18 = b71.a.r;
                        i12 = cVar3.v;
                        a0 a0Var3 = a0.a;
                        if (i12 != 0) {
                            y.j(obj12);
                            cVar3.v = 1;
                            if (this.s.c(a0Var3, cVar3) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj12);
                        }
                        return a0Var3;
                    }
                }
                cVar3 = new oz0.c(this, cVar);
                Object obj122 = cVar3.u;
                b71.a aVar182 = b71.a.r;
                i12 = cVar3.v;
                a0 a0Var32 = a0.a;
                if (i12 != 0) {
                }
                return a0Var32;
            case 11:
                if (cVar instanceof oz0.d) {
                    dVar = (oz0.d) cVar;
                    int i45 = dVar.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i45 - Integer.MIN_VALUE;
                        Object obj13 = dVar.u;
                        b71.a aVar19 = b71.a.r;
                        i13 = dVar.v;
                        a0 a0Var4 = a0.a;
                        if (i13 != 0) {
                            y.j(obj13);
                            dVar.v = 1;
                            if (this.s.c(a0Var4, dVar) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj13);
                        }
                        return a0Var4;
                    }
                }
                dVar = new oz0.d(this, cVar);
                Object obj132 = dVar.u;
                b71.a aVar192 = b71.a.r;
                i13 = dVar.v;
                a0 a0Var42 = a0.a;
                if (i13 != 0) {
                }
                return a0Var42;
            case 12:
                if (cVar instanceof oz0.e) {
                    eVar2 = (oz0.e) cVar;
                    int i46 = eVar2.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        eVar2.v = i46 - Integer.MIN_VALUE;
                        Object obj14 = eVar2.u;
                        b71.a aVar20 = b71.a.r;
                        i14 = eVar2.v;
                        if (i14 != 0) {
                            y.j(obj14);
                            lz0.v vVar2 = ((lz0.t) obj).a;
                            u uVar = vVar2.d;
                            String str7 = vVar2.a;
                            if (str7.length() == 0 && (str7 = vVar2.b) == null) {
                                str7 = "";
                            }
                            String str8 = str7;
                            if (uVar == null || (rVar = uVar.c) == null) {
                                bVar3 = null;
                            } else {
                                int i47 = rVar.a;
                                String str9 = rVar.b;
                                String str10 = vVar2.c;
                                boolean z4 = rVar.c;
                                int ordinal = rVar.d.ordinal();
                                if (ordinal == 0) {
                                    mobileAuthRequestType = MobileAuthRequestType.DEVICE_VERIFICATION;
                                } else if (ordinal == 1) {
                                    mobileAuthRequestType = MobileAuthRequestType.TWO_FACTOR_LOGIN;
                                } else if (ordinal == 2) {
                                    mobileAuthRequestType = MobileAuthRequestType.TWO_FACTOR_PASSWORD_RESET;
                                } else if (ordinal == 3) {
                                    mobileAuthRequestType = MobileAuthRequestType.TWO_FACTOR_SUDO_CHALLENGE;
                                } else {
                                    if (ordinal != 4 && ordinal != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    mobileAuthRequestType = MobileAuthRequestType.UNKNOWN;
                                }
                                bVar3 = new f11.b(i47, str9, str8, str10, z4, mobileAuthRequestType);
                            }
                            f11.c cVar4 = new f11.c(uVar != null ? uVar.a : true, bVar3);
                            eVar2.v = 1;
                            if (this.s.c(cVar4, eVar2) == aVar20) {
                                return aVar20;
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
                eVar2 = new oz0.e(this, cVar);
                Object obj142 = eVar2.u;
                b71.a aVar202 = b71.a.r;
                i14 = eVar2.v;
                if (i14 != 0) {
                }
                return a0.a;
            case 13:
                if (cVar instanceof oz0.f) {
                    fVar2 = (oz0.f) cVar;
                    int i48 = fVar2.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        fVar2.v = i48 - Integer.MIN_VALUE;
                        Object obj15 = fVar2.u;
                        b71.a aVar21 = b71.a.r;
                        i15 = fVar2.v;
                        if (i15 != 0) {
                            y.j(obj15);
                            lz0.o oVar3 = ((lz0.n) obj).a.a;
                            boolean z5 = false;
                            boolean z6 = oVar3 != null && oVar3.b;
                            if (oVar3 != null && oVar3.a) {
                                z5 = true;
                            }
                            f11.a aVar22 = new f11.a(z5, z6);
                            fVar2.v = 1;
                            if (this.s.c(aVar22, fVar2) == aVar21) {
                                return aVar21;
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
                fVar2 = new oz0.f(this, cVar);
                Object obj152 = fVar2.u;
                b71.a aVar212 = b71.a.r;
                i15 = fVar2.v;
                if (i15 != 0) {
                }
                return a0.a;
            case 14:
                if (cVar instanceof oz0.g) {
                    gVar5 = (oz0.g) cVar;
                    int i49 = gVar5.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        gVar5.v = i49 - Integer.MIN_VALUE;
                        Object obj16 = gVar5.u;
                        b71.a aVar23 = b71.a.r;
                        i16 = gVar5.v;
                        a0 a0Var5 = a0.a;
                        if (i16 != 0) {
                            y.j(obj16);
                            gVar5.v = 1;
                            if (this.s.c(a0Var5, gVar5) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj16);
                        }
                        return a0Var5;
                    }
                }
                gVar5 = new oz0.g(this, cVar);
                Object obj162 = gVar5.u;
                b71.a aVar232 = b71.a.r;
                i16 = gVar5.v;
                a0 a0Var52 = a0.a;
                if (i16 != 0) {
                }
                return a0Var52;
            case 15:
                if (cVar instanceof r20.g) {
                    gVar6 = (r20.g) cVar;
                    int i51 = gVar6.v;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        gVar6.v = i51 - Integer.MIN_VALUE;
                        Object obj17 = gVar6.u;
                        b71.a aVar24 = b71.a.r;
                        i17 = gVar6.v;
                        if (i17 != 0) {
                            y.j(obj17);
                            String str11 = ((d20.l) obj).a;
                            gVar6.v = 1;
                            if (this.s.c(str11, gVar6) == aVar24) {
                                return aVar24;
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
                gVar6 = new r20.g(this, cVar);
                Object obj172 = gVar6.u;
                b71.a aVar242 = b71.a.r;
                i17 = gVar6.v;
                if (i17 != 0) {
                }
                return a0.a;
            case 16:
                if (cVar instanceof l) {
                    lVar = (l) cVar;
                    int i52 = lVar.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        lVar.v = i52 - Integer.MIN_VALUE;
                        Object obj18 = lVar.u;
                        b71.a aVar25 = b71.a.r;
                        i18 = lVar.v;
                        if (i18 != 0) {
                            y.j(obj18);
                            String str12 = (String) obj;
                            if (k71.k.b(str12, "APOLLO_ALIVE_SERVICE_IO")) {
                                throw new ApiFailure(ApiFailureType.HTTP_ERROR, "io error on socket", (String) null, new Integer(0), (ArrayList) null, (Map) null, (Throwable) null, 112);
                            }
                            lVar.v = 1;
                            if (this.s.c(str12, lVar) == aVar25) {
                                return aVar25;
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
                lVar = new l(this, cVar);
                Object obj182 = lVar.u;
                b71.a aVar252 = b71.a.r;
                i18 = lVar.v;
                if (i18 != 0) {
                }
                return a0.a;
            case 17:
                if (cVar instanceof o) {
                    oVar = (o) cVar;
                    int i53 = oVar.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i53 - Integer.MIN_VALUE;
                        Object obj19 = oVar.u;
                        b71.a aVar26 = b71.a.r;
                        i19 = oVar.v;
                        if (i19 != 0) {
                            y.j(obj19);
                            if (obj instanceof qn.d) {
                                oVar.v = 1;
                                if (this.s.c(obj, oVar) == aVar26) {
                                    return aVar26;
                                }
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
                oVar = new o(this, cVar);
                Object obj192 = oVar.u;
                b71.a aVar262 = b71.a.r;
                i19 = oVar.v;
                if (i19 != 0) {
                }
                return a0.a;
            case 18:
                if (cVar instanceof p) {
                    pVar = (p) cVar;
                    int i54 = pVar.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        pVar.v = i54 - Integer.MIN_VALUE;
                        Object obj20 = pVar.u;
                        b71.a aVar27 = b71.a.r;
                        i21 = pVar.v;
                        if (i21 != 0) {
                            y.j(obj20);
                            a.a L = aa1.b.L((String) obj);
                            pVar.v = 1;
                            if (this.s.c(L, pVar) == aVar27) {
                                return aVar27;
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
                pVar = new p(this, cVar);
                Object obj202 = pVar.u;
                b71.a aVar272 = b71.a.r;
                i21 = pVar.v;
                if (i21 != 0) {
                }
                return a0.a;
            case 19:
                if (cVar instanceof q) {
                    qVar = (q) cVar;
                    int i55 = qVar.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        qVar.v = i55 - Integer.MIN_VALUE;
                        Object obj21 = qVar.u;
                        b71.a aVar28 = b71.a.r;
                        i22 = qVar.v;
                        if (i22 != 0) {
                            y.j(obj21);
                            qn.f fVar4 = ((qn.d) obj).c;
                            qVar.v = 1;
                            if (this.s.c(fVar4, qVar) == aVar28) {
                                return aVar28;
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
                qVar = new q(this, cVar);
                Object obj212 = qVar.u;
                b71.a aVar282 = b71.a.r;
                i22 = qVar.v;
                if (i22 != 0) {
                }
                return a0.a;
            case 20:
                if (cVar instanceof rm0.d) {
                    dVar2 = (rm0.d) cVar;
                    int i56 = dVar2.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        dVar2.v = i56 - Integer.MIN_VALUE;
                        Object obj23 = dVar2.u;
                        b71.a aVar29 = b71.a.r;
                        i23 = dVar2.v;
                        if (i23 != 0) {
                            y.j(obj23);
                            ld0.f fVar5 = ((ld0.c) obj).a;
                            if (fVar5 != null) {
                                int i57 = fVar5.b;
                                ld0.a aVar30 = fVar5.c;
                                x61.r rVar2 = aVar30.c;
                                if (rVar2 == null) {
                                    rVar2 = x61.r.r;
                                }
                                ArrayList S = m.S(rVar2);
                                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                                int size = S.size();
                                int i58 = 0;
                                while (i58 < size) {
                                    Object obj24 = S.get(i58);
                                    i58++;
                                    ld0.d dVar6 = (ld0.d) obj24;
                                    k71.k.g(dVar6, "<this>");
                                    c1 c1Var = dVar6.c;
                                    String str13 = c1Var.d;
                                    Avatar O = b41.b.O(c1Var.g);
                                    String str14 = c1Var.b;
                                    String str15 = c1Var.c;
                                    if (str15 == null) {
                                        str15 = "";
                                    }
                                    arrayList.add(new b2(str13, O, str14, str15, false, false, 112));
                                }
                                ld0.e eVar6 = aVar30.a;
                                aVar3 = new yl0.a(i57, arrayList, new x01.i(eVar6.b, eVar6.a, false));
                            } else {
                                aVar3 = null;
                            }
                            if (aVar3 != null) {
                                dVar2.v = 1;
                                if (this.s.c(aVar3, dVar2) == aVar29) {
                                    return aVar29;
                                }
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
                dVar2 = new rm0.d(this, cVar);
                Object obj232 = dVar2.u;
                b71.a aVar292 = b71.a.r;
                i23 = dVar2.v;
                if (i23 != 0) {
                }
                return a0.a;
            case 21:
                if (cVar instanceof rm0.e) {
                    eVar3 = (rm0.e) cVar;
                    int i59 = eVar3.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        eVar3.v = i59 - Integer.MIN_VALUE;
                        Object obj25 = eVar3.u;
                        b71.a aVar31 = b71.a.r;
                        i24 = eVar3.v;
                        if (i24 != 0) {
                            y.j(obj25);
                            m00 m00Var = ((l00) obj).a;
                            yd0.c cVar5 = (m00Var == null || (j00Var = m00Var.a) == null) ? null : j00Var.b;
                            ArrayList a = (cVar5 == null || (aVar4 = cVar5.b) == null) ? (cVar5 == null || (bVar4 = cVar5.c) == null) ? x61.r.r : a.a.a(bVar4.c) : a.a.a(aVar4.c);
                            eVar3.v = 1;
                            if (this.s.c(a, eVar3) == aVar31) {
                                return aVar31;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj25);
                        }
                        return a0.a;
                    }
                }
                eVar3 = new rm0.e(this, cVar);
                Object obj252 = eVar3.u;
                b71.a aVar312 = b71.a.r;
                i24 = eVar3.v;
                if (i24 != 0) {
                }
                return a0.a;
            case 22:
                if (cVar instanceof t) {
                    tVar = (t) cVar;
                    int i61 = tVar.v;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        tVar.v = i61 - Integer.MIN_VALUE;
                        Object obj26 = tVar.u;
                        b71.a aVar32 = b71.a.r;
                        i25 = tVar.v;
                        if (i25 != 0) {
                            y.j(obj26);
                            kc0.a aVar33 = ((kc0.d) obj).a;
                            og0.a aVar34 = (aVar33 == null || (bVar5 = aVar33.a) == null || (eVar4 = bVar5.a) == null) ? null : eVar4.c;
                            if (aVar34 == null) {
                                s.Companion.getClass();
                                yz0.q qVar3 = yz0.r.b;
                                x2.Companion.getClass();
                                p = new o6(qVar3);
                            } else {
                                p = b31.b.p(aVar34);
                            }
                            tVar.v = 1;
                            if (this.s.c(p, tVar) == aVar32) {
                                return aVar32;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj26);
                        }
                        return a0.a;
                    }
                }
                tVar = new t(this, cVar);
                Object obj262 = tVar.u;
                b71.a aVar322 = b71.a.r;
                i25 = tVar.v;
                if (i25 != 0) {
                }
                return a0.a;
            case 23:
                if (cVar instanceof v) {
                    vVar = (v) cVar;
                    int i62 = vVar.v;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        vVar.v = i62 - Integer.MIN_VALUE;
                        Object obj27 = vVar.u;
                        b71.a aVar35 = b71.a.r;
                        i26 = vVar.v;
                        if (i26 != 0) {
                            y.j(obj27);
                            o0 o0Var = ((r0) obj).a;
                            u0 u0Var = o0Var != null ? o0Var.a : null;
                            if (u0Var != null) {
                                vVar.v = 1;
                                if (this.s.c(u0Var, vVar) == aVar35) {
                                    return aVar35;
                                }
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj27);
                        }
                        return a0.a;
                    }
                }
                vVar = new v(this, cVar);
                Object obj272 = vVar.u;
                b71.a aVar352 = b71.a.r;
                i26 = vVar.v;
                if (i26 != 0) {
                }
                return a0.a;
            case 24:
                if (cVar instanceof w) {
                    wVar = (w) cVar;
                    int i63 = wVar.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        wVar.v = i63 - Integer.MIN_VALUE;
                        Object obj28 = wVar.u;
                        b71.a aVar36 = b71.a.r;
                        i27 = wVar.v;
                        if (i27 != 0) {
                            y.j(obj28);
                            u0 u0Var2 = (u0) obj;
                            t0 t0Var = u0Var2.b;
                            List list3 = u0Var2.c.a;
                            s0 s0Var = list3 != null ? (s0) m.W(list3) : null;
                            if (s0Var != null) {
                                s7 s7Var = s0Var.c;
                                r7 r7Var = s7Var.e;
                                se0.c cVar6 = s7Var.i;
                                p7 p7Var = s7Var.d;
                                String str16 = p7Var != null ? p7Var.a : null;
                                String str17 = r7Var != null ? r7Var.b : "";
                                aj0.c cVar7 = s7Var.j;
                                String str18 = str17;
                                qh0.a aVar37 = s7Var.m;
                                String str19 = s7Var.f;
                                PullRequestReviewCommentState t = t.e.t(s7Var.g);
                                if (r7Var == null || (list2 = r7Var.g) == null || (o7Var2 = (o7) m.f0(list2)) == null) {
                                    str = null;
                                } else {
                                    str = s7Var.c == null ? null : b4.a0(o7Var2.b);
                                }
                                String str20 = s7Var.h;
                                boolean z7 = s7Var.k.b;
                                if (r7Var == null || (list = r7Var.g) == null || (o7Var = (o7) m.f0(list)) == null || (diffLineType = sy.w.z(o7Var.b.a)) == null) {
                                    diffLineType = DiffLineType.UNKNOWN__;
                                }
                                DiffLineType diffLineType2 = diffLineType;
                                yi0.a aVar38 = r7Var != null ? r7Var.h : null;
                                String str21 = t0Var.b;
                                String str22 = t0Var.c;
                                if (r7Var != null) {
                                    str2 = str21;
                                    if (r7Var.c) {
                                        z = true;
                                        String str23 = (r7Var != null || (q7Var = r7Var.d) == null) ? "" : q7Var.a;
                                        if (r7Var == null) {
                                            z2 = true;
                                            if (r7Var.e) {
                                                z3 = true;
                                                gVar7 = b4.b(cVar6, str18, str16, cVar7, aVar37, str19, t, str, str20, z7, diffLineType2, aVar38, str2, str22, true, z, str23, z3, r7Var == null && r7Var.f == z2, (yh0.a) null, b4.l0(u0Var2.a));
                                            }
                                        } else {
                                            z2 = true;
                                        }
                                        z3 = false;
                                        gVar7 = b4.b(cVar6, str18, str16, cVar7, aVar37, str19, t, str, str20, z7, diffLineType2, aVar38, str2, str22, true, z, str23, z3, r7Var == null && r7Var.f == z2, (yh0.a) null, b4.l0(u0Var2.a));
                                    }
                                } else {
                                    str2 = str21;
                                }
                                z = false;
                                if (r7Var != null) {
                                }
                                if (r7Var == null) {
                                }
                                z3 = false;
                                gVar7 = b4.b(cVar6, str18, str16, cVar7, aVar37, str19, t, str, str20, z7, diffLineType2, aVar38, str2, str22, true, z, str23, z3, r7Var == null && r7Var.f == z2, (yh0.a) null, b4.l0(u0Var2.a));
                            } else {
                                gVar7 = null;
                            }
                            if (gVar7 != null) {
                                wVar.v = 1;
                                if (this.s.c(gVar7, wVar) == aVar36) {
                                    return aVar36;
                                }
                            }
                        } else {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj28);
                        }
                        return a0.a;
                    }
                }
                wVar = new w(this, cVar);
                Object obj282 = wVar.u;
                b71.a aVar362 = b71.a.r;
                i27 = wVar.v;
                if (i27 != 0) {
                }
                return a0.a;
            case 25:
                if (cVar instanceof x) {
                    xVar = (xShadow) cVar;
                    int i64 = xVar.v;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        xVar.v = i64 - Integer.MIN_VALUE;
                        Object obj29 = xVar.u;
                        b71.a aVar39 = b71.a.r;
                        i28 = xVar.v;
                        if (i28 != 0) {
                            y.j(obj29);
                            Boolean bool = Boolean.TRUE;
                            xVar.v = 1;
                            if (this.s.c(bool, xVar) == aVar39) {
                                return aVar39;
                            }
                        } else {
                            if (i28 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj29);
                        }
                        return a0.a;
                    }
                }
                xVar = new xShadow(this, cVar);
                Object obj292 = xVar.u;
                b71.a aVar392 = b71.a.r;
                i28 = xVar.v;
                if (i28 != 0) {
                }
                return a0.a;
            case 26:
                if (cVar instanceof rm0.a0) {
                    a0Var = (rm0.a0) cVar;
                    int i65 = a0Var.v;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        a0Var.v = i65 - Integer.MIN_VALUE;
                        Object obj30 = a0Var.u;
                        b71.a aVar40 = b71.a.r;
                        i29 = a0Var.v;
                        a0 a0Var6 = a0.a;
                        if (i29 != 0) {
                            y.j(obj30);
                            a0Var.v = 1;
                            if (this.s.c(a0Var6, a0Var) == aVar40) {
                                return aVar40;
                            }
                        } else {
                            if (i29 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj30);
                        }
                        return a0Var6;
                    }
                }
                a0Var = new rm0.a0(this, cVar);
                Object obj302 = a0Var.u;
                b71.a aVar402 = b71.a.r;
                i29 = a0Var.v;
                a0 a0Var62 = a0.a;
                if (i29 != 0) {
                }
                return a0Var62;
            case 27:
                if (cVar instanceof b0) {
                    b0Var = (b0) cVar;
                    int i66 = b0Var.v;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        b0Var.v = i66 - Integer.MIN_VALUE;
                        Object obj31 = b0Var.u;
                        b71.a aVar41 = b71.a.r;
                        i31 = b0Var.v;
                        if (i31 != 0) {
                            y.j(obj31);
                            Boolean bool2 = Boolean.TRUE;
                            b0Var.v = 1;
                            if (this.s.c(bool2, b0Var) == aVar41) {
                                return aVar41;
                            }
                        } else {
                            if (i31 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj31);
                        }
                        return a0.a;
                    }
                }
                b0Var = new b0(this, cVar);
                Object obj312 = b0Var.u;
                b71.a aVar412 = b71.a.r;
                i31 = b0Var.v;
                if (i31 != 0) {
                }
                return a0.a;
            case 28:
                return a(cVar, obj);
            default:
                if (cVar instanceof g0) {
                    g0Var = (g0) cVar;
                    int i67 = g0Var.v;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        g0Var.v = i67 - Integer.MIN_VALUE;
                        Object obj33 = g0Var.u;
                        b71.a aVar42 = b71.a.r;
                        i32 = g0Var.v;
                        if (i32 != 0) {
                            y.j(obj33);
                            sy syVar = ((ry) obj).a;
                            if (syVar == null || (tyVar = syVar.a) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "resolveReviewThread field null", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            g4 h = z3.h(tyVar.c);
                            g0Var.v = 1;
                            if (this.s.c(h, g0Var) == aVar42) {
                                return aVar42;
                            }
                        } else {
                            if (i32 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj33);
                        }
                        return a0.a;
                    }
                }
                g0Var = new g0(this, cVar);
                Object obj332 = g0Var.u;
                b71.a aVar422 = b71.a.r;
                i32 = g0Var.v;
                if (i32 != 0) {
                }
                return a0.a;
        }
    }
}
