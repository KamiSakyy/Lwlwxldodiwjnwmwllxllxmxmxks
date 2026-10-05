package bz0;

import ap0.d6;
import ap0.f6;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z extends c71.j implements j71.c {
    public final /* synthetic */ int v;
    public int w;
    public final /* synthetic */ c0 x;
    public final /* synthetic */ d6 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(c0 c0Var, d6 d6Var, a71.c cVar, int i) {
        super(1, cVar);
        this.v = i;
        this.x = c0Var;
        this.y = d6Var;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        a71.c cVar = (a71.c) obj;
        switch (this.v) {
            case 0:
                return new z(this.x, this.y, cVar, 0).v(w61.a0.a);
            default:
                return new z(this.x, this.y, cVar, 1).v(w61.a0.a);
        }
    }

    @Override // c71.a
    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar = this.x.b;
                    f6 f6Var = new f6();
                    d6 d6Var = this.y;
                    String str = d6Var.a;
                    this.w = 1;
                    if (bVar.p(f6Var, d6Var, str, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    com.github.service.wrapper.b bVar2 = this.x.b;
                    f6 f6Var2 = new f6();
                    d6 d6Var2 = this.y;
                    String str2 = d6Var2.a;
                    this.w = 1;
                    if (bVar2.p(f6Var2, d6Var2, str2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}
