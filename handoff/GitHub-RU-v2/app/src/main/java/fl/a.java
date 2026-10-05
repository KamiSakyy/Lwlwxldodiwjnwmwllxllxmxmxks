package fl;

import java.util.LinkedHashMap;
import k71.k;
import oa.j;
import x61.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static b a(b bVar, String str, String str2, String str3) {
        k.g(bVar, "<this>");
        k.g(str, "ownerLogin");
        LinkedHashMap C = x.C(bVar.d);
        C.put("failure_data_key_owner_login", str);
        if (str2 != null) {
            C.put("failure_data_key_owner_name", str2);
        }
        if (str3 != null) {
            C.put("failure_data_key_avatar_url", str3);
        }
        c cVar = bVar.a;
        String str4 = bVar.b;
        Integer num = bVar.c;
        j jVar = bVar.e;
        Throwable th2 = bVar.f;
        long j = bVar.g;
        k.g(cVar, "failureType");
        k.g(jVar, "user");
        k.g(th2, "throwable");
        return new b(cVar, str4, num, C, jVar, th2, j);
    }

    public static /* synthetic */ b b(a aVar, b bVar, String str) {
        aVar.getClass();
        return a(bVar, str, null, null);
    }
}
