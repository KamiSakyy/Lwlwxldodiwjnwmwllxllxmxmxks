package com.github.rudroid.settings.applock;

import kotlin.NoWhenBranchMatchedException;
import y71.y1;
import yf.f;

@c71.e(c = "com.github.rudroid.settings.applock.AppLockFragment$onUnlockClick$1", f = "AppLockFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ AppLockFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(AppLockFragment appLockFragment, a71.c cVar) {
        super(2, cVar);
        this.w = appLockFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        q qVar = new q(this.w, cVar);
        qVar.v = obj;
        return qVar;
    }

    public final Object s(Object obj, Object obj2) {
        q r = r((a71.c) obj2, (yf.f) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Object value;
        yf.f fVar = (yf.f) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        if (fVar instanceof f.b) {
            AppLockFragment appLockFragment = this.w;
            k kVar = appLockFragment.E0;
            if (kVar == null) {
                k71.k.m("appLockAuthenticationStore");
                throw null;
            }
            y1 y1Var = kVar.f;
            do {
                value = y1Var.getValue();
                ((Boolean) value).getClass();
            } while (!y1Var.i(value, Boolean.FALSE));
            v71.b0.z(kVar.e, (a71.h) null, (v71.a0) null, new i(kVar, null), 3);
            appLockFragment.g4().finish();
        } else if (!(fVar instanceof f.a)) {
            throw new NoWhenBranchMatchedException();
        }
        return w61.a0.a;
    }
    public Object t(Object, Object) { return null; }
    public Object t(Object, Object) { return null; }
}
