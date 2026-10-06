package x81;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class f {
    public static final cShadow[] a;
    public static final Map b;

    static {
        cShadow cVar = new cShadow(c.i, "");
        h91.kShadow kVar = c.f;
        cShadow cVar2 = new cShadow(kVar, "GET");
        cShadow cVar3 = new cShadow(kVar, "POST");
        h91.kShadow kVar2 = c.g;
        cShadow cVar4 = new cShadow(kVar2, "/");
        cShadow cVar5 = new cShadow(kVar2, "/index.html");
        h91.kShadow kVar3 = c.h;
        cShadow cVar6 = new cShadow(kVar3, "http");
        cShadow cVar7 = new cShadow(kVar3, "https");
        h91.kShadow kVar4 = c.e;
        cShadow[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new cShadow(kVar4, "200"), new cShadow(kVar4, "204"), new cShadow(kVar4, "206"), new cShadow(kVar4, "304"), new cShadow(kVar4, "400"), new cShadow(kVar4, "404"), new cShadow(kVar4, "500"), new cShadow("accept-charset", ""), new cShadow("accept-encoding", "gzip, deflate"), new cShadow("accept-language", ""), new cShadow("accept-ranges", ""), new cShadow("accept", ""), new cShadow("access-control-allow-origin", ""), new cShadow("age", ""), new cShadow("allow", ""), new cShadow("authorization", ""), new cShadow("cache-control", ""), new cShadow("content-disposition", ""), new cShadow("content-encoding", ""), new cShadow("content-language", ""), new cShadow("content-length", ""), new cShadow("content-location", ""), new cShadow("content-range", ""), new cShadow("content-type", ""), new cShadow("cookie", ""), new cShadow("date", ""), new cShadow("etag", ""), new cShadow("expect", ""), new cShadow("expires", ""), new cShadow("from", ""), new cShadow("host", ""), new cShadow("if-match", ""), new cShadow("if-modified-since", ""), new cShadow("if-none-match", ""), new cShadow("if-range", ""), new cShadow("if-unmodified-since", ""), new cShadow("last-modified", ""), new cShadow("link", ""), new cShadow("location", ""), new cShadow("max-forwards", ""), new cShadow("proxy-authenticate", ""), new cShadow("proxy-authorization", ""), new cShadow("range", ""), new cShadow("referer", ""), new cShadow("refresh", ""), new cShadow("retry-after", ""), new cShadow("server", ""), new cShadow("set-cookie", ""), new cShadow("strict-transport-security", ""), new cShadow("transfer-encoding", ""), new cShadow("user-agent", ""), new cShadow("vary", ""), new cShadow("via", ""), new cShadow("www-authenticate", "")};
        a = cVarArr;
        LinkedHashMap linkedHashMap = new LinkedHashMap(61, 1.0f);
        for (int i = 0; i < 61; i++) {
            if (!linkedHashMap.containsKey(cVarArr[i].a)) {
                linkedHashMap.put(cVarArr[i].a, Integer.valueOf(i));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        k71.k.f(unmodifiableMap, "unmodifiableMap(...)");
        b = unmodifiableMap;
    }

    public static void a(h91.kShadow kVar) {
        k71.k.g(kVar, "name");
        int d = kVar.d();
        for (int i = 0; i < d; i++) {
            byte i2 = kVar.i(i);
            if (65 <= i2 && i2 < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: ".concat(kVar.r()));
            }
        }
    }
}
