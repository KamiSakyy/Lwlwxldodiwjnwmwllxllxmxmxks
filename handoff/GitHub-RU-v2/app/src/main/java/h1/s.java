package h1;

import f1.ic;

/* loaded from: /home/user/work/p/classes.dex */
public final class s extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f25412v;

    /* renamed from: w, reason: collision with root package name */
    public int f25413w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ic f25414x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(ic icVar, a71.c cVar, int i) {
        super(2, cVar);
        this.f25412v = i;
        this.f25414x = icVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f25412v) {
            case k5.f.J:
                return new s(this.f25414x, cVar, 0);
            default:
                return new s(this.f25414x, cVar, 1);
        }
    }

    public final Object s(Object obj, Object obj2) {
        v71.z zVar = (v71.z) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f25412v) {
        }
        return r(cVar, zVar).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        switch (this.f25412v) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                int i = this.f25413w;
                if (i == 0) {
                    sy.y.j(obj);
                    this.f25413w = 1;
                    if (this.f25414x.c(f0.j1.f22308r, this) == aVar) {
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
                int i10 = this.f25413w;
                if (i10 == 0) {
                    sy.y.j(obj);
                    f0.j1 j1Var = f0.j1.f22309s;
                    this.f25413w = 1;
                    if (this.f25414x.c(j1Var, this) == aVar2) {
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
}
