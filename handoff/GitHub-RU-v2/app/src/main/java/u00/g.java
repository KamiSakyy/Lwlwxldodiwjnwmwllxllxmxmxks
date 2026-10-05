package u00;

import jo.dc;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ dc x;
    public final /* synthetic */ q y;
    public final /* synthetic */ np.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(dc dcVar, q qVar, np.f fVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = dcVar;
        this.y = qVar;
        this.z = fVar;
    }

    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                np.f fVar = this.z;
                return new g(this.x, this.y, fVar, (a71.c) obj, 0).v(a0.a);
            default:
                np.f fVar2 = this.z;
                return new g(this.x, this.y, fVar2, (a71.c) obj, 1).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    dc dcVar = this.x;
                    if (dcVar != null) {
                        jy.d dVar = this.y.c;
                        this.w = 1;
                        if (dVar.j(this.z, dcVar, this) == aVar) {
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
                    dc dcVar2 = this.x;
                    if (dcVar2 != null) {
                        jy.d dVar2 = this.y.c;
                        this.w = 1;
                        if (dVar2.j(this.z, dcVar2, this) == aVar2) {
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
