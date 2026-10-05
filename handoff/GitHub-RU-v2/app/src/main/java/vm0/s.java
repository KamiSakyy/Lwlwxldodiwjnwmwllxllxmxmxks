package vm0;

import bz0.c0;
import sd0.b1;
import sd0.d1;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class s extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ c0 x;
    public final /* synthetic */ b1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(c0 c0Var, b1 b1Var, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = c0Var;
        this.y = b1Var;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new s(this.x, this.y, cVar, 0).v(a0.a);
            default:
                return new s(this.x, this.y, cVar, 1).v(a0.a);
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
                    com.github.service.wrapper.b bVar = this.x.b;
                    d1 d1Var = new d1();
                    b1 b1Var = this.y;
                    String str = b1Var.a;
                    this.w = 1;
                    if (bVar.p(d1Var, b1Var, str, this) == aVar) {
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
                    com.github.service.wrapper.b bVar2 = this.x.b;
                    d1 d1Var2 = new d1();
                    b1 b1Var2 = this.y;
                    String str2 = b1Var2.a;
                    this.w = 1;
                    if (bVar2.p(d1Var2, b1Var2, str2, this) == aVar2) {
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
