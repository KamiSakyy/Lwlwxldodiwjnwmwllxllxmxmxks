package x81;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class f {
    public static final c[] a;
    public static final Map b;

    static {
        c cVar = new c(c.i, "");
        h91.k kVar = c.f;
        c cVar2 = new c(kVar, "GET");
        c cVar3 = new c(kVar, "POST");
        h91.k kVar2 = c.g;
        c cVar4 = new c(kVar2, "/");
        c cVar5 = new c(kVar2, "/index.html");
        h91.k kVar3 = c.h;
        c cVar6 = new c(kVar3, "http");
        c cVar7 = new c(kVar3, "https");
        h91.k kVar4 = c.e;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(kVar4, "200"), new c(kVar4, "204"), new c(kVar4, "206"), new c(kVar4, "304"), new c(kVar4, "400"), new c(kVar4, "404"), new c(kVar4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c("etag", ""), new c("expect", ""), new c("expires", ""), new c("from", ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c("refresh", ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
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

    public static void a(h91.k kVar) {
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
