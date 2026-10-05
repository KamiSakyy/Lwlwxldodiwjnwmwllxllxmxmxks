package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c1 extends c71.j implements j71.f {
    public final /* synthetic */ int v = 0;
    public int w;
    public /* synthetic */ j x;
    public /* synthetic */ Object[] y;
    public final /* synthetic */ c71.j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a71.c cVar, j71.h hVar) {
        super(3, cVar);
        this.z = (c71.j) hVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        j jVar = (j) obj;
        Object[] objArr = (Object[]) obj2;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                c1 c1Var = new c1(cVar, (j71.h) this.z);
                c1Var.x = jVar;
                c1Var.y = objArr;
                return c1Var.v(w61.a0.a);
            default:
                c1 c1Var2 = new c1(cVar, (j71.i) this.z);
                c1Var2.x = jVar;
                c1Var2.y = objArr;
                return c1Var2.v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        j jVar;
        j jVar2;
        c1 c1Var;
        switch (this.v) {
            case 0:
                b71.a aVar = b71.a.r;
                int i = this.w;
                if (i == 0) {
                    sy.y.j(obj);
                    jVar = this.x;
                    Object[] objArr = this.y;
                    Object obj2 = objArr[0];
                    Object obj3 = objArr[1];
                    Object obj4 = objArr[2];
                    Object obj5 = objArr[3];
                    this.x = jVar;
                    this.w = 1;
                    obj = this.z.t(obj2, obj3, obj4, obj5, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    jVar = this.x;
                    sy.y.j(obj);
                }
                this.x = null;
                this.w = 2;
                if (jVar.c(obj, this) == aVar) {
                    return aVar;
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i2 = this.w;
                if (i2 == 0) {
                    sy.y.j(obj);
                    jVar2 = this.x;
                    Object[] objArr2 = this.y;
                    Object obj6 = objArr2[0];
                    Object obj7 = objArr2[1];
                    Object obj8 = objArr2[2];
                    Object obj9 = objArr2[3];
                    Object obj10 = objArr2[4];
                    this.x = jVar2;
                    this.w = 1;
                    obj = this.z.o(obj6, obj7, obj8, obj9, obj10, this);
                    c1Var = this;
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return w61.a0.a;
                    }
                    jVar2 = this.x;
                    sy.y.j(obj);
                    c1Var = this;
                }
                c1Var.x = null;
                c1Var.w = 2;
                if (jVar2.c(obj, this) == aVar2) {
                    return aVar2;
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(a71.c cVar, j71.i iVar) {
        super(3, cVar);
        this.z = (c71.j) iVar;
    }
}
