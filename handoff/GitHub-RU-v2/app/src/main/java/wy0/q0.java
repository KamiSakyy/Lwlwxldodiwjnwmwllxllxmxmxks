package wy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q0 extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ l1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0(int i, a71.c cVar, String str, l1 l1Var) {
        super(3, cVar);
        this.v = i;
        this.z = l1Var;
        this.A = str;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                q0 q0Var = new q0(0, cVar, this.A, this.z);
                q0Var.x = jVar;
                q0Var.y = obj2;
                return q0Var.v(w61.a0.a);
            default:
                q0 q0Var2 = new q0(1, cVar, this.A, this.z);
                q0Var2.x = jVar;
                q0Var2.y = obj2;
                return q0Var2.v(w61.a0.a);
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
                    jn0.p pVar = (jn0.p) this.y;
                    l1 l1Var = this.z;
                    y71.i y = y71.n1.y(in.r.l(in.r.h(l1Var.s.k(new jn0.s(this.A), pVar))), l1Var.t);
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
                    y71.i k = this.z.s.k(new io0.n(this.A), (io0.k) this.y);
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
