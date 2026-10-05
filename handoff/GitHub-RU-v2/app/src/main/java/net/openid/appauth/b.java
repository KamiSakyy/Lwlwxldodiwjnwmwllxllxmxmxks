package net.openid.appauth;

import java.util.Collections;
import java.util.Map;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public static final AuthorizationException a;
    public static final AuthorizationException b;
    public static final AuthorizationException c;
    public static final Map d;

    static {
        AuthorizationException b2 = AuthorizationException.b("invalid_request", 1000);
        a = b2;
        AuthorizationException b3 = AuthorizationException.b("unauthorized_client", 1001);
        AuthorizationException b4 = AuthorizationException.b("access_denied", 1002);
        AuthorizationException b5 = AuthorizationException.b("unsupported_response_type", 1003);
        AuthorizationException b6 = AuthorizationException.b("invalid_scope", 1004);
        AuthorizationException b7 = AuthorizationException.b("server_error", 1005);
        AuthorizationException b8 = AuthorizationException.b("temporarily_unavailable", 1006);
        AuthorizationException b9 = AuthorizationException.b(null, 1007);
        AuthorizationException b10 = AuthorizationException.b(null, 1008);
        b = b10;
        c = AuthorizationException.a("Response state param did not match request state", 9);
        AuthorizationException[] authorizationExceptionArr = {b2, b3, b4, b5, b6, b7, b8, b9, b10};
        x.e eVar = new x.e(9);
        for (int i = 0; i < 9; i++) {
            AuthorizationException authorizationException = authorizationExceptionArr[i];
            String str = authorizationException.t;
            if (str != null) {
                eVar.put(str, authorizationException);
            }
        }
        d = Collections.unmodifiableMap(eVar);
    }
}
