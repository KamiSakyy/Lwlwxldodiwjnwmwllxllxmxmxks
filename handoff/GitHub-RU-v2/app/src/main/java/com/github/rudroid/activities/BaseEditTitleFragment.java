package com.github.rudroid.activities;

import android.os.Bundle;
import android.text.Editable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import com.github.rudroid.fragments.BindingFragment;
import com.github.rudroid.views.ProgressActionView;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class BaseEditTitleFragment extends BindingFragment {
    public ProgressActionView C0;
    public MenuItem D0;
    public final int B0 = 2131558794;
    public final a E0 = new a();

    public static final class a implements a5.t {
        public a() {
        }

        @Override // a5.t
        public final boolean a0(MenuItem menuItem) {
            k71.k.g(menuItem, "menuItem");
            BaseEditTitleFragment baseEditTitleFragment = BaseEditTitleFragment.this;
            MenuItem menuItem2 = baseEditTitleFragment.D0;
            if (menuItem2 == null || menuItem.getItemId() != menuItem2.getItemId()) {
                return false;
            }
            com.github.rudroid.utilities.w0.b(baseEditTitleFragment.H4().q(((ic.s2) baseEditTitleFragment.B4()).P.getText().toString()), baseEditTitleFragment.F3(), new r(baseEditTitleFragment, null));
            return true;
        }

        @Override // a5.t
        public final void o2(Menu menu, MenuInflater menuInflater) {
            k71.k.g(menu, "menu");
            k71.k.g(menuInflater, "menuInflater");
            menuInflater.inflate(2131689491, menu);
            BaseEditTitleFragment.this.D0 = menu.findItem(2131363277);
        }
    }

    @Override // com.github.rudroid.fragments.BindingFragment
    public final int C4() {
        return this.B0;
    }

    public abstract com.github.rudroid.viewmodels.u0 H4();

    public final void I4(boolean z10) {
        MenuItem menuItem = this.D0;
        if (menuItem != null) {
            menuItem.setEnabled(H4().y(((ic.s2) B4()).P.getText().toString()) && !z10);
        }
        if (!z10) {
            MenuItem menuItem2 = this.D0;
            if (menuItem2 != null) {
                menuItem2.setActionView((View) null);
                rc.h.c(menuItem2, i4(), menuItem2.isEnabled() ? 2131100986 : 2131100987);
                return;
            }
            return;
        }
        MenuItem menuItem3 = this.D0;
        if (menuItem3 != null) {
            ProgressActionView progressActionView = this.C0;
            if (progressActionView != null) {
                menuItem3.setActionView((View) progressActionView);
            } else {
                k71.k.m("progressActionView");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.a0
    public final void c4(View view, Bundle bundle) {
        k71.k.g(view, "view");
        BindingFragment.D4(this, this.E0, C3(2131952807), null, 12);
        this.C0 = new ProgressActionView(i4(), 0);
        EditText editText = ((ic.s2) B4()).P;
        k71.k.f(editText, "editTitle");
        rc.e.b(editText);
        EditText editText2 = ((ic.s2) B4()).P;
        k71.k.f(editText2, "editTitle");
        editText2.addTextChangedListener(new s(this));
        ((ic.s2) B4()).P.setText(Editable.Factory.getInstance().newEditable(H4().n()));
        ((ic.s2) B4()).P.setSelection(H4().n().length());
    }

    public <T0> T0 B4(Object... a) {
        return null;
    }

    public <T0> T0 F3(Object... a) {
        return null;
    }

    public <T0> T0 i4(Object... a) {
        return null;
    }

    public <T0> T0 C3(Object... a) {
        return null;
    }
}
