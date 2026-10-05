package f0;

/* loaded from: /home/user/work/p/classes.dex */
public final class x0 extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f22403v;

    /* renamed from: w, reason: collision with root package name */
    public int f22404w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ y0 f22405x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(y0 y0Var, a71.c cVar, int i) {
        super(2, cVar);
        this.f22403v = i;
        this.f22405x = y0Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f22403v) {
            case k5.f.J /* 0 */:
                return new x0(this.f22405x, cVar, 0);
            default:
                return new x0(this.f22405x, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f22403v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f22403v) {
            case k5.f.J /* 0 */:
                b71.a aVar = b71.a.r;
                int i = this.f22404w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.f22404w = 1;
                    if (y0.O0(this.f22405x, this) == aVar) {
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
                int i10 = this.f22404w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    this.f22404w = 1;
                    if (y0.P0(this.f22405x, this) == aVar2) {
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
