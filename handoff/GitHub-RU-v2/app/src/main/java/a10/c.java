package a10;

import c71.j;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c extends j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ e x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = eVar;
    }

    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new c(this.x, cVar, 0).v(a0.a);
            default:
                return new c(this.x, cVar, 1).v(a0.a);
        }
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
                    return obj;
                }
                y.j(obj);
                s00.a aVar2 = this.x.s;
                this.w = 1;
                Object c = aVar2.c(this);
                return c == aVar ? aVar : c;
            default:
                b71.a aVar3 = b71.a.r;
                int i2 = this.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                s00.a aVar4 = this.x.s;
                this.w = 1;
                Object a = aVar4.a(this);
                return a == aVar3 ? aVar3 : a;
        }
    }
}
