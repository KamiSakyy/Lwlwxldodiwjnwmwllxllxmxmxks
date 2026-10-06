package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int u0;
    public b v0;

    public final void P3(Bundle bundle) {
        super.P3(bundle);
        if (bundle == null) {
            bundle = ((a0) this).x;
        }
        this.u0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.v0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View R3(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(y3(), this.u0));
        throw null;
    }

    public final void Z3(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.u0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.v0);
    }

    public static Object y3(Object... a) {
        return null;
    }
}
