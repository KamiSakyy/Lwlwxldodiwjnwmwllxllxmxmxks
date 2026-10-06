package t10;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.IssueOrPullRequestState;
import java.util.List;
import yz0.c2;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public c2 f;
    public IssueOrPullRequestState g;
    public List h;
    public boolean i;
    public l j;

    public i(String str, String str2, String str3, String str4, int i, c2 c2Var, IssueOrPullRequestState issueOrPullRequestState, List list, boolean z, l lVar) {
        k71.k.g(issueOrPullRequestState, "state");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = c2Var;
        this.g = issueOrPullRequestState;
        this.h = list;
        this.i = z;
        this.j = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return k71.k.b(this.a, iVar.a) && k71.k.b(this.b, iVar.b) && k71.k.b(this.c, iVar.c) && k71.k.b(this.d, iVar.d) && this.e == iVar.e && k71.k.b(this.f, iVar.f) && this.g == iVar.g && k71.k.b(this.h, iVar.h) && this.i == iVar.i && k71.k.b(this.j, iVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + x.i.e(f1.e.c(this.h, (this.g.hashCode() + ((this.f.hashCode() + s0.b(this.e, h1.i(h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31), this.d, 31), 31)) * 31)) * 31, 31), 31, this.i);
    }

    public final String toString() {
        StringBuilder o = s0.o("FeedPullRequest(id=", this.a, ", title=", this.b, ", bodyHTML=");
        f1.e.x(o, this.c, ", shortBodyText=", this.d, ", number=");
        o.append(this.e);
        o.append(", refNames=");
        o.append(this.f);
        o.append(", state=");
        o.append(this.g);
        o.append(", reactions=");
        o.append(this.h);
        o.append(", viewerCanReact=");
        o.append(this.i);
        o.append(", repositoryHeader=");
        o.append(this.j);
        o.append(")");
        return o.toString();
    }
}
