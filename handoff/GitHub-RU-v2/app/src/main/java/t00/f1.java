package t00;

import android.graphics.Color;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import com.github.service.models.response.Entry;
import com.github.service.models.response.Language;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.SpokenLanguage;
import com.github.service.models.response.discussions.PinnedDiscussionPatternState;
import com.github.service.models.response.home.NavLinkIdentifier;
import com.github.service.models.response.type.RepositoryRecommendationReason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.a90;
import jo.ac0;
import jo.ag;
import jo.b90;
import jo.bi;
import jo.c90;
import jo.cc0;
import jo.d70;
import jo.d90;
import jo.dc0;
import jo.di;
import jo.dj;
import jo.e70;
import jo.e90;
import jo.ei;
import jo.ex;
import jo.fi;
import jo.fx;
import jo.gp;
import jo.gx;
import jo.hx;
import jo.ip;
import jo.ix;
import jo.ji;
import jo.jp;
import jo.jx;
import jo.kb;
import jo.ke;
import jo.kp;
import jo.le;
import jo.lg;
import jo.lj;
import jo.lp;
import jo.mb;
import jo.mg;
import jo.mj;
import jo.mp;
import jo.ng;
import jo.ob;
import jo.oe;
import jo.og;
import jo.oh0;
import jo.pg;
import jo.pq;
import jo.rb;
import jo.re;
import jo.sb;
import jo.sq;
import jo.t80;
import jo.tf;
import jo.tq;
import jo.u80;
import jo.ub;
import jo.uf;
import jo.uq;
import jo.v80;
import jo.vc;
import jo.vf;
import jo.w80;
import jo.wb;
import jo.wc;
import jo.wd0;
import jo.wf;
import jo.wq;
import jo.x80;
import jo.xb;
import jo.xc;
import jo.xd0;
import jo.xf;
import jo.xg0;
import jo.y80;
import jo.yb;
import jo.yd0;
import jo.yf;
import jo.yg0;
import jo.z80;
import jo.zb;
import jo.zf;
import jo.zg0;
import jo.zq;
import kotlin.NoWhenBranchMatchedException;
import m10.ks;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f1Shadow implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;

    public /* synthetic */ f1(y71.j jVar, int i) {
        this.r = i;
        this.s = jVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object a(a71.c cVar, Object obj) {
        l2 l2Var;
        int i;
        x61.r rVar;
        yz0.o oVar;
        Object next;
        if (cVar instanceof l2) {
            l2Var = (l2) cVar;
            int i2 = l2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l2Var.u;
                b71.a aVar = b71.a.r;
                i = l2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    jo.q5 q5Var = ((jo.s5) obj).a;
                    jo.v5 v5Var = q5Var.a;
                    int i3 = 0;
                    x01.i iVar = new x01.i(v5Var.b, v5Var.a, false);
                    List<jo.u5> list = q5Var.b;
                    if (list != null) {
                        x61.r arrayList = new ArrayList();
                        for (jo.u5 u5Var : list) {
                            if (u5Var != null) {
                                ArrayList arrayList2 = u5Var.d;
                                String str = u5Var.b;
                                jo.t5 t5Var = u5Var.a;
                                Language language = new Language(t5Var != null ? t5Var.b : "", t5Var != null ? t5Var.a : null);
                                int i4 = u5Var.c;
                                ArrayList arrayList3 = new ArrayList();
                                int size = arrayList2.size();
                                int i5 = i3;
                                while (i5 < size) {
                                    Object obj3 = arrayList2.get(i5);
                                    i5++;
                                    jo.w5 w5Var = (jo.w5) obj3;
                                    ArrayList arrayList4 = arrayList3;
                                    yz0.p e = w5Var.e > 0.0d ? y41.t1.e(w5Var) : null;
                                    if (e != null) {
                                        arrayList4.add(e);
                                    }
                                    arrayList3 = arrayList4;
                                }
                                Object x0 = x61.m.x0(arrayList3, 4);
                                if (x0.isEmpty()) {
                                    List x02 = x61.m.x0(arrayList2, 4);
                                    x0 = new ArrayList(x61.n.F(x02, 10));
                                    Iterator it = x02.iterator();
                                    while (it.hasNext()) {
                                        x0.add(y41.t1.e((jo.w5) it.next()));
                                    }
                                }
                                List list2 = x0;
                                List x03 = x61.m.x0(arrayList2, 16);
                                ArrayList arrayList5 = new ArrayList(x61.n.F(x03, 10));
                                Iterator it2 = x03.iterator();
                                while (it2.hasNext()) {
                                    arrayList5.add(y41.t1.e((jo.w5) it2.next()));
                                }
                                Iterator it3 = x61.m.x0(arrayList2, 16).iterator();
                                if (it3.hasNext()) {
                                    next = it3.next();
                                    if (it3.hasNext()) {
                                        int i6 = ((jo.w5) next).b;
                                        do {
                                            Object next2 = it3.next();
                                            int i7 = ((jo.w5) next2).b;
                                            if (i6 < i7) {
                                                next = next2;
                                                i6 = i7;
                                            }
                                        } while (it3.hasNext());
                                    }
                                } else {
                                    next = null;
                                }
                                jo.w5 w5Var2 = (jo.w5) next;
                                oVar = new yz0.o(str, language, w5Var2 != null ? w5Var2.b : 0, i4, list2, arrayList5);
                            } else {
                                oVar = null;
                            }
                            if (oVar != null) {
                                arrayList.add(oVar);
                            }
                            i3 = 0;
                        }
                        rVar = arrayList;
                    } else {
                        rVar = null;
                    }
                    if (rVar == null) {
                        rVar = x61.r.r;
                    }
                    w61.k kVar = new w61.k(iVar, rVar);
                    l2Var.v = 1;
                    if (this.s.c(kVar, l2Var) == aVar) {
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
        l2Var = new l2(this, cVar);
        Object obj22 = l2Var.u;
        b71.a aVar2 = b71.a.r;
        i = l2Var.v;
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
        p2 p2Var;
        int i;
        if (cVar instanceof p2) {
            p2Var = (p2) cVar;
            int i2 = p2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = p2Var.u;
                b71.a aVar = b71.a.r;
                i = p2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    bi biVar = ((di) obj).a;
                    fi fiVar = biVar.a;
                    x01.i iVar = new x01.i(fiVar.b, fiVar.a, false);
                    List<ei> list = biVar.b;
                    x61.r rVar = null;
                    if (list != null) {
                        x61.r arrayList = new ArrayList();
                        for (ei eiVar : list) {
                            yz0.t1 k = eiVar != null ? b41.b.k(eiVar.b) : null;
                            if (k != null) {
                                arrayList.add(k);
                            }
                        }
                        rVar = arrayList;
                    }
                    if (rVar == null) {
                        rVar = x61.r.r;
                    }
                    w61.k kVar = new w61.k(iVar, rVar);
                    p2Var.v = 1;
                    if (this.s.c(kVar, p2Var) == aVar) {
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
        p2Var = new p2(this, cVar);
        Object obj22 = p2Var.u;
        b71.a aVar2 = b71.a.r;
        i = p2Var.v;
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
        r2 r2Var;
        int i;
        ArrayList arrayList;
        if (cVar instanceof r2) {
            r2Var = (r2) cVar;
            int i2 = r2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = r2Var.u;
                b71.a aVar = b71.a.r;
                i = r2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    qx.a aVar2 = ((oh0) obj).a.c.a;
                    if (aVar2 != null) {
                        ArrayList arrayList2 = aVar2.a;
                        ArrayList arrayList3 = new ArrayList(x61.n.F(arrayList2, 10));
                        int size = arrayList2.size();
                        int i3 = 0;
                        int i4 = 0;
                        while (i4 < size) {
                            Object obj3 = arrayList2.get(i4);
                            i4++;
                            qx.b bVar = (qx.b) obj3;
                            k71.k.g(bVar, "<this>");
                            arrayList3.add(new g01.d(aa1.b.O(bVar.a), bVar.b));
                        }
                        arrayList = new ArrayList();
                        int size2 = arrayList3.size();
                        while (i3 < size2) {
                            Object obj4 = arrayList3.get(i3);
                            i3++;
                            if (((g01.d) obj4).a != NavLinkIdentifier.UNKNOWN__) {
                                arrayList.add(obj4);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    if (arrayList != null) {
                        r2Var.v = 1;
                        if (this.s.c(arrayList, r2Var) == aVar) {
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
        r2Var = new r2(this, cVar);
        Object obj22 = r2Var.u;
        b71.a aVar3 = b71.a.r;
        i = r2Var.v;
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
        s2 s2Var;
        int i;
        dw.t5 t5Var;
        if (cVar instanceof s2) {
            s2Var = (s2) cVar;
            int i2 = s2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = s2Var.u;
                b71.a aVar = b71.a.r;
                i = s2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    x61.r<qx.h> rVar = ((zq) obj).a.c.a.a;
                    if (rVar == null) {
                        rVar = x61.r.r;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (qx.h hVar : rVar) {
                        SimpleRepository I = (hVar == null || (t5Var = hVar.c) == null) ? null : sy.n.I(t5Var);
                        if (I != null) {
                            arrayList.add(I);
                        }
                    }
                    s2Var.v = 1;
                    if (this.s.c(arrayList, s2Var) == aVar) {
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
        s2Var = new s2(this, cVar);
        Object obj22 = s2Var.u;
        b71.a aVar2 = b71.a.r;
        i = s2Var.v;
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
        t2 t2Var;
        int i;
        if (cVar instanceof t2) {
            t2Var = (t2) cVar;
            int i2 = t2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = t2Var.u;
                b71.a aVar = b71.a.r;
                i = t2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    g01.a c = a.a.c((dj) obj);
                    t2Var.v = 1;
                    if (this.s.c(c, t2Var) == aVar) {
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
        t2Var = new t2(this, cVar);
        Object obj22 = t2Var.u;
        b71.a aVar2 = b71.a.r;
        i = t2Var.v;
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
        u2 u2Var;
        int i;
        if (cVar instanceof u2) {
            u2Var = (u2) cVar;
            int i2 = u2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = u2Var.u;
                b71.a aVar = b71.a.r;
                i = u2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    g01.a c = a.a.c((dj) obj);
                    u2Var.v = 1;
                    if (this.s.c(c, u2Var) == aVar) {
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
        u2Var = new u2(this, cVar);
        Object obj22 = u2Var.u;
        b71.a aVar2 = b71.a.r;
        i = u2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object h(a71.c cVar, Object obj) {
        v2 v2Var;
        int i;
        ArrayList arrayList;
        List<yg0> list;
        if (cVar instanceof v2) {
            v2Var = (v2) cVar;
            int i2 = v2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = v2Var.u;
                b71.a aVar = b71.a.r;
                i = v2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    xg0 xg0Var = (xg0) obj;
                    k71.k.g(xg0Var, "<this>");
                    zg0 zg0Var = xg0Var.a;
                    if (zg0Var == null || (list = zg0Var.a) == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
                        for (yg0 yg0Var : list) {
                            arrayList2.add(new g01.d(aa1.b.O(yg0Var.a), yg0Var.b));
                        }
                        arrayList = new ArrayList();
                        int size = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList2.get(i3);
                            i3++;
                            if (((g01.d) obj3).a != NavLinkIdentifier.UNKNOWN__) {
                                arrayList.add(obj3);
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = x61.r.r;
                    }
                    v2Var.v = 1;
                    if (this.s.c(arrayList, v2Var) == aVar) {
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
        v2Var = new v2(this, cVar);
        Object obj22 = v2Var.u;
        b71.a aVar2 = b71.a.r;
        i = v2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object i(a71.c cVar, Object obj) {
        w2 w2Var;
        int i;
        u80 u80Var;
        z80 z80Var;
        d90 d90Var;
        a90 a90Var;
        u80 u80Var2;
        z80 z80Var2;
        d90 d90Var2;
        x80 x80Var;
        u80 u80Var3;
        z80 z80Var3;
        d90 d90Var3;
        a90 a90Var2;
        List list;
        v80 v80Var;
        b90 b90Var;
        u80 u80Var4;
        w80 w80Var;
        e90 e90Var;
        y80 y80Var;
        if (cVar instanceof w2) {
            w2Var = (w2) cVar;
            int i2 = w2Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w2Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = w2Var.u;
                b71.a aVar = b71.a.r;
                i = w2Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    t80 t80Var = (t80) obj;
                    c90 c90Var = t80Var.a;
                    z01.e0 e0Var = null;
                    String str = (c90Var == null || (u80Var4 = c90Var.b) == null || (w80Var = u80Var4.b) == null || (e90Var = w80Var.a) == null || (y80Var = e90Var.b) == null) ? null : y80Var.a;
                    String str2 = (c90Var == null || (u80Var3 = c90Var.b) == null || (z80Var3 = u80Var3.c) == null || (d90Var3 = z80Var3.b) == null || (a90Var2 = d90Var3.c) == null || (list = a90Var2.b.a) == null || (v80Var = (v80) x61.m.W(list)) == null || (b90Var = v80Var.a) == null) ? null : b90Var.a;
                    c90 c90Var2 = t80Var.a;
                    String str3 = (c90Var2 == null || (u80Var2 = c90Var2.b) == null || (z80Var2 = u80Var2.c) == null || (d90Var2 = z80Var2.b) == null || (x80Var = d90Var2.b) == null) ? null : x80Var.a;
                    String str4 = (c90Var2 == null || (u80Var = c90Var2.b) == null || (z80Var = u80Var.c) == null || (d90Var = z80Var.b) == null || (a90Var = d90Var.c) == null) ? null : a90Var.a;
                    if (str2 == null || str4 == null) {
                        if (str == null) {
                            str = str2 == null ? str3 : str2;
                        }
                        if (str != null) {
                            e0Var = new z01.d0(str);
                        }
                    } else {
                        e0Var = new z01.e0(str4, str2);
                    }
                    if (e0Var == null) {
                        throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Could not fetch time line id for given url.", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                    }
                    w2Var.v = 1;
                    if (this.s.c(e0Var, w2Var) == aVar) {
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
        w2Var = new w2(this, cVar);
        Object obj22 = w2Var.u;
        b71.a aVar2 = b71.a.r;
        i = w2Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0598  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0608  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0678  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0686  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x06ca  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0782  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x07d7  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x0877  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x087a  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x0886  */
    /* JADX WARN: Removed duplicated region for block: B:565:0x0889  */
    /* JADX WARN: Removed duplicated region for block: B:567:0x0871 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:599:0x08df  */
    /* JADX WARN: Removed duplicated region for block: B:623:0x0934  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:651:0x0993  */
    /* JADX WARN: Removed duplicated region for block: B:657:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:672:0x09e1  */
    /* JADX WARN: Removed duplicated region for block: B:678:0x09f0  */
    /* JADX WARN: Removed duplicated region for block: B:709:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:715:0x0a8e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        e1 e1Var;
        int i;
        xc xcVar;
        g1 g1Var;
        int i2;
        h1Shadow h1Var;
        int i3;
        i1 i1Var;
        int i4;
        xb xbVar;
        ub ubVar;
        j1 j1Var;
        int i5;
        lp lpVar;
        jp jpVar;
        gp gpVar;
        k1 k1Var;
        int i6;
        ks ksVar;
        int i7;
        int i8;
        int i9;
        PinnedDiscussionPatternState pinnedDiscussionPatternState;
        o1 o1Var;
        int i11;
        np.l lVar;
        r1 r1Var;
        int i12;
        ms.g gVar;
        ac0 ac0Var;
        ac0 ac0Var2;
        t1 t1Var;
        int i13;
        w1Shadow w1Var;
        int i14;
        x1 x1Var;
        int i15;
        a2 a2Var;
        int i16;
        String str;
        int i17;
        x61.r rVar;
        b2 b2Var;
        int i18;
        c2 c2Var;
        int i19;
        d2 d2Var;
        int i21;
        dw.t5 t5Var;
        yd0 yd0Var;
        f2 f2Var;
        int i22;
        yz0.j1 j1Var2;
        zf zfVar;
        wf wfVar;
        uf ufVar;
        vf vfVar;
        g2 g2Var;
        int i23;
        ng ngVar;
        og ogVar;
        mg mgVar;
        h2 h2Var;
        int i24;
        gx gxVar;
        i2 i2Var;
        int i25;
        m2 m2Var;
        int i26;
        Boolean bool;
        o2 o2Var;
        int i27;
        x2 x2Var;
        int i28;
        h01.q e;
        zx.u1 u1Var;
        zx.u1 u1Var2;
        switch (this.r) {
            case 0:
                if (cVar instanceof e1) {
                    e1Var = (e1) cVar;
                    int i29 = e1Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        e1Var.v = i29 - Integer.MIN_VALUE;
                        Object obj2 = e1Var.u;
                        b71.a aVar = b71.a.r;
                        i = e1Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            wc wcVar = ((vc) obj).a;
                            is.p0 p0Var = (wcVar == null || (xcVar = wcVar.c) == null) ? null : xcVar.b;
                            if (p0Var == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            b01.b d = sy.f0.d(p0Var);
                            e1Var.v = 1;
                            if (this.s.c(d, e1Var) == aVar) {
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
                e1Var = new e1(this, cVar);
                Object obj22 = e1Var.u;
                b71.a aVar2 = b71.a.r;
                i = e1Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof g1) {
                    g1Var = (g1) cVar;
                    int i31 = g1Var.v;
                    if ((i31 & Integer.MIN_VALUE) != 0) {
                        g1Var.v = i31 - Integer.MIN_VALUE;
                        Object obj3 = g1Var.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = g1Var.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            kb kbVar = (kb) obj;
                            ob obVar = kbVar.a;
                            List list = obVar != null ? obVar.b.b : null;
                            if (list == null) {
                                list = x61.r.r;
                            }
                            ArrayList S = x61.m.S(list);
                            ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                            int size = S.size();
                            int i32 = 0;
                            while (i32 < size) {
                                Object obj4 = S.get(i32);
                                i32++;
                                arrayList.add(sy.a0.d(((mb) obj4).c));
                            }
                            ob obVar2 = kbVar.a;
                            b01.d dVar = new b01.d(obVar2 != null ? obVar2.a : null, arrayList, new x01.i(obVar2 != null ? obVar2.b.a.b : null, obVar2 != null ? obVar2.b.a.a : false, false));
                            g1Var.v = 1;
                            if (this.s.c(dVar, g1Var) == aVar3) {
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
                g1Var = new g1(this, cVar);
                Object obj32 = g1Var.u;
                b71.a aVar32 = b71.a.r;
                i2 = g1Var.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 2:
                if (cVar instanceof h1Shadow) {
                    h1Var = (h1Shadow) cVar;
                    int i33 = h1Var.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        h1Var.v = i33 - Integer.MIN_VALUE;
                        Object obj5 = h1Var.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = h1Var.v;
                        if (i3 != 0) {
                            sy.y.j(obj5);
                            sb sbVar = ((rb) obj).a;
                            b01.e d2 = sbVar != null ? sy.a0.d(sbVar.c) : null;
                            h1Var.v = 1;
                            if (this.s.c(d2, h1Var) == aVar4) {
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
                h1Var = new h1Shadow(this, cVar);
                Object obj52 = h1Var.u;
                b71.a aVar42 = b71.a.r;
                i3 = h1Var.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof i1) {
                    i1Var = (i1) cVar;
                    int i34 = i1Var.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        i1Var.v = i34 - Integer.MIN_VALUE;
                        Object obj6 = i1Var.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = i1Var.v;
                        if (i4 != 0) {
                            sy.y.j(obj6);
                            zb zbVar = ((wb) obj).a;
                            if (zbVar != null && (xbVar = zbVar.b) != null && (ubVar = xbVar.b) != null) {
                                String str2 = ubVar.a;
                                yb ybVar = ubVar.b;
                                r2 = new b01.h(str2, ybVar != null ? ybVar.a : null);
                            }
                            if (r2 != null) {
                                i1Var.v = 1;
                                if (this.s.c(r2, i1Var) == aVar5) {
                                    return aVar5;
                                }
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
                i1Var = new i1(this, cVar);
                Object obj62 = i1Var.u;
                b71.a aVar52 = b71.a.r;
                i4 = i1Var.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof j1) {
                    j1Var = (j1) cVar;
                    int i35 = j1Var.v;
                    if ((i35 & Integer.MIN_VALUE) != 0) {
                        j1Var.v = i35 - Integer.MIN_VALUE;
                        Object obj7 = j1Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = j1Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj7);
                            kp kpVar = ((ip) obj).a;
                            if (kpVar != null && (lpVar = kpVar.a) != null && (jpVar = lpVar.b) != null && (gpVar = jpVar.a) != null) {
                                String str3 = gpVar.a;
                                mp mpVar = gpVar.b;
                                r2 = new b01.h(str3, mpVar != null ? mpVar.a : null);
                            }
                            if (r2 != null) {
                                j1Var.v = 1;
                                if (this.s.c(r2, j1Var) == aVar6) {
                                    return aVar6;
                                }
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
                j1Var = new j1(this, cVar);
                Object obj72 = j1Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = j1Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 5:
                if (cVar instanceof k1) {
                    k1Var = (k1) cVar;
                    int i36 = k1Var.v;
                    if ((i36 & Integer.MIN_VALUE) != 0) {
                        k1Var.v = i36 - Integer.MIN_VALUE;
                        Object obj8 = k1Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = k1Var.v;
                        int i37 = 1;
                        if (i6 != 0) {
                            sy.y.j(obj8);
                            wq wqVar = ((sq) obj).a;
                            List list2 = wqVar != null ? wqVar.b.a : null;
                            if (list2 == null) {
                                list2 = x61.r.r;
                            }
                            ArrayList S2 = x61.m.S(list2);
                            ArrayList arrayList2 = new ArrayList(x61.n.F(S2, 10));
                            int size2 = S2.size();
                            int i38 = 0;
                            while (i38 < size2) {
                                Object obj9 = S2.get(i38);
                                i38++;
                                uq uqVar = (uq) obj9;
                                k71.k.g(uqVar, "<this>");
                                String str4 = uqVar.a;
                                tq tqVar = uqVar.b;
                                int i39 = tqVar.a;
                                pq pqVar = tqVar.c;
                                com.github.service.models.response.a e2 = v8.l0.e(pqVar != null ? pqVar.b : null);
                                String str5 = tqVar.b;
                                String str6 = tqVar.d.a;
                                ks ksVar2 = uqVar.c;
                                ArrayList arrayList3 = uqVar.d;
                                ArrayList arrayList4 = S2;
                                try {
                                    ksVar = ksVar2;
                                    try {
                                        i7 = Color.parseColor("#" + x61.m.W(arrayList3));
                                    } catch (Exception unused) {
                                        arrayList3.toString();
                                        i7 = -16777216;
                                        i8 = size2;
                                        try {
                                            i9 = Color.parseColor("#" + x61.m.f0(arrayList3));
                                        } catch (Exception unused2) {
                                            arrayList3.toString();
                                            i9 = -1;
                                            switch (ksVar.ordinal()) {
                                            }
                                            arrayList2.add(new b01.p(str4, i39, e2, str5, str6, new b01.n(i7, i9, pinnedDiscussionPatternState)));
                                            S2 = arrayList4;
                                            size2 = i8;
                                            i37 = 1;
                                        }
                                        switch (ksVar.ordinal()) {
                                        }
                                        arrayList2.add(new b01.p(str4, i39, e2, str5, str6, new b01.n(i7, i9, pinnedDiscussionPatternState)));
                                        S2 = arrayList4;
                                        size2 = i8;
                                        i37 = 1;
                                    }
                                } catch (Exception unused3) {
                                    ksVar = ksVar2;
                                }
                                try {
                                    i8 = size2;
                                    i9 = Color.parseColor("#" + x61.m.f0(arrayList3));
                                } catch (Exception unused4) {
                                    i8 = size2;
                                }
                                switch (ksVar.ordinal()) {
                                    case 0:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.CHEVRON_UP;
                                        break;
                                    case 1:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.DOT;
                                        break;
                                    case 2:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.DOT_FILL;
                                        break;
                                    case 3:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.HEART_FILL;
                                        break;
                                    case 4:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.PLUS;
                                        break;
                                    case 5:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.ZAP;
                                        break;
                                    case 6:
                                        pinnedDiscussionPatternState = PinnedDiscussionPatternState.UNKNOWN__;
                                        break;
                                    default:
                                        throw new NoWhenBranchMatchedException();
                                }
                                arrayList2.add(new b01.p(str4, i39, e2, str5, str6, new b01.n(i7, i9, pinnedDiscussionPatternState)));
                                S2 = arrayList4;
                                size2 = i8;
                                i37 = 1;
                            }
                            k1Var.v = i37;
                            if (this.s.c(arrayList2, k1Var) == aVar7) {
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
                k1Var = new k1(this, cVar);
                Object obj82 = k1Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = k1Var.v;
                int i372 = 1;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof o1) {
                    o1Var = (o1) cVar;
                    int i41 = o1Var.v;
                    if ((i41 & Integer.MIN_VALUE) != 0) {
                        o1Var.v = i41 - Integer.MIN_VALUE;
                        Object obj10 = o1Var.u;
                        b71.a aVar8 = b71.a.r;
                        i11 = o1Var.v;
                        if (i11 != 0) {
                            sy.y.j(obj10);
                            np.m mVar = ((np.k) obj).a;
                            b01.f e3 = (mVar == null || (lVar = mVar.a) == null) ? null : sy.f0.e(lVar.c);
                            if (e3 != null) {
                                o1Var.v = 1;
                                if (this.s.c(e3, o1Var) == aVar8) {
                                    return aVar8;
                                }
                            }
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                o1Var = new o1(this, cVar);
                Object obj102 = o1Var.u;
                b71.a aVar82 = b71.a.r;
                i11 = o1Var.v;
                if (i11 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof r1) {
                    r1Var = (r1) cVar;
                    int i42 = r1Var.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        r1Var.v = i42 - Integer.MIN_VALUE;
                        Object obj11 = r1Var.u;
                        b71.a aVar9 = b71.a.r;
                        i12 = r1Var.v;
                        if (i12 != 0) {
                            sy.y.j(obj11);
                            dc0 dc0Var = ((cc0) obj).a;
                            String str7 = null;
                            ar.c cVar2 = (dc0Var == null || (ac0Var2 = dc0Var.a) == null) ? null : ac0Var2.c.j;
                            pv.c cVar3 = (dc0Var == null || (ac0Var = dc0Var.a) == null) ? null : ac0Var.d;
                            if (cVar2 == null || cVar3 == null) {
                                throw new ApiFailure(ApiFailureType.PARSE_ERROR, "Invalid server response.", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
                            }
                            ac0 ac0Var3 = dc0Var.a;
                            ms.i iVar = ac0Var3.c;
                            String str8 = iVar.c;
                            ju.a aVar10 = iVar.l;
                            ms.o oVar = ac0Var3.e;
                            boolean z = iVar.d;
                            boolean z2 = iVar.e;
                            boolean z3 = iVar.f;
                            boolean z4 = iVar.g;
                            ms.h hVar = iVar.i;
                            if (hVar != null && (gVar = hVar.c) != null) {
                                str7 = gVar.b;
                            }
                            String str9 = str7;
                            is.i1 i1Var2 = iVar.m;
                            pu.a aVar11 = iVar.k;
                            b01.g d3 = sy.d0.d(cVar2, str8, cVar3, aVar10, oVar, z, z2, z3, z4, str9, false, i1Var2, aVar11.b, aVar11.c, sy.d0.E(iVar));
                            r1Var.v = 1;
                            if (this.s.c(d3, r1Var) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj11);
                        }
                        return w61.a0.a;
                    }
                }
                r1Var = new r1(this, cVar);
                Object obj112 = r1Var.u;
                b71.a aVar92 = b71.a.r;
                i12 = r1Var.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof t1) {
                    t1Var = (t1) cVar;
                    int i43 = t1Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        t1Var.v = i43 - Integer.MIN_VALUE;
                        Object obj12 = t1Var.u;
                        b71.a aVar12 = b71.a.r;
                        i13 = t1Var.v;
                        if (i13 != 0) {
                            sy.y.j(obj12);
                            qp.f fVar = ((qp.c) obj).a;
                            Object j = in.r.j(fVar != null ? fVar.c : null, "Invalid draft issue Id", u1.s);
                            t1Var.v = 1;
                            if (this.s.c(j, t1Var) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                t1Var = new t1(this, cVar);
                Object obj122 = t1Var.u;
                b71.a aVar122 = b71.a.r;
                i13 = t1Var.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof w1Shadow) {
                    w1Var = (w1Shadow) cVar;
                    int i44 = w1Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        w1Var.v = i44 - Integer.MIN_VALUE;
                        Object obj13 = w1Var.u;
                        b71.a aVar13 = b71.a.r;
                        i14 = w1Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj13);
                            lj ljVar = (lj) obj;
                            k71.k.g(ljVar, "<this>");
                            ArrayList arrayList5 = ljVar.a;
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList5.size();
                            int i45 = 0;
                            while (i45 < size3) {
                                Object obj14 = arrayList5.get(i45);
                                i45++;
                                mj mjVar = (mj) obj14;
                                Language language = mjVar != null ? new Language(mjVar.a, mjVar.b) : null;
                                if (language != null) {
                                    arrayList6.add(language);
                                }
                            }
                            w1Var.v = 1;
                            if (this.s.c(arrayList6, w1Var) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                w1Var = new w1Shadow(this, cVar);
                Object obj132 = w1Var.u;
                b71.a aVar132 = b71.a.r;
                i14 = w1Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof x1) {
                    x1Var = (x1) cVar;
                    int i46 = x1Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        x1Var.v = i46 - Integer.MIN_VALUE;
                        Object obj15 = x1Var.u;
                        b71.a aVar14 = b71.a.r;
                        i15 = x1Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj15);
                            d70 d70Var = (d70) obj;
                            k71.k.g(d70Var, "<this>");
                            ArrayList arrayList7 = d70Var.a;
                            ArrayList arrayList8 = new ArrayList();
                            int size4 = arrayList7.size();
                            int i47 = 0;
                            while (i47 < size4) {
                                Object obj16 = arrayList7.get(i47);
                                i47++;
                                e70 e70Var = (e70) obj16;
                                SpokenLanguage spokenLanguage = e70Var != null ? new SpokenLanguage(e70Var.a, e70Var.b) : null;
                                if (spokenLanguage != null) {
                                    arrayList8.add(spokenLanguage);
                                }
                            }
                            x1Var.v = 1;
                            if (this.s.c(arrayList8, x1Var) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                x1Var = new x1(this, cVar);
                Object obj152 = x1Var.u;
                b71.a aVar142 = b71.a.r;
                i15 = x1Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof a2) {
                    a2Var = (a2) cVar;
                    int i48 = a2Var.v;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        a2Var.v = i48 - Integer.MIN_VALUE;
                        Object obj17 = a2Var.u;
                        b71.a aVar15 = b71.a.r;
                        i16 = a2Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj17);
                            ke keVar = (ke) obj;
                            k71.k.g(keVar, "<this>");
                            oe oeVar = keVar.a;
                            x61.r rVar2 = oeVar != null ? oeVar.b.a : null;
                            x61.r rVar3 = x61.r.r;
                            if (rVar2 == null) {
                                rVar2 = rVar3;
                            }
                            ArrayList S3 = x61.m.S(rVar2);
                            ArrayList arrayList9 = new ArrayList(x61.n.F(S3, 10));
                            int size5 = S3.size();
                            int i49 = 0;
                            while (i49 < size5) {
                                Object obj18 = S3.get(i49);
                                i49++;
                                le leVar = (le) obj18;
                                dw.m3 m3Var = leVar.d;
                                RepositoryRecommendationReason repositoryRecommendationReason = RepositoryRecommendationReason.UNKNOWN__;
                                int i51 = leVar.b;
                                String str10 = m3Var.c;
                                dw.l3 l3Var = m3Var.i;
                                dw.j3 j3Var = m3Var.h;
                                com.github.service.models.response.a aVar16 = new com.github.service.models.response.a(j3Var.c, w8.s.A(j3Var.d), (String) null, false, (String) null, 60);
                                String str11 = m3Var.d;
                                if (l3Var != null) {
                                    try {
                                        str = l3Var.a;
                                    } catch (Exception unused5) {
                                        i17 = -16777216;
                                    }
                                } else {
                                    str = null;
                                }
                                i17 = Color.parseColor(str);
                                int i52 = i17;
                                String str12 = l3Var != null ? l3Var.b : null;
                                String str13 = m3Var.b;
                                dw.o5 o5Var = m3Var.r;
                                boolean z5 = o5Var.d;
                                int i53 = o5Var.c;
                                ArrayList arrayList10 = S3;
                                String str14 = (m3Var.j || m3Var.l) ? m3Var.k : null;
                                String str15 = m3Var.e;
                                List<dw.h3> list3 = m3Var.q.a;
                                if (list3 != null) {
                                    x61.r arrayList11 = new ArrayList();
                                    for (dw.h3 h3Var : list3) {
                                        String str16 = str13;
                                        String str17 = h3Var != null ? h3Var.b : null;
                                        if (str17 != null) {
                                            arrayList11.add(str17);
                                        }
                                        str13 = str16;
                                    }
                                    rVar = arrayList11;
                                } else {
                                    rVar = rVar3;
                                }
                                arrayList9.add(new d01.c(str10, aVar16, str11, i52, str12, str13, z5, i53, str14, i51, str15, rVar, repositoryRecommendationReason));
                                S3 = arrayList10;
                            }
                            x01.i.Companion.getClass();
                            d01.a aVar17 = new d01.a(arrayList9);
                            a2Var.v = 1;
                            if (this.s.c(aVar17, a2Var) == aVar15) {
                                return aVar15;
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
                a2Var = new a2(this, cVar);
                Object obj172 = a2Var.u;
                b71.a aVar152 = b71.a.r;
                i16 = a2Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof b2) {
                    b2Var = (b2) cVar;
                    int i54 = b2Var.v;
                    if ((i54 & Integer.MIN_VALUE) != 0) {
                        b2Var.v = i54 - Integer.MIN_VALUE;
                        Object obj19 = b2Var.u;
                        b71.a aVar18 = b71.a.r;
                        i18 = b2Var.v;
                        if (i18 != 0) {
                            sy.y.j(obj19);
                            ArrayList t = sy.f0.t((re) obj);
                            b2Var.v = 1;
                            if (this.s.c(t, b2Var) == aVar18) {
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
                b2Var = new b2(this, cVar);
                Object obj192 = b2Var.u;
                b71.a aVar182 = b71.a.r;
                i18 = b2Var.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof c2) {
                    c2Var = (c2) cVar;
                    int i55 = c2Var.v;
                    if ((i55 & Integer.MIN_VALUE) != 0) {
                        c2Var.v = i55 - Integer.MIN_VALUE;
                        Object obj20 = c2Var.u;
                        b71.a aVar19 = b71.a.r;
                        i19 = c2Var.v;
                        if (i19 != 0) {
                            sy.y.j(obj20);
                            ArrayList t2 = sy.f0.t((re) obj);
                            c2Var.v = 1;
                            if (this.s.c(t2, c2Var) == aVar19) {
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
                c2Var = new c2(this, cVar);
                Object obj202 = c2Var.u;
                b71.a aVar192 = b71.a.r;
                i19 = c2Var.v;
                if (i19 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof d2) {
                    d2Var = (d2) cVar;
                    int i56 = d2Var.v;
                    if ((i56 & Integer.MIN_VALUE) != 0) {
                        d2Var.v = i56 - Integer.MIN_VALUE;
                        Object obj21 = d2Var.u;
                        b71.a aVar20 = b71.a.r;
                        i21 = d2Var.v;
                        if (i21 != 0) {
                            sy.y.j(obj21);
                            xd0 xd0Var = ((wd0) obj).a;
                            List<qx.h> list4 = (xd0Var == null || (yd0Var = xd0Var.a) == null) ? null : yd0Var.c.a.a;
                            if (list4 == null) {
                                list4 = x61.r.r;
                            }
                            ArrayList arrayList12 = new ArrayList();
                            for (qx.h hVar2 : list4) {
                                SimpleRepository I = (hVar2 == null || (t5Var = hVar2.c) == null) ? null : sy.n.I(t5Var);
                                if (I != null) {
                                    arrayList12.add(I);
                                }
                            }
                            d2Var.v = 1;
                            if (this.s.c(arrayList12, d2Var) == aVar20) {
                                return aVar20;
                            }
                        } else {
                            if (i21 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                d2Var = new d2(this, cVar);
                Object obj212 = d2Var.u;
                b71.a aVar202 = b71.a.r;
                i21 = d2Var.v;
                if (i21 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof f2) {
                    f2Var = (f2) cVar;
                    int i57 = f2Var.v;
                    if ((i57 & Integer.MIN_VALUE) != 0) {
                        f2Var.v = i57 - Integer.MIN_VALUE;
                        Object obj23 = f2Var.u;
                        b71.a aVar21 = b71.a.r;
                        i22 = f2Var.v;
                        if (i22 != 0) {
                            sy.y.j(obj23);
                            ag agVar = ((tf) obj).a;
                            if (agVar == null || (zfVar = agVar.b) == null || (wfVar = zfVar.c) == null || (ufVar = wfVar.b) == null || (vfVar = ufVar.b) == null) {
                                j1Var2 = null;
                            } else {
                                String str18 = agVar.a;
                                yf yfVar = vfVar.c;
                                if (yfVar != null) {
                                    j1Var2 = new yz0.j1(yfVar.a, str18);
                                } else {
                                    xf xfVar = vfVar.b;
                                    j1Var2 = xfVar != null ? new yz0.h1(xfVar.a, str18) : yz0.k1.a;
                                }
                            }
                            if (j1Var2 != null) {
                                f2Var.v = 1;
                                if (this.s.c(j1Var2, f2Var) == aVar21) {
                                    return aVar21;
                                }
                            }
                        } else {
                            if (i22 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj23);
                        }
                        return w61.a0.a;
                    }
                }
                f2Var = new f2(this, cVar);
                Object obj232 = f2Var.u;
                b71.a aVar212 = b71.a.r;
                i22 = f2Var.v;
                if (i22 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof g2) {
                    g2Var = (g2) cVar;
                    int i58 = g2Var.v;
                    if ((i58 & Integer.MIN_VALUE) != 0) {
                        g2Var.v = i58 - Integer.MIN_VALUE;
                        Object obj24 = g2Var.u;
                        b71.a aVar22 = b71.a.r;
                        i23 = g2Var.v;
                        if (i23 != 0) {
                            sy.y.j(obj24);
                            pg pgVar = ((lg) obj).a;
                            String str19 = (pgVar == null || (ngVar = pgVar.b) == null || (ogVar = ngVar.c) == null || (mgVar = ogVar.b) == null) ? null : mgVar.a;
                            Boolean valueOf = Boolean.valueOf(!(str19 == null || str19.length() == 0));
                            g2Var.v = 1;
                            if (this.s.c(valueOf, g2Var) == aVar22) {
                                return aVar22;
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
                g2Var = new g2(this, cVar);
                Object obj242 = g2Var.u;
                b71.a aVar222 = b71.a.r;
                i23 = g2Var.v;
                if (i23 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof h2) {
                    h2Var = (h2) cVar;
                    int i59 = h2Var.v;
                    if ((i59 & Integer.MIN_VALUE) != 0) {
                        h2Var.v = i59 - Integer.MIN_VALUE;
                        Object obj25 = h2Var.u;
                        b71.a aVar23 = b71.a.r;
                        i24 = h2Var.v;
                        if (i24 != 0) {
                            sy.y.j(obj25);
                            ix ixVar = ((ex) obj).a;
                            hx hxVar = (ixVar == null || (gxVar = ixVar.a) == null) ? null : gxVar.b;
                            if (hxVar != null) {
                                h2Var.v = 1;
                                if (this.s.c(hxVar, h2Var) == aVar23) {
                                    return aVar23;
                                }
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
                h2Var = new h2(this, cVar);
                Object obj252 = h2Var.u;
                b71.a aVar232 = b71.a.r;
                i24 = h2Var.v;
                if (i24 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof i2) {
                    i2Var = (i2) cVar;
                    int i61 = i2Var.v;
                    if ((i61 & Integer.MIN_VALUE) != 0) {
                        i2Var.v = i61 - Integer.MIN_VALUE;
                        Object obj26 = i2Var.u;
                        b71.a aVar24 = b71.a.r;
                        i25 = i2Var.v;
                        if (i25 != 0) {
                            sy.y.j(obj26);
                            x61.r<fx> rVar4 = ((hx) obj).a;
                            if (rVar4 == null) {
                                rVar4 = x61.r.r;
                            }
                            ArrayList arrayList13 = new ArrayList(x61.n.F(rVar4, 10));
                            for (fx fxVar : rVar4) {
                                String str20 = fxVar.a;
                                String str21 = fxVar.b;
                                int i62 = fxVar.c;
                                jx jxVar = fxVar.d;
                                arrayList13.add(new yz0.f1(i62, str20, str21, jxVar != null ? jxVar.a : ""));
                            }
                            List v0 = x61.m.v0(arrayList13, new j2(0));
                            ArrayList arrayList14 = new ArrayList();
                            ArrayList arrayList15 = new ArrayList();
                            ArrayList arrayList16 = new ArrayList();
                            for (Object obj27 : v0) {
                                Entry.EntryType entryType = ((yz0.f1) obj27).e;
                                if (entryType == Entry.EntryType.TREE) {
                                    arrayList14.add(obj27);
                                } else if (entryType == Entry.EntryType.COMMIT) {
                                    arrayList15.add(obj27);
                                } else {
                                    arrayList16.add(obj27);
                                }
                            }
                            ArrayList l0 = x61.m.l0(x61.m.l0(arrayList14, arrayList16), arrayList15);
                            i2Var.v = 1;
                            if (this.s.c(l0, i2Var) == aVar24) {
                                return aVar24;
                            }
                        } else {
                            if (i25 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj26);
                        }
                        return w61.a0.a;
                    }
                }
                i2Var = new i2(this, cVar);
                Object obj262 = i2Var.u;
                b71.a aVar242 = b71.a.r;
                i25 = i2Var.v;
                if (i25 != 0) {
                }
                return w61.a0.a;
            case 19:
                return a(cVar, obj);
            case 20:
                if (cVar instanceof m2) {
                    m2Var = (m2) cVar;
                    int i63 = m2Var.v;
                    if ((i63 & Integer.MIN_VALUE) != 0) {
                        m2Var.v = i63 - Integer.MIN_VALUE;
                        Object obj28 = m2Var.u;
                        b71.a aVar25 = b71.a.r;
                        i26 = m2Var.v;
                        if (i26 != 0) {
                            sy.y.j(obj28);
                            jo.y yVar = ((jo.a0) obj).a;
                            Boolean valueOf2 = Boolean.valueOf((yVar == null || (bool = yVar.a) == null) ? false : bool.booleanValue());
                            m2Var.v = 1;
                            if (this.s.c(valueOf2, m2Var) == aVar25) {
                                return aVar25;
                            }
                        } else {
                            if (i26 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj28);
                        }
                        return w61.a0.a;
                    }
                }
                m2Var = new m2(this, cVar);
                Object obj282 = m2Var.u;
                b71.a aVar252 = b71.a.r;
                i26 = m2Var.v;
                if (i26 != 0) {
                }
                return w61.a0.a;
            case 21:
                if (cVar instanceof o2) {
                    o2Var = (o2) cVar;
                    int i64 = o2Var.v;
                    if ((i64 & Integer.MIN_VALUE) != 0) {
                        o2Var.v = i64 - Integer.MIN_VALUE;
                        Object obj29 = o2Var.u;
                        b71.a aVar26 = b71.a.r;
                        i27 = o2Var.v;
                        if (i27 != 0) {
                            sy.y.j(obj29);
                            fz.e eVar = new fz.e((ji) obj);
                            o2Var.v = 1;
                            if (this.s.c(eVar, o2Var) == aVar26) {
                                return aVar26;
                            }
                        } else {
                            if (i27 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj29);
                        }
                        return w61.a0.a;
                    }
                }
                o2Var = new o2(this, cVar);
                Object obj292 = o2Var.u;
                b71.a aVar262 = b71.a.r;
                i27 = o2Var.v;
                if (i27 != 0) {
                }
                return w61.a0.a;
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
                if (cVar instanceof x2) {
                    x2Var = (x2) cVar;
                    int i65 = x2Var.v;
                    if ((i65 & Integer.MIN_VALUE) != 0) {
                        x2Var.v = i65 - Integer.MIN_VALUE;
                        Object obj30 = x2Var.u;
                        b71.a aVar27 = b71.a.r;
                        i28 = x2Var.v;
                        if (i28 != 0) {
                            sy.y.j(obj30);
                            zx.x1 x1Var2 = ((zx.t1) obj).a;
                            zx.w1Shadow w1Var2 = null;
                            if (((x1Var2 == null || (u1Var2 = x1Var2.b) == null) ? null : u1Var2.b) != null) {
                                ct.j0 j0Var = x1Var2.b.b.c;
                                String str22 = j0Var.b;
                                ct.i0 i0Var = j0Var.c;
                                int i66 = i0Var.b;
                                List f = w8.s.f(i0Var);
                                ct.h0 h0Var = i0Var.c;
                                e = new h01.q(str22, i66, f, h0Var.a, h0Var.b, h0Var.c, h0Var.d);
                            } else {
                                if (x1Var2 != null && (u1Var = x1Var2.b) != null) {
                                    w1Var2 = u1Var.c;
                                }
                                e = w1Var2 != null ? w8.s.e(x1Var2.b.c.c) : iz.c.a;
                            }
                            x2Var.v = 1;
                            if (this.s.c(e, x2Var) == aVar27) {
                                return aVar27;
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
                x2Var = new x2(this, cVar);
                Object obj302 = x2Var.u;
                b71.a aVar272 = b71.a.r;
                i28 = x2Var.v;
                if (i28 != 0) {
                }
                return w61.a0.a;
        }
    }

    public f1(y71.j jVar, r3 r3Var) {
        this.r = 28;
        this.s = jVar;
    }
}
