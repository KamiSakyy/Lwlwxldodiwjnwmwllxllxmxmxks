package com.github.rudroid.searchandfilter.ui;

import androidx.fragment.app.a1;
import com.github.domain.searchandfilter.filters.data.IssueTypeFilter;
import com.github.rudroid.repository.issuetypes.RepositoryIssueTypesBottomSheet;
import com.github.service.models.response.issueorpullrequest.IssueType;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class w implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ IssueTypeFilter s;
    public final /* synthetic */ String t;
    public final /* synthetic */ String u;
    public final /* synthetic */ a1 v;

    public /* synthetic */ w(IssueTypeFilter issueTypeFilter, String str, String str2, a1 a1Var, int i) {
        this.r = i;
        this.s = issueTypeFilter;
        this.t = str;
        this.u = str2;
        this.v = a1Var;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                RepositoryIssueTypesBottomSheet.a aVar = RepositoryIssueTypesBottomSheet.Companion;
                IssueType issueType = this.s.v;
                com.github.rudroid.fragments.g0.Companion.getClass();
                RepositoryIssueTypesBottomSheet.a.a(aVar, this.t, this.u, new com.github.rudroid.repository.issuetypes.d(com.github.rudroid.fragments.g0.c(com.github.rudroid.fragments.g0.u), true), issueType, (String) null, 16).z4(this.v, (String) null);
                break;
            default:
                RepositoryIssueTypesBottomSheet.a.a(RepositoryIssueTypesBottomSheet.Companion, this.t, this.u, (com.github.rudroid.repository.issuetypes.d) null, this.s.v, (String) null, 20).z4(this.v, (String) null);
                break;
        }
        return w61.a0.a;
    }
}
