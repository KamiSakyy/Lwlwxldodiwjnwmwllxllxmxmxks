package sm0;

import kc0.ma;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ ma x;
    public final /* synthetic */ r y;
    public final /* synthetic */ id0.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(ma maVar, r rVar, id0.f fVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = maVar;
        this.y = rVar;
        this.z = fVar;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        switch (this.v) {
            case 0:
                id0.f fVar = this.z;
                return new h(this.x, this.y, fVar, (a71.c) obj, 0).v(a0.a);
            default:
                id0.f fVar2 = this.z;
                return new h(this.x, this.y, fVar2, (a71.c) obj, 1).v(a0.a);
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
                    ma maVar = this.x;
                    if (maVar != null) {
                        a00.b bVar = this.y.c;
                        this.w = 1;
                        if (bVar.j(this.z, maVar, this) == aVar) {
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
                    ma maVar2 = this.x;
                    if (maVar2 != null) {
                        a00.b bVar2 = this.y.c;
                        this.w = 1;
                        if (bVar2.j(this.z, maVar2, this) == aVar2) {
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
