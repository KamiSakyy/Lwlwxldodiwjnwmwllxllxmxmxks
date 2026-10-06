package h0;

import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;

/* loaded from: /home/user/work/p/classes.dex */
public final class f implements y71.j {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f24980r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ k71.w f24981s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ v71.z f24982t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ j71.e f24983u;

    public /* synthetic */ f(k71.w wVar, v71.z zVar, j71.e eVar, int i) {
        this.f24980r = i;
        this.f24981s = wVar;
        this.f24982t = zVar;
        this.f24983u = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        e eVar;
        int i;
        h1.i iVar;
        int i10;
        switch (this.f24980r) {
            case k5.f.J:
                if (cVar instanceof e) {
                    eVar = (e) cVar;
                    int i11 = eVar.f24964x;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        eVar.f24964x = i11 - Integer.MIN_VALUE;
                        Object obj2 = eVar.f24962v;
                        b71.a aVar = b71.a.r;
                        i = eVar.f24964x;
                        k71.w wVar = this.f24981s;
                        if (i != 0) {
                            sy.y.j(obj2);
                            v71.d1 d1Var = (v71.d1) wVar.r;
                            if (d1Var != null) {
                                d1Var.m(new AnchoredDragFinishedSignal());
                                eVar.f24961u = obj;
                                eVar.f24964x = 1;
                                if (d1Var.O(eVar) == aVar) {
                                    return aVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = eVar.f24961u;
                            sy.y.j(obj2);
                        }
                        Object obj3 = obj;
                        v71.a0 a0Var = v71.a0.u;
                        j71.e eVar2 = this.f24983u;
                        v71.z zVar = this.f24982t;
                        wVar.r = v71.b0.z(zVar, (a71.h) null, a0Var, new d(eVar2, obj3, zVar, null, 0), 1);
                        return w61.a0.a;
                    }
                }
                eVar = new e(this, cVar);
                Object obj22 = eVar.f24962v;
                b71.a aVar2 = b71.a.r;
                i = eVar.f24964x;
                k71.w wVar2 = this.f24981s;
                if (i != 0) {
                }
                Object obj32 = obj;
                v71.a0 a0Var2 = v71.a0.u;
                j71.e eVar22 = this.f24983u;
                v71.z zVar2 = this.f24982t;
                wVar2.r = v71.b0.z(zVar2, (a71.h) null, a0Var2, new d(eVar22, obj32, zVar2, null, 0), 1);
                return w61.a0.a;
            default:
                if (cVar instanceof h1Shadow.i) {
                    iVar = (h1.i) cVar;
                    int i12 = iVar.f25343x;
                    if ((i12 & Integer.MIN_VALUE) != 0) {
                        iVar.f25343x = i12 - Integer.MIN_VALUE;
                        Object obj4 = iVar.f25341v;
                        b71.a aVar3 = b71.a.r;
                        i10 = iVar.f25343x;
                        k71.w wVar3 = this.f24981s;
                        if (i10 != 0) {
                            sy.y.j(obj4);
                            v71.d1 d1Var2 = (v71.d1) wVar3.r;
                            if (d1Var2 != null) {
                                d1Var2.m(new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                                iVar.f25340u = obj;
                                iVar.f25343x = 1;
                                if (d1Var2.O(iVar) == aVar3) {
                                    return aVar3;
                                }
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = iVar.f25340u;
                            sy.y.j(obj4);
                        }
                        Object obj5 = obj;
                        v71.a0 a0Var3 = v71.a0.u;
                        j71.e eVar3 = this.f24983u;
                        v71.z zVar3 = this.f24982t;
                        wVar3.r = v71.b0.z(zVar3, (a71.h) null, a0Var3, new d(eVar3, obj5, zVar3, null, 1), 1);
                        return w61.a0.a;
                    }
                }
                iVar = new h1.i(this, cVar);
                Object obj42 = iVar.f25341v;
                b71.a aVar32 = b71.a.r;
                i10 = iVar.f25343x;
                k71.w wVar32 = this.f24981s;
                if (i10 != 0) {
                }
                Object obj52 = obj;
                v71.a0 a0Var32 = v71.a0.u;
                j71.e eVar32 = this.f24983u;
                v71.z zVar32 = this.f24982t;
                wVar32.r = v71.b0.z(zVar32, (a71.h) null, a0Var32, new d(eVar32, obj52, zVar32, null, 1), 1);
                return w61.a0.a;
        }
    }
}
