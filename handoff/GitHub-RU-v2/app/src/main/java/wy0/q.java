package wy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ rm0.m0 x;
    public final /* synthetic */ String y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(rm0.m0 m0Var, String str, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = m0Var;
        this.y = str;
    }

    @Override // c71.a
    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new q(this.x, this.y, cVar, 0);
            default:
                return new q(this.x, this.y, cVar, 1);
        }
    }

    @Override // j71.e
    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return ((q) r((a71.c) obj2, (jn0.d) obj)).v(w61.a0.a);
            default:
                return ((q) r((a71.c) obj2, (jn0.y8) obj)).v(w61.a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (rm0.m0.w(this.x, this.y, this) == aVar) {
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
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    this.w = 1;
                    if (rm0.m0.s(this.x, this.y, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
    public Object t(Object) { return null; }
}
