package r7;

import k71.k;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class a extends c71.j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f31178v;

    /* renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f31179w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ j71.c f31180x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i, a71.c cVar, j71.c cVar2) {
        super(2, cVar);
        this.f31178v = i;
        this.f31180x = cVar2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        switch (this.f31178v) {
            case k5.f.J:
                a aVar = new a(0, cVar, this.f31180x);
                aVar.f31179w = obj;
                return aVar;
            default:
                a aVar2 = new a(1, cVar, this.f31180x);
                aVar2.f31179w = obj;
                return aVar2;
        }
    }

    public final Object s(Object obj, Object obj2) {
        o7.i iVar = (o7.i) obj;
        a71.c cVar = (a71.c) obj2;
        switch (this.f31178v) {
        }
        return r(cVar, iVar).v(a0.a);
    }

    public final Object v(Object obj) {
        int i = this.f31178v;
        j71.c cVar = this.f31180x;
        switch (i) {
            case k5.f.J:
                b71.a aVar = b71.a.r;
                y.j(obj);
                o7.i iVar = (o7.i) this.f31179w;
                k.e(iVar, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.k(iVar.c());
            default:
                b71.a aVar2 = b71.a.r;
                y.j(obj);
                o7.i iVar2 = (o7.i) this.f31179w;
                k.e(iVar2, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return cVar.k(iVar2.c());
        }
    }
}
