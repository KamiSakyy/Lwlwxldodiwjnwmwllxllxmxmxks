package com.github.rudroid.searchandfilter;

import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.List;
import t00.f8;

@c71.e(c = "com.github.rudroid.searchandfilter.FilterBarViewModel$updateCanCreateShortcut$1", f = "FilterBarViewModel.kt", l = {526}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class u extends c71.j implements j71.e {
    public final /* synthetic */ ShortcutType A;
    public int v;
    public final /* synthetic */ q w;
    public final /* synthetic */ oa.j x;
    public final /* synthetic */ List y;
    public final /* synthetic */ com.github.service.models.response.shortcuts.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(q qVar, oa.j jVar, List list, com.github.service.models.response.shortcuts.a aVar, ShortcutType shortcutType, a71.c cVar) {
        super(2, cVar);
        this.w = qVar;
        this.x = jVar;
        this.y = list;
        this.z = aVar;
        this.A = shortcutType;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new u(this.w, this.x, this.y, this.z, this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        w61.a0 a0Var = w61.a0.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            return a0Var;
        }
        sy.y.j(obj);
        q qVar = this.w;
        tm.e eVar = qVar.y;
        eVar.getClass();
        List list = this.y;
        k71.k.g(list, "filterConfiguration");
        um.r rVar = eVar.a;
        rVar.getClass();
        um.j jVar = new um.j(rVar.a.b(this.x), rVar, 0);
        f8 f8Var = new f8(new n5.d(list, (a71.c) null, 1));
        dn.c0 c0Var = new dn.c0(this.A, this.z, null);
        t tVar = new t(qVar);
        this.v = 1;
        Object a = z71.b.a(this, y71.e1.r, new y71.b1(c0Var, (a71.c) null), tVar, new y71.i[]{jVar, f8Var});
        if (a != aVar) {
            a = a0Var;
        }
        return a == aVar ? aVar : a0Var;
    }
}
