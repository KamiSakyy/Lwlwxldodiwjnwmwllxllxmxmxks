package kp;

import go0.z;
import java.util.LinkedHashSet;
import java.util.Set;
import sy.y;
import w61.a0;
import y71.n1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o extends c71.j implements j71.e {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ z y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(z zVar, a71.c cVar, int i) {
        super(2, cVar);
        this.v = i;
        this.y = zVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.v) {
            case 0:
                o oVar = new o(this.y, cVar, 0);
                oVar.x = obj;
                return oVar;
            case 1:
                o oVar2 = new o(this.y, cVar, 1);
                oVar2.x = obj;
                return oVar2;
            case 2:
                o oVar3 = new o(this.y, cVar, 2);
                oVar3.x = obj;
                return oVar3;
            case 3:
                o oVar4 = new o(this.y, cVar, 3);
                oVar4.x = obj;
                return oVar4;
            case 4:
                o oVar5 = new o(this.y, cVar, 4);
                oVar5.x = obj;
                return oVar5;
            case 5:
                o oVar6 = new o(this.y, cVar, 5);
                oVar6.x = obj;
                return oVar6;
            case 6:
                o oVar7 = new o(this.y, cVar, 6);
                oVar7.x = obj;
                return oVar7;
            case 7:
                o oVar8 = new o(this.y, cVar, 7);
                oVar8.x = obj;
                return oVar8;
            case 8:
                o oVar9 = new o(this.y, cVar, 8);
                oVar9.x = obj;
                return oVar9;
            default:
                o oVar10 = new o(this.y, cVar, 9);
                oVar10.x = obj;
                return oVar10;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.v) {
            case 0:
                return r((a71.c) obj2, (qn.g) obj).v(a0.a);
            case 1:
                return r((a71.c) obj2, (qn.g) obj).v(a0.a);
            case 2:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 3:
                return r((a71.c) obj2, (qn.g) obj).v(a0.a);
            case 4:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 5:
                return r((a71.c) obj2, (qn.g) obj).v(a0.a);
            case 6:
                return r((a71.c) obj2, (y71.j) obj).v(a0.a);
            case 7:
                return r((a71.c) obj2, (qn.g) obj).v(a0.a);
            case 8:
                return r((a71.c) obj2, (qn.g) obj).v(a0.a);
            default:
                return r((a71.c) obj2, (qn.g) obj).v(a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.v) {
            case 0:
                qn.g gVar = (qn.g) this.x;
                y71.s sVar = b71.a.r;
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
                this.w = 1;
                y71.s k = z.k(this.y, gVar);
                return k == sVar ? sVar : k;
            case 1:
                qn.g gVar2 = (qn.g) this.x;
                y71.s sVar2 = b71.a.r;
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
                this.w = 1;
                y71.s k2 = z.k(this.y, gVar2);
                return k2 == sVar2 ? sVar2 : k2;
            case 2:
                y71.j jVar = (y71.j) this.x;
                b71.a aVar = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    this.x = jVar;
                    this.w = 1;
                    z zVar = this.y;
                    obj = n1.v(n1.y(new gl.f(com.github.service.wrapper.a.o(zVar.s, new so.d(), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 8), zVar.u), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    y.j(obj);
                }
                qn.g gVar3 = (qn.g) obj;
                if (gVar3 != null) {
                    this.x = null;
                    this.w = 2;
                    if (jVar.c(gVar3, this) == aVar) {
                        return aVar;
                    }
                }
                return a0.a;
            case 3:
                qn.g gVar4 = (qn.g) this.x;
                y71.s sVar3 = b71.a.r;
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
                this.w = 1;
                y71.s k3 = z.k(this.y, gVar4);
                return k3 == sVar3 ? sVar3 : k3;
            case 4:
                y71.j jVar2 = (y71.j) this.x;
                b71.a aVar2 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    this.x = jVar2;
                    this.w = 1;
                    z zVar2 = this.y;
                    obj = n1.v(n1.y(new gl.f(com.github.service.wrapper.a.o(zVar2.s, new so.d(), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 9), zVar2.u), this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    y.j(obj);
                }
                qn.g gVar5 = (qn.g) obj;
                if (gVar5 != null) {
                    this.x = null;
                    this.w = 2;
                    if (jVar2.c(gVar5, this) == aVar2) {
                        return aVar2;
                    }
                }
                return a0.a;
            case 5:
                qn.g gVar6 = (qn.g) this.x;
                y71.s sVar4 = b71.a.r;
                int i6 = this.w;
                if (i6 != 0) {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.w = 1;
                y71.s k4 = z.k(this.y, gVar6);
                return k4 == sVar4 ? sVar4 : k4;
            case 6:
                y71.j jVar3 = (y71.j) this.x;
                b71.a aVar3 = b71.a.r;
                int i7 = this.w;
                if (i7 == 0) {
                    y.j(obj);
                    this.x = jVar3;
                    this.w = 1;
                    z zVar3 = this.y;
                    obj = n1.v(n1.y(new gl.f(com.github.service.wrapper.a.o(zVar3.s, new so.d(), (ga.h) null, false, (LinkedHashSet) null, (Set) null, 58), 10), zVar3.u), this);
                    if (obj == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    y.j(obj);
                }
                qn.g gVar7 = (qn.g) obj;
                if (gVar7 != null) {
                    this.x = null;
                    this.w = 2;
                    if (jVar3.c(gVar7, this) == aVar3) {
                        return aVar3;
                    }
                }
                return a0.a;
            case 7:
                qn.g gVar8 = (qn.g) this.x;
                y71.s sVar5 = b71.a.r;
                int i8 = this.w;
                if (i8 != 0) {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.w = 1;
                y71.s k5 = z.k(this.y, gVar8);
                return k5 == sVar5 ? sVar5 : k5;
            case 8:
                qn.g gVar9 = (qn.g) this.x;
                y71.s sVar6 = b71.a.r;
                int i9 = this.w;
                if (i9 != 0) {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.w = 1;
                y71.s k6 = z.k(this.y, gVar9);
                return k6 == sVar6 ? sVar6 : k6;
            default:
                qn.g gVar10 = (qn.g) this.x;
                y71.s sVar7 = b71.a.r;
                int i11 = this.w;
                if (i11 != 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    return obj;
                }
                y.j(obj);
                this.x = null;
                this.w = 1;
                y71.s k7 = z.k(this.y, gVar10);
                return k7 == sVar7 ? sVar7 : k7;
        }
    }
}
