package cn;

import androidx.compose.runtime.t;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import sy.y;
import v71.b0;
import v71.z;
import w61.a0;
import xn.f0;
import xn.f3;
import xn.r0;
import xn.w;
import xn.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i, a71.c cVar, int i2) {
        super(i, cVar);
        this.v = i2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                e eVar = new e(2, cVar, 0);
                eVar.x = obj;
                return eVar;
            case 1:
                e eVar2 = new e(2, cVar, 1);
                eVar2.x = obj;
                return eVar2;
            case 2:
                e eVar3 = new e(2, cVar, 2);
                eVar3.x = obj;
                return eVar3;
            case 3:
                e eVar4 = new e(2, cVar, 3);
                eVar4.x = obj;
                return eVar4;
            case 4:
                e eVar5 = new e(2, cVar, 4);
                eVar5.x = obj;
                return eVar5;
            case 5:
                e eVar6 = new e(2, cVar, 5);
                eVar6.x = obj;
                return eVar6;
            default:
                e eVar7 = new e(2, cVar, 6);
                eVar7.x = obj;
                return eVar7;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 1:
                return r((a71.c) obj2, (z) obj).v(a0.a);
            case 2:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 3:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 4:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 5:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            default:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        z zVar;
        switch (this.v) {
            case 0:
                y71.j jVar = (y71.j) this.x;
                b71.a aVar = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    this.x = null;
                    this.w = 1;
                    if (jVar.c(a0Var, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    y.j(obj);
                    zVar = (z) this.x;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zVar = (z) this.x;
                    y.j(obj);
                }
                while (b0.v(zVar.K())) {
                    ef.b bVar = new ef.b(13);
                    this.x = zVar;
                    this.w = 1;
                    a71.h hVar = ((c71.c) this).s;
                    k71.k.d(hVar);
                    if (t.v(hVar).t(bVar, this) == aVar2) {
                        return aVar2;
                    }
                }
                return a0.a;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                a0 a0Var2 = a0.a;
                if (i3 == 0) {
                    y.j(obj);
                    y71.j jVar2 = (y71.j) this.x;
                    this.w = 1;
                    if (jVar2.c(a0Var2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var2;
            case 3:
                y71.j jVar3 = (y71.j) this.x;
                b71.a aVar4 = b71.a.r;
                int i4 = this.w;
                if (i4 == 0) {
                    y.j(obj);
                    x xVar = new x("", (String) null, (String) null, (ZonedDateTime) null, (ArrayList) null, (xn.a0) null, (List) null, (List) null, (ArrayList) null, w.r, (r0) null, (f0) null, (f3) null, 15870);
                    this.x = null;
                    this.w = 1;
                    if (jVar3.c(xVar, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 4:
                y71.j jVar4 = (y71.j) this.x;
                b71.a aVar5 = b71.a.r;
                int i5 = this.w;
                a0 a0Var3 = a0.a;
                if (i5 == 0) {
                    y.j(obj);
                    this.x = null;
                    this.w = 1;
                    if (jVar4.c(a0Var3, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var3;
            case 5:
                y71.j jVar5 = (y71.j) this.x;
                b71.a aVar6 = b71.a.r;
                int i6 = this.w;
                a0 a0Var4 = a0.a;
                if (i6 == 0) {
                    y.j(obj);
                    this.x = null;
                    this.w = 1;
                    if (jVar5.c(a0Var4, this) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var4;
            default:
                y71.j jVar6 = (y71.j) this.x;
                b71.a aVar7 = b71.a.r;
                int i7 = this.w;
                a0 a0Var5 = a0.a;
                if (i7 == 0) {
                    y.j(obj);
                    this.x = null;
                    this.w = 1;
                    if (jVar6.c(a0Var5, this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var5;
        }
    }
    public Object g(Object p1, Object p2) { return null; }
}
