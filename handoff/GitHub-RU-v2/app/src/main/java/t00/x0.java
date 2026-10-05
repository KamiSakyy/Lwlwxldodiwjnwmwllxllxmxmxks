package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x0 extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ s1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x0(int i, a71.c cVar, String str, s1 s1Var) {
        super(3, cVar);
        this.v = i;
        this.z = s1Var;
        this.A = str;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                x0 x0Var = new x0(0, cVar, this.A, this.z);
                x0Var.x = jVar;
                x0Var.y = obj2;
                return x0Var.v(w61.a0.a);
            default:
                x0 x0Var2 = new x0(1, cVar, this.A, this.z);
                x0Var2.x = jVar;
                x0Var2.y = obj2;
                return x0Var2.v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    y71.j jVar = this.x;
                    jo.u uVar = (jo.u) this.y;
                    s1 s1Var = this.z;
                    y71.i y = y71.n1.y(in.r.l(in.r.h(s1Var.s.k(new jo.x(this.A), uVar))), s1Var.t);
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
                    y71.i k = this.z.s.k(new np.n(this.A), (np.k) this.y);
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
