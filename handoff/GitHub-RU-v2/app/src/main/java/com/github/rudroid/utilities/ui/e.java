package com.github.rudroid.utilities.ui;

import android.view.View;

@c71.e(c = "com.github.rudroid.utilities.ui.ActionableEmptyContentKt$ActionableEmptyContent$5$1", f = "ActionableEmptyContent.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
class e extends c71.j implements j71.e {
    public final /* synthetic */ View v;
    public final /* synthetic */ String w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, String str, a71.c cVar) {
        super(2, cVar);
        this.v = view;
        this.w = str;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new e(this.v, this.w, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        e r = r((a71.c) obj2, (v71.z) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        this.v.announceForAccessibility(this.w);
        return w61.a0.a;
    }
}
