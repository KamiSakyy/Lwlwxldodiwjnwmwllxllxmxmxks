package hz;

import androidx.compose.foundation.lazy.layout.s0;
import androidx.compose.runtime.j3;
import com.github.rudroid.home.navigation.EditMyWorkRoute;
import com.github.rudroid.home.navigation.HomeDiscussionsRoute;
import com.github.rudroid.home.navigation.HomeEntryPointRoute;
import com.github.rudroid.home.navigation.HomeReposRoute;
import com.github.rudroid.home.navigation.HomeScreenRoute;
import com.github.rudroid.home.navigation.MainGraphRoute;
import com.github.rudroid.home.navigation.SerializableSimpleRepositoryList;
import com.github.rudroid.home.search.navigation.GlobalSearchEntryPointRoute;
import com.github.rudroid.home.search.navigation.GlobalSearchRoute;
import com.github.rudroid.home.search.navigation.SearchResultsRoute;
import com.github.rudroid.home.search.navigation.SearchViewModelType;
import com.github.rudroid.shortcuts.navigation.ChooseShortcutRepositoryRoute;
import com.github.rudroid.shortcuts.navigation.ConfigureShortcutRoute;
import com.github.rudroid.shortcuts.navigation.ShortcutsEntryPointRoute;
import com.github.rudroid.shortcuts.navigation.ShortcutsOverviewRoute;
import com.github.service.dotcom.models.response.copilot.serialization.ChatClientConfirmationResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadResponse$$serializer;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadWithMessagesResponse;
import com.github.service.dotcom.models.response.copilot.serialization.ChatThreadsResponse;
import com.github.service.dotcom.models.response.copilot.serialization.PostMessageFeedbackInput;
import com.github.service.dotcom.models.response.copilot.serialization.PostMessageInput;
import com.github.service.models.response.SimpleRepository$;
import i1.p;
import java.lang.annotation.Annotation;
import k81.c1Shadow;
import k81.z;
import q81.t;
import v71.b0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class k implements j71.a {
    public final /* synthetic */ int r;

    public /* synthetic */ k(int i) {
        this.r = i;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventFunctionCallStatus", l.values(), new String[]{"started", "error", "completed", "unknown"}, new Annotation[][]{null, null, null, null});
            case 1:
                return c1Shadow.e("com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventFunctionCallType", m.values(), new String[]{"bing-search", "codesearch", "unknown"}, new Annotation[][]{null, null, null});
            case 2:
                ChatThreadResponse.Companion companion = ChatThreadResponse.Companion;
                return new k81.d(com.github.service.dotcom.models.response.copilot.serialization.b.d, 0);
            case 3:
                ChatThreadWithMessagesResponse.Companion companion2 = ChatThreadWithMessagesResponse.Companion;
                return new k81.d(ChatMessageResponse$$serializer.INSTANCE, 0);
            case 4:
                ChatThreadsResponse.Companion companion3 = ChatThreadsResponse.Companion;
                return new k81.d(ChatThreadResponse$$serializer.INSTANCE, 0);
            case 5:
                PostMessageFeedbackInput.Companion companion4 = PostMessageFeedbackInput.Companion;
                return b.Companion.serializer();
            case 6:
                PostMessageFeedbackInput.Companion companion5 = PostMessageFeedbackInput.Companion;
                return new k81.d(c.Companion.serializer(), 0);
            case 7:
                PostMessageInput.Companion companion6 = PostMessageInput.Companion;
                return new k81.d(com.github.service.dotcom.models.response.copilot.serialization.b.d, 0);
            case 8:
                PostMessageInput.Companion companion7 = PostMessageInput.Companion;
                return new k81.d(ChatClientConfirmationResponse$$serializer.INSTANCE, 0);
            case 9:
                return new p(new a0.e(Float.valueOf(0.0f), a0.f.j, (Object) null, 12));
            case 10:
                return new z("com.github.rudroid.home.navigation.EditMyWorkRoute", EditMyWorkRoute.INSTANCE, new Annotation[0]);
            case 11:
                return new z("com.github.rudroid.home.navigation.HomeDiscussionsRoute", HomeDiscussionsRoute.INSTANCE, new Annotation[0]);
            case 12:
                return new z("com.github.rudroid.home.navigation.HomeEntryPointRoute", HomeEntryPointRoute.INSTANCE, new Annotation[0]);
            case 13:
                return new z("com.github.rudroid.home.navigation.HomeReposRoute", HomeReposRoute.INSTANCE, new Annotation[0]);
            case 14:
                return new z("com.github.rudroid.home.navigation.HomeScreenRoute", HomeScreenRoute.INSTANCE, new Annotation[0]);
            case 15:
                return new z("com.github.rudroid.home.navigation.MainGraphRoute", MainGraphRoute.INSTANCE, new Annotation[0]);
            case 16:
                SerializableSimpleRepositoryList.Companion companion8 = SerializableSimpleRepositoryList.Companion;
                return new k81.d(SimpleRepository$.serializer.INSTANCE, 0);
            case 17:
                return new z("com.github.rudroid.shortcuts.navigation.ChooseShortcutRepositoryRoute", ChooseShortcutRepositoryRoute.INSTANCE, new Annotation[0]);
            case 18:
                ConfigureShortcutRoute.Companion companion9 = ConfigureShortcutRoute.Companion;
                return wm.b.Companion.serializer();
            case 19:
                return new z("com.github.rudroid.shortcuts.navigation.ShortcutsEntryPointRoute", ShortcutsEntryPointRoute.INSTANCE, new Annotation[0]);
            case 20:
                return new z("com.github.rudroid.shortcuts.navigation.ShortcutsOverviewRoute", ShortcutsOverviewRoute.INSTANCE, new Annotation[0]);
            case 21:
                j3 j3Var = ih.c.a;
                r0.d a = r0.e.a(0);
                r0.d a2 = r0.e.a(6);
                r0.d a3 = r0.e.a(4);
                r0.d a4 = r0.e.a(8);
                float f = 16;
                r0.d a5 = r0.e.a(f);
                r0.c cVar = new r0.c(50);
                return new ih.b(a, a2, a3, a4, a5, new r0.d(cVar, cVar, cVar, cVar), r0.e.c(f, f, 0.0f, 0.0f, 12), r0.e.a);
            case 22:
                s0 fVar = new ia.f();
                ha.e eVar = new ha.e();
                s0 s0Var = fVar;
                while (true) {
                    s0 s0Var2 = (ha.e) s0Var.s;
                    if (s0Var2 == null) {
                        s0Var.s = eVar;
                        return fVar;
                    }
                    s0Var = s0Var2;
                }
            case 23:
                return jh.a.a;
            case 24:
                return Long.valueOf(System.nanoTime());
            case 25:
                return b0.d();
            case 26:
                return new t();
            case 27:
                return new z("com.github.rudroid.home.search.navigation.GlobalSearchEntryPointRoute", GlobalSearchEntryPointRoute.INSTANCE, new Annotation[0]);
            case 28:
                return new z("com.github.rudroid.home.search.navigation.GlobalSearchRoute", GlobalSearchRoute.INSTANCE, new Annotation[0]);
            default:
                SearchResultsRoute.Companion companion10 = SearchResultsRoute.Companion;
                return c1Shadow.f("com.github.rudroid.home.search.navigation.SearchViewModelType", SearchViewModelType.values());
        }
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class p {
        public p() {
        }
    }
}
