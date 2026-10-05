package sy;

import com.github.service.models.response.Avatar;
import yz0.r2;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final r2 a(zt.a aVar) {
        k71.k.g(aVar, "<this>");
        return new r2(aVar.d, aVar.c ? "copilot" : aVar.b, w8.s.A(aVar.f), true);
    }

    public static final r2 b(zt.b bVar) {
        k71.k.g(bVar, "<this>");
        String str = bVar.b;
        String str2 = bVar.c;
        String str3 = bVar.d;
        if (str3 == null) {
            str3 = "";
        }
        return new r2(str, str2, new Avatar(str3, Avatar.Type.Organization), false);
    }

    public static final r2 c(zt.c cVar) {
        k71.k.g(cVar, "<this>");
        String str = cVar.b;
        if (str == null) {
            str = "";
        }
        return new r2(str, cVar.c, w8.s.A(cVar.e), false);
    }
}
