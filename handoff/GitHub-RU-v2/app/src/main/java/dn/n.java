package dn;

import java.util.Iterator;
import java.util.List;
import kj.r0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ oa.j t;

    public /* synthetic */ n(y71.j jVar, oa.j jVar2, int i) {
        this.r = i;
        this.s = jVar;
        this.t = jVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        m mVar;
        int i;
        kj.u uVar;
        int i2;
        nl.k kVar;
        int i3;
        Integer num;
        switch (this.r) {
            case 0:
                if (cVar instanceof m) {
                    mVar = (m) cVar;
                    int i4 = mVar.v;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        mVar.v = i4 - Integer.MIN_VALUE;
                        Object obj2 = mVar.u;
                        b71.a aVar = b71.a.r;
                        i = mVar.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            fn.a aVar2 = new fn.a(this.t, (f11.b) obj);
                            mVar.v = 1;
                            if (this.s.c(aVar2, mVar) == aVar) {
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
                mVar = new m(this, cVar);
                Object obj22 = mVar.u;
                b71.a aVar3 = b71.a.r;
                i = mVar.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                if (cVar instanceof kj.u) {
                    uVar = (kj.u) cVar;
                    int i5 = uVar.v;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        uVar.v = i5 - Integer.MIN_VALUE;
                        Object obj3 = uVar.u;
                        b71.a aVar4 = b71.a.r;
                        i2 = uVar.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            r0 r0Var = new r0(this.t, ((Number) obj).intValue());
                            uVar.v = 1;
                            if (this.s.c(r0Var, uVar) == aVar4) {
                                return aVar4;
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
                uVar = new kj.u(this, cVar);
                Object obj32 = uVar.u;
                b71.a aVar42 = b71.a.r;
                i2 = uVar.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            default:
                if (cVar instanceof nl.k) {
                    kVar = (nl.k) cVar;
                    int i6 = kVar.v;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        kVar.v = i6 - Integer.MIN_VALUE;
                        Object obj4 = kVar.u;
                        b71.a aVar5 = b71.a.r;
                        i3 = kVar.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            Iterator it = ((List) obj).iterator();
                            if (it.hasNext()) {
                                Integer G = t71.w.G(t71.p.n0(((yz0.j) it.next()).d, "-"));
                                Integer num2 = new Integer(G != null ? G.intValue() : 0);
                                while (it.hasNext()) {
                                    Integer G2 = t71.w.G(t71.p.n0(((yz0.j) it.next()).d, "-"));
                                    Integer num3 = new Integer(G2 != null ? G2.intValue() : 0);
                                    if (num2.compareTo(num3) < 0) {
                                        num2 = num3;
                                    }
                                }
                                num = num2;
                            } else {
                                num = null;
                            }
                            int intValue = num != null ? num.intValue() : 0;
                            String str = this.t.c + "-patch-" + (intValue + 1);
                            kVar.v = 1;
                            if (this.s.c(str, kVar) == aVar5) {
                                return aVar5;
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
                kVar = new nl.k(this, cVar);
                Object obj42 = kVar.u;
                b71.a aVar52 = b71.a.r;
                i3 = kVar.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
        }
    }
}
