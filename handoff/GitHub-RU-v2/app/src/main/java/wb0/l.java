package wb0;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ q x;
    public final /* synthetic */ e50.d y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(q qVar, e50.d dVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = qVar;
        this.y = dVar;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new l(this.x, this.y, cVar, 0).v(a0.a);
            default:
                return new l(this.x, this.y, cVar, 1).v(a0.a);
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
                    com.github.service.wrapper.b bVar = this.x.a;
                    e50.e eVar = new e50.e(0);
                    e50.d dVar = this.y;
                    String str = dVar.a;
                    this.w = 1;
                    if (bVar.p(eVar, dVar, str, this) == aVar) {
                        return aVar;
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
                    com.github.service.wrapper.b bVar2 = this.x.a;
                    e50.e eVar2 = new e50.e(0);
                    e50.d dVar2 = this.y;
                    String str2 = dVar2.a;
                    this.w = 1;
                    if (bVar2.p(eVar2, dVar2, str2, this) == aVar2) {
                        return aVar2;
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
