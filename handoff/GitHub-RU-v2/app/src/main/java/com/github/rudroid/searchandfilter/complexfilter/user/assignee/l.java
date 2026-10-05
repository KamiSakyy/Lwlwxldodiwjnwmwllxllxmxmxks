package com.github.rudroid.searchandfilter.complexfilter.user.assignee;

import androidx.compose.runtime.t;
import com.github.rudroid.agents.sessionevents.b0;
import com.github.rudroid.agents.sessionevents.l;
import com.github.rudroid.agents.sessionevents.ui.t2;
import com.github.rudroid.searchandfilter.complexfilter.user.assignee.RepositoryAssigneesBottomSheet;
import com.github.rudroid.searchandfilter.complexfilter.user.author.RepositoryAuthorBottomSheet;
import com.github.rudroid.settings.SettingsNotificationsFragment;
import com.github.rudroid.settings.SettingsSwipeFragment;
import com.github.rudroid.settings.copilot.paywall.CopilotChatProPaywallActivity;
import com.github.rudroid.starredreposandlists.StarredRepositoriesAndListsActivity;
import com.github.rudroid.starredreposandlists.bottomsheet.ListSelectionBottomSheet;
import com.github.rudroid.templates.IssueTemplatesActivity;
import com.github.rudroid.twofactor.TwoFactorDialog;
import com.github.rudroid.users.UsersActivity;
import com.github.rudroid.utilities.ui.emojipicker.u;
import com.github.rudroid.utilities.w1;
import com.github.rudroid.utilities.x1;
import com.github.rudroid.utilities.y1;
import com.github.rudroid.viewmodels.image.a;
import com.github.rudroid.widget.WidgetUIState;
import com.github.rudroid.widget.WidgetUIState$Error$$serializer;
import com.github.rudroid.y;
import java.lang.annotation.Annotation;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k81.z;
import kotlinx.serialization.KSerializer;
import sy.d0;
import w61.a0;
import w61.p;
import x61.x;
import xn.z2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class l implements j71.a {
    public final /* synthetic */ int r;

    public /* synthetic */ l(int i) {
        this.r = i;
    }

    public final Object a() {
        int i = this.r;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                RepositoryAssigneesBottomSheet.a aVar = RepositoryAssigneesBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 1:
                RepositoryAuthorBottomSheet.a aVar2 = RepositoryAuthorBottomSheet.Companion;
                throw new IllegalStateException("EXTRA_IS_ACTIVITY_HOSTED not set.");
            case 2:
                SettingsNotificationsFragment.a aVar3 = SettingsNotificationsFragment.Companion;
                return Boolean.TRUE;
            case 3:
                SettingsSwipeFragment.a aVar4 = SettingsSwipeFragment.Companion;
                return Boolean.FALSE;
            case 4:
                CopilotChatProPaywallActivity.a aVar5 = CopilotChatProPaywallActivity.Companion;
                return null;
            case 5:
                StarredRepositoriesAndListsActivity.a aVar6 = StarredRepositoriesAndListsActivity.Companion;
                throw new IllegalStateException("EXTRA_LOGIN must be set!");
            case 6:
                return t.B(Boolean.FALSE);
            case 7:
                ListSelectionBottomSheet.a aVar7 = ListSelectionBottomSheet.Companion;
                throw new IllegalStateException("repoName must be set");
            case 8:
                IssueTemplatesActivity.a aVar8 = IssueTemplatesActivity.Companion;
                return null;
            case 9:
                int i2 = TwoFactorDialog.B;
                return a0Var;
            case 10:
                return a0Var;
            case 11:
                return t.B(Boolean.FALSE);
            case 12:
                return t.B(Boolean.FALSE);
            case 13:
                UsersActivity.a aVar9 = UsersActivity.Companion;
                throw new IllegalStateException("User params must be set");
            case 14:
                UsersActivity.a aVar10 = UsersActivity.Companion;
                throw new IllegalStateException("ViewType params must be set");
            case 15:
                UsersActivity.a aVar11 = UsersActivity.Companion;
                return null;
            case 16:
                int i3 = w1.a;
                return y1.a().a("Please configure the deployment settings for your application.");
            case 17:
                int i4 = x1.a;
                return y1.a().a("Please configure the deployment settings for your application.");
            case 18:
                em.a aVar12 = y1.a;
                return new s91.e(new c21.j(8));
            case 19:
                em.a aVar13 = y1.a;
                Instant parse = Instant.parse("2026-03-01T12:00:00Z");
                k71.k.f(parse, "parse(...)");
                b0 iVar = new b0.i("1", 2131954383, (String) null, parse);
                k91.a a = y1.a().a("Fix the auth bug in the login flow");
                Instant parse2 = Instant.parse("2026-03-01T12:00:01Z");
                k71.k.f(parse2, "parse(...)");
                b0 lVar = new b0.l("2", true, false, "Fix the auth bug in the login flow", a, parse2);
                k91.a a2 = y1.a().a("Exploring codebase");
                Instant parse3 = Instant.parse("2026-03-01T12:00:02Z");
                k71.k.f(parse3, "parse(...)");
                b0 dVar = new b0.d("3", "Exploring codebase", a2, parse3);
                t2 t2Var = t2.s;
                long currentTimeMillis = System.currentTimeMillis() - 60000;
                long currentTimeMillis2 = System.currentTimeMillis();
                Instant parse4 = Instant.parse("2026-03-01T12:00:03Z");
                k71.k.f(parse4, "parse(...)");
                b0 hVar = new b0.h("4", "Fix the auth bug in the login flow", 2, true, t2Var, currentTimeMillis, Long.valueOf(currentTimeMillis2), parse4);
                k91.a a3 = y1.a().a("I found the issue. Here's the fix:\n```kotlin\nfun authenticate() {\n    user?.let { processLogin(it) }\n}\n```");
                Instant parse5 = Instant.parse("2026-03-01T12:00:04Z");
                k71.k.f(parse5, "parse(...)");
                return x61.l.r(new b0[]{iVar, lVar, dVar, hVar, new b0.a("5", "I found the issue. Here's the fix:\n```kotlin\nfun authenticate() {\n    user?.let { processLogin(it) }\n}\n```", a3, parse5, (String) null)});
            case 20:
                em.a aVar14 = y1.a;
                List r = x61.l.r(new String[]{"Extract to a separate module", "Refactor inline", "Create a utility class"});
                ArrayList arrayList = new ArrayList(x61.n.F(r, 10));
                Iterator it = r.iterator();
                while (it.hasNext()) {
                    arrayList.add(new l.i("", (String) it.next(), false));
                }
                k91.a a4 = y1.a().a("Which approach do you prefer for the refactoring?");
                Instant parse6 = Instant.parse("2026-03-01T12:00:05Z");
                k71.k.f(parse6, "parse(...)");
                return new b0.e.a("ask-user-1", (String) null, "ask_user", "Which approach do you prefer for the refactoring?", arrayList, a4, parse6, false, (String) null, 896);
            case 21:
                em.a aVar15 = y1.a;
                List r2 = x61.l.r(new String[]{"Commit and push", "Review changes first", "Discard changes"});
                ArrayList arrayList2 = new ArrayList(x61.n.F(r2, 10));
                Iterator it2 = r2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new l.e("", true, false, (String) it2.next(), (Boolean) null, (String) null, 52));
                }
                ArrayList m0 = x61.m.m0(arrayList2, new l.d("Plan complete. Ready to commit changes.", ""));
                k91.a a5 = y1.a().a("Plan complete. Ready to commit changes.");
                Instant parse7 = Instant.parse("2026-03-01T12:00:06Z");
                k71.k.f(parse7, "parse(...)");
                return new b0.e.c("exit-plan-1", (String) null, "exit_plan_mode", "Plan complete. Ready to commit changes.", m0, a5, parse7, false, (String) null, 896);
            case 22:
                em.a aVar16 = y1.a;
                z2 z2Var = z2.s;
                List r3 = x61.l.r(new l.b[]{new l.b("call_bash_1", false, z2Var), new l.b("call_bash_1", true, z2Var), new l.b("call_bash_1", true, z2.t)});
                k91.a a6 = y1.a().a("Run the test suite to verify changes");
                Instant parse8 = Instant.parse("2026-03-01T12:00:07Z");
                k71.k.f(parse8, "parse(...)");
                return new b0.e.d("perm-req-1", "call_bash_1", "commands", "Run the test suite to verify changes", "npm test -- --coverage", (String) null, (String) null, true, r3, a6, parse8, false, (com.github.rudroid.fileschanged.ui.a0) null, (String) null, 30720);
            case 23:
                em.a aVar17 = y1.a;
                z2 z2Var2 = z2.s;
                List r4 = x61.l.r(new l.b[]{new l.b("call_write_1", false, z2Var2), new l.b("call_write_1", true, z2Var2)});
                k91.a a7 = y1.a().a("Write changes to the configuration file");
                Instant parse9 = Instant.parse("2026-03-01T12:00:08Z");
                k71.k.f(parse9, "parse(...)");
                return new b0.e.d("perm-req-2", "call_write_1", "write", "Write changes to the configuration file", (String) null, "src/main/java/Config.kt", "/project/src/main/java/Config.kt", false, r4, a7, parse9, false, (com.github.rudroid.fileschanged.ui.a0) null, (String) null, 30720);
            case 24:
                p pVar = u.a;
                return x.t(new w61.k(y.r, d0.o(new w61.k("accessibility", "https://github.githubassets.com/images/icons/emoji/accessibility.png?v8"), new w61.k("atom", "https://github.githubassets.com/images/icons/emoji/atom.png?v8"), new w61.k("basecamp", "https://github.githubassets.com/images/icons/emoji/basecamp.png?v8"), new w61.k("basecampy", "https://github.githubassets.com/images/icons/emoji/basecampy.png?v8"), new w61.k("bowtie", "https://github.githubassets.com/images/icons/emoji/bowtie.png?v8"), new w61.k("dependabot", "https://github.githubassets.com/images/icons/emoji/dependabot.png?v8"), new w61.k("electron", "https://github.githubassets.com/images/icons/emoji/electron.png?v8"), new w61.k("feelsgood", "https://github.githubassets.com/images/icons/emoji/feelsgood.png?v8"), new w61.k("finnadie", "https://github.githubassets.com/images/icons/emoji/finnadie.png?v8"), new w61.k("fishsticks", "https://github.githubassets.com/images/icons/emoji/fishsticks.png?v8"), new w61.k("goberserk", "https://github.githubassets.com/images/icons/emoji/goberserk.png?v8"), new w61.k("godmode", "https://github.githubassets.com/images/icons/emoji/godmode.png?v8"), new w61.k("hurtrealbad", "https://github.githubassets.com/images/icons/emoji/hurtrealbad.png?v8"), new w61.k("neckbeard", "https://github.githubassets.com/images/icons/emoji/neckbeard.png?v8"), new w61.k("octocat", "https://github.githubassets.com/images/icons/emoji/octocat.png?v8"), new w61.k("rage1", "https://github.githubassets.com/images/icons/emoji/rage1.png?v8"), new w61.k("rage2", "https://github.githubassets.com/images/icons/emoji/rage2.png?v8"), new w61.k("rage3", "https://github.githubassets.com/images/icons/emoji/rage3.png?v8"), new w61.k("rage4", "https://github.githubassets.com/images/icons/emoji/rage4.png?v8"), new w61.k("shipit", "https://github.githubassets.com/images/icons/emoji/shipit.png?v8"), new w61.k("suspect", "https://github.githubassets.com/images/icons/emoji/suspect.png?v8"), new w61.k("trollface", "https://github.githubassets.com/images/icons/emoji/trollface.png?v8"))));
            case 25:
                a.C0014a c0014a = com.github.rudroid.viewmodels.image.a.Companion;
                throw new IllegalStateException("Invalid Subject ID");
            case 26:
                WidgetUIState.Companion companion = WidgetUIState.Companion;
                return new g81.d("com.github.rudroid.widget.WidgetUIState", k71.x.a(WidgetUIState.class), new r71.b[]{k71.x.a(WidgetUIState.Error.class), k71.x.a(WidgetUIState.Loaded.class), k71.x.a(WidgetUIState.Loading.class), k71.x.a(WidgetUIState.Retrying.class), k71.x.a(WidgetUIState.SignedOut.class), k71.x.a(WidgetUIState.Waiting.class)}, new KSerializer[]{WidgetUIState$Error$$serializer.INSTANCE, new z("com.github.rudroid.widget.WidgetUIState.Loaded", WidgetUIState.Loaded.INSTANCE, new Annotation[0]), new z("com.github.rudroid.widget.WidgetUIState.Loading", WidgetUIState.Loading.INSTANCE, new Annotation[0]), new z("com.github.rudroid.widget.WidgetUIState.Retrying", WidgetUIState.Retrying.INSTANCE, new Annotation[0]), new z("com.github.rudroid.widget.WidgetUIState.SignedOut", WidgetUIState.SignedOut.INSTANCE, new Annotation[0]), new z("com.github.rudroid.widget.WidgetUIState.Waiting", WidgetUIState.Waiting.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 27:
                return new z("com.github.rudroid.widget.WidgetUIState.Loaded", WidgetUIState.Loaded.INSTANCE, new Annotation[0]);
            case 28:
                return new z("com.github.rudroid.widget.WidgetUIState.Loading", WidgetUIState.Loading.INSTANCE, new Annotation[0]);
            default:
                return new z("com.github.rudroid.widget.WidgetUIState.Retrying", WidgetUIState.Retrying.INSTANCE, new Annotation[0]);
        }
    }
}
