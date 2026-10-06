package le;

import com.github.rudroid.copilot.h1;
import com.github.service.models.response.type.PullRequestUpdateBranchMethod;

/* loaded from: /home/user/work/p/classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f28455a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28456b;

    /* renamed from: c, reason: collision with root package name */
    public final PullRequestUpdateBranchMethod f28457c;

    public b0(boolean z10, boolean z11, PullRequestUpdateBranchMethod pullRequestUpdateBranchMethod) {
        k71.k.g(pullRequestUpdateBranchMethod, "selectedUpdateBranchMethod");
        this.f28455a = z10;
        this.f28456b = z11;
        this.f28457c = pullRequestUpdateBranchMethod;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f28455a == b0Var.f28455a && this.f28456b == b0Var.f28456b && this.f28457c == b0Var.f28457c;
    }

    public final int hashCode() {
        return this.f28457c.hashCode() + x.i.e(Boolean.hashCode(this.f28455a) * 31, 31, this.f28456b);
    }

    public final String toString() {
        StringBuilder u8 = h1.u("UpdateBranchButtonConfiguration(showUpdateBranchButton=", this.f28455a, ", showUpdateBranchOptions=", this.f28456b, ", selectedUpdateBranchMethod=");
        u8.append(this.f28457c);
        u8.append(")");
        return u8.toString();
    }
}
