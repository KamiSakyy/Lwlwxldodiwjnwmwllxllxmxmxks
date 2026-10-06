package com.github.rudroid.settings;

import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

/* loaded from: /home/user/work/p/classes3.dex */
public final class BottomOptionsSheetFragment extends BottomSheetDialogFragment {
    public final void P3(Bundle bundle) {
        super/*androidx.fragment.app.DialogFragment*/.P3(bundle);
        x4(2132018025);
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k71.k.g(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(2131558454, viewGroup, false);
        RecyclerView findViewById = inflate.findViewById(2131361962);
        k71.k.g((Object) null, "actions");
        findViewById.setAdapter(new a());
        return inflate;
    }

    public final void a4() {
        Window window;
        super/*androidx.fragment.app.DialogFragment*/.a4();
        Dialog dialog = ((DialogFragment) this).E0;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        View decorView = window.getDecorView();
        k71.k.f(decorView, "getDecorView(...)");
        di.c.a(decorView);
        y51.c cVar = new y51.c(window.getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new a5.t2(window, cVar) : i >= 30 ? new a5.r2(window, cVar) : new a5.q2(window, cVar)).V(true);
    }

    public static  x4(Object... a) {
        return null;
    }
}
