package com.github.rudroid.shortcuts;

import java.util.List;
import kotlin.KotlinNothingValueException;
import y71.y1;

@c71.e(c = "com.github.rudroid.shortcuts.ShortcutsOverviewViewModel$collectSelectedShortcut$2", f = "ShortcutsOverviewViewModel.kt", l = {67}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class k0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ n0 w;
    public final /* synthetic */ List x;
    public final /* synthetic */ List y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, List list, List list2, a71.c cVar) {
        super(2, cVar);
        this.w = n0Var;
        this.x = list;
        this.y = list2;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new k0(this.w, this.x, this.y, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
        return b71.a.r;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
            throw new KotlinNothingValueException();
        }
        sy.y.j(obj);
        n0 n0Var = this.w;
        y1 y1Var = n0Var.z;
        j0 j0Var = new j0(this.x, this.y, n0Var);
        this.v = 1;
        y1Var.b(j0Var, this);
        return aVar;
    }
}
