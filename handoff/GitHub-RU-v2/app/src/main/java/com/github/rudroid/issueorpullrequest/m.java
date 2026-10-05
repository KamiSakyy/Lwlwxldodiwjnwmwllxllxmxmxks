package com.github.rudroid.issueorpullrequest;

import android.content.DialogInterface;
import com.github.rudroid.issueorpullrequest.LegacyIssueOrPullRequestActivity;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class m implements DialogInterface.OnClickListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15587r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ LegacyIssueOrPullRequestActivity f15588s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f15589t;

    public /* synthetic */ m(LegacyIssueOrPullRequestActivity legacyIssueOrPullRequestActivity, String str, int i) {
        this.f15587r = i;
        this.f15588s = legacyIssueOrPullRequestActivity;
        this.f15589t = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i10 = this.f15587r;
        String str = this.f15589t;
        LegacyIssueOrPullRequestActivity legacyIssueOrPullRequestActivity = this.f15588s;
        switch (i10) {
            case k5.f.J /* 0 */:
                LegacyIssueOrPullRequestActivity.a aVar = LegacyIssueOrPullRequestActivity.Companion;
                legacyIssueOrPullRequestActivity.W0().W(str);
                break;
            default:
                LegacyIssueOrPullRequestActivity.a aVar2 = LegacyIssueOrPullRequestActivity.Companion;
                legacyIssueOrPullRequestActivity.W0().X(str);
                break;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class LegacyIssueOrPullRequestActivity<T1,T2,T3,T4> {
        public LegacyIssueOrPullRequestActivity() {
        }
    }
}
