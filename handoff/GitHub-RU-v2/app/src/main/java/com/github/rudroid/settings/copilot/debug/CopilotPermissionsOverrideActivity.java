package com.github.rudroid.settings.copilot.debug;

import android.os.Bundle;
import androidx.lifecycle.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class CopilotPermissionsOverrideActivity extends c0 {
    public static final a Companion = new a();
    public final l1 t0;

    public static final class a {
    }

    public static final class b implements j71.a {
        public b() {
        }

        public final Object a() {
            return CopilotPermissionsOverrideActivity.this.f0();
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return CopilotPermissionsOverrideActivity.this.K0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return CopilotPermissionsOverrideActivity.this.g0();
        }
    }

    public CopilotPermissionsOverrideActivity() {
        this.s0 = false;
        C(new b0(this));
        this.t0 = new l1(k71.x.a(v.class), new c(), new b(), new d());
    }

    public final v J0() {
        return (v) this.t0.getValue();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.c.a(this, new r1.d(new com.github.rudroid.settings.copilot.debug.b(this, 0), true, 428578399));
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class l1<T1,T2,T3,T4> {
        public l1() {
        }
    }
}
