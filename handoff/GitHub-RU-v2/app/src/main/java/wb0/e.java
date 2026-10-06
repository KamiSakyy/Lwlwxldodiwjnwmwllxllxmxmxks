package wb0;

import aa.v0;
import sy.y;
import u10.bl;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public class e extends c71.j implements j71.c {
    public final /* synthetic */ int A;
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ bl x;
    public final /* synthetic */ q y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(bl blVar, q qVar, String str, int i, a71.c cVar, int i2) {
        super(1, cVar);
        this.v = i2;
        this.x = blVar;
        this.y = qVar;
        this.z = str;
        this.A = i;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                int i = this.A;
                return new e(this.x, this.y, this.z, i, (a71.c) obj, 0).v(a0.a);
            default:
                int i2 = this.A;
                return new e(this.x, this.y, this.z, i2, (a71.c) obj, 1).v(a0.a);
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
                        jy.d dVar = this.y.e;
                        s20.h hVar = new s20.h(this.z, this.A);
                        this.w = 1;
                        if (dVar.j(hVar, v0Var, this) == aVar) {
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
                        jy.d dVar2 = this.y.e;
                        s20.h hVar2 = new s20.h(this.z, this.A);
                        this.w = 1;
                        if (dVar2.j(hVar2, v0Var2, this) == aVar2) {
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
