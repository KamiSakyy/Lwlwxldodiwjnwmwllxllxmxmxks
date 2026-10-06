package com.github.rudroid.settings.applock;

import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.t0;
import androidx.lifecycle.d1;
import com.github.rudroid.utilities.w0;
import java.util.concurrent.CancellationException;
import v71.q1;
import y71.h1;
import y71.m1;
import y71.n1;
import y71.s1;
import y71.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class AppLockFragment extends Hilt_AppLockFragment {
    public static final a Companion = new a();
    public v D0;
    public k E0;
    public final y1 F0 = n1.c(Boolean.FALSE);
    public final androidx.fragment.app.t G0 = f4(new h.b() { // from class: com.github.rudroid.settings.applock.m
        public final void d(Object obj) {
            k71.k.g((h.a) obj, "it");
            AppLockFragment.this.F0.k((Object) null, Boolean.valueOf(!((Boolean) r3.getValue()).booleanValue()));
        }
    }, new t0(3));
    public q1 H0;

    public static final class a {
    }

    public static final /* synthetic */ class b {
        static {
            int[] iArr = new int[yf.e.values().length];
            try {
                iArr[2] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                yf.e eVar = yf.e.r;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static final void C4(AppLockFragment appLockFragment) {
        q1 q1Var = appLockFragment.H0;
        if (q1Var != null) {
            q1Var.m((CancellationException) null);
        }
        v vVar = appLockFragment.D0;
        if (vVar == null) {
            k71.k.m("appLockStore");
            throw null;
        }
        y71.c h = n1.h(new y(appLockFragment, vVar, v.c(appLockFragment.i4()) ? 2131951790 : 2131951797, null));
        androidx.lifecycle.x i = d1.i(appLockFragment);
        y11.l n = n1.n(h, 0);
        m1 a2 = n1.a(0, n.a, (x71.a) n.c);
        a71.h hVar = (a71.h) n.d;
        y71.i iVar = (y71.i) n.b;
        a81.t tVar = n1.a;
        s1 s1Var = y71.q1.a;
        s1 s1Var2 = y71.q1.b;
        v71.b0.y(i, hVar, s1Var2.equals(s1Var) ? v71.a0.r : v71.a0.u, new m7.x(s1Var2, iVar, a2, tVar, (a71.c) null));
        appLockFragment.H0 = w0.a(new h1(a2), appLockFragment, androidx.lifecycle.w.u, new q(appLockFragment, null));
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k71.k.g(layoutInflater, "inflater");
        ComposeView composeView = new ComposeView(i4(), (AttributeSet) null, 6);
        composeView.setContent(new r1.d(new n(this, 1), true, 1391347062));
        return composeView;
    }

    public static Object i4(Object... a) {
        return null;
    }

    public static Object g4(Object... a) {
        return null;
    }
    public Object g4() { return null; }
}
