package nn;

import aa.w;
import ea.e;
import ea.f;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.chrono.ChronoZonedDateTime;
import java.time.format.DateTimeFormatter;
import jo.f4;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a implements aa.a {
    public final /* synthetic */ int a;

    public final Object a(e eVar, w wVar) {
        switch (this.a) {
            case 0:
                k.g(eVar, "reader");
                k.g(wVar, "customScalarAdapters");
                String u = eVar.u();
                if (u == null) {
                    throw new IllegalArgumentException("GraphQL date value is not a string!");
                }
                LocalDate parse = LocalDate.parse(u, DateTimeFormatter.ISO_DATE);
                k.f(parse, "parse(...)");
                return parse;
            case 1:
                k.g(eVar, "reader");
                k.g(wVar, "customScalarAdapters");
                String u2 = eVar.u();
                if (u2 == null) {
                    throw new IllegalArgumentException("GraphQL date value is not a string!");
                }
                ChronoZonedDateTime<LocalDate> withZoneSameInstant = ZonedDateTime.parse(u2, DateTimeFormatter.ISO_ZONED_DATE_TIME).withZoneSameInstant(ZoneId.systemDefault());
                k.f(withZoneSameInstant, "withZoneSameInstant(...)");
                return withZoneSameInstant;
            case 2:
                k.g(eVar, "reader");
                k.g(wVar, "customScalarAdapters");
                String u3 = eVar.u();
                if (u3 != null) {
                    return u3;
                }
                throw new IllegalArgumentException("value is not a string!");
            case 3:
                k.g(eVar, "reader");
                k.g(wVar, "customScalarAdapters");
                long nextLong = eVar.nextLong();
                if (nextLong <= 2147483647L) {
                    return Integer.valueOf((int) nextLong);
                }
                while (nextLong > 2147483647L) {
                    nextLong = f4.c(1, nextLong, "substring(...)");
                }
                return Integer.valueOf((int) nextLong);
            case 4:
                k.g(eVar, "reader");
                k.g(wVar, "customScalarAdapters");
                long nextLong2 = eVar.nextLong();
                if (nextLong2 <= 2147483647L) {
                    return Integer.valueOf((int) nextLong2);
                }
                while (nextLong2 > 2147483647L) {
                    nextLong2 = f4.c(1, nextLong2, "substring(...)");
                }
                return Integer.valueOf((int) nextLong2);
            case 5:
                k.g(eVar, "reader");
                k.g(wVar, "customScalarAdapters");
                long nextLong3 = eVar.nextLong();
                if (nextLong3 <= 2147483647L) {
                    return Integer.valueOf((int) nextLong3);
                }
                while (nextLong3 > 2147483647L) {
                    nextLong3 = f4.c(1, nextLong3, "substring(...)");
                }
                return Integer.valueOf((int) nextLong3);
            default:
                k.g(eVar, "reader");
                k.g(wVar, "customScalarAdapters");
                long nextLong4 = eVar.nextLong();
                if (nextLong4 <= 2147483647L) {
                    return Integer.valueOf((int) nextLong4);
                }
                while (nextLong4 > 2147483647L) {
                    nextLong4 = f4.c(1, nextLong4, "substring(...)");
                }
                return Integer.valueOf((int) nextLong4);
        }
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.time.ZonedDateTime] */
    public final void b(f fVar, w wVar, Object obj) {
        switch (this.a) {
            case 0:
                LocalDate localDate = (LocalDate) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(localDate, "value");
                String format = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                k.f(format, "format(...)");
                fVar.I(format);
                break;
            case 1:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(zonedDateTime, "value");
                String format2 = zonedDateTime.withZoneSameInstant((ZoneId) ZoneOffset.UTC).format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'"));
                k.f(format2, "format(...)");
                fVar.I(format2);
                break;
            case 2:
                String str = (String) obj;
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                k.g(str, "value");
                fVar.I(str);
                break;
            case 3:
                int intValue = ((Number) obj).intValue();
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                fVar.z(intValue);
                break;
            case 4:
                int intValue2 = ((Number) obj).intValue();
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                fVar.z(intValue2);
                break;
            case 5:
                int intValue3 = ((Number) obj).intValue();
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                fVar.z(intValue3);
                break;
            default:
                int intValue4 = ((Number) obj).intValue();
                k.g(fVar, "writer");
                k.g(wVar, "customScalarAdapters");
                fVar.z(intValue4);
                break;
        }
    }
}
