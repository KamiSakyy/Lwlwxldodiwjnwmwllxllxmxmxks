package nj;

import com.github.rudroid.copilot.h2;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j0 {
    public oa.g a;

    public j0(oa.g gVar) {
        k71.k.g(gVar, "service");
        this.a = gVar;
    }

    public final y71.y a(oa.j jVar, String str, String str2, List list, List list2, String str3, String str4, h2 h2Var) {
        k71.k.g(str, "threadId");
        k71.k.g(str2, "content");
        k71.k.g(list, "references");
        k71.k.g(list2, "confirmations");
        return b31.b.J(((z01.i) this.a.a(jVar)).f(str, str2, str3, str4, list, list2), jVar, h2Var);
    }

}
