package m81;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o extends c71.i implements j71.f {
    public int t;
    public /* synthetic */ w61.b u;
    public final /* synthetic */ l7.d v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l7.d dVar, a71.c cVar) {
        super(3, cVar);
        this.v = dVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        o oVar = new o(this.v, (a71.c) obj3);
        oVar.u = (w61.b) obj;
        return oVar.v(a0.a);
    }

    public final Object v(Object obj) {
        l7.d dVar = this.v;
        a7.q qVar = (a7.q) dVar.c;
        w61.b bVar = this.u;
        b71.a aVar = b71.a.r;
        int i = this.t;
        if (i == 0) {
            y.j(obj);
            byte G = qVar.G();
            if (G == 1) {
                return dVar.g(true);
            }
            if (G == 0) {
                return dVar.g(false);
            }
            if (G != 6) {
                if (G == 8) {
                    return dVar.f();
                }
                a7.q.s(qVar, "Can't begin reading element, unexpected token", 0, (String) null, 6);
                throw null;
            }
            this.u = null;
            this.t = 1;
            obj = l7.d.d(dVar, bVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y.j(obj);
        }
        return (kotlinx.serialization.json.b) obj;
    }
}
