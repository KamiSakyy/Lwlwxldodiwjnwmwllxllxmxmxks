package l81;

import k71.x;
import k81.c1;
import k81.g0;
import k81.q1;
import kotlinx.serialization.json.internal.JsonDecodingException;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class j {
    public static final g0 a = c1.a("kotlinx.serialization.json.JsonUnquotedLiteral", q1.a);

    public static final void a(kotlinx.serialization.json.b bVar, String str) {
        throw new IllegalArgumentException("Element " + x.a(bVar.getClass()) + " is not a " + str);
    }

    public static final Boolean b(kotlinx.serialization.json.d dVar) {
        String a2 = dVar.a();
        String[] strArr = m81.t.a;
        k71.k.g(a2, "<this>");
        if (a2.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }
        if (a2.equalsIgnoreCase("false")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public static final Integer c(kotlinx.serialization.json.d dVar) {
        Long l;
        try {
            l = Long.valueOf(g(dVar));
        } catch (JsonDecodingException unused) {
            l = null;
        }
        if (l != null) {
            long longValue = l.longValue();
            if (-2147483648L <= longValue && longValue <= 2147483647L) {
                return Integer.valueOf((int) longValue);
            }
        }
        return null;
    }

    public static final kotlinx.serialization.json.a d(kotlinx.serialization.json.b bVar) {
        kotlinx.serialization.json.a aVar = bVar instanceof kotlinx.serialization.json.a ? (kotlinx.serialization.json.a) bVar : null;
        if (aVar != null) {
            return aVar;
        }
        a(bVar, "JsonArray");
        throw null;
    }

    public static final kotlinx.serialization.json.c e(kotlinx.serialization.json.b bVar) {
        k71.k.g(bVar, "<this>");
        kotlinx.serialization.json.c cVar = bVar instanceof kotlinx.serialization.json.c ? (kotlinx.serialization.json.c) bVar : null;
        if (cVar != null) {
            return cVar;
        }
        a(bVar, "JsonObject");
        throw null;
    }

    public static final kotlinx.serialization.json.d f(kotlinx.serialization.json.b bVar) {
        k71.k.g(bVar, "<this>");
        kotlinx.serialization.json.d dVar = bVar instanceof kotlinx.serialization.json.d ? (kotlinx.serialization.json.d) bVar : null;
        if (dVar != null) {
            return dVar;
        }
        a(bVar, "JsonPrimitive");
        throw null;
    }

    public static final long g(kotlinx.serialization.json.d dVar) {
        String a2 = dVar.a();
        a7.q qVar = new a7.q(a2);
        long l = qVar.l();
        if (qVar.i() == 10) {
            return l;
        }
        int i = qVar.b;
        int i2 = i - 1;
        a7.q.s(qVar, f1.e.z("Expected input to contain a single valid number, but got '", (i == a2.length() || i2 < 0) ? "EOF" : String.valueOf(a2.charAt(i2)), "' after it"), i2, (String) null, 4);
        throw null;
    }
}
