package com.github.rudroid.shortcuts;

import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import y71.y1;
import z01.j1;

@c71.e(c = "com.github.rudroid.shortcuts.ConfigureShortcutViewModel$create$1", f = "ConfigureShortcutViewModel.kt", l = {247}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class g extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ wm.b w;
    public final /* synthetic */ e x;
    public final /* synthetic */ boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(wm.b bVar, e eVar, boolean z, a71.c cVar) {
        super(2, cVar);
        this.w = bVar;
        this.x = eVar;
        this.y = z;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new g(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        e eVar = this.x;
        y1 y1Var = eVar.B;
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
        wm.b bVar = this.w;
        ShortcutConfigurationModel shortcutConfigurationModel = new ShortcutConfigurationModel(bVar.P(), bVar.g(), bVar.f(), bVar.getIcon(), bVar.i(), bVar.K(), bVar.getName());
        g1.Companion.getClass();
        com.github.rudroid.utilities.ui.r0 r0Var = new com.github.rudroid.utilities.ui.r0(shortcutConfigurationModel);
        y1Var.getClass();
        y1Var.k((Object) null, r0Var);
        if (!this.y) {
            t1 t1Var = new t1(shortcutConfigurationModel);
            y1Var.getClass();
            y1Var.k((Object) null, t1Var);
            return a0Var;
        }
        tm.a aVar2 = eVar.s;
        oa.j d = eVar.v.d();
        com.github.rudroid.repositories.repositoryownerrepositories.d dVar = new com.github.rudroid.repositories.repositoryownerrepositories.d(9, eVar, shortcutConfigurationModel);
        aVar2.getClass();
        um.r rVar = aVar2.a;
        rVar.getClass();
        j1 j1Var = (j1) rVar.b.a(d);
        rVar.c.getClass();
        y71.y J = b31.b.J(new um.f(j1Var.c(vm.b.a(shortcutConfigurationModel)), rVar, d, 0), d, dVar);
        f fVar = new f(eVar, shortcutConfigurationModel);
        this.v = 1;
        return J.b(fVar, this) == aVar ? aVar : a0Var;
    }
}
