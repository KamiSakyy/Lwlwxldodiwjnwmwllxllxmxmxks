package xy0;

import jn0.gb;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ gb x;
    public final /* synthetic */ q y;
    public final /* synthetic */ io0.g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(gb gbVar, q qVar, io0.g gVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = gbVar;
        this.y = qVar;
        this.z = gVar;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                io0.g gVar = this.z;
                return new g(this.x, this.y, gVar, (a71.c) obj, 0).v(a0.a);
            default:
                io0.g gVar2 = this.z;
                return new g(this.x, this.y, gVar2, (a71.c) obj, 1).v(a0.a);
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
                    gb gbVar = this.x;
                    if (gbVar != null) {
                        a00.b bVar = this.y.c;
                        this.w = 1;
                        if (bVar.j(this.z, gbVar, this) == aVar) {
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
                    gb gbVar2 = this.x;
                    if (gbVar2 != null) {
                        a00.b bVar2 = this.y.c;
                        this.w = 1;
                        if (bVar2.j(this.z, gbVar2, this) == aVar2) {
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
