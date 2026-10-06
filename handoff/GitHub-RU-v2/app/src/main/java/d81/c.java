package d81;

import a81.r;
import a81.t;
import c71.j;
import v71.n0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c {
    public final Object a;
    public final j71.f b;
    public final j71.f c;
    public final Object d;
    public final j e;
    public final j71.f f;
    public Object g;
    public int h = -1;
    public final /* synthetic */ e i;

    public c(e eVar, Object obj, j71.f fVar, j71.f fVar2, t tVar, j jVar, j71.f fVar3) {
        this.i = eVar;
        this.a = obj;
        this.b = fVar;
        this.c = fVar2;
        this.d = tVar;
        this.e = jVar;
        this.f = fVar3;
    }

    public final void a() {
        Object obj = this.g;
        if (obj instanceof r) {
            ((r) obj).h(this.h, this.i.r);
            return;
        }
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var != null) {
            n0Var.a();
        }
    }
}
