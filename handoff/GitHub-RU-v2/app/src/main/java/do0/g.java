package do0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import java.util.List;
import jn0.eo;
import jn0.go;
import jn0.ho;
import jo.wp;
import jo.yp;
import jo.zp;
import kc0.mm;
import kc0.om;
import kc0.pm;
import qn0.a0;
import qn0.b0;
import qn0.c0;
import qn0.d0;
import qn0.f0;
import qn0.z;
import rm0.t1;
import sy.e0;
import sy.y;
import t00.m1;
import u10.il;
import u10.kl;
import u10.ll;
import vb0.e1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ String t;
    public final /* synthetic */ int u;

    public /* synthetic */ g(y71.j jVar, String str, int i, int i2) {
        this.r = i2;
        this.s = jVar;
        this.t = str;
        this.u = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f fVar;
        int i;
        d0 d0Var;
        List list;
        a0 a0Var;
        f0 f0Var;
        dp.d dVar;
        int i2;
        qo.d0 d0Var2;
        List list2;
        qo.a0 a0Var2;
        qo.f0 f0Var2;
        ed0.d dVar2;
        int i3;
        rc0.d0 d0Var3;
        List list3;
        rc0.a0 a0Var3;
        rc0.f0 f0Var3;
        o20.d dVar3;
        int i4;
        b20.d0 d0Var4;
        List list4;
        b20.a0 a0Var4;
        b20.f0 f0Var4;
        t1 t1Var;
        int i5;
        pm pmVar;
        m1 m1Var;
        int i6;
        zp zpVar;
        e1 e1Var;
        int i7;
        ll llVar;
        wy0.e1 e1Var2;
        int i8;
        ho hoVar;
        switch (this.r) {
            case 0:
                if (cVar instanceof f) {
                    fVar = (f) cVar;
                    int i9 = fVar.v;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i9 - Integer.MIN_VALUE;
                        Object obj2 = fVar.u;
                        b71.a aVar = b71.a.r;
                        i = fVar.v;
                        if (i != 0) {
                            y.j(obj2);
                            b0 b0Var = ((z) obj).a;
                            mn.b bVar = null;
                            c0 c0Var = b0Var != null ? b0Var.c : null;
                            String str = (c0Var == null || (f0Var = c0Var.b.b) == null) ? null : f0Var.b.b;
                            mn.a b = (str == null || c0Var == null) ? null : xn0.a.b(c0Var.d, str);
                            if (c0Var != null && (d0Var = c0Var.c) != null && (list = d0Var.a) != null && (a0Var = (a0) x61.m.W(list)) != null) {
                                bVar = xn0.a.c(a0Var.b);
                            }
                            if (b == null || bVar == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid CheckRun Id / Step combination: " + this.t + " / " + this.u, null, null, null, null, null, 120);
                            }
                            mn.c cVar2 = new mn.c(b, bVar);
                            fVar.v = 1;
                            if (this.s.c(cVar2, fVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj2);
                        }
                        return w61.a0.a;
                    }
                }
                fVar = new f(this, cVar);
                Object obj22 = fVar.u;
                b71.a aVar2 = b71.a.r;
                i = fVar.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof dp.d) {
                    dVar = (dp.d) cVar;
                    int i10 = dVar.v;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i10 - Integer.MIN_VALUE;
                        Object obj3 = dVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = dVar.v;
                        if (i2 != 0) {
                            y.j(obj3);
                            qo.b0 b0Var2 = ((qo.z) obj).a;
                            mn.b bVar2 = null;
                            qo.c0 c0Var2 = b0Var2 != null ? b0Var2.c : null;
                            String str2 = (c0Var2 == null || (f0Var2 = c0Var2.b.b) == null) ? null : f0Var2.b.b;
                            mn.a b2 = (str2 == null || c0Var2 == null) ? null : xo.a.b(c0Var2.d, str2);
                            if (c0Var2 != null && (d0Var2 = c0Var2.c) != null && (list2 = d0Var2.a) != null && (a0Var2 = (qo.a0) x61.m.W(list2)) != null) {
                                bVar2 = xo.a.c(a0Var2.b);
                            }
                            if (b2 == null || bVar2 == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid CheckRun Id / Step combination: " + this.t + " / " + this.u, null, null, null, null, null, 120);
                            }
                            mn.c cVar3 = new mn.c(b2, bVar2);
                            dVar.v = 1;
                            if (this.s.c(cVar3, dVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                dVar = new dp.d(this, cVar);
                Object obj32 = dVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = dVar.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof ed0.d) {
                    dVar2 = (ed0.d) cVar;
                    int i12 = dVar2.v;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        dVar2.v = i12 - Integer.MIN_VALUE;
                        Object obj4 = dVar2.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = dVar2.v;
                        if (i3 != 0) {
                            y.j(obj4);
                            rc0.b0 b0Var3 = ((rc0.z) obj).a;
                            mn.b bVar3 = null;
                            rc0.c0 c0Var3 = b0Var3 != null ? b0Var3.c : null;
                            String str3 = (c0Var3 == null || (f0Var3 = c0Var3.b.b) == null) ? null : f0Var3.b.b;
                            mn.a b3 = (str3 == null || c0Var3 == null) ? null : yc0.a.b(c0Var3.d, str3);
                            if (c0Var3 != null && (d0Var3 = c0Var3.c) != null && (list3 = d0Var3.a) != null && (a0Var3 = (rc0.a0) x61.m.W(list3)) != null) {
                                bVar3 = yc0.a.c(a0Var3.b);
                            }
                            if (b3 == null || bVar3 == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid CheckRun Id / Step combination: " + this.t + " / " + this.u, null, null, null, null, null, 120);
                            }
                            mn.c cVar4 = new mn.c(b3, bVar3);
                            dVar2.v = 1;
                            if (this.s.c(cVar4, dVar2) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                dVar2 = new ed0.d(this, cVar);
                Object obj42 = dVar2.u;
                b71.a aVar42 = b71.a.r;
                i3 = dVar2.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof o20.d) {
                    dVar3 = (o20.d) cVar;
                    int i13 = dVar3.v;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        dVar3.v = i13 - Integer.MIN_VALUE;
                        Object obj5 = dVar3.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = dVar3.v;
                        if (i4 != 0) {
                            y.j(obj5);
                            b20.b0 b0Var4 = ((b20.z) obj).a;
                            mn.b bVar4 = null;
                            b20.c0 c0Var4 = b0Var4 != null ? b0Var4.c : null;
                            String str4 = (c0Var4 == null || (f0Var4 = c0Var4.b.b) == null) ? null : f0Var4.b.b;
                            mn.a b4 = (str4 == null || c0Var4 == null) ? null : i20.a.b(c0Var4.d, str4);
                            if (c0Var4 != null && (d0Var4 = c0Var4.c) != null && (list4 = d0Var4.a) != null && (a0Var4 = (b20.a0) x61.m.W(list4)) != null) {
                                bVar4 = i20.a.c(a0Var4.b);
                            }
                            if (b4 == null || bVar4 == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid CheckRun Id / Step combination: " + this.t + " / " + this.u, null, null, null, null, null, 120);
                            }
                            mn.c cVar5 = new mn.c(b4, bVar4);
                            dVar3.v = 1;
                            if (this.s.c(cVar5, dVar3) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                dVar3 = new o20.d(this, cVar);
                Object obj52 = dVar3.u;
                b71.a aVar52 = b71.a.r;
                i4 = dVar3.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof t1) {
                    t1Var = (t1) cVar;
                    int i14 = t1Var.v;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        t1Var.v = i14 - Integer.MIN_VALUE;
                        Object obj6 = t1Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = t1Var.v;
                        if (i5 != 0) {
                            y.j(obj6);
                            om omVar = ((mm) obj).a;
                            if (((omVar == null || (pmVar = omVar.a) == null) ? null : pmVar.a) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "No discussion repository set for organization: " + this.t + ", " + this.u, null, null, null, null, null, 120);
                            }
                            b01.j d = w8.s.d(omVar.a.a.c);
                            t1Var.v = 1;
                            if (this.s.c(d, t1Var) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                t1Var = new t1(this, cVar);
                Object obj62 = t1Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = t1Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof m1) {
                    m1Var = (m1) cVar;
                    int i15 = m1Var.v;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        m1Var.v = i15 - Integer.MIN_VALUE;
                        Object obj7 = m1Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = m1Var.v;
                        if (i6 != 0) {
                            y.j(obj7);
                            yp ypVar = ((wp) obj).a;
                            if (((ypVar == null || (zpVar = ypVar.a) == null) ? null : zpVar.a) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "No discussion repository set for organization: " + this.t + ", " + this.u, null, null, null, null, null, 120);
                            }
                            b01.j e = e0.e(ypVar.a.a.c);
                            m1Var.v = 1;
                            if (this.s.c(e, m1Var) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                m1Var = new m1(this, cVar);
                Object obj72 = m1Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = m1Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof e1) {
                    e1Var = (e1) cVar;
                    int i16 = e1Var.v;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        e1Var.v = i16 - Integer.MIN_VALUE;
                        Object obj8 = e1Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = e1Var.v;
                        if (i7 != 0) {
                            y.j(obj8);
                            kl klVar = ((il) obj).a;
                            if (((klVar == null || (llVar = klVar.a) == null) ? null : llVar.a) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "No discussion repository set for organization: " + this.t + ", " + this.u, null, null, null, null, null, 120);
                            }
                            b01.j d2 = sy.s.d(klVar.a.a.c);
                            e1Var.v = 1;
                            if (this.s.c(d2, e1Var) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                e1Var = new e1(this, cVar);
                Object obj82 = e1Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = e1Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof wy0.e1) {
                    e1Var2 = (wy0.e1) cVar;
                    int i17 = e1Var2.v;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        e1Var2.v = i17 - Integer.MIN_VALUE;
                        Object obj9 = e1Var2.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = e1Var2.v;
                        if (i8 != 0) {
                            y.j(obj9);
                            go goVar = ((eo) obj).a;
                            if (((goVar == null || (hoVar = goVar.a) == null) ? null : hoVar.a) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "No discussion repository set for organization: " + this.t + ", " + this.u, null, null, null, null, null, 120);
                            }
                            b01.j j = b41.b.j(goVar.a.a.c);
                            e1Var2.v = 1;
                            if (this.s.c(j, e1Var2) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                e1Var2 = new wy0.e1(this, cVar);
                Object obj92 = e1Var2.u;
                b71.a aVar92 = b71.a.r;
                i8 = e1Var2.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
        }
    }
}
