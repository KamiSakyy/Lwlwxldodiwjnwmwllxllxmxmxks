package com.github.rudroid.feed;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import java.time.ZonedDateTime;
import java.util.List;
import yz0.r3;
import yz0.t3;

/* loaded from: /home/user/work/p/classes.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    public static final List f12570a;

    public static final class a implements com.github.rudroid.feed.ui.g0 {
        @Override // com.github.rudroid.feed.ui.g0
        public final void E2() {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void N2(String str, String str2) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void Q1(String str, String str2) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void R0(String str, String str2) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void U2(String str, String str2) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void Z(String str, int i, String str2) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void c2(String str, boolean z10) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void j2() {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void k2(String str, int i, String str2) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void s2() {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void t0(String str) {
            k71.k.g(str, "login");
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void u0(String str, String str2, String str3) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void v(String str, zc.b bVar) {
        }

        @Override // com.github.rudroid.feed.ui.g0
        public final void v0(String str, String str2, String str3) {
        }
    }

    static {
        List r10 = x61.l.r(new r3[]{new r3(t3.j, "ThumbsUp", 0, false), new r3(t3.i, "ThumbsDown", 3, false), new r3(t3.g, "Laugh", 1, false), new r3(t3.f, "Hooray", 0, false), new r3(t3.c, "Confused", 0, false), new r3(t3.e, "Heart", 0, false), new r3(t3.h, "Rocket", 0, false), new r3(t3.d, "Eyes", 1, true)});
        Avatar.Type type = Avatar.Type.Organization;
        t10.l lVar = new t10.l("id", "strapboot", "https://github.com/twbs/strap_boot", "strap_boot", "Strapboot", new Avatar("https://github.com/twbs.png", type), "https://github.com/twbs", true, "https://github.com/twbs.png", true);
        x61.rShadow rVar = x61.rShadow.r;
        t10.k kVar = new t10.k("id", 0, "JavaScript", "yellow", "The most popular HTML, CSS, and JavaScript framework for developing responsive, mobile first projects on the web.", true, 2000, true, lVar, rVar);
        Avatar.Type type2 = Avatar.Type.User;
        t10.s sVar = new t10.s("id", "Steven Popovich", "stevepopovich", "https://github.com/stevepopovich", "A full stack developer, who is really fun!", 99, 17450, new Avatar("https://github.com/stevepopovich.png", type2), false, false, false);
        t10.r rVar2 = new t10.r("id", "HubGit", "hubgit", "https://github.com/hubgit", "The home for all developers!", new Avatar("https://github.com/github.png", type), true);
        t10.j jVar = new t10.j("id_release", "https://github.com/twbs/bootstrap/releases/tag/v50.3.1", "Release 50.3.1!", "This is a new release!", "Thanks for all the support!", "v50.3.1", x61.l.r(new String[]{"stevepopovich", "eliperkins", "mxie"}), 10, r10, true, (String) null, (String) null, lVar);
        t10.i iVar = new t10.i("id", "Add runtime crash!", "Let's add a crash so the app crashes!", "Let's add a crash so the app crashes!", 4798, new yz0.c2("base", "head"), IssueOrPullRequestState.PULL_REQUEST_MERGED, r10, true, lVar);
        t10.e eVar = new t10.e("id", "url", "Should the app crash every 5 minutes?", "Should we fix the app so it doesn't automatically crash every 5 minutes?", "Should we fix the app so it doesn't automatically crash every 5 minutes?", 367, r10, true, lVar);
        com.github.service.models.response.a aVar = new com.github.service.models.response.a("stevepopovich", new Avatar("https://github.com/stevepopovich.png", type2), (String) null, false, (String) null, 60);
        ZonedDateTime now = ZonedDateTime.now();
        k71.k.f(now, "now(...)");
        t10.b bVar = new t10.b(now, false, "1", aVar, eVar, (String) null, rVar);
        ZonedDateTime minusMinutes = now.minusMinutes(30L);
        k71.k.f(minusMinutes, "minusMinutes(...)");
        t10.c cVar = new t10.c(minusMinutes, false, "2", aVar, kVar, rVar);
        ZonedDateTime minusHours = now.minusHours(2L);
        k71.k.f(minusHours, "minusHours(...)");
        t10.n nVar = new t10.n(minusHours, false, "3", sVar, rVar);
        ZonedDateTime minusHours2 = now.minusHours(2L);
        k71.k.f(minusHours2, "minusHours(...)");
        t10.m mVar = new t10.m(minusHours2, false, "3", rVar2, rVar);
        ZonedDateTime minusDays = now.minusDays(1L);
        k71.k.f(minusDays, "minusDays(...)");
        t10.w wVar = new t10.w(minusDays, false, "4", aVar, sVar, rVar);
        ZonedDateTime minusDays2 = now.minusDays(1L);
        k71.k.f(minusDays2, "minusDays(...)");
        t10.v vVar = new t10.v(minusDays2, false, "5", aVar, rVar2, rVar);
        ZonedDateTime minusDays3 = now.minusDays(2L);
        k71.k.f(minusDays3, "minusDays(...)");
        t10.o oVar = new t10.o(minusDays3, false, "6", aVar, kVar, rVar);
        ZonedDateTime minusDays4 = now.minusDays(3L);
        k71.k.f(minusDays4, "minusDays(...)");
        t10.p pVar = new t10.p(minusDays4, false, "7", aVar, iVar, rVar);
        ZonedDateTime minusDays5 = now.minusDays(4L);
        k71.k.f(minusDays5, "minusDays(...)");
        t10.q qVar = new t10.q(minusDays5, false, "8", aVar, jVar, rVar);
        ZonedDateTime minusWeeks = now.minusWeeks(1L);
        k71.k.f(minusWeeks, "minusWeeks(...)");
        t10.t tVar = new t10.t(minusWeeks, false, "9", kVar, rVar);
        ZonedDateTime minusMonths = now.minusMonths(1L);
        k71.k.f(minusMonths, "minusMonths(...)");
        ZonedDateTime minusMonths2 = now.minusMonths(1L);
        k71.k.f(minusMonths2, "minusMonths(...)");
        t10.u uVar = new t10.u(minusMonths2, false, "10", aVar, kVar, rVar);
        ZonedDateTime minusMonths3 = now.minusMonths(1L);
        k71.k.f(minusMonths3, "minusMonths(...)");
        f12570a = x61.l.r(new r1[]{new r1(tVar), new r1(nVar), new r1(mVar), new r1(bVar), new r1(cVar), new r1(qVar), new r1(oVar), new r1(pVar), new r1(new t10.u(minusMonths, false, "10", aVar, kVar, x61.l.r(new t10.u[]{uVar, new t10.u(minusMonths3, false, "10", aVar, kVar, rVar)}))), new r1(vVar), new r1(wVar)});
    }
}
