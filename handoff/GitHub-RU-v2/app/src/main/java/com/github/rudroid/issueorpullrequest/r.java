package com.github.rudroid.issueorpullrequest;

import android.content.DialogInterface;
import com.github.rudroid.issueorpullrequest.LegacyIssueOrPullRequestActivity;
import com.github.rudroid.issueorpullrequest.fragment.IssueOrPullRequestFragment;
import com.github.rudroid.viewmodels.issuesorpullrequests.a6;
import com.github.rudroid.viewmodels.issuesorpullrequests.b6;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class r implements DialogInterface.OnClickListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15792r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f15793s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f15794t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f15795u;

    public /* synthetic */ r(Object obj, Object obj2, boolean z10, int i) {
        this.f15792r = i;
        this.f15793s = obj;
        this.f15795u = obj2;
        this.f15794t = z10;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i10 = this.f15792r;
        boolean z10 = this.f15794t;
        Object obj = this.f15795u;
        Object obj2 = this.f15793s;
        switch (i10) {
            case k5.f.J /* 0 */:
                LegacyIssueOrPullRequestActivity.a aVar = LegacyIssueOrPullRequestActivity.Companion;
                ((LegacyIssueOrPullRequestActivity) obj2).a1((b6) obj, z10);
                break;
            case 1:
                LegacyIssueOrPullRequestActivity.a aVar2 = LegacyIssueOrPullRequestActivity.Companion;
                ((LegacyIssueOrPullRequestActivity) obj2).Y0((a6) obj, z10);
                break;
            case 2:
                com.github.rudroid.issueorpullrequest.fragment.b1.e((IssueOrPullRequestFragment) obj2, (a6) obj, z10);
                break;
            default:
                com.github.rudroid.issueorpullrequest.fragment.b1.f((IssueOrPullRequestFragment) obj2, (b6) obj, z10);
                break;
        }
    }
}
