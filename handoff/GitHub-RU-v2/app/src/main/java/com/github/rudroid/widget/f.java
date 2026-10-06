package com.github.rudroid.widget;

import android.content.Context;
import android.os.Bundle;
import com.github.rudroid.copilot.ui.v0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f extends e {
    public static final /* synthetic */ int i0 = 0;

    public f() {
        this.h0 = false;
        C(new d(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setResult(0);
        Bundle extras = getIntent().getExtras();
        int i = extras != null ? extras.getInt("appWidgetId", 0) : 0;
        if (i == 0) {
            finish();
        } else {
            e.c.a(this, new r1.d(new v0(this, i, 9), true, 2118008685));
        }
    }

    public abstract String s0(b6.c cVar);

    public abstract int t0();

    public abstract void u0(Context context, oa.j jVar, b6.c cVar);
    public Object C(Object) { return null; }
    public Object setResult(int) { return null; }
}
