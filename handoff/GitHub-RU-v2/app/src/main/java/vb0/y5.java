package vb0;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequest$ReviewerReviewState;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.TimelineItem$TimelinePullRequestReview$ReviewState;
import com.github.service.models.response.fileschanged.CommentLevelType;
import hc0.ev;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import u10.a80;
import u10.aa0;
import u10.b80;
import u10.ba0;
import u10.bv;
import u10.bz;
import u10.c00;
import u10.cn;
import u10.cu;
import u10.cv;
import u10.cz;
import u10.du;
import u10.dv;
import u10.dz;
import u10.e00;
import u10.en;
import u10.ez;
import u10.f00;
import u10.fn;
import u10.fu;
import u10.fv;
import u10.fy;
import u10.gn;
import u10.gu;
import u10.gy;
import u10.hn;
import u10.hy;
import u10.in;
import u10.iu;
import u10.iy;
import u10.jn;
import u10.ju;
import u10.jw;
import u10.jy;
import u10.jz;
import u10.kn;
import u10.kw;
import u10.kz;
import u10.ln;
import u10.lz;
import u10.mn;
import u10.nnShadow;
import u10.ol;
import u10.pl;
import u10.ql;
import u10.rf;
import u10.sf;
import u10.u70;
import u10.uz;
import u10.v70;
import u10.vz;
import u10.w70;
import u10.wm;
import u10.wy;
import u10.wz;
import u10.xm;
import u10.xu;
import u10.xy;
import u10.yu;
import u10.yy;
import u10.yz;
import u10.z70;
import u10.zm;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y5 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ y5(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        d7 d7Var;
        int i;
        u10.b7 b7Var;
        List<u10.d7> list;
        u10.e7 e7Var;
        if (cVar instanceof d7) {
            d7Var = (d7) cVar;
            int i2 = d7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = d7Var.u;
                b71.a aVar = b71.a.r;
                i = d7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    u10.a7 a7Var = ((u10.c7) obj).a;
                    ArrayList arrayList = null;
                    if (a7Var != null && (b7Var = a7Var.a) != null && (list = b7Var.a.a) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (u10.d7 d7Var2 : list) {
                            q01.r u = (d7Var2 == null || (e7Var = d7Var2.a) == null) ? null : t.e.u(e7Var.c);
                            if (u != null) {
                                arrayList2.add(u);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList != null) {
                        d7Var.v = 1;
                        if (this.s.c(arrayList, d7Var) == aVar) {
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
        d7Var = new d7(this, cVar);
        Object obj22 = d7Var.u;
        b71.a aVar2 = b71.a.r;
        i = d7Var.v;
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
        e7 e7Var;
        int i;
        List<dz> list;
        ez ezVar;
        if (cVar instanceof e7) {
            e7Var = (e7) cVar;
            int i2 = e7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = e7Var.u;
                b71.a aVar = b71.a.r;
                i = e7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    bz bzVar = ((cz) obj).a.a;
                    ArrayList arrayList = null;
                    if (bzVar != null && (list = bzVar.a.a) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (dz dzVar : list) {
                            q01.r u = (dzVar == null || (ezVar = dzVar.a) == null) ? null : t.e.u(ezVar.c);
                            if (u != null) {
                                arrayList2.add(u);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList != null) {
                        e7Var.v = 1;
                        if (this.s.c(arrayList, e7Var) == aVar) {
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
        e7Var = new e7(this, cVar);
        Object obj22 = e7Var.u;
        b71.a aVar2 = b71.a.r;
        i = e7Var.v;
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
        f7 f7Var;
        int i;
        ArrayList arrayList;
        List list;
        if (cVar instanceof f7) {
            f7Var = (f7) cVar;
            int i2 = f7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = f7Var.u;
                b71.a aVar = b71.a.r;
                i = f7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    xy xyVar = ((wy) obj).a;
                    if (xyVar == null || (list = xyVar.a) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(x61.n.F(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(t.e.u(((yy) it.next()).c));
                        }
                    }
                    if (arrayList != null) {
                        f7Var.v = 1;
                        if (this.s.c(arrayList, f7Var) == aVar) {
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
        f7Var = new f7(this, cVar);
        Object obj22 = f7Var.u;
        b71.a aVar2 = b71.a.r;
        i = f7Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        g7 g7Var;
        int i;
        v70 v70Var;
        if (cVar instanceof g7) {
            g7Var = (g7) cVar;
            int i2 = g7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = g7Var.u;
                b71.a aVar = b71.a.r;
                i = g7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    w70 w70Var = ((u70) obj).a;
                    q01.r u = (w70Var == null || (v70Var = w70Var.a) == null) ? null : t.e.u(v70Var.c);
                    if (u != null) {
                        g7Var.v = 1;
                        if (this.s.c(u, g7Var) == aVar) {
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
        g7Var = new g7(this, cVar);
        Object obj22 = g7Var.u;
        b71.a aVar2 = b71.a.r;
        i = g7Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object f(a71.c cVar, Object obj) {
        j7 j7Var;
        int i;
        a80 a80Var;
        if (cVar instanceof j7) {
            j7Var = (j7) cVar;
            int i2 = j7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = j7Var.u;
                b71.a aVar = b71.a.r;
                i = j7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    b80 b80Var = ((z70) obj).a;
                    ev evVar = (b80Var == null || (a80Var = b80Var.a) == null) ? null : a80Var.b.c;
                    Boolean valueOf = Boolean.valueOf((evVar == null ? -1 : h7.a[evVar.ordinal()]) == 1);
                    j7Var.v = 1;
                    if (this.s.c(valueOf, j7Var) == aVar) {
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
        j7Var = new j7(this, cVar);
        Object obj22 = j7Var.u;
        b71.a aVar2 = b71.a.r;
        i = j7Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object g(a71.c cVar, Object obj) {
        k7 k7Var;
        int i;
        a80 a80Var;
        if (cVar instanceof k7) {
            k7Var = (k7) cVar;
            int i2 = k7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k7Var.u;
                b71.a aVar = b71.a.r;
                i = k7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    b80 b80Var = ((z70) obj).a;
                    ev evVar = (b80Var == null || (a80Var = b80Var.a) == null) ? null : a80Var.b.c;
                    Boolean valueOf = Boolean.valueOf((evVar == null ? -1 : h7.a[evVar.ordinal()]) == 1);
                    k7Var.v = 1;
                    if (this.s.c(valueOf, k7Var) == aVar) {
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
        k7Var = new k7(this, cVar);
        Object obj22 = k7Var.u;
        b71.a aVar2 = b71.a.r;
        i = k7Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        n7 n7Var;
        int i;
        if (cVar instanceof n7) {
            n7Var = (n7) cVar;
            int i2 = n7Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n7Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = n7Var.u;
                b71.a aVar = b71.a.r;
                i = n7Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    sf sfVar = ((rf) obj).a;
                    bb0.j jVar = new bb0.j(sfVar != null ? sfVar.c : null);
                    n7Var.v = 1;
                    if (this.s.c(jVar, n7Var) == aVar) {
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
        n7Var = new n7(this, cVar);
        Object obj22 = n7Var.u;
        b71.a aVar2 = b71.a.r;
        i = n7Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0366 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0436  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04bd  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:396:0x06a0  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x06ae  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x06e4  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x06f2  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x0728  */
    /* JADX WARN: Removed duplicated region for block: B:436:0x0736  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:469:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:480:0x07f3  */
    /* JADX WARN: Removed duplicated region for block: B:486:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:505:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:516:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x08d4  */
    /* JADX WARN: Removed duplicated region for block: B:543:0x08e3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:576:0x0980  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x098e  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0a55  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0a63  */
    /* JADX WARN: Removed duplicated region for block: B:646:0x0aa5  */
    /* JADX WARN: Removed duplicated region for block: B:652:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:663:0x0af4  */
    /* JADX WARN: Removed duplicated region for block: B:669:0x0b02  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0b3a  */
    /* JADX WARN: Removed duplicated region for block: B:688:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        x5 x5Var;
        int i;
        z5 z5Var;
        int i2;
        a6 a6Var;
        int i3;
        b6 b6Var;
        int i4;
        pb0.d dVar;
        c6 c6Var;
        int i5;
        d6 d6Var;
        int i6;
        e6 e6Var;
        int i7;
        wz wzVar;
        wz wzVar2;
        wz wzVar3;
        g6 g6Var;
        int i8;
        i6 i6Var;
        int i9;
        j6 j6Var;
        int i10;
        m6 m6Var;
        int i12;
        p6 p6Var;
        int i13;
        q6 q6Var;
        int i14;
        r6 r6Var;
        int i15;
        t6 t6Var;
        int i16;
        cu cuVar;
        u6 u6Var;
        int i17;
        w6 w6Var;
        int i18;
        y6 y6Var;
        int i19;
        yz0.a7 p;
        u10.a1 a1Var;
        u10.a1 a1Var2;
        a7 a7Var;
        int i20;
        IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState;
        b71.a aVar;
        jn jnVar;
        String str;
        String str2;
        ArrayList arrayList;
        yz0.k3 k3Var;
        boolean z;
        CommentLevelType commentLevelType;
        kn knVar;
        List list;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str3;
        String str4;
        boolean z2;
        CommentLevelType commentLevelType2;
        b7 b7Var;
        int i22;
        c7 c7Var;
        int i23;
        yz0.a7 p2;
        e00 e00Var;
        o7 o7Var;
        int i24;
        p7 p7Var;
        int i25;
        cv cvVar;
        cv cvVar2;
        cv cvVar3;
        switch (this.r) {
            case 0:
                if (cVar instanceof x5) {
                    x5Var = (x5) cVar;
                    int i26 = x5Var.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        x5Var.v = i26 - Integer.MIN_VALUE;
                        Object obj2 = x5Var.u;
                        b71.a aVar2 = b71.a.r;
                        i = x5Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            va0.k kVar = va0.l.Companion;
                            w80.c1 c1Var = ((kw) obj).c;
                            kVar.getClass();
                            p01.j a = va0.k.a(c1Var);
                            x5Var.v = 1;
                            if (this.s.c(a, x5Var) == aVar2) {
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
                x5Var = new x5(this, cVar);
                Object obj22 = x5Var.u;
                b71.a aVar22 = b71.a.r;
                i = x5Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof z5) {
                    z5Var = (z5) cVar;
                    int i27 = z5Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        z5Var.v = i27 - Integer.MIN_VALUE;
                        Object obj3 = z5Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = z5Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            kw kwVar = ((jw) obj).a;
                            if (kwVar != null) {
                                z5Var.v = 1;
                                if (this.s.c(kwVar, z5Var) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                z5Var = new z5(this, cVar);
                Object obj32 = z5Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = z5Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof a6) {
                    a6Var = (a6) cVar;
                    int i28 = a6Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        a6Var.v = i28 - Integer.MIN_VALUE;
                        Object obj4 = a6Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = a6Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            rb0.a aVar5 = (rb0.a) obj;
                            k71.k.g(aVar5, "<this>");
                            p01.k kVar2 = new p01.k(aVar5.b, false);
                            a6Var.v = 1;
                            if (this.s.c(kVar2, a6Var) == aVar4) {
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
                a6Var = new a6(this, cVar);
                Object obj42 = a6Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = a6Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof b6) {
                    b6Var = (b6) cVar;
                    int i29 = b6Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        b6Var.v = i29 - Integer.MIN_VALUE;
                        Object obj5 = b6Var.u;
                        b71.a aVar6 = b71.a.r;
                        i4 = b6Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            pb0.c cVar2 = ((pb0.b) obj).a;
                            rb0.a aVar7 = (cVar2 == null || (dVar = cVar2.c) == null) ? null : dVar.b;
                            if (aVar7 != null) {
                                b6Var.v = 1;
                                if (this.s.c(aVar7, b6Var) == aVar6) {
                                    return aVar6;
                                }
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
                b6Var = new b6(this, cVar);
                Object obj52 = b6Var.u;
                b71.a aVar62 = b71.a.r;
                i4 = b6Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof c6) {
                    c6Var = (c6) cVar;
                    int i30 = c6Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        c6Var.v = i30 - Integer.MIN_VALUE;
                        Object obj6 = c6Var.u;
                        b71.a aVar8 = b71.a.r;
                        i5 = c6Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj6);
                            yu yuVar = ((xu) obj).a;
                            String str5 = yuVar != null ? yuVar.a : null;
                            if (str5 != null) {
                                c6Var.v = 1;
                                if (this.s.c(str5, c6Var) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                c6Var = new c6(this, cVar);
                Object obj62 = c6Var.u;
                b71.a aVar82 = b71.a.r;
                i5 = c6Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof d6) {
                    d6Var = (d6) cVar;
                    int i32 = d6Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        d6Var.v = i32 - Integer.MIN_VALUE;
                        Object obj7 = d6Var.u;
                        b71.a aVar9 = b71.a.r;
                        i6 = d6Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj7);
                            jz jzVar = (jz) obj;
                            Iterable iterable = jzVar.a.a.b;
                            if (iterable == null) {
                                iterable = x61.rShadow.r;
                            }
                            ArrayList S = x61.m.S(iterable);
                            ArrayList arrayList4 = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i33 = 0;
                            while (i33 < size) {
                                Object obj8 = S.get(i33);
                                i33++;
                                arrayList4.add(sy.e0.q(((kz) obj8).d));
                            }
                            lz lzVar = jzVar.a.a.a;
                            w61.k kVar3 = new w61.k(arrayList4, new x01.i(lzVar.b, lzVar.a, false));
                            d6Var.v = 1;
                            if (this.s.c(kVar3, d6Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                d6Var = new d6(this, cVar);
                Object obj72 = d6Var.u;
                b71.a aVar92 = b71.a.r;
                i6 = d6Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof e6) {
                    e6Var = (e6) cVar;
                    int i34 = e6Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        e6Var.v = i34 - Integer.MIN_VALUE;
                        Object obj9 = e6Var.u;
                        b71.a aVar10 = b71.a.r;
                        i7 = e6Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj9);
                            uz uzVar = (uz) obj;
                            yz yzVar = uzVar.a;
                            String str6 = null;
                            List list2 = (yzVar == null || (wzVar3 = yzVar.b) == null) ? null : wzVar3.a.b;
                            if (list2 == null) {
                                list2 = x61.rShadow.r;
                            }
                            ArrayList S2 = x61.m.S(list2);
                            ArrayList arrayList5 = new ArrayList(x61.n.F(S2, 10));
                            int size2 = S2.size();
                            int i35 = 0;
                            while (i35 < size2) {
                                Object obj10 = S2.get(i35);
                                i35++;
                                vz vzVar = (vz) obj10;
                                arrayList5.add(sy.e0.o(new w61.k(vzVar.c, vzVar.d)));
                            }
                            yz yzVar2 = uzVar.a;
                            boolean z3 = (yzVar2 == null || (wzVar2 = yzVar2.b) == null) ? false : wzVar2.a.a.a;
                            if (yzVar2 != null && (wzVar = yzVar2.b) != null) {
                                str6 = wzVar.a.a.b;
                            }
                            yz0.c4 c4Var = new yz0.c4(arrayList5, new x01.i(str6, z3, false));
                            e6Var.v = 1;
                            if (this.s.c(c4Var, e6Var) == aVar10) {
                                return aVar10;
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
                e6Var = new e6(this, cVar);
                Object obj92 = e6Var.u;
                b71.a aVar102 = b71.a.r;
                i7 = e6Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof g6) {
                    g6Var = (g6) cVar;
                    int i36 = g6Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        g6Var.v = i36 - Integer.MIN_VALUE;
                        Object obj11 = g6Var.u;
                        b71.a aVar11 = b71.a.r;
                        i8 = g6Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj11);
                            ba0 ba0Var = ((aa0) obj).a;
                            Boolean valueOf = Boolean.valueOf(ba0Var != null ? ba0Var.b : false);
                            g6Var.v = 1;
                            if (this.s.c(valueOf, g6Var) == aVar11) {
                                return aVar11;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                g6Var = new g6(this, cVar);
                Object obj112 = g6Var.u;
                b71.a aVar112 = b71.a.r;
                i8 = g6Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof i6) {
                    i6Var = (i6) cVar;
                    int i37 = i6Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        i6Var.v = i37 - Integer.MIN_VALUE;
                        Object obj12 = i6Var.u;
                        b71.a aVar12 = b71.a.r;
                        i9 = i6Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj12);
                            va0.k kVar4 = va0.l.Companion;
                            w80.c1 c1Var2 = ((kw) obj).c;
                            kVar4.getClass();
                            p01.j a2 = va0.k.a(c1Var2);
                            i6Var.v = 1;
                            if (this.s.c(a2, i6Var) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                i6Var = new i6(this, cVar);
                Object obj122 = i6Var.u;
                b71.a aVar122 = b71.a.r;
                i9 = i6Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof j6) {
                    j6Var = (j6) cVar;
                    int i38 = j6Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        j6Var.v = i38 - Integer.MIN_VALUE;
                        Object obj13 = j6Var.u;
                        b71.a aVar13 = b71.a.r;
                        i10 = j6Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj13);
                            kw kwVar2 = ((jw) obj).a;
                            if (kwVar2 != null) {
                                j6Var.v = 1;
                                if (this.s.c(kwVar2, j6Var) == aVar13) {
                                    return aVar13;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                j6Var = new j6(this, cVar);
                Object obj132 = j6Var.u;
                b71.a aVar132 = b71.a.r;
                i10 = j6Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof m6) {
                    m6Var = (m6) cVar;
                    int i39 = m6Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        m6Var.v = i39 - Integer.MIN_VALUE;
                        Object obj14 = m6Var.u;
                        b71.a aVar14 = b71.a.r;
                        i12 = m6Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i12 != 0) {
                            sy.y.j(obj14);
                            m6Var.v = 1;
                            if (this.s.c(a0Var, m6Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return a0Var;
                    }
                }
                m6Var = new m6(this, cVar);
                Object obj142 = m6Var.u;
                b71.a aVar142 = b71.a.r;
                i12 = m6Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i12 != 0) {
                }
                return a0Var2;
            case 11:
                if (cVar instanceof p6) {
                    p6Var = (p6) cVar;
                    int i40 = p6Var.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        p6Var.v = i40 - Integer.MIN_VALUE;
                        Object obj15 = p6Var.u;
                        b71.a aVar15 = b71.a.r;
                        i13 = p6Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj15);
                            fy fyVar = (fy) obj;
                            jy jyVar = fyVar.a;
                            int i42 = jyVar.a;
                            Iterable iterable2 = jyVar.c;
                            if (iterable2 == null) {
                                iterable2 = x61.rShadow.r;
                            }
                            ArrayList S3 = x61.m.S(iterable2);
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = S3.size();
                            int i43 = 0;
                            while (i43 < size3) {
                                Object obj16 = S3.get(i43);
                                i43++;
                                hy hyVar = ((gy) obj16).b;
                                SimpleRepository q = hyVar != null ? sy.e0.q(hyVar.c) : null;
                                if (q != null) {
                                    arrayList6.add(q);
                                }
                            }
                            iy iyVar = fyVar.a.b;
                            yz0.d4 d4Var = new yz0.d4(i42, arrayList6, new x01.i(iyVar.b, iyVar.a, false));
                            p6Var.v = 1;
                            if (this.s.c(d4Var, p6Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                p6Var = new p6(this, cVar);
                Object obj152 = p6Var.u;
                b71.a aVar152 = b71.a.r;
                i13 = p6Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof q6) {
                    q6Var = (q6) cVar;
                    int i44 = q6Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        q6Var.v = i44 - Integer.MIN_VALUE;
                        Object obj17 = q6Var.u;
                        b71.a aVar16 = b71.a.r;
                        i14 = q6Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj17);
                            Boolean bool = Boolean.FALSE;
                            q6Var.v = 1;
                            if (this.s.c(bool, q6Var) == aVar16) {
                                return aVar16;
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
                q6Var = new q6(this, cVar);
                Object obj172 = q6Var.u;
                b71.a aVar162 = b71.a.r;
                i14 = q6Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof r6) {
                    r6Var = (r6) cVar;
                    int i45 = r6Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        r6Var.v = i45 - Integer.MIN_VALUE;
                        Object obj18 = r6Var.u;
                        b71.a aVar17 = b71.a.r;
                        i15 = r6Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj18);
                            Boolean bool2 = Boolean.TRUE;
                            r6Var.v = 1;
                            if (this.s.c(bool2, r6Var) == aVar17) {
                                return aVar17;
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
                r6Var = new r6(this, cVar);
                Object obj182 = r6Var.u;
                b71.a aVar172 = b71.a.r;
                i15 = r6Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof t6) {
                    t6Var = (t6) cVar;
                    int i46 = t6Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        t6Var.v = i46 - Integer.MIN_VALUE;
                        Object obj19 = t6Var.u;
                        b71.a aVar18 = b71.a.r;
                        i16 = t6Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj19);
                            ju juVar = (ju) obj;
                            int i47 = juVar.a;
                            du duVar = juVar.c;
                            Integer num = new Integer(i47);
                            List list3 = duVar != null ? duVar.c : null;
                            if (list3 == null) {
                                list3 = x61.rShadow.r;
                            }
                            ArrayList S4 = x61.m.S(list3);
                            ArrayList arrayList7 = new ArrayList();
                            int size4 = S4.size();
                            int i48 = 0;
                            while (i48 < size4) {
                                Object obj20 = S4.get(i48);
                                i48++;
                                String str7 = ((gu) obj20).c.d;
                                iu iuVar = juVar.b;
                                if (!str7.equals((iuVar == null || (cuVar = iuVar.a) == null) ? null : cuVar.b.b)) {
                                    arrayList7.add(obj20);
                                }
                            }
                            ArrayList arrayList8 = new ArrayList(x61.n.F(arrayList7, 10));
                            int size5 = arrayList7.size();
                            int i49 = 0;
                            while (i49 < size5) {
                                Object obj21 = arrayList7.get(i49);
                                i49++;
                                gu guVar = (gu) obj21;
                                ea0.c1 c1Var3 = guVar.c;
                                arrayList8.add(new yz0.e2(new com.github.service.models.response.a(c1Var3.d, t.q.q(c1Var3.g), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, guVar.c.b, yz0.f2.d, false, 96));
                            }
                            w61.q qVar = new w61.q(num, arrayList8, new x01.i(duVar != null ? duVar.a.b : null, duVar != null ? duVar.a.a : false, false));
                            t6Var.v = 1;
                            if (this.s.c(qVar, t6Var) == aVar18) {
                                return aVar18;
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
                t6Var = new t6(this, cVar);
                Object obj192 = t6Var.u;
                b71.a aVar182 = b71.a.r;
                i16 = t6Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof u6) {
                    u6Var = (u6) cVar;
                    int i50 = u6Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        u6Var.v = i50 - Integer.MIN_VALUE;
                        Object obj23 = u6Var.u;
                        b71.a aVar19 = b71.a.r;
                        i17 = u6Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj23);
                            ju juVar2 = ((fu) obj).a;
                            if (juVar2 != null) {
                                u6Var.v = 1;
                                if (this.s.c(juVar2, u6Var) == aVar19) {
                                    return aVar19;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                u6Var = new u6(this, cVar);
                Object obj232 = u6Var.u;
                b71.a aVar192 = b71.a.r;
                i17 = u6Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof w6) {
                    w6Var = (w6) cVar;
                    int i52 = w6Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        w6Var.v = i52 - Integer.MIN_VALUE;
                        Object obj24 = w6Var.u;
                        b71.a aVar20 = b71.a.r;
                        i18 = w6Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj24);
                            ol olVar = (ol) obj;
                            ql qlVar = olVar.a;
                            List list4 = qlVar != null ? qlVar.a.b : null;
                            if (list4 == null) {
                                list4 = x61.rShadow.r;
                            }
                            ArrayList S5 = x61.m.S(list4);
                            ArrayList arrayList9 = new ArrayList(x61.n.F(S5, 10));
                            int size6 = S5.size();
                            int i53 = 0;
                            while (i53 < size6) {
                                Object obj25 = S5.get(i53);
                                i53++;
                                pl plVar = (pl) obj25;
                                String str8 = plVar.c;
                                String str9 = plVar.d;
                                if (str9 == null) {
                                    str9 = "";
                                }
                                arrayList9.add(new yz0.e2(new com.github.service.models.response.a(str8, new Avatar(str9, Avatar.Type.Organization), (String) null, false, (String) null, 60), IssueOrPullRequest$ReviewerReviewState.PENDING, plVar.b, yz0.f2.b, false, 96));
                            }
                            ql qlVar2 = olVar.a;
                            w61.k kVar5 = new w61.k(arrayList9, new x01.i(qlVar2 != null ? qlVar2.a.a.b : null, qlVar2 != null ? qlVar2.a.a.a : false, false));
                            w6Var.v = 1;
                            if (this.s.c(kVar5, w6Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return w61.a0.a;
                    }
                }
                w6Var = new w6(this, cVar);
                Object obj242 = w6Var.u;
                b71.a aVar202 = b71.a.r;
                i18 = w6Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof y6) {
                    y6Var = (y6) cVar;
                    int i54 = y6Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        y6Var.v = i54 - Integer.MIN_VALUE;
                        Object obj26 = y6Var.u;
                        b71.a aVar21 = b71.a.r;
                        i19 = y6Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj26);
                            u10.y0 y0Var = (u10.y0) obj;
                            k71.k.g(y0Var, "<this>");
                            u10.w0 w0Var = y0Var.a;
                            String str10 = (w0Var == null || (a1Var2 = w0Var.a) == null) ? "" : a1Var2.b;
                            e80.c cVar3 = (w0Var == null || (a1Var = w0Var.a) == null) ? null : a1Var.d;
                            if (cVar3 == null) {
                                yz0.s.Companion.getClass();
                                p = new yz0.a7(yz0.r.b, true, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                p = t.a0.p(cVar3);
                            }
                            yz0.c cVar4 = new yz0.c(str10, p);
                            y6Var.v = 1;
                            if (this.s.c(cVar4, y6Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                y6Var = new y6(this, cVar);
                Object obj262 = y6Var.u;
                b71.a aVar212 = b71.a.r;
                i19 = y6Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof a7) {
                    a7Var = (a7) cVar;
                    int i55 = a7Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        a7Var.v = i55 - Integer.MIN_VALUE;
                        Object obj27 = a7Var.u;
                        b71.a aVar23 = b71.a.r;
                        i20 = a7Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj27);
                            fn fnVar = (fn) obj;
                            k71.k.g(fnVar, "<this>");
                            String str11 = fnVar.d;
                            i80.c cVar5 = fnVar.l;
                            String str12 = fnVar.b;
                            jn jnVar2 = fnVar.i;
                            nnShadow nnVar = fnVar.j;
                            in inVar = fnVar.g;
                            String str13 = inVar.a;
                            String str14 = inVar.b;
                            List<cn> list5 = nnVar != null ? nnVar.a : null;
                            if (list5 == null) {
                                list5 = x61.rShadow.r;
                            }
                            ArrayList arrayList10 = new ArrayList();
                            for (cn cnVar : list5) {
                                if (cnVar != null) {
                                    jn jnVar3 = jnVar2;
                                    gn gnVar = cnVar.c;
                                    hn hnVar = cnVar.b;
                                    if (hnVar != null) {
                                        va0.h hVar = va0.i.Companion;
                                        str = str14;
                                        xm xmVar = hnVar.k;
                                        List list6 = hnVar.j;
                                        ArrayList S6 = list6 != null ? x61.m.S(list6) : null;
                                        String str15 = hnVar.c;
                                        String str16 = hnVar.b;
                                        g80.a aVar24 = hnVar.l;
                                        boolean z4 = hnVar.e;
                                        ln lnVar = hnVar.h;
                                        if (lnVar != null) {
                                            arrayList2 = arrayList10;
                                            arrayList3 = S6;
                                            str3 = str15;
                                            str4 = lnVar.a;
                                        } else {
                                            arrayList2 = arrayList10;
                                            arrayList3 = S6;
                                            str3 = str15;
                                            str4 = "";
                                        }
                                        boolean z5 = hnVar.f;
                                        boolean z6 = hnVar.g;
                                        boolean z7 = hnVar.i;
                                        int ordinal = hnVar.d.ordinal();
                                        if (ordinal != 0) {
                                            z2 = z7;
                                            if (ordinal == 1) {
                                                commentLevelType2 = CommentLevelType.LINE;
                                            } else {
                                                if (ordinal != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                commentLevelType2 = CommentLevelType.UNKNOWN__;
                                            }
                                        } else {
                                            z2 = z7;
                                            commentLevelType2 = CommentLevelType.FILE;
                                        }
                                        CommentLevelType commentLevelType3 = commentLevelType2;
                                        hVar.getClass();
                                        jnVar = jnVar3;
                                        str2 = str13;
                                        boolean z8 = z2;
                                        aVar = aVar23;
                                        arrayList = arrayList2;
                                        k3Var = va0.h.a(str12, (gn) null, commentLevelType3, xmVar, (ArrayList) null, arrayList3, str3, str16, aVar24, str2, str, z4, str4, z5, z6, z8);
                                    } else {
                                        aVar = aVar23;
                                        str = str14;
                                        str2 = str13;
                                        arrayList = arrayList10;
                                        jnVar = jnVar3;
                                        String str17 = "";
                                        if (gnVar != null) {
                                            mn mnVar = gnVar.e;
                                            va0.h hVar2 = va0.i.Companion;
                                            ArrayList S7 = (mnVar == null || (list = mnVar.g) == null) ? null : x61.m.S(list);
                                            String str18 = gnVar.c;
                                            String str19 = gnVar.b;
                                            g80.a aVar25 = mnVar != null ? mnVar.i : null;
                                            boolean z9 = mnVar != null ? mnVar.b : false;
                                            String str20 = str12;
                                            if (mnVar != null && (knVar = mnVar.c) != null) {
                                                str17 = knVar.a;
                                            }
                                            boolean z10 = mnVar != null ? mnVar.d : false;
                                            boolean z12 = mnVar != null ? mnVar.e : false;
                                            boolean z13 = mnVar != null ? mnVar.f : false;
                                            int ordinal2 = gnVar.d.ordinal();
                                            if (ordinal2 != 0) {
                                                z = z12;
                                                if (ordinal2 == 1) {
                                                    commentLevelType = CommentLevelType.LINE;
                                                } else {
                                                    if (ordinal2 != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    commentLevelType = CommentLevelType.UNKNOWN__;
                                                }
                                            } else {
                                                z = z12;
                                                commentLevelType = CommentLevelType.FILE;
                                            }
                                            CommentLevelType commentLevelType4 = commentLevelType;
                                            hVar2.getClass();
                                            str12 = str20;
                                            k3Var = va0.h.a(str12, gnVar, commentLevelType4, (xm) null, S7, (ArrayList) null, str18, str19, aVar25, str2, str, z9, str17, z10, z, z13);
                                        }
                                    }
                                    if (k3Var == null) {
                                        arrayList.add(k3Var);
                                    }
                                    arrayList10 = arrayList;
                                    jnVar2 = jnVar;
                                    str13 = str2;
                                    str14 = str;
                                    aVar23 = aVar;
                                } else {
                                    aVar = aVar23;
                                    jnVar = jnVar2;
                                    str = str14;
                                    str2 = str13;
                                    arrayList = arrayList10;
                                }
                                k3Var = null;
                                if (k3Var == null) {
                                }
                                arrayList10 = arrayList;
                                jnVar2 = jnVar;
                                str13 = str2;
                                str14 = str;
                                aVar23 = aVar;
                            }
                            b71.a aVar26 = aVar23;
                            jn jnVar4 = jnVar2;
                            ArrayList arrayList11 = arrayList10;
                            w80.a2 a2Var = jnVar4.c;
                            String str21 = a2Var.d;
                            String str22 = a2Var.c;
                            w80.x1 x1Var = a2Var.h;
                            yz0.t7 t7Var = new yz0.t7(str21, str22, x1Var.c, t.q.q(x1Var.d), new bb0.j(jnVar4.d), a2Var.e);
                            String str23 = a2Var.h.b;
                            bb0.b bVar = new bb0.b(fnVar.k, str11, new yz0.k0(str12));
                            ZonedDateTime zonedDateTime = fnVar.f;
                            ArrayList f = sy.c0.f(cVar5, str12);
                            boolean z14 = cVar5.c;
                            int ordinal3 = fnVar.c.ordinal();
                            if (ordinal3 == 0) {
                                issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.APPROVED;
                            } else if (ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    if (ordinal3 == 3) {
                                        issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.DISMISSED;
                                    } else if (ordinal3 == 4) {
                                        issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.PENDING;
                                    } else if (ordinal3 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.COMMENTED;
                            } else {
                                issueOrPullRequest$ReviewerReviewState = IssueOrPullRequest$ReviewerReviewState.CHANGES_REQUESTED;
                            }
                            IssueOrPullRequest$ReviewerReviewState issueOrPullRequest$ReviewerReviewState2 = issueOrPullRequest$ReviewerReviewState;
                            wm wmVar = fnVar.h;
                            com.github.service.models.response.a c = t.e.c(wmVar != null ? wmVar.b : null);
                            boolean z15 = fnVar.e;
                            g70.a aVar27 = fnVar.n;
                            yz0.l3 l3Var = new yz0.l3(str12, arrayList11, t7Var, str23, bVar, zonedDateTime, f, z14, issueOrPullRequest$ReviewerReviewState2, c, z15, str11, aVar27.b, aVar27.c);
                            a7Var.v = 1;
                            if (this.s.c(l3Var, a7Var) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                a7Var = new a7(this, cVar);
                Object obj272 = a7Var.u;
                b71.a aVar232 = b71.a.r;
                i20 = a7Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof b7) {
                    b7Var = (b7) cVar;
                    int i56 = b7Var.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        b7Var.v = i56 - Integer.MIN_VALUE;
                        Object obj28 = b7Var.u;
                        b71.a aVar28 = b71.a.r;
                        i22 = b7Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj28);
                            en enVar = ((zm) obj).a;
                            fn fnVar2 = enVar != null ? enVar.c : null;
                            if (fnVar2 != null) {
                                b7Var.v = 1;
                                if (this.s.c(fnVar2, b7Var) == aVar28) {
                                    return aVar28;
                                }
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                b7Var = new b7(this, cVar);
                Object obj282 = b7Var.u;
                b71.a aVar282 = b71.a.r;
                i22 = b7Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 20:
                if (cVar instanceof c7) {
                    c7Var = (c7) cVar;
                    int i57 = c7Var.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        c7Var.v = i57 - Integer.MIN_VALUE;
                        Object obj29 = c7Var.u;
                        b71.a aVar29 = b71.a.r;
                        i23 = c7Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj29);
                            c00 c00Var = (c00) obj;
                            k71.k.g(c00Var, "<this>");
                            f00 f00Var = c00Var.a;
                            e80.c cVar6 = (f00Var == null || (e00Var = f00Var.a) == null) ? null : e00Var.d;
                            if (cVar6 == null) {
                                yz0.s.Companion.getClass();
                                p2 = new yz0.a7(yz0.r.b, false, TimelineItem$TimelinePullRequestReview$ReviewState.UNKNOWN);
                            } else {
                                p2 = t.a0.p(cVar6);
                            }
                            yz0.b5 b5Var = new yz0.b5(p2);
                            c7Var.v = 1;
                            if (this.s.c(b5Var, c7Var) == aVar29) {
                                return aVar29;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                c7Var = new c7(this, cVar);
                Object obj292 = c7Var.u;
                b71.a aVar292 = b71.a.r;
                i23 = c7Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 21:
                return a(cVar, obj);
            case 22:
                return b(cVar, obj);
            case 23:
                return d(cVar, obj);
            case 24:
                return e(cVar, obj);
            case 25:
                return f(cVar, obj);
            case 26:
                return g(cVar, obj);
            case 27:
                return h(cVar, obj);
            case 28:
                if (cVar instanceof o7) {
                    o7Var = (o7) cVar;
                    int i58 = o7Var.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        o7Var.v = i58 - Integer.MIN_VALUE;
                        Object obj30 = o7Var.u;
                        b71.a aVar30 = b71.a.r;
                        i24 = o7Var.v;
                        w61.a0 a0Var3 = w61.a0.a;
                        if (i24 != 0) {
                            sy.y.j(obj30);
                            o7Var.v = 1;
                            if (this.s.c(a0Var3, o7Var) == aVar30) {
                                return aVar30;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                        }
                        return a0Var3;
                    }
                }
                o7Var = new o7(this, cVar);
                Object obj302 = o7Var.u;
                b71.a aVar302 = b71.a.r;
                i24 = o7Var.v;
                w61.a0 a0Var32 = w61.a0.a;
                if (i24 != 0) {
                }
                return a0Var32;
            default:
                if (cVar instanceof p7) {
                    p7Var = (p7) cVar;
                    int i59 = p7Var.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        p7Var.v = i59 - Integer.MIN_VALUE;
                        Object obj31 = p7Var.u;
                        b71.a aVar31 = b71.a.r;
                        i25 = p7Var.v;
                        if (i25 != 0) {
                            sy.y.j(obj31);
                            bv bvVar = (bv) obj;
                            fv fvVar = bvVar.a;
                            String str24 = null;
                            List list7 = (fvVar == null || (cvVar3 = fvVar.b) == null) ? null : cvVar3.b;
                            if (list7 == null) {
                                list7 = x61.rShadow.r;
                            }
                            ArrayList S8 = x61.m.S(list7);
                            ArrayList arrayList12 = new ArrayList(x61.n.F(S8, 10));
                            int size7 = S8.size();
                            int i60 = 0;
                            while (i60 < size7) {
                                Object obj33 = S8.get(i60);
                                i60++;
                                dv dvVar = (dv) obj33;
                                k71.k.g(dvVar, "<this>");
                                arrayList12.add(new bb0.f(dvVar.c, dvVar.a, dvVar.b));
                            }
                            fv fvVar2 = bvVar.a;
                            boolean z16 = (fvVar2 == null || (cvVar2 = fvVar2.b) == null) ? false : cvVar2.a.a;
                            if (fvVar2 != null && (cvVar = fvVar2.b) != null) {
                                str24 = cvVar.a.b;
                            }
                            w61.k kVar6 = new w61.k(arrayList12, new x01.i(str24, z16, false));
                            p7Var.v = 1;
                            if (this.s.c(kVar6, p7Var) == aVar31) {
                                return aVar31;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj31);
                        }
                        return w61.a0.a;
                    }
                }
                p7Var = new p7(this, cVar);
                Object obj312 = p7Var.u;
                b71.a aVar312 = b71.a.r;
                i25 = p7Var.v;
                if (i25 != 0) {
                }
                return w61.a0.a;
        }
    }
}
