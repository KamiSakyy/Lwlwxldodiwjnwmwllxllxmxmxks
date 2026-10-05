package wb0;

import aa.v0;
import sy.y;
import u10.ma;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i extends c71.j implements j71.c {
    public final /* synthetic */ String A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ ma x;
    public final /* synthetic */ q y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(ma maVar, q qVar, String str, String str2, int i, a71.c cVar, int i2) {
        super(1, cVar);
        this.v = i2;
        this.x = maVar;
        this.y = qVar;
        this.z = str;
        this.A = str2;
        this.B = i;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                int i = this.B;
                return new i(this.x, this.y, this.z, this.A, i, (a71.c) obj, 0).v(a0.a);
            default:
                int i2 = this.B;
                return new i(this.x, this.y, this.z, this.A, i2, (a71.c) obj, 1).v(a0.a);
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
                        jy.d dVar = this.y.d;
                        s20.g gVar = new s20.g(this.z, this.B, this.A);
                        this.w = 1;
                        if (dVar.j(gVar, v0Var, this) == aVar) {
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
                        jy.d dVar2 = this.y.d;
                        s20.g gVar2 = new s20.g(this.z, this.B, this.A);
                        this.w = 1;
                        if (dVar2.j(gVar2, v0Var2, this) == aVar2) {
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
