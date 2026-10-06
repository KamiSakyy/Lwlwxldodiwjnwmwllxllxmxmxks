package com.github.rudroid.utilities;

import ad.a;
import com.github.rudroid.agents.copilothome.navigation.e;
import com.github.rudroid.agents.k4;
import com.github.rudroid.agents.sessionevents.b0;
import com.github.rudroid.agents.sessionevents.t4;
import com.github.rudroid.agents.sessionevents.w4;
import com.github.rudroid.fileschanged.ui.b0;
import com.github.rudroid.issueorpullrequest.triagesheet.b;
import com.github.service.license.LicenseTemplate;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.PullRequestState;
import com.github.service.models.response.RepoFileType;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.issueorpullrequest.IssueTypeColor;
import com.github.service.models.response.projects.ProjectFieldType;
import com.github.service.models.response.type.DiffLineType;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.PatchStatus;
import com.github.service.models.response.type.PullRequestReviewDecision;
import com.github.service.models.response.type.ReviewDecision;
import com.github.service.models.response.type.StatusState;
import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.List;
import yz0.d3;
import yz0.m5;
import yz0.n5;
import yz0.t7;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y1 {
    public static final em.a a;
    public static final t7 b;
    public static final w61.p c;
    public static final a d;

    public static final class a implements com.github.rudroid.settings.codeoptions.f {
        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean a() {
            return false;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean b() {
            return false;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean c() {
            return true;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean d() {
            return true;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final int e() {
            return 0;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean f() {
            return false;
        }
    }

    public static final class b implements com.github.rudroid.settings.codeoptions.f {
        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean a() {
            return false;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean b() {
            return false;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean c() {
            return false;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean d() {
            return true;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final int e() {
            return 0;
        }

        @Override // com.github.rudroid.settings.codeoptions.f
        public final boolean f() {
            return false;
        }
    }

    static {
        Avatar.Type type = Avatar.Type.User;
        com.github.service.models.response.a aVar = new com.github.service.models.response.a("loginString", new Avatar("avatarUrl", type), (String) null, false, (String) null, 60);
        IssueType issueType = new IssueType("id", "Task", "description", true, IssueTypeColor.BLUE);
        IssueOrPullRequestState issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
        yz0.s.Companion.getClass();
        yz0.q qVar = yz0.r.b;
        PullRequestReviewDecision pullRequestReviewDecision = PullRequestReviewDecision.APPROVED;
        k71.k.g(issueOrPullRequestState, "state");
        k71.k.g(qVar, "comment");
        k71.k.g(pullRequestReviewDecision, "reviewDecision");
        new he.i("url", "monalisa", Avatar.Type.Organization, "github", 4733, "A longer title that could be nice", new he.l(he.m.b(issueOrPullRequestState), he.m.c(issueOrPullRequestState, (CloseReason) null), le.j.b(issueOrPullRequestState, false, false), d2.t.e, d2.t.g, d2.t.i), issueType, new h01.p(71, 24), (h01.j) null, false, false, 6, 12, false, false, (String) null, (String) null, (z01.p) null, 1835520);
        x61.rShadow rVar = x61.rShadow.r;
        com.github.rudroid.common.b0 b0Var = new com.github.rudroid.common.b0(0, rVar);
        IssueState issueState = IssueState.OPEN;
        new h01.n("id", "title", 0, (IssueType) null, (CloseReason) null, b0Var, 0, issueState, "repoOwner", "repoName", (h01.p) null, (String) null);
        em.a aVar2 = new em.a(3, "bug", "ff0000", "ff3300");
        a = aVar2;
        new h01.j("id", "title", "titleHTML", 1, (CloseReason) null, issueState, "repoOwner", "repoName");
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        d3 d3Var = new d3("test", "test");
        List n = sy.d0Shadow.n(aVar2);
        lg.bShadow bVar = lg.bShadow.r;
        oe.a aVar3 = new oe.a("Add a new feature", "Add a new <code>feature</code>", 3, true, now, d3Var, false, "123", (String) null, n, bVar, 34, issueState, new com.github.rudroid.common.b0(0, rVar), 3, (CloseReason) null, (IssueType) null, (h01.p) null, (String) null, (z01.p) null, "search:123", 7274496);
        String str = (8388604 & 1) != 0 ? aVar3.r : "Add a new feature with an extremely long title that should overflow to test behavior and avoid breaking the layout in any way.";
        k71.k.g(str, "title");
        ZonedDateTime zonedDateTime = aVar3.v;
        k71.k.g(zonedDateTime, "lastUpdatedAt");
        d3 d3Var2 = aVar3.w;
        k71.k.g(d3Var2, "owner");
        String str2 = aVar3.y;
        k71.k.g(str2, "id");
        lg.bShadow bVar2 = aVar3.B;
        k71.k.g(bVar2, "itemCountColor");
        IssueState issueState2 = aVar3.D;
        k71.k.g(issueState2, "state");
        com.github.rudroid.common.b0 b0Var2 = aVar3.E;
        k71.k.g(b0Var2, "assignees");
        String str3 = aVar3.L;
        k71.k.g(str3, "stableId");
        new oe.a(str, "Add a new <code>feature</code> with an extremely long title that should overflow to test behavior and avoid breaking the layout in any way.", aVar3.t, aVar3.u, zonedDateTime, d3Var2, aVar3.x, str2, aVar3.z, aVar3.A, bVar2, aVar3.C, issueState2, b0Var2, aVar3.F, aVar3.G, aVar3.H, aVar3.I, aVar3.J, aVar3.K, str3, aVar3.M, aVar3.N);
        new oe.c("Add a new feature", "Add a new <code>feature</code>", 5, true, ZonedDateTime.now(), new d3("test", "test"), "123", (String) null, sy.d0Shadow.n(aVar2), bVar, 34, (StatusState) null, PullRequestState.OPEN, false, new com.github.rudroid.common.b0(0, rVar), ReviewDecision.APPROVED, 2, (Integer) null, false, (he.q) null, "search:456");
        new oe.m("123", "Add a new feature", "Add a new <code>feature</code>", 34, (CloseReason) null, issueState, "test", "test", false, "search:123", 4, 4);
        l01.p0 p0Var = new l01.p0(new l01.e0("", "", new Avatar("", ""), false));
        ZonedDateTime now2 = ZonedDateTime.now();
        k71.k.f(now2, "now(...)");
        l01.t0 t0Var = new l01.t0("projectId", "Project Title", now2, "Project Description", false, x61.s.r, true, 1, "url/url", true);
        b.f fVar = new b.f(new l01.s(p0Var, t0Var), sy.d0Shadow.n(new b.f.a.i("", "Field", ProjectFieldType.TEXT, new l01.o("id", "Value", "Title"), rVar, "viewId", true)));
        ZonedDateTime now3 = ZonedDateTime.now();
        k71.k.f(now3, "now(...)");
        com.github.rudroid.draft.ui.j jVar = new com.github.rudroid.draft.ui.j(new c01.b("draftIssueId", p0Var, t0Var, aVar, "Draft Issue Title", "Draft Issue Body", now3), fVar);
        com.github.rudroid.utilities.ui.g1.Companion.getClass();
        new com.github.rudroid.draft.ui.o(new com.github.rudroid.utilities.ui.t1(jVar), com.github.rudroid.draft.ui.i.r);
        Avatar avatar = new Avatar("url", type);
        n5.Companion.getClass();
        b = new t7("name", "id", "owner", avatar, m5.b, "url");
        new com.github.rudroid.agents.n2(1, "copilot", "GitHub Copilot", true, true);
        new com.github.rudroid.agents.n2(2, "claude", "Claude", false, false);
        new k4(2131231272, "agent1", "My Custom Agent 1", "This is a custom agent description", (String) null, (String) null, false);
        ZonedDateTime now4 = ZonedDateTime.now();
        tz0.d dVar = tz0.d.F;
        new tz0.c("1", "Build succeeded", 120, now4, true, "CI / Build", dVar, "https://github.com", (String) null, (String) null, "check_run_123");
        ZonedDateTime now5 = ZonedDateTime.now();
        tz0.d dVar2 = tz0.d.w;
        new tz0.c("2", "Tests failed", 45, now5, true, "CI / Tests", dVar2, "https://github.com", (String) null, (String) null, "check_run_456");
        tz0.d dVar3 = tz0.d.z;
        new tz0.c("3", "Waiting for approval", (Integer) null, (ZonedDateTime) null, false, "Deploy Preview", dVar3, "https://github.com", (String) null, (String) null, (String) null);
        new tz0.c("4", "External status check", 30, (ZonedDateTime) null, false, "External Check", dVar, (String) null, (String) null, (String) null, (String) null);
        new tz0.f(tz0.g.s, sy.d0Shadow.n(new tz0.a(dVar, 5)));
        new tz0.f(tz0.g.t, x61.l.r(new tz0.a[]{new tz0.a(dVar, 3), new tz0.a(dVar3, 2)}));
        new tz0.f(tz0.g.w, x61.l.r(new tz0.a[]{new tz0.a(dVar, 3), new tz0.a(dVar2, 2)}));
        new tz0.f(tz0.g.r, sy.d0Shadow.n(new tz0.a(dVar2, 5)));
        new tz0.f(tz0.g.v, x61.l.r(new tz0.a[]{new tz0.a(dVar, 2), new tz0.a(dVar3, 2), new tz0.a(dVar2, 1)}));
        new ud.a(5, 0, 0, 0);
        new ud.a(3, 0, 2, 0);
        new ud.a(3, 0, 0, 2);
        new ud.a(0, 0, 0, 5);
        new ud.a(2, 0, 2, 1);
        c = sy.w.t(new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(18));
        w4 w4Var = w4.r;
        t4 t4Var = t4.s;
        Instant parse = Instant.parse("2026-03-01T12:00:03Z");
        k71.k.f(parse, "parse(...)");
        b0.k kVar = new b0.k("tool-1", "bash", "Install dependencies", 2131231470, w4Var, t4Var, "All tests passed", parse, "./run.bat run me", (String) null);
        w4 w4Var2 = w4.s;
        Instant parse2 = Instant.parse("2026-03-01T12:00:04Z");
        k71.k.f(parse2, "parse(...)");
        b0.k kVar2 = new b0.k("tool-2", "edit", "Edit LoginService.kt", 2131231265, w4Var2, t4Var, "File updated", parse2, (String) null, "src/main/java/com/github/rudroid/login/LoginService.kt");
        Instant parse3 = Instant.parse("2026-03-01T12:00:05Z");
        k71.k.f(parse3, "parse(...)");
        sy.d0Shadow.o(kVar, kVar2, new b0.k("tool-3", "view", "View Config.kt", 2131231261, w4Var, t4Var, (String) null, parse3, (String) null, "src/main/java/com/github/rudroid/Config.kt"));
        sy.w.t(new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(19));
        sy.w.t(new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(20));
        sy.w.t(new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(21));
        sy.w.t(new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(22));
        sy.w.t(new com.github.rudroid.searchandfilter.complexfilter.user.assignee.l(23));
        d = new a();
        new a.g("1234", "DiffColors.kt", "app/src/main/java/com/github/rudroid/fileschanged/ui/DiffColors.kt", (String) null, false, false, (Integer) null, (Boolean) null, 12, 3, (PatchStatus) null, (RepoFileType) null, (String) null, false, (String) null, (String) null, false, false, false, 228600);
        DiffLineType diffLineType = DiffLineType.CONTEXT;
        com.github.rudroid.fileschanged.ui.b0 bVar3 = new b0.b(new com.github.rudroid.fileschanged.ui.m(1, diffLineType, " import androidx.compose.ui.graphics.Color"));
        com.github.rudroid.fileschanged.ui.b0 bVar4 = new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType, " import com.github.rudroid.uitoolkit.theme.GitHubTheme"));
        DiffLineType diffLineType2 = DiffLineType.DELETION;
        com.github.rudroid.fileschanged.ui.b0 bVar5 = new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType2, "-import com.github.service.models.OldType"));
        DiffLineType diffLineType3 = DiffLineType.ADDITION;
        com.github.rudroid.fileschanged.ui.b0 bVar6 = new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType3, "+import com.github.service.models.response.type.DiffLineType"));
        com.github.rudroid.fileschanged.ui.b0 bVar7 = new b0.b(new com.github.rudroid.fileschanged.ui.m(4, diffLineType3, "+import com.github.service.models.response.type.PatchStatus"));
        com.github.rudroid.fileschanged.ui.b0 bVar8 = new b0.b(new com.github.rudroid.fileschanged.ui.m(5, diffLineType, " "));
        com.github.rudroid.fileschanged.ui.m0 m0Var = com.github.rudroid.fileschanged.ui.m0.t;
        x61.l.r(new com.github.rudroid.fileschanged.ui.b0[]{bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, new b0.a(m0Var, "@@ -15,7 +15,9 @@ object DiffColors {"), new b0.b(new com.github.rudroid.fileschanged.ui.m(15, diffLineType, "     @Composable")), new b0.b(new com.github.rudroid.fileschanged.ui.m(16, diffLineType2, "-    fun lineBackground(type: DiffLineType): Color {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(16, diffLineType3, "+    fun lineBackground(type: DiffLineType): Color = when (type) {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(17, diffLineType3, "+        DiffLineType.ADDITION -> green")), new b0.b(new com.github.rudroid.fileschanged.ui.m(18, diffLineType3, "+        DiffLineType.DELETION -> red")), new b0.b(new com.github.rudroid.fileschanged.ui.m(19, diffLineType, "     }"))});
        a.g gVar = new a.g("1", "DiffColors.kt", "app/src/main/java/com/github/rudroid/fileschanged/ui/DiffColors.kt", (String) null, false, false, (Integer) null, (Boolean) null, 45, 0, PatchStatus.ADDED, (RepoFileType) null, (String) null, false, (String) null, (String) null, false, false, false, 226552);
        com.github.rudroid.fileschanged.ui.b0 bVar9 = new b0.b(new com.github.rudroid.fileschanged.ui.m(1, diffLineType3, "+package com.github.rudroid.fileschanged.ui"));
        com.github.rudroid.fileschanged.ui.b0 bVar10 = new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType3, "+"));
        com.github.rudroid.fileschanged.ui.b0 bVar11 = new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType3, "+import androidx.compose.ui.graphics.Color"));
        com.github.rudroid.fileschanged.ui.b0 bVar12 = new b0.b(new com.github.rudroid.fileschanged.ui.m(4, diffLineType3, "+"));
        com.github.rudroid.fileschanged.ui.b0 bVar13 = new b0.b(new com.github.rudroid.fileschanged.ui.m(5, diffLineType3, "+object DiffColors {"));
        com.github.rudroid.fileschanged.ui.m0 m0Var2 = com.github.rudroid.fileschanged.ui.m0.s;
        x61.l.r(new com.github.rudroid.fileschanged.ui.a0[]{new com.github.rudroid.fileschanged.ui.a0(gVar, x61.l.r(new com.github.rudroid.fileschanged.ui.b0[]{bVar9, bVar10, bVar11, bVar12, bVar13, new b0.a(m0Var2, "@@ -0,0 +6,40 @@")})), new com.github.rudroid.fileschanged.ui.a0(new a.g("1", "FileDiffBlock.kt", "app/src/main/java/com/github/rudroid/fileschanged/ui/FileDiffBlock.kt", (String) null, false, false, (Integer) null, (Boolean) null, 8, 3, PatchStatus.MODIFIED, (RepoFileType) null, (String) null, false, (String) null, (String) null, false, false, false, 226552), x61.l.r(new com.github.rudroid.fileschanged.ui.b0[]{new b0.b(new com.github.rudroid.fileschanged.ui.m(1, diffLineType, " import androidx.compose.runtime.Composable")), new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType2, "-import androidx.compose.ui.Modifier")), new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType3, "+import androidx.compose.ui.Modifier  // updated")), new b0.a(m0Var, "@@ -20,6 +20,11 @@ internal fun FileDiffBlock("), new b0.b(new com.github.rudroid.fileschanged.ui.m(20, diffLineType, "     items.forEach { item ->")), new b0.b(new com.github.rudroid.fileschanged.ui.m(21, diffLineType2, "-        when (item) {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(22, diffLineType2, "-            is FileDiffItem.Line -> {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(21, diffLineType3, "+        when (item) { // refactored")), new b0.b(new com.github.rudroid.fileschanged.ui.m(22, diffLineType3, "+            is FileDiffItem.Line -> DiffLineRow(")), new b0.b(new com.github.rudroid.fileschanged.ui.m(23, diffLineType3, "+                content = item.diffLine.content,")), new b0.b(new com.github.rudroid.fileschanged.ui.m(24, diffLineType3, "+                type = item.diffLine.type,")), new b0.b(new com.github.rudroid.fileschanged.ui.m(25, diffLineType3, "+            )")), new b0.b(new com.github.rudroid.fileschanged.ui.m(26, diffLineType, "         }"))})), new com.github.rudroid.fileschanged.ui.a0(new a.g("1", "OldHelper.kt", "app/src/main/java/com/github/rudroid/utilities/OldHelper.kt", (String) null, false, false, (Integer) null, (Boolean) null, 0, 15, PatchStatus.DELETED, (RepoFileType) null, (String) null, false, (String) null, (String) null, false, false, false, 226552), x61.l.r(new b0.b[]{new b0.b(new com.github.rudroid.fileschanged.ui.m(1, diffLineType2, "-package com.github.rudroid.utilities")), new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType2, "-")), new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType2, "-object OldHelper {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(4, diffLineType2, "-    fun deprecated() = Unit")), new b0.b(new com.github.rudroid.fileschanged.ui.m(5, diffLineType2, "-}"))}))});
        x61.l.r(new com.github.rudroid.agents.sessionevents.ui.x[]{new com.github.rudroid.agents.sessionevents.ui.x("src/auth/LoginService.kt", 42, 15, x61.l.r(new com.github.rudroid.fileschanged.ui.b0[]{new b0.b(new com.github.rudroid.fileschanged.ui.m(1, diffLineType, " package com.github.auth")), new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType, " ")), new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType2, "-import com.github.auth.legacy.OldClient")), new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType3, "+import com.github.auth.client.AuthClient")), new b0.b(new com.github.rudroid.fileschanged.ui.m(4, diffLineType3, "+import com.github.auth.client.TokenStore")), new b0.b(new com.github.rudroid.fileschanged.ui.m(5, diffLineType, " ")), new b0.a(m0Var, "@@ -20,6 +21,10 @@ class LoginService {"), new b0.b(new com.github.rudroid.fileschanged.ui.m(20, diffLineType, "     fun login(username: String, password: String) {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(21, diffLineType2, "-        val client = OldClient()")), new b0.b(new com.github.rudroid.fileschanged.ui.m(21, diffLineType3, "+        val client = AuthClient.create()")), new b0.b(new com.github.rudroid.fileschanged.ui.m(22, diffLineType3, "+        val token = client.authenticate(username, password)")), new b0.b(new com.github.rudroid.fileschanged.ui.m(23, diffLineType3, "+        tokenStore.save(token)")), new b0.b(new com.github.rudroid.fileschanged.ui.m(24, diffLineType, "     }"))})), new com.github.rudroid.agents.sessionevents.ui.x("src/auth/one/two/three/four/TokenRefreshHandler.kt", 800, 3, x61.l.r(new com.github.rudroid.fileschanged.ui.b0[]{new b0.b(new com.github.rudroid.fileschanged.ui.m(1, diffLineType3, "+package com.github.auth.refresh")), new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType3, "+")), new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType3, "+class TokenRefreshHandler {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(4, diffLineType3, "+    suspend fun refresh(token: Token): Token {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(5, diffLineType3, "+        return authClient.refreshToken(token)")), new b0.b(new com.github.rudroid.fileschanged.ui.m(6, diffLineType3, "+    }")), new b0.a(m0Var2, "@@ -0,0 +7,40 @@")})), new com.github.rudroid.agents.sessionevents.ui.x("src/test/auth/LoginServiceTest.kt", 12000, 14001, x61.l.r(new b0.b[]{new b0.b(new com.github.rudroid.fileschanged.ui.m(1, diffLineType, " class LoginServiceTest {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType2, "-    @Test fun testOldLogin() {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType2, "-        val service = LoginService(OldClient())")), new b0.b(new com.github.rudroid.fileschanged.ui.m(2, diffLineType3, "+    @Test fun testLogin() {")), new b0.b(new com.github.rudroid.fileschanged.ui.m(3, diffLineType3, "+        val service = LoginService(AuthClient.create())")), new b0.b(new com.github.rudroid.fileschanged.ui.m(4, diffLineType, "     }"))}))});
        new com.github.rudroid.repositorycreation.gitignore.r(new com.github.rudroid.utilities.ui.t1(x61.l.r(new com.github.rudroid.repositorycreation.gitignore.b[]{new com.github.rudroid.repositorycreation.gitignore.b("Android", false), new com.github.rudroid.repositorycreation.gitignore.b("Kotlin", true), new com.github.rudroid.repositorycreation.gitignore.b("Java", false)})), "", "Kotlin");
        new com.github.rudroid.repositorycreation.licensetemplate.q(new com.github.rudroid.utilities.ui.t1(x61.l.r(new com.github.rudroid.repositorycreation.licensetemplate.b[]{new com.github.rudroid.repositorycreation.licensetemplate.b(new LicenseTemplate(24, "mit", "MIT License", "MIT"), false), new com.github.rudroid.repositorycreation.licensetemplate.b(new LicenseTemplate(24, "gpl-3.0", "GNU General Public License v3.0", "GPL-3.0"), true), new com.github.rudroid.repositorycreation.licensetemplate.b(new LicenseTemplate(24, "apache-2.0", "Apache License 2.0", "Apache-2.0"), false)})), "", new LicenseTemplate(24, "gpl-3.0", "GNU General Public License v3.0", "GPL-3.0"));
        Avatar.Companion.getClass();
        Avatar avatar2 = Avatar.u;
        new com.github.rudroid.repositorycreation.templaterepository.s(new com.github.rudroid.utilities.ui.t1(x61.l.r(new com.github.rudroid.repositorycreation.templaterepository.b[]{new com.github.rudroid.repositorycreation.templaterepository.b(new SimpleRepository(avatar2, "android-template", "1", "octocat", ""), false), new com.github.rudroid.repositorycreation.templaterepository.b(new SimpleRepository(avatar2, "my-template", "2", "octocat", ""), true), new com.github.rudroid.repositorycreation.templaterepository.b(new SimpleRepository(avatar2, "starter-project", "3", "github", ""), false)})), "", new SimpleRepository(avatar2, "my-template", "2", "octocat", ""));
        new e.d("octocat", "Hello-World", 42, "Fix login authentication bug", issueOrPullRequestState, (String) null);
        new e.e("octocat", "Hello-World", 123, "Add dark mode support", IssueOrPullRequestState.PULL_REQUEST_OPEN, (String) null);
        new e.g("octocat", "Hello-World", "main", (String) null);
    }

    public static final s91.e a() {
        return (s91.e) c.getValue();
    }
}
