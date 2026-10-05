package u00;

import jo.pp;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends c71.j implements j71.c {
    public final /* synthetic */ int A;
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ pp x;
    public final /* synthetic */ q y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(pp ppVar, q qVar, String str, int i, a71.c cVar, int i2) {
        super(1, cVar);
        this.v = i2;
        this.x = ppVar;
        this.y = qVar;
        this.z = str;
        this.A = i;
    }

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

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    pp ppVar = this.x;
                    if (ppVar != null) {
                        jy.d dVar = this.y.e;
                        np.i iVar = new np.i(this.z, this.A);
                        this.w = 1;
                        if (dVar.j(iVar, ppVar, this) == aVar) {
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
                    pp ppVar2 = this.x;
                    if (ppVar2 != null) {
                        jy.d dVar2 = this.y.e;
                        np.i iVar2 = new np.i(this.z, this.A);
                        this.w = 1;
                        if (dVar2.j(iVar2, ppVar2, this) == aVar2) {
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
