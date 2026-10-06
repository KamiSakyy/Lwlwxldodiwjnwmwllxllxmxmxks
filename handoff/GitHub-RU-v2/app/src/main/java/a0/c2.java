package a0;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Bundle;
import android.os.CancellationSignal;
import androidx.compose.runtime.j3;
import com.github.domain.discussions.data.DiscussionCategoryData$;
import com.github.domain.searchandfilter.filters.data.AgentTasksSortFilter;
import com.github.domain.searchandfilter.filters.data.AgentTasksStateFilter;
import com.github.domain.searchandfilter.filters.data.AssigneeFilter;
import com.github.domain.searchandfilter.filters.data.AuthorFilter;
import com.github.domain.searchandfilter.filters.data.CustomFilter;
import com.github.domain.searchandfilter.filters.data.CustomInstructionsFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionCategoryFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionStatusFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter;
import com.github.domain.searchandfilter.filters.data.DiscussionsIsUnansweredFilter;
import com.github.rudroid.agents.chatthreads.navigation.ChatThreadsNavRoute;
import com.github.rudroid.projects.navigation.UserProjectsEntryPointRoute;
import com.github.rudroid.projects.navigation.UserProjectsRoute;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.KotlinNothingValueException;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class c2 implements j71.a {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f37r;

    public /* synthetic */ c2(int i) {
        this.f37r = i;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, w61.h] */
    public final Object a() {
        Class<?> returnType;
        int i = 1;
        switch (this.f37r) {
            case k5.f.J:
                e7.t tVar = new e7.t(new m1(i));
                tVar.f();
                return tVar;
            case 1:
                return new androidx.lifecycle.g1();
            case 2:
                aa.u uVar = new aa.u(4);
                uVar.a(k71.xShadow.a(a7.b.class), new m1(26));
                return uVar.d();
            case 3:
                androidx.compose.runtime.v.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
            case 4:
                j3 j3Var = androidx.compose.runtime.tooling.e.f1851a;
                return null;
            case 5:
                j3 j3Var2 = androidx.compose.runtime.tooling.f.f1852a;
                return null;
            case 6:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 7:
                try {
                    Method method = (Method) androidx.sqlite.db.framework.b.f3103u.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 8:
                return new Bundle();
            case 9:
                return new k81.z("com.github.rudroid.agents.chatthreads.navigation.ChatThreadsNavRoute", ChatThreadsNavRoute.INSTANCE, new Annotation[0]);
            case 10:
                return new k81.z("com.github.rudroid.projects.navigation.UserProjectsEntryPointRoute", UserProjectsEntryPointRoute.INSTANCE, new Annotation[0]);
            case e6.w.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                return new k81.z("com.github.rudroid.projects.navigation.UserProjectsRoute", UserProjectsRoute.INSTANCE, new Annotation[0]);
            case e6.w.HAS_IMAGE_ALPHA_FIELD_NUMBER /* 12 */:
                AgentTasksSortFilter.Companion companion = AgentTasksSortFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case 13:
                AgentTasksSortFilter.Companion companion2 = AgentTasksSortFilter.Companion;
                return on.g.Companion.serializer();
            case 14:
                AgentTasksStateFilter.Companion companion3 = AgentTasksStateFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case androidx.compose.foundation.layout.b.f1079h /* 15 */:
                AgentTasksStateFilter.Companion companion4 = AgentTasksStateFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.agent.AgentTaskStatus", cm.a.values());
            case 16:
                AgentTasksStateFilter.Companion companion5 = AgentTasksStateFilter.Companion;
                return new k81.d(k81.c1Shadow.f("com.github.service.agents.AgentTaskState", on.c.values()), 0);
            case 17:
                AssigneeFilter.Companion companion6 = AssigneeFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case 18:
                AssigneeFilter.Companion companion7 = AssigneeFilter.Companion;
                return new k81.d(new g81.b(k71.xShadow.a(yz0.f.class), new Annotation[0]), 0);
            case 19:
                AuthorFilter.Companion companion8 = AuthorFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case 20:
                AuthorFilter.Companion companion9 = AuthorFilter.Companion;
                return new g81.b(k71.xShadow.a(yz0.f.class), new Annotation[0]);
            case 21:
                CustomFilter.Companion companion10 = CustomFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case 22:
                CustomInstructionsFilter.Companion companion11 = CustomInstructionsFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case 23:
                DiscussionCategoryFilter.Companion companion12 = DiscussionCategoryFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case 24:
                DiscussionCategoryFilter.Companion companion13 = DiscussionCategoryFilter.Companion;
                return new k81.d(DiscussionCategoryData$.serializer.INSTANCE, 0);
            case 25:
                DiscussionStatusFilter.Companion companion14 = DiscussionStatusFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case 26:
                DiscussionStatusFilter.Companion companion15 = DiscussionStatusFilter.Companion;
                return k81.c1Shadow.f("com.github.rudroid.common.DiscussionStatus", com.github.rudroid.common.h.values());
            case 27:
                DiscussionUserRelationshipFilter.Companion companion16 = DiscussionUserRelationshipFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
            case 28:
                DiscussionUserRelationshipFilter.Companion companion17 = DiscussionUserRelationshipFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.DiscussionUserRelationshipFilter.Value", bm.h.values());
            default:
                DiscussionsIsUnansweredFilter.Companion companion18 = DiscussionsIsUnansweredFilter.Companion;
                return k81.c1Shadow.f("com.github.domain.searchandfilter.filters.data.Filter.FilterType", bm.l.values());
        }
    }
}
