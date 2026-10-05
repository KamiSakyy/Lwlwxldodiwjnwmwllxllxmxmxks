package z71;

import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i extends c71.j implements j71.e {
    public final /* synthetic */ int v = 1;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ k y;
    public final /* synthetic */ y71.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, y71.j jVar, a71.c cVar) {
        super(2, cVar);
        this.y = kVar;
        this.z = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new i(this.y, this.z, this.x, cVar);
            default:
                i iVar = new i(this.y, this.z, cVar);
                iVar.x = obj;
                return iVar;
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.v) {
        }
        return r(cVar, zVar).v(a0.a);
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    c71.j jVar = this.y.v;
                    Object obj2 = this.x;
                    this.w = 1;
                    if (jVar.f(this.z, obj2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    v71.z zVar = (v71.z) this.x;
                    k71.w wVar = new k71.w();
                    k kVar = this.y;
                    y71.i iVar = kVar.u;
                    do0.q qVar = new do0.q(wVar, zVar, kVar, this.z);
                    this.w = 1;
                    if (iVar.b(qVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, y71.j jVar, Object obj, a71.c cVar) {
        super(2, cVar);
        this.y = kVar;
        this.z = jVar;
        this.x = obj;
    }
}
