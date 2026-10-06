package com.github.rudroid.settings.applock;

import android.os.Build;
import android.os.Handler;
import androidx.fragment.app.a1;
import androidx.fragment.app.n0;
import androidx.lifecycle.o1;
import androidx.lifecycle.t1;
import java.util.concurrent.Executor;

@c71.e(c = "com.github.rudroid.settings.applock.AppLockStore$showBiometricPromptForActivity$1", f = "AppLockStore.kt", l = {68}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z extends c71.j implements j71.e {
    public int v;
    public /* synthetic */ Object w;
    public final /* synthetic */ k.i x;
    public final /* synthetic */ v y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(k.i iVar, v vVar, int i, a71.c cVar) {
        super(2, cVar);
        this.x = iVar;
        this.y = vVar;
        this.z = i;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        z zVar = new z(this.x, this.y, this.z, cVar);
        zVar.w = obj;
        return zVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (x71.t) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        x71.t tVar = (x71.t) this.w;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            int i2 = Build.VERSION.SDK_INT;
            k.i iVar = this.x;
            Executor a = i2 >= 28 ? o4.a.a(iVar) : new fa1.a(new Handler(iVar.getMainLooper()), 3);
            k71.k.f(a, "getMainExecutor(...)");
            w wVar = new w(tVar);
            n0 n0Var = new n0();
            a1 H = iVar.H();
            t1 K0 = iVar.K0();
            o1 f0 = iVar.f0();
            t6.d g0 = iVar.g0();
            k71.k.g(f0, "factory");
            w51.r rVar = new w51.r(K0, f0, g0);
            k71.e a2 = k71.xShadow.a(t.v.class);
            String b = a2.b();
            if (b == null) {
                throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
            }
            t.v E = rVar.E(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b));
            n0Var.s = H;
            E.s = a;
            E.t = wVar;
            n0Var.a(v.a(this.y, iVar, this.z));
            x xVar = new x(1, tVar);
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
