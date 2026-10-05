package in;

import t00.f8;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l extends c71.j implements j71.e {
    public final /* synthetic */ j71.e A;
    public /* synthetic */ Object v;
    public final /* synthetic */ j71.c w;
    public final /* synthetic */ j71.c x;
    public final /* synthetic */ j71.a y;
    public final /* synthetic */ f8 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(j71.c cVar, j71.c cVar2, j71.a aVar, f8 f8Var, j71.e eVar, a71.c cVar3) {
        super(2, cVar3);
        this.w = cVar;
        this.x = cVar2;
        this.y = aVar;
        this.z = f8Var;
        this.A = eVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        l lVar = new l(this.w, this.x, this.y, this.z, this.A, cVar);
        lVar.v = obj;
        return lVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        Object obj2 = this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        Boolean bool = (Boolean) this.w.k(obj2);
        String str = (String) this.x.k(obj2);
        if (obj2 == null) {
            return new gl.f((y71.i) this.y.a(), 5);
        }
        if (!k71.k.b(bool, Boolean.FALSE) && str != null) {
            return (y71.i) this.A.s(str, obj2);
        }
        return new cn.q(this.z, 9);
    }
}
