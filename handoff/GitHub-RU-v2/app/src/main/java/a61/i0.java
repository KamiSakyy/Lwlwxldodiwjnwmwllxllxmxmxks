package a61;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i0 extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i0(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                i0 i0Var = new i0(3, cVar, 0);
                i0Var.x = jVar;
                return i0Var.v(w61.a0.a);
            default:
                i0 i0Var2 = new i0(3, cVar, 1);
                i0Var2.x = jVar;
                return i0Var2.v(w61.a0.a);
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
                    s5.b n = b41.b.n();
                    this.x = null;
                    this.w = 1;
                    if (jVar.c(n, this) == aVar) {
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
                y71.j jVar2 = this.x;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    f11.a aVar3 = new f11.a(false, false);
                    this.x = null;
                    this.w = 1;
                    if (jVar2.c(aVar3, this) == aVar2) {
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
