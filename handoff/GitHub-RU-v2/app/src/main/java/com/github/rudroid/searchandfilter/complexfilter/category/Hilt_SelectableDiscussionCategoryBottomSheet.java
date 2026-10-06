package com.github.rudroid.searchandfilter.complexfilter.category;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseBottomSheetDialog;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class Hilt_SelectableDiscussionCategoryBottomSheet extends SearchAndFilterBaseBottomSheetDialog {
    public m61.j V0;
    public boolean W0 = false;
    public boolean X0 = false;

    public final void C4() {
        if (this.X0) {
            return;
        }
        this.X0 = true;
        ((d) w()).J2((SelectableDiscussionCategoryBottomSheet) this);
    }

    public final void L4() {
        if (this.V0 == null) {
            this.V0 = new m61.j(super/*com.github.rudroid.fragments.Hilt_BaseBottomSheetDialog*/.y3(), this);
            this.W0 = b4.V(super/*com.github.rudroid.fragments.Hilt_BaseBottomSheetDialog*/.y3());
        }
    }

    public final void N3(Activity activity) {
        super/*com.github.rudroid.fragments.Hilt_BaseBottomSheetDialog*/.N3(activity);
        m61.j jVar = this.V0;
        i4.S(jVar == null || m61.f.c(jVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        L4();
        C4();
    }

    public final void O3(Context context) {
        super/*com.github.rudroid.fragments.Hilt_BaseBottomSheetDialog*/.O3(context);
        L4();
        C4();
    }

    public final LayoutInflater V3(Bundle bundle) {
        LayoutInflater V3 = super/*com.github.rudroid.fragments.Hilt_BaseBottomSheetDialog*/.V3(bundle);
        return V3.cloneInContext(new m61.j(V3, this));
    }

    public final Context y3() {
        if (super/*com.github.rudroid.fragments.Hilt_BaseBottomSheetDialog*/.y3() == null && !this.W0) {
            return null;
        }
        L4();
        return this.V0;
    }

    public static  w(Object... a) {
        return null;
    }

    public static  c4(Object... a) {
        return null;
    }
    public Object c4(Object p1, Object p2) { return null; }
}
