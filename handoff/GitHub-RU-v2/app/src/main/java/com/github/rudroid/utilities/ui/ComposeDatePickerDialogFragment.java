package com.github.rudroid.utilities.ui;

import a5.q2;
import a5.r2;
import a5.t2;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.DialogFragment;
import java.time.LocalDate;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ComposeDatePickerDialogFragment extends DialogFragment {
    public static final a Companion = new a();
    public j71.c J0;
    public j71.a K0;
    public LocalDate L0;
    public String M0;

    public static final class a {
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k71.k.g(layoutInflater, "inflater");
        ComposeView composeView = new ComposeView(i4(), (AttributeSet) null, 6);
        composeView.setContent(new r1.d(new u(this, 0), true, -179120339));
        return composeView;
    }

    public final void a4() {
        Window window;
        super.a4();
        Dialog dialog = ((DialogFragment) this).E0;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        k71.k.f(decorView, "getDecorView(...)");
        di.c.a(decorView);
        y51.c cVar = new y51.c(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new t2(window, cVar) : i >= 30 ? new r2(window, cVar) : new q2(window, cVar)).V(true);
    }

    public static Object t4(Object... a) {
        return null;
    }
    public Object t4(Object p1, Object p2) { return null; }
}
