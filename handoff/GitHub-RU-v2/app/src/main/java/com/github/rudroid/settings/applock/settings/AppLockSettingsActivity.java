package com.github.rudroid.settings.applock.settings;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.t0;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import com.github.rudroid.settings.preferences.SingleChoiceBottomSheet;
import k71.x;
import v71.a0;
import v71.b0;
import v71.q1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class AppLockSettingsActivity extends w {
    public static final a Companion = new a();
    public com.github.rudroid.settings.applock.v t0;
    public final l1 u0;
    public final h.g v0;
    public q1 w0;

    public static final class a {
    }

    public static final /* synthetic */ class b {
        static {
            int[] iArr = new int[yf.e.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                yf.e eVar = yf.e.r;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                yf.e eVar2 = yf.e.r;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return AppLockSettingsActivity.this.f0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return AppLockSettingsActivity.this.K0();
        }
    }

    public static final class e implements j71.a {
        public e() {
        }

        public final Object a() {
            return AppLockSettingsActivity.this.g0();
        }
    }

    public AppLockSettingsActivity() {
        this.s0 = false;
        C(new v(this));
        this.u0 = new l1(x.a(o.class), new d(), new c(), new e());
        this.v0 = E(new com.github.rudroid.settings.applock.settings.a(this), new t0(3));
    }

    public static void J0(AppLockSettingsActivity appLockSettingsActivity, String str, Bundle bundle) {
        Parcelable parcelable;
        String str2;
        if (Build.VERSION.SDK_INT >= 34) {
            parcelable = (Parcelable) bundle.getParcelable("key_result_item", SingleChoiceBottomSheet.b.class);
        } else {
            Parcelable parcelable2 = bundle.getParcelable("key_result_item");
            if (!(parcelable2 instanceof SingleChoiceBottomSheet.b)) {
                parcelable2 = null;
            }
            parcelable = (SingleChoiceBottomSheet.b) parcelable2;
        }
        SingleChoiceBottomSheet.b bVar = (SingleChoiceBottomSheet.b) parcelable;
        o oVar = (o) appLockSettingsActivity.u0.getValue();
        b0.z(d1.k(oVar), (a71.h) null, (a0) null, new n(oVar, (bVar == null || (str2 = bVar.r) == null) ? 0 : Integer.parseInt(str2), null), 3);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        H().i0("request_key_automatic_lock_option", this, new com.github.rudroid.settings.applock.settings.a(this));
        e.c.a(this, new r1.d(new com.github.rudroid.settings.applock.settings.b(this, 0), true, -730549251));
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l1<T1,T2,T3,T4> {
        public l1() {
        }
    }
}
