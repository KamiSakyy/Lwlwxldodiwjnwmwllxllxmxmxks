package n5;

/* loaded from: /home/user/work/p/classes.dex */
public final class m extends c71.j implements j71.f {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f29555v = 1;

    /* renamed from: w, reason: collision with root package name */
    public int f29556w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f29557x;

    public /* synthetic */ m(int i, a71.c cVar) {
        super(i, cVar);
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.f29555v) {
            case k5.f.J /* 0 */:
                return new m((x) this.f29557x, (a71.c) obj3).v(w61.a0.a);
            default:
                ((Boolean) obj2).getClass();
                m mVar = new m(3, (a71.c) obj3);
                mVar.f29557x = (j0) obj;
                return mVar.v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.f29555v) {
            case k5.f.J /* 0 */:
                b71.a aVar = b71.a.r;
                int i = this.f29556w;
                if (i == 0) {
                    sy.y.j(obj);
                    x xVar = (x) this.f29557x;
                    this.f29556w = 1;
                    if (x.b(xVar, this) == aVar) {
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
                int i10 = this.f29556w;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    return obj;
                }
                sy.y.j(obj);
                j0 j0Var = (j0) this.f29557x;
                this.f29556w = 1;
                Object b10 = j0Var.b(this);
                return b10 == aVar2 ? aVar2 : b10;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(x xVar, a71.c cVar) {
        super(3, cVar);
        this.f29557x = xVar;
    }
}
