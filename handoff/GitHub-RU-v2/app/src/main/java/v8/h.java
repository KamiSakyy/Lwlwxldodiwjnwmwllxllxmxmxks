package v8;

import androidx.work.CoroutineWorker;

/* loaded from: /home/user/work/p/classes.dex */
public final class h extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f32786v;

    /* renamed from: w, reason: collision with root package name */
    public int f32787w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f32788x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(CoroutineWorker coroutineWorker, a71.c cVar, int i) {
        super(2, cVar);
        this.f32786v = i;
        this.f32788x = coroutineWorker;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f32786v) {
            case k5.f.J /* 0 */:
                return new h(this.f32788x, cVar, 0);
            default:
                return new h(this.f32788x, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f32786v) {
            case k5.f.J /* 0 */:
                h r10 = r(cVar, zVar);
                w61.a0 a0Var = w61.a0.a;
                r10.v(a0Var);
                return a0Var;
            default:
                return r(cVar, zVar).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.f32786v) {
            case k5.f.J /* 0 */:
                b71.a aVar = b71.a.r;
                int i = this.f32787w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.f32787w = 1;
                    throw new IllegalStateException("Not implemented");
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sy.y.j(obj);
                return obj;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f32787w;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                this.f32787w = 1;
                Object c10 = this.f32788x.c(this);
                return c10 == aVar2 ? aVar2 : c10;
        }
    }
}
