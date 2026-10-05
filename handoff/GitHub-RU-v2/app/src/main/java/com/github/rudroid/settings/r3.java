package com.github.rudroid.settings;

import android.view.View;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class r3 implements View.OnClickListener {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    public /* synthetic */ r3(int i, Object obj) {
        this.r = i;
        this.s = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.r) {
            case 0:
                ((ToolBarPreferenceFragmentCompat) this.s).g4().m().c();
                break;
            default:
                ((j71.a) this.s).a();
                break;
        }
    }
}
