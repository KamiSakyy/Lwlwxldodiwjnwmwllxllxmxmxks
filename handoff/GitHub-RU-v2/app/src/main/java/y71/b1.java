package y71;

/* loaded from: /home/user/work/p/classes5.dex */
public final class b1Shadow extends c71.j implements j71.f {
    public final /* synthetic */ int v = 0;
    public int w;
    public /* synthetic */ j x;
    public /* synthetic */ Object[] y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(a71.c cVar, j71.g gVar) {
        super(3, cVar);
        this.z = gVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [j71.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j71.f, java.lang.Object] */
    public final Object f(Object obj, Object obj2, Object obj3) {
        j jVar = (j) obj;
        Object[] objArr = (Object[]) obj2;
        a71.c cVar = (a71.c) obj3;
        switch (this.v) {
            case 0:
                b1Shadow b1Var = new b1Shadow(cVar, (j71.g) this.z);
                b1Var.x = jVar;
                b1Var.y = objArr;
                return b1Var.v(w61.a0.a);
            default:
                b1Shadow b1Var2 = new b1Shadow((j71.f) this.z, cVar);
                b1Var2.x = jVar;
                b1Var2.y = objArr;
                return b1Var2.v(w61.a0.a);
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [j71.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [j71.f, java.lang.Object] */
    public final Object v(Object obj) {
        j jVar;
        j jVar2;
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
                    this.x = jVar;
                    this.w = 1;
                    obj = this.z.n(obj2, obj3, obj4, this);
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
                    Object obj5 = objArr2[0];
                    Object obj6 = objArr2[1];
                    this.x = jVar2;
                    this.w = 1;
                    obj = this.z.f(obj5, obj6, this);
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
                }
                this.x = null;
                this.w = 2;
                if (jVar2.c(obj, this) == aVar2) {
                    return aVar2;
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(j71.f fVar, a71.c cVar) {
        super(3, cVar);
        this.z = fVar;
    }
}
