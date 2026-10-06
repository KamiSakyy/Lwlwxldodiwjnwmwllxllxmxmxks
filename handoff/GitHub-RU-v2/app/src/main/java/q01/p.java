package q01;

import androidx.compose.runtime.d0;
import androidx.compose.runtime.j3;
import androidx.compose.runtime.t;
import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.rudroid.draft.navigation.SerializableProjectV2FieldList;
import com.github.rudroid.navigation.NotificationsEntryPointRoute;
import com.github.rudroid.navigation.NotificationsScreenRoute;
import com.github.rudroid.repositories.RepositoriesViewType;
import com.github.rudroid.repository.navigation.RepositoriesEntryPointRoute;
import com.github.rudroid.repository.navigation.RepositoriesRoute;
import com.github.rudroid.repository.navigation.SerializableFilterList;
import com.github.rudroid.repository.navigation.UsersRoute;
import com.github.rudroid.searchandfilter.filter.sort.FilterSortBottomSheetDialog;
import com.github.rudroid.searchandfilter.filter.sort.RepositoryFilterSortBottomSheetDialog;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope$AllRepositories;
import d2.a0Shadow;
import d2.r0;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import k81.c1Shadow;
import k81.z;
import l01.j0;
import sf.u;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class p implements j71.a {
    public final /* synthetic */ int r;

    @Override // j71.a
    public final Object a() {
        switch (this.r) {
            case 0:
                return new z("All_repositories", ShortcutScope$AllRepositories.INSTANCE, new Annotation[0]);
            case 1:
                SerializableProjectV2FieldList.Companion companion = SerializableProjectV2FieldList.Companion;
                return new k81.d(j0.Companion.serializer(), 0);
            case 2:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 3:
                RepositoriesEntryPointRoute.Companion companion2 = RepositoriesEntryPointRoute.Companion;
                return RepositoriesViewType.Companion.serializer();
            case 4:
                RepositoriesRoute.Companion companion3 = RepositoriesRoute.Companion;
                return RepositoriesViewType.Companion.serializer();
            case 5:
                SerializableFilterList.Companion companion4 = SerializableFilterList.Companion;
                return new k81.d(com.github.domain.searchandfilter.filters.data.d.Companion.serializer(), 0);
            case 6:
                UsersRoute.Companion companion5 = UsersRoute.Companion;
                return gn.n.Companion.serializer();
            case 7:
                UsersRoute.Companion companion6 = UsersRoute.Companion;
                return com.github.domain.users.a.Companion.serializer();
            case 8:
                return new fk.c();
            case 9:
                return new fk.g();
            case 10:
                return new r0(a0Shadow.c(1308617531));
            case 11:
                j3 j3Var = s0.p.a;
                return null;
            case 12:
                return new s3.j(0L);
            case 13:
                return new s3.j(0L);
            case 14:
                j3 j3Var2 = s1.b.a;
                return s1.a.r;
            case 15:
                return t.B(u.r);
            case 16:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 17:
                return new u1.c(new LinkedHashMap());
            case 18:
                j3 j3Var3 = u1.g.a;
                return null;
            case 19:
                d0 d0Var = u6.a.a;
                return null;
            case 20:
                return t.B(Boolean.FALSE);
            case 21:
                return new d9.e(0);
            case 22:
                return new z("com.github.rudroid.navigation.NotificationsEntryPointRoute", NotificationsEntryPointRoute.INSTANCE, new Annotation[0]);
            case 23:
                return new z("com.github.rudroid.navigation.NotificationsScreenRoute", NotificationsScreenRoute.INSTANCE, new Annotation[0]);
            case 24:
                FilterSortBottomSheetDialog.a aVar = FilterSortBottomSheetDialog.Companion;
                throw new IllegalStateException("Filter not set.");
            case 25:
                FilterSortBottomSheetDialog.a aVar2 = FilterSortBottomSheetDialog.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 26:
                RepositoryFilterSortBottomSheetDialog.a aVar3 = RepositoryFilterSortBottomSheetDialog.Companion;
                throw new IllegalStateException("Filter not set.");
            case 27:
                RepositoryFilterSortBottomSheetDialog.a aVar4 = RepositoryFilterSortBottomSheetDialog.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 28:
                ShortcutConfigurationModel.Companion companion7 = ShortcutConfigurationModel.Companion;
                return c1Shadow.f("com.github.service.models.response.shortcuts.ShortcutColor", ShortcutColor.values());
            default:
                ShortcutConfigurationModel.Companion companion8 = ShortcutConfigurationModel.Companion;
                return c1Shadow.f("com.github.service.models.response.shortcuts.ShortcutIcon", ShortcutIcon.values());
        }
    }
    public p(int p1) {
    }
}
