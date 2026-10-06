package rm0;

import com.github.service.models.response.type.SubscriptionState;
import gn0.kw;
import hc0.ev;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jn0.ae0;
import jn0.be0;
import jn0.ce0;
import jn0.d60;
import jn0.g90;
import jn0.yf0;
import jn0.zd0;
import jo.m80;
import jo.mi0;
import jo.ng0;
import jo.og0;
import jo.pg0;
import jo.qg0;
import jo.ub0;
import kc0.aa0;
import kc0.ba0;
import kc0.ca0;
import kc0.j50;
import kc0.k20;
import kc0.yb0;
import kc0.z90;
import kotlin.NoWhenBranchMatchedException;
import m10.ya0;
import pz0.f40;
import u10.a80;
import u10.b80;
import u10.c80;
import u10.l30;
import u10.m00;
import u10.y90;
import u10.z70;
import ub.a;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y9 implements z01.k1, yb0, mi0, y90, yf0 {
    public final /* synthetic */ int r;
    public final com.github.service.wrapper.bShadow s;
    public final v71.v t;

    public y9(com.github.service.wrapper.bShadow bVar, v71.v vVar, int i) {
        this.r = i;
        switch (i) {
            case 1:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            case 2:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            case 3:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
            default:
                k71.k.g(bVar, "cachedClient");
                k71.k.g(vVar, "ioDispatcher");
                this.s = bVar;
                this.t = vVar;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150  */
    @Override // z01.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ub.a aVar, a71.c cVar) {
        w9 w9Var;
        int i;
        w61.k kVar;
        gn0.j6 j6Var;
        ca0 ca0Var;
        com.github.service.wrapper.bShadow bVar;
        c71.c r9Var;
        int i2;
        w61.k kVar2;
        m10.ia iaVar;
        qg0 qg0Var;
        com.github.service.wrapper.bShadow bVar2;
        vb0.l7 l7Var;
        int i3;
        w61.k kVar3;
        hc0.z5 z5Var;
        c80 c80Var;
        com.github.service.wrapper.bShadow bVar3;
        wy0.t8 t8Var;
        int i4;
        w61.k kVar4;
        pz0.e7 e7Var;
        ce0 ce0Var;
        com.github.service.wrapper.bShadow bVar4;
        switch (this.r) {
            case 0:
                if (cVar instanceof w9) {
                    w9Var = (w9) cVar;
                    int i5 = w9Var.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        w9Var.y = i5 - Integer.MIN_VALUE;
                        Object obj = w9Var.w;
                        Object obj2 = b71.a.r;
                        i = w9Var.y;
                        if (i != 0) {
                            sy.y.j(obj);
                            Object obj3 = x61.r.r;
                            if (aVar == null) {
                                kVar = new w61.k(kw.x, obj3);
                            } else if (aVar instanceof a.e) {
                                kVar = new w61.k(kw.x, obj3);
                            } else if (aVar instanceof a.d) {
                                kVar = new w61.k(kw.w, obj3);
                            } else if (aVar instanceof a.c) {
                                kVar = new w61.k(kw.u, obj3);
                            } else {
                                boolean z = aVar instanceof a.a;
                                if (!z) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                kw kwVar = kw.t;
                                if (z) {
                                    Set set = ((a.a) aVar).a;
                                    ArrayList arrayList = new ArrayList(x61.n.F(set, 10));
                                    Iterator it = set.iterator();
                                    while (it.hasNext()) {
                                        int ordinal = ((a.b) it.next()).ordinal();
                                        if (ordinal == 0) {
                                            j6Var = gn0.j6.u;
                                        } else if (ordinal == 1) {
                                            j6Var = gn0.j6.v;
                                        } else if (ordinal == 2) {
                                            j6Var = gn0.j6.w;
                                        } else if (ordinal == 3) {
                                            j6Var = gn0.j6.t;
                                        } else {
                                            if (ordinal != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            j6Var = gn0.j6.x;
                                        }
                                        arrayList.add(j6Var);
                                    }
                                    obj3 = x61.m.F0(arrayList);
                                }
                                kVar = new w61.k(kwVar, obj3);
                            }
                            kw kwVar2 = (kw) kVar.r;
                            List list = (List) kVar.s;
                            ca0 ca0Var2 = new ca0(str, kwVar2, list == null ? aa.t0.d : new aa.u0(list));
                            com.github.service.wrapper.bShadow bVar5 = this.s;
                            w9Var.u = bVar5;
                            w9Var.v = ca0Var2;
                            w9Var.y = 1;
                            obj = e(str, kwVar2, list, w9Var);
                            if (obj == obj2) {
                                return obj2;
                            }
                            ca0Var = ca0Var2;
                            bVar = bVar5;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ca0Var = w9Var.v;
                            bVar = w9Var.u;
                            sy.y.j(obj);
                        }
                        return y71.n1.y(new d5(new y00.l(in.r.h(bVar.k(ca0Var, (aa.m0) obj)), 10), 29), this.t);
                    }
                }
                w9Var = new w9(this, (c71.c) cVar);
                Object obj4 = w9Var.w;
                Object obj22 = b71.a.r;
                i = w9Var.y;
                if (i != 0) {
                }
                return y71.n1.y(new d5(new y00.l(in.r.h(bVar.k(ca0Var, (aa.m0) obj4)), 10), 29), this.t);
            case 1:
                if (cVar instanceof t00.r9) {
                    r9Var = (t00.r9) cVar;
                    int i6 = ((t00.r9) r9Var).y;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ((t00.r9) r9Var).y = i6 - Integer.MIN_VALUE;
                        Object obj5 = ((t00.r9) r9Var).w;
                        Object obj6 = b71.a.r;
                        i2 = ((t00.r9) r9Var).y;
                        if (i2 != 0) {
                            sy.y.j(obj5);
                            Object obj7 = x61.r.r;
                            if (aVar == null) {
                                kVar2 = new w61.k(ya0.x, obj7);
                            } else if (aVar instanceof a.e) {
                                kVar2 = new w61.k(ya0.x, obj7);
                            } else if (aVar instanceof a.d) {
                                kVar2 = new w61.k(ya0.w, obj7);
                            } else if (aVar instanceof a.c) {
                                kVar2 = new w61.k(ya0.u, obj7);
                            } else {
                                boolean z2 = aVar instanceof a.a;
                                if (!z2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ya0 ya0Var = ya0.t;
                                if (z2) {
                                    Set set2 = ((a.a) aVar).a;
                                    ArrayList arrayList2 = new ArrayList(x61.n.F(set2, 10));
                                    Iterator it2 = set2.iterator();
                                    while (it2.hasNext()) {
                                        int ordinal2 = ((a.b) it2.next()).ordinal();
                                        if (ordinal2 == 0) {
                                            iaVar = m10.ia.u;
                                        } else if (ordinal2 == 1) {
                                            iaVar = m10.ia.v;
                                        } else if (ordinal2 == 2) {
                                            iaVar = m10.ia.w;
                                        } else if (ordinal2 == 3) {
                                            iaVar = m10.ia.t;
                                        } else {
                                            if (ordinal2 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            iaVar = m10.ia.x;
                                        }
                                        arrayList2.add(iaVar);
                                    }
                                    obj7 = x61.m.F0(arrayList2);
                                }
                                kVar2 = new w61.k(ya0Var, obj7);
                            }
                            ya0 ya0Var2 = (ya0) kVar2.r;
                            List list2 = (List) kVar2.s;
                            qg0 qg0Var2 = new qg0(str, ya0Var2, list2 == null ? aa.t0.d : new aa.u0(list2));
                            com.github.service.wrapper.bShadow bVar6 = this.s;
                            ((t00.r9) r9Var).u = bVar6;
                            ((t00.r9) r9Var).v = qg0Var2;
                            ((t00.r9) r9Var).y = 1;
                            obj5 = g(str, ya0Var2, list2, r9Var);
                            if (obj5 == obj6) {
                                return obj6;
                            }
                            qg0Var = qg0Var2;
                            bVar2 = bVar6;
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            qg0Var = ((t00.r9) r9Var).v;
                            bVar2 = ((t00.r9) r9Var).u;
                            sy.y.j(obj5);
                        }
                        return y71.n1.y(new t00.q6(new y00.l(in.r.h(bVar2.k(qg0Var, (aa.m0) obj5)), 10), 15), this.t);
                    }
                }
                r9Var = new t00.r9(this, (c71.c) cVar);
                Object obj52 = ((t00.r9) r9Var).w;
                Object obj62 = b71.a.r;
                i2 = ((t00.r9) r9Var).y;
                if (i2 != 0) {
                }
                return y71.n1.y(new t00.q6(new y00.l(in.r.h(bVar2.k(qg0Var, (aa.m0) obj52)), 10), 15), this.t);
            case 2:
                if (cVar instanceof vb0.l7) {
                    l7Var = (vb0.l7) cVar;
                    int i7 = l7Var.y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        l7Var.y = i7 - Integer.MIN_VALUE;
                        Object obj8 = l7Var.w;
                        Object obj9 = b71.a.r;
                        i3 = l7Var.y;
                        if (i3 != 0) {
                            sy.y.j(obj8);
                            Object obj10 = x61.r.r;
                            if (aVar == null) {
                                kVar3 = new w61.k(ev.x, obj10);
                            } else if (aVar instanceof a.e) {
                                kVar3 = new w61.k(ev.x, obj10);
                            } else if (aVar instanceof a.d) {
                                kVar3 = new w61.k(ev.w, obj10);
                            } else if (aVar instanceof a.c) {
                                kVar3 = new w61.k(ev.u, obj10);
                            } else {
                                boolean z3 = aVar instanceof a.a;
                                if (!z3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                ev evVar = ev.t;
                                if (z3) {
                                    Set set3 = ((a.a) aVar).a;
                                    ArrayList arrayList3 = new ArrayList(x61.n.F(set3, 10));
                                    Iterator it3 = set3.iterator();
                                    while (it3.hasNext()) {
                                        int ordinal3 = ((a.b) it3.next()).ordinal();
                                        if (ordinal3 == 0) {
                                            z5Var = hc0.z5.u;
                                        } else if (ordinal3 == 1) {
                                            z5Var = hc0.z5.v;
                                        } else if (ordinal3 == 2) {
                                            z5Var = hc0.z5.w;
                                        } else if (ordinal3 == 3) {
                                            z5Var = hc0.z5.t;
                                        } else {
                                            if (ordinal3 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            z5Var = hc0.z5.x;
                                        }
                                        arrayList3.add(z5Var);
                                    }
                                    obj10 = x61.m.F0(arrayList3);
                                }
                                kVar3 = new w61.k(evVar, obj10);
                            }
                            ev evVar2 = (ev) kVar3.r;
                            List list3 = (List) kVar3.s;
                            c80 c80Var2 = new c80(str, evVar2, list3 == null ? aa.t0.d : new aa.u0(list3));
                            com.github.service.wrapper.bShadow bVar7 = this.s;
                            l7Var.u = bVar7;
                            l7Var.v = c80Var2;
                            l7Var.y = 1;
                            obj8 = f(str, evVar2, list3, l7Var);
                            if (obj8 == obj9) {
                                return obj9;
                            }
                            c80Var = c80Var2;
                            bVar3 = bVar7;
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c80Var = l7Var.v;
                            bVar3 = l7Var.u;
                            sy.y.j(obj8);
                        }
                        return y71.n1.y(new vb0.t3(new y00.l(in.r.h(bVar3.k(c80Var, (aa.m0) obj8)), 10), 26), this.t);
                    }
                }
                l7Var = new vb0.l7(this, (c71.c) cVar);
                Object obj82 = l7Var.w;
                Object obj92 = b71.a.r;
                i3 = l7Var.y;
                if (i3 != 0) {
                }
                return y71.n1.y(new vb0.t3(new y00.l(in.r.h(bVar3.k(c80Var, (aa.m0) obj82)), 10), 26), this.t);
            default:
                if (cVar instanceof wy0.t8) {
                    t8Var = (wy0.t8) cVar;
                    int i8 = t8Var.y;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        t8Var.y = i8 - Integer.MIN_VALUE;
                        Object obj11 = t8Var.w;
                        Object obj12 = b71.a.r;
                        i4 = t8Var.y;
                        if (i4 != 0) {
                            sy.y.j(obj11);
                            Object obj13 = x61.r.r;
                            if (aVar == null) {
                                kVar4 = new w61.k(f40.x, obj13);
                            } else if (aVar instanceof a.e) {
                                kVar4 = new w61.k(f40.x, obj13);
                            } else if (aVar instanceof a.d) {
                                kVar4 = new w61.k(f40.w, obj13);
                            } else if (aVar instanceof a.c) {
                                kVar4 = new w61.k(f40.u, obj13);
                            } else {
                                boolean z4 = aVar instanceof a.a;
                                if (!z4) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f40 f40Var = f40.t;
                                if (z4) {
                                    Set set4 = ((a.a) aVar).a;
                                    ArrayList arrayList4 = new ArrayList(x61.n.F(set4, 10));
                                    Iterator it4 = set4.iterator();
                                    while (it4.hasNext()) {
                                        int ordinal4 = ((a.b) it4.next()).ordinal();
                                        if (ordinal4 == 0) {
                                            e7Var = pz0.e7.u;
                                        } else if (ordinal4 == 1) {
                                            e7Var = pz0.e7.v;
                                        } else if (ordinal4 == 2) {
                                            e7Var = pz0.e7.w;
                                        } else if (ordinal4 == 3) {
                                            e7Var = pz0.e7.t;
                                        } else {
                                            if (ordinal4 != 4) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            e7Var = pz0.e7.x;
                                        }
                                        arrayList4.add(e7Var);
                                    }
                                    obj13 = x61.m.F0(arrayList4);
                                }
                                kVar4 = new w61.k(f40Var, obj13);
                            }
                            f40 f40Var2 = (f40) kVar4.r;
                            List list4 = (List) kVar4.s;
                            ce0 ce0Var2 = new ce0(str, f40Var2, list4 == null ? aa.t0.d : new aa.u0(list4));
                            com.github.service.wrapper.bShadow bVar8 = this.s;
                            t8Var.u = bVar8;
                            t8Var.v = ce0Var2;
                            t8Var.y = 1;
                            obj11 = i(str, f40Var2, list4, t8Var);
                            if (obj11 == obj12) {
                                return obj12;
                            }
                            ce0Var = ce0Var2;
                            bVar4 = bVar8;
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ce0Var = t8Var.v;
                            bVar4 = t8Var.u;
                            sy.y.j(obj11);
                        }
                        return y71.n1.y(new wy0.s6(new y00.l(in.r.h(bVar4.k(ce0Var, (aa.m0) obj11)), 10), 9), this.t);
                    }
                }
                t8Var = new wy0.t8(this, (c71.c) cVar);
                Object obj112 = t8Var.w;
                Object obj122 = b71.a.r;
                i4 = t8Var.y;
                if (i4 != 0) {
                }
                return y71.n1.y(new wy0.s6(new y00.l(in.r.h(bVar4.k(ce0Var, (aa.m0) obj112)), 10), 9), this.t);
        }
    }

    @Override // z01.k1
    public final y71.i b(String str, String str2, SubscriptionState subscriptionState) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "notificationId");
                k71.k.g(subscriptionState, "state");
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new j50(str, str2, sy.r.x(subscriptionState))))), this.t);
            case 1:
                k71.k.g(str2, "notificationId");
                k71.k.g(subscriptionState, "state");
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new ub0(str, str2, com.google.android.gms.internal.measurement.i4.r0(subscriptionState))))), this.t);
            case 2:
                k71.k.g(str2, "notificationId");
                k71.k.g(subscriptionState, "state");
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new l30(str, str2, a.a.w(subscriptionState))))), this.t);
            default:
                k71.k.g(str2, "notificationId");
                k71.k.g(subscriptionState, "state");
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new g90(str, str2, i21.a.G(subscriptionState))))), this.t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019e  */
    @Override // z01.k1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, SubscriptionState subscriptionState, c71.c cVar) {
        x9 x9Var;
        int i;
        ca0 ca0Var;
        com.github.service.wrapper.bShadow bVar;
        c71.c s9Var;
        int i2;
        qg0 qg0Var;
        com.github.service.wrapper.bShadow bVar2;
        vb0.m7Shadow m7Var;
        int i3;
        c80 c80Var;
        com.github.service.wrapper.bShadow bVar3;
        wy0.u8 u8Var;
        int i4;
        ce0 ce0Var;
        com.github.service.wrapper.bShadow bVar4;
        switch (this.r) {
            case 0:
                if (cVar instanceof x9) {
                    x9Var = (x9) cVar;
                    int i5 = x9Var.y;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        x9Var.y = i5 - Integer.MIN_VALUE;
                        Object obj = x9Var.w;
                        Object obj2 = b71.a.r;
                        i = x9Var.y;
                        if (i != 0) {
                            sy.y.j(obj);
                            ca0 ca0Var2 = new ca0(str, sy.r.x(subscriptionState), aa.t0.d);
                            kw x = sy.r.x(subscriptionState);
                            com.github.service.wrapper.bShadow bVar5 = this.s;
                            x9Var.u = bVar5;
                            x9Var.v = ca0Var2;
                            x9Var.y = 1;
                            Object e = e(str, x, null, x9Var);
                            if (e == obj2) {
                                return obj2;
                            }
                            obj = e;
                            ca0Var = ca0Var2;
                            bVar = bVar5;
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ca0Var = x9Var.v;
                            bVar = x9Var.u;
                            sy.y.j(obj);
                        }
                        return y71.n1.y(new v9(new y00.l(in.r.h(bVar.k(ca0Var, (aa.m0) obj)), 10), 0), this.t);
                    }
                }
                x9Var = new x9(this, cVar);
                Object obj3 = x9Var.w;
                Object obj22 = b71.a.r;
                i = x9Var.y;
                if (i != 0) {
                }
                return y71.n1.y(new v9(new y00.l(in.r.h(bVar.k(ca0Var, (aa.m0) obj3)), 10), 0), this.t);
            case 1:
                if (cVar instanceof t00.s9) {
                    s9Var = (t00.s9) cVar;
                    int i6 = ((t00.s9) s9Var).y;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        ((t00.s9) s9Var).y = i6 - Integer.MIN_VALUE;
                        Object obj4 = ((t00.s9) s9Var).w;
                        Object obj5 = b71.a.r;
                        i2 = ((t00.s9) s9Var).y;
                        if (i2 != 0) {
                            sy.y.j(obj4);
                            qg0 qg0Var2 = new qg0(str, com.google.android.gms.internal.measurement.i4.r0(subscriptionState), aa.t0.d);
                            ya0 r0 = com.google.android.gms.internal.measurement.i4.r0(subscriptionState);
                            com.github.service.wrapper.bShadow bVar6 = this.s;
                            ((t00.s9) s9Var).u = bVar6;
                            ((t00.s9) s9Var).v = qg0Var2;
                            ((t00.s9) s9Var).y = 1;
                            Object g = g(str, r0, null, s9Var);
                            if (g == obj5) {
                                return obj5;
                            }
                            obj4 = g;
                            qg0Var = qg0Var2;
                            bVar2 = bVar6;
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            qg0Var = ((t00.s9) s9Var).v;
                            bVar2 = ((t00.s9) s9Var).u;
                            sy.y.j(obj4);
                        }
                        return y71.n1.y(new t00.q6(new y00.l(in.r.h(bVar2.k(qg0Var, (aa.m0) obj4)), 10), 16), this.t);
                    }
                }
                s9Var = new t00.s9(this, cVar);
                Object obj42 = ((t00.s9) s9Var).w;
                Object obj52 = b71.a.r;
                i2 = ((t00.s9) s9Var).y;
                if (i2 != 0) {
                }
                return y71.n1.y(new t00.q6(new y00.l(in.r.h(bVar2.k(qg0Var, (aa.m0) obj42)), 10), 16), this.t);
            case 2:
                if (cVar instanceof vb0.m7) {
                    m7Var = (vb0.m7) cVar;
                    int i7 = m7Var.y;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        m7Var.y = i7 - Integer.MIN_VALUE;
                        Object obj6 = m7Var.w;
                        Object obj7 = b71.a.r;
                        i3 = m7Var.y;
                        if (i3 != 0) {
                            sy.y.j(obj6);
                            c80 c80Var2 = new c80(str, a.a.w(subscriptionState), aa.t0.d);
                            ev w = a.a.w(subscriptionState);
                            com.github.service.wrapper.bShadow bVar7 = this.s;
                            m7Var.u = bVar7;
                            m7Var.v = c80Var2;
                            m7Var.y = 1;
                            Object f = f(str, w, null, m7Var);
                            if (f == obj7) {
                                return obj7;
                            }
                            obj6 = f;
                            c80Var = c80Var2;
                            bVar3 = bVar7;
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            c80Var = m7Var.v;
                            bVar3 = m7Var.u;
                            sy.y.j(obj6);
                        }
                        return y71.n1.y(new vb0.t3(new y00.l(in.r.h(bVar3.k(c80Var, (aa.m0) obj6)), 10), 27), this.t);
                    }
                }
                m7Var = new vb0.m7(this, cVar);
                Object obj62 = m7Var.w;
                Object obj72 = b71.a.r;
                i3 = m7Var.y;
                if (i3 != 0) {
                }
                return y71.n1.y(new vb0.t3(new y00.l(in.r.h(bVar3.k(c80Var, (aa.m0) obj62)), 10), 27), this.t);
            default:
                if (cVar instanceof wy0.u8) {
                    u8Var = (wy0.u8) cVar;
                    int i8 = u8Var.y;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        u8Var.y = i8 - Integer.MIN_VALUE;
                        Object obj8 = u8Var.w;
                        Object obj9 = b71.a.r;
                        i4 = u8Var.y;
                        if (i4 != 0) {
                            sy.y.j(obj8);
                            ce0 ce0Var2 = new ce0(str, i21.a.G(subscriptionState), aa.t0.d);
                            f40 G = i21.a.G(subscriptionState);
                            com.github.service.wrapper.bShadow bVar8 = this.s;
                            u8Var.u = bVar8;
                            u8Var.v = ce0Var2;
                            u8Var.y = 1;
                            Object i9 = i(str, G, null, u8Var);
                            if (i9 == obj9) {
                                return obj9;
                            }
                            obj8 = i9;
                            ce0Var = ce0Var2;
                            bVar4 = bVar8;
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ce0Var = u8Var.v;
                            bVar4 = u8Var.u;
                            sy.y.j(obj8);
                        }
                        return y71.n1.y(new wy0.s6(new y00.l(in.r.h(bVar4.k(ce0Var, (aa.m0) obj8)), 10), 10), this.t);
                    }
                }
                u8Var = new wy0.u8(this, cVar);
                Object obj82 = u8Var.w;
                Object obj92 = b71.a.r;
                i4 = u8Var.y;
                if (i4 != 0) {
                }
                return y71.n1.y(new wy0.s6(new y00.l(in.r.h(bVar4.k(ce0Var, (aa.m0) obj82)), 10), 10), this.t);
        }
    }

    @Override // z01.k1
    public final y71.i d(String str, String str2, SubscriptionState subscriptionState) {
        switch (this.r) {
            case 0:
                k71.k.g(str2, "notificationId");
                k71.k.g(subscriptionState, "state");
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new k20(str, str2, sy.r.x(subscriptionState))))), this.t);
            case 1:
                k71.k.g(str2, "notificationId");
                k71.k.g(subscriptionState, "state");
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new m80(str, str2, com.google.android.gms.internal.measurement.i4.r0(subscriptionState))))), this.t);
            case 2:
                k71.k.g(str2, "notificationId");
                k71.k.g(subscriptionState, "state");
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new m00(str, str2, a.a.w(subscriptionState))))), this.t);
            default:
                k71.k.g(str2, "notificationId");
                k71.k.g(subscriptionState, "state");
                return y71.n1.y(in.r.l(in.r.h(this.s.d(new d60(str, str2, i21.a.G(subscriptionState))))), this.t);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object e(String str, kw kwVar, List list, c71.c cVar) {
        s9 s9Var;
        int i;
        ek0.bShadow bVar;
        ek0.a aVar;
        if (cVar instanceof s9) {
            s9Var = (s9) cVar;
            int i2 = s9Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                s9Var.y = i2 - Integer.MIN_VALUE;
                Object obj = s9Var.w;
                b71.a aVar2 = b71.a.r;
                i = s9Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    ek0.d dVar = new ek0.d();
                    s9Var.u = kwVar;
                    s9Var.v = list;
                    s9Var.y = 1;
                    obj = this.s.c(dVar, str);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = s9Var.v;
                    kwVar = s9Var.u;
                    sy.y.j(obj);
                }
                bVar = (ek0.b) obj;
                if (bVar != null) {
                    return null;
                }
                ek0.bShadow a = ek0.b.a(bVar, kwVar, null, 27);
                ek0.a aVar3 = a.e;
                if (aVar3 != null) {
                    if (list == null) {
                        list = aVar3.a;
                    }
                    aVar = new ek0.a(list);
                } else {
                    aVar = null;
                }
                return new z90(new ba0(new aa0(a.a, ek0.b.a(a, null, aVar, 15))));
            }
        }
        s9Var = new s9(this, cVar);
        Object obj2 = s9Var.w;
        b71.a aVar22 = b71.a.r;
        i = s9Var.y;
        if (i != 0) {
        }
        bVar = (ek0.b) obj2;
        if (bVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object f(String str, ev evVar, List list, c71.c cVar) {
        vb0.i7 i7Var;
        int i;
        m90.bShadow bVar;
        m90.a aVar;
        if (cVar instanceof vb0.i7) {
            i7Var = (vb0.i7) cVar;
            int i2 = i7Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i7Var.y = i2 - Integer.MIN_VALUE;
                Object obj = i7Var.w;
                b71.a aVar2 = b71.a.r;
                i = i7Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.i0 cVar2 = new m90.c(0);
                    i7Var.u = evVar;
                    i7Var.v = list;
                    i7Var.y = 1;
                    obj = this.s.c(cVar2, str);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = i7Var.v;
                    evVar = i7Var.u;
                    sy.y.j(obj);
                }
                bVar = (m90.b) obj;
                if (bVar != null) {
                    return null;
                }
                m90.bShadow a = m90.b.a(bVar, evVar, (m90.a) null, 27);
                m90.a aVar3 = a.e;
                if (aVar3 != null) {
                    if (list == null) {
                        list = aVar3.a;
                    }
                    aVar = new m90.a(list);
                } else {
                    aVar = null;
                }
                return new z70(new b80(new a80(a.a, m90.b.a(a, (ev) null, aVar, 15))));
            }
        }
        i7Var = new vb0.i7(this, cVar);
        Object obj2 = i7Var.w;
        b71.a aVar22 = b71.a.r;
        i = i7Var.y;
        if (i != 0) {
        }
        bVar = (m90.b) obj2;
        if (bVar != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object g(String str, ya0 ya0Var, List list, c71.c cVar) {
        t00.o9 o9Var;
        int i;
        yw.bShadow bVar;
        yw.a aVar;
        if (cVar instanceof t00.o9) {
            o9Var = (t00.o9) cVar;
            int i2 = o9Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o9Var.y = i2 - Integer.MIN_VALUE;
                Object obj = o9Var.w;
                b71.a aVar2 = b71.a.r;
                i = o9Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    aa.i0 dVar = new yw.d();
                    o9Var.u = ya0Var;
                    o9Var.v = list;
                    o9Var.y = 1;
                    obj = this.s.c(dVar, str);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = o9Var.v;
                    ya0Var = o9Var.u;
                    sy.y.j(obj);
                }
                bVar = (yw.b) obj;
                if (bVar != null) {
                    return null;
                }
                yw.bShadow a = yw.b.a(bVar, ya0Var, (yw.a) null, 27);
                yw.a aVar3 = a.e;
                if (aVar3 != null) {
                    if (list == null) {
                        list = aVar3.a;
                    }
                    aVar = new yw.a(list);
                } else {
                    aVar = null;
                }
                return new ng0(new pg0(new og0(a.a, yw.b.a(a, (ya0) null, aVar, 15))));
            }
        }
        o9Var = new t00.o9(this, cVar);
        Object obj2 = o9Var.w;
        b71.a aVar22 = b71.a.r;
        i = o9Var.y;
        if (i != 0) {
        }
        bVar = (yw.b) obj2;
        if (bVar != null) {
        }
    }

    public final Object h() {
        int i = this.r;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object i(String str, f40 f40Var, List list, c71.c cVar) {
        wy0.q8 q8Var;
        int i;
        nv0.bShadow bVar;
        nv0.a aVar;
        if (cVar instanceof wy0.q8) {
            q8Var = (wy0.q8) cVar;
            int i2 = q8Var.y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q8Var.y = i2 - Integer.MIN_VALUE;
                Object obj = q8Var.w;
                b71.a aVar2 = b71.a.r;
                i = q8Var.y;
                if (i != 0) {
                    sy.y.j(obj);
                    nv0.d dVar = new nv0.d();
                    q8Var.u = f40Var;
                    q8Var.v = list;
                    q8Var.y = 1;
                    obj = this.s.c(dVar, str);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = q8Var.v;
                    f40Var = q8Var.u;
                    sy.y.j(obj);
                }
                bVar = (nv0.b) obj;
                if (bVar != null) {
                    return null;
                }
                nv0.bShadow a = nv0.b.a(bVar, f40Var, null, 27);
                nv0.a aVar3 = a.e;
                if (aVar3 != null) {
                    if (list == null) {
                        list = aVar3.a;
                    }
                    aVar = new nv0.a(list);
                } else {
                    aVar = null;
                }
                return new zd0(new be0(new ae0(a.a, nv0.b.a(a, null, aVar, 15))));
            }
        }
        q8Var = new wy0.q8(this, cVar);
        Object obj2 = q8Var.w;
        b71.a aVar22 = b71.a.r;
        i = q8Var.y;
        if (i != 0) {
        }
        bVar = (nv0.b) obj2;
        if (bVar != null) {
        }
    }
}
