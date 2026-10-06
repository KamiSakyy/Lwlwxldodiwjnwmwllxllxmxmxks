package on;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.Avatar;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public String a;
    public int b;
    public int c;
    public Avatar d;
    public String e;
    public j f;

    public k(String str, int i, int i2, Avatar avatar, String str2, j jVar) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = avatar;
        this.e = str2;
        this.f = jVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.a, kVar.a) && this.b == kVar.b && this.c == kVar.c && k71.k.b(this.d, kVar.d) && k71.k.b(this.e, kVar.e) && k71.k.b(this.f, kVar.f);
    }

    public final int hashCode() {
        int j = h1.j(this.d, s0.b(this.c, s0.b(this.b, this.a.hashCode() * 31, 31), 31), 31);
        String str = this.e;
        int hashCode = (j + (str == null ? 0 : str.hashCode())) * 31;
        j jVar = this.f;
        return hashCode + (jVar != null ? jVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder n = s0.n(this.b, "RepositorySessionCreationMetaData(repositoryId=", this.a, ", subagentCount=", ", thirdPartyAgentCount=");
        n.append(this.c);
        n.append(", avatar=");
        n.append(this.d);
        n.append(", defaultBranchName=");
        n.append(this.e);
        n.append(", defaultCodingAgent=");
        n.append(this.f);
        n.append(")");
        return n.toString();
    }
}
