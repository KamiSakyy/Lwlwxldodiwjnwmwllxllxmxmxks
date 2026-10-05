package com.github.rudroid.templates;

import com.github.rudroid.templates.IssueTemplatesActivity;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class d implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ IssueTemplatesActivity s;

    public /* synthetic */ d(IssueTemplatesActivity issueTemplatesActivity, int i) {
        this.r = i;
        this.s = issueTemplatesActivity;
    }

    public final Object a() {
        int i = this.r;
        a0 a0Var = a0.a;
        IssueTemplatesActivity issueTemplatesActivity = this.s;
        switch (i) {
            case 0:
                IssueTemplatesActivity.a aVar = IssueTemplatesActivity.Companion;
                issueTemplatesActivity.Q0().P();
                break;
            default:
                IssueTemplatesActivity.a aVar2 = IssueTemplatesActivity.Companion;
                issueTemplatesActivity.Q0().P();
                issueTemplatesActivity.y0().a(issueTemplatesActivity.w0().d(), new wj.e(MobileAppElement.VIEWER_PULL_TO_REFRESH, MobileAppAction.SWIPE, null, null, 12));
                break;
        }
        return a0Var;
    }
}
