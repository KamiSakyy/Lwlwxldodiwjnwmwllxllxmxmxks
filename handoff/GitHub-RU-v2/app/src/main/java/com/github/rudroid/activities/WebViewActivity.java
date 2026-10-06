package com.github.rudroid.activities;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: /home/user/work/p/classes.dex */
public final class WebViewActivity extends t {
    public static final a Companion = new a();

    /* renamed from: j0, reason: collision with root package name */
    public final int f5777j0 = 2131558451;

    public static final class a {
        public static Intent a(Context context, String str, String str2) {
            k71.k.g(context, "context");
            k71.k.g(str, "url");
            Intent intent = new Intent(context, (Class<?>) WebViewActivity.class);
            intent.putExtra("EXTRA_URL", str);
            intent.putExtra("EXTRA_TITLE", str2);
            return intent;
        }

        public static /* synthetic */ Intent b(a aVar, Context context, String str) {
            aVar.getClass();
            return a(context, str, null);
        }
    }

    @Override // com.github.rudroid.activities.t, com.github.rudroid.activities.m0, com.github.rudroid.activities.c1, k.i, d.j, n4.g, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        di.c.d(this, ((ic.r0) s0()).A.getId(), 14);
        String stringExtra = getIntent().getStringExtra("EXTRA_TITLE");
        AppBarLayout findViewById = s0().A.findViewById(2131361906);
        if (findViewById != null) {
            com.github.rudroid.utilities.h.a(findViewById, stringExtra, (String) null);
        }
        Toolbar toolbar = (Toolbar) s0().A.findViewById(2131363446);
        if (toolbar != null) {
            W(toolbar);
            m71.a G = G();
            if (G != null) {
                G.Z(true);
            }
            m71.a G2 = G();
            if (G2 != null) {
                G2.a0();
            }
            Drawable e5 = com.github.rudroid.utilities.q.e(2131231114, 2131100995, this);
            toolbar.setNavigationIcon(e5);
            toolbar.setCollapseIcon(e5);
            toolbar.setNavigationContentDescription(getString(2131953801));
            toolbar.setNavigationOnClickListener(new b3(this, 1));
        }
        WebView webView = ((ic.r0) s0()).P;
        String stringExtra2 = getIntent().getStringExtra("EXTRA_URL");
        if (stringExtra2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        webView.loadUrl(stringExtra2);
        ((ic.r0) s0()).P.setWebViewClient(new t3(this));
    }

    @Override // com.github.rudroid.activities.t
    public final int t0() {
        return this.f5777j0;
    }

    public static Object s0(Object... a) {
        return null;
    }

    public static Object getIntent(Object... a) {
        return null;
    }

    public static Object W(Object... a) {
        return null;
    }

    public static Object getString(Object... a) {
        return null;
    }
}
