package com.github.developersettings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a1;
import com.google.android.material.appbar.AppBarLayout;
import di.c;
import h11.b;
import ii.a;

/* loaded from: /home/user/work/p/classes3.dex */
public final class DeveloperSettingsActivity extends b {
    public static final a Companion = new a();

    public DeveloperSettingsActivity() {
        super(1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        Drawable mutate;
        TextView textView;
        super.onCreate(bundle);
        c.d(this, 2131363270, 14);
        AppBarLayout findViewById = findViewById(2131361906);
        if (findViewById != null && (textView = (TextView) findViewById.findViewById(2131363450)) != null) {
            textView.setText(getString(2131954553));
        }
        Toolbar findViewById2 = findViewById(2131363446);
        W(findViewById2);
        m71.a G = G();
        if (G != null) {
            G.Z(true);
        }
        m71.a G2 = G();
        if (G2 != null) {
            G2.a0();
        }
        Drawable drawable = getDrawable(2131231114);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            throw new IllegalStateException("Drawable not found");
        }
        mutate.setTint(getColor(2131100995));
        findViewById2.setNavigationIcon(mutate);
        findViewById2.setCollapseIcon(mutate);
        findViewById2.setNavigationContentDescription(getString(2131953801));
        findViewById2.setNavigationOnClickListener(new com.github.rudroid.actions.checklog.c(10, this));
        if (H().E(2131362366) == null) {
            a1 H = H();
            H.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(H);
            DeveloperSettingsFragment.Companion.getClass();
            aVar.l(2131362366, new DeveloperSettingsFragment(), (String) null);
            aVar.g();
        }
    }

    public <T0> T0 findViewById(Object... a) {
        return null;
    }

    public <T0> T0 getString(Object... a) {
        return null;
    }

    public <T0> T0 W(Object... a) {
        return null;
    }

    public <T0> T0 G(Object... a) {
        return null;
    }

    public <T0> T0 getDrawable(Object... a) {
        return null;
    }

    public <T0> T0 getColor(Object... a) {
        return null;
    }

    public <T0> T0 H(Object... a) {
        return null;
    }
}
