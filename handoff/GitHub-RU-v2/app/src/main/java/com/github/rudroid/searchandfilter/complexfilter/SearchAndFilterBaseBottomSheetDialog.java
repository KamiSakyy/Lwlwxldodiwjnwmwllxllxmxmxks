package com.github.rudroid.searchandfilter.complexfilter;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.github.commonandroid.views.ScrollableTitleToolbar;
import com.github.rudroid.fragments.BaseBottomSheetDialog;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class SearchAndFilterBaseBottomSheetDialog extends BaseBottomSheetDialog {
    public SearchAndFilterBaseBottomSheetDialog() {
        super(false, false, true);
    }

    public void D4(ScrollableTitleToolbar scrollableTitleToolbar) {
        String C3 = C3(I4());
        k71.k.f(C3, "getString(...)");
        G4(C3);
        scrollableTitleToolbar.setCollapseIcon(com.github.rudroid.utilities.q.e(2131231114, 2131099947, i4()));
        scrollableTitleToolbar.m(2131689493);
        MenuItem findItem = scrollableTitleToolbar.getMenu().findItem(2131363297);
        k71.k.f(findItem, "findItem(...)");
        findItem.setOnActionExpandListener(new rc.g(new v(0, this, SearchAndFilterBaseBottomSheetDialog.class, "expand", "expand()V", 0, 0), new com.github.rudroid.widget.p(15)));
        String C32 = C3(H4());
        k71.k.f(C32, "getString(...)");
        rc.h.a(findItem, C32, new w(1, 8, SearchAndFilterBaseBottomSheetDialog.class, this, "onQueryChange", "onQueryChange(Ljava/lang/String;)Z"), new x(1, 8, SearchAndFilterBaseBottomSheetDialog.class, this, "onQuerySubmit", "onQuerySubmit(Ljava/lang/String;)Z"));
    }

    public abstract int H4();

    public abstract int I4();

    public abstract void J4(String str);

    public abstract void K4(String str);

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout;
        k71.k.g(layoutInflater, "inflater");
        View R3 = super.R3(layoutInflater, viewGroup, bundle);
        if (R3 != null && (frameLayout = (FrameLayout) R3.findViewById(2131362366)) != null) {
            float f = com.github.rudroid.utilities.g.a;
            DisplayMetrics displayMetrics = i4().getResources().getDisplayMetrics();
            frameLayout.setMinimumHeight(displayMetrics.heightPixels - ((displayMetrics.widthPixels * 9) / 16));
        }
        return R3;
    }
}
