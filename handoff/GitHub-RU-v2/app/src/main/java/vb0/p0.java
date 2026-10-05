package vb0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ k1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(int i, a71.c cVar, String str, k1 k1Var) {
        super(3, cVar);
        this.v = i;
        this.z = k1Var;
        this.A = str;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                p0 p0Var = new p0(0, cVar, this.A, this.z);
                p0Var.x = jVar;
                p0Var.y = obj2;
                return p0Var.v(w61.a0.a);
            default:
                p0 p0Var2 = new p0(1, cVar, this.A, this.z);
                p0Var2.x = jVar;
                p0Var2.y = obj2;
                return p0Var2.v(w61.a0.a);
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
                    y71.j jVar = this.x;
                    aa.m0 m0Var = (u10.p) this.y;
                    k1 k1Var = this.z;
                    y71.i y = y71.n1.y(in.r.l(in.r.h(k1Var.s.k(new u10.s(this.A), m0Var))), k1Var.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar, y, this) == aVar) {
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
                    y71.j jVar2 = this.x;
                    y71.i k = this.z.s.k(new s20.m(this.A), (s20.j) this.y);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar2, k, this) == aVar2) {
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
}
