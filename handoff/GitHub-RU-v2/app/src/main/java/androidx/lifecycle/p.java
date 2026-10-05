package androidx.lifecycle;

/* loaded from: /home/user/work/p/classes.dex */
public final class p extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f2917v;

    /* renamed from: w, reason: collision with root package name */
    public int f2918w;

    /* renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f2919x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ y71.i f2920y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(y71.i iVar, a71.c cVar, int i) {
        super(2, cVar);
        this.f2917v = i;
        this.f2920y = iVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f2917v) {
            case k5.f.J /* 0 */:
                p pVar = new p(this.f2920y, cVar, 0);
                pVar.f2919x = obj;
                return pVar;
            case 1:
                p pVar2 = new p(this.f2920y, cVar, 1);
                pVar2.f2919x = obj;
                return pVar2;
            default:
                p pVar3 = new p(this.f2920y, cVar, 2);
                pVar3.f2919x = obj;
                return pVar3;
        }
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.f2917v) {
            case k5.f.J /* 0 */:
                return r((a71.c) obj2, (m0) obj).v(w61.a0.a);
            case 1:
                return r((a71.c) obj2, (x71.t) obj).v(w61.a0.a);
            default:
                return r((a71.c) obj2, (x71.t) obj).v(w61.a0.a);
        }
    }

    public final Object v(Object obj) {
        switch (this.f2917v) {
            case k5.f.J /* 0 */:
                b71.a aVar = b71.a.r;
                int i = this.f2918w;
                if (i == 0) {
                    sy.y.j(obj);
                    o oVar = new o((m0) this.f2919x);
                    this.f2918w = 1;
                    if (this.f2920y.b(oVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            case 1:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f2918w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    y71.o oVar2 = new y71.o((x71.t) this.f2919x, 0);
                    this.f2918w = 1;
                    if (this.f2920y.b(oVar2, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar3 = b71.a.r;
                int i11 = this.f2918w;
                if (i11 == 0) {
                    sy.y.j(obj);
                    y71.o oVar3 = new y71.o((x71.t) this.f2919x, 1);
                    this.f2918w = 1;
                    if (this.f2920y.b(oVar3, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }
}
