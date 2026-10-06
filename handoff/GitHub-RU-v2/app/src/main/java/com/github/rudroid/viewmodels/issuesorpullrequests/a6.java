package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.service.models.response.type.PullRequestMergeMethod;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a6 {
    public List a;
    public PullRequestMergeMethod b;
    public String c;
    public yz0.s2 d;
    public yz0.s2 e;
    public yz0.s2 f;
    public List g;
    public int h;
    public boolean i;
    public boolean j;
    public yz0.s2 k;
    public yz0.s2 l;
    public String m;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[PullRequestMergeMethod.values().length];
            try {
                iArr[PullRequestMergeMethod.MERGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PullRequestMergeMethod.SQUASH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    public a6(List list, PullRequestMergeMethod pullRequestMergeMethod, String str, yz0.s2 s2Var, yz0.s2 s2Var2, yz0.s2 s2Var3, List list2, int i) {
        k71.k.g(list, "availableMergeTypes");
        k71.k.g(pullRequestMergeMethod, "mergeMethod");
        k71.k.g(list2, "possibleCommitEmails");
        this.a = list;
        this.b = pullRequestMergeMethod;
        this.c = str;
        this.d = s2Var;
        this.e = s2Var2;
        this.f = s2Var3;
        this.g = list2;
        this.h = i;
        PullRequestMergeMethod pullRequestMergeMethod2 = PullRequestMergeMethod.MERGE;
        boolean z = pullRequestMergeMethod == pullRequestMergeMethod2 || pullRequestMergeMethod == PullRequestMergeMethod.SQUASH;
        this.i = z;
        boolean z2 = pullRequestMergeMethod == pullRequestMergeMethod2 || pullRequestMergeMethod == PullRequestMergeMethod.SQUASH;
        this.j = z2;
        int i2 = a.a[pullRequestMergeMethod.ordinal()];
        s2Var = i2 != 1 ? i2 != 2 ? null : s2Var2 : s2Var;
        this.k = s2Var;
        if (!z2) {
            s2Var3 = null;
        } else if (s2Var3 == null) {
            s2Var3 = s2Var;
        }
        this.l = s2Var3;
        this.m = z ? str : null;
    }

    public static a6 a(List list, PullRequestMergeMethod pullRequestMergeMethod, String str, yz0.s2 s2Var, yz0.s2 s2Var2, yz0.s2 s2Var3, List list2, int i) {
        k71.k.g(list, "availableMergeTypes");
        k71.k.g(pullRequestMergeMethod, "mergeMethod");
        k71.k.g(list2, "possibleCommitEmails");
        return new a6(list, pullRequestMergeMethod, str, s2Var, s2Var2, s2Var3, list2, i);
    }

    public static /* synthetic */ a6 b(a6 a6Var, PullRequestMergeMethod pullRequestMergeMethod, String str, yz0.s2 s2Var, yz0.s2 s2Var2, yz0.s2 s2Var3, int i) {
        List list = a6Var.a;
        if ((i & 2) != 0) {
            pullRequestMergeMethod = a6Var.b;
        }
        PullRequestMergeMethod pullRequestMergeMethod2 = pullRequestMergeMethod;
        if ((i & 4) != 0) {
            str = a6Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            s2Var = a6Var.d;
        }
        yz0.s2 s2Var4 = s2Var;
        if ((i & 16) != 0) {
            s2Var2 = a6Var.e;
        }
        yz0.s2 s2Var5 = s2Var2;
        if ((i & 32) != 0) {
            s2Var3 = a6Var.f;
        }
        List list2 = a6Var.g;
        int i2 = a6Var.h;
        a6Var.getClass();
        return a(list, pullRequestMergeMethod2, str2, s2Var4, s2Var5, s2Var3, list2, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a6)) {
            return false;
        }
        a6 a6Var = (a6) obj;
        return k71.k.b(this.a, a6Var.a) && this.b == a6Var.b && k71.k.b(this.c, a6Var.c) && k71.k.b(this.d, a6Var.d) && k71.k.b(this.e, a6Var.e) && k71.k.b(this.f, a6Var.f) && k71.k.b(this.g, a6Var.g) && this.h == a6Var.h;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        yz0.s2 s2Var = this.d;
        int hashCode3 = (hashCode2 + (s2Var == null ? 0 : s2Var.hashCode())) * 31;
        yz0.s2 s2Var2 = this.e;
        int hashCode4 = (hashCode3 + (s2Var2 == null ? 0 : s2Var2.hashCode())) * 31;
        yz0.s2 s2Var3 = this.f;
        return Integer.hashCode(this.h) + f1.e.c(this.g, (hashCode4 + (s2Var3 != null ? s2Var3.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "LegacyMergeOptionConfiguration(availableMergeTypes=" + this.a + ", mergeMethod=" + this.b + ", commitEmail=" + this.c + ", defaultMergeCommitMessage=" + this.d + ", defaultSquashMessage=" + this.e + ", customCommitMessage=" + this.f + ", possibleCommitEmails=" + this.g + ", commitsCount=" + this.h + ")";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ a6(List list, PullRequestMergeMethod pullRequestMergeMethod, yz0.s2 s2Var, List list2, int i) {
        this(r1 != 0 ? r2 : list, (i & 2) != 0 ? PullRequestMergeMethod.UNKNOWN__ : pullRequestMergeMethod, (i & 4) != 0 ? null : "email@github.com", (i & 8) != 0 ? null : s2Var, null, null, (i & 64) != 0 ? r2 : list2, (i & 128) != 0 ? 0 : 4);
        int i2 = i & 1;
        List list3 = x61.r.r;
    }
}
