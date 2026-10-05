package h0;

import androidx.compose.foundation.gestures.AnchoredDragFinishedSignal;

/* loaded from: /home/user/work/p/classes.dex */
public final class d extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f24944v;

    /* renamed from: w, reason: collision with root package name */
    public int f24945w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j71.e f24946x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f24947y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ v71.z f24948z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(j71.e eVar, Object obj, v71.z zVar, a71.c cVar, int i) {
        super(2, cVar);
        this.f24944v = i;
        this.f24946x = eVar;
        this.f24947y = obj;
        this.f24948z = zVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f24944v) {
            case k5.f.J:
                return new d(this.f24946x, this.f24947y, this.f24948z, cVar, 0);
            default:
                return new d(this.f24946x, this.f24947y, this.f24948z, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f24944v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f24944v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f24945w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.f24945w = 1;
                    if (this.f24946x.s(this.f24947y, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                v71.b0.i(this.f24948z, new AnchoredDragFinishedSignal());
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f24945w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    this.f24945w = 1;
                    if (this.f24946x.s(this.f24947y, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                v71.b0.i(this.f24948z, new androidx.compose.material3.internal.AnchoredDragFinishedSignal());
                return w61.a0.a;
        }
    }
}
