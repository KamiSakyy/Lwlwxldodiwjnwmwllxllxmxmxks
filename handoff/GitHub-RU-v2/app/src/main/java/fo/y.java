package fo;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y implements z01.j0, yn.a {
    public final y71.i a(String str, String str2) {
        return x.i.q(str, "owner", str2, "name");
    }

    public final y71.i b(String str, String str2, String str3) {
        k71.k.g(str, "listId");
        return x.i.q(str2, "title", str3, "description");
    }

    public final y71.i c(String str, List list, List list2) {
        return sy.c0.j();
    }

    public final y71.i d(String str, String str2) {
        k71.k.g(str2, "login");
        return sy.c0.j();
    }

    public final y71.i e(String str, String str2, String str3) {
        return x.i.q(str, "title", str2, "description");
    }

    public final y71.i f(String str, String str2, String str3) {
        return x.i.q(str, "login", str2, "slug");
    }

    public final y71.i g(String str, String str2) {
        k71.k.g(str2, "slug");
        return sy.c0.j();
    }

    public final Object h() {
        return this;
    }
}
