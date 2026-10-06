package rm0;

import java.util.ArrayList;
import jn0.l30;
import jn0.m30;
import jn0.n30;
import jn0.o30;
import jn0.u60;
import jn0.v60;
import jn0.w60;
import jo.h90;
import jo.i90;
import jo.j90;
import jo.l50;
import jo.m50;
import jo.n50;
import jo.o50;
import kc0.b30;
import kc0.c30;
import kc0.d30;
import kc0.wz;
import kc0.xz;
import kc0.yz;
import kc0.zz;
import kotlin.NoWhenBranchMatchedException;
import u10.ay;
import u10.d10;
import u10.e10;
import u10.f10;
import u10.xx;
import u10.yx;
import u10.zx;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i8 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ com.github.rudroid.common.i0 t;

    public /* synthetic */ i8(y71.j jVar, com.github.rudroid.common.i0 i0Var, int i) {
        this.r = i;
        this.s = jVar;
        this.t = i0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x0674  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x075d  */
    /* JADX WARN: Removed duplicated region for block: B:575:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:698:0x08db  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h8 h8Var;
        int i;
        p8 p8Var;
        int i2;
        u8 u8Var;
        int i3;
        yz yzVar;
        yz yzVar2;
        t00.o8 o8Var;
        int i4;
        t00.u8 u8Var2;
        int i5;
        t00.y8 y8Var;
        int i6;
        n50 n50Var;
        n50 n50Var2;
        vb0.f6 f6Var;
        int i7;
        vb0.k6 k6Var;
        int i8;
        vb0.o6 o6Var;
        int i9;
        zx zxVar;
        zx zxVar2;
        wy0.m7Shadow m7Var;
        int i10;
        wy0.r7 r7Var;
        int i12;
        wy0.v7 v7Var;
        int i13;
        n30 n30Var;
        n30 n30Var2;
        switch (this.r) {
            case 0:
                if (cVar instanceof h8) {
                    h8Var = (h8) cVar;
                    int i14 = h8Var.v;
                    if ((i14 & Integer.MIN_VALUE) != 0) {
                        h8Var.v = i14 - Integer.MIN_VALUE;
                        Object obj2 = h8Var.u;
                        b71.a aVar = b71.a.r;
                        i = h8Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            b30 b30Var = (b30) obj;
                            Iterable iterable = b30Var.a.a.b;
                            if (iterable == null) {
                                iterable = x61.r.r;
                            }
                            ArrayList S = x61.m.S(iterable);
                            ArrayList arrayList = new ArrayList();
                            int size = S.size();
                            int i15 = 0;
                            while (i15 < size) {
                                Object obj3 = S.get(i15);
                                i15++;
                                c30 c30Var = (c30) obj3;
                                int ordinal = this.t.ordinal();
                                if (ordinal != 0) {
                                    if (ordinal != 1) {
                                        if (ordinal != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (c30Var.c && !c30Var.d) {
                                        }
                                    } else if (c30Var.b && !c30Var.d) {
                                    }
                                }
                                arrayList.add(obj3);
                            }
                            ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                            int size2 = arrayList.size();
                            int i16 = 0;
                            while (i16 < size2) {
                                Object obj4 = arrayList.get(i16);
                                i16++;
                                c30 c30Var2 = (c30) obj4;
                                oj0.v3 v3Var = c30Var2.f;
                                oj0.u3 u3Var = v3Var.d;
                                arrayList2.add(new yz0.t7(v3Var.a, v3Var.b, u3Var.c, b41.b.O(u3Var.d), new wl0.j(c30Var2.g), v3Var.c));
                            }
                            d30 d30Var = b30Var.a.a.a;
                            u01.bShadow bVar = new u01.b(arrayList2, new x01.i(d30Var.b, d30Var.a, false));
                            h8Var.v = 1;
                            if (this.s.c(bVar, h8Var) == aVar) {
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
                h8Var = new h8(this, cVar);
                Object obj22 = h8Var.u;
                b71.a aVar2 = b71.a.r;
                i = h8Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof p8) {
                    p8Var = (p8) cVar;
                    int i17 = p8Var.v;
                    if ((i17 & Integer.MIN_VALUE) != 0) {
                        p8Var.v = i17 - Integer.MIN_VALUE;
                        Object obj5 = p8Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = p8Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj5);
                            lm0.f fVar = (lm0.f) obj;
                            ArrayList arrayList3 = fVar.a;
                            ArrayList arrayList4 = new ArrayList();
                            int size3 = arrayList3.size();
                            int i18 = 0;
                            int i19 = 0;
                            while (i19 < size3) {
                                Object obj6 = arrayList3.get(i19);
                                i19++;
                                lm0.i iVar = (lm0.i) obj6;
                                int ordinal2 = this.t.ordinal();
                                if (ordinal2 != 0) {
                                    if (ordinal2 != 1) {
                                        if (ordinal2 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (iVar.d && !iVar.b) {
                                        }
                                    } else if (iVar.c && !iVar.b) {
                                    }
                                }
                                arrayList4.add(obj6);
                            }
                            ArrayList arrayList5 = new ArrayList(x61.n.F(arrayList4, 10));
                            int size4 = arrayList4.size();
                            while (i18 < size4) {
                                Object obj7 = arrayList4.get(i18);
                                i18++;
                                arrayList5.add(((lm0.i) obj7).a);
                            }
                            u01.bShadow bVar2 = new u01.b(arrayList5, fVar.b);
                            p8Var.v = 1;
                            if (this.s.c(bVar2, p8Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                p8Var = new p8(this, cVar);
                Object obj52 = p8Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = p8Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof u8) {
                    u8Var = (u8) cVar;
                    int i20 = u8Var.v;
                    if ((i20 & Integer.MIN_VALUE) != 0) {
                        u8Var.v = i20 - Integer.MIN_VALUE;
                        Object obj8 = u8Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = u8Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj8);
                            wz wzVar = (wz) obj;
                            Iterable iterable2 = wzVar.a.c;
                            if (iterable2 == null) {
                                iterable2 = x61.r.r;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj9 : iterable2) {
                                xz xzVar = (xz) obj9;
                                if (xzVar != null && (yzVar2 = xzVar.b) != null) {
                                    oj0.e2 e2Var = yzVar2.c;
                                    boolean z = e2Var.g;
                                    int ordinal3 = this.t.ordinal();
                                    if (ordinal3 != 0) {
                                        if (ordinal3 != 1) {
                                            if (ordinal3 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (e2Var.n && !z) {
                                            }
                                        } else if (e2Var.m && !z) {
                                        }
                                    }
                                    arrayList6.add(obj9);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList();
                            int size5 = arrayList6.size();
                            int i22 = 0;
                            while (i22 < size5) {
                                Object obj10 = arrayList6.get(i22);
                                i22++;
                                xz xzVar2 = (xz) obj10;
                                p01.n X = (xzVar2 == null || (yzVar = xzVar2.b) == null) ? null : b91.g.X(new w61.k(yzVar.c, yzVar.d));
                                if (X != null) {
                                    arrayList7.add(X);
                                }
                            }
                            zz zzVar = wzVar.a.b;
                            w61.k kVar = new w61.k(arrayList7, new x01.i(zzVar.b, zzVar.a, false));
                            u8Var.v = 1;
                            if (this.s.c(kVar, u8Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                u8Var = new u8(this, cVar);
                Object obj82 = u8Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = u8Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof t00.o8) {
                    o8Var = (t00.o8) cVar;
                    int i23 = o8Var.v;
                    if ((i23 & Integer.MIN_VALUE) != 0) {
                        o8Var.v = i23 - Integer.MIN_VALUE;
                        Object obj11 = o8Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = o8Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj11);
                            h90 h90Var = (h90) obj;
                            Iterable iterable3 = h90Var.a.a.b;
                            if (iterable3 == null) {
                                iterable3 = x61.r.r;
                            }
                            ArrayList S2 = x61.m.S(iterable3);
                            ArrayList arrayList8 = new ArrayList();
                            int size6 = S2.size();
                            int i24 = 0;
                            while (i24 < size6) {
                                Object obj12 = S2.get(i24);
                                i24++;
                                i90 i90Var = (i90) obj12;
                                int ordinal4 = this.t.ordinal();
                                if (ordinal4 != 0) {
                                    if (ordinal4 != 1) {
                                        if (ordinal4 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (i90Var.c && !i90Var.d) {
                                        }
                                    } else if (i90Var.b && !i90Var.d) {
                                    }
                                }
                                arrayList8.add(obj12);
                            }
                            ArrayList arrayList9 = new ArrayList(x61.n.F(arrayList8, 10));
                            int size7 = arrayList8.size();
                            int i25 = 0;
                            while (i25 < size7) {
                                Object obj13 = arrayList8.get(i25);
                                i25++;
                                i90 i90Var2 = (i90) obj13;
                                dw.t5 t5Var = i90Var2.f;
                                dw.s5 s5Var = t5Var.d;
                                arrayList9.add(new yz0.t7(t5Var.a, t5Var.b, s5Var.c, w8.s.A(s5Var.d), new fz.j(i90Var2.g), t5Var.c));
                            }
                            j90 j90Var = h90Var.a.a.a;
                            u01.bShadow bVar3 = new u01.b(arrayList9, new x01.i(j90Var.c, j90Var.a, false));
                            o8Var.v = 1;
                            if (this.s.c(bVar3, o8Var) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                o8Var = new t00.o8(this, cVar);
                Object obj112 = o8Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = o8Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof t00.u8) {
                    u8Var2 = (t00.u8) cVar;
                    int i26 = u8Var2.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        u8Var2.v = i26 - Integer.MIN_VALUE;
                        Object obj14 = u8Var2.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = u8Var2.v;
                        if (i5 != 0) {
                            sy.y.j(obj14);
                            q00.bShadow bVar4 = (q00.b) obj;
                            ArrayList arrayList10 = bVar4.a;
                            ArrayList arrayList11 = new ArrayList();
                            int size8 = arrayList10.size();
                            int i27 = 0;
                            int i28 = 0;
                            while (i28 < size8) {
                                Object obj15 = arrayList10.get(i28);
                                i28++;
                                q00.e eVar = (q00.e) obj15;
                                int ordinal5 = this.t.ordinal();
                                if (ordinal5 != 0) {
                                    if (ordinal5 != 1) {
                                        if (ordinal5 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (eVar.d && !eVar.b) {
                                        }
                                    } else if (eVar.c && !eVar.b) {
                                    }
                                }
                                arrayList11.add(obj15);
                            }
                            ArrayList arrayList12 = new ArrayList(x61.n.F(arrayList11, 10));
                            int size9 = arrayList11.size();
                            while (i27 < size9) {
                                Object obj16 = arrayList11.get(i27);
                                i27++;
                                arrayList12.add(((q00.e) obj16).a);
                            }
                            u01.bShadow bVar5 = new u01.b(arrayList12, bVar4.b);
                            u8Var2.v = 1;
                            if (this.s.c(bVar5, u8Var2) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                u8Var2 = new t00.u8(this, cVar);
                Object obj142 = u8Var2.u;
                b71.a aVar62 = b71.a.r;
                i5 = u8Var2.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof t00.y8) {
                    y8Var = (t00.y8) cVar;
                    int i29 = y8Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        y8Var.v = i29 - Integer.MIN_VALUE;
                        Object obj17 = y8Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = y8Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj17);
                            l50 l50Var = (l50) obj;
                            Iterable iterable4 = l50Var.a.c;
                            if (iterable4 == null) {
                                iterable4 = x61.r.r;
                            }
                            ArrayList arrayList13 = new ArrayList();
                            for (Object obj18 : iterable4) {
                                m50 m50Var = (m50) obj18;
                                if (m50Var != null && (n50Var2 = m50Var.b) != null) {
                                    dw.m3 m3Var = n50Var2.c;
                                    boolean z2 = m3Var.g;
                                    int ordinal6 = this.t.ordinal();
                                    if (ordinal6 != 0) {
                                        if (ordinal6 != 1) {
                                            if (ordinal6 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (m3Var.n && !z2) {
                                            }
                                        } else if (m3Var.m && !z2) {
                                        }
                                    }
                                    arrayList13.add(obj18);
                                }
                            }
                            ArrayList arrayList14 = new ArrayList();
                            int size10 = arrayList13.size();
                            int i30 = 0;
                            while (i30 < size10) {
                                Object obj19 = arrayList13.get(i30);
                                i30++;
                                m50 m50Var2 = (m50) obj19;
                                p01.n G = (m50Var2 == null || (n50Var = m50Var2.b) == null) ? null : sy.n.G(new w61.k(n50Var.c, n50Var.d));
                                if (G != null) {
                                    arrayList14.add(G);
                                }
                            }
                            o50 o50Var = l50Var.a.b;
                            w61.k kVar2 = new w61.k(arrayList14, new x01.i(o50Var.b, o50Var.a, false));
                            y8Var.v = 1;
                            if (this.s.c(kVar2, y8Var) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                y8Var = new t00.y8(this, cVar);
                Object obj172 = y8Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = y8Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof vb0.f6) {
                    f6Var = (vb0.f6) cVar;
                    int i32 = f6Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        f6Var.v = i32 - Integer.MIN_VALUE;
                        Object obj20 = f6Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = f6Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj20);
                            d10 d10Var = (d10) obj;
                            Iterable iterable5 = d10Var.a.a.b;
                            if (iterable5 == null) {
                                iterable5 = x61.r.r;
                            }
                            ArrayList S3 = x61.m.S(iterable5);
                            ArrayList arrayList15 = new ArrayList();
                            int size11 = S3.size();
                            int i33 = 0;
                            int i34 = 0;
                            while (i34 < size11) {
                                Object obj21 = S3.get(i34);
                                i34++;
                                e10 e10Var = (e10) obj21;
                                int ordinal7 = this.t.ordinal();
                                if (ordinal7 != 0) {
                                    if (ordinal7 != 1) {
                                        if (ordinal7 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (e10Var.c && !e10Var.d) {
                                        }
                                    } else if (e10Var.b && !e10Var.d) {
                                    }
                                }
                                arrayList15.add(obj21);
                            }
                            ArrayList arrayList16 = new ArrayList(x61.n.F(arrayList15, 10));
                            int size12 = arrayList15.size();
                            while (i33 < size12) {
                                Object obj23 = arrayList15.get(i33);
                                i33++;
                                e10 e10Var2 = (e10) obj23;
                                w80.q3 q3Var = e10Var2.f;
                                w80.p3 p3Var = q3Var.d;
                                arrayList16.add(new yz0.t7(q3Var.a, q3Var.b, p3Var.c, t.q.q(p3Var.d), new bb0.j(e10Var2.g), q3Var.c));
                            }
                            f10 f10Var = d10Var.a.a.a;
                            u01.bShadow bVar6 = new u01.b(arrayList16, new x01.i(f10Var.b, f10Var.a, !f10Var.c));
                            f6Var.v = 1;
                            if (this.s.c(bVar6, f6Var) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                f6Var = new vb0.f6(this, cVar);
                Object obj202 = f6Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = f6Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof vb0.k6) {
                    k6Var = (vb0.k6) cVar;
                    int i35 = k6Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        k6Var.v = i35 - Integer.MIN_VALUE;
                        Object obj24 = k6Var.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = k6Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj24);
                            pb0.f fVar2 = (pb0.f) obj;
                            ArrayList arrayList17 = fVar2.a;
                            ArrayList arrayList18 = new ArrayList();
                            int size13 = arrayList17.size();
                            int i36 = 0;
                            int i37 = 0;
                            while (i37 < size13) {
                                Object obj25 = arrayList17.get(i37);
                                i37++;
                                pb0.h hVar = (pb0.h) obj25;
                                int ordinal8 = this.t.ordinal();
                                if (ordinal8 != 0) {
                                    if (ordinal8 != 1) {
                                        if (ordinal8 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (hVar.d && !hVar.b) {
                                        }
                                    } else if (hVar.c && !hVar.b) {
                                    }
                                }
                                arrayList18.add(obj25);
                            }
                            ArrayList arrayList19 = new ArrayList(x61.n.F(arrayList18, 10));
                            int size14 = arrayList18.size();
                            while (i36 < size14) {
                                Object obj26 = arrayList18.get(i36);
                                i36++;
                                arrayList19.add(((pb0.h) obj26).a);
                            }
                            u01.bShadow bVar7 = new u01.b(arrayList19, fVar2.b);
                            k6Var.v = 1;
                            if (this.s.c(bVar7, k6Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                k6Var = new vb0.k6(this, cVar);
                Object obj242 = k6Var.u;
                b71.a aVar92 = b71.a.r;
                i8 = k6Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof vb0.o6) {
                    o6Var = (vb0.o6) cVar;
                    int i38 = o6Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        o6Var.v = i38 - Integer.MIN_VALUE;
                        Object obj27 = o6Var.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = o6Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj27);
                            xx xxVar = (xx) obj;
                            Iterable iterable6 = xxVar.a.c;
                            if (iterable6 == null) {
                                iterable6 = x61.r.r;
                            }
                            ArrayList arrayList20 = new ArrayList();
                            for (Object obj28 : iterable6) {
                                yx yxVar = (yx) obj28;
                                if (yxVar != null && (zxVar2 = yxVar.b) != null) {
                                    w80.a2 a2Var = zxVar2.c;
                                    boolean z3 = a2Var.g;
                                    int ordinal9 = this.t.ordinal();
                                    if (ordinal9 != 0) {
                                        if (ordinal9 != 1) {
                                            if (ordinal9 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (a2Var.n && !z3) {
                                            }
                                        } else if (a2Var.m && !z3) {
                                        }
                                    }
                                    arrayList20.add(obj28);
                                }
                            }
                            ArrayList arrayList21 = new ArrayList();
                            int size15 = arrayList20.size();
                            int i39 = 0;
                            while (i39 < size15) {
                                Object obj29 = arrayList20.get(i39);
                                i39++;
                                yx yxVar2 = (yx) obj29;
                                p01.n o = (yxVar2 == null || (zxVar = yxVar2.b) == null) ? null : sy.e0.o(new w61.k(zxVar.c, zxVar.d));
                                if (o != null) {
                                    arrayList21.add(o);
                                }
                            }
                            ay ayVar = xxVar.a.b;
                            w61.k kVar3 = new w61.k(arrayList21, new x01.i(ayVar.b, ayVar.a, false));
                            o6Var.v = 1;
                            if (this.s.c(kVar3, o6Var) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                o6Var = new vb0.o6(this, cVar);
                Object obj272 = o6Var.u;
                b71.a aVar102 = b71.a.r;
                i9 = o6Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof wy0.m7) {
                    m7Var = (wy0.m7) cVar;
                    int i40 = m7Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        m7Var.v = i40 - Integer.MIN_VALUE;
                        Object obj30 = m7Var.u;
                        b71.a aVar11 = b71.a.r;
                        i10 = m7Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj30);
                            u60 u60Var = (u60) obj;
                            Iterable iterable7 = u60Var.a.a.b;
                            if (iterable7 == null) {
                                iterable7 = x61.r.r;
                            }
                            ArrayList S4 = x61.m.S(iterable7);
                            ArrayList arrayList22 = new ArrayList();
                            int size16 = S4.size();
                            int i42 = 0;
                            while (i42 < size16) {
                                Object obj31 = S4.get(i42);
                                i42++;
                                v60 v60Var = (v60) obj31;
                                int ordinal10 = this.t.ordinal();
                                if (ordinal10 != 0) {
                                    if (ordinal10 != 1) {
                                        if (ordinal10 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (v60Var.c && !v60Var.d) {
                                        }
                                    } else if (v60Var.b && !v60Var.d) {
                                    }
                                }
                                arrayList22.add(obj31);
                            }
                            ArrayList arrayList23 = new ArrayList(x61.n.F(arrayList22, 10));
                            int size17 = arrayList22.size();
                            int i43 = 0;
                            while (i43 < size17) {
                                Object obj32 = arrayList22.get(i43);
                                i43++;
                                v60 v60Var2 = (v60) obj32;
                                uu0.z4 z4Var = v60Var2.f;
                                uu0.y4 y4Var = z4Var.d;
                                arrayList23.add(new yz0.t7(z4Var.a, z4Var.b, y4Var.c, m7.y.L(y4Var.d), new kx0.j(v60Var2.g), z4Var.c));
                            }
                            w60 w60Var = u60Var.a.a.a;
                            u01.bShadow bVar8 = new u01.b(arrayList23, new x01.i(w60Var.b, w60Var.a, false));
                            m7Var.v = 1;
                            if (this.s.c(bVar8, m7Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                        }
                        return w61.a0.a;
                    }
                }
                m7Var = new wy0.m7(this, cVar);
                Object obj302 = m7Var.u;
                b71.a aVar112 = b71.a.r;
                i10 = m7Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof wy0.r7) {
                    r7Var = (wy0.r7) cVar;
                    int i44 = r7Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        r7Var.v = i44 - Integer.MIN_VALUE;
                        Object obj33 = r7Var.u;
                        b71.a aVar12 = b71.a.r;
                        i12 = r7Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj33);
                            ty0.bShadow bVar9 = (ty0.b) obj;
                            ArrayList arrayList24 = bVar9.a;
                            ArrayList arrayList25 = new ArrayList();
                            int size18 = arrayList24.size();
                            int i45 = 0;
                            int i46 = 0;
                            while (i46 < size18) {
                                Object obj34 = arrayList24.get(i46);
                                i46++;
                                ty0.d dVar = (ty0.d) obj34;
                                int ordinal11 = this.t.ordinal();
                                if (ordinal11 != 0) {
                                    if (ordinal11 != 1) {
                                        if (ordinal11 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        if (dVar.d && !dVar.b) {
                                        }
                                    } else if (dVar.c && !dVar.b) {
                                    }
                                }
                                arrayList25.add(obj34);
                            }
                            ArrayList arrayList26 = new ArrayList(x61.n.F(arrayList25, 10));
                            int size19 = arrayList25.size();
                            while (i45 < size19) {
                                Object obj35 = arrayList25.get(i45);
                                i45++;
                                arrayList26.add(((ty0.d) obj35).a);
                            }
                            u01.bShadow bVar10 = new u01.b(arrayList26, bVar9.b);
                            r7Var.v = 1;
                            if (this.s.c(bVar10, r7Var) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj33);
                        }
                        return w61.a0.a;
                    }
                }
                r7Var = new wy0.r7(this, cVar);
                Object obj332 = r7Var.u;
                b71.a aVar122 = b71.a.r;
                i12 = r7Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof wy0.v7) {
                    v7Var = (wy0.v7) cVar;
                    int i47 = v7Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        v7Var.v = i47 - Integer.MIN_VALUE;
                        Object obj36 = v7Var.u;
                        b71.a aVar13 = b71.a.r;
                        i13 = v7Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj36);
                            l30 l30Var = (l30) obj;
                            Iterable iterable8 = l30Var.a.c;
                            if (iterable8 == null) {
                                iterable8 = x61.r.r;
                            }
                            ArrayList arrayList27 = new ArrayList();
                            for (Object obj37 : iterable8) {
                                m30 m30Var = (m30) obj37;
                                if (m30Var != null && (n30Var2 = m30Var.b) != null) {
                                    uu0.k3Shadow k3Var = n30Var2.c;
                                    boolean z4 = k3Var.g;
                                    int ordinal12 = this.t.ordinal();
                                    if (ordinal12 != 0) {
                                        if (ordinal12 != 1) {
                                            if (ordinal12 != 2) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            if (k3Var.n && !z4) {
                                            }
                                        } else if (k3Var.m && !z4) {
                                        }
                                    }
                                    arrayList27.add(obj37);
                                }
                            }
                            ArrayList arrayList28 = new ArrayList();
                            int size20 = arrayList27.size();
                            int i48 = 0;
                            while (i48 < size20) {
                                Object obj38 = arrayList27.get(i48);
                                i48++;
                                m30 m30Var2 = (m30) obj38;
                                p01.n E = (m30Var2 == null || (n30Var = m30Var2.b) == null) ? null : w8.s.E(new w61.k(n30Var.c, n30Var.d));
                                if (E != null) {
                                    arrayList28.add(E);
                                }
                            }
                            o30 o30Var = l30Var.a.b;
                            w61.k kVar4 = new w61.k(arrayList28, new x01.i(o30Var.b, o30Var.a, false));
                            v7Var.v = 1;
                            if (this.s.c(kVar4, v7Var) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj36);
                        }
                        return w61.a0.a;
                    }
                }
                v7Var = new wy0.v7(this, cVar);
                Object obj362 = v7Var.u;
                b71.a aVar132 = b71.a.r;
                i13 = v7Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
        }
    }
}
