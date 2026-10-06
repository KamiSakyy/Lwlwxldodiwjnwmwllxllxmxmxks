package com.github.rudroid.templates;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.github.rudroid.fragments.BaseComposeBottomSheetDialog;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_IssueTemplatesBottomSheet extends BaseComposeBottomSheetDialog {
    public m61.j P0;
    public boolean Q0 = false;
    public boolean R0 = false;

    public final void C4() {
        if (this.R0) {
            return;
        }
        this.R0 = true;
        ((i) w()).k((IssueTemplatesBottomSheet) this);
    }

    public final void H4() {
        if (this.P0 == null) {
            this.P0 = new m61.j(super/*com.github.rudroid.fragments.Hilt_BaseComposeBottomSheetDialog*/.y3(), this);
            this.Q0 = b4.V(super/*com.github.rudroid.fragments.Hilt_BaseComposeBottomSheetDialog*/.y3());
        }
    }

    public final void N3(Activity activity) {
        super/*com.github.rudroid.fragments.Hilt_BaseComposeBottomSheetDialog*/.N3(activity);
        m61.j jVar = this.P0;
        i4.S(jVar == null || m61.f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        H4();
        C4();
    }

    public final void O3(Context context) {
        super/*com.github.rudroid.fragments.Hilt_BaseComposeBottomSheetDialog*/.O3(context);
        H4();
        C4();
    }

    public final LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super/*com.github.rudroid.fragments.Hilt_BaseComposeBottomSheetDialog*/.V3(bundle);
        return V3.cloneInContext(new m61.j(V3, this));
    }

    public final Context y3() {
        if (super/*com.github.rudroid.fragments.Hilt_BaseComposeBottomSheetDialog*/.y3() == null && !this.Q0) {
            return null;
        }
        H4();
        return this.P0;
    }

    public static  w(Object... a) {
        return null;
    }
}
