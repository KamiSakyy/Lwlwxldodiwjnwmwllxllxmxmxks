package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t8 extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public /* synthetic */ Throwable w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                t8 t8Var = new t8(3, cVar, 0);
                t8Var.w = th2;
                t8Var.v(w61.a0.a);
                throw null;
            default:
                t8 t8Var2 = new t8(3, cVar, 1);
                t8Var2.w = th2;
                t8Var2.v(w61.a0.a);
                throw null;
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                Throwable th2 = this.w;
                b71.a aVar = b71.a.r;
                sy.y.j(obj);
                throw th2;
            default:
                Throwable th3 = this.w;
                b71.a aVar2 = b71.a.r;
                sy.y.j(obj);
                throw th3;
        }
    }
}
