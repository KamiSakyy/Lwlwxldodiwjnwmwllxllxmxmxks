package xz0;

import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import java.util.LinkedHashMap;
import java.util.List;
import k71.k;
import x61.x;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public static ApiFailure a(ApiFailure apiFailure, String str, String str2, String str3) {
        k.g(apiFailure, "<this>");
        k.g(str, "owner");
        LinkedHashMap C = x.C(apiFailure.w);
        C.put("failure_data_key_owner_login", str);
        if (str2 != null) {
            C.put("failure_data_key_owner_name", str2);
        }
        if (str3 != null) {
            C.put("failure_data_key_avatar_url", str3);
        }
        ApiFailureType apiFailureType = apiFailure.r;
        String str4 = apiFailure.s;
        String str5 = apiFailure.t;
        Integer num = apiFailure.u;
        List list = apiFailure.v;
        Throwable th = apiFailure.x;
        k.g(apiFailureType, "failureType");
        k.g(list, "path");
        return new ApiFailure(apiFailureType, str4, str5, num, list, C, th);
    }
}
