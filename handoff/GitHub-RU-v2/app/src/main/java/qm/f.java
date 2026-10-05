package qm;

import c71.j;
import sy.y;
import w61.a0;
import z01.u0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f extends j implements j71.f {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ u0 x;
    public /* synthetic */ boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        int i = this.v;
        u0 u0Var = (u0) obj;
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        a71.c cVar = (a71.c) obj3;
        switch (i) {
            case 0:
                f fVar = new f(3, cVar, 0);
                fVar.x = u0Var;
                fVar.y = booleanValue;
                return fVar.v(a0.a);
            case 1:
                f fVar2 = new f(3, cVar, 1);
                fVar2.x = u0Var;
                fVar2.y = booleanValue;
                return fVar2.v(a0.a);
            case 2:
                f fVar3 = new f(3, cVar, 2);
                fVar3.x = u0Var;
                fVar3.y = booleanValue;
                return fVar3.v(a0.a);
            case 3:
                f fVar4 = new f(3, cVar, 3);
                fVar4.x = u0Var;
                fVar4.y = booleanValue;
                return fVar4.v(a0.a);
            case 4:
                f fVar5 = new f(3, cVar, 4);
                fVar5.x = u0Var;
                fVar5.y = booleanValue;
                return fVar5.v(a0.a);
            default:
                f fVar6 = new f(3, cVar, 5);
                fVar6.x = u0Var;
                fVar6.y = booleanValue;
                return fVar6.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                u0 u0Var = this.x;
                boolean z = this.y;
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
                this.x = null;
                this.y = z;
                this.w = 1;
                Object o = u0Var.o(z);
                return o == aVar ? aVar : o;
            case 1:
                u0 u0Var2 = this.x;
                boolean z2 = this.y;
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.y = z2;
                this.w = 1;
                Object s = u0Var2.s(z2);
                return s == aVar2 ? aVar2 : s;
            case 2:
                u0 u0Var3 = this.x;
                boolean z3 = this.y;
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.y = z3;
                this.w = 1;
                Object q = u0Var3.q(z3);
                return q == aVar3 ? aVar3 : q;
            case 3:
                u0 u0Var4 = this.x;
                boolean z4 = this.y;
                b71.a aVar4 = b71.a.r;
                int i4 = this.w;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.y = z4;
                this.w = 1;
                Object a = u0Var4.a(z4);
                return a == aVar4 ? aVar4 : a;
            case 4:
                u0 u0Var5 = this.x;
                boolean z5 = this.y;
                b71.a aVar5 = b71.a.r;
                int i5 = this.w;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.y = z5;
                this.w = 1;
                Object i6 = u0Var5.i(z5);
                return i6 == aVar5 ? aVar5 : i6;
            default:
                u0 u0Var6 = this.x;
                boolean z6 = this.y;
                b71.a aVar6 = b71.a.r;
                int i7 = this.w;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.y = z6;
                this.w = 1;
                Object k = u0Var6.k(z6);
                return k == aVar6 ? aVar6 : k;
        }
    }
}
