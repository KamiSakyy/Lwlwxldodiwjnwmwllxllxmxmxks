package com.github.rudroid.support;

import android.content.ContentResolver;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.d1;
import androidx.lifecycle.l1;
import com.github.commonandroid.views.ScrollableTitleToolbar;
import com.github.rudroid.fragments.BaseBottomSheetDialog;
import com.github.rudroid.utilities.w0;
import com.github.rudroid.views.ProgressActionView;
import q.f3;
import v71.b0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class SupportBottomSheetDialog extends BaseBottomSheetDialog implements f3 {
    public final l1 V0;
    public MenuItem W0;
    public ProgressActionView X0;

    public static final class a extends k71.l implements j71.a {
        public a() {
            super(0);
        }

        public final Object a() {
            return SupportBottomSheetDialog.this.g4().K0();
        }
    }

    public static final class b extends k71.l implements j71.a {
        public b() {
            super(0);
        }

        public final Object a() {
            return SupportBottomSheetDialog.this.g4().g0();
        }
    }

    public static final class c extends k71.l implements j71.a {
        public c() {
            super(0);
        }

        public final Object a() {
            return SupportBottomSheetDialog.this.g4().f0();
        }
    }

    public SupportBottomSheetDialog() {
        super(true, true, true);
        this.V0 = new l1(k71.x.a(s.class), new a(), new c(), new b());
    }

    public final void D4(ScrollableTitleToolbar scrollableTitleToolbar) {
        Drawable mutate;
        String C3 = C3(2131954746);
        k71.k.f(C3, "getString(...)");
        G4(C3);
        scrollableTitleToolbar.m(2131689498);
        scrollableTitleToolbar.setOnMenuItemClickListener(this);
        MenuItem findItem = scrollableTitleToolbar.getMenu().findItem(2131363369);
        k71.k.f(findItem, "findItem(...)");
        this.W0 = findItem;
        findItem.setEnabled(true);
        MenuItem menuItem = this.W0;
        if (menuItem == null) {
            k71.k.m("submitMenuItem");
            throw null;
        }
        Drawable icon = menuItem.getIcon();
        if (icon != null && (mutate = icon.mutate()) != null) {
            mutate.setTint(i4().getColor(2131100986));
        }
        w0.a(((s) this.V0.getValue()).v, F3(), androidx.lifecycle.w.u, new f(this, null));
    }

    public final androidx.fragment.app.a0 E4() {
        SupportFragment.Companion.getClass();
        return new SupportFragment();
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        k71.k.g(layoutInflater, "inflater");
        this.X0 = new ProgressActionView(i4(), 0);
        return super.R3(layoutInflater, viewGroup, bundle);
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        s sVar = (s) this.V0.getValue();
        ContentResolver contentResolver = g4().getContentResolver();
        k71.k.f(contentResolver, "getContentResolver(...)");
        sVar.Q();
        sVar.R();
        if (sVar.S()) {
            return true;
        }
        b0.z(d1.k(sVar), (a71.h) null, (v71.a0) null, new v(sVar, contentResolver, null), 3);
        return true;
    }
}
