package com.github.rudroid.issueorpullrequest.fragment;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public j71.c f15484a;

    /* renamed from: b, reason: collision with root package name */
    public j71.e f15485b;

    /* renamed from: c, reason: collision with root package name */
    public j71.a f15486c;

    /* renamed from: d, reason: collision with root package name */
    public j71.a f15487d;

    /* renamed from: e, reason: collision with root package name */
    public j71.a f15488e;

    /* renamed from: f, reason: collision with root package name */
    public j71.f f15489f;

    /* renamed from: g, reason: collision with root package name */
    public j71.f f15490g;

    /* renamed from: h, reason: collision with root package name */
    public j71.c f15491h;
    public j71.a i;

    /* renamed from: j, reason: collision with root package name */
    public j71.c f15492j;

    /* renamed from: k, reason: collision with root package name */
    public j71.a f15493k;
    public j71.a l;
    public j71.a m;

    /* renamed from: n, reason: collision with root package name */
    public j71.a f15494n;

    /* renamed from: o, reason: collision with root package name */
    public j71.c f15495o;

    /* renamed from: p, reason: collision with root package name */
    public j71.e f15496p;

    public a(j71.c cVar, j71.e eVar, j71.a aVar, j71.a aVar2, j71.a aVar3, j71.f fVar, j71.f fVar2, j71.c cVar2, j71.a aVar4, j71.c cVar3, j71.a aVar5, j71.a aVar6, j71.a aVar7, j71.a aVar8, j71.c cVar4, j71.e eVar2) {
        this.f15484a = cVar;
        this.f15485b = eVar;
        this.f15486c = aVar;
        this.f15487d = aVar2;
        this.f15488e = aVar3;
        this.f15489f = fVar;
        this.f15490g = fVar2;
        this.f15491h = cVar2;
        this.i = aVar4;
        this.f15492j = cVar3;
        this.f15493k = aVar5;
        this.l = aVar6;
        this.m = aVar7;
        this.f15494n = aVar8;
        this.f15495o = cVar4;
        this.f15496p = eVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.f15484a, aVar.f15484a) && k71.k.b(this.f15485b, aVar.f15485b) && k71.k.b(this.f15486c, aVar.f15486c) && k71.k.b(this.f15487d, aVar.f15487d) && k71.k.b(this.f15488e, aVar.f15488e) && k71.k.b(this.f15489f, aVar.f15489f) && k71.k.b(this.f15490g, aVar.f15490g) && k71.k.b(this.f15491h, aVar.f15491h) && k71.k.b(this.i, aVar.i) && k71.k.b(this.f15492j, aVar.f15492j) && k71.k.b(this.f15493k, aVar.f15493k) && k71.k.b(this.l, aVar.l) && k71.k.b(this.m, aVar.m) && k71.k.b(this.f15494n, aVar.f15494n) && k71.k.b(this.f15495o, aVar.f15495o) && k71.k.b(this.f15496p, aVar.f15496p);
    }

    public final int hashCode() {
        return this.f15496p.hashCode() + ((this.f15495o.hashCode() + x.i.d(x.i.d(x.i.d(x.i.d((this.f15492j.hashCode() + x.i.d((this.f15491h.hashCode() + ((this.f15490g.hashCode() + ((this.f15489f.hashCode() + x.i.d(x.i.d(x.i.d((this.f15485b.hashCode() + (this.f15484a.hashCode() * 31)) * 31, 31, this.f15486c), 31, this.f15487d), 31, this.f15488e)) * 31)) * 31)) * 31, 31, this.i)) * 31, 31, this.f15493k), 31, this.l), 31, this.m), 31, this.f15494n)) * 31);
    }

    public final String toString() {
        return "IssueOrPullRequestActions(onCheckRunTapped=" + this.f15484a + ", onStatusCheckTapped=" + this.f15485b + ", onToggleSubIssuesSectionExpanded=" + this.f15486c + ", onCreateSubIssueClick=" + this.f15487d + ", onEditSubIssuesClick=" + this.f15488e + ", onSubIssueClick=" + this.f15489f + ", onParentIssueClick=" + this.f15490g + ", onExpandSubIssues=" + this.f15491h + ", onAddExistingIssueClick=" + this.i + ", onCopilotSessionClick=" + this.f15492j + ", onCopilotReviewerBannerDismiss=" + this.f15493k + ", onCopilotReviewerBannerCTAClick=" + this.l + ", onCopilotCABannerDismiss=" + this.m + ", onCopilotCABannerCTAClick=" + this.f15494n + ", onExternalUrlSelectedListener=" + this.f15495o + ", onReviewRequested=" + this.f15496p + ")";
    }
}
