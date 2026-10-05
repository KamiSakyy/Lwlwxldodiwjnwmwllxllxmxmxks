package c00;

import h0.y0;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends c71.j implements j71.f {
    public final /* synthetic */ int v;
    public int w;
    public /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aa.d dVar, a71.c cVar) {
        super(3, cVar);
        this.v = 3;
        this.y = dVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        switch (this.v) {
            case 0:
                return new b((u) this.z, (String) this.x, (String) this.y, (a71.c) obj3, 0).v(a0.a);
            case 1:
                return new b((u) this.z, (String) this.x, (String) this.y, (a71.c) obj3, 1).v(a0.a);
            case 2:
                b bVar = new b((y0) this.x, (h0.l) this.y, (a71.c) obj3);
                bVar.z = (h0.n) obj;
                return bVar.v(a0.a);
            case 3:
                b bVar2 = new b((aa.d) this.y, (a71.c) obj3);
                bVar2.z = (y71.j) obj;
                bVar2.x = (na.d) obj2;
                return bVar2.v(a0.a);
            default:
                b bVar3 = new b((j71.e) this.y, (a71.c) obj3);
                bVar3.z = (y71.j) obj;
                bVar3.x = obj2;
                return bVar3.v(a0.a);
        }
    }

    public final Object v(Object obj) {
        y71.j jVar;
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                a0 a0Var = a0.a;
                if (i == 0) {
                    y.j(obj);
                    u uVar = (u) this.z;
                    String str = (String) this.x;
                    String str2 = (String) this.y;
                    this.w = 1;
                    Object h = uVar.t.h(str2, x61.l.j0(new String[]{x.i.f(str, ".id"), x.i.f(str2, ".id")}), this);
                    if (h != aVar) {
                        h = a0Var;
                    }
                    if (h == aVar) {
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
                a0 a0Var2 = a0.a;
                if (i2 == 0) {
                    y.j(obj);
                    u uVar2 = (u) this.z;
                    String str3 = (String) this.x;
                    String str4 = (String) this.y;
                    this.w = 1;
                    Object h2 = uVar2.t.h(str4, x61.l.j0(new String[]{x.i.f(str3, ".id"), x.i.f(str4, ".id")}), this);
                    if (h2 != aVar2) {
                        h2 = a0Var2;
                    }
                    if (h2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0Var2;
            case 2:
                b71.a aVar3 = b71.a.r;
                int i3 = this.w;
                if (i3 == 0) {
                    y.j(obj);
                    h0.n nVar = (h0.n) this.z;
                    y0 y0Var = (y0) this.x;
                    fg.d dVar = new fg.d(3, (h0.l) this.y, nVar);
                    this.w = 1;
                    if (y0Var.s(dVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                return a0.a;
            case 3:
                b71.a aVar4 = b71.a.r;
                int i4 = this.w;
                boolean z = false;
                if (i4 != 0) {
                    if (i4 == 1) {
                        y.j(obj);
                        return Boolean.valueOf(z);
                    }
                    if (i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                    z = true;
                    return Boolean.valueOf(z);
                }
                y.j(obj);
                y71.j jVar2 = (y71.j) this.z;
                na.e eVar = (na.d) this.x;
                if (!(eVar instanceof na.h) && !(eVar instanceof na.b)) {
                    if (eVar instanceof na.g) {
                        this.z = null;
                        this.w = 1;
                        if (jVar2.c(eVar, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (eVar instanceof na.e) {
                            System.out.println((Object) ("Received general error while executing operation " + ((aa.d) this.y).a.name() + ": " + eVar.a));
                        } else {
                            this.z = null;
                            this.w = 2;
                            if (jVar2.c(eVar, this) == aVar4) {
                                return aVar4;
                            }
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            default:
                b71.a aVar5 = b71.a.r;
                int i5 = this.w;
                if (i5 == 0) {
                    y.j(obj);
                    jVar = (y71.j) this.z;
                    Object obj2 = this.x;
                    c71.j jVar3 = (c71.j) this.y;
                    this.z = jVar;
                    this.w = 1;
                    obj = jVar3.s(obj2, this);
                    if (obj == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return a0.a;
                    }
                    jVar = (y71.j) this.z;
                    y.j(obj);
                }
                this.z = null;
                this.w = 2;
                if (jVar.c(obj, this) == aVar5) {
                    return aVar5;
                }
                return a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(y0 y0Var, h0.l lVar, a71.c cVar) {
        super(3, cVar);
        this.v = 2;
        this.x = y0Var;
        this.y = lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(j71.e eVar, a71.c cVar) {
        super(3, cVar);
        this.v = 4;
        this.y = (c71.j) eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, String str, String str2, a71.c cVar, int i) {
        super(3, cVar);
        this.v = i;
        this.z = obj;
        this.x = str;
        this.y = str2;
    }
}
