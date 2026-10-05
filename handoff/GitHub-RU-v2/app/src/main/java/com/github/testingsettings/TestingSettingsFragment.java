package com.github.testingsettings;

import a71.h;
import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.d1;
import b6.v0;
import f0.b2;
import f0.o0;
import gi.c;
import h11.g;
import k71.k;
import n5.f;
import oa.e;
import oa.m;
import sy.w;
import v71.a0;
import v71.b0;
import w61.p;

/* loaded from: /home/user/work/p/classes4.dex */
public final class TestingSettingsFragment extends Hilt_TestingSettingsFragment {
    public static final g Companion = new g();
    public e A0;
    public f B0;
    public f C0;
    public final p D0 = w.t(new b2(13, this));
    public c y0;
    public m z0;

    public final void c4(View view, Bundle bundle) {
        k.g(view, "view");
        view.findViewById(2131363408).setAdapter(new h11.f(new o0(2, this, TestingSettingsFragment.class, "onTestingFlagChanged", "onTestingFlagChanged(Lcom/github/commonandroid/featureflag/TestingFlags;Z)V", 0, 0, 1)));
    }

    public final c u4() {
        c cVar = this.y0;
        if (cVar != null) {
            return cVar;
        }
        k.m("systemPreferences");
        throw null;
    }

    public final ei.f v4() {
        return (ei.f) this.D0.getValue();
    }

    public final void w4(j71.c cVar) {
        b0.z(d1.i(this), (h) null, (a0) null, new v0(this, cVar, (a71.c) null), 3);
    }

}
