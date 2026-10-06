package com.github.rudroid.settings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.preference.PreferenceFragmentCompat;
import com.github.rudroid.utilities.k2;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class ToolBarPreferenceFragmentCompat extends PreferenceFragmentCompat {
    public static void w4(ToolBarPreferenceFragmentCompat toolBarPreferenceFragmentCompat, String str) {
        AppBarLayout findViewById;
        View view = ((androidx.fragment.app.a0) toolBarPreferenceFragmentCompat).a0;
        if (view == null || (findViewById = view.findViewById(2131361906)) == null) {
            return;
        }
        com.github.rudroid.utilities.h.a(findViewById, str, null);
    }

    public static void y4(ToolBarPreferenceFragmentCompat toolBarPreferenceFragmentCompat, String str) {
        k2.a aVar = k2.a.s;
        k.i w3 = toolBarPreferenceFragmentCompat.w3();
        if (w3 == null || str == null) {
            return;
        }
        androidx.fragment.app.l1 F3 = toolBarPreferenceFragmentCompat.F3();
        F3.b();
        if (F3.v.v != androidx.lifecycle.w.r) {
            com.github.rudroid.utilities.k2.c(w3, str, -1, null, aVar);
        }
    }

    public void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        super.c4(view, bundle);
        AppBarLayout findViewById = view.findViewById(2131361906);
        k71.k.d(findViewById);
        if (!((androidx.fragment.app.a0) this).W) {
            ((androidx.fragment.app.a0) this).W = true;
            if (I3() && !J3()) {
                ((androidx.fragment.app.a0) this).N.v.invalidateOptionsMenu();
            }
        }
        Toolbar findViewById2 = findViewById.findViewById(2131363446);
        if (findViewById2 != null) {
            Drawable e = com.github.rudroid.utilities.q.e(2131231114, 2131100995, i4());
            findViewById2.setNavigationIcon(e);
            findViewById2.setCollapseIcon(e);
            findViewById2.setNavigationContentDescription(C3(2131953801));
            findViewById2.setNavigationOnClickListener(new r3(0, this));
        }
        ((PreferenceFragmentCompat) this).v0.j(new vf.a(findViewById));
    }

    public final void x4(boolean z, j71.a aVar) {
        View view = ((androidx.fragment.app.a0) this).a0;
        if (view == null) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(2131363097);
        ((Button) viewGroup.findViewById(2131363252)).setOnClickListener(new r3(1, aVar));
        if (z) {
            ((PreferenceFragmentCompat) this).v0.setVisibility(0);
            viewGroup.setVisibility(8);
        } else {
            ((PreferenceFragmentCompat) this).v0.setVisibility(8);
            viewGroup.setVisibility(0);
        }
    }

    public static  O3(Object... a) {
        return null;
    }

    public static  V3(Object... a) {
        return null;
    }

    public static  f0(Object... a) {
        return null;
    }

    public static  y3(Object... a) {
        return null;
    }

    public static  w3(Object... a) {
        return null;
    }

    public static  F3(Object... a) {
        return null;
    }

    public static  I3(Object... a) {
        return null;
    }

    public static  J3(Object... a) {
        return null;
    }

    public static  i4(Object... a) {
        return null;
    }

    public static  C3(Object... a) {
        return null;
    }

    public static  g4(Object... a) {
        return null;
    }
    public Object f0() { return null; }
    public Object g4() { return null; }
    public Object y3() { return null; }
}
