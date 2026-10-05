package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r4 extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object y;
    public final /* synthetic */ h5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r4(a71.c cVar, h5 h5Var, String str, String str2, int i) {
        super(3, cVar);
        this.v = i;
        this.z = h5Var;
        this.A = str;
        this.B = str2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                r4 r4Var = new r4(cVar, this.z, this.A, this.B, 0);
                r4Var.x = jVar;
                r4Var.y = obj2;
                return r4Var.v(w61.a0.a);
            default:
                r4 r4Var2 = new r4(cVar, this.z, this.A, this.B, 1);
                r4Var2.x = jVar;
                r4Var2.y = obj2;
                return r4Var2.v(w61.a0.a);
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
                    xa f = sy.o.f((l01.p0) this.y, this.z.s, this.A, this.B);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar, f, this) == aVar) {
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
                    xa f2 = sy.o.f((l01.p0) this.y, this.z.s, this.A, this.B);
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (y71.n1.q(jVar2, f2, this) == aVar2) {
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
