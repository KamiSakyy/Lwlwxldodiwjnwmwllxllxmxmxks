package com.github.rudroid.widget.contribution;

import android.content.Context;
import android.content.SharedPreferences;
import com.github.rudroid.widget.contribution.ContributionWidgetSettingsActivity;
import java.util.Iterator;

@c71.e(c = "com.github.rudroid.widget.contribution.ContributionWidgetSettingsActivity$Companion", f = "ContributionWidgetSettingsActivity.kt", l = {58, 70, 76}, m = "removeUserWidgets", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class n extends c71.c {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ ContributionWidgetSettingsActivity.a C;
    public int D;
    public Context u;
    public oa.j v;
    public SharedPreferences w;
    public Iterator x;
    public z5.k y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ContributionWidgetSettingsActivity.a aVar, c71.c cVar) {
        super(cVar);
        this.C = aVar;
    }

    public final Object v(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, null, null, this);
    }
}
