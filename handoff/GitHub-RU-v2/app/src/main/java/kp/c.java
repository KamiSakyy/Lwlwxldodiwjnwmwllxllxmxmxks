package kp;

import a61.f0Shadow;
import go0.z;
import sy.y;
import w61.a0;
import y71.n1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ z x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(z zVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.x = zVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                return new c(this.x, cVar, 0);
            default:
                return new c(this.x, cVar, 1);
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
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return a0.a;
                }
                y.j(obj);
                z zVar = this.x;
                y1 a = zVar.w.a();
                b bVar = new b(zVar);
                this.w = 1;
                a.b(bVar, this);
                return aVar;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    z zVar2 = this.x;
                    y71.i o = n1.o(zVar2.B.h(), 2000L);
                    f0Shadow f0Var = new f0Shadow(5, zVar2);
                    this.w = 1;
                    if (o.b(f0Var, this) == aVar2) {
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
    public Object v(Object p1) { return null; }
}
