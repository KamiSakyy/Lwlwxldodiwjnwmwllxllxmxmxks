package h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class h3 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f25013v;

    /* renamed from: w, reason: collision with root package name */
    public int f25014w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e2 f25015x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h3(e2 e2Var, a71.c cVar, int i) {
        super(2, cVar);
        this.f25013v = i;
        this.f25015x = e2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f25013v) {
            case k5.f.J:
                return new h3(this.f25015x, cVar, 0);
            default:
                return new h3(this.f25015x, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f25013v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f25013v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f25014w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.f25014w = 1;
                    if (this.f25015x.f(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f25014w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    this.f25014w = 1;
                    if (this.f25015x.f(this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}
