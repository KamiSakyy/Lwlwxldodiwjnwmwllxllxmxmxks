package h01;

import a0.s0;
import com.github.service.models.response.issueorpullrequest.PullRequestMergeRequirementsState;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public String a;
    public String b;
    public ArrayList c;
    public PullRequestMergeRequirementsState d;

    public i(String str, String str2, ArrayList arrayList, PullRequestMergeRequirementsState pullRequestMergeRequirementsState) {
        k71.k.g(pullRequestMergeRequirementsState, "state");
        this.a = str;
        this.b = str2;
        this.c = arrayList;
        this.d = pullRequestMergeRequirementsState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && this.c.equals(iVar.c) && this.d == iVar.d;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.d.hashCode() + no.a.b(this.c, (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder o = s0.o("MergeRequirements(commitMessageBody=", this.a, ", commitMessageHeadline=", this.b, ", possibleCommitEmails=");
        o.append(this.c);
        o.append(", state=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
