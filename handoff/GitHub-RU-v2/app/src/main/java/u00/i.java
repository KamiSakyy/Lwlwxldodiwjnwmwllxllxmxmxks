package u00;

import jo.lc;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i extends c71.j implements j71.c {
    public final /* synthetic */ String A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ lc x;
    public final /* synthetic */ q y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(lc lcVar, q qVar, String str, String str2, int i, a71.c cVar, int i2) {
        super(1, cVar);
        this.v = i2;
        this.x = lcVar;
        this.y = qVar;
        this.z = str;
        this.A = str2;
        this.B = i;
    }

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

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    lc lcVar = this.x;
                    if (lcVar != null) {
                        jy.d dVar = this.y.d;
                        np.g gVar = new np.g(this.z, this.B, this.A);
                        this.w = 1;
                        if (dVar.j(gVar, lcVar, this) == aVar) {
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
                    lc lcVar2 = this.x;
                    if (lcVar2 != null) {
                        jy.d dVar2 = this.y.d;
                        np.g gVar2 = new np.g(this.z, this.B, this.A);
                        this.w = 1;
                        if (dVar2.j(gVar2, lcVar2, this) == aVar2) {
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
    public Object b(Object p1) { return null; }
    public Object e(Object p1, Object p2) { return null; }
    public Object b(Object p1) { return null; }
    public Object e(Object p1, boolean p2) { return null; }
}
