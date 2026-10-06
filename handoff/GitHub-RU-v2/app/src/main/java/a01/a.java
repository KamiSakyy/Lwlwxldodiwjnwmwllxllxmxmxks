package a01;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final String b;
    public final CheckStatusState c;
    public final CheckConclusionState d;
    public final String e;
    public final int f;
    public final Object g;
    public final String h;

    public a(String str, String str2, CheckStatusState checkStatusState, CheckConclusionState checkConclusionState, String str3, int i, List list, String str4) {
        k.g(str, "id");
        k.g(str2, "name");
        k.g(checkStatusState, "status");
        k.g(str3, "url");
        this.a = str;
        this.b = str2;
        this.c = checkStatusState;
        this.d = checkConclusionState;
        this.e = str3;
        this.f = i;
        this.g = list;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && k.b(this.e, aVar.e) && this.f == aVar.f && this.g.equals(aVar.g) && k.b(this.h, aVar.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + h1.i(this.a.hashCode() * 31, this.b, 31)) * 31;
        CheckConclusionState checkConclusionState = this.d;
        int h = h1.h(s0.b(this.f, h1.i((hashCode + (checkConclusionState == null ? 0 : checkConclusionState.hashCode())) * 31, this.e, 31), 31), this.g, 31);
        String str = this.h;
        return h + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder o = s0.o("CheckRun(id=", this.a, ", name=", this.b, ", status=");
        o.append(this.c);
        o.append(", conclusion=");
        o.append(this.d);
        o.append(", url=");
        s0.w(this.f, this.e, ", totalSteps=", ", steps=", o);
        o.append(this.g);
        o.append(", contentUrl=");
        o.append(this.h);
        o.append(")");
        return o.toString();
    }
}
