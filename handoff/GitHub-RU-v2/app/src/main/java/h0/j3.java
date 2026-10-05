package h0;

/* loaded from: /home/user/work/p/classes.dex */
public final class j3 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f25046v;

    /* renamed from: w, reason: collision with root package name */
    public int f25047w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j71.f f25048x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e2 f25049y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ q2.u f25050z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j3(j71.f fVar, e2 e2Var, q2.u uVar, a71.c cVar, int i) {
        super(2, cVar);
        this.f25046v = i;
        this.f25048x = fVar;
        this.f25049y = e2Var;
        this.f25050z = uVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f25046v) {
            case k5.f.J:
                return new j3(this.f25048x, this.f25049y, this.f25050z, cVar, 0);
            default:
                return new j3(this.f25048x, this.f25049y, this.f25050z, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f25046v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f25046v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f25047w;
                if (i == 0) {
                    sy.y.j(obj);
                    c2.b bVar = new c2.b(this.f25050z.f30892c);
                    this.f25047w = 1;
                    if (this.f25048x.f(this.f25049y, bVar, this) == aVar) {
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
                int i10 = this.f25047w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    c2.b bVar2 = new c2.b(this.f25050z.f30892c);
                    this.f25047w = 1;
                    if (this.f25048x.f(this.f25049y, bVar2, this) == aVar2) {
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
