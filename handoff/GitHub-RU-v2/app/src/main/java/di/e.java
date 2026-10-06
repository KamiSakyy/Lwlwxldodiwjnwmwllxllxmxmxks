package di;

import a61.o;
import c71.j;
import f1.t9;
import j71.f;
import java.io.IOException;
import ma.k;
import na.m;
import sy.y;
import w61.a0;
import x71.hShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public class e extends j implements f {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, a71.c cVar) {
        super(i, cVar);
        this.v = 0;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.v) {
            case 0:
                e eVar = new e(3, (a71.c) obj3);
                eVar.x = (y71.j) obj;
                eVar.y = (Throwable) obj2;
                return eVar.v(a0.a);
            case 1:
                return new e((e51.a) this.x, (o) this.y, (a71.c) obj3, 1).v(a0.a);
            default:
                return new e((k) this.x, (aa.d) this.y, (a71.c) obj3, 2).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                y71.j jVar = (y71.j) this.x;
                Throwable th2 = (Throwable) this.y;
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    y.j(obj);
                    if (!(th2 instanceof IOException)) {
                        throw th2;
                    }
                    s5.b n = b41.b.n();
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (jVar.c(n, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    t9 t9Var = (t9) ((e51.a) this.x).s;
                    o oVar = (o) this.y;
                    this.w = 1;
                    if (oVar.s(t9Var, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            default:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    hShadow hVar = ((k) this.x).g;
                    m mVar = new m((aa.d) this.y);
                    this.w = 1;
                    if (hVar.l(this, mVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.x = obj;
        this.y = obj2;
    }
}
