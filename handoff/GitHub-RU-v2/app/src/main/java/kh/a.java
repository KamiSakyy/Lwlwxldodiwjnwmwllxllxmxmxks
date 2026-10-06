package kh;

import androidx.window.extensions.layout.WindowLayoutComponent;
import com.github.rudroid.commit.CommitDataContainer;
import com.github.rudroid.commit.navigation.CommitRoute;
import com.github.rudroid.commits.CommitsType;
import com.github.rudroid.commits.navigation.CommitsEntryPointRoute;
import com.github.rudroid.commits.navigation.CommitsRoute;
import com.github.rudroid.discussions.navigation.CreateDiscussionRepositorySearchRoute;
import com.github.rudroid.discussions.navigation.RepositoryDiscussionsEntryPointRoute;
import com.github.rudroid.discussions.navigation.RepositoryDiscussionsRoute;
import com.github.rudroid.spans.RoundedBgTextView;
import com.github.service.models.response.projects.ProjectFieldOption$Iteration$;
import com.github.service.models.response.projects.ProjectFieldOption$SingleOption$;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.projects.ProjectV2Field;
import com.github.service.models.response.projects.ProjectsMetaInfo;
import com.github.service.models.response.shortcuts.ShortcutScope;
import com.github.service.models.response.shortcuts.ShortcutScope$SpecificRepository$;
import java.lang.annotation.Annotation;
import jk.j;
import k3.l;
import k71.xShadow;
import k81.c1Shadow;
import k81.z;
import kotlinx.serialization.KSerializer;
import l01.j0;
import l81.p;
import l81.r;
import l81.t;
import l81.u;
import lg.h;
import n8.f;
import on.g;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class a implements j71.a {
    public final /* synthetic */ int r;

    public /* synthetic */ a(int i) {
        this.r = i;
    }

    public final Object a() {
        WindowLayoutComponent a;
        switch (this.r) {
            case 0:
                return b.b;
            case 1:
                ProjectV2Field.ProjectV2IterationField.Companion companion = ProjectV2Field.ProjectV2IterationField.Companion;
                return c1.f("com.github.service.models.response.projects.ProjectFieldType", ProjectFieldType.values());
            case 2:
                ProjectV2Field.ProjectV2IterationField.Companion companion2 = ProjectV2Field.ProjectV2IterationField.Companion;
                return new k81.d(ProjectFieldOption$Iteration$.serializer.INSTANCE, 0);
            case 3:
                ProjectV2Field.ProjectV2IterationField.Companion companion3 = ProjectV2Field.ProjectV2IterationField.Companion;
                return new k81.d(ProjectFieldOption$Iteration$.serializer.INSTANCE, 0);
            case 4:
                ProjectV2Field.ProjectV2SingleSelectField.Companion companion4 = ProjectV2Field.ProjectV2SingleSelectField.Companion;
                return c1.f("com.github.service.models.response.projects.ProjectFieldType", ProjectFieldType.values());
            case 5:
                ProjectV2Field.ProjectV2SingleSelectField.Companion companion5 = ProjectV2Field.ProjectV2SingleSelectField.Companion;
                return new k81.d(ProjectFieldOption$SingleOption$.serializer.INSTANCE, 0);
            case 6:
                ProjectV2Field.ProjectV2TextField.Companion companion6 = ProjectV2Field.ProjectV2TextField.Companion;
                return c1.f("com.github.service.models.response.projects.ProjectFieldType", ProjectFieldType.values());
            case 7:
                ProjectV2Field.ProjectV2UnknownField.Companion companion7 = ProjectV2Field.ProjectV2UnknownField.Companion;
                return c1.f("com.github.service.models.response.projects.ProjectFieldType", ProjectFieldType.values());
            case 8:
                ProjectsMetaInfo.Companion companion8 = ProjectsMetaInfo.Companion;
                return j0.Companion.serializer();
            case 9:
                ProjectsMetaInfo.Companion companion9 = ProjectsMetaInfo.Companion;
                return new k81.d(j0.Companion.serializer(), 0);
            case 10:
                return u.b;
            case 11:
                return r.b;
            case 12:
                return p.b;
            case 13:
                return t.b;
            case 14:
                return l81.e.b;
            case 15:
                int i = RoundedBgTextView.B;
                return new h();
            case 16:
                int i2 = RoundedBgTextView.B;
                return new lg.e();
            case 17:
                l lVar = lh.d.a;
                return lh.a.a;
            case 18:
                return Boolean.TRUE;
            case 19:
                CommitRoute.Companion companion10 = CommitRoute.Companion;
                return CommitDataContainer.Companion.serializer();
            case 20:
                return androidx.compose.runtime.t.B(Boolean.FALSE);
            case 21:
                return androidx.compose.runtime.t.B("");
            case 22:
                CommitsEntryPointRoute.Companion companion11 = CommitsEntryPointRoute.Companion;
                return CommitsType.Companion.serializer();
            case 23:
                CommitsRoute.Companion companion12 = CommitsRoute.Companion;
                return CommitsType.Companion.serializer();
            case 24:
                return new z("com.github.rudroid.discussions.navigation.CreateDiscussionRepositorySearchRoute", CreateDiscussionRepositorySearchRoute.INSTANCE, new Annotation[0]);
            case 25:
                RepositoryDiscussionsEntryPointRoute.Companion companion13 = RepositoryDiscussionsEntryPointRoute.Companion;
                return j.Companion.serializer();
            case 26:
                RepositoryDiscussionsRoute.Companion companion14 = RepositoryDiscussionsRoute.Companion;
                return j.Companion.serializer();
            case 27:
                return c1.f("com.github.service.agents.CopilotAgentTaskOrder", g.values());
            case 28:
                try {
                    ClassLoader classLoader = p8.g.class.getClassLoader();
                    p8.e eVar = classLoader != null ? new p8.e(classLoader, new m8.a(classLoader, 1)) : null;
                    if (eVar == null || (a = eVar.a()) == null) {
                        return null;
                    }
                    m8.a aVar = new m8.a(classLoader, 1);
                    int a2 = f.a();
                    return a2 >= 9 ? new r8.f(a, aVar) : a2 >= 6 ? new r8.e(a, aVar) : a2 >= 2 ? new r8.d(a, aVar) : a2 == 1 ? new r8.c(a, aVar) : new r8.a();
                } catch (Throwable unused) {
                    return null;
                }
            default:
                return new g81.d("com.github.service.models.response.shortcuts.ShortcutScope", x.a(com.github.service.models.response.shortcuts.a.class), new r71.b[]{x.a(ShortcutScope.AllRepositories.class), x.a(ShortcutScope.SpecificRepository.class)}, new KSerializer[]{new z("All_repositories", ShortcutScope.AllRepositories.INSTANCE, new Annotation[0]), ShortcutScope$SpecificRepository$.serializer.INSTANCE}, new Annotation[0]);
        }
    }
}
