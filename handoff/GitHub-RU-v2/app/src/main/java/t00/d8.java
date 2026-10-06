package t00;

import com.github.service.models.response.IssueOrPullRequest;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.TimelineItem;
import com.github.service.models.response.fileschanged.CommentLevelType;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jo.as;
import jo.az;
import jo.b20;
import jo.bs;
import jo.bz;
import jo.c20;
import jo.c80;
import jo.cs;
import jo.cz;
import jo.ds;
import jo.e80;
import jo.es;
import jo.f20;
import jo.f80;
import jo.fs;
import jo.g20;
import jo.gs;
import jo.h20;
import jo.hj;
import jo.hz;
import jo.ig0;
import jo.ij;
import jo.j20;
import jo.j60;
import jo.jg0;
import jo.k60;
import jo.kg0;
import jo.l60;
import jo.ng0;
import jo.o30;
import jo.o60;
import jo.og0;
import jo.oi0;
import jo.p30;
import jo.p60;
import jo.pg0;
import jo.pi0;
import jo.pr;
import jo.q60;
import jo.q70;
import jo.qr;
import jo.r60;
import jo.r70;
import jo.s50;
import jo.s70;
import jo.sr;
import jo.t50;
import jo.u50;
import jo.u70;
import jo.v50;
import jo.vr;
import jo.w50;
import jo.w60;
import jo.x60;
import jo.xr;
import jo.y60;
import jo.yr;
import jo.yy;
import jo.zr;
import jo.zy;
import kotlin.NoWhenBranchMatchedException;
import m10.ya0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d8 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ d8(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        j9 j9Var;
        int i;
        jo.w8Shadow w8Var;
        List<jo.y8> list;
        jo.z8 z8Var;
        if (cVar instanceof j9) {
            j9Var = (j9) cVar;
            int i2 = j9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = j9Var.u;
                b71.a aVar = b71.a.r;
                i = j9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jo.v8Shadow v8Var = ((jo.x8) obj).a;
                    ArrayList arrayList = null;
                    if (v8Var != null && (w8Var = v8Var.a) != null && (list = w8Var.a.a) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (jo.y8 y8Var : list) {
                            q01.rShadow v = (y8Var == null || (z8Var = y8Var.a) == null) ? null : sy.pShadow.v(z8Var.c);
                            if (v != null) {
                                arrayList2.add(v);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList != null) {
                        j9Var.v = 1;
                        if (this.s.c(arrayList, j9Var) == aVar) {
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
        j9Var = new j9(this, cVar);
        Object obj22 = j9Var.u;
        b71.a aVar2 = b71.a.r;
        i = j9Var.v;
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
        k9 k9Var;
        int i;
        List<q60> list;
        r60 r60Var;
        if (cVar instanceof k9) {
            k9Var = (k9) cVar;
            int i2 = k9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k9Var.u;
                b71.a aVar = b71.a.r;
                i = k9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    o60 o60Var = ((p60) obj).a.a;
                    ArrayList arrayList = null;
                    if (o60Var != null && (list = o60Var.a.a) != null) {
                        ArrayList arrayList2 = new ArrayList();
                        for (q60 q60Var : list) {
                            q01.rShadow v = (q60Var == null || (r60Var = q60Var.a) == null) ? null : sy.pShadow.v(r60Var.c);
                            if (v != null) {
                                arrayList2.add(v);
                            }
                        }
                        arrayList = arrayList2;
                    }
                    if (arrayList != null) {
                        k9Var.v = 1;
                        if (this.s.c(arrayList, k9Var) == aVar) {
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
        k9Var = new k9(this, cVar);
        Object obj22 = k9Var.u;
        b71.a aVar2 = b71.a.r;
        i = k9Var.v;
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
        l9 l9Var;
        int i;
        ArrayList arrayList;
        List list;
        if (cVar instanceof l9) {
            l9Var = (l9) cVar;
            int i2 = l9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l9Var.u;
                b71.a aVar = b71.a.r;
                i = l9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    k60 k60Var = ((j60) obj).a;
                    if (k60Var == null || (list = k60Var.a) == null) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(x61.n.F(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(sy.pShadow.v(((l60) it.next()).c));
                        }
                    }
                    if (arrayList != null) {
                        l9Var.v = 1;
                        if (this.s.c(arrayList, l9Var) == aVar) {
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
        l9Var = new l9(this, cVar);
        Object obj22 = l9Var.u;
        b71.a aVar2 = b71.a.r;
        i = l9Var.v;
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
        m9 m9Var;
        int i;
        jg0 jg0Var;
        if (cVar instanceof m9) {
            m9Var = (m9) cVar;
            int i2 = m9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = m9Var.u;
                b71.a aVar = b71.a.r;
                i = m9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    kg0 kg0Var = ((ig0) obj).a;
                    q01.rShadow v = (kg0Var == null || (jg0Var = kg0Var.a) == null) ? null : sy.pShadow.v(jg0Var.c);
                    if (v != null) {
                        m9Var.v = 1;
                        if (this.s.c(v, m9Var) == aVar) {
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
        m9Var = new m9(this, cVar);
        Object obj22 = m9Var.u;
        b71.a aVar2 = b71.a.r;
        i = m9Var.v;
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
        p9 p9Var;
        int i;
        og0 og0Var;
        if (cVar instanceof p9) {
            p9Var = (p9) cVar;
            int i2 = p9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = p9Var.u;
                b71.a aVar = b71.a.r;
                i = p9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    pg0 pg0Var = ((ng0) obj).a;
                    ya0 ya0Var = (pg0Var == null || (og0Var = pg0Var.a) == null) ? null : og0Var.b.c;
                    Boolean valueOf = Boolean.valueOf((ya0Var == null ? -1 : n9.a[ya0Var.ordinal()]) == 1);
                    p9Var.v = 1;
                    if (this.s.c(valueOf, p9Var) == aVar) {
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
        p9Var = new p9(this, cVar);
        Object obj22 = p9Var.u;
        b71.a aVar2 = b71.a.r;
        i = p9Var.v;
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
        q9 q9Var;
        int i;
        og0 og0Var;
        if (cVar instanceof q9) {
            q9Var = (q9) cVar;
            int i2 = q9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = q9Var.u;
                b71.a aVar = b71.a.r;
                i = q9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    pg0 pg0Var = ((ng0) obj).a;
                    ya0 ya0Var = (pg0Var == null || (og0Var = pg0Var.a) == null) ? null : og0Var.b.c;
                    Boolean valueOf = Boolean.valueOf((ya0Var == null ? -1 : n9.a[ya0Var.ordinal()]) == 1);
                    q9Var.v = 1;
                    if (this.s.c(valueOf, q9Var) == aVar) {
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
        q9Var = new q9(this, cVar);
        Object obj22 = q9Var.u;
        b71.a aVar2 = b71.a.r;
        i = q9Var.v;
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
        t9 t9Var;
        int i;
        if (cVar instanceof t9) {
            t9Var = (t9) cVar;
            int i2 = t9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = t9Var.u;
                b71.a aVar = b71.a.r;
                i = t9Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    ij ijVar = ((hj) obj).a;
                    fz.j jVar = new fz.j(ijVar != null ? ijVar.c : null);
                    t9Var.v = 1;
                    if (this.s.c(jVar, t9Var) == aVar) {
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
        t9Var = new t9(this, cVar);
        Object obj22 = t9Var.u;
        b71.a aVar2 = b71.a.r;
        i = t9Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        u9 u9Var;
        int i;
        if (cVar instanceof u9) {
            u9Var = (u9) cVar;
            int i2 = u9Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u9Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = u9Var.u;
                b71.a aVar = b71.a.r;
                i = u9Var.v;
                w61.a0 a0Var = w61.a0.a;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                    return a0Var;
                }
                sy.y.j(obj2);
                u9Var.v = 1;
                return this.s.c(a0Var, u9Var) == aVar ? aVar : a0Var;
            }
        }
        u9Var = new u9(this, cVar);
        Object obj22 = u9Var.u;
        b71.a aVar2 = b71.a.r;
        i = u9Var.v;
        w61.a0 a0Var2 = w61.a0.a;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04c3  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0584  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x05d2  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x060a  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0665  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x06a5  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x075f  */
    /* JADX WARN: Removed duplicated region for block: B:477:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x07e8  */
    /* JADX WARN: Removed duplicated region for block: B:512:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:518:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x08ab  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x08b9  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x090b  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0919  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:608:0x09b5  */
    /* JADX WARN: Removed duplicated region for block: B:614:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x09fb  */
    /* JADX WARN: Removed duplicated region for block: B:633:0x0a09  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:650:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        c8 c8Var;
        int i;
        bz bzVar;
        bz bzVar2;
        cz czVar;
        String str;
        cz czVar2;
        e8 e8Var;
        int i2;
        g8 g8Var;
        int i3;
        h8 h8Var;
        int i4;
        i8 i8Var;
        int i5;
        m00.i iVar;
        j8 j8Var;
        int i6;
        k8 k8Var;
        int i7;
        l8 l8Var;
        int i8;
        ArrayList arrayList;
        List<m00.y> list;
        m8 m8Var;
        int i9;
        n8 n8Var;
        int i11;
        s70 s70Var;
        s70 s70Var2;
        s70 s70Var3;
        p8Shadow p8Var;
        int i12;
        r8 r8Var;
        int i13;
        s8 s8Var;
        int i14;
        w8Shadow w8Var;
        int i15;
        z8 z8Var;
        int i16;
        a9 a9Var;
        int i17;
        b9 b9Var;
        int i18;
        e9Shadow e9Var;
        int i19;
        yz0.a7 k;
        jo.f1Shadow f1Var;
        jo.f1Shadow f1Var2;
        g9 g9Var;
        int i21;
        IssueOrPullRequest.ReviewerReviewState reviewerReviewState;
        b71.a aVar;
        cs csVar;
        String str2;
        String str3;
        ArrayList arrayList2;
        yz0.k3 k3Var;
        boolean z;
        CommentLevelType commentLevelType;
        ds dsVar;
        List list2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        String str4;
        String str5;
        boolean z2;
        CommentLevelType commentLevelType2;
        h9 h9Var;
        int i22;
        i9 i9Var;
        int i23;
        yz0.a7 k2;
        e80 e80Var;
        v9 v9Var;
        int i24;
        g20 g20Var;
        g20 g20Var2;
        g20 g20Var3;
        switch (this.r) {
            case 0:
                if (cVar instanceof c8) {
                    c8Var = (c8) cVar;
                    int i25 = c8Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        c8Var.v = i25 - Integer.MIN_VALUE;
                        Object obj2 = c8Var.u;
                        b71.a aVar2 = b71.a.r;
                        i = c8Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            yy yyVar = (yy) obj;
                            hz hzVar = yyVar.a;
                            String str6 = null;
                            cz czVar3 = hzVar != null ? hzVar.b : null;
                            x61.rShadow rVar = x61.rShadow.r;
                            if (czVar3 != null) {
                                x61.rShadow rVar2 = hzVar.b.a.b;
                                if (rVar2 != null) {
                                    rVar = rVar2;
                                }
                                ArrayList S = x61.m.S(rVar);
                                rVar = new ArrayList(x61.n.F(S, 10));
                                int size = S.size();
                                int i26 = 0;
                                while (i26 < size) {
                                    Object obj3 = S.get(i26);
                                    i26++;
                                    az azVar = (az) obj3;
                                    rVar.add(sy.n.G(new w61.k(azVar.c, azVar.d)));
                                }
                            } else if ((hzVar != null ? hzVar.c : null) != null) {
                                x61.rShadow rVar3 = hzVar.c.a.b;
                                if (rVar3 != null) {
                                    rVar = rVar3;
                                }
                                ArrayList S2 = x61.m.S(rVar);
                                rVar = new ArrayList(x61.n.F(S2, 10));
                                int size2 = S2.size();
                                int i27 = 0;
                                while (i27 < size2) {
                                    Object obj4 = S2.get(i27);
                                    i27++;
                                    zy zyVar = (zy) obj4;
                                    rVar.add(sy.n.G(new w61.k(zyVar.c, zyVar.d)));
                                }
                            }
                            hz hzVar2 = yyVar.a;
                            boolean z3 = (hzVar2 == null || (czVar2 = hzVar2.b) == null) ? (hzVar2 == null || (bzVar = hzVar2.c) == null) ? false : bzVar.a.a.a : czVar2.a.a.a;
                            if (hzVar2 != null && (czVar = hzVar2.b) != null && (str = czVar.a.a.b) != null) {
                                str6 = str;
                            } else if (hzVar2 != null && (bzVar2 = hzVar2.c) != null) {
                                str6 = bzVar2.a.a.b;
                            }
                            yz0.c4 c4Var = new yz0.c4(rVar, new x01.i(str6, z3, false));
                            c8Var.v = 1;
                            if (this.s.c(c4Var, c8Var) == aVar2) {
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
                c8Var = new c8(this, cVar);
                Object obj22 = c8Var.u;
                b71.a aVar22 = b71.a.r;
                i = c8Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof e8) {
                    e8Var = (e8) cVar;
                    int i28 = e8Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        e8Var.v = i28 - Integer.MIN_VALUE;
                        Object obj5 = e8Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = e8Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj5);
                            sy.l lVar = sy.m.Companion;
                            dw.k2 k2Var = ((p30) obj).c;
                            lVar.getClass();
                            p01.j a = sy.l.a(k2Var);
                            e8Var.v = 1;
                            if (this.s.c(a, e8Var) == aVar3) {
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
                e8Var = new e8(this, cVar);
                Object obj52 = e8Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = e8Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof g8) {
                    g8Var = (g8) cVar;
                    int i29 = g8Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        g8Var.v = i29 - Integer.MIN_VALUE;
                        Object obj6 = g8Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = g8Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj6);
                            p30 p30Var = ((o30) obj).a;
                            if (p30Var != null) {
                                g8Var.v = 1;
                                if (this.s.c(p30Var, g8Var) == aVar4) {
                                    return aVar4;
                                }
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                g8Var = new g8(this, cVar);
                Object obj62 = g8Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = g8Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof h8) {
                    h8Var = (h8) cVar;
                    int i31 = h8Var.v;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        h8Var.v = i31 - Integer.MIN_VALUE;
                        Object obj7 = h8Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = h8Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj7);
                            o00.b bVar = (o00.b) obj;
                            k71.k.g(bVar, "<this>");
                            boolean z4 = bVar.b;
                            o00.a aVar6 = bVar.c;
                            p01.k kVar = new p01.k(z4, (aVar6 != null ? aVar6.a : 0) > 0);
                            h8Var.v = 1;
                            if (this.s.c(kVar, h8Var) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                h8Var = new h8(this, cVar);
                Object obj72 = h8Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = h8Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof i8) {
                    i8Var = (i8) cVar;
                    int i32 = i8Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        i8Var.v = i32 - Integer.MIN_VALUE;
                        Object obj8 = i8Var.u;
                        b71.a aVar7 = b71.a.r;
                        i5 = i8Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj8);
                            m00.h hVar = ((m00.g) obj).a;
                            o00.b bVar2 = (hVar == null || (iVar = hVar.c) == null) ? null : iVar.b;
                            if (bVar2 != null) {
                                i8Var.v = 1;
                                if (this.s.c(bVar2, i8Var) == aVar7) {
                                    return aVar7;
                                }
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                i8Var = new i8(this, cVar);
                Object obj82 = i8Var.u;
                b71.a aVar72 = b71.a.r;
                i5 = i8Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof j8) {
                    j8Var = (j8) cVar;
                    int i33 = j8Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        j8Var.v = i33 - Integer.MIN_VALUE;
                        Object obj9 = j8Var.u;
                        b71.a aVar8 = b71.a.r;
                        i6 = j8Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj9);
                            m00.l lVar2 = (m00.l) obj;
                            k71.k.g(lVar2, "<this>");
                            m00.m mVar = lVar2.a;
                            p01.l lVar3 = new p01.l(mVar != null ? mVar.a : "", mVar != null ? mVar.b : false, mVar != null ? mVar.c : false);
                            j8Var.v = 1;
                            if (this.s.c(lVar3, j8Var) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                j8Var = new j8(this, cVar);
                Object obj92 = j8Var.u;
                b71.a aVar82 = b71.a.r;
                i6 = j8Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof k8) {
                    k8Var = (k8) cVar;
                    int i34 = k8Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        k8Var.v = i34 - Integer.MIN_VALUE;
                        Object obj10 = k8Var.u;
                        b71.a aVar9 = b71.a.r;
                        i7 = k8Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj10);
                            c20 c20Var = ((b20) obj).a;
                            String str7 = c20Var != null ? c20Var.a : null;
                            if (str7 != null) {
                                k8Var.v = 1;
                                if (this.s.c(str7, k8Var) == aVar9) {
                                    return aVar9;
                                }
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                k8Var = new k8(this, cVar);
                Object obj102 = k8Var.u;
                b71.a aVar92 = b71.a.r;
                i7 = k8Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof l8) {
                    l8Var = (l8) cVar;
                    int i35 = l8Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        l8Var.v = i35 - Integer.MIN_VALUE;
                        Object obj11 = l8Var.u;
                        b71.a aVar10 = b71.a.r;
                        i8 = l8Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj11);
                            m00.xShadow xVar = (m00.xShadow) obj;
                            k71.k.g(xVar, "<this>");
                            m00.z zVar = xVar.a;
                            if (zVar == null || (list = zVar.b) == null) {
                                arrayList = x61.rShadow.r;
                            } else {
                                arrayList = new ArrayList(x61.n.F(list, 10));
                                for (m00.y yVar : list) {
                                    k71.k.g(yVar, "<this>");
                                    String str8 = yVar.b;
                                    String str9 = "";
                                    if (str8 == null) {
                                        str8 = "";
                                    }
                                    String str10 = yVar.a;
                                    if (str10 != null) {
                                        str9 = str10;
                                    }
                                    arrayList.add(new p01.o(str8, str9));
                                }
                            }
                            l8Var.v = 1;
                            if (this.s.c(arrayList, l8Var) == aVar10) {
                                return aVar10;
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
                l8Var = new l8(this, cVar);
                Object obj112 = l8Var.u;
                b71.a aVar102 = b71.a.r;
                i8 = l8Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof m8) {
                    m8Var = (m8) cVar;
                    int i36 = m8Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        m8Var.v = i36 - Integer.MIN_VALUE;
                        Object obj12 = m8Var.u;
                        b71.a aVar11 = b71.a.r;
                        i9 = m8Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj12);
                            w60 w60Var = (w60) obj;
                            x61.rShadow rVar4 = w60Var.a.a.b;
                            if (rVar4 == null) {
                                rVar4 = x61.rShadow.r;
                            }
                            ArrayList S3 = x61.m.S(rVar4);
                            ArrayList arrayList5 = new ArrayList(x61.n.F(S3, 10));
                            int size3 = S3.size();
                            int i37 = 0;
                            while (i37 < size3) {
                                Object obj13 = S3.get(i37);
                                i37++;
                                arrayList5.add(sy.n.I(((x60) obj13).d));
                            }
                            y60 y60Var = w60Var.a.a.a;
                            w61.k kVar2 = new w61.k(arrayList5, new x01.i(y60Var.b, y60Var.a, false));
                            m8Var.v = 1;
                            if (this.s.c(kVar2, m8Var) == aVar11) {
                                return aVar11;
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
                m8Var = new m8(this, cVar);
                Object obj122 = m8Var.u;
                b71.a aVar112 = b71.a.r;
                i9 = m8Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof n8) {
                    n8Var = (n8) cVar;
                    int i38 = n8Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        n8Var.v = i38 - Integer.MIN_VALUE;
                        Object obj14 = n8Var.u;
                        b71.a aVar12 = b71.a.r;
                        i11 = n8Var.v;
                        if (i11 != 0) {
                            sy.y.j(obj14);
                            q70 q70Var = (q70) obj;
                            u70 u70Var = q70Var.a;
                            String str11 = null;
                            List list3 = (u70Var == null || (s70Var3 = u70Var.b) == null) ? null : s70Var3.a.b;
                            if (list3 == null) {
                                list3 = x61.rShadow.r;
                            }
                            ArrayList S4 = x61.m.S(list3);
                            ArrayList arrayList6 = new ArrayList(x61.n.F(S4, 10));
                            int size4 = S4.size();
                            int i39 = 0;
                            while (i39 < size4) {
                                Object obj15 = S4.get(i39);
                                i39++;
                                r70 r70Var = (r70) obj15;
                                arrayList6.add(sy.n.G(new w61.k(r70Var.c, r70Var.d)));
                            }
                            u70 u70Var2 = q70Var.a;
                            boolean z5 = (u70Var2 == null || (s70Var2 = u70Var2.b) == null) ? false : s70Var2.a.a.a;
                            if (u70Var2 != null && (s70Var = u70Var2.b) != null) {
                                str11 = s70Var.a.a.b;
                            }
                            yz0.c4 c4Var2 = new yz0.c4(arrayList6, new x01.i(str11, z5, false));
                            n8Var.v = 1;
                            if (this.s.c(c4Var2, n8Var) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                n8Var = new n8(this, cVar);
                Object obj142 = n8Var.u;
                b71.a aVar122 = b71.a.r;
                i11 = n8Var.v;
                if (i11 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof p8Shadow) {
                    p8Var = (p8Shadow) cVar;
                    int i41 = p8Var.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        p8Var.v = i41 - Integer.MIN_VALUE;
                        Object obj16 = p8Var.u;
                        b71.a aVar13 = b71.a.r;
                        i12 = p8Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj16);
                            pi0 pi0Var = ((oi0) obj).a;
                            Boolean valueOf = Boolean.valueOf(pi0Var != null ? pi0Var.b : false);
                            p8Var.v = 1;
                            if (this.s.c(valueOf, p8Var) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                p8Var = new p8Shadow(this, cVar);
                Object obj162 = p8Var.u;
                b71.a aVar132 = b71.a.r;
                i12 = p8Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof r8) {
                    r8Var = (r8) cVar;
                    int i42 = r8Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        r8Var.v = i42 - Integer.MIN_VALUE;
                        Object obj17 = r8Var.u;
                        b71.a aVar14 = b71.a.r;
                        i13 = r8Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj17);
                            sy.l lVar4 = sy.m.Companion;
                            dw.k2 k2Var2 = ((p30) obj).c;
                            lVar4.getClass();
                            p01.j a2 = sy.l.a(k2Var2);
                            r8Var.v = 1;
                            if (this.s.c(a2, r8Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                r8Var = new r8(this, cVar);
                Object obj172 = r8Var.u;
                b71.a aVar142 = b71.a.r;
                i13 = r8Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof s8) {
                    s8Var = (s8) cVar;
                    int i43 = s8Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        s8Var.v = i43 - Integer.MIN_VALUE;
                        Object obj18 = s8Var.u;
                        b71.a aVar15 = b71.a.r;
                        i14 = s8Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj18);
                            p30 p30Var2 = ((o30) obj).a;
                            if (p30Var2 != null) {
                                s8Var.v = 1;
                                if (this.s.c(p30Var2, s8Var) == aVar15) {
                                    return aVar15;
                                }
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                s8Var = new s8(this, cVar);
                Object obj182 = s8Var.u;
                b71.a aVar152 = b71.a.r;
                i14 = s8Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof w8Shadow) {
                    w8Var = (w8Shadow) cVar;
                    int i44 = w8Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        w8Var.v = i44 - Integer.MIN_VALUE;
                        Object obj19 = w8Var.u;
                        b71.a aVar16 = b71.a.r;
                        i15 = w8Var.v;
                        w61.a0 a0Var = w61.a0.a;
                        if (i15 != 0) {
                            sy.y.j(obj19);
                            w8Var.v = 1;
                            if (this.s.c(a0Var, w8Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return a0Var;
                    }
                }
                w8Var = new w8Shadow(this, cVar);
                Object obj192 = w8Var.u;
                b71.a aVar162 = b71.a.r;
                i15 = w8Var.v;
                w61.a0 a0Var2 = w61.a0.a;
                if (i15 != 0) {
                }
                return a0Var2;
            case 14:
                if (cVar instanceof z8) {
                    z8Var = (z8) cVar;
                    int i45 = z8Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        z8Var.v = i45 - Integer.MIN_VALUE;
                        Object obj20 = z8Var.u;
                        b71.a aVar17 = b71.a.r;
                        i16 = z8Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj20);
                            s50 s50Var = (s50) obj;
                            w50 w50Var = s50Var.a;
                            int i46 = w50Var.a;
                            x61.rShadow rVar5 = w50Var.c;
                            if (rVar5 == null) {
                                rVar5 = x61.rShadow.r;
                            }
                            ArrayList S5 = x61.m.S(rVar5);
                            ArrayList arrayList7 = new ArrayList();
                            int size5 = S5.size();
                            int i47 = 0;
                            while (i47 < size5) {
                                Object obj21 = S5.get(i47);
                                i47++;
                                u50 u50Var = ((t50) obj21).b;
                                SimpleRepository I = u50Var != null ? sy.n.I(u50Var.c) : null;
                                if (I != null) {
                                    arrayList7.add(I);
                                }
                            }
                            v50 v50Var = s50Var.a.b;
                            yz0.d4 d4Var = new yz0.d4(i46, arrayList7, new x01.i(v50Var.b, v50Var.a, false));
                            z8Var.v = 1;
                            if (this.s.c(d4Var, z8Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                z8Var = new z8(this, cVar);
                Object obj202 = z8Var.u;
                b71.a aVar172 = b71.a.r;
                i16 = z8Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof a9) {
                    a9Var = (a9) cVar;
                    int i48 = a9Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        a9Var.v = i48 - Integer.MIN_VALUE;
                        Object obj23 = a9Var.u;
                        b71.a aVar18 = b71.a.r;
                        i17 = a9Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj23);
                            Boolean bool = Boolean.FALSE;
                            a9Var.v = 1;
                            if (this.s.c(bool, a9Var) == aVar18) {
                                return aVar18;
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
                a9Var = new a9(this, cVar);
                Object obj232 = a9Var.u;
                b71.a aVar182 = b71.a.r;
                i17 = a9Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof b9) {
                    b9Var = (b9) cVar;
                    int i49 = b9Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        b9Var.v = i49 - Integer.MIN_VALUE;
                        Object obj24 = b9Var.u;
                        b71.a aVar19 = b71.a.r;
                        i18 = b9Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj24);
                            Boolean bool2 = Boolean.TRUE;
                            b9Var.v = 1;
                            if (this.s.c(bool2, b9Var) == aVar19) {
                                return aVar19;
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
                b9Var = new b9(this, cVar);
                Object obj242 = b9Var.u;
                b71.a aVar192 = b71.a.r;
                i18 = b9Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof e9Shadow) {
                    e9Var = (e9Shadow) cVar;
                    int i51 = e9Var.v;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        e9Var.v = i51 - Integer.MIN_VALUE;
                        Object obj25 = e9Var.u;
                        b71.a aVar20 = b71.a.r;
                        i19 = e9Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj25);
                            jo.d1 d1Var = (jo.d1) obj;
                            k71.k.g(d1Var, "<this>");
                            jo.b1 b1Var = d1Var.a;
                            String str12 = (b1Var == null || (f1Var2 = b1Var.a) == null) ? "" : f1Var2.b;
                            lv.c cVar2 = (b1Var == null || (f1Var = b1Var.a) == null) ? null : f1Var.d;
                            if (cVar2 == null) {
                                yz0.s.Companion.getClass();
                                k = new yz0.a7(yz0.r.b, true, TimelineItem.TimelinePullRequestReview.ReviewState.UNKNOWN);
                            } else {
                                k = sy.w.k(cVar2);
                            }
                            yz0.c cVar3 = new yz0.c(str12, k);
                            e9Var.v = 1;
                            if (this.s.c(cVar3, e9Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                e9Var = new e9Shadow(this, cVar);
                Object obj252 = e9Var.u;
                b71.a aVar202 = b71.a.r;
                i19 = e9Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof g9) {
                    g9Var = (g9) cVar;
                    int i52 = g9Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        g9Var.v = i52 - Integer.MIN_VALUE;
                        Object obj26 = g9Var.u;
                        b71.a aVar21 = b71.a.r;
                        i21 = g9Var.v;
                        if (i21 != 0) {
                            sy.y.j(obj26);
                            yr yrVar = (yr) obj;
                            k71.k.g(yrVar, "<this>");
                            String str13 = yrVar.d;
                            pv.c cVar4 = yrVar.l;
                            String str14 = yrVar.b;
                            cs csVar2 = yrVar.i;
                            gs gsVar = yrVar.j;
                            bs bsVar = yrVar.g;
                            String str15 = bsVar.a;
                            String str16 = bsVar.b;
                            List<vr> list4 = gsVar != null ? gsVar.a : null;
                            if (list4 == null) {
                                list4 = x61.rShadow.r;
                            }
                            ArrayList arrayList8 = new ArrayList();
                            for (vr vrVar : list4) {
                                if (vrVar != null) {
                                    cs csVar3 = csVar2;
                                    zr zrVar = vrVar.c;
                                    as asVar = vrVar.b;
                                    if (asVar != null) {
                                        sy.h hVar2 = sy.i.Companion;
                                        str2 = str16;
                                        qr qrVar = asVar.k;
                                        List list5 = asVar.j;
                                        ArrayList S6 = list5 != null ? x61.m.S(list5) : null;
                                        String str17 = asVar.c;
                                        String str18 = asVar.b;
                                        nv.a aVar23 = asVar.l;
                                        boolean z6 = asVar.e;
                                        es esVar = asVar.h;
                                        if (esVar != null) {
                                            arrayList3 = arrayList8;
                                            arrayList4 = S6;
                                            str4 = str17;
                                            str5 = esVar.a;
                                        } else {
                                            arrayList3 = arrayList8;
                                            arrayList4 = S6;
                                            str4 = str17;
                                            str5 = "";
                                        }
                                        boolean z7 = asVar.f;
                                        boolean z8 = asVar.g;
                                        boolean z9 = asVar.i;
                                        int ordinal = asVar.d.ordinal();
                                        if (ordinal != 0) {
                                            z2 = z9;
                                            if (ordinal == 1) {
                                                commentLevelType2 = CommentLevelType.LINE;
                                            } else {
                                                if (ordinal != 2) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                commentLevelType2 = CommentLevelType.UNKNOWN__;
                                            }
                                        } else {
                                            z2 = z9;
                                            commentLevelType2 = CommentLevelType.FILE;
                                        }
                                        CommentLevelType commentLevelType3 = commentLevelType2;
                                        hVar2.getClass();
                                        csVar = csVar3;
                                        str3 = str15;
                                        boolean z11 = z2;
                                        aVar = aVar21;
                                        arrayList2 = arrayList3;
                                        k3Var = sy.h.a(str14, null, commentLevelType3, qrVar, null, arrayList4, str4, str18, aVar23, str3, str2, z6, str5, z7, z8, z11);
                                    } else {
                                        aVar = aVar21;
                                        str2 = str16;
                                        str3 = str15;
                                        arrayList2 = arrayList8;
                                        csVar = csVar3;
                                        String str19 = "";
                                        if (zrVar != null) {
                                            fs fsVar = zrVar.e;
                                            sy.h hVar3 = sy.i.Companion;
                                            ArrayList S7 = (fsVar == null || (list2 = fsVar.g) == null) ? null : x61.m.S(list2);
                                            String str20 = zrVar.c;
                                            String str21 = zrVar.b;
                                            nv.a aVar24 = fsVar != null ? fsVar.i : null;
                                            boolean z12 = fsVar != null ? fsVar.b : false;
                                            String str22 = str14;
                                            if (fsVar != null && (dsVar = fsVar.c) != null) {
                                                str19 = dsVar.a;
                                            }
                                            boolean z13 = fsVar != null ? fsVar.d : false;
                                            boolean z14 = fsVar != null ? fsVar.e : false;
                                            boolean z15 = fsVar != null ? fsVar.f : false;
                                            int ordinal2 = zrVar.d.ordinal();
                                            if (ordinal2 != 0) {
                                                z = z14;
                                                if (ordinal2 == 1) {
                                                    commentLevelType = CommentLevelType.LINE;
                                                } else {
                                                    if (ordinal2 != 2) {
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    commentLevelType = CommentLevelType.UNKNOWN__;
                                                }
                                            } else {
                                                z = z14;
                                                commentLevelType = CommentLevelType.FILE;
                                            }
                                            CommentLevelType commentLevelType4 = commentLevelType;
                                            hVar3.getClass();
                                            str14 = str22;
                                            k3Var = sy.h.a(str14, zrVar, commentLevelType4, null, S7, null, str20, str21, aVar24, str3, str2, z12, str19, z13, z, z15);
                                        }
                                    }
                                    if (k3Var == null) {
                                        arrayList2.add(k3Var);
                                    }
                                    arrayList8 = arrayList2;
                                    csVar2 = csVar;
                                    str15 = str3;
                                    str16 = str2;
                                    aVar21 = aVar;
                                } else {
                                    aVar = aVar21;
                                    csVar = csVar2;
                                    str2 = str16;
                                    str3 = str15;
                                    arrayList2 = arrayList8;
                                }
                                k3Var = null;
                                if (k3Var == null) {
                                }
                                arrayList8 = arrayList2;
                                csVar2 = csVar;
                                str15 = str3;
                                str16 = str2;
                                aVar21 = aVar;
                            }
                            b71.a aVar25 = aVar21;
                            cs csVar4 = csVar2;
                            ArrayList arrayList9 = arrayList8;
                            dw.m3 m3Var = csVar4.c;
                            String str23 = m3Var.d;
                            String str24 = m3Var.c;
                            dw.j3 j3Var = m3Var.h;
                            yz0.t7 t7Var = new yz0.t7(str23, str24, j3Var.c, w8.s.A(j3Var.d), new fz.j(csVar4.d), m3Var.e);
                            String str25 = m3Var.h.b;
                            fz.b bVar3 = new fz.b(yrVar.k, str13, new yz0.k0(str14));
                            ZonedDateTime zonedDateTime = yrVar.f;
                            ArrayList h = w8.s.h(str14, cVar4);
                            boolean z16 = cVar4.c;
                            int ordinal3 = yrVar.c.ordinal();
                            if (ordinal3 == 0) {
                                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.APPROVED;
                            } else if (ordinal3 != 1) {
                                if (ordinal3 != 2) {
                                    if (ordinal3 == 3) {
                                        reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.DISMISSED;
                                    } else if (ordinal3 == 4) {
                                        reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.PENDING;
                                    } else if (ordinal3 != 5) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                }
                                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.COMMENTED;
                            } else {
                                reviewerReviewState = IssueOrPullRequest.ReviewerReviewState.CHANGES_REQUESTED;
                            }
                            IssueOrPullRequest.ReviewerReviewState reviewerReviewState2 = reviewerReviewState;
                            pr prVar = yrVar.h;
                            com.github.service.models.response.a e = v8.l0.e(prVar != null ? prVar.b : null);
                            boolean z17 = yrVar.e;
                            pu.a aVar26 = yrVar.n;
                            yz0.l3 l3Var = new yz0.l3(str14, arrayList9, t7Var, str25, bVar3, zonedDateTime, h, z16, reviewerReviewState2, e, z17, str13, aVar26.b, aVar26.c);
                            g9Var.v = 1;
                            if (this.s.c(l3Var, g9Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                g9Var = new g9(this, cVar);
                Object obj262 = g9Var.u;
                b71.a aVar212 = b71.a.r;
                i21 = g9Var.v;
                if (i21 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof h9) {
                    h9Var = (h9) cVar;
                    int i53 = h9Var.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        h9Var.v = i53 - Integer.MIN_VALUE;
                        Object obj27 = h9Var.u;
                        b71.a aVar27 = b71.a.r;
                        i22 = h9Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj27);
                            xr xrVar = ((sr) obj).a;
                            yr yrVar2 = xrVar != null ? xrVar.c : null;
                            if (yrVar2 != null) {
                                h9Var.v = 1;
                                if (this.s.c(yrVar2, h9Var) == aVar27) {
                                    return aVar27;
                                }
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                h9Var = new h9(this, cVar);
                Object obj272 = h9Var.u;
                b71.a aVar272 = b71.a.r;
                i22 = h9Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 20:
                if (cVar instanceof i9) {
                    i9Var = (i9) cVar;
                    int i54 = i9Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        i9Var.v = i54 - Integer.MIN_VALUE;
                        Object obj28 = i9Var.u;
                        b71.a aVar28 = b71.a.r;
                        i23 = i9Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj28);
                            c80 c80Var = (c80) obj;
                            k71.k.g(c80Var, "<this>");
                            f80 f80Var = c80Var.a;
                            lv.c cVar5 = (f80Var == null || (e80Var = f80Var.a) == null) ? null : e80Var.d;
                            if (cVar5 == null) {
                                yz0.s.Companion.getClass();
                                k2 = new yz0.a7(yz0.r.b, false, TimelineItem.TimelinePullRequestReview.ReviewState.UNKNOWN);
                            } else {
                                k2 = sy.w.k(cVar5);
                            }
                            yz0.b5 b5Var = new yz0.b5(k2);
                            i9Var.v = 1;
                            if (this.s.c(b5Var, i9Var) == aVar28) {
                                return aVar28;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                i9Var = new i9(this, cVar);
                Object obj282 = i9Var.u;
                b71.a aVar282 = b71.a.r;
                i23 = i9Var.v;
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
                return i(cVar, obj);
            default:
                if (cVar instanceof v9) {
                    v9Var = (v9) cVar;
                    int i55 = v9Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        v9Var.v = i55 - Integer.MIN_VALUE;
                        Object obj29 = v9Var.u;
                        b71.a aVar29 = b71.a.r;
                        i24 = v9Var.v;
                        if (i24 != 0) {
                            sy.y.j(obj29);
                            f20 f20Var = (f20) obj;
                            j20 j20Var = f20Var.a;
                            String str26 = null;
                            List list6 = (j20Var == null || (g20Var3 = j20Var.b) == null) ? null : g20Var3.b;
                            if (list6 == null) {
                                list6 = x61.rShadow.r;
                            }
                            ArrayList S8 = x61.m.S(list6);
                            ArrayList arrayList10 = new ArrayList(x61.n.F(S8, 10));
                            int size6 = S8.size();
                            int i56 = 0;
                            while (i56 < size6) {
                                Object obj30 = S8.get(i56);
                                i56++;
                                h20 h20Var = (h20) obj30;
                                k71.k.g(h20Var, "<this>");
                                arrayList10.add(new fz.f(h20Var.c, h20Var.a, h20Var.b));
                            }
                            j20 j20Var2 = f20Var.a;
                            boolean z18 = (j20Var2 == null || (g20Var2 = j20Var2.b) == null) ? false : g20Var2.a.a;
                            if (j20Var2 != null && (g20Var = j20Var2.b) != null) {
                                str26 = g20Var.a.b;
                            }
                            w61.k kVar3 = new w61.k(arrayList10, new x01.i(str26, z18, false));
                            v9Var.v = 1;
                            if (this.s.c(kVar3, v9Var) == aVar29) {
                                return aVar29;
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
                v9Var = new v9(this, cVar);
                Object obj292 = v9Var.u;
                b71.a aVar292 = b71.a.r;
                i24 = v9Var.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
        }
    }
}
