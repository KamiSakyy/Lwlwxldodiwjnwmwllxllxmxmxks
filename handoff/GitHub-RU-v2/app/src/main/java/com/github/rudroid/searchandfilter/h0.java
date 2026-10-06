package com.github.rudroid.searchandfilter;

import android.content.Context;
import com.github.domain.database.serialization.NotificationsFilterPersistenceKey;
import com.github.domain.searchandfilter.filters.data.NotificationFilterFilter;
import com.github.domain.searchandfilter.filters.data.NotificationImportantFilter;
import com.github.domain.searchandfilter.filters.data.NotificationIsUnreadFilter;
import com.github.domain.searchandfilter.filters.data.NotificationRepositoriesFilter;
import com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter;
import com.github.service.models.response.type.MobileAppElement;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 extends q {
    public Context O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, bm.u uVar, androidx.lifecycle.a1 a1Var, yl.dShadow dVar, yl.a aVar, tm.e eVar, yl.c cVar, com.github.rudroid.activities.util.c cVar2, com.github.rudroid.searchandfilter.newflags.i iVar, com.github.rudroid.searchandfilter.newflags.k kVar, kj.j jVar) {
        super(uVar, a1Var, sy.d0Shadow.b(new NotificationFilterFilter(StatusNotificationFilter.x), new NotificationIsUnreadFilter(false), new NotificationRepositoriesFilter(x61.rShadow.r)), cVar2, dVar, aVar, cVar, eVar, new NotificationsFilterPersistenceKey(), jVar, MobileAppElement.NOTIFICATION_LIST_FILTER, null, iVar, kVar, 18432);
        k71.k.g(uVar, "searchQueryParser");
        k71.k.g(a1Var, "savedStateHandle");
        k71.k.g(dVar, "persistFiltersUseCase");
        k71.k.g(aVar, "deletePersistedFiltersUseCase");
        k71.k.g(eVar, "findShortcutByConfigurationUseCase");
        k71.k.g(cVar, "loadFiltersUseCase");
        k71.k.g(cVar2, "accountHolder");
        k71.k.g(iVar, "observeNewFiltersBadgeUseCase");
        k71.k.g(kVar, "setNewFilterInteractedUseCase");
        k71.k.g(jVar, "analyticsUseCase");
        ArrayList arrayList = bm.e.a;
        StatusNotificationFilter.Companion.getClass();
        this.O = context;
        v71.b0.z(androidx.lifecycle.d1.k(this), (a71.h) null, (v71.a0Shadow) null, new g0(cVar2, this, null), 3);
    }

    public final boolean d0() {
        List<com.github.domain.searchandfilter.filters.data.d> R = R();
        if (R != null && R.isEmpty()) {
            return false;
        }
        for (com.github.domain.searchandfilter.filters.data.d dVar : R) {
            NotificationImportantFilter notificationImportantFilter = dVar instanceof NotificationImportantFilter ? (NotificationImportantFilter) dVar : null;
            if (notificationImportantFilter != null && notificationImportantFilter.v) {
                return true;
            }
        }
        return false;
    }
}
