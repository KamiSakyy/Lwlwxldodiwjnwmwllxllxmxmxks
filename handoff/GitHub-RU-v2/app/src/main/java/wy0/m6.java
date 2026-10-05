package wy0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.SimpleRepository;
import java.util.ArrayList;
import java.util.List;
import jn0.ag0;
import jn0.ax;
import jn0.ay;
import jn0.b00;
import jn0.bg0;
import jn0.bw;
import jn0.bx;
import jn0.c00;
import jn0.c10;
import jn0.cy;
import jn0.d10;
import jn0.dw;
import jn0.e10;
import jn0.ew;
import jn0.ey;
import jn0.fy;
import jn0.gx;
import jn0.h50;
import jn0.hy;
import jn0.i50;
import jn0.ix;
import jn0.iy;
import jn0.j50;
import jn0.kx;
import jn0.l50;
import jn0.lx;
import jn0.nx;
import jn0.o10;
import jn0.p10;
import jn0.pv;
import jn0.px;
import jn0.qx;
import jn0.qz;
import jn0.rv;
import jn0.rz;
import jn0.s10;
import jn0.s30;
import jn0.sv;
import jn0.sz;
import jn0.t00;
import jn0.t10;
import jn0.t30;
import jn0.tv;
import jn0.u00;
import jn0.u10;
import jn0.u30;
import jn0.v30;
import jn0.w30;
import jn0.w40;
import jn0.x00;
import jn0.x40;
import jn0.xv;
import jn0.xw;
import jn0.y40;
import jn0.yv;
import jn0.yw;
import jn0.z00;
import jn0.zw;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m6 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ m6(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        w7 w7Var;
        int i;
        if (cVar instanceof w7) {
            w7Var = (w7) cVar;
            int i2 = w7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = w7Var.u;
                b71.a aVar = b71.a.r;
                i = w7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    s30 s30Var = (s30) obj;
                    w30 w30Var = s30Var.a;
                    int i3 = w30Var.a;
                    Iterable iterable = w30Var.c;
                    if (iterable == null) {
                        iterable = x61.r.r;
                    }
                    ArrayList S = x61.m.S(iterable);
                    ArrayList arrayList = new ArrayList();
                    int size = S.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = S.get(i4);
                        i4++;
                        u30 u30Var = ((t30) obj3).b;
                        SimpleRepository H = u30Var != null ? w8.s.H(u30Var.c) : null;
                        if (H != null) {
                            arrayList.add(H);
                        }
                    }
                    v30 v30Var = s30Var.a.b;
                    yz0.d4 d4Var = new yz0.d4(i3, arrayList, new x01.i(v30Var.b, v30Var.a, false));
                    w7Var.v = 1;
                    if (this.s.c(d4Var, w7Var) == aVar) {
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
        w7Var = new w7(this, cVar);
        Object obj22 = w7Var.u;
        b71.a aVar2 = b71.a.r;
        i = w7Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object b(a71.c cVar, Object obj) {
        x7 x7Var;
        int i;
        if (cVar instanceof x7) {
            x7Var = (x7) cVar;
            int i2 = x7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = x7Var.u;
                b71.a aVar = b71.a.r;
                i = x7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Boolean bool = Boolean.FALSE;
                    x7Var.v = 1;
                    if (this.s.c(bool, x7Var) == aVar) {
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
        x7Var = new x7(this, cVar);
        Object obj22 = x7Var.u;
        b71.a aVar2 = b71.a.r;
        i = x7Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        y7 y7Var;
        int i;
        if (cVar instanceof y7) {
            y7Var = (y7) cVar;
            int i2 = y7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = y7Var.u;
                b71.a aVar = b71.a.r;
                i = y7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Boolean bool = Boolean.TRUE;
                    y7Var.v = 1;
                    if (this.s.c(bool, y7Var) == aVar) {
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
        y7Var = new y7(this, cVar);
        Object obj22 = y7Var.u;
        b71.a aVar2 = b71.a.r;
        i = y7Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        a8 a8Var;
        int i;
        ay ayVar;
        if (cVar instanceof a8) {
            a8Var = (a8) cVar;
            int i2 = a8Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a8Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = a8Var.u;
                b71.a aVar = b71.a.r;
                i = a8Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    iy iyVar = (iy) obj;
                    int i3 = iyVar.a;
                    cy cyVar = iyVar.c;
                    Integer num = new Integer(i3);
                    List list = cyVar != null ? cyVar.c : null;
                    if (list == null) {
                        list = x61.r.r;
                    }
                    ArrayList S = x61.m.S(list);
                    ArrayList arrayList = new ArrayList();
                    int size = S.size();
                    int i4 = 0;
                    while (i4 < size) {
                        Object obj3 = S.get(i4);
                        i4++;
                        String str = ((fy) obj3).c.d;
                        hy hyVar = iyVar.b;
                        if (!str.equals((hyVar == null || (ayVar = hyVar.a) == null) ? null : ayVar.b.b)) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size2 = arrayList.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj4 = arrayList.get(i5);
                        i5++;
                        fy fyVar = (fy) obj4;
                        fw0.c1 c1Var = fyVar.c;
                        arrayList2.add(new yz0.e2(new com.github.service.models.response.a(c1Var.d, m7.y.L(c1Var.g), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, fyVar.c.b, yz0.f2.d, false, 96));
                    }
                    w61.q qVar = new w61.q(num, arrayList2, new x01.i(cyVar != null ? cyVar.a.b : null, cyVar != null ? cyVar.a.a : false, false));
                    a8Var.v = 1;
                    if (this.s.c(qVar, a8Var) == aVar) {
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
        a8Var = new a8(this, cVar);
        Object obj22 = a8Var.u;
        b71.a aVar2 = b71.a.r;
        i = a8Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x04c1  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0555  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x0652  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:428:0x06b9  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0719  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:509:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x07e5  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0838  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x087c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:562:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:578:0x08c8  */
    /* JADX WARN: Removed duplicated region for block: B:584:0x08d6  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:642:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:648:0x09de  */
    /* JADX WARN: Removed duplicated region for block: B:664:0x0a22  */
    /* JADX WARN: Removed duplicated region for block: B:670:0x0a31  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x0a70  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0163  */
    /* JADX WARN: Type inference failed for: r2v64, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v9, types: [x61.r] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l6 l6Var;
        int i;
        rz rzVar;
        o6 o6Var;
        int i2;
        q6 q6Var;
        int i3;
        r6 r6Var;
        int i4;
        String str;
        tv tvVar;
        tv tvVar2;
        tv tvVar3;
        t6 t6Var;
        int i5;
        p01.g gVar;
        ix ixVar;
        u6 u6Var;
        int i6;
        String str2;
        v6 v6Var;
        int i7;
        d10 d10Var;
        w6 w6Var;
        int i8;
        x6 x6Var;
        int i9;
        java.util.ArrayList r5;
        List<bw> list;
        dw dwVar;
        a7 a7Var;
        int i10;
        String str3;
        String str4;
        b7 b7Var;
        int i12;
        p01.i iVar;
        p01.g gVar2;
        c7 c7Var;
        int i13;
        ax axVar;
        ax axVar2;
        bx bxVar;
        String str5;
        bx bxVar2;
        d7 d7Var;
        int i14;
        e7 e7Var;
        int i15;
        f7 f7Var;
        int i16;
        g7 g7Var;
        int i17;
        py0.i iVar2;
        h7 h7Var;
        int i18;
        i7 i7Var;
        int i19;
        j7 j7Var;
        int i20;
        java.util.ArrayList r2;
        List<py0.z> list2;
        k7 k7Var;
        int i22;
        l7 l7Var;
        int i23;
        j50 j50Var;
        j50 j50Var2;
        j50 j50Var3;
        n7 n7Var;
        int i24;
        p7 p7Var;
        int i25;
        q7 q7Var;
        int i26;
        t7 t7Var;
        int i27;
        b8 b8Var;
        int i28;
        switch (this.r) {
            case 0:
                if (cVar instanceof l6) {
                    l6Var = (l6) cVar;
                    int i29 = l6Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        l6Var.v = i29 - Integer.MIN_VALUE;
                        Object obj2 = l6Var.u;
                        b71.a aVar = b71.a.r;
                        i = l6Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            sz szVar = ((qz) obj).a;
                            yz0.j O = (szVar == null || (rzVar = szVar.a) == null) ? null : v8.l0.O(rzVar.c, true);
                            if (O != null) {
                                l6Var.v = 1;
                                if (this.s.c(O, l6Var) == aVar) {
                                    return aVar;
                                }
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
                l6Var = new l6(this, cVar);
                Object obj22 = l6Var.u;
                b71.a aVar2 = b71.a.r;
                i = l6Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof o6) {
                    o6Var = (o6) cVar;
                    int i30 = o6Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        o6Var.v = i30 - Integer.MIN_VALUE;
                        Object obj3 = o6Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = o6Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            o6Var.v = 1;
                            if (this.s.c(a0Var, o6Var) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return a0Var;
                    }
                }
                o6Var = new o6(this, cVar);
                Object obj32 = o6Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = o6Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i2 != 0) {
                }
                return a0Var2;
            case 2:
                if (cVar instanceof q6) {
                    q6Var = (q6) cVar;
                    int i32 = q6Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        q6Var.v = i32 - Integer.MIN_VALUE;
                        Object obj4 = q6Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = q6Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            py0.c cVar2 = ((py0.b) obj).a;
                            boolean z = false;
                            if (cVar2 != null && !cVar2.b) {
                                z = true;
                            }
                            Boolean valueOf = Boolean.valueOf(z);
                            q6Var.v = 1;
                            if (this.s.c(valueOf, q6Var) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                q6Var = new q6(this, cVar);
                Object obj42 = q6Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = q6Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof r6) {
                    r6Var = (r6) cVar;
                    int i33 = r6Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        r6Var.v = i33 - Integer.MIN_VALUE;
                        Object obj5 = r6Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = r6Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            pv pvVar = (pv) obj;
                            sv svVar = pvVar.a;
                            List list3 = (svVar == null || (tvVar3 = svVar.c) == null) ? null : tvVar3.a.b;
                            if (list3 == null) {
                                list3 = x61.r.r;
                            }
                            ArrayList S = x61.m.S(list3);
                            ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i34 = 0;
                            while (i34 < size) {
                                Object obj6 = S.get(i34);
                                i34++;
                                rv rvVar = (rv) obj6;
                                arrayList.add(w8.s.E(new w61.k(rvVar.c, rvVar.d)));
                            }
                            sv svVar2 = pvVar.a;
                            boolean z2 = (svVar2 == null || (tvVar2 = svVar2.c) == null) ? false : tvVar2.a.a.a;
                            if (svVar2 == null || (tvVar = svVar2.c) == null || (str = tvVar.a.a.b) == null) {
                                str = "";
                            }
                            yz0.c4 c4Var = new yz0.c4(arrayList, new x01.i(str, z2, false));
                            r6Var.v = 1;
                            if (this.s.c(c4Var, r6Var) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                r6Var = new r6(this, cVar);
                Object obj52 = r6Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = r6Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof t6) {
                    t6Var = (t6) cVar;
                    int i35 = t6Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        t6Var.v = i35 - Integer.MIN_VALUE;
                        Object obj7 = t6Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = t6Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            lx lxVar = ((kx) obj).a;
                            if (lxVar == null || (ixVar = lxVar.b) == null) {
                                p01.g.Companion.getClass();
                                gVar = p01.g.e;
                            } else {
                                gVar = w8.s.B(ixVar.c);
                            }
                            t6Var.v = 1;
                            if (this.s.c(gVar, t6Var) == aVar6) {
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
                t6Var = new t6(this, cVar);
                Object obj72 = t6Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = t6Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof u6) {
                    u6Var = (u6) cVar;
                    int i36 = u6Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        u6Var.v = i36 - Integer.MIN_VALUE;
                        Object obj8 = u6Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = u6Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            u00 u00Var = ((t00) obj).a;
                            if (u00Var == null || (str2 = u00Var.a) == null) {
                                str2 = "";
                            }
                            u6Var.v = 1;
                            if (this.s.c(str2, u6Var) == aVar7) {
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
                u6Var = new u6(this, cVar);
                Object obj82 = u6Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = u6Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof v6) {
                    v6Var = (v6) cVar;
                    int i37 = v6Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        v6Var.v = i37 - Integer.MIN_VALUE;
                        Object obj9 = v6Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = v6Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj9);
                            e10 e10Var = ((c10) obj).a;
                            i01.a c0 = (e10Var == null || (d10Var = e10Var.b) == null) ? null : com.google.android.gms.internal.measurement.d5.c0(d10Var.c);
                            v6Var.v = 1;
                            if (this.s.c(c0, v6Var) == aVar8) {
                                return aVar8;
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
                v6Var = new v6(this, cVar);
                Object obj92 = v6Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = v6Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof w6) {
                    w6Var = (w6) cVar;
                    int i38 = w6Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        w6Var.v = i38 - Integer.MIN_VALUE;
                        Object obj10 = w6Var.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = w6Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj10);
                            z00 z00Var = ((x00) obj).a;
                            Boolean valueOf2 = Boolean.valueOf((z00Var != null ? z00Var.b : null) != null);
                            w6Var.v = 1;
                            if (this.s.c(valueOf2, w6Var) == aVar9) {
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
                w6Var = new w6(this, cVar);
                Object obj102 = w6Var.u;
                b71.a aVar92 = b71.a.r;
                i8 = w6Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof x6) {
                    x6Var = (x6) cVar;
                    int i39 = x6Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        x6Var.v = i39 - Integer.MIN_VALUE;
                        Object obj11 = x6Var.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = x6Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj11);
                            xv xvVar = (xv) obj;
                            k71.k.g(xvVar, "<this>");
                            ew ewVar = xvVar.a;
                            if ((ewVar != null ? ewVar.b : null) == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Merge queue does not exists", null, null, null, null, null, 116);
                            }
                            yv yvVar = ewVar.b.c;
                            x61.r rVar = x61.r.r;
                            if (yvVar == null || (list = yvVar.c) == null) {
                                r5 = rVar;
                            } else {
                                r5 = new ArrayList();
                                for (bw bwVar : list) {
                                    i01.c cVar3 = (bwVar == null || (dwVar = bwVar.c) == null) ? null : new i01.c(k21.f.J(dwVar.c), bwVar.b);
                                    if (cVar3 != null) {
                                        r5.add(cVar3);
                                    }
                                }
                            }
                            yv yvVar2 = ewVar.b.c;
                            i01.d dVar = new i01.d(rVar, r5, new x01.i(yvVar2 != null ? yvVar2.b.b : null, yvVar2 != null ? yvVar2.b.a : false, false));
                            x6Var.v = 1;
                            if (this.s.c(dVar, x6Var) == aVar10) {
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
                x6Var = new x6(this, cVar);
                Object obj112 = x6Var.u;
                b71.a aVar102 = b71.a.r;
                i9 = x6Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof a7) {
                    a7Var = (a7) cVar;
                    int i40 = a7Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        a7Var.v = i40 - Integer.MIN_VALUE;
                        Object obj12 = a7Var.u;
                        b71.a aVar11 = b71.a.r;
                        i10 = a7Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj12);
                            u10 u10Var = ((s10) obj).a;
                            t10 t10Var = u10Var != null ? u10Var.a : null;
                            String str6 = "";
                            if (t10Var == null || (str3 = t10Var.a) == null) {
                                str3 = "";
                            }
                            if (t10Var != null && (str4 = t10Var.b) != null) {
                                str6 = str4;
                            }
                            yz0.v3 v3Var = new yz0.v3(str3, str6);
                            a7Var.v = 1;
                            if (this.s.c(v3Var, a7Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                a7Var = new a7(this, cVar);
                Object obj122 = a7Var.u;
                b71.a aVar112 = b71.a.r;
                i10 = a7Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof b7) {
                    b7Var = (b7) cVar;
                    int i42 = b7Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        b7Var.v = i42 - Integer.MIN_VALUE;
                        Object obj13 = b7Var.u;
                        b71.a aVar12 = b71.a.r;
                        i12 = b7Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj13);
                            qx qxVar = ((px) obj).a;
                            if (qxVar != null) {
                                nx nxVar = qxVar.c;
                                if (nxVar != null) {
                                    gVar2 = w8.s.B(nxVar.c);
                                } else {
                                    p01.g.Companion.getClass();
                                    gVar2 = p01.g.e;
                                }
                                iVar = new p01.i(gVar2, qxVar.b);
                            } else {
                                p01.i.Companion.getClass();
                                iVar = p01.i.c;
                            }
                            b7Var.v = 1;
                            if (this.s.c(iVar, b7Var) == aVar12) {
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
                b7Var = new b7(this, cVar);
                Object obj132 = b7Var.u;
                b71.a aVar122 = b71.a.r;
                i12 = b7Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof c7) {
                    c7Var = (c7) cVar;
                    int i43 = c7Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        c7Var.v = i43 - Integer.MIN_VALUE;
                        Object obj14 = c7Var.u;
                        b71.a aVar13 = b71.a.r;
                        i13 = c7Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj14);
                            xw xwVar = (xw) obj;
                            gx gxVar = xwVar.a;
                            String str7 = null;
                            bx bxVar3 = gxVar != null ? gxVar.b : null;
                            java.util.List r6 = (java.util.List) (x61.r.r);
                            if (bxVar3 != null) {
                                List list4 = gxVar.b.a.b;
                                List list5 = r6;
                                if (list4 != null) {
                                    list5 = list4;
                                }
                                ArrayList S2 = x61.m.S(list5);
                                r6 = new ArrayList(x61.n.F(S2, 10));
                                int size2 = S2.size();
                                int i44 = 0;
                                while (i44 < size2) {
                                    Object obj15 = S2.get(i44);
                                    i44++;
                                    zw zwVar = (zw) obj15;
                                    r6.add(w8.s.E(new w61.k(zwVar.c, zwVar.d)));
                                }
                            } else if ((gxVar != null ? gxVar.c : null) != null) {
                                List list6 = gxVar.c.a.b;
                                List list7 = r6;
                                if (list6 != null) {
                                    list7 = list6;
                                }
                                ArrayList S3 = x61.m.S(list7);
                                r6 = new ArrayList(x61.n.F(S3, 10));
                                int size3 = S3.size();
                                int i45 = 0;
                                while (i45 < size3) {
                                    Object obj16 = S3.get(i45);
                                    i45++;
                                    yw ywVar = (yw) obj16;
                                    r6.add(w8.s.E(new w61.k(ywVar.c, ywVar.d)));
                                }
                            }
                            gx gxVar2 = xwVar.a;
                            boolean z3 = (gxVar2 == null || (bxVar2 = gxVar2.b) == null) ? (gxVar2 == null || (axVar = gxVar2.c) == null) ? false : axVar.a.a.a : bxVar2.a.a.a;
                            if (gxVar2 != null && (bxVar = gxVar2.b) != null && (str5 = bxVar.a.a.b) != null) {
                                str7 = str5;
                            } else if (gxVar2 != null && (axVar2 = gxVar2.c) != null) {
                                str7 = axVar2.a.a.b;
                            }
                            yz0.c4 c4Var2 = new yz0.c4(r6, new x01.i(str7, z3, false));
                            c7Var.v = 1;
                            if (this.s.c(c4Var2, c7Var) == aVar13) {
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
                c7Var = new c7(this, cVar);
                Object obj142 = c7Var.u;
                b71.a aVar132 = b71.a.r;
                i13 = c7Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof d7) {
                    d7Var = (d7) cVar;
                    int i46 = d7Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        d7Var.v = i46 - Integer.MIN_VALUE;
                        Object obj17 = d7Var.u;
                        b71.a aVar14 = b71.a.r;
                        i14 = d7Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj17);
                            bx0.l lVar = bx0.m.Companion;
                            uu0.i2 i2Var = ((p10) obj).c;
                            lVar.getClass();
                            p01.j a = bx0.l.a(i2Var);
                            d7Var.v = 1;
                            if (this.s.c(a, d7Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                d7Var = new d7(this, cVar);
                Object obj172 = d7Var.u;
                b71.a aVar142 = b71.a.r;
                i14 = d7Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof e7) {
                    e7Var = (e7) cVar;
                    int i47 = e7Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        e7Var.v = i47 - Integer.MIN_VALUE;
                        Object obj18 = e7Var.u;
                        b71.a aVar15 = b71.a.r;
                        i15 = e7Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj18);
                            p10 p10Var = ((o10) obj).a;
                            if (p10Var != null) {
                                e7Var.v = 1;
                                if (this.s.c(p10Var, e7Var) == aVar15) {
                                    return aVar15;
                                }
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                e7Var = new e7(this, cVar);
                Object obj182 = e7Var.u;
                b71.a aVar152 = b71.a.r;
                i15 = e7Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof f7) {
                    f7Var = (f7) cVar;
                    int i48 = f7Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        f7Var.v = i48 - Integer.MIN_VALUE;
                        Object obj19 = f7Var.u;
                        b71.a aVar16 = b71.a.r;
                        i16 = f7Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj19);
                            ry0.b bVar = (ry0.b) obj;
                            k71.k.g(bVar, "<this>");
                            boolean z4 = bVar.b;
                            ry0.a aVar17 = bVar.c;
                            p01.k kVar = new p01.k(z4, (aVar17 != null ? aVar17.a : 0) > 0);
                            f7Var.v = 1;
                            if (this.s.c(kVar, f7Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                f7Var = new f7(this, cVar);
                Object obj192 = f7Var.u;
                b71.a aVar162 = b71.a.r;
                i16 = f7Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof g7) {
                    g7Var = (g7) cVar;
                    int i49 = g7Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        g7Var.v = i49 - Integer.MIN_VALUE;
                        Object obj20 = g7Var.u;
                        b71.a aVar18 = b71.a.r;
                        i17 = g7Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj20);
                            py0.h hVar = ((py0.g) obj).a;
                            ry0.b bVar2 = (hVar == null || (iVar2 = hVar.c) == null) ? null : iVar2.b;
                            if (bVar2 != null) {
                                g7Var.v = 1;
                                if (this.s.c(bVar2, g7Var) == aVar18) {
                                    return aVar18;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                g7Var = new g7(this, cVar);
                Object obj202 = g7Var.u;
                b71.a aVar182 = b71.a.r;
                i17 = g7Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof h7) {
                    h7Var = (h7) cVar;
                    int i50 = h7Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        h7Var.v = i50 - Integer.MIN_VALUE;
                        Object obj21 = h7Var.u;
                        b71.a aVar19 = b71.a.r;
                        i18 = h7Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj21);
                            py0.l lVar2 = (py0.l) obj;
                            k71.k.g(lVar2, "<this>");
                            py0.m mVar = lVar2.a;
                            p01.l lVar3 = new p01.l(mVar != null ? mVar.a : "", mVar != null ? mVar.b : false, mVar != null ? mVar.c : false);
                            h7Var.v = 1;
                            if (this.s.c(lVar3, h7Var) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                h7Var = new h7(this, cVar);
                Object obj212 = h7Var.u;
                b71.a aVar192 = b71.a.r;
                i18 = h7Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof i7) {
                    i7Var = (i7) cVar;
                    int i52 = i7Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        i7Var.v = i52 - Integer.MIN_VALUE;
                        Object obj23 = i7Var.u;
                        b71.a aVar20 = b71.a.r;
                        i19 = i7Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj23);
                            c00 c00Var = ((b00) obj).a;
                            String str8 = c00Var != null ? c00Var.a : null;
                            if (str8 != null) {
                                i7Var.v = 1;
                                if (this.s.c(str8, i7Var) == aVar20) {
                                    return aVar20;
                                }
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                i7Var = new i7(this, cVar);
                Object obj232 = i7Var.u;
                b71.a aVar202 = b71.a.r;
                i19 = i7Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof j7) {
                    j7Var = (j7) cVar;
                    int i53 = j7Var.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        j7Var.v = i53 - Integer.MIN_VALUE;
                        Object obj24 = j7Var.u;
                        b71.a aVar21 = b71.a.r;
                        i20 = j7Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj24);
                            py0.y yVar = (py0.y) obj;
                            k71.k.g(yVar, "<this>");
                            py0.a0 a0Var3 = yVar.a;
                            if (a0Var3 == null || (list2 = a0Var3.b) == null) {
                                r2 = x61.r.r;
                            } else {
                                r2 = new ArrayList(x61.n.F(list2, 10));
                                for (py0.z zVar : list2) {
                                    k71.k.g(zVar, "<this>");
                                    String str9 = zVar.b;
                                    String str10 = "";
                                    if (str9 == null) {
                                        str9 = "";
                                    }
                                    String str11 = zVar.a;
                                    if (str11 != null) {
                                        str10 = str11;
                                    }
                                    r2.add(new p01.o(str9, str10));
                                }
                            }
                            j7Var.v = 1;
                            if (this.s.c((Object) r2, j7Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                j7Var = new j7(this, cVar);
                Object obj242 = j7Var.u;
                b71.a aVar212 = b71.a.r;
                i20 = j7Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof k7) {
                    k7Var = (k7) cVar;
                    int i54 = k7Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        k7Var.v = i54 - Integer.MIN_VALUE;
                        Object obj25 = k7Var.u;
                        b71.a aVar22 = b71.a.r;
                        i22 = k7Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj25);
                            w40 w40Var = (w40) obj;
                            Iterable iterable = w40Var.a.a.b;
                            if (iterable == null) {
                                iterable = x61.r.r;
                            }
                            ArrayList S4 = x61.m.S(iterable);
                            ArrayList arrayList2 = new ArrayList(x61.n.F(S4, 10));
                            int size4 = S4.size();
                            int i55 = 0;
                            while (i55 < size4) {
                                Object obj26 = S4.get(i55);
                                i55++;
                                arrayList2.add(w8.s.H(((x40) obj26).d));
                            }
                            y40 y40Var = w40Var.a.a.a;
                            w61.k kVar2 = new w61.k(arrayList2, new x01.i(y40Var.b, y40Var.a, false));
                            k7Var.v = 1;
                            if (this.s.c(kVar2, k7Var) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                k7Var = new k7(this, cVar);
                Object obj252 = k7Var.u;
                b71.a aVar222 = b71.a.r;
                i22 = k7Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 20:
                if (cVar instanceof l7) {
                    l7Var = (l7) cVar;
                    int i56 = l7Var.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        l7Var.v = i56 - Integer.MIN_VALUE;
                        Object obj27 = l7Var.u;
                        b71.a aVar23 = b71.a.r;
                        i23 = l7Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj27);
                            h50 h50Var = (h50) obj;
                            l50 l50Var = h50Var.a;
                            String str12 = null;
                            List list8 = (l50Var == null || (j50Var3 = l50Var.b) == null) ? null : j50Var3.a.b;
                            if (list8 == null) {
                                list8 = x61.r.r;
                            }
                            ArrayList S5 = x61.m.S(list8);
                            ArrayList arrayList3 = new ArrayList(x61.n.F(S5, 10));
                            int size5 = S5.size();
                            int i57 = 0;
                            while (i57 < size5) {
                                Object obj28 = S5.get(i57);
                                i57++;
                                i50 i50Var = (i50) obj28;
                                arrayList3.add(w8.s.E(new w61.k(i50Var.c, i50Var.d)));
                            }
                            l50 l50Var2 = h50Var.a;
                            boolean z5 = (l50Var2 == null || (j50Var2 = l50Var2.b) == null) ? false : j50Var2.a.a.a;
                            if (l50Var2 != null && (j50Var = l50Var2.b) != null) {
                                str12 = j50Var.a.a.b;
                            }
                            yz0.c4 c4Var3 = new yz0.c4(arrayList3, new x01.i(str12, z5, false));
                            l7Var.v = 1;
                            if (this.s.c(c4Var3, l7Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                l7Var = new l7(this, cVar);
                Object obj272 = l7Var.u;
                b71.a aVar232 = b71.a.r;
                i23 = l7Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 21:
                if (cVar instanceof n7) {
                    n7Var = (n7) cVar;
                    int i58 = n7Var.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        n7Var.v = i58 - Integer.MIN_VALUE;
                        Object obj29 = n7Var.u;
                        b71.a aVar24 = b71.a.r;
                        i24 = n7Var.v;
                        if (i24 != 0) {
                            sy.y.j(obj29);
                            bg0 bg0Var = ((ag0) obj).a;
                            Boolean valueOf3 = Boolean.valueOf(bg0Var != null ? bg0Var.b : false);
                            n7Var.v = 1;
                            if (this.s.c(valueOf3, n7Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                n7Var = new n7(this, cVar);
                Object obj292 = n7Var.u;
                b71.a aVar242 = b71.a.r;
                i24 = n7Var.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
            case 22:
                if (cVar instanceof p7) {
                    p7Var = (p7) cVar;
                    int i59 = p7Var.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        p7Var.v = i59 - Integer.MIN_VALUE;
                        Object obj30 = p7Var.u;
                        b71.a aVar25 = b71.a.r;
                        i25 = p7Var.v;
                        if (i25 != 0) {
                            sy.y.j(obj30);
                            bx0.l lVar4 = bx0.m.Companion;
                            uu0.i2 i2Var2 = ((p10) obj).c;
                            lVar4.getClass();
                            p01.j a2 = bx0.l.a(i2Var2);
                            p7Var.v = 1;
                            if (this.s.c(a2, p7Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                        }
                        return w61.a0.a;
                    }
                }
                p7Var = new p7(this, cVar);
                Object obj302 = p7Var.u;
                b71.a aVar252 = b71.a.r;
                i25 = p7Var.v;
                if (i25 != 0) {
                }
                return w61.a0.a;
            case 23:
                if (cVar instanceof q7) {
                    q7Var = (q7) cVar;
                    int i60 = q7Var.v;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        q7Var.v = i60 - Integer.MIN_VALUE;
                        Object obj31 = q7Var.u;
                        b71.a aVar26 = b71.a.r;
                        i26 = q7Var.v;
                        if (i26 != 0) {
                            sy.y.j(obj31);
                            p10 p10Var2 = ((o10) obj).a;
                            if (p10Var2 != null) {
                                q7Var.v = 1;
                                if (this.s.c(p10Var2, q7Var) == aVar26) {
                                    return aVar26;
                                }
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj31);
                        }
                        return w61.a0.a;
                    }
                }
                q7Var = new q7(this, cVar);
                Object obj312 = q7Var.u;
                b71.a aVar262 = b71.a.r;
                i26 = q7Var.v;
                if (i26 != 0) {
                }
                return w61.a0.a;
            case 24:
                if (cVar instanceof t7) {
                    t7Var = (t7) cVar;
                    int i62 = t7Var.v;
                    if ((i62 & Integer.MIN_VALUE) != 0) {
                        t7Var.v = i62 - Integer.MIN_VALUE;
                        Object obj33 = t7Var.u;
                        b71.a aVar27 = b71.a.r;
                        i27 = t7Var.v;
                        w61.a0 a0Var4 = w61.a0.a;
                        if (i27 != 0) {
                            sy.y.j(obj33);
                            t7Var.v = 1;
                            if (this.s.c(a0Var4, t7Var) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj33);
                        }
                        return a0Var4;
                    }
                }
                t7Var = new t7(this, cVar);
                Object obj332 = t7Var.u;
                b71.a aVar272 = b71.a.r;
                i27 = t7Var.v;
                w61.a0 a0Var42 = w61.a0.a;
                if (i27 != 0) {
                }
                return a0Var42;
            case 25:
                return a(cVar, obj);
            case 26:
                return b(cVar, obj);
            case 27:
                return d(cVar, obj);
            case 28:
                return e(cVar, obj);
            default:
                if (cVar instanceof b8) {
                    b8Var = (b8) cVar;
                    int i63 = b8Var.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        b8Var.v = i63 - Integer.MIN_VALUE;
                        Object obj34 = b8Var.u;
                        b71.a aVar28 = b71.a.r;
                        i28 = b8Var.v;
                        if (i28 != 0) {
                            sy.y.j(obj34);
                            iy iyVar = ((ey) obj).a;
                            if (iyVar != null) {
                                b8Var.v = 1;
                                if (this.s.c(iyVar, b8Var) == aVar28) {
                                    return aVar28;
                                }
                            }
                        } else {
                            if (i28 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj34);
                        }
                        return w61.a0.a;
                    }
                }
                b8Var = new b8(this, cVar);
                Object obj342 = b8Var.u;
                b71.a aVar282 = b71.a.r;
                i28 = b8Var.v;
                if (i28 != 0) {
                }
                return w61.a0.a;
        }
    }
}
