package t00;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b4 extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Throwable x;
    public final /* synthetic */ k71.w y;
    public final /* synthetic */ rm0.o4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b4(k71.w wVar, rm0.o4 o4Var, String str, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.y = wVar;
        this.z = o4Var;
        this.A = str;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        Throwable th2 = (Throwable) obj2;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                b4 b4Var = new b4(this.y, this.z, this.A, cVar, 0);
                b4Var.x = th2;
                b4Var.v(w61.a0.a);
                break;
            default:
                b4 b4Var2 = new b4(this.y, this.z, this.A, cVar, 1);
                b4Var2.x = th2;
                b4Var2.v(w61.a0.a);
                break;
        }
        return b71.a.r;
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                Throwable th2 = this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw th2;
                }
                sy.y.j(obj);
                tt.e eVar = (tt.e) this.y.r;
                if (eVar == null) {
                    throw th2;
                }
                com.github.service.wrapper.b bVar = this.z.s;
                tt.g gVar = new tt.g();
                this.x = th2;
                this.w = 1;
                if (bVar.p(gVar, eVar, this.A, this) == aVar) {
                    return aVar;
                }
                throw th2;
            default:
                Throwable th3 = this.x;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw th3;
                }
                sy.y.j(obj);
                tt.e eVar2 = (tt.e) this.y.r;
                if (eVar2 == null) {
                    throw th3;
                }
                com.github.service.wrapper.b bVar2 = this.z.s;
                tt.g gVar2 = new tt.g();
                this.x = th3;
                this.w = 1;
                if (bVar2.p(gVar2, eVar2, this.A, this) == aVar2) {
                    return aVar2;
                }
                throw th3;
        }
    }
}
