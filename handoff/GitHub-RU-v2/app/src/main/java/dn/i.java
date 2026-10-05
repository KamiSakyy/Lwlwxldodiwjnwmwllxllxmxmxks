package dn;

import java.util.Objects;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i extends c71.j implements j71.f {
    public /* synthetic */ Throwable v;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ en.b x;
    public final /* synthetic */ oa.j y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(boolean z, en.b bVar, oa.j jVar, a71.c cVar) {
        super(3, cVar);
        this.w = z;
        this.x = bVar;
        this.y = jVar;
    }

    public final Object f(Object obj, Object obj2, Object obj3) {
        en.b bVar = this.x;
        oa.j jVar = this.y;
        i iVar = new i(this.w, bVar, jVar, (a71.c) obj3);
        iVar.v = (Throwable) obj2;
        w61.a0 a0Var = w61.a0.a;
        iVar.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Throwable th2 = this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        Objects.toString(th2);
        if (this.w) {
            this.x.c();
            this.y.i(-1L);
        }
        return w61.a0.a;
    }
}
