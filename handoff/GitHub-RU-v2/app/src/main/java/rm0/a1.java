package rm0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a1 extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ b2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(int i, a71.c cVar, String str, b2 b2Var) {
        super(3, cVar);
        this.v = i;
        this.z = b2Var;
        this.A = str;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                a1 a1Var = new a1(0, cVar, this.A, this.z);
                a1Var.x = jVar;
                a1Var.y = obj2;
                return a1Var.v(w61.a0.a);
            default:
                a1 a1Var2 = new a1(1, cVar, this.A, this.z);
                a1Var2.x = jVar;
                a1Var2.y = obj2;
                return a1Var2.v(w61.a0.a);
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
                    kc0.p pVar = (kc0.p) this.y;
                    b2 b2Var = this.z;
                    y71.i y = y71.n1Shadow.y(in.rShadow.l(in.rShadow.h(b2Var.s.k(new kc0.s(this.A), pVar))), b2Var.t);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1Shadow.q(jVar, y, this) == aVar) {
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
                    y71.i k = this.z.s.k(new id0.m(this.A), (id0.j) this.y);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1Shadow.q(jVar2, k, this) == aVar2) {
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
