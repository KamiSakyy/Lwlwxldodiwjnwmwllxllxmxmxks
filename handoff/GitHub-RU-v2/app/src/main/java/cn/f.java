package cn;

import f1.u9;
import in.n0;
import k71.w;
import sy.y;
import w61.a0;
import z01.u0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.v) {
            case 0:
                f fVar = new f(3, (a71.c) obj3, 0);
                fVar.w = (l) obj;
                return fVar.v(a0.a);
            case 1:
                f fVar2 = new f((w) this.w, (a71.c) obj3, 1);
                a0 a0Var = a0.a;
                fVar2.v(a0Var);
                return a0Var;
            case 2:
                ((Number) obj2).floatValue();
                f fVar3 = new f((u9) this.w, (a71.c) obj3, 2);
                a0 a0Var2 = a0.a;
                fVar3.v(a0Var2);
                return a0Var2;
            case 3:
                f fVar4 = new f((n0) this.w, (a71.c) obj3, 3);
                a0 a0Var3 = a0.a;
                fVar4.v(a0Var3);
                return a0Var3;
            default:
                ((Boolean) obj2).booleanValue();
                f fVar5 = new f(3, (a71.c) obj3, 4);
                fVar5.w = (u0) obj;
                return fVar5.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        int i = this.v;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                l lVar = (l) this.w;
                b71.a aVar = b71.a.r;
                y.j(obj);
                return lVar;
            case 1:
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                try {
                    com.apollographql.apollo.internal.g gVar = (com.apollographql.apollo.internal.g) ((w) this.w).r;
                    if (gVar != null) {
                        gVar.close();
                    }
                } catch (Throwable th2) {
                    y.d(th2);
                }
                return a0Var;
            case 2:
                b71.a aVar3 = b71.a.r;
                y.j(obj);
                ((u9) this.w).F.a();
                return a0Var;
            case 3:
                b71.a aVar4 = b71.a.r;
                y.j(obj);
                ((n0) this.w).d.d();
                return a0Var;
            default:
                u0 u0Var = (u0) this.w;
                b71.a aVar5 = b71.a.r;
                y.j(obj);
                return u0Var.p();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.w = obj;
    }
}
