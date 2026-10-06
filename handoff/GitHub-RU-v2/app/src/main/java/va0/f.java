package va0;

import com.github.service.models.response.Avatar;
import t.q;
import yz0.r2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final r2 a(q60.a aVar) {
        k71.k.g(aVar, "<this>");
        String str = aVar.b;
        return new r2(str, str, q.q(aVar.d), false);
    }

    public static final r2 b(q60.b bVar) {
        k71.k.g(bVar, "<this>");
        String str = bVar.b;
        String str2 = bVar.c;
        String str3 = bVar.d;
        if (str3 == null) {
            str3 = "";
        }
        return new r2(str, str2, new Avatar(str3, Avatar.Type.Organization), false);
    }

    public static final r2 c(q60.c cVar) {
        k71.k.g(cVar, "<this>");
        String str = cVar.b;
        if (str == null) {
            str = "";
        }
        return new r2(str, cVar.c, q.q(cVar.e), false);
    }

    public static Object c;
}
