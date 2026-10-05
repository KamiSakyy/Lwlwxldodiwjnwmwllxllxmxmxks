package com.github.rudroid.featureflags.preferences;

import c71.j;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import sy.y;
import w61.a0;

@c71.e(c = "com.github.rudroid.featureflags.preferences.UpdateFeatureFlagPreferencesUseCase$execute$2", f = "UpdateFeatureFlagPreferencesUseCase.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes.dex */
final class d extends j implements j71.e {

    /* renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f12420v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Set f12421w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Set set, a71.c cVar) {
        super(2, cVar);
        this.f12421w = set;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        d dVar = new d(this.f12421w, cVar);
        dVar.f12420v = obj;
        return dVar;
    }

    public final Object s(Object obj, Object obj2) {
        d r10 = r((a71.c) obj2, (s5.b) obj);
        a0 a0Var = a0.a;
        r10.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        s5.b bVar = (s5.b) this.f12420v;
        b71.a aVar = b71.a.r;
        y.j(obj);
        s5.e eVar = a.f12419a;
        s5.e eVar2 = a.f12419a;
        Set set = this.f12421w;
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(((r10.b) it.next()).r);
        }
        bVar.f(eVar2, hashSet);
        return a0.a;
    }
}
