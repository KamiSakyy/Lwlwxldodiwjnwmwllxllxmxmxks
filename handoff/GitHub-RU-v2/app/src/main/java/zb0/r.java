package zb0;

import bz0.c0;
import c30.r0;
import c30.s0;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ c0 x;
    public final /* synthetic */ r0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(c0 c0Var, r0 r0Var, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = c0Var;
        this.y = r0Var;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new r(this.x, this.y, cVar, 0).v(a0.a);
            default:
                return new r(this.x, this.y, cVar, 1).v(a0.a);
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
                    s0 s0Var = new s0(0);
                    r0 r0Var = this.y;
                    String str = r0Var.a;
                    this.w = 1;
                    if (bVar.p(s0Var, r0Var, str, this) == aVar) {
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
                    s0 s0Var2 = new s0(0);
                    r0 r0Var2 = this.y;
                    String str2 = r0Var2.a;
                    this.w = 1;
                    if (bVar2.p(s0Var2, r0Var2, str2, this) == aVar2) {
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
