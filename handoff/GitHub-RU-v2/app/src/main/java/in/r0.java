package in;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.type.MobileAuthRequestType;
import com.google.android.gms.internal.measurement.z3;
import dw.r6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.ad0;
import jo.bd0;
import jo.c40;
import jo.cd0;
import jo.d40;
import jo.d8;
import jo.dd0;
import jo.e40;
import jo.e8;
import jo.f40;
import jo.f5;
import jo.f8;
import jo.g40;
import jo.h40;
import jo.h5;
import jo.hd0;
import jo.j5;
import jo.nw;
import jo.ow;
import jo.pw;
import jo.y70;
import jo.z70;
import kotlin.NoWhenBranchMatchedException;
import y71.n1;
import yz0.w7;
import yz0.x7;
import yz0.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r0 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ r0(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x058d  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x05c5  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0619  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0627  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:443:0x0679  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x06ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0693 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0707  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0715  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x077f  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x07e1  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0817  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0825  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x085d  */
    /* JADX WARN: Removed duplicated region for block: B:583:0x086b  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x08a1  */
    /* JADX WARN: Removed duplicated region for block: B:602:0x08af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x0901  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x090f  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0945  */
    /* JADX WARN: Removed duplicated region for block: B:640:0x0953  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x0996  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x09a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x09e7  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x09f5  */
    /* JADX WARN: Removed duplicated region for block: B:702:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:708:0x0a56  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        q0 q0Var;
        int i;
        kp.f fVar;
        int i2;
        kp.g gVar;
        int i3;
        kp.h hVar;
        int i4;
        kp.j jVar;
        int i5;
        kp.p pVar;
        int i6;
        kp.s sVar;
        int i7;
        kp.t tVar;
        int i8;
        kp.u uVar;
        int i9;
        ky.a aVar;
        int i11;
        j5 j5Var;
        ky.c cVar2;
        int i12;
        f8 f8Var;
        f8 f8Var2;
        f8 f8Var3;
        ky.d dVar;
        int i13;
        y1 y1Var;
        ky.e eVar;
        int i14;
        r6 r6Var;
        ky.g gVar2;
        int i15;
        ow owVar;
        ky.h hVar2;
        int i16;
        ky.i iVar;
        int i17;
        bd0 bd0Var;
        cd0 cd0Var;
        l10.b bVar;
        int i18;
        l10.c cVar3;
        int i19;
        l10.d dVar2;
        int i21;
        l10.e eVar2;
        int i22;
        l10.f fVar2;
        int i23;
        f11.b bVar2;
        i10.r rVar;
        MobileAuthRequestType mobileAuthRequestType;
        l10.g gVar3;
        int i24;
        l10.h hVar3;
        int i25;
        mi.b bVar3;
        int i26;
        mi.c cVar4;
        int i27;
        n5.n nVar;
        int i28;
        nj.n nVar2;
        int i29;
        nj.r rVar2;
        int i31;
        nm.b bVar4;
        int i32;
        switch (this.r) {
            case 0:
                if (cVar instanceof q0) {
                    q0Var = (q0) cVar;
                    int i33 = q0Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        q0Var.v = i33 - Integer.MIN_VALUE;
                        Object obj2 = q0Var.u;
                        b71.a aVar2 = b71.a.r;
                        i = q0Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            Object obj3 = ((p0) obj).a;
                            q0Var.v = 1;
                            if (this.s.c(obj3, q0Var) == aVar2) {
                                return aVar2;
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
                q0Var = new q0(this, cVar);
                Object obj22 = q0Var.u;
                b71.a aVar22 = b71.a.r;
                i = q0Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                Object q = n1.q(this.s, (y71.i) obj, cVar);
                return q == b71.a.r ? q : w61.a0.a;
            case 2:
                if (cVar instanceof kp.f) {
                    fVar = (kp.f) cVar;
                    int i34 = fVar.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i34 - Integer.MIN_VALUE;
                        Object obj4 = fVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = fVar.v;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            String str = ((so.b) obj).a.a;
                            qn.g gVar4 = str != null ? new qn.g(str, x61.r.r) : null;
                            fVar.v = 1;
                            if (this.s.c(gVar4, fVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                fVar = new kp.f(this, cVar);
                Object obj42 = fVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = fVar.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof kp.g) {
                    gVar = (kp.g) cVar;
                    int i35 = gVar.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        gVar.v = i35 - Integer.MIN_VALUE;
                        Object obj5 = gVar.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = gVar.v;
                        if (i3 != 0) {
                            sy.y.j(obj5);
                            String str2 = ((so.b) obj).a.c;
                            qn.g gVar5 = str2 != null ? new qn.g(str2, x61.r.r) : null;
                            gVar.v = 1;
                            if (this.s.c(gVar5, gVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                gVar = new kp.g(this, cVar);
                Object obj52 = gVar.u;
                b71.a aVar42 = b71.a.r;
                i3 = gVar.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof kp.h) {
                    hVar = (kp.h) cVar;
                    int i36 = hVar.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i36 - Integer.MIN_VALUE;
                        Object obj6 = hVar.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = hVar.v;
                        if (i4 != 0) {
                            sy.y.j(obj6);
                            String str3 = ((so.b) obj).a.b;
                            qn.g gVar6 = str3 != null ? new qn.g(str3, x61.r.r) : null;
                            hVar.v = 1;
                            if (this.s.c(gVar6, hVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                hVar = new kp.h(this, cVar);
                Object obj62 = hVar.u;
                b71.a aVar52 = b71.a.r;
                i4 = hVar.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof kp.j) {
                    jVar = (kp.j) cVar;
                    int i37 = jVar.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        jVar.v = i37 - Integer.MIN_VALUE;
                        Object obj7 = jVar.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = jVar.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            String str4 = ((so.p) obj).a;
                            jVar.v = 1;
                            if (this.s.c(str4, jVar) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                jVar = new kp.j(this, cVar);
                Object obj72 = jVar.u;
                b71.a aVar62 = b71.a.r;
                i5 = jVar.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof kp.p) {
                    pVar = (kp.p) cVar;
                    int i38 = pVar.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        pVar.v = i38 - Integer.MIN_VALUE;
                        Object obj8 = pVar.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = pVar.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            String str5 = (String) obj;
                            if (k71.k.b(str5, "APOLLO_ALIVE_SERVICE_IO")) {
                                throw new ApiFailure(ApiFailureType.HTTP_ERROR, "io error on socket", (String) null, new Integer(0), (ArrayList) null, (Map) null, (Throwable) null, 112);
                            }
                            pVar.v = 1;
                            if (this.s.c(str5, pVar) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                pVar = new kp.p(this, cVar);
                Object obj82 = pVar.u;
                b71.a aVar72 = b71.a.r;
                i6 = pVar.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof kp.s) {
                    sVar = (kp.s) cVar;
                    int i39 = sVar.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        sVar.v = i39 - Integer.MIN_VALUE;
                        Object obj9 = sVar.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = sVar.v;
                        if (i7 != 0) {
                            sy.y.j(obj9);
                            if (obj instanceof qn.d) {
                                sVar.v = 1;
                                if (this.s.c(obj, sVar) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                sVar = new kp.s(this, cVar);
                Object obj92 = sVar.u;
                b71.a aVar82 = b71.a.r;
                i7 = sVar.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof kp.t) {
                    tVar = (kp.t) cVar;
                    int i41 = tVar.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        tVar.v = i41 - Integer.MIN_VALUE;
                        Object obj10 = tVar.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = tVar.v;
                        if (i8 != 0) {
                            sy.y.j(obj10);
                            a.a L = aa1.b.L((String) obj);
                            tVar.v = 1;
                            if (this.s.c(L, tVar) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                tVar = new kp.t(this, cVar);
                Object obj102 = tVar.u;
                b71.a aVar92 = b71.a.r;
                i8 = tVar.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof kp.u) {
                    uVar = (kp.u) cVar;
                    int i42 = uVar.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        uVar.v = i42 - Integer.MIN_VALUE;
                        Object obj11 = uVar.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = uVar.v;
                        if (i9 != 0) {
                            sy.y.j(obj11);
                            qn.f fVar3 = ((qn.d) obj).c;
                            uVar.v = 1;
                            if (this.s.c(fVar3, uVar) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                uVar = new kp.u(this, cVar);
                Object obj112 = uVar.u;
                b71.a aVar102 = b71.a.r;
                i9 = uVar.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof ky.a) {
                    aVar = (ky.a) cVar;
                    int i43 = aVar.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i43 - Integer.MIN_VALUE;
                        Object obj12 = aVar.u;
                        b71.a aVar11 = b71.a.r;
                        i11 = aVar.v;
                        if (i11 != 0) {
                            sy.y.j(obj12);
                            f5 f5Var = ((h5) obj).a;
                            x7 o = (f5Var == null || (j5Var = f5Var.a) == null) ? null : sy.a0.o(j5Var.d);
                            if (o != null) {
                                aVar.v = 1;
                                if (this.s.c(o, aVar) == aVar11) {
                                    return aVar11;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                aVar = new ky.a(this, cVar);
                Object obj122 = aVar.u;
                b71.a aVar112 = b71.a.r;
                i11 = aVar.v;
                if (i11 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof ky.c) {
                    cVar2 = (ky.c) cVar;
                    int i44 = cVar2.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        cVar2.v = i44 - Integer.MIN_VALUE;
                        Object obj13 = cVar2.u;
                        b71.a aVar12 = b71.a.r;
                        i12 = cVar2.v;
                        if (i12 != 0) {
                            sy.y.j(obj13);
                            e8 e8Var = (e8) obj;
                            k71.k.g(e8Var, "<this>");
                            d8 d8Var = e8Var.a;
                            Integer num = null;
                            String str6 = (d8Var == null || (f8Var3 = d8Var.a) == null) ? null : f8Var3.b;
                            if (str6 == null) {
                                str6 = "";
                            }
                            String str7 = (d8Var == null || (f8Var2 = d8Var.a) == null) ? null : f8Var2.c;
                            String str8 = str7 != null ? str7 : "";
                            if (d8Var != null && (f8Var = d8Var.a) != null) {
                                num = Integer.valueOf(f8Var.d);
                            }
                            yz0.y0 y0Var = new yz0.y0(num, str6, str8);
                            cVar2.v = 1;
                            if (this.s.c(y0Var, cVar2) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                cVar2 = new ky.c(this, cVar);
                Object obj132 = cVar2.u;
                b71.a aVar122 = b71.a.r;
                i12 = cVar2.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof ky.d) {
                    dVar = (ky.d) cVar;
                    int i45 = dVar.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i45 - Integer.MIN_VALUE;
                        Object obj14 = dVar.u;
                        b71.a aVar13 = b71.a.r;
                        i13 = dVar.v;
                        if (i13 != 0) {
                            sy.y.j(obj14);
                            c40 c40Var = (c40) obj;
                            k71.k.g(c40Var, "<this>");
                            h40 h40Var = c40Var.a;
                            List<d40> list = h40Var.b;
                            ArrayList arrayList = null;
                            if (list != null) {
                                ArrayList arrayList2 = new ArrayList();
                                for (d40 d40Var : list) {
                                    if (d40Var != null) {
                                        e40 e40Var = d40Var.b;
                                        if (e40Var != null) {
                                            y1Var = b91.g.W(e40Var.c);
                                        } else {
                                            f40 f40Var = d40Var.c;
                                            if (f40Var != null) {
                                                y1Var = m71.a.h0(f40Var.c);
                                            }
                                        }
                                        if (y1Var == null) {
                                            arrayList2.add(y1Var);
                                        }
                                    }
                                    y1Var = null;
                                    if (y1Var == null) {
                                    }
                                }
                                arrayList = arrayList2;
                            }
                            if (arrayList == null) {
                                arrayList = x61.r.r;
                            }
                            g40 g40Var = h40Var.a;
                            boolean z = g40Var.a;
                            String str9 = g40Var.b;
                            xz0.g gVar7 = new xz0.g(arrayList, new x01.i(str9, z, str9 == null));
                            dVar.v = 1;
                            if (this.s.c(gVar7, dVar) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                dVar = new ky.d(this, cVar);
                Object obj142 = dVar.u;
                b71.a aVar132 = b71.a.r;
                i13 = dVar.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof ky.e) {
                    eVar = (ky.e) cVar;
                    int i46 = eVar.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i46 - Integer.MIN_VALUE;
                        Object obj15 = eVar.u;
                        b71.a aVar14 = b71.a.r;
                        i14 = eVar.v;
                        if (i14 != 0) {
                            sy.y.j(obj15);
                            z70 z70Var = ((y70) obj).a;
                            List e = (z70Var == null || (r6Var = z70Var.c) == null) ? x61.r.r : sy.t.e(r6Var);
                            eVar.v = 1;
                            if (this.s.c(e, eVar) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                eVar = new ky.e(this, cVar);
                Object obj152 = eVar.u;
                b71.a aVar142 = b71.a.r;
                i14 = eVar.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof ky.g) {
                    gVar2 = (ky.g) cVar;
                    int i47 = gVar2.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        gVar2.v = i47 - Integer.MIN_VALUE;
                        Object obj16 = gVar2.u;
                        b71.a aVar15 = b71.a.r;
                        i15 = gVar2.v;
                        if (i15 != 0) {
                            sy.y.j(obj16);
                            pw pwVar = ((nw) obj).a;
                            x7 o2 = (pwVar == null || (owVar = pwVar.a) == null) ? null : sy.a0.o(owVar.c);
                            if (o2 != null) {
                                gVar2.v = 1;
                                if (this.s.c(o2, gVar2) == aVar15) {
                                    return aVar15;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                gVar2 = new ky.g(this, cVar);
                Object obj162 = gVar2.u;
                b71.a aVar152 = b71.a.r;
                i15 = gVar2.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof ky.h) {
                    hVar2 = (ky.h) cVar;
                    int i48 = hVar2.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        hVar2.v = i48 - Integer.MIN_VALUE;
                        Object obj17 = hVar2.u;
                        b71.a aVar16 = b71.a.r;
                        i16 = hVar2.v;
                        if (i16 != 0) {
                            sy.y.j(obj17);
                            w7 n = sy.y.n((hd0) obj);
                            hVar2.v = 1;
                            if (this.s.c(n, hVar2) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                hVar2 = new ky.h(this, cVar);
                Object obj172 = hVar2.u;
                b71.a aVar162 = b71.a.r;
                i16 = hVar2.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof ky.i) {
                    iVar = (ky.i) cVar;
                    int i49 = iVar.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        iVar.v = i49 - Integer.MIN_VALUE;
                        Object obj18 = iVar.u;
                        b71.a aVar17 = b71.a.r;
                        i17 = iVar.v;
                        if (i17 != 0) {
                            sy.y.j(obj18);
                            dd0 dd0Var = ((ad0) obj).a;
                            IssueType f = (dd0Var == null || (bd0Var = dd0Var.a) == null || (cd0Var = bd0Var.b) == null) ? null : z3.f(cd0Var.c);
                            iVar.v = 1;
                            if (this.s.c(f, iVar) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                iVar = new ky.i(this, cVar);
                Object obj182 = iVar.u;
                b71.a aVar172 = b71.a.r;
                i17 = iVar.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof l10.b) {
                    bVar = (l10.b) cVar;
                    int i51 = bVar.v;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        bVar.v = i51 - Integer.MIN_VALUE;
                        Object obj19 = bVar.u;
                        b71.a aVar18 = b71.a.r;
                        i18 = bVar.v;
                        if (i18 != 0) {
                            sy.y.j(obj19);
                            ZonedDateTime plusDays = ZonedDateTime.now().plusDays(30L);
                            k71.k.f(plusDays, "plusDays(...)");
                            f11.d dVar3 = new f11.d(plusDays);
                            bVar.v = 1;
                            if (this.s.c(dVar3, bVar) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                bVar = new l10.b(this, cVar);
                Object obj192 = bVar.u;
                b71.a aVar182 = b71.a.r;
                i18 = bVar.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof l10.c) {
                    cVar3 = (l10.c) cVar;
                    int i52 = cVar3.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        cVar3.v = i52 - Integer.MIN_VALUE;
                        Object obj20 = cVar3.u;
                        b71.a aVar19 = b71.a.r;
                        i19 = cVar3.v;
                        if (i19 != 0) {
                            sy.y.j(obj20);
                            ZonedDateTime plusDays2 = ZonedDateTime.now().plusDays(356L);
                            k71.k.f(plusDays2, "plusDays(...)");
                            f11.d dVar4 = new f11.d(plusDays2);
                            cVar3.v = 1;
                            if (this.s.c(dVar4, cVar3) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                cVar3 = new l10.c(this, cVar);
                Object obj202 = cVar3.u;
                b71.a aVar192 = b71.a.r;
                i19 = cVar3.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof l10.d) {
                    dVar2 = (l10.d) cVar;
                    int i53 = dVar2.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        dVar2.v = i53 - Integer.MIN_VALUE;
                        Object obj21 = dVar2.u;
                        b71.a aVar20 = b71.a.r;
                        i21 = dVar2.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i21 != 0) {
                            sy.y.j(obj21);
                            dVar2.v = 1;
                            if (this.s.c(a0Var, dVar2) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return a0Var;
                    }
                }
                dVar2 = new l10.d(this, cVar);
                Object obj212 = dVar2.u;
                b71.a aVar202 = b71.a.r;
                i21 = dVar2.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i21 != 0) {
                }
                return a0Var2;
            case 20:
                if (cVar instanceof l10.e) {
                    eVar2 = (l10.e) cVar;
                    int i54 = eVar2.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        eVar2.v = i54 - Integer.MIN_VALUE;
                        Object obj23 = eVar2.u;
                        b71.a aVar21 = b71.a.r;
                        i22 = eVar2.v;
                        w61.a0 a0Var3 = w61.a0.a;
                        if (i22 != 0) {
                            sy.y.j(obj23);
                            eVar2.v = 1;
                            if (this.s.c(a0Var3, eVar2) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return a0Var3;
                    }
                }
                eVar2 = new l10.e(this, cVar);
                Object obj232 = eVar2.u;
                b71.a aVar212 = b71.a.r;
                i22 = eVar2.v;
                w61.a0 a0Var32 = w61.a0.a;
                if (i22 != 0) {
                }
                return a0Var32;
            case 21:
                if (cVar instanceof l10.f) {
                    fVar2 = (l10.f) cVar;
                    int i55 = fVar2.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        fVar2.v = i55 - Integer.MIN_VALUE;
                        Object obj24 = fVar2.u;
                        b71.a aVar23 = b71.a.r;
                        i23 = fVar2.v;
                        if (i23 != 0) {
                            sy.y.j(obj24);
                            i10.v vVar = ((i10.t) obj).a;
                            i10.u uVar2 = vVar.d;
                            String str10 = vVar.a;
                            if (str10.length() == 0 && (str10 = vVar.b) == null) {
                                str10 = "";
                            }
                            String str11 = str10;
                            if (uVar2 == null || (rVar = uVar2.c) == null) {
                                bVar2 = null;
                            } else {
                                int i56 = rVar.a;
                                String str12 = rVar.b;
                                String str13 = vVar.c;
                                boolean z2 = rVar.c;
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
                                bVar2 = new f11.b(i56, str12, str11, str13, z2, mobileAuthRequestType);
                            }
                            f11.c cVar5 = new f11.c(uVar2 != null ? uVar2.a : true, bVar2);
                            fVar2.v = 1;
                            if (this.s.c(cVar5, fVar2) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                fVar2 = new l10.f(this, cVar);
                Object obj242 = fVar2.u;
                b71.a aVar232 = b71.a.r;
                i23 = fVar2.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 22:
                if (cVar instanceof l10.g) {
                    gVar3 = (l10.g) cVar;
                    int i57 = gVar3.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        gVar3.v = i57 - Integer.MIN_VALUE;
                        Object obj25 = gVar3.u;
                        b71.a aVar24 = b71.a.r;
                        i24 = gVar3.v;
                        if (i24 != 0) {
                            sy.y.j(obj25);
                            i10.o oVar = ((i10.n) obj).a.a;
                            boolean z3 = false;
                            boolean z4 = oVar != null && oVar.b;
                            if (oVar != null && oVar.a) {
                                z3 = true;
                            }
                            f11.a aVar25 = new f11.a(z3, z4);
                            gVar3.v = 1;
                            if (this.s.c(aVar25, gVar3) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                gVar3 = new l10.g(this, cVar);
                Object obj252 = gVar3.u;
                b71.a aVar242 = b71.a.r;
                i24 = gVar3.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
            case 23:
                if (cVar instanceof l10.h) {
                    hVar3 = (l10.h) cVar;
                    int i58 = hVar3.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        hVar3.v = i58 - Integer.MIN_VALUE;
                        Object obj26 = hVar3.u;
                        b71.a aVar26 = b71.a.r;
                        i25 = hVar3.v;
                        w61.a0 a0Var4 = w61.a0.a;
                        if (i25 != 0) {
                            sy.y.j(obj26);
                            hVar3.v = 1;
                            if (this.s.c(a0Var4, hVar3) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return a0Var4;
                    }
                }
                hVar3 = new l10.h(this, cVar);
                Object obj262 = hVar3.u;
                b71.a aVar262 = b71.a.r;
                i25 = hVar3.v;
                w61.a0 a0Var42 = w61.a0.a;
                if (i25 != 0) {
                }
                return a0Var42;
            case 24:
                if (cVar instanceof mi.b) {
                    bVar3 = (mi.b) cVar;
                    int i59 = bVar3.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        bVar3.v = i59 - Integer.MIN_VALUE;
                        Object obj27 = bVar3.u;
                        b71.a aVar27 = b71.a.r;
                        i26 = bVar3.v;
                        if (i26 != 0) {
                            sy.y.j(obj27);
                            File file = (File) obj;
                            Charset charset = t71.a.a;
                            k71.k.g(file, "<this>");
                            k71.k.g(charset, "charset");
                            ArrayList arrayList3 = new ArrayList();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
                            try {
                                Iterator it = new s71.a(new kotlin.io.k(0, bufferedReader)).iterator();
                                while (it.hasNext()) {
                                    String str14 = (String) it.next();
                                    k71.k.g(str14, "it");
                                    arrayList3.add(str14);
                                }
                                bufferedReader.close();
                                bVar3.v = 1;
                                if (this.s.c(arrayList3, bVar3) == aVar27) {
                                    return aVar27;
                                }
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    m7.y.s(bufferedReader, th2);
                                    throw th3;
                                }
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                bVar3 = new mi.b(this, cVar);
                Object obj272 = bVar3.u;
                b71.a aVar272 = b71.a.r;
                i26 = bVar3.v;
                if (i26 != 0) {
                }
                return w61.a0.a;
            case 25:
                if (cVar instanceof mi.c) {
                    cVar4 = (mi.c) cVar;
                    int i61 = cVar4.v;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        cVar4.v = i61 - Integer.MIN_VALUE;
                        Object obj28 = cVar4.u;
                        b71.a aVar28 = b71.a.r;
                        i27 = cVar4.v;
                        if (i27 != 0) {
                            sy.y.j(obj28);
                            List list2 = (List) obj;
                            ArrayList arrayList4 = new ArrayList(x61.n.F(list2, 10));
                            int i62 = 0;
                            for (Object obj29 : list2) {
                                int i63 = i62 + 1;
                                if (i62 < 0) {
                                    sy.d0.x();
                                    throw null;
                                }
                                arrayList4.add(new mi.e((String) obj29, i63));
                                i62 = i63;
                            }
                            cVar4.v = 1;
                            if (this.s.c(arrayList4, cVar4) == aVar28) {
                                return aVar28;
                            }
                        } else {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                cVar4 = new mi.c(this, cVar);
                Object obj282 = cVar4.u;
                b71.a aVar282 = b71.a.r;
                i27 = cVar4.v;
                if (i27 != 0) {
                }
                return w61.a0.a;
            case 26:
                if (cVar instanceof n5.n) {
                    nVar = (n5.n) cVar;
                    int i64 = nVar.v;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        nVar.v = i64 - Integer.MIN_VALUE;
                        Object obj30 = nVar.u;
                        b71.a aVar29 = b71.a.r;
                        i28 = nVar.v;
                        if (i28 != 0) {
                            sy.y.j(obj30);
                            n5.c cVar6 = (n5.p0) obj;
                            if (cVar6 instanceof n5.i0) {
                                throw ((n5.i0) cVar6).b;
                            }
                            if (!(cVar6 instanceof n5.c)) {
                                if ((cVar6 instanceof n5.f0) || (cVar6 instanceof n5.s0) || (cVar6 instanceof n5.h0)) {
                                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                            Object obj31 = cVar6.b;
                            nVar.v = 1;
                            if (this.s.c(obj31, nVar) == aVar29) {
                                return aVar29;
                            }
                        } else {
                            if (i28 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                        }
                        return w61.a0.a;
                    }
                }
                nVar = new n5.n(this, cVar);
                Object obj302 = nVar.u;
                b71.a aVar292 = b71.a.r;
                i28 = nVar.v;
                if (i28 != 0) {
                }
                return w61.a0.a;
            case 27:
                if (cVar instanceof nj.n) {
                    nVar2 = (nj.n) cVar;
                    int i65 = nVar2.v;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        nVar2.v = i65 - Integer.MIN_VALUE;
                        Object obj32 = nVar2.u;
                        b71.a aVar30 = b71.a.r;
                        i29 = nVar2.v;
                        if (i29 != 0) {
                            sy.y.j(obj32);
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj33 : (List) obj) {
                                xn.v0 v0Var = (xn.v0) obj33;
                                k71.k.g(v0Var, "it");
                                if (v0Var.v && v0Var.x.r == xn.i.r) {
                                    arrayList5.add(obj33);
                                }
                            }
                            nVar2.v = 1;
                            if (this.s.c(arrayList5, nVar2) == aVar30) {
                                return aVar30;
                            }
                        } else {
                            if (i29 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj32);
                        }
                        return w61.a0.a;
                    }
                }
                nVar2 = new nj.n(this, cVar);
                Object obj322 = nVar2.u;
                b71.a aVar302 = b71.a.r;
                i29 = nVar2.v;
                if (i29 != 0) {
                }
                return w61.a0.a;
            case 28:
                if (cVar instanceof nj.r) {
                    rVar2 = (nj.r) cVar;
                    int i66 = rVar2.v;
                    if ((i66 & Integer.MIN_VALUE) != 0) {
                        rVar2.v = i66 - Integer.MIN_VALUE;
                        Object obj34 = rVar2.u;
                        b71.a aVar31 = b71.a.r;
                        i31 = rVar2.v;
                        if (i31 != 0) {
                            sy.y.j(obj34);
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj35 : (List) obj) {
                                xn.b1 b1Var = (xn.b1) obj35;
                                k71.k.g(b1Var, "it");
                                if (b1Var.o() && b1Var.h().r == xn.i.r) {
                                    arrayList6.add(obj35);
                                }
                            }
                            rVar2.v = 1;
                            if (this.s.c(arrayList6, rVar2) == aVar31) {
                                return aVar31;
                            }
                        } else {
                            if (i31 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj34);
                        }
                        return w61.a0.a;
                    }
                }
                rVar2 = new nj.r(this, cVar);
                Object obj342 = rVar2.u;
                b71.a aVar312 = b71.a.r;
                i31 = rVar2.v;
                if (i31 != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof nm.b) {
                    bVar4 = (nm.b) cVar;
                    int i67 = bVar4.v;
                    if ((i67 & Integer.MIN_VALUE) != 0) {
                        bVar4.v = i67 - Integer.MIN_VALUE;
                        Object obj36 = bVar4.u;
                        b71.a aVar33 = b71.a.r;
                        i32 = bVar4.v;
                        w61.a0 a0Var5 = w61.a0.a;
                        if (i32 != 0) {
                            sy.y.j(obj36);
                            bVar4.v = 1;
                            if (this.s.c(a0Var5, bVar4) == aVar33) {
                                return aVar33;
                            }
                        } else {
                            if (i32 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj36);
                        }
                        return a0Var5;
                    }
                }
                bVar4 = new nm.b(this, cVar);
                Object obj362 = bVar4.u;
                b71.a aVar332 = b71.a.r;
                i32 = bVar4.v;
                w61.a0 a0Var52 = w61.a0.a;
                if (i32 != 0) {
                }
                return a0Var52;
        }
    }
}
