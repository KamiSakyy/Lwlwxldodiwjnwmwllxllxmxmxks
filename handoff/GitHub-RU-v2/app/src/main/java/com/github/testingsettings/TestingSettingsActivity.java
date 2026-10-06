package com.github.testingsettings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a1;
import com.google.android.material.appbar.AppBarLayout;
import h11.b;
import h11.c;
import m71.a;

/* loaded from: /home/user/work/p/classes4.dex */
public final class TestingSettingsActivity extends b {
    public static final c Companion = new c();

    public TestingSettingsActivity() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h11.b
    public final void onCreate(Bundle bundle) {
        Drawable mutate;
        TextView textView;
        super.onCreate(bundle);
        di.c.d(this, 2131363270, 14);
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(2131361906);
        if (appBarLayout != null && (textView = (TextView) appBarLayout.findViewById(2131363450)) != null) {
            textView.setText(getString(2131954604));
        }
        Toolbar findViewById = findViewById(2131363446);
        W(findViewById);
        a G = G();
        if (G != null) {
            G.Z(true);
        }
        a G2 = G();
        if (G2 != null) {
            G2.a0();
        }
        Drawable drawable = getDrawable(2131231114);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            throw new IllegalStateException("Drawable not found");
        }
        mutate.setTint(getColor(2131100995));
        findViewById.setNavigationIcon(mutate);
        findViewById.setCollapseIcon(mutate);
        findViewById.setNavigationContentDescription(getString(2131953801));
        findViewById.setNavigationOnClickListener(new com.github.rudroid.actions.checklog.c(9, this));
        if (H().E(2131362366) == null) {
            a1 H = H();
            H.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(H);
            TestingSettingsFragment.Companion.getClass();
            aVar.l(2131362366, new TestingSettingsFragment(), (String) null);
            aVar.g();
        }
    }

    public static Object findViewById(Object... a) {
        return null;
    }

    public static Object getString(Object... a) {
        return null;
    }

    public static Object W(Object... a) {
        return null;
    }

    public static Object G(Object... a) {
        return null;
    }
    public Object getColor(int) { return null; }
    public Object getDrawable(int) { return null; }
}
