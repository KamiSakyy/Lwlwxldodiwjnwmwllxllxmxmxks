package wb0;

import aa.v0;
import sy.y;
import u10.eaShadow;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ eaShadow x;
    public final /* synthetic */ q y;
    public final /* synthetic */ s20.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(eaShadow eaVar, q qVar, s20.f fVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = eaVar;
        this.y = qVar;
        this.z = fVar;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                s20.f fVar = this.z;
                return new g(this.x, this.y, fVar, (a71.c) obj, 0).v(a0.a);
            default:
                s20.f fVar2 = this.z;
                return new g(this.x, this.y, fVar2, (a71.c) obj, 1).v(a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    v0 v0Var = this.x;
                    if (v0Var != null) {
                        jy.d dVar = this.y.c;
                        this.w = 1;
                        if (dVar.j(this.z, v0Var, this) == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    v0 v0Var2 = this.x;
                    if (v0Var2 != null) {
                        jy.d dVar2 = this.y.c;
                        this.w = 1;
                        if (dVar2.j(this.z, v0Var2, this) == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
        }
    }
}
