package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import android.content.Context;
import androidx.lifecycle.l1;
import com.github.domain.searchandfilter.filters.data.NotificationFilterFilter;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import com.github.domain.searchandfilter.filters.data.NotificationRepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.notification.CustomNotificationFilter;
import com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment;
import com.github.service.models.response.type.MobileSubjectType;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class n implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ SearchAndFilterBaseFragment s;

    public /* synthetic */ n(SearchAndFilterBaseFragment searchAndFilterBaseFragment, int i) {
        this.r = i;
        this.s = searchAndFilterBaseFragment;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                com.github.domain.searchandfilter.filters.data.notification.a aVar = (com.github.domain.searchandfilter.filters.data.notification.a) obj;
                l1 l1Var = ((SelectableNotificationFilterFragment) this.s).H0;
                com.github.rudroid.searchandfilter.h0 h0Var = (com.github.rudroid.searchandfilter.h0) l1Var.getValue();
                k71.k.d(aVar);
                h0Var.Y(new NotificationFilterFilter(aVar), MobileSubjectType.FILTER_NOTIFICATION_FILTER);
                com.github.rudroid.searchandfilter.h0 h0Var2 = (com.github.rudroid.searchandfilter.h0) l1Var.getValue();
                fi.c cVar = fi.d.Companion;
                Context context = h0Var2.O;
                cVar.getClass();
                k71.k.g(context, "context");
                boolean z = !fi.c.b(context).getBoolean("new_focused_chip_shown", false) && fi.c.b(context).getBoolean("swipe_onboarding_notification_settings_shown", false);
                NotificationImportantFilter notificationImportantFilter = new NotificationImportantFilter(1, false, z);
                List<com.github.domain.searchandfilter.filters.data.d> R = h0Var2.R();
                if (R == null || !R.isEmpty()) {
                    for (com.github.domain.searchandfilter.filters.data.d dVar : R) {
                        NotificationFilterFilter notificationFilterFilter = dVar instanceof NotificationFilterFilter ? (NotificationFilterFilter) dVar : null;
                        if ((notificationFilterFilter != null ? notificationFilterFilter.v : null) instanceof CustomNotificationFilter) {
                            h0Var2.U(notificationImportantFilter.s);
                            break;
                        }
                    }
                }
                List R2 = h0Var2.R();
                if (R2 == null || !R2.isEmpty()) {
                    Iterator it = R2.iterator();
                    while (it.hasNext()) {
                        if (((com.github.domain.searchandfilter.filters.data.d) it.next()) instanceof NotificationImportantFilter) {
                        }
                    }
                }
                h0Var2.P(new NotificationImportantFilter(1, false, z), 1);
                break;
            default:
                List list = (List) obj;
                com.github.rudroid.searchandfilter.h0 h0Var3 = (com.github.rudroid.searchandfilter.h0) ((SelectableNotificationRepositoryFilterFragment) this.s).H0.getValue();
                k71.k.d(list);
                h0Var3.Y(new NotificationRepositoriesFilter(list), MobileSubjectType.FILTER_REPOSITORY);
                break;
        }
        return w61.a0.a;
    }
}
