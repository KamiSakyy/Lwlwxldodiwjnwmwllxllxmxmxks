package com.github.rudroid.settings.applock;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import androidx.fragment.app.a1;
import androidx.fragment.app.n0;
import androidx.lifecycle.o1;
import androidx.lifecycle.t1;
import java.util.concurrent.Executor;

@c71.e(c = "com.github.rudroid.settings.applock.AppLockStore$getBiometricPromptForFragment$1", f = "AppLockStore.kt", l = {101}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class y extends c71.j implements j71.e {
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ androidx.fragment.app.a0 x;
    public final /* synthetic */ v y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.fragment.app.a0 a0Var, v vVar, int i, a71.c cVar) {
        super(2, cVar);
        this.x = a0Var;
        this.y = vVar;
        this.z = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        y yVar = new y(this.x, this.y, this.z, cVar);
        yVar.w = obj;
        return yVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (x71.t) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        t.v vVar;
        x71.t tVar = (x71.t) this.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            androidx.fragment.app.a0 a0Var_r7 = this.x;
            Context i4 = a0Var_r7.i4();
            Executor a = Build.VERSION.SDK_INT >= 28 ? o4.a.a(i4) : new fa1.a(new Handler(i4.getMainLooper()), 3);
            k71.k.f(a, "getMainExecutor(...)");
            w wVar = new w(tVar);
            n0 n0Var = new n0();
            k.i w3 = a0Var_r7.w3();
            a1 x3 = a0Var_r7.x3();
            if (w3 != null) {
                t1 K0 = w3.K0();
                o1 f0 = w3.f0();
                t6.d g0 = w3.g0();
                k71.k.g(f0, "factory");
                w51.r rVar = new w51.r(K0, f0, g0);
                k71.e a2 = k71.xShadow.a(t.v.class);
                String b = a2.b();
                if (b == null) {
                    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
                }
                vVar = (t.v) rVar.E(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
            } else {
                vVar = null;
            }
            if (vVar != null) {
                a0Var_r7.j0.h(new t.s(vVar));
            }
            n0Var.s = x3;
            if (vVar != null) {
                vVar.s = a;
                vVar.t = wVar;
            }
            n0Var.a(v.a(this.y, a0Var_r7.i4(), this.z));
            x xVar = new x(0, tVar);
            this.w = null;
            this.v = 1;
            if (t.z.f(tVar, xVar, this) == aVar) {
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
}
