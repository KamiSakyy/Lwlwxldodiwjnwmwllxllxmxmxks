package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.service.models.response.issueorpullrequest.PullRequestMergeAction;
import com.github.service.models.response.issueorpullrequest.PullRequestMergeRequirementsState;
import com.github.service.models.response.type.PullRequestMergeMethod;
import com.github.service.models.response.type.PullRequestUpdateBranchMethod;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b6 {
    public List a;
    public ae.d b;
    public PullRequestMergeAction c;
    public PullRequestMergeMethod d;
    public PullRequestUpdateBranchMethod e;
    public PullRequestMergeRequirementsState f;
    public String g;
    public yz0.s2 h;
    public yz0.s2 i;
    public List j;
    public int k;
    public boolean l;
    public boolean m;
    public String n;
    public yz0.s2 o;

    public b6(List list, ae.d dVar, PullRequestMergeAction pullRequestMergeAction, PullRequestMergeMethod pullRequestMergeMethod, PullRequestUpdateBranchMethod pullRequestUpdateBranchMethod, PullRequestMergeRequirementsState pullRequestMergeRequirementsState, String str, yz0.s2 s2Var, yz0.s2 s2Var2, List list2, int i) {
        k71.k.g(list, "availableMergeMethods");
        k71.k.g(pullRequestMergeAction, "mergeAction");
        k71.k.g(pullRequestMergeMethod, "mergeMethod");
        k71.k.g(pullRequestUpdateBranchMethod, "updateBranchMethod");
        k71.k.g(pullRequestMergeRequirementsState, "pullRequestMergeRequirementsState");
        k71.k.g(list2, "possibleCommitEmails");
        this.a = list;
        this.b = dVar;
        this.c = pullRequestMergeAction;
        this.d = pullRequestMergeMethod;
        this.e = pullRequestUpdateBranchMethod;
        this.f = pullRequestMergeRequirementsState;
        this.g = str;
        this.h = s2Var;
        this.i = s2Var2;
        this.j = list2;
        this.k = i;
        PullRequestMergeMethod pullRequestMergeMethod2 = PullRequestMergeMethod.MERGE;
        boolean z = true;
        boolean z2 = pullRequestMergeMethod == pullRequestMergeMethod2 || pullRequestMergeMethod == PullRequestMergeMethod.SQUASH;
        this.l = z2;
        if (pullRequestMergeMethod != pullRequestMergeMethod2 && pullRequestMergeMethod != PullRequestMergeMethod.SQUASH) {
            z = false;
        }
        this.m = z;
        this.n = z2 ? str : null;
        if (!z) {
            s2Var = null;
        } else if (s2Var2 != null) {
            s2Var = s2Var2;
        }
        this.o = s2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v18, types: [java.util.List] */
    public static b6 a(b6 b6Var, ArrayList arrayList, PullRequestMergeAction pullRequestMergeAction, PullRequestMergeMethod pullRequestMergeMethod, PullRequestUpdateBranchMethod pullRequestUpdateBranchMethod, PullRequestMergeRequirementsState pullRequestMergeRequirementsState, String str, yz0.s2 s2Var, yz0.s2 s2Var2, ArrayList arrayList2, int i, int i2) {
        ArrayList arrayList3 = arrayList;
        if ((i2 & 1) != 0) {
            arrayList3 = b6Var.a;
        }
        ArrayList arrayList4 = arrayList3;
        ae.d dVar = b6Var.b;
        if ((i2 & 4) != 0) {
            pullRequestMergeAction = b6Var.c;
        }
        PullRequestMergeAction pullRequestMergeAction2 = pullRequestMergeAction;
        if ((i2 & 8) != 0) {
            pullRequestMergeMethod = b6Var.d;
        }
        PullRequestMergeMethod pullRequestMergeMethod2 = pullRequestMergeMethod;
        PullRequestUpdateBranchMethod pullRequestUpdateBranchMethod2 = (i2 & 16) != 0 ? b6Var.e : pullRequestUpdateBranchMethod;
        PullRequestMergeRequirementsState pullRequestMergeRequirementsState2 = (i2 & 32) != 0 ? b6Var.f : pullRequestMergeRequirementsState;
        String str2 = (i2 & 64) != 0 ? b6Var.g : str;
        yz0.s2 s2Var3 = (i2 & 128) != 0 ? b6Var.h : s2Var;
        yz0.s2 s2Var4 = (i2 & 256) != 0 ? b6Var.i : s2Var2;
        ArrayList arrayList5 = (i2 & 512) != 0 ? b6Var.j : arrayList2;
        int i3 = (i2 & 1024) != 0 ? b6Var.k : i;
        b6Var.getClass();
        k71.k.g(arrayList4, "availableMergeMethods");
        k71.k.g(dVar, "mergeQueueOption");
        k71.k.g(pullRequestMergeAction2, "mergeAction");
        k71.k.g(pullRequestMergeMethod2, "mergeMethod");
        k71.k.g(pullRequestUpdateBranchMethod2, "updateBranchMethod");
        k71.k.g(pullRequestMergeRequirementsState2, "pullRequestMergeRequirementsState");
        k71.k.g(arrayList5, "possibleCommitEmails");
        return new b6(arrayList4, dVar, pullRequestMergeAction2, pullRequestMergeMethod2, pullRequestUpdateBranchMethod2, pullRequestMergeRequirementsState2, str2, s2Var3, s2Var4, arrayList5, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b6)) {
            return false;
        }
        b6 b6Var = (b6) obj;
        return k71.k.b(this.a, b6Var.a) && this.b == b6Var.b && this.c == b6Var.c && this.d == b6Var.d && this.e == b6Var.e && this.f == b6Var.f && k71.k.b(this.g, b6Var.g) && k71.k.b(this.h, b6Var.h) && k71.k.b(this.i, b6Var.i) && k71.k.b(this.j, b6Var.j) && this.k == b6Var.k;
    }

    public final int hashCode() {
        int hashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        yz0.s2 s2Var = this.h;
        int hashCode3 = (hashCode2 + (s2Var == null ? 0 : s2Var.hashCode())) * 31;
        yz0.s2 s2Var2 = this.i;
        return Integer.hashCode(this.k) + f1.e.c(this.j, (hashCode3 + (s2Var2 != null ? s2Var2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergeOptionConfiguration(availableMergeMethods=");
        sb.append(this.a);
        sb.append(", mergeQueueOption=");
        sb.append(this.b);
        sb.append(", mergeAction=");
        sb.append(this.c);
        sb.append(", mergeMethod=");
        sb.append(this.d);
        sb.append(", updateBranchMethod=");
        sb.append(this.e);
        sb.append(", pullRequestMergeRequirementsState=");
        sb.append(this.f);
        sb.append(", commitAuthor=");
        sb.append(this.g);
        sb.append(", defaultCommitMessage=");
        sb.append(this.h);
        sb.append(", customCommitMessage=");
        sb.append(this.i);
        sb.append(", possibleCommitEmails=");
        sb.append(this.j);
        sb.append(", commitsCount=");
        return a0.s0.l(sb, this.k, ")");
    }
}
