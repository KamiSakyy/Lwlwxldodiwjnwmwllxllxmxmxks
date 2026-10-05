package wy0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 extends c71.j implements j71.f {
    public final /* synthetic */ String A;
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Throwable x;
    public final /* synthetic */ k71.w y;
    public final /* synthetic */ rm0.o4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l3(k71.w wVar, rm0.o4 o4Var, String str, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.y = wVar;
        this.z = o4Var;
        this.A = str;
    }

    @Override // j71.f
    public final Object f(Object obj, Object obj2, Object obj3) {
        Throwable th = (Throwable) obj2;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                l3 l3Var = new l3(this.y, this.z, this.A, cVar, 0);
                l3Var.x = th;
                l3Var.v(w61.a0.a);
                break;
            default:
                l3 l3Var2 = new l3(this.y, this.z, this.A, cVar, 1);
                l3Var2.x = th;
                l3Var2.v(w61.a0.a);
                break;
        }
        return b71.a.r;
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                Throwable th = this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw th;
                }
                sy.y.j(obj);
                ks0.e eVar = (ks0.e) this.y.r;
                if (eVar == null) {
                    throw th;
                }
                com.github.service.wrapper.b bVar = this.z.s;
                ks0.g gVar = new ks0.g();
                this.x = th;
                this.w = 1;
                if (bVar.p(gVar, eVar, this.A, this) == aVar) {
                    return aVar;
                }
                throw th;
            default:
                Throwable th2 = this.x;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                    throw th2;
                }
                sy.y.j(obj);
                ks0.e eVar2 = (ks0.e) this.y.r;
                if (eVar2 == null) {
                    throw th2;
                }
                com.github.service.wrapper.b bVar2 = this.z.s;
                ks0.g gVar2 = new ks0.g();
                this.x = th2;
                this.w = 1;
                if (bVar2.p(gVar2, eVar2, this.A, this) == aVar2) {
                    return aVar2;
                }
                throw th2;
        }
    }
}
