package t00;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.MergeCheckStatus;
import com.github.service.models.response.type.MergeStateStatus;
import com.github.service.models.response.type.PullRequestMergeMethod;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import jo.af0;
import jo.cb;
import jo.cf0;
import jo.co;
import jo.cp;
import jo.df0;
import jo.dp;
import jo.ef0;
import jo.eo;
import jo.fb;
import jo.ff0;
import jo.gb;
import jo.hb;
import jo.hf0;
import jo.ho;
import jo.io;
import jo.jf0;
import jo.kf0;
import jo.md;
import jo.nd;
import jo.pd;
import jo.rd;
import jo.td;
import jo.ud;
import jo.us;
import jo.vd;
import jo.ve0;
import jo.ws;
import kotlin.NoWhenBranchMatchedException;
import m10.b00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b5 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ b5(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        b6 b6Var;
        int i;
        hf0 hf0Var;
        af0 af0Var;
        yz0.e2 e2Var;
        hf0 hf0Var2;
        hf0 hf0Var3;
        if (cVar instanceof b6) {
            b6Var = (b6) cVar;
            int i2 = b6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = b6Var.u;
                b71.a aVar = b71.a.r;
                i = b6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    cf0 cf0Var = (cf0) obj;
                    k71.k.g(cf0Var, "<this>");
                    jf0 jf0Var = cf0Var.a;
                    String str = null;
                    kf0 kf0Var = (jf0Var == null || (hf0Var3 = jf0Var.b) == null) ? null : hf0Var3.c;
                    df0 df0Var = (jf0Var == null || (hf0Var2 = jf0Var.b) == null) ? null : hf0Var2.d;
                    List<ff0> list = kf0Var != null ? kf0Var.a : null;
                    List<ef0> list2 = x61.rShadow.r;
                    if (list == null) {
                        list = list2;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ff0 ff0Var : list) {
                        kw.e eVar = ff0Var != null ? ff0Var.c : null;
                        if (eVar != null) {
                            arrayList.add(eVar);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        kw.e eVar2 = (kw.e) obj3;
                        kw.d dVar = eVar2.d;
                        boolean z = eVar2.c;
                        if (dVar != null) {
                            kw.b bVar = dVar.c;
                            if (bVar != null) {
                                e2Var = sy.c.f(bVar, z);
                            } else {
                                kw.c cVar2 = dVar.b;
                                if (cVar2 != null) {
                                    e2Var = sy.c.g(cVar2, z, null);
                                } else {
                                    kw.a aVar2 = dVar.d;
                                    if (aVar2 != null) {
                                        e2Var = sy.c.e(aVar2, z, null);
                                    }
                                }
                            }
                            if (e2Var == null) {
                                arrayList2.add(e2Var);
                            }
                        }
                        e2Var = null;
                        if (e2Var == null) {
                        }
                    }
                    List list3 = df0Var != null ? df0Var.a : null;
                    if (list3 != null) {
                        list2 = list3;
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (ef0 ef0Var : list2) {
                        lv.m mVar = ef0Var != null ? ef0Var.c : null;
                        if (mVar != null) {
                            arrayList3.add(mVar);
                        }
                    }
                    ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj4 = arrayList3.get(i4);
                        i4++;
                        arrayList4.add(sy.c.h((lv.m) obj4));
                    }
                    ArrayList l0 = x61.m.l0(arrayList4, arrayList2);
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList5 = new ArrayList();
                    int size3 = l0.size();
                    int i5 = 0;
                    while (i5 < size3) {
                        Object obj5 = l0.get(i5);
                        i5++;
                        if (hashSet.add(((yz0.e2) obj5).a.x)) {
                            arrayList5.add(obj5);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    com.github.service.models.response.a aVar3 = new com.github.service.models.response.a((jf0Var == null || (af0Var = jf0Var.a) == null) ? "" : af0Var.b, (Avatar) null, (String) null, false, (String) null, 62);
                    if (jf0Var != null && (hf0Var = jf0Var.b) != null) {
                        str = hf0Var.b.b.c;
                    }
                    yz0.z7 z7Var = new yz0.z7(arrayList5, arrayList6, aVar3, str);
                    b6Var.v = 1;
                    if (this.s.c(z7Var, b6Var) == aVar) {
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
        b6Var = new b6(this, cVar);
        Object obj22 = b6Var.u;
        b71.a aVar4 = b71.a.r;
        i = b6Var.v;
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
        e6 e6Var;
        int i;
        if (cVar instanceof e6) {
            e6Var = (e6) cVar;
            int i2 = e6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = e6Var.u;
                b71.a aVar = b71.a.r;
                i = e6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    j00.c cVar2 = ((j00.b) obj).a.a;
                    Boolean bool = cVar2 != null ? cVar2.a : null;
                    e6Var.v = 1;
                    if (this.s.c(bool, e6Var) == aVar) {
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
        e6Var = new e6(this, cVar);
        Object obj22 = e6Var.u;
        b71.a aVar2 = b71.a.r;
        i = e6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object d(a71.c cVar, Object obj) {
        f6 f6Var;
        int i;
        if (cVar instanceof f6) {
            f6Var = (f6) cVar;
            int i2 = f6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = f6Var.u;
                b71.a aVar = b71.a.r;
                i = f6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    j00.h hVar = ((j00.g) obj).a.a;
                    n01.a aVar2 = new n01.a(hVar != null ? hVar.a : false, hVar != null ? hVar.b : false, hVar != null ? hVar.d : false, hVar != null ? hVar.c : false, hVar != null ? hVar.e : false, hVar != null ? hVar.f : false, hVar != null ? hVar.g : false, hVar != null ? hVar.h : false, hVar != null ? hVar.i : false, hVar != null ? hVar.j : null);
                    f6Var.v = 1;
                    if (this.s.c(aVar2, f6Var) == aVar) {
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
        f6Var = new f6(this, cVar);
        Object obj22 = f6Var.u;
        b71.a aVar3 = b71.a.r;
        i = f6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(a71.c cVar, Object obj) {
        g6 g6Var;
        int i;
        if (cVar instanceof g6) {
            g6Var = (g6) cVar;
            int i2 = g6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = g6Var.u;
                b71.a aVar = b71.a.r;
                i = g6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    dp dpVar = ((cp) obj).a.a;
                    n01.a aVar2 = new n01.a(false, dpVar != null && dpVar.a, false, false, false, false, false, false, false, 1021);
                    g6Var.v = 1;
                    if (this.s.c(aVar2, g6Var) == aVar) {
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
        g6Var = new g6(this, cVar);
        Object obj22 = g6Var.u;
        b71.a aVar3 = b71.a.r;
        i = g6Var.v;
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
        h6 h6Var;
        int i;
        if (cVar instanceof h6) {
            h6Var = (h6) cVar;
            int i2 = h6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = h6Var.u;
                b71.a aVar = b71.a.r;
                i = h6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    x61.rShadow<ws> rVar = ((us) obj).a.a.a;
                    if (rVar == null) {
                        rVar = x61.rShadow.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (ws wsVar : rVar) {
                        lu.a aVar2 = wsVar != null ? wsVar.c : null;
                        if (aVar2 != null) {
                            arrayList.add(aVar2);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj3 = arrayList.get(i3);
                        i3++;
                        arrayList2.add(v8.l0.k((lu.a) obj3));
                    }
                    h6Var.v = 1;
                    if (this.s.c(arrayList2, h6Var) == aVar) {
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
        h6Var = new h6(this, cVar);
        Object obj22 = h6Var.u;
        b71.a aVar3 = b71.a.r;
        i = h6Var.v;
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
        i6 i6Var;
        int i;
        j00.o oVar;
        j00.m mVar;
        if (cVar instanceof i6) {
            i6Var = (i6) cVar;
            int i2 = i6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = i6Var.u;
                b71.a aVar = b71.a.r;
                i = i6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    j00.n nVar = ((j00.l) obj).a;
                    Boolean valueOf = Boolean.valueOf((nVar == null || (oVar = nVar.b) == null || (mVar = oVar.a) == null) ? false : mVar.a);
                    i6Var.v = 1;
                    if (this.s.c(valueOf, i6Var) == aVar) {
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
        i6Var = new i6(this, cVar);
        Object obj22 = i6Var.u;
        b71.a aVar2 = b71.a.r;
        i = i6Var.v;
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
        j6 j6Var;
        int i;
        j00.g0 g0Var;
        j00.e0 e0Var;
        if (cVar instanceof j6) {
            j6Var = (j6) cVar;
            int i2 = j6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = j6Var.u;
                b71.a aVar = b71.a.r;
                i = j6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    j00.f0 f0Var = ((j00.d0) obj).a;
                    Boolean valueOf = Boolean.valueOf((f0Var == null || (g0Var = f0Var.b) == null || (e0Var = g0Var.a) == null) ? false : e0Var.a);
                    j6Var.v = 1;
                    if (this.s.c(valueOf, j6Var) == aVar) {
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
        j6Var = new j6(this, cVar);
        Object obj22 = j6Var.u;
        b71.a aVar2 = b71.a.r;
        i = j6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        k6 k6Var;
        int i;
        j00.m0 m0Var;
        j00.k0 k0Var;
        if (cVar instanceof k6) {
            k6Var = (k6) cVar;
            int i2 = k6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = k6Var.u;
                b71.a aVar = b71.a.r;
                i = k6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    j00.l0 l0Var = ((j00.j0) obj).a;
                    Boolean valueOf = Boolean.valueOf((l0Var == null || (m0Var = l0Var.b) == null || (k0Var = m0Var.a) == null) ? false : k0Var.a);
                    k6Var.v = 1;
                    if (this.s.c(valueOf, k6Var) == aVar) {
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
        k6Var = new k6(this, cVar);
        Object obj22 = k6Var.u;
        b71.a aVar2 = b71.a.r;
        i = k6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object j(a71.c cVar, Object obj) {
        l6 l6Var;
        int i;
        j00.s0 s0Var;
        j00.q0 q0Var;
        if (cVar instanceof l6) {
            l6Var = (l6) cVar;
            int i2 = l6Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l6Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l6Var.u;
                b71.a aVar = b71.a.r;
                i = l6Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    j00.r0Shadow r0Var = ((j00.p0) obj).a;
                    Boolean valueOf = Boolean.valueOf((r0Var == null || (s0Var = r0Var.b) == null || (q0Var = s0Var.a) == null) ? false : q0Var.a);
                    l6Var.v = 1;
                    if (this.s.c(valueOf, l6Var) == aVar) {
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
        l6Var = new l6(this, cVar);
        Object obj22 = l6Var.u;
        b71.a aVar2 = b71.a.r;
        i = l6Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x05eb  */
    /* JADX WARN: Removed duplicated region for block: B:413:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:483:0x06ed  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x06fb  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x075c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:540:0x07cc  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x07db  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x085f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x086d  */
    /* JADX WARN: Removed duplicated region for block: B:617:0x08c0  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x08ce  */
    /* JADX WARN: Removed duplicated region for block: B:638:0x0912  */
    /* JADX WARN: Removed duplicated region for block: B:644:0x0920  */
    /* JADX WARN: Removed duplicated region for block: B:655:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:661:0x0969  */
    /* JADX WARN: Removed duplicated region for block: B:681:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x09be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:704:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:710:0x0a14  */
    /* JADX WARN: Removed duplicated region for block: B:721:0x0a4f  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0a5d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        a5 a5Var;
        int i;
        rz.m0 m0Var;
        e5 e5Var;
        int i2;
        f5 f5Var;
        int i3;
        rz.v vVar;
        g5 g5Var;
        int i4;
        rz.y0Shadow y0Var;
        j5 j5Var;
        int i5;
        k5 k5Var;
        int i6;
        n5Shadow n5Var;
        int i7;
        py.n nVar;
        py.o oVar;
        py.m mVar;
        p5 p5Var;
        int i8;
        IssueOrPullRequestState issueOrPullRequestState;
        jo.o5 o5Var;
        jo.o5 o5Var2;
        q5 q5Var;
        int i9;
        hb hbVar;
        hb hbVar2;
        cb cbVar;
        r5 r5Var;
        int i11;
        h01.f fVar;
        pd pdVar;
        s5 s5Var;
        int i12;
        String str;
        yz0.x5 w5Var;
        rd rdVar;
        PullRequestMergeMethod pullRequestMergeMethod;
        vd vdVar;
        gv.a aVar;
        vd vdVar2;
        vd vdVar3;
        vd vdVar4;
        gv.a aVar2;
        t5 t5Var;
        int i13;
        fz.a aVar3;
        jo.s4 s4Var;
        List list;
        jo.s4 s4Var2;
        List list2;
        jo.o4 o4Var;
        u5 u5Var;
        int i14;
        MergeStateStatus mergeStateStatus;
        eo eoVar;
        ho hoVar;
        v5 v5Var;
        int i15;
        ev.c cVar2;
        ev.d dVar;
        w5 w5Var2;
        int i16;
        tz0.b bVar;
        ey.e eVar;
        ey.f fVar2;
        ArrayList arrayList;
        tz0.g gVar;
        List<ey.c> list3;
        tz0.c cVar3;
        String str2;
        String str3;
        uw.b bVar2;
        String str4;
        uw.a aVar4;
        y5 y5Var;
        int i17;
        ev.j jVar;
        gv.v8Shadow v8Var;
        yz0.q8 q8Var;
        List list4;
        gv.r8 r8Var;
        z5 z5Var;
        int i18;
        a6 a6Var;
        int i19;
        c6 c6Var;
        int i21;
        d6 d6Var;
        int i22;
        m6 m6Var;
        int i23;
        j00.e1 e1Var;
        j00.c1 c1Var;
        switch (this.r) {
            case 0:
                if (cVar instanceof a5) {
                    a5Var = (a5) cVar;
                    int i24 = a5Var.v;
                    if ((i24 & Integer.MIN_VALUE) != 0) {
                        a5Var.v = i24 - Integer.MIN_VALUE;
                        Object obj2 = a5Var.u;
                        b71.a aVar5 = b71.a.r;
                        i = a5Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            rz.p0 p0Var = ((rz.l0) obj).a;
                            Object j = in.rShadow.j((p0Var == null || (m0Var = p0Var.b.c) == null) ? null : m0Var.a, "Invalid owner or repository name", u1.A);
                            a5Var.v = 1;
                            if (this.s.c(j, a5Var) == aVar5) {
                                return aVar5;
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
                a5Var = new a5(this, cVar);
                Object obj22 = a5Var.u;
                b71.a aVar52 = b71.a.r;
                i = a5Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof e5) {
                    e5Var = (e5) cVar;
                    int i25 = e5Var.v;
                    if ((i25 & Integer.MIN_VALUE) != 0) {
                        e5Var.v = i25 - Integer.MIN_VALUE;
                        Object obj3 = e5Var.u;
                        b71.a aVar6 = b71.a.r;
                        i2 = e5Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            Boolean bool = (Boolean) ((w61.k) obj).s;
                            bool.getClass();
                            e5Var.v = 1;
                            if (this.s.c(bool, e5Var) == aVar6) {
                                return aVar6;
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
                e5Var = new e5(this, cVar);
                Object obj32 = e5Var.u;
                b71.a aVar62 = b71.a.r;
                i2 = e5Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof f5) {
                    f5Var = (f5) cVar;
                    int i26 = f5Var.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        f5Var.v = i26 - Integer.MIN_VALUE;
                        Object obj4 = f5Var.u;
                        b71.a aVar7 = b71.a.r;
                        i3 = f5Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            rz.xShadow xVar = ((rz.u) obj).a;
                            Object j2 = in.rShadow.j((xVar == null || (vVar = xVar.c) == null) ? null : vVar.b, "Invalid owner id", u1.B);
                            f5Var.v = 1;
                            if (this.s.c(j2, f5Var) == aVar7) {
                                return aVar7;
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
                f5Var = new f5(this, cVar);
                Object obj42 = f5Var.u;
                b71.a aVar72 = b71.a.r;
                i3 = f5Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof g5) {
                    g5Var = (g5) cVar;
                    int i27 = g5Var.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        g5Var.v = i27 - Integer.MIN_VALUE;
                        Object obj5 = g5Var.u;
                        b71.a aVar8 = b71.a.r;
                        i4 = g5Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            rz.a1 a1Var = ((rz.x0) obj).a;
                            l01.h0 h0Var = ((a1Var == null || (y0Var = a1Var.b) == null) ? null : y0Var.b) != null ? l01.h0.a : l01.h0.b;
                            g5Var.v = 1;
                            if (this.s.c(h0Var, g5Var) == aVar8) {
                                return aVar8;
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
                g5Var = new g5(this, cVar);
                Object obj52 = g5Var.u;
                b71.a aVar82 = b71.a.r;
                i4 = g5Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof j5) {
                    j5Var = (j5) cVar;
                    int i28 = j5Var.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        j5Var.v = i28 - Integer.MIN_VALUE;
                        Object obj6 = j5Var.u;
                        b71.a aVar9 = b71.a.r;
                        i5 = j5Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj6);
                            Boolean bool2 = (Boolean) ((w61.k) obj).s;
                            bool2.getClass();
                            j5Var.v = 1;
                            if (this.s.c(bool2, j5Var) == aVar9) {
                                return aVar9;
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
                j5Var = new j5(this, cVar);
                Object obj62 = j5Var.u;
                b71.a aVar92 = b71.a.r;
                i5 = j5Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof k5) {
                    k5Var = (k5) cVar;
                    int i29 = k5Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        k5Var.v = i29 - Integer.MIN_VALUE;
                        Object obj7 = k5Var.u;
                        b71.a aVar10 = b71.a.r;
                        i6 = k5Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj7);
                            rz.u0 u0Var = ((rz.s0) obj).a;
                            Object j3 = in.rShadow.j(u0Var != null ? u0Var.b : null, "Invalid owner or repository name", u1.C);
                            k5Var.v = 1;
                            if (this.s.c(j3, k5Var) == aVar10) {
                                return aVar10;
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
                k5Var = new k5(this, cVar);
                Object obj72 = k5Var.u;
                b71.a aVar102 = b71.a.r;
                i6 = k5Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof n5Shadow) {
                    n5Var = (n5Shadow) cVar;
                    int i31 = n5Var.v;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        n5Var.v = i31 - Integer.MIN_VALUE;
                        Object obj8 = n5Var.u;
                        b71.a aVar11 = b71.a.r;
                        i7 = n5Var.v;
                        if (i7 != 0) {
                            sy.y.j(obj8);
                            py.j jVar2 = (py.j) obj;
                            k71.k.g(jVar2, "<this>");
                            py.k kVar = jVar2.a;
                            i01.b R = (kVar == null || (nVar = kVar.a) == null || (oVar = nVar.b) == null || (mVar = oVar.d) == null) ? null : com.google.common.util.concurrent.a.R(mVar.c);
                            if (R != null) {
                                n5Var.v = 1;
                                if (this.s.c(R, n5Var) == aVar11) {
                                    return aVar11;
                                }
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
                n5Var = new n5Shadow(this, cVar);
                Object obj82 = n5Var.u;
                b71.a aVar112 = b71.a.r;
                i7 = n5Var.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof p5) {
                    p5Var = (p5) cVar;
                    int i32 = p5Var.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        p5Var.v = i32 - Integer.MIN_VALUE;
                        Object obj9 = p5Var.u;
                        b71.a aVar12 = b71.a.r;
                        i8 = p5Var.v;
                        if (i8 != 0) {
                            sy.y.j(obj9);
                            jo.n5Shadow n5Var2 = (jo.n5) obj;
                            k71.k.g(n5Var2, "<this>");
                            jo.l5 l5Var = n5Var2.a;
                            b00 b00Var = (l5Var == null || (o5Var2 = l5Var.a) == null) ? null : o5Var2.b;
                            int i33 = b00Var == null ? -1 : sy.b0.a[b00Var.ordinal()];
                            if (i33 == -1) {
                                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                            } else if (i33 == 1) {
                                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_OPEN;
                            } else if (i33 == 2) {
                                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_CLOSED;
                            } else if (i33 == 3) {
                                issueOrPullRequestState = IssueOrPullRequestState.PULL_REQUEST_MERGED;
                            } else {
                                if (i33 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
                            }
                            boolean z = false;
                            if (l5Var != null && (o5Var = l5Var.a) != null && o5Var.c) {
                                z = true;
                            }
                            yz0.a8 a8Var = new yz0.a8(issueOrPullRequestState, z);
                            p5Var.v = 1;
                            if (this.s.c(a8Var, p5Var) == aVar12) {
                                return aVar12;
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
                p5Var = new p5(this, cVar);
                Object obj92 = p5Var.u;
                b71.a aVar122 = b71.a.r;
                i8 = p5Var.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof q5) {
                    q5Var = (q5) cVar;
                    int i34 = q5Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        q5Var.v = i34 - Integer.MIN_VALUE;
                        Object obj10 = q5Var.u;
                        b71.a aVar13 = b71.a.r;
                        i9 = q5Var.v;
                        if (i9 != 0) {
                            sy.y.j(obj10);
                            fb fbVar = (fb) obj;
                            k71.k.g(fbVar, "<this>");
                            gb gbVar = fbVar.a;
                            yz0.v5 v5Var2 = new yz0.v5(new com.github.service.models.response.a((gbVar == null || (cbVar = gbVar.a) == null) ? "" : cbVar.b.b, (Avatar) null, (String) null, false, (String) null, 62));
                            boolean z2 = false;
                            boolean z3 = (gbVar == null || (hbVar2 = gbVar.b) == null) ? false : hbVar2.b;
                            if (gbVar != null && (hbVar = gbVar.b) != null) {
                                z2 = hbVar.c;
                            }
                            yz0.c1 c1Var2 = new yz0.c1(v5Var2, z3, z2);
                            q5Var.v = 1;
                            if (this.s.c(c1Var2, q5Var) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                q5Var = new q5(this, cVar);
                Object obj102 = q5Var.u;
                b71.a aVar132 = b71.a.r;
                i9 = q5Var.v;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof r5) {
                    r5Var = (r5) cVar;
                    int i35 = r5Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        r5Var.v = i35 - Integer.MIN_VALUE;
                        Object obj11 = r5Var.u;
                        b71.a aVar14 = b71.a.r;
                        i11 = r5Var.v;
                        if (i11 != 0) {
                            sy.y.j(obj11);
                            nd ndVar = ((md) obj).a;
                            if (ndVar == null || (pdVar = ndVar.a) == null) {
                                fVar = null;
                            } else {
                                gv.w3 w3Var = pdVar.b.c;
                                gv.v3 v3Var = w3Var.c;
                                fVar = new h01.f(v3Var.c.b, w3Var.b, v3Var.b);
                            }
                            if (fVar != null) {
                                r5Var.v = 1;
                                if (this.s.c(fVar, r5Var) == aVar14) {
                                    return aVar14;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                r5Var = new r5(this, cVar);
                Object obj112 = r5Var.u;
                b71.a aVar142 = b71.a.r;
                i11 = r5Var.v;
                if (i11 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof s5) {
                    s5Var = (s5) cVar;
                    int i36 = s5Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        s5Var.v = i36 - Integer.MIN_VALUE;
                        Object obj12 = s5Var.u;
                        b71.a aVar15 = b71.a.r;
                        i12 = s5Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj12);
                            td tdVar = (td) obj;
                            k71.k.g(tdVar, "<this>");
                            ud udVar = tdVar.a;
                            PullRequestMergeMethod G = (udVar == null || (vdVar4 = udVar.b) == null || (aVar2 = vdVar4.c.d) == null) ? null : w8.s.G(aVar2.a);
                            int i37 = G == null ? -1 : sy.d.a[G.ordinal()];
                            str = "";
                            if (i37 == -1 || i37 == 1 || i37 == 2) {
                                if (udVar != null && (rdVar = udVar.a) != null) {
                                    str = rdVar.b;
                                }
                                w5Var = new yz0.w5(new com.github.service.models.response.a(str, (Avatar) null, (String) null, false, (String) null, 62));
                            } else if (i37 == 3) {
                                rd rdVar2 = udVar.a;
                                w5Var = new yz0.y5(new com.github.service.models.response.a(rdVar2 != null ? rdVar2.b : "", (Avatar) null, (String) null, false, (String) null, 62));
                            } else {
                                if (i37 != 4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                rd rdVar3 = udVar.a;
                                w5Var = new yz0.x5(new com.github.service.models.response.a(rdVar3 != null ? rdVar3.b : "", (Avatar) null, (String) null, false, (String) null, 62));
                            }
                            boolean z4 = false;
                            boolean z5 = (udVar == null || (vdVar3 = udVar.b) == null || !vdVar3.c.c) ? false : true;
                            if (udVar != null && (vdVar2 = udVar.b) != null && vdVar2.c.b) {
                                z4 = true;
                            }
                            if (udVar == null || (vdVar = udVar.b) == null || (aVar = vdVar.c.d) == null || (pullRequestMergeMethod = w8.s.G(aVar.a)) == null) {
                                pullRequestMergeMethod = PullRequestMergeMethod.UNKNOWN__;
                            }
                            yz0.e1 e1Var2 = new yz0.e1(w5Var, z5, z4, pullRequestMergeMethod);
                            s5Var.v = 1;
                            if (this.s.c(e1Var2, s5Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                s5Var = new s5(this, cVar);
                Object obj122 = s5Var.u;
                b71.a aVar152 = b71.a.r;
                i12 = s5Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof t5) {
                    t5Var = (t5) cVar;
                    int i38 = t5Var.v;
                    if ((i38 & Integer.MIN_VALUE) != 0) {
                        t5Var.v = i38 - Integer.MIN_VALUE;
                        Object obj13 = t5Var.u;
                        b71.a aVar16 = b71.a.r;
                        i13 = t5Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj13);
                            jo.m4 m4Var = (jo.m4) obj;
                            jo.q4 q4Var = m4Var.a;
                            jo.w4 w4Var = (q4Var == null || (s4Var2 = q4Var.c) == null || (list2 = s4Var2.b.a) == null || (o4Var = (jo.o4) x61.m.f0(list2)) == null) ? null : o4Var.a.b;
                            jo.q4 q4Var2 = m4Var.a;
                            ArrayList<jo.n4> S = (q4Var2 == null || (s4Var = q4Var2.c) == null || (list = s4Var.a.b) == null) ? null : x61.m.S(list);
                            ArrayList<jo.p4> arrayList2 = x61.rShadow.r;
                            if (S == null) {
                                S = arrayList2;
                            }
                            ArrayList arrayList3 = new ArrayList(x61.n.F(S, 10));
                            for (jo.n4 n4Var : S) {
                                k71.k.g(n4Var, "requiredStatusCheck");
                                String str5 = n4Var.a;
                                String str6 = n4Var.b;
                                MergeCheckStatus d = b31.b.d(com.google.android.gms.internal.measurement.b4.o0(n4Var.c));
                                String str7 = n4Var.d;
                                arrayList3.add(new fz.a(str5, str6, null, d, "", "", str7 == null ? "" : str7, Boolean.TRUE, null));
                            }
                            if (w4Var != null) {
                                List list5 = w4Var.b.b;
                                ArrayList S2 = list5 != null ? x61.m.S(list5) : null;
                                if (S2 != null) {
                                    arrayList2 = S2;
                                }
                                ArrayList arrayList4 = new ArrayList();
                                for (jo.p4 p4Var : arrayList2) {
                                    jo.r4 r4Var = p4Var.c;
                                    if (r4Var != null) {
                                        String str8 = r4Var.a;
                                        String str9 = r4Var.c;
                                        jo.h4 h4Var = r4Var.g;
                                        jo.y4 y4Var = h4Var.a;
                                        String str10 = y4Var != null ? y4Var.a.a : null;
                                        m10.t3 t3Var = r4Var.b;
                                        if (t3Var == null) {
                                            t3Var = m10.t3.t;
                                        }
                                        MergeCheckStatus e = b31.b.e(t3Var);
                                        String str11 = r4Var.e;
                                        jo.g4 g4Var = h4Var.b;
                                        String str12 = g4Var != null ? g4Var.a : "";
                                        String str13 = r4Var.d;
                                        aVar3 = new fz.a(str8, str9, str10, e, str11, str12, str13 == null ? "" : str13, Boolean.valueOf(r4Var.h), Integer.valueOf(r4Var.f));
                                    } else {
                                        jo.t4 t4Var = p4Var.b;
                                        if (t4Var != null) {
                                            String str14 = t4Var.a;
                                            String str15 = t4Var.b;
                                            MergeCheckStatus d2 = b31.b.d(com.google.android.gms.internal.measurement.b4.o0(t4Var.c));
                                            String str16 = t4Var.f;
                                            String str17 = str16 == null ? "" : str16;
                                            String str18 = t4Var.d;
                                            String str19 = str18 == null ? "" : str18;
                                            String str20 = t4Var.e;
                                            aVar3 = new fz.a(str14, str15, null, d2, str17, str19, str20 == null ? "" : str20, Boolean.valueOf(t4Var.g), null);
                                        } else {
                                            aVar3 = null;
                                        }
                                    }
                                    if (aVar3 != null) {
                                        arrayList4.add(aVar3);
                                    }
                                }
                                arrayList2 = arrayList4;
                            }
                            ArrayList l0 = x61.m.l0(arrayList2, arrayList3);
                            HashSet hashSet = new HashSet();
                            ArrayList arrayList5 = new ArrayList();
                            int size = l0.size();
                            int i39 = 0;
                            while (i39 < size) {
                                Object obj14 = l0.get(i39);
                                i39++;
                                if (hashSet.add(((fz.a) obj14).b)) {
                                    arrayList5.add(obj14);
                                }
                            }
                            h01.d dVar2 = new h01.d(arrayList5, new x01.i(w4Var != null ? w4Var.b.a.b : null, w4Var != null ? w4Var.b.a.a : false, false));
                            t5Var.v = 1;
                            if (this.s.c(dVar2, t5Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                t5Var = new t5(this, cVar);
                Object obj132 = t5Var.u;
                b71.a aVar162 = b71.a.r;
                i13 = t5Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof u5) {
                    u5Var = (u5) cVar;
                    int i41 = u5Var.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        u5Var.v = i41 - Integer.MIN_VALUE;
                        Object obj15 = u5Var.u;
                        b71.a aVar17 = b71.a.r;
                        i14 = u5Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj15);
                            io ioVar = ((co) obj).a;
                            if (ioVar == null || (eoVar = ioVar.b) == null || (hoVar = eoVar.b) == null || (mergeStateStatus = k21.f.L(hoVar.c)) == null) {
                                mergeStateStatus = MergeStateStatus.UNKNOWN;
                            }
                            u5Var.v = 1;
                            if (this.s.c(mergeStateStatus, u5Var) == aVar17) {
                                return aVar17;
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
                u5Var = new u5(this, cVar);
                Object obj152 = u5Var.u;
                b71.a aVar172 = b71.a.r;
                i14 = u5Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof v5) {
                    v5Var = (v5) cVar;
                    int i42 = v5Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        v5Var.v = i42 - Integer.MIN_VALUE;
                        Object obj16 = v5Var.u;
                        b71.a aVar18 = b71.a.r;
                        i15 = v5Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj16);
                            ev.e eVar2 = ((ev.b) obj).a;
                            String str21 = (eVar2 == null || (cVar2 = eVar2.b) == null || (dVar = cVar2.b) == null) ? null : dVar.a;
                            if (str21 != null) {
                                v5Var.v = 1;
                                if (this.s.c(str21, v5Var) == aVar18) {
                                    return aVar18;
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
                v5Var = new v5(this, cVar);
                Object obj162 = v5Var.u;
                b71.a aVar182 = b71.a.r;
                i15 = v5Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof w5) {
                    w5Var2 = (w5) cVar;
                    int i43 = w5Var2.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        w5Var2.v = i43 - Integer.MIN_VALUE;
                        Object obj17 = w5Var2.u;
                        b71.a aVar19 = b71.a.r;
                        i16 = w5Var2.v;
                        if (i16 != 0) {
                            sy.y.j(obj17);
                            ey.b bVar3 = (ey.b) obj;
                            k71.k.g(bVar3, "<this>");
                            ey.d dVar3 = bVar3.a;
                            if (dVar3 == null || (eVar = dVar3.c) == null || (fVar2 = eVar.b) == null) {
                                bVar = null;
                            } else {
                                ey.g gVar2 = fVar2.a;
                                if (gVar2 == null || (list3 = gVar2.a) == null) {
                                    arrayList = null;
                                } else {
                                    ArrayList arrayList6 = new ArrayList();
                                    for (ey.c cVar4 : list3) {
                                        if (cVar4 != null) {
                                            uw.d dVar4 = cVar4.c;
                                            String str22 = dVar4.a;
                                            String str23 = dVar4.b;
                                            Integer valueOf = Integer.valueOf(dVar4.c);
                                            ZonedDateTime zonedDateTime = dVar4.d;
                                            boolean z6 = dVar4.e;
                                            String str24 = dVar4.f;
                                            tz0.d Q = y41.t1.Q(dVar4.g);
                                            String str25 = dVar4.h;
                                            String str26 = dVar4.i;
                                            String str27 = dVar4.j;
                                            uw.c cVar5 = dVar4.k;
                                            if (cVar5 != null && (aVar4 = cVar5.b) != null) {
                                                str4 = aVar4.a;
                                            } else if (cVar5 == null || (bVar2 = cVar5.c) == null) {
                                                str2 = str26;
                                                str3 = null;
                                                cVar3 = new tz0.c(str22, str23, valueOf, zonedDateTime, z6, str24, Q, str25, str2, str27, str3);
                                            } else {
                                                str4 = bVar2.a;
                                            }
                                            str3 = str4;
                                            str2 = str26;
                                            cVar3 = new tz0.c(str22, str23, valueOf, zonedDateTime, z6, str24, Q, str25, str2, str27, str3);
                                        } else {
                                            cVar3 = null;
                                        }
                                        if (cVar3 != null) {
                                            arrayList6.add(cVar3);
                                        }
                                    }
                                    arrayList = arrayList6;
                                }
                                if (arrayList == null) {
                                    arrayList = x61.rShadow.r;
                                }
                                ey.h hVar = fVar2.b;
                                switch (hVar.a.ordinal()) {
                                    case 0:
                                        gVar = tz0.g.r;
                                        break;
                                    case 1:
                                        gVar = tz0.g.s;
                                        break;
                                    case 2:
                                        gVar = tz0.g.t;
                                        break;
                                    case 3:
                                        gVar = tz0.g.u;
                                        break;
                                    case 4:
                                        gVar = tz0.g.v;
                                        break;
                                    case 5:
                                        gVar = tz0.g.w;
                                        break;
                                    case 6:
                                        gVar = tz0.g.x;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                ArrayList arrayList7 = hVar.b;
                                ArrayList arrayList8 = new ArrayList(x61.n.F(arrayList7, 10));
                                int size2 = arrayList7.size();
                                int i44 = 0;
                                while (i44 < size2) {
                                    Object obj18 = arrayList7.get(i44);
                                    i44++;
                                    ey.i iVar = (ey.i) obj18;
                                    arrayList8.add(new tz0.a(y41.t1.Q(iVar.b), iVar.a));
                                }
                                bVar = new tz0.b(arrayList, new tz0.f(gVar, arrayList8));
                            }
                            if (bVar != null) {
                                w5Var2.v = 1;
                                if (this.s.c(bVar, w5Var2) == aVar19) {
                                    return aVar19;
                                }
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
                w5Var2 = new w5(this, cVar);
                Object obj172 = w5Var2.u;
                b71.a aVar192 = b71.a.r;
                i16 = w5Var2.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof y5) {
                    y5Var = (y5) cVar;
                    int i45 = y5Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        y5Var.v = i45 - Integer.MIN_VALUE;
                        Object obj19 = y5Var.u;
                        b71.a aVar20 = b71.a.r;
                        i17 = y5Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj19);
                            ev.i iVar2 = ((ev.h) obj).a;
                            yz0.q8 q8Var2 = null;
                            if (iVar2 != null && (jVar = iVar2.c) != null) {
                                gv.x8 x8Var = jVar.b;
                                boolean z7 = x8Var.b;
                                gv.u8 u8Var = x8Var.d;
                                int i46 = (u8Var == null || (list4 = u8Var.a) == null || (r8Var = (gv.r8) x61.m.f0(list4)) == null) ? 0 : r8Var.b.a;
                                gv.w8Shadow w8Var = x8Var.c;
                                if (w8Var != null && (v8Var = w8Var.b) != null) {
                                    gv.t8 t8Var = v8Var.b;
                                    if (t8Var != null) {
                                        q8Var = new yz0.q8(t8Var.c, t8Var.d, t8Var.e);
                                    } else {
                                        gv.s8 s8Var = v8Var.c;
                                        if (s8Var != null) {
                                            q8Var = new yz0.q8(s8Var.c, s8Var.d, false);
                                        }
                                    }
                                    q8Var2 = q8Var;
                                }
                                q8Var2 = new m01.b(z7, i46, q8Var2);
                            }
                            if (q8Var2 != null) {
                                y5Var.v = 1;
                                if (this.s.c(q8Var2, y5Var) == aVar20) {
                                    return aVar20;
                                }
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                y5Var = new y5(this, cVar);
                Object obj192 = y5Var.u;
                b71.a aVar202 = b71.a.r;
                i17 = y5Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof z5) {
                    z5Var = (z5) cVar;
                    int i47 = z5Var.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        z5Var.v = i47 - Integer.MIN_VALUE;
                        Object obj20 = z5Var.u;
                        b71.a aVar21 = b71.a.r;
                        i18 = z5Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj20);
                            yz0.y7 d3 = sy.c0.d((ve0) obj);
                            z5Var.v = 1;
                            if (this.s.c(d3, z5Var) == aVar21) {
                                return aVar21;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return w61.a0.a;
                    }
                }
                z5Var = new z5(this, cVar);
                Object obj202 = z5Var.u;
                b71.a aVar212 = b71.a.r;
                i18 = z5Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof a6) {
                    a6Var = (a6) cVar;
                    int i48 = a6Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        a6Var.v = i48 - Integer.MIN_VALUE;
                        Object obj21 = a6Var.u;
                        b71.a aVar22 = b71.a.r;
                        i19 = a6Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj21);
                            yz0.y7 d4 = sy.c0.d((ve0) obj);
                            a6Var.v = 1;
                            if (this.s.c(d4, a6Var) == aVar22) {
                                return aVar22;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                a6Var = new a6(this, cVar);
                Object obj212 = a6Var.u;
                b71.a aVar222 = b71.a.r;
                i19 = a6Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 18:
                return a(cVar, obj);
            case 19:
                if (cVar instanceof c6) {
                    c6Var = (c6) cVar;
                    int i49 = c6Var.v;
                    if ((i49 & Integer.MIN_VALUE) != 0) {
                        c6Var.v = i49 - Integer.MIN_VALUE;
                        Object obj23 = c6Var.u;
                        b71.a aVar23 = b71.a.r;
                        i21 = c6Var.v;
                        w61.a0Shadow a0Var = w61.a0.a;
                        if (i21 != 0) {
                            sy.y.j(obj23);
                            c6Var.v = 1;
                            if (this.s.c(a0Var, c6Var) == aVar23) {
                                return aVar23;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return a0Var;
                    }
                }
                c6Var = new c6(this, cVar);
                Object obj232 = c6Var.u;
                b71.a aVar232 = b71.a.r;
                i21 = c6Var.v;
                w61.a0Shadow a0Var2 = w61.a0.a;
                if (i21 != 0) {
                }
                return a0Var2;
            case 20:
                if (cVar instanceof d6) {
                    d6Var = (d6) cVar;
                    int i51 = d6Var.v;
                    if ((i51 & Integer.MIN_VALUE) != 0) {
                        d6Var.v = i51 - Integer.MIN_VALUE;
                        Object obj24 = d6Var.u;
                        b71.a aVar24 = b71.a.r;
                        i22 = d6Var.v;
                        w61.a0Shadow a0Var3 = w61.a0.a;
                        if (i22 != 0) {
                            sy.y.j(obj24);
                            d6Var.v = 1;
                            if (this.s.c(a0Var3, d6Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj24);
                        }
                        return a0Var3;
                    }
                }
                d6Var = new d6(this, cVar);
                Object obj242 = d6Var.u;
                b71.a aVar242 = b71.a.r;
                i22 = d6Var.v;
                w61.a0Shadow a0Var32 = w61.a0.a;
                if (i22 != 0) {
                }
                return a0Var32;
            case 21:
                return b(cVar, obj);
            case 22:
                return d(cVar, obj);
            case 23:
                return e(cVar, obj);
            case 24:
                return f(cVar, obj);
            case 25:
                return g(cVar, obj);
            case 26:
                return h(cVar, obj);
            case 27:
                return i(cVar, obj);
            case 28:
                return j(cVar, obj);
            default:
                if (cVar instanceof m6) {
                    m6Var = (m6) cVar;
                    int i52 = m6Var.v;
                    if ((i52 & Integer.MIN_VALUE) != 0) {
                        m6Var.v = i52 - Integer.MIN_VALUE;
                        Object obj25 = m6Var.u;
                        b71.a aVar25 = b71.a.r;
                        i23 = m6Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj25);
                            j00.d1 d1Var = ((j00.b1) obj).a;
                            Boolean valueOf2 = Boolean.valueOf((d1Var == null || (e1Var = d1Var.b) == null || (c1Var = e1Var.b) == null) ? false : c1Var.a);
                            m6Var.v = 1;
                            if (this.s.c(valueOf2, m6Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i23 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj25);
                        }
                        return w61.a0.a;
                    }
                }
                m6Var = new m6(this, cVar);
                Object obj252 = m6Var.u;
                b71.a aVar252 = b71.a.r;
                i23 = m6Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
        }
    }
}
