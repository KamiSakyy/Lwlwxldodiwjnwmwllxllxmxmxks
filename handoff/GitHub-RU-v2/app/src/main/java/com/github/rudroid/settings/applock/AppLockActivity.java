package com.github.rudroid.settings.applock;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.a1;
import com.github.rudroid.settings.applock.AppLockActivity;
import ic.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class AppLockActivity extends c0 {
    public static final a Companion = new a();

    public static final class a {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.rudroid.settings.applock.c0
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = ic.c.O;
        i4 i4Var = k5.b.b;
        if (i4Var == null) {
            i4Var = null;
        }
        ic.c b = k5.b.b(layoutInflater, 2131558429, (ViewGroup) null, false, i4Var);
        k71.k.f(b, "inflate(...)");
        setContentView(((k5.f) b).A);
        k21.f.c(m(), (w3.u) null, new j71.c() { // from class: com.github.rudroid.settings.applock.a
            public final Object k(Object obj) {
                AppLockActivity.a aVar = AppLockActivity.Companion;
                k71.k.g((d.u) obj, "$this$addCallback");
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.HOME");
                intent.setFlags(268435456);
                AppLockActivity.this.startActivity(intent);
                return w61.a0.a;
            }
        }, 3);
        if (bundle == null) {
            a1 H = H();
            k71.k.f(H, "getSupportFragmentManager(...)");
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(H);
            aVar.r = true;
            AppLockFragment.Companion.getClass();
            aVar.l(2131362366, new AppLockFragment(), (String) null);
            aVar.g();
        }
    }

    public static Object getLayoutInflater(Object... a) {
        return null;
    }

    public static Object m(Object... a) {
        return null;
    }

    public static Object startActivity(Object... a) {
        return null;
    }
}
