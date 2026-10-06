package yz0;

import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.issueorpullrequest.CloseReason;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p5 extends k.w implements r5 {
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public IssueOrPullRequestState h;
    public boolean i;
    public boolean j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(String str, String str2, String str3, String str4, int i, IssueOrPullRequestState issueOrPullRequestState, boolean z, boolean z2, boolean z3, String str5) {
        super(str5, String.valueOf(i));
        k71.k.g(issueOrPullRequestState, "state");
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = i;
        this.h = issueOrPullRequestState;
        this.i = z;
        this.j = z2;
        this.k = z3;
    }

    @Override // yz0.r5
    public final int b() {
        return this.g;
    }

    @Override // yz0.r5
    public final CloseReason c() {
        return null;
    }

    @Override // yz0.r5
    public final boolean d() {
        return this.i;
    }

    @Override // yz0.r5
    public final String e() {
        return this.e;
    }

    @Override // yz0.r5
    public final boolean f() {
        return this.k;
    }

    @Override // yz0.r5
    public final String g() {
        return this.c;
    }

    @Override // yz0.r5
    public final IssueOrPullRequestState getState() {
        return this.h;
    }

    @Override // yz0.r5
    public final String getTitle() {
        return this.d;
    }

    @Override // yz0.r5
    public final boolean i() {
        return this.j;
    }

    @Override // yz0.r5
    public final String k() {
        return this.f;
    }
}
