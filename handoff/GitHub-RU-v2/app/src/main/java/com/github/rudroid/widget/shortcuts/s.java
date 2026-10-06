package com.github.rudroid.widget.shortcuts;

import android.content.Context;
import com.github.rudroid.widget.shortcuts.g;
import com.google.android.gms.internal.measurement.z3;

@c71.e(c = "com.github.rudroid.widget.shortcuts.ShortcutWidgetReceiver$onDisabled$1", f = "ShortcutWidgetReceiver.kt", l = {31}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class s extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ Context w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, a71.c cVar) {
        super(2, cVar);
        this.w = context;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new s(this.w, cVar);
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
        g.Companion.getClass();
        g a = ((g.b) k41.b.v(g.b.class, this.w.getApplicationContext())).a();
        this.v = 1;
        Object n = z3.n(a.a, new h(2, null), this);
        if (n != aVar) {
            n = a0Var;
        }
        return n == aVar ? aVar : a0Var;
    }
    public Object C() { return null; }
    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object c0(Object p1) { return null; }
    public Object d(Object p1) { return null; }
    public Object e0(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object g(Object p1) { return null; }
    public Object g0() { return null; }
    public Object h(Object p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object l() { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object q0() { return null; }
    public Object t() { return null; }
    public Object S = null;
    public Object T = null;
    public Object S(int, boolean) { return null; }
    public Object c0(int) { return null; }
    public Object d(int) { return null; }
    public Object e0(int) { return null; }
    public Object f(Object) { return null; }
    public Object f(Object) { return null; }
    public Object f(Object) { return null; }
    public Object f(Object) { return null; }
    public Object g(boolean) { return null; }
    public Object h(Object) { return null; }
    public Object h(Object) { return null; }
    public Object h(Object) { return null; }
    public Object h(Object) { return null; }
    public Object h(Object) { return null; }
    public Object h(Object) { return null; }
    public Object h(Object) { return null; }
    public Object h(Object) { return null; }
    public Object j(Object) { return null; }
    public Object k(Object) { return null; }
    public Object n0(Object) { return null; }
    public Object n0(Object) { return null; }
    public Object q(boolean) { return null; }
}
