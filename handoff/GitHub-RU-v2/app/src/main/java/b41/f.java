package b41;

import a5.s;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements c41.c {
    public final c41.c r;

    public f(c41.c cVar) {
        this.r = cVar;
    }

    @Override // c41.c
    public Object c() {
        e eVar = (e) this.r.c();
        if (eVar != null) {
            return eVar;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public /* synthetic */ f(a7.d dVar) {
        y51.c cVar = new y51.c(16, dVar);
        this.r = c41.b.a(new f(c41.b.a(new s(c41.b.a(new b1.m(13, cVar, c41.b.a(new d(cVar, 1)))), c41.b.a(new d(cVar, 0)), cVar, 5))));
    }
    public Object a = null;
}
