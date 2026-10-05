package tw0;

import aa.q;
import bb0.m;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import hc0.i9;
import hc0.o8;
import jn0.b3;
import jn0.i90;
import jn0.k90;
import jn0.s90;
import jn0.u90;
import jn0.x2;
import jn0.y2;
import jn0.z2;
import pz0.ba;
import s20.l;
import sy.s;
import sy.y;
import t71.p;
import u10.n30;
import u10.p2;
import u10.p30;
import u10.r2;
import u10.s2;
import u10.t2;
import u10.v2;
import u10.x30;
import u10.z30;
import vb0.f1;
import vb0.h1;
import vb0.i1;
import vb0.i4;
import vb0.j2;
import w61.a0;
import wy0.d5;
import wy0.j1;
import yz0.e4;
import yz0.m3;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ String t;

    public /* synthetic */ g(y71.j jVar, String str, int i) {
        this.r = i;
        this.s = jVar;
        this.t = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        f fVar;
        int i;
        vb0.a aVar;
        int i2;
        t2 t2Var;
        f1 f1Var;
        int i3;
        h1 h1Var;
        int i4;
        i1 i1Var;
        int i5;
        j2 j2Var;
        int i6;
        i4 i4Var;
        int i7;
        wy0.a aVar2;
        int i8;
        z2 z2Var;
        wy0.f1 f1Var2;
        int i9;
        wy0.i1 i1Var2;
        int i10;
        j1 j1Var;
        int i12;
        d5 d5Var;
        int i13;
        switch (this.r) {
            case 0:
                if (cVar instanceof f) {
                    fVar = (f) cVar;
                    int i14 = fVar.v;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i14 - Integer.MIN_VALUE;
                        Object obj2 = fVar.u;
                        b71.a aVar3 = b71.a.r;
                        i = fVar.v;
                        if (i != 0) {
                            y.j(obj2);
                            e4 e4Var = (e4) obj;
                            if (e4Var.a == null && this.t != null) {
                                e4Var = null;
                            }
                            if (e4Var != null) {
                                fVar.v = 1;
                                if (this.s.c(e4Var, fVar) == aVar3) {
                                    return aVar3;
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
                fVar = new f(this, cVar);
                Object obj22 = fVar.u;
                b71.a aVar32 = b71.a.r;
                i = fVar.v;
                if (i != 0) {
                }
                return a0.a;
            case 1:
                if (cVar instanceof vb0.a) {
                    aVar = (vb0.a) cVar;
                    int i15 = aVar.v;
                    if ((i15 & Integer.MIN_VALUE) != 0) {
                        aVar.v = i15 - Integer.MIN_VALUE;
                        Object obj3 = aVar.u;
                        b71.a aVar4 = b71.a.r;
                        i2 = aVar.v;
                        if (i2 != 0) {
                            y.j(obj3);
                            p2 p2Var = (p2) obj;
                            r2 r2Var = p2Var.b;
                            if (r2Var == null || (t2Var = r2Var.c) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid Repository Data", null, null, null, null, null, 120);
                            }
                            v2 v2Var = t2Var.a;
                            s2 s2Var = r2Var.d;
                            if (s2Var == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid Assignee Data", null, null, null, null, null, 120);
                            }
                            m mVar = new m(p2Var, v2Var, s2Var.a, p.T(this.t));
                            aVar.v = 1;
                            if (this.s.c(mVar, aVar) == aVar4) {
                                return aVar4;
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
                aVar = new vb0.a(this, cVar);
                Object obj32 = aVar.u;
                b71.a aVar42 = b71.a.r;
                i2 = aVar.v;
                if (i2 != 0) {
                }
                return a0.a;
            case 2:
                if (cVar instanceof f1) {
                    f1Var = (f1) cVar;
                    int i16 = f1Var.v;
                    if ((i16 & Integer.MIN_VALUE) != 0) {
                        f1Var.v = i16 - Integer.MIN_VALUE;
                        Object obj4 = f1Var.u;
                        b71.a aVar5 = b71.a.r;
                        i3 = f1Var.v;
                        if (i3 != 0) {
                            y.j(obj4);
                            e50.j jVar = (e50.j) obj;
                            s20.j jVar2 = null;
                            if (jVar != null) {
                                o8.Companion.getClass();
                                jVar2 = new s20.j(new l(new s20.k(((q) o8.l).a, this.t, e50.j.a(jVar, false, (i9) null))));
                            }
                            f1Var.v = 1;
                            if (this.s.c(jVar2, f1Var) == aVar5) {
                                return aVar5;
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
                f1Var = new f1(this, cVar);
                Object obj42 = f1Var.u;
                b71.a aVar52 = b71.a.r;
                i3 = f1Var.v;
                if (i3 != 0) {
                }
                return a0.a;
            case 3:
                if (cVar instanceof h1) {
                    h1Var = (h1) cVar;
                    int i17 = h1Var.v;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        h1Var.v = i17 - Integer.MIN_VALUE;
                        Object obj5 = h1Var.u;
                        b71.a aVar6 = b71.a.r;
                        i4 = h1Var.v;
                        if (i4 != 0) {
                            y.j(obj5);
                            z30 z30Var = ((x30) obj).a;
                            if ((z30Var != null ? z30Var.a : null) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, f1.e.g("Invalid Discussion id: ", this.t), null, null, null, null, null, 120);
                            }
                            b01.j d = s.d(z30Var.a.c);
                            h1Var.v = 1;
                            if (this.s.c(d, h1Var) == aVar6) {
                                return aVar6;
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
                h1Var = new h1(this, cVar);
                Object obj52 = h1Var.u;
                b71.a aVar62 = b71.a.r;
                i4 = h1Var.v;
                if (i4 != 0) {
                }
                return a0.a;
            case 4:
                if (cVar instanceof i1) {
                    i1Var = (i1) cVar;
                    int i18 = i1Var.v;
                    if ((i18 & Integer.MIN_VALUE) != 0) {
                        i1Var.v = i18 - Integer.MIN_VALUE;
                        Object obj6 = i1Var.u;
                        b71.a aVar7 = b71.a.r;
                        i5 = i1Var.v;
                        if (i5 != 0) {
                            y.j(obj6);
                            p30 p30Var = ((n30) obj).a;
                            if ((p30Var != null ? p30Var.a : null) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid Discussion id: ".concat(this.t), null, null, null, null, null, 120);
                            }
                            b01.e eVar = s.d(p30Var.a.c).c.m;
                            i1Var.v = 1;
                            if (this.s.c(eVar, i1Var) == aVar7) {
                                return aVar7;
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
                i1Var = new i1(this, cVar);
                Object obj62 = i1Var.u;
                b71.a aVar72 = b71.a.r;
                i5 = i1Var.v;
                if (i5 != 0) {
                }
                return a0.a;
            case 5:
                if (cVar instanceof j2) {
                    j2Var = (j2) cVar;
                    int i19 = j2Var.v;
                    if ((i19 & Integer.MIN_VALUE) != 0) {
                        j2Var.v = i19 - Integer.MIN_VALUE;
                        Object obj7 = j2Var.u;
                        b71.a aVar8 = b71.a.r;
                        i6 = j2Var.v;
                        if (i6 != 0) {
                            y.j(obj7);
                            e4 e4Var2 = (e4) obj;
                            if (e4Var2.a == null && this.t != null) {
                                e4Var2 = null;
                            }
                            if (e4Var2 != null) {
                                j2Var.v = 1;
                                if (this.s.c(e4Var2, j2Var) == aVar8) {
                                    return aVar8;
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
                j2Var = new j2(this, cVar);
                Object obj72 = j2Var.u;
                b71.a aVar82 = b71.a.r;
                i6 = j2Var.v;
                if (i6 != 0) {
                }
                return a0.a;
            case 6:
                if (cVar instanceof i4) {
                    i4Var = (i4) cVar;
                    int i20 = i4Var.v;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        i4Var.v = i20 - Integer.MIN_VALUE;
                        Object obj8 = i4Var.u;
                        b71.a aVar9 = b71.a.r;
                        i7 = i4Var.v;
                        if (i7 != 0) {
                            y.j(obj8);
                            m3 m3Var = (m3) obj;
                            if (m3Var.a == null && this.t != null) {
                                m3Var = null;
                            }
                            if (m3Var != null) {
                                i4Var.v = 1;
                                if (this.s.c(m3Var, i4Var) == aVar9) {
                                    return aVar9;
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
                i4Var = new i4(this, cVar);
                Object obj82 = i4Var.u;
                b71.a aVar92 = b71.a.r;
                i7 = i4Var.v;
                if (i7 != 0) {
                }
                return a0.a;
            case 7:
                if (cVar instanceof wy0.a) {
                    aVar2 = (wy0.a) cVar;
                    int i22 = aVar2.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        aVar2.v = i22 - Integer.MIN_VALUE;
                        Object obj9 = aVar2.u;
                        b71.a aVar10 = b71.a.r;
                        i8 = aVar2.v;
                        if (i8 != 0) {
                            y.j(obj9);
                            jn0.v2 v2Var2 = (jn0.v2) obj;
                            x2 x2Var = v2Var2.b;
                            if (x2Var == null || (z2Var = x2Var.c) == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid Repository Data", null, null, null, null, null, 120);
                            }
                            b3 b3Var = z2Var.a;
                            y2 y2Var = x2Var.d;
                            if (y2Var == null) {
                                throw new ApiFailure(ApiFailureType.RESPONSE_ERROR, "Invalid Assignee Data", null, null, null, null, null, 120);
                            }
                            kx0.m mVar2 = new kx0.m(v2Var2, b3Var, y2Var.a, p.T(this.t));
                            aVar2.v = 1;
                            if (this.s.c(mVar2, aVar2) == aVar10) {
                                return aVar10;
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
                aVar2 = new wy0.a(this, cVar);
                Object obj92 = aVar2.u;
                b71.a aVar102 = b71.a.r;
                i8 = aVar2.v;
                if (i8 != 0) {
                }
                return a0.a;
            case 8:
                if (cVar instanceof wy0.f1) {
                    f1Var2 = (wy0.f1) cVar;
                    int i23 = f1Var2.v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        f1Var2.v = i23 - Integer.MIN_VALUE;
                        Object obj10 = f1Var2.u;
                        b71.a aVar11 = b71.a.r;
                        i9 = f1Var2.v;
                        if (i9 != 0) {
                            y.j(obj10);
                            ar0.k kVar = (ar0.k) obj;
                            io0.k kVar2 = null;
                            if (kVar != null) {
                                ba.Companion.getClass();
                                kVar2 = new io0.k(new io0.m(new io0.l(((q) ba.l).a, this.t, ar0.k.a(kVar, false, null))));
                            }
                            f1Var2.v = 1;
                            if (this.s.c(kVar2, f1Var2) == aVar11) {
                                return aVar11;
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
                f1Var2 = new wy0.f1(this, cVar);
                Object obj102 = f1Var2.u;
                b71.a aVar112 = b71.a.r;
                i9 = f1Var2.v;
                if (i9 != 0) {
                }
                return a0.a;
            case 9:
                if (cVar instanceof wy0.i1) {
                    i1Var2 = (wy0.i1) cVar;
                    int i24 = i1Var2.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        i1Var2.v = i24 - Integer.MIN_VALUE;
                        Object obj11 = i1Var2.u;
                        b71.a aVar12 = b71.a.r;
                        i10 = i1Var2.v;
                        if (i10 != 0) {
                            y.j(obj11);
                            u90 u90Var = ((s90) obj).a;
                            if ((u90Var != null ? u90Var.a : null) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, f1.e.g("Invalid Discussion id: ", this.t), null, null, null, null, null, 120);
                            }
                            b01.j j = b41.b.j(u90Var.a.c);
                            i1Var2.v = 1;
                            if (this.s.c(j, i1Var2) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj11);
                        }
                        return a0.a;
                    }
                }
                i1Var2 = new wy0.i1(this, cVar);
                Object obj112 = i1Var2.u;
                b71.a aVar122 = b71.a.r;
                i10 = i1Var2.v;
                if (i10 != 0) {
                }
                return a0.a;
            case 10:
                if (cVar instanceof j1) {
                    j1Var = (j1) cVar;
                    int i25 = j1Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        j1Var.v = i25 - Integer.MIN_VALUE;
                        Object obj12 = j1Var.u;
                        b71.a aVar13 = b71.a.r;
                        i12 = j1Var.v;
                        if (i12 != 0) {
                            y.j(obj12);
                            k90 k90Var = ((i90) obj).a;
                            if ((k90Var != null ? k90Var.a : null) == null) {
                                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid Discussion id: ".concat(this.t), null, null, null, null, null, 120);
                            }
                            b01.e eVar2 = b41.b.j(k90Var.a.c).c.m;
                            j1Var.v = 1;
                            if (this.s.c(eVar2, j1Var) == aVar13) {
                                return aVar13;
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
                j1Var = new j1(this, cVar);
                Object obj122 = j1Var.u;
                b71.a aVar132 = b71.a.r;
                i12 = j1Var.v;
                if (i12 != 0) {
                }
                return a0.a;
            default:
                if (cVar instanceof d5) {
                    d5Var = (d5) cVar;
                    int i26 = d5Var.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        d5Var.v = i26 - Integer.MIN_VALUE;
                        Object obj13 = d5Var.u;
                        b71.a aVar14 = b71.a.r;
                        i13 = d5Var.v;
                        if (i13 != 0) {
                            y.j(obj13);
                            m3 m3Var2 = (m3) obj;
                            if (m3Var2.a == null && this.t != null) {
                                m3Var2 = null;
                            }
                            if (m3Var2 != null) {
                                d5Var.v = 1;
                                if (this.s.c(m3Var2, d5Var) == aVar14) {
                                    return aVar14;
                                }
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
                d5Var = new d5(this, cVar);
                Object obj132 = d5Var.u;
                b71.a aVar142 = b71.a.r;
                i13 = d5Var.v;
                if (i13 != 0) {
                }
                return a0.a;
        }
    }
}
