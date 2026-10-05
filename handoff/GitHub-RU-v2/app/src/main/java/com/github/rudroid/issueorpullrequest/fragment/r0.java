package com.github.rudroid.issueorpullrequest.fragment;

import android.content.DialogInterface;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class r0 implements DialogInterface.OnClickListener {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f15547r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IssueOrPullRequestFragment f15548s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f15549t;

    public /* synthetic */ r0(IssueOrPullRequestFragment issueOrPullRequestFragment, String str, int i) {
        this.f15547r = i;
        this.f15548s = issueOrPullRequestFragment;
        this.f15549t = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.f15547r) {
            case k5.f.J /* 0 */:
                this.f15548s.O4().W(this.f15549t);
                break;
            default:
                this.f15548s.O4().X(this.f15549t);
                break;
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class IssueOrPullRequestFragment<T1,T2,T3,T4> {
        public IssueOrPullRequestFragment() {
        }
    }
}
