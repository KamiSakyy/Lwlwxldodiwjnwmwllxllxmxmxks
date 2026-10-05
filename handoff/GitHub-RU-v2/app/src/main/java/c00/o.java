package c00;

import java.util.List;
import java.util.Set;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ y71.j x;
    public /* synthetic */ Object[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        y71.j jVar = (y71.j) obj;
        Object[] objArr = (Object[]) obj2;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                o oVar = new o(3, cVar, 0);
                oVar.x = jVar;
                oVar.y = objArr;
                return oVar.v(a0.a);
            case 1:
                o oVar2 = new o(3, cVar, 1);
                oVar2.x = jVar;
                oVar2.y = objArr;
                return oVar2.v(a0.a);
            case 2:
                o oVar3 = new o(3, cVar, 2);
                oVar3.x = jVar;
                oVar3.y = objArr;
                return oVar3.v(a0.a);
            case 3:
                o oVar4 = new o(3, cVar, 3);
                oVar4.x = jVar;
                oVar4.y = objArr;
                return oVar4.v(a0.a);
            default:
                o oVar5 = new o(3, cVar, 4);
                oVar5.x = jVar;
                oVar5.y = objArr;
                return oVar5.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        z8.a aVar;
        z8.a aVar2;
        switch (this.v) {
            case 0:
                b71.a aVar3 = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    y71.j jVar = this.x;
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (jVar.c(a0Var, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var;
            case 1:
                b71.a aVar4 = b71.a.r;
                int i2 = this.w;
                a0 a0Var2 = a0.a;
                if (i2 == 0) {
                    y.j(obj);
                    y71.j jVar2 = this.x;
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (jVar2.c(a0Var2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var2;
            case 2:
                b71.a aVar5 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    y71.j jVar3 = this.x;
                    Set K0 = x61.m.K0(x61.n.G(x61.l.g0((List[]) this.y)));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (jVar3.c(K0, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 3:
                b71.a aVar6 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    y.j(obj);
                    y71.j jVar4 = this.x;
                    Set K02 = x61.m.K0(x61.n.G(x61.l.g0((List[]) this.y)));
                    this.x = null;
                    this.y = null;
                    this.w = 1;
                    if (jVar4.c(K02, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            default:
                b71.a aVar7 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    y71.j jVar5 = this.x;
                    z8.a[] aVarArr = (z8.c[]) this.y;
                    int length = aVarArr.length;
                    int i6 = 0;
                    while (true) {
                        aVar = z8.a.a;
                        if (i6 < length) {
                            aVar2 = aVarArr[i6];
                            if (k71.k.b(aVar2, aVar)) {
                                i6++;
                            }
                        } else {
                            aVar2 = null;
                        }
                    }
                    if (aVar2 != null) {
                        aVar = aVar2;
                    }
                    this.w = 1;
                    if (jVar5.c(aVar, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
        }
    }
}
