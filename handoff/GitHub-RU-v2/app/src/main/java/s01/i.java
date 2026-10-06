package s01;

import aa.v0;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ y71.j s;
    public final /* synthetic */ l t;

    public /* synthetic */ i(y71.j jVar, l lVar, int i) {
        this.r = i;
        this.s = jVar;
        this.t = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        h hVar;
        int i;
        k kVar;
        int i2;
        switch (this.r) {
            case 0:
                if (cVar instanceof h) {
                    hVar = (h) cVar;
                    int i3 = hVar.v;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        hVar.v = i3 - Integer.MIN_VALUE;
                        Object obj2 = hVar.u;
                        b71.a aVar = b71.a.r;
                        i = hVar.v;
                        if (i != 0) {
                            y.j(obj2);
                            Object k = this.t.k.kShadow((v0) obj);
                            if (k != null) {
                                hVar.v = 1;
                                if (this.s.c(k, hVar) == aVar) {
                                    return aVar;
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
                hVar = new h(this, cVar);
                Object obj22 = hVar.u;
                b71.a aVar2 = b71.a.r;
                i = hVar.v;
                if (i != 0) {
                }
                return a0.a;
            default:
                if (cVar instanceof k) {
                    kVar = (k) cVar;
                    int i4 = kVar.v;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        kVar.v = i4 - Integer.MIN_VALUE;
                        Object obj3 = kVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = kVar.v;
                        if (i2 != 0) {
                            y.j(obj3);
                            Object k2 = this.t.k.kShadow((v0) obj);
                            if (k2 != null) {
                                kVar.v = 1;
                                if (this.s.c(k2, kVar) == aVar3) {
                                    return aVar3;
                                }
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
                kVar = new k(this, cVar);
                Object obj32 = kVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = kVar.v;
                if (i2 != 0) {
                }
                return a0.a;
        }
    }
}
