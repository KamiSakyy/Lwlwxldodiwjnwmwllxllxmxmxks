package wy0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.organizations.OrganizationNameAndAvatarUrl;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import jn0.a30;
import jn0.am;
import jn0.bm;
import jn0.dc;
import jn0.dc0;
import jn0.ec;
import jn0.em;
import jn0.fa;
import jn0.fc;
import jn0.ff;
import jn0.fm;
import jn0.gf;
import jn0.gm;
import jn0.ia;
import jn0.im;
import jn0.ja;
import jn0.ka;
import jn0.km;
import jn0.lm;
import jn0.mg0;
import jn0.mm;
import jn0.ng0;
import jn0.om;
import jn0.pc;
import jn0.pg0;
import jn0.qc;
import jn0.rm;
import jn0.ro;
import jn0.sb0;
import jn0.sc;
import jn0.sm;
import jn0.so;
import jn0.uc;
import jn0.vm;
import jn0.vo;
import jn0.wc;
import jn0.wm;
import jn0.x20;
import jn0.xc;
import jn0.xl;
import jn0.y20;
import jn0.yb0;
import jn0.yc;
import jn0.z20;
import jn0.zb0;
import jn0.zl;
import kotlin.NoWhenBranchMatchedException;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p3 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ p3(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        v4 v4Var;
        int i;
        IssueOrPullRequestState issueOrPullRequestState;
        jn0.e5 e5Var;
        jn0.e5 e5Var2;
        if (cVar instanceof v4) {
            v4Var = (v4) cVar;
            int i2 = v4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = v4Var.u;
                b71.a aVar = b71.a.r;
                i = v4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jn0.d5 d5Var = (jn0.d5) obj;
                    k71.k.g(d5Var, "<this>");
                    jn0.b5 b5Var = d5Var.a;
                    gu guVar = (b5Var == null || (e5Var2 = b5Var.a) == null) ? null : e5Var2.b;
                    int i3 = guVar == null ? -1 : bx0.q.a[guVar.ordinal()];
                    if (i3 == -1) {
                        issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                    } else if (i3 == 1) {
                        issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
                    } else if (i3 == 2) {
                        issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                    } else if (i3 == 3) {
                        issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                    }
                    boolean z = false;
                    if (b5Var != null && (e5Var = b5Var.a) != null && e5Var.c) {
                        z = true;
                    }
                    yz0.a8 a8Var = new yz0.a8(issueOrPullRequestState, z);
                    v4Var.v = 1;
                    if (this.s.c(a8Var, v4Var) == aVar) {
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
        v4Var = new v4(this, cVar);
        Object obj22 = v4Var.u;
        b71.a aVar2 = b71.a.r;
        i = v4Var.v;
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
        x4 x4Var;
        int i;
        h01.f fVar;
        sc scVar;
        if (cVar instanceof x4) {
            x4Var = (x4) cVar;
            int i2 = x4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = x4Var.u;
                b71.a aVar = b71.a.r;
                i = x4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    qc qcVar = ((pc) obj).a;
                    if (qcVar == null || (scVar = qcVar.a) == null) {
                        fVar = null;
                    } else {
                        xt0.m3 m3Var = scVar.b.c;
                        xt0.l3 l3Var = m3Var.c;
                        fVar = new h01.f(l3Var.c.b, m3Var.b, l3Var.b);
                    }
                    if (fVar != null) {
                        x4Var.v = 1;
                        if (this.s.c(fVar, x4Var) == aVar) {
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
        x4Var = new x4(this, cVar);
        Object obj22 = x4Var.u;
        b71.a aVar2 = b71.a.r;
        i = x4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        y4 y4Var;
        int i;
        String str;
        yz0.s7 w5Var;
        uc ucVar;
        PullRequestMergeMethod pullRequestMergeMethod;
        yc ycVar;
        xt0.a aVar;
        yc ycVar2;
        yc ycVar3;
        yc ycVar4;
        xt0.a aVar2;
        if (cVar instanceof y4) {
            y4Var = (y4) cVar;
            int i2 = y4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = y4Var.u;
                b71.a aVar3 = b71.a.r;
                i = y4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    wc wcVar = (wc) obj;
                    k71.k.g(wcVar, "<this>");
                    xc xcVar = wcVar.a;
                    PullRequestMergeMethod V = (xcVar == null || (ycVar4 = xcVar.b) == null || (aVar2 = ycVar4.c.d) == null) ? null : aa1.b.V(aVar2.a);
                    int i3 = V == null ? -1 : bx0.d.a[V.ordinal()];
                    str = "";
                    if (i3 == -1 || i3 == 1 || i3 == 2) {
                        if (xcVar != null && (ucVar = xcVar.a) != null) {
                            str = ucVar.b;
                        }
                        w5Var = new yz0.w5(new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62));
                    } else if (i3 == 3) {
                        uc ucVar2 = xcVar.a;
                        w5Var = new yz0.y5(new com.github.service.models.response.a(ucVar2 != null ? ucVar2.b : "", (Avatar) null, (String) null, false, (String) null, 62));
                    } else {
                        if (i3 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        uc ucVar3 = xcVar.a;
                        w5Var = new yz0.x5(new com.github.service.models.response.a(ucVar3 != null ? ucVar3.b : "", (Avatar) null, (String) null, false, (String) null, 62));
                    }
                    boolean z = false;
                    boolean z2 = (xcVar == null || (ycVar3 = xcVar.b) == null || !ycVar3.c.c) ? false : true;
                    if (xcVar != null && (ycVar2 = xcVar.b) != null && ycVar2.c.b) {
                        z = true;
                    }
                    if (xcVar == null || (ycVar = xcVar.b) == null || (aVar = ycVar.c.d) == null || (pullRequestMergeMethod = aa1.b.V(aVar.a)) == null) {
                        pullRequestMergeMethod = PullRequestMergeMethod.UNKNOWN__;
                    }
                    yz0.e1 e1Var = new yz0.e1(w5Var, z2, z, pullRequestMergeMethod);
                    y4Var.v = 1;
                    if (this.s.c(e1Var, y4Var) == aVar3) {
                        return aVar3;
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
        y4Var = new y4(this, cVar);
        Object obj22 = y4Var.u;
        b71.a aVar32 = b71.a.r;
        i = y4Var.v;
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
        z4 z4Var;
        int i;
        kx0.a aVar;
        jn0.j4 j4Var;
        List list;
        jn0.j4 j4Var2;
        List list2;
        jn0.f4 f4Var;
        if (cVar instanceof z4) {
            z4Var = (z4) cVar;
            int i2 = z4Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z4Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = z4Var.u;
                b71.a aVar2 = b71.a.r;
                i = z4Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jn0.d4 d4Var = (jn0.d4) obj;
                    jn0.h4 h4Var = d4Var.a;
                    jn0.n4 n4Var = (h4Var == null || (j4Var2 = h4Var.c) == null || (list2 = j4Var2.b.a) == null || (f4Var = (jn0.f4) x61.m.f0(list2)) == null) ? null : f4Var.a.b;
                    jn0.h4 h4Var2 = d4Var.a;
                    List<jn0.e4> S = (h4Var2 == null || (j4Var = h4Var2.c) == null || (list = j4Var.a.b) == null) ? null : x61.m.S(list);
                    List<jn0.g4> list3 = x61.rShadow.r;
                    if (S == null) {
                        S = list3;
                    }
                    ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                    for (jn0.e4 e4Var : S) {
                        k71.k.g(e4Var, "requiredStatusCheck");
                        String str = e4Var.a;
                        String str2 = e4Var.b;
                        MergeCheckStatus d = com.google.android.gms.internal.measurement.b4.d(com.google.common.util.concurrent.a.W(e4Var.c));
                        String str3 = e4Var.d;
                        arrayList.add(new kx0.a(str, str2, null, d, "", "", str3 == null ? "" : str3, Boolean.TRUE, null));
                    }
                    if (n4Var != null) {
                        List list4 = n4Var.b.b;
                        List S2 = list4 != null ? x61.m.S(list4) : null;
                        if (S2 != null) {
                            list3 = S2;
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (jn0.g4 g4Var : list3) {
                            jn0.i4 i4Var = g4Var.c;
                            if (i4Var != null) {
                                String str4 = i4Var.a;
                                String str5 = i4Var.c;
                                jn0.y3 y3Var = i4Var.g;
                                jn0.p4 p4Var = y3Var.a;
                                String str6 = p4Var != null ? p4Var.a.a : null;
                                pz0.y2 y2Var = i4Var.b;
                                if (y2Var == null) {
                                    y2Var = pz0.y2.t;
                                }
                                MergeCheckStatus e = com.google.android.gms.internal.measurement.b4.e(y2Var);
                                String str7 = i4Var.e;
                                jn0.x3 x3Var = y3Var.b;
                                String str8 = x3Var != null ? x3Var.a : "";
                                String str9 = i4Var.d;
                                aVar = new kx0.a(str4, str5, str6, e, str7, str8, str9 == null ? "" : str9, Boolean.valueOf(i4Var.h), Integer.valueOf(i4Var.f));
                            } else {
                                jn0.k4 k4Var = g4Var.b;
                                if (k4Var != null) {
                                    String str10 = k4Var.a;
                                    String str11 = k4Var.b;
                                    MergeCheckStatus d2 = com.google.android.gms.internal.measurement.b4.d(com.google.common.util.concurrent.a.W(k4Var.c));
                                    String str12 = k4Var.f;
                                    String str13 = str12 == null ? "" : str12;
                                    String str14 = k4Var.d;
                                    String str15 = str14 == null ? "" : str14;
                                    String str16 = k4Var.e;
                                    aVar = new kx0.a(str10, str11, null, d2, str13, str15, str16 == null ? "" : str16, Boolean.valueOf(k4Var.g), null);
                                } else {
                                    aVar = null;
                                }
                            }
                            if (aVar != null) {
                                arrayList2.add(aVar);
                            }
                        }
                        list3 = arrayList2;
                    }
                    ArrayList l0 = x61.m.l0(list3, arrayList);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList3 = new ArrayList();
                    int size = l0.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = l0.get(i3);
                        i3++;
                        if (hashSet.add(((kx0.a) obj3).b)) {
                            arrayList3.add(obj3);
                        }
                    }
                    h01.d dVar = new h01.d(arrayList3, new x01.i(n4Var != null ? n4Var.b.a.b : null, n4Var != null ? n4Var.b.a.a : false, false));
                    z4Var.v = 1;
                    if (this.s.c(dVar, z4Var) == aVar2) {
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
        z4Var = new z4(this, cVar);
        Object obj22 = z4Var.u;
        b71.a aVar22 = b71.a.r;
        i = z4Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0403  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:323:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x059d  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x06e7  */
    /* JADX WARN: Removed duplicated region for block: B:464:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x07fb  */
    /* JADX WARN: Removed duplicated region for block: B:534:0x0809  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0849  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0857  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:587:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x095d  */
    /* JADX WARN: Removed duplicated region for block: B:643:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:659:0x09a9  */
    /* JADX WARN: Removed duplicated region for block: B:665:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x0a07  */
    /* JADX WARN: Removed duplicated region for block: B:682:0x0a16  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0125  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        o3 o3Var;
        int i;
        String str;
        r3Shadow r3Var;
        int i2;
        s3 s3Var;
        int i3;
        t3 t3Var;
        int i4;
        PullRequestState pullRequestState;
        om omVar;
        lm lmVar;
        om omVar2;
        im imVar;
        om omVar3;
        om omVar4;
        lm lmVar2;
        om omVar5;
        u3 u3Var;
        int i5;
        zb0 zb0Var;
        List list;
        yb0 yb0Var;
        au0.d dVar;
        v3 v3Var;
        int i6;
        fc fcVar;
        w3 w3Var;
        int i7;
        x3 x3Var;
        int i8;
        y3 y3Var;
        int i9;
        z3 z3Var;
        int i10;
        z20 z20Var;
        a4 a4Var;
        int i12;
        b4 b4Var;
        int i13;
        d4 d4Var;
        int i14;
        f4 f4Var;
        int i15;
        g4 g4Var;
        int i16;
        i4 i4Var;
        int i17;
        j4 j4Var;
        int i18;
        k4 k4Var;
        int i19;
        ux0.m0 m0Var;
        m4 m4Var;
        int i20;
        n4 n4Var;
        int i22;
        ux0.v vVar;
        o4 o4Var;
        int i23;
        ux0.y0 y0Var;
        r4 r4Var;
        int i24;
        s4 s4Var;
        int i25;
        t4 t4Var;
        int i26;
        yw0.n nVar;
        yw0.o oVar;
        yw0.m mVar;
        w4 w4Var;
        int i27;
        ka kaVar;
        ka kaVar2;
        fa faVar;
        a5 a5Var;
        int i28;
        MergeStateStatus mergeStateStatus;
        sm smVar;
        vm vmVar;
        switch (this.r) {
            case 0:
                if (cVar instanceof o3) {
                    o3Var = (o3) cVar;
                    int i29 = o3Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        o3Var.v = i29 - Integer.MIN_VALUE;
                        Object obj2 = o3Var.u;
                        b71.a aVar = b71.a.r;
                        i = o3Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            am amVar = ((xl) obj).a;
                            bm bmVar = amVar != null ? amVar.c : null;
                            Collection<zl> collection = x61.rShadow.r;
                            if (bmVar != null) {
                                Collection collection2 = amVar.c.a.a;
                                if (collection2 != null) {
                                    collection = collection2;
                                }
                                ArrayList arrayList = new ArrayList();
                                for (zl zlVar : collection) {
                                    if (zlVar == null || (str = zlVar.b) == null) {
                                        str = "";
                                    }
                                    arrayList.add(new yz0.r2(str, zlVar != null ? zlVar.c : "", m7.y.L(zlVar != null ? zlVar.e : null), false));
                                }
                                collection = arrayList;
                            }
                            o3Var.v = 1;
                            if (this.s.c(collection, o3Var) == aVar) {
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
                o3Var = new o3(this, cVar);
                Object obj22 = o3Var.u;
                b71.a aVar2 = b71.a.r;
                i = o3Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof r3Shadow) {
                    r3Var = (r3Shadow) cVar;
                    int i30 = r3Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        r3Var.v = i30 - Integer.MIN_VALUE;
                        Object obj3 = r3Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = r3Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            gm gmVar = (gm) obj;
                            k71.k.g(gmVar, "<this>");
                            yz0.t2 t2Var = new yz0.t2(new yz0.s2(gmVar.c, gmVar.d), new yz0.s2(gmVar.e, gmVar.f));
                            r3Var.v = 1;
                            if (this.s.c(t2Var, r3Var) == aVar3) {
                                return aVar3;
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
                r3Var = new r3Shadow(this, cVar);
                Object obj32 = r3Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = r3Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof s3) {
                    s3Var = (s3) cVar;
                    int i32 = s3Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        s3Var.v = i32 - Integer.MIN_VALUE;
                        Object obj4 = s3Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = s3Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            fm fmVar = ((em) obj).a;
                            gm gmVar2 = fmVar != null ? fmVar.c : null;
                            if (gmVar2 != null) {
                                s3Var.v = 1;
                                if (this.s.c(gmVar2, s3Var) == aVar4) {
                                    return aVar4;
                                }
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
                s3Var = new s3(this, cVar);
                Object obj42 = s3Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = s3Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof t3) {
                    t3Var = (t3) cVar;
                    int i33 = t3Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        t3Var.v = i33 - Integer.MIN_VALUE;
                        Object obj5 = t3Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = t3Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            km kmVar = (km) obj;
                            k71.k.g(kmVar, "<this>");
                            mm mmVar = kmVar.a;
                            if (mmVar == null || (omVar5 = mmVar.b) == null || (pullRequestState = com.google.android.gms.internal.measurement.z3.Q(omVar5.i.b)) == null) {
                                pullRequestState = PullRequestState.UNKNOWN__;
                            }
                            String str2 = "";
                            String str3 = (mmVar == null || (omVar4 = mmVar.b) == null || (lmVar2 = omVar4.d) == null) ? "" : lmVar2.a;
                            String str4 = (mmVar == null || (omVar3 = mmVar.b) == null) ? "" : omVar3.c;
                            if (mmVar != null && (imVar = mmVar.a) != null) {
                                str2 = imVar.b;
                            }
                            yz0.v6 v6Var = new yz0.v6(str3, str4, new com.github.service.models.response.a(str2, (Avatar) null, (String) null, false, (String) null, 62));
                            boolean z = false;
                            if (mmVar != null && (omVar2 = mmVar.b) != null && omVar2.g) {
                                z = true;
                            }
                            yz0.u2 u2Var = new yz0.u2(pullRequestState, v6Var, z, (mmVar == null || (omVar = mmVar.b) == null || (lmVar = omVar.d) == null) ? null : lmVar.b);
                            t3Var.v = 1;
                            if (this.s.c(u2Var, t3Var) == aVar5) {
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
                t3Var = new t3(this, cVar);
                Object obj52 = t3Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = t3Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof u3) {
                    u3Var = (u3) cVar;
                    int i34 = u3Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        u3Var.v = i34 - Integer.MIN_VALUE;
                        Object obj6 = u3Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = u3Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj6);
                            dc0 dc0Var = ((sb0) obj).a;
                            yz0.z6Shadow r = (dc0Var == null || (zb0Var = dc0Var.a) == null || (list = zb0Var.o.a) == null || (yb0Var = (yb0) x61.m.W(list)) == null || (dVar = yb0Var.c) == null) ? null : com.google.android.gms.internal.measurement.b4.r(dVar);
                            if (r != null) {
                                u3Var.v = 1;
                                if (this.s.c(r, u3Var) == aVar6) {
                                    return aVar6;
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
                u3Var = new u3(this, cVar);
                Object obj62 = u3Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = u3Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof v3) {
                    v3Var = (v3) cVar;
                    int i35 = v3Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        v3Var.v = i35 - Integer.MIN_VALUE;
                        Object obj7 = v3Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = v3Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj7);
                            ec ecVar = ((dc) obj).a;
                            String str5 = (ecVar == null || (fcVar = ecVar.a) == null) ? null : fcVar.a;
                            v3Var.v = 1;
                            if (this.s.c(str5, v3Var) == aVar7) {
                                return aVar7;
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
                v3Var = new v3(this, cVar);
                Object obj72 = v3Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = v3Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof w3) {
                    w3Var = (w3) cVar;
                    int i36 = w3Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        w3Var.v = i36 - Integer.MIN_VALUE;
                        Object obj8 = w3Var.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = w3Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj8);
                            gf gfVar = ((ff) obj).a;
                            if (gfVar == null) {
                                throw new ApiFailure(ApiFailureType.NOT_FOUND, "Invalid Organisation login", null, null, null, null, null, 124);
                            }
                            OrganizationNameAndAvatarUrl K = i21.a.K(gfVar.c);
                            w3Var.v = 1;
                            if (this.s.c(K, w3Var) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                w3Var = new w3(this, cVar);
                Object obj82 = w3Var.u;
                b71.a aVar82 = b71.a.r;
                i7 = w3Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof x3) {
                    x3Var = (x3) cVar;
                    int i37 = x3Var.v;
                    if ((i37 & Integer.MIN_VALUE) != 0) {
                        x3Var.v = i37 - Integer.MIN_VALUE;
                        Object obj9 = x3Var.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = x3Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj9);
                            ro roVar = (ro) obj;
                            vo voVar = roVar.a;
                            List<so> list2 = voVar != null ? voVar.a.b : null;
                            if (list2 == null) {
                                list2 = x61.rShadow.r;
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (so soVar : list2) {
                                kt0.q qVar = soVar != null ? soVar.c : null;
                                if (qVar != null) {
                                    arrayList2.add(qVar);
                                }
                            }
                            ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
                            int size = arrayList2.size();
                            int i38 = 0;
                            while (i38 < size) {
                                Object obj10 = arrayList2.get(i38);
                                i38++;
                                arrayList3.add(i21.a.J((kt0.q) obj10));
                            }
                            vo voVar2 = roVar.a;
                            k01.a aVar10 = new k01.a(arrayList3, new x01.i(voVar2 != null ? voVar2.a.a.b : null, voVar2 != null && voVar2.a.a.a, false));
                            x3Var.v = 1;
                            if (this.s.c(aVar10, x3Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                x3Var = new x3(this, cVar);
                Object obj92 = x3Var.u;
                b71.a aVar92 = b71.a.r;
                i8 = x3Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof y3) {
                    y3Var = (y3) cVar;
                    int i39 = y3Var.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        y3Var.v = i39 - Integer.MIN_VALUE;
                        Object obj11 = y3Var.u;
                        b71.a aVar11 = b71.a.r;
                        i9 = y3Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj11);
                            mg0 mg0Var = (mg0) obj;
                            Iterable<ng0> iterable = mg0Var.a.a.b;
                            if (iterable == null) {
                                iterable = x61.rShadow.r;
                            }
                            ArrayList arrayList4 = new ArrayList();
                            for (ng0 ng0Var : iterable) {
                                kt0.q qVar2 = ng0Var != null ? ng0Var.c : null;
                                if (qVar2 != null) {
                                    arrayList4.add(qVar2);
                                }
                            }
                            ArrayList arrayList5 = new ArrayList(x61.n.F(arrayList4, 10));
                            int size2 = arrayList4.size();
                            int i40 = 0;
                            while (i40 < size2) {
                                Object obj12 = arrayList4.get(i40);
                                i40++;
                                arrayList5.add(i21.a.J((kt0.q) obj12));
                            }
                            pg0 pg0Var = mg0Var.a.a.a;
                            k01.a aVar12 = new k01.a(arrayList5, new x01.i(pg0Var.b, pg0Var.a, false));
                            y3Var.v = 1;
                            if (this.s.c(aVar12, y3Var) == aVar11) {
                                return aVar11;
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
                y3Var = new y3(this, cVar);
                Object obj112 = y3Var.u;
                b71.a aVar112 = b71.a.r;
                i9 = y3Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof z3) {
                    z3Var = (z3) cVar;
                    int i42 = z3Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        z3Var.v = i42 - Integer.MIN_VALUE;
                        Object obj13 = z3Var.u;
                        b71.a aVar13 = b71.a.r;
                        i10 = z3Var.v;
                        if (i10 != 0) {
                            sy.y.j(obj13);
                            x20 x20Var = (x20) obj;
                            Iterable<y20> iterable2 = x20Var.a.c;
                            if (iterable2 == null) {
                                iterable2 = x61.rShadow.r;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            for (y20 y20Var : iterable2) {
                                kt0.q qVar3 = (y20Var == null || (z20Var = y20Var.b) == null) ? null : z20Var.c;
                                if (qVar3 != null) {
                                    arrayList6.add(qVar3);
                                }
                            }
                            ArrayList arrayList7 = new ArrayList(x61.n.F(arrayList6, 10));
                            int size3 = arrayList6.size();
                            int i43 = 0;
                            while (i43 < size3) {
                                Object obj14 = arrayList6.get(i43);
                                i43++;
                                arrayList7.add(i21.a.J((kt0.q) obj14));
                            }
                            a30 a30Var = x20Var.a.b;
                            w61.k kVar = new w61.k(arrayList7, new x01.i(a30Var.b, a30Var.a, false));
                            z3Var.v = 1;
                            if (this.s.c(kVar, z3Var) == aVar13) {
                                return aVar13;
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
                z3Var = new z3(this, cVar);
                Object obj132 = z3Var.u;
                b71.a aVar132 = b71.a.r;
                i10 = z3Var.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof a4) {
                    a4Var = (a4) cVar;
                    int i44 = a4Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        a4Var.v = i44 - Integer.MIN_VALUE;
                        Object obj15 = a4Var.u;
                        b71.a aVar14 = b71.a.r;
                        i12 = a4Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj15);
                            ux0.a aVar15 = ((ux0.c) obj).a;
                            Object j = in.rShadow.j(aVar15 != null ? aVar15.a : null, "Invalid project or item id", n1.t);
                            a4Var.v = 1;
                            if (this.s.c(j, a4Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                a4Var = new a4(this, cVar);
                Object obj152 = a4Var.u;
                b71.a aVar142 = b71.a.r;
                i12 = a4Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof b4) {
                    b4Var = (b4) cVar;
                    int i45 = b4Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        b4Var.v = i45 - Integer.MIN_VALUE;
                        Object obj16 = b4Var.u;
                        b71.a aVar16 = b71.a.r;
                        i13 = b4Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj16);
                            ux0.f1Shadow f1Var = ((ux0.d1) obj).a;
                            Object j2 = in.rShadow.j(f1Var != null ? f1Var.a : null, "Invalid project, item id, fieldId or value", n1.u);
                            b4Var.v = 1;
                            if (this.s.c(j2, b4Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                b4Var = new b4(this, cVar);
                Object obj162 = b4Var.u;
                b71.a aVar162 = b71.a.r;
                i13 = b4Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof d4) {
                    d4Var = (d4) cVar;
                    int i46 = d4Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        d4Var.v = i46 - Integer.MIN_VALUE;
                        Object obj17 = d4Var.u;
                        b71.a aVar17 = b71.a.r;
                        i14 = d4Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj17);
                            ux0.f1Shadow f1Var2 = ((ux0.d1) obj).a;
                            Object j3 = in.rShadow.j(f1Var2 != null ? f1Var2.a : null, "Invalid project, item id, fieldId or value", n1.v);
                            d4Var.v = 1;
                            if (this.s.c(j3, d4Var) == aVar17) {
                                return aVar17;
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
                d4Var = new d4(this, cVar);
                Object obj172 = d4Var.u;
                b71.a aVar172 = b71.a.r;
                i14 = d4Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof f4) {
                    f4Var = (f4) cVar;
                    int i47 = f4Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        f4Var.v = i47 - Integer.MIN_VALUE;
                        Object obj18 = f4Var.u;
                        b71.a aVar18 = b71.a.r;
                        i15 = f4Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj18);
                            ux0.f fVar = ((ux0.h) obj).a;
                            Object j4 = in.rShadow.j(fVar != null ? fVar.a : null, "Invalid project, item id, fieldId or value", n1.w);
                            f4Var.v = 1;
                            if (this.s.c(j4, f4Var) == aVar18) {
                                return aVar18;
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
                f4Var = new f4(this, cVar);
                Object obj182 = f4Var.u;
                b71.a aVar182 = b71.a.r;
                i15 = f4Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof g4) {
                    g4Var = (g4) cVar;
                    int i48 = g4Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        g4Var.v = i48 - Integer.MIN_VALUE;
                        Object obj19 = g4Var.u;
                        b71.a aVar19 = b71.a.r;
                        i16 = g4Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj19);
                            ux0.f fVar2 = ((ux0.h) obj).a;
                            Object j5 = in.rShadow.j(fVar2 != null ? fVar2.a : null, "Invalid project, item id, fieldId or value", n1.x);
                            g4Var.v = 1;
                            if (this.s.c(j5, g4Var) == aVar19) {
                                return aVar19;
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
                g4Var = new g4(this, cVar);
                Object obj192 = g4Var.u;
                b71.a aVar192 = b71.a.r;
                i16 = g4Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof i4) {
                    i4Var = (i4) cVar;
                    int i49 = i4Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        i4Var.v = i49 - Integer.MIN_VALUE;
                        Object obj20 = i4Var.u;
                        b71.a aVar20 = b71.a.r;
                        i17 = i4Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj20);
                            ux0.q qVar4 = ((ux0.p) obj).a;
                            Object j6 = in.rShadow.j(qVar4 != null ? qVar4.a : null, "Invalid owner or repository name", n1.y);
                            i4Var.v = 1;
                            if (this.s.c(j6, i4Var) == aVar20) {
                                return aVar20;
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
                i4Var = new i4(this, cVar);
                Object obj202 = i4Var.u;
                b71.a aVar202 = b71.a.r;
                i17 = i4Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof j4) {
                    j4Var = (j4) cVar;
                    int i50 = j4Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        j4Var.v = i50 - Integer.MIN_VALUE;
                        Object obj21 = j4Var.u;
                        b71.a aVar21 = b71.a.r;
                        i18 = j4Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj21);
                            ux0.t1 t1Var = ((ux0.r1) obj).a;
                            Object j7 = in.rShadow.j(t1Var != null ? t1Var.a : null, "Invalid owner or repository name", n1.z);
                            j4Var.v = 1;
                            if (this.s.c(j7, j4Var) == aVar21) {
                                return aVar21;
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
                j4Var = new j4(this, cVar);
                Object obj212 = j4Var.u;
                b71.a aVar212 = b71.a.r;
                i18 = j4Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof k4) {
                    k4Var = (k4) cVar;
                    int i52 = k4Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        k4Var.v = i52 - Integer.MIN_VALUE;
                        Object obj23 = k4Var.u;
                        b71.a aVar22 = b71.a.r;
                        i19 = k4Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj23);
                            ux0.p0 p0Var = ((ux0.l0) obj).a;
                            Object j8 = in.rShadow.j((p0Var == null || (m0Var = p0Var.b.c) == null) ? null : m0Var.a, "Invalid owner or repository name", n1.A);
                            k4Var.v = 1;
                            if (this.s.c(j8, k4Var) == aVar22) {
                                return aVar22;
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
                k4Var = new k4(this, cVar);
                Object obj232 = k4Var.u;
                b71.a aVar222 = b71.a.r;
                i19 = k4Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof m4) {
                    m4Var = (m4) cVar;
                    int i53 = m4Var.v;
                    if ((i53 & Integer.MIN_VALUE) != 0) {
                        m4Var.v = i53 - Integer.MIN_VALUE;
                        Object obj24 = m4Var.u;
                        b71.a aVar23 = b71.a.r;
                        i20 = m4Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj24);
                            Boolean bool = (Boolean) ((w61.k) obj).s;
                            bool.getClass();
                            m4Var.v = 1;
                            if (this.s.c(bool, m4Var) == aVar23) {
                                return aVar23;
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
                m4Var = new m4(this, cVar);
                Object obj242 = m4Var.u;
                b71.a aVar232 = b71.a.r;
                i20 = m4Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 19:
                if (cVar instanceof n4) {
                    n4Var = (n4) cVar;
                    int i54 = n4Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        n4Var.v = i54 - Integer.MIN_VALUE;
                        Object obj25 = n4Var.u;
                        b71.a aVar24 = b71.a.r;
                        i22 = n4Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj25);
                            ux0.xShadow xVar = ((ux0.u) obj).a;
                            Object j9 = in.rShadow.j((xVar == null || (vVar = xVar.c) == null) ? null : vVar.b, "Invalid owner id", n1.B);
                            n4Var.v = 1;
                            if (this.s.c(j9, n4Var) == aVar24) {
                                return aVar24;
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
                n4Var = new n4(this, cVar);
                Object obj252 = n4Var.u;
                b71.a aVar242 = b71.a.r;
                i22 = n4Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 20:
                if (cVar instanceof o4) {
                    o4Var = (o4) cVar;
                    int i55 = o4Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        o4Var.v = i55 - Integer.MIN_VALUE;
                        Object obj26 = o4Var.u;
                        b71.a aVar25 = b71.a.r;
                        i23 = o4Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj26);
                            ux0.a1 a1Var = ((ux0.x0) obj).a;
                            l01.h0 h0Var = ((a1Var == null || (y0Var = a1Var.b) == null) ? null : y0Var.b) != null ? l01.h0.a : l01.h0.b;
                            o4Var.v = 1;
                            if (this.s.c(h0Var, o4Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                o4Var = new o4(this, cVar);
                Object obj262 = o4Var.u;
                b71.a aVar252 = b71.a.r;
                i23 = o4Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 21:
                if (cVar instanceof r4) {
                    r4Var = (r4) cVar;
                    int i56 = r4Var.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        r4Var.v = i56 - Integer.MIN_VALUE;
                        Object obj27 = r4Var.u;
                        b71.a aVar26 = b71.a.r;
                        i24 = r4Var.v;
                        if (i24 != 0) {
                            sy.y.j(obj27);
                            Boolean bool2 = (Boolean) ((w61.k) obj).s;
                            bool2.getClass();
                            r4Var.v = 1;
                            if (this.s.c(bool2, r4Var) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i24 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj27);
                        }
                        return w61.a0.a;
                    }
                }
                r4Var = new r4(this, cVar);
                Object obj272 = r4Var.u;
                b71.a aVar262 = b71.a.r;
                i24 = r4Var.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
            case 22:
                if (cVar instanceof s4) {
                    s4Var = (s4) cVar;
                    int i57 = s4Var.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        s4Var.v = i57 - Integer.MIN_VALUE;
                        Object obj28 = s4Var.u;
                        b71.a aVar27 = b71.a.r;
                        i25 = s4Var.v;
                        if (i25 != 0) {
                            sy.y.j(obj28);
                            ux0.u0 u0Var = ((ux0.s0) obj).a;
                            Object j10 = in.rShadow.j(u0Var != null ? u0Var.b : null, "Invalid owner or repository name", n1.C);
                            s4Var.v = 1;
                            if (this.s.c(j10, s4Var) == aVar27) {
                                return aVar27;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                s4Var = new s4(this, cVar);
                Object obj282 = s4Var.u;
                b71.a aVar272 = b71.a.r;
                i25 = s4Var.v;
                if (i25 != 0) {
                }
                return w61.a0.a;
            case 23:
                if (cVar instanceof t4) {
                    t4Var = (t4) cVar;
                    int i58 = t4Var.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        t4Var.v = i58 - Integer.MIN_VALUE;
                        Object obj29 = t4Var.u;
                        b71.a aVar28 = b71.a.r;
                        i26 = t4Var.v;
                        if (i26 != 0) {
                            sy.y.j(obj29);
                            yw0.j jVar = (yw0.j) obj;
                            k71.k.g(jVar, "<this>");
                            yw0.k kVar2 = jVar.a;
                            i01.b v0 = (kVar2 == null || (nVar = kVar2.a) == null || (oVar = nVar.b) == null || (mVar = oVar.d) == null) ? null : com.google.android.gms.internal.measurement.i4.v0(mVar.c);
                            if (v0 != null) {
                                t4Var.v = 1;
                                if (this.s.c(v0, t4Var) == aVar28) {
                                    return aVar28;
                                }
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                t4Var = new t4(this, cVar);
                Object obj292 = t4Var.u;
                b71.a aVar282 = b71.a.r;
                i26 = t4Var.v;
                if (i26 != 0) {
                }
                return w61.a0.a;
            case 24:
                return a(cVar, obj);
            case 25:
                if (cVar instanceof w4) {
                    w4Var = (w4) cVar;
                    int i59 = w4Var.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        w4Var.v = i59 - Integer.MIN_VALUE;
                        Object obj30 = w4Var.u;
                        b71.a aVar29 = b71.a.r;
                        i27 = w4Var.v;
                        if (i27 != 0) {
                            sy.y.j(obj30);
                            ia iaVar = (ia) obj;
                            k71.k.g(iaVar, "<this>");
                            ja jaVar = iaVar.a;
                            yz0.v5 v5Var = new yz0.v5(new com.github.service.models.response.a((jaVar == null || (faVar = jaVar.a) == null) ? "" : faVar.b.b, (Avatar) null, (String) null, false, (String) null, 62));
                            boolean z2 = false;
                            boolean z3 = (jaVar == null || (kaVar2 = jaVar.b) == null) ? false : kaVar2.b;
                            if (jaVar != null && (kaVar = jaVar.b) != null) {
                                z2 = kaVar.c;
                            }
                            yz0.c1 c1Var = new yz0.c1(v5Var, z3, z2);
                            w4Var.v = 1;
                            if (this.s.c(c1Var, w4Var) == aVar29) {
                                return aVar29;
                            }
                        } else {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj30);
                        }
                        return w61.a0.a;
                    }
                }
                w4Var = new w4(this, cVar);
                Object obj302 = w4Var.u;
                b71.a aVar292 = b71.a.r;
                i27 = w4Var.v;
                if (i27 != 0) {
                }
                return w61.a0.a;
            case 26:
                return b(cVar, obj);
            case 27:
                return d(cVar, obj);
            case 28:
                return e(cVar, obj);
            default:
                if (cVar instanceof a5) {
                    a5Var = (a5) cVar;
                    int i60 = a5Var.v;
                    if ((i60 & Integer.MIN_VALUE) != 0) {
                        a5Var.v = i60 - Integer.MIN_VALUE;
                        Object obj31 = a5Var.u;
                        b71.a aVar30 = b71.a.r;
                        i28 = a5Var.v;
                        if (i28 != 0) {
                            sy.y.j(obj31);
                            wm wmVar = ((rm) obj).a;
                            if (wmVar == null || (smVar = wmVar.b) == null || (vmVar = smVar.b) == null || (mergeStateStatus = v8.l0.P(vmVar.c)) == null) {
                                mergeStateStatus = MergeStateStatus.UNKNOWN;
                            }
                            a5Var.v = 1;
                            if (this.s.c(mergeStateStatus, a5Var) == aVar30) {
                                return aVar30;
                            }
                        } else {
                            if (i28 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj31);
                        }
                        return w61.a0.a;
                    }
                }
                a5Var = new a5(this, cVar);
                Object obj312 = a5Var.u;
                b71.a aVar302 = b71.a.r;
                i28 = a5Var.v;
                if (i28 != 0) {
                }
                return w61.a0.a;
        }
    }
}
