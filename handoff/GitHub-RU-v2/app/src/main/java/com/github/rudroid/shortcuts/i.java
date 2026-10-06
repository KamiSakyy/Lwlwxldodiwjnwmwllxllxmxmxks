package com.github.rudroid.shortcuts;

import com.github.service.models.response.shortcuts.ShortcutScope;
import z01.g1;

@c71.e(c = "com.github.rudroid.shortcuts.ConfigureShortcutViewModel$fetchMergeQueueEnabled$1", f = "ConfigureShortcutViewModel.kt", l = {289}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ e w;
    public final /* synthetic */ ShortcutScope.SpecificRepository x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, ShortcutScope.SpecificRepository specificRepository, a71.c cVar) {
        super(2, cVar);
        this.w = eVar;
        this.x = specificRepository;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            e eVar = this.w;
            dl.a aVar2 = eVar.u;
            oa.j d = eVar.v.d();
            ShortcutScope.SpecificRepository specificRepository = this.x;
            String str = specificRepository.s;
            String str2 = specificRepository.t;
            com.github.rudroid.fragments.onboarding.notifications.viewmodel.z zVar = new com.github.rudroid.fragments.onboarding.notifications.viewmodel.z(28, eVar);
            aVar2.getClass();
            k71.k.g(str, "owner");
            k71.k.g(str2, "name");
            y71.y J = b31.b.J(((g1) aVar2.a.a(d)).F(str, str2), d, zVar);
            h hVar = new h(eVar);
            this.v = 1;
            if (J.b(hVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }

    public Object x;
}
