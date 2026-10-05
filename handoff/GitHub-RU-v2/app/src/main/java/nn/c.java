package nn;

import aa.w;
import ea.e;
import ea.f;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements aa.a {
    public static final b Companion = new b();
    public static final DateTimeFormatter a = DateTimeFormatter.ofPattern("HH:mm");

    public final Object a(e eVar, w wVar) {
        k.g(eVar, "reader");
        k.g(wVar, "customScalarAdapters");
        String u = eVar.u();
        if (u == null) {
            throw new IllegalArgumentException("GraphQL date value is not a string!");
        }
        LocalTime parse = LocalTime.parse(u, a);
        k.f(parse, "parse(...)");
        return parse;
    }

    public final void b(f fVar, w wVar, Object obj) {
        LocalTime localTime = (LocalTime) obj;
        k.g(fVar, "writer");
        k.g(wVar, "customScalarAdapters");
        k.g(localTime, "value");
        String format = localTime.format(a);
        k.f(format, "format(...)");
        fVar.I(format);
    }
}
