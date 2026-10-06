package com.github.rudroid.shortcuts.activities;

import android.content.Intent;
import android.view.View;
import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.utilities.ui.g1;

@c71.e(c = "com.github.rudroid.shortcuts.activities.ConfigureShortcutFragment$onCreateView$1$1$1$1", f = "ConfigureShortcutFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
class s extends c71.j implements j71.e {
    public final /* synthetic */ ConfigureShortcutFragment v;
    public final /* synthetic */ g1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ConfigureShortcutFragment configureShortcutFragment, g1 g1Var, a71.c cVar) {
        super(2, cVar);
        this.v = configureShortcutFragment;
        this.w = g1Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        s r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        androidx.lifecycle.a1 a;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        ConfigureShortcutFragment configureShortcutFragment = this.v;
        wm.b bVar = configureShortcutFragment.E4().w;
        wm.b bVar2 = (wm.b) this.w.getData();
        w61.a0 a0Var = w61.a0.a;
        if (bVar2 != null) {
            ig.a aVar2 = new ig.a(bVar, bVar2);
            RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
            ei.c cVar = ei.c.w;
            runtimeFeatureFlag.getClass();
            if (RuntimeFeatureFlag.a(cVar)) {
                x6.k d = sy.s.i(configureShortcutFragment).d();
                if (d != null && (a = d.a()) != null) {
                    a.c(aVar2, "CONFIGURE_SHORTCUT_RESULT_KEY");
                }
            } else {
                Intent intent = new Intent();
                intent.putExtra("CONFIGURE_SHORTCUT_RESULT_KEY", aVar2);
                configureShortcutFragment.g4().setResult(-1, intent);
            }
            View view = ((androidx.fragment.app.a0) configureShortcutFragment).a0;
            if (view != null) {
                view.post(new r(configureShortcutFragment, 0));
            }
        }
        return a0Var;
    }
    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object c0(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object h(Object p1) { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object S(int p1, boolean p2) { return null; }
    public Object c0(int p1) { return null; }
    public Object q(boolean p1) { return null; }
}
