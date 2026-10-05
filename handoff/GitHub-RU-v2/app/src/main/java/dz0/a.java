package dz0;

import ac0.b;
import c71.j;
import j71.c;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a extends j implements c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ b x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = bVar;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new a(this.x, cVar, 0).v(a0.a);
            default:
                return new a(this.x, cVar, 1).v(a0.a);
        }
    }

    @Override // c71.a
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
                vy0.a aVar2 = (vy0.a) this.x.t;
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
                vy0.a aVar4 = (vy0.a) this.x.t;
                this.w = 1;
                Object a = aVar4.a(this);
                return a == aVar3 ? aVar3 : a;
        }
    }
}
