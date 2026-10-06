package com.github.rudroid.settings.codeoptions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.l1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class CodeOptionsActivity extends h0 {
    public static final a Companion = new a();
    public com.github.rudroid.html.a t0;
    public final l1 u0;

    public static final class a {
        public static Intent a(Context context) {
            k71.k.g(context, "context");
            return new Intent(context, (Class<?>) CodeOptionsActivity.class);
        }
    }

    public static final class b implements j71.a {
        public b() {
        }

        public final Object a() {
            return CodeOptionsActivity.this.f0();
        }
    }

    public static final class c implements j71.a {
        public c() {
        }

        public final Object a() {
            return CodeOptionsActivity.this.K0();
        }
    }

    public static final class d implements j71.a {
        public d() {
        }

        public final Object a() {
            return CodeOptionsActivity.this.g0();
        }
    }

    public CodeOptionsActivity() {
        this.s0 = false;
        C(new g0(this));
        this.u0 = new l1(k71.x.a(a0.class), new c(), new b(), new d());
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e.c.a(this, new r1.d(new h(this, 2), true, 2101953583));
    }


    public static Object f0(Object... a) {
        return null;
    }

    public static Object K0(Object... a) {
        return null;
    }

    public static Object g0(Object... a) {
        return null;
    }

    public static Object C(Object... a) {
        return null;
    }

    public static Object finish(Object... a) {
        return null;
    }
    public Object finish() { return null; }
}
