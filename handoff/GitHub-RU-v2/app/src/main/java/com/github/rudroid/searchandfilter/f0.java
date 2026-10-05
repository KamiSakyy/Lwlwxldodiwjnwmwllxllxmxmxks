package com.github.rudroid.searchandfilter;

import android.content.Context;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class f0<T> implements y71.j {
    public final /* synthetic */ h0 r;

    public f0(h0 h0Var) {
        this.r = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        boolean z;
        List R;
        Iterator<T> it;
        h0 h0Var = this.r;
        Context context = h0Var.O;
        if (((oa.j) obj).f(com.github.rudroid.common.a.O)) {
            fi.d.Companion.getClass();
            k71.k.g(context, "context");
            if (!fi.c.b(context).getBoolean("new_focused_chip_shown", false)) {
                k71.k.g(context, "context");
                if (fi.c.b(context).getBoolean("swipe_onboarding_notification_settings_shown", false)) {
                    z = true;
                    R = h0Var.R();
                    if (R != null || !R.isEmpty()) {
                        it = R.iterator();
                        while (it.hasNext()) {
                            if (((com.github.domain.searchandfilter.filters.data.d) it.next()) instanceof NotificationImportantFilter) {
                                break;
                            }
                        }
                    }
                    NotificationImportantFilter notificationImportantFilter = new NotificationImportantFilter(1, false, z);
                    ArrayList H0 = x61.m.H0(h0Var.t);
                    H0.add(1, notificationImportantFilter);
                    h0Var.t = H0;
                    h0Var.P(notificationImportantFilter, 1);
                }
            }
            z = false;
            R = h0Var.R();
            if (R != null) {
            }
            it = R.iterator();
            while (it.hasNext()) {
            }
            NotificationImportantFilter notificationImportantFilter2 = new NotificationImportantFilter(1, false, z);
            ArrayList H02 = x61.m.H0(h0Var.t);
            H02.add(1, notificationImportantFilter2);
            h0Var.t = H02;
            h0Var.P(notificationImportantFilter2, 1);
        } else {
            new NotificationImportantFilter(3, false, false);
            h0Var.T("FILTER_NOTIFICATION_IS_IMPORTANT");
        }
        return w61.a0.a;
    }
}
