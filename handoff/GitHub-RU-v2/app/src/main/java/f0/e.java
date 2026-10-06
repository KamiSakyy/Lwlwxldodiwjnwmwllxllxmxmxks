package f0;

/* loaded from: /home/user/work/p/classes.dex */
public class e extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f22262v = 1;

    /* renamed from: w, reason: collision with root package name */
    public int f22263w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j0.j f22264x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j0.l f22265y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j0.j jVar, j0.l lVar, a71.c cVar) {
        super(2, cVar);
        this.f22264x = jVar;
        this.f22265y = lVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f22262v) {
            case k5.f.J:
                return new e(this.f22265y, this.f22264x, cVar);
            default:
                return new e(this.f22264x, this.f22265y, cVar);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f22262v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f22262v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f22263w;
                if (i == 0) {
                    sy.y.j(obj);
                    j0.m mVar = new j0.m(this.f22265y);
                    this.f22263w = 1;
                    if (this.f22264x.b(mVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
            default:
                b71.a aVar2 = b71.a.r;
                int i10 = this.f22263w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    this.f22263w = 1;
                    if (this.f22264x.b(this.f22265y, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj);
                }
                return w61.a0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j0.l lVar, j0.j jVar, a71.c cVar) {
        super(2, cVar);
        this.f22265y = lVar;
        this.f22264x = jVar;
    }
}
