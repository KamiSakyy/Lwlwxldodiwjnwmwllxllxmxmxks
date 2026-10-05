package m81;

import d1.i1;
import java.lang.annotation.Annotation;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.JsonDecodingException;
import kotlinx.serialization.json.internal.JsonEncodingException;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class i {
    public static final j a = new j();

    public static final JsonDecodingException a(Number number, String str, String str2) {
        k71.k.g(str, "key");
        k71.k.g(str2, "output");
        return e("Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(-1, str2)), -1);
    }

    public static final JsonEncodingException b(Number number, String str) {
        return new JsonEncodingException("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) m(-1, str)));
    }

    public static final JsonEncodingException c(SerialDescriptor serialDescriptor) {
        return new JsonEncodingException("Value of type '" + serialDescriptor.a() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + serialDescriptor.e() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    public static final JsonDecodingException d(int i, CharSequence charSequence, String str) {
        k71.k.g(str, "message");
        k71.k.g(charSequence, "input");
        return e(str + "\nJSON input: " + ((Object) m(i, charSequence)), i);
    }

    public static final JsonDecodingException e(String str, int i) {
        k71.k.g(str, "message");
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new JsonDecodingException(str);
    }

    public static final SerialDescriptor f(SerialDescriptor serialDescriptor, b21.l lVar) {
        SerialDescriptor f;
        KSerializer a2;
        k71.k.g(serialDescriptor, "<this>");
        k71.k.g(lVar, "module");
        if (!k71.k.b(serialDescriptor.e(), i81.i.e)) {
            return serialDescriptor.h() ? f(serialDescriptor.j(0), lVar) : serialDescriptor;
        }
        r71.b n = w8.s.n(serialDescriptor);
        SerialDescriptor serialDescriptor2 = null;
        if (n != null && (a2 = lVar.a(n, x61.r.r)) != null) {
            serialDescriptor2 = a2.getDescriptor();
        }
        return (serialDescriptor2 == null || (f = f(serialDescriptor2, lVar)) == null) ? serialDescriptor : f;
    }

    public static final byte g(char c) {
        if (c < '~') {
            return d.b[c];
        }
        return (byte) 0;
    }

    public static final String h(SerialDescriptor serialDescriptor, l81.c cVar) {
        k71.k.g(serialDescriptor, "<this>");
        k71.k.g(cVar, "json");
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof l81.g) {
                return ((l81.g) annotation).discriminator();
            }
        }
        return cVar.a.g;
    }

    public static final int i(SerialDescriptor serialDescriptor, l81.c cVar, String str) {
        k71.k.g(serialDescriptor, "<this>");
        k71.k.g(cVar, "json");
        k71.k.g(str, "name");
        n(serialDescriptor, cVar);
        int d = serialDescriptor.d(str);
        if (d != -3 || !cVar.a.h) {
            return d;
        }
        kk.a aVar = cVar.c;
        i1 i1Var = new i1(26, serialDescriptor, cVar);
        aVar.getClass();
        j jVar = a;
        Object r = aVar.r(serialDescriptor, jVar);
        if (r == null) {
            r = i1Var.a();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) aVar.s;
            Object obj = concurrentHashMap.get(serialDescriptor);
            if (obj == null) {
                obj = new ConcurrentHashMap(2);
                concurrentHashMap.put(serialDescriptor, obj);
            }
            ((Map) obj).put(jVar, r);
        }
        Integer num = (Integer) ((Map) r).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final int j(SerialDescriptor serialDescriptor, l81.c cVar, String str, String str2) {
        k71.k.g(serialDescriptor, "<this>");
        k71.k.g(cVar, "json");
        k71.k.g(str, "name");
        k71.k.g(str2, "suffix");
        int i = i(serialDescriptor, cVar, str);
        if (i != -3) {
            return i;
        }
        throw new SerializationException(serialDescriptor.a() + " does not contain element with name '" + str + '\'' + str2);
    }

    public static final boolean k(SerialDescriptor serialDescriptor, l81.c cVar) {
        k71.k.g(serialDescriptor, "<this>");
        k71.k.g(cVar, "json");
        if (cVar.a.b) {
            return true;
        }
        List annotations = serialDescriptor.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof l81.m) {
                return true;
            }
        }
        return false;
    }

    public static final void l(a7.q qVar, String str) {
        qVar.r("Trailing comma before the end of JSON ".concat(str), qVar.b - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence m(int i, CharSequence charSequence) {
        k71.k.g(charSequence, "<this>");
        if (charSequence.length() >= 200) {
            if (i != -1) {
                int i2 = i - 30;
                int i3 = i + 30;
                String str = i2 <= 0 ? "" : ".....";
                String str2 = i3 >= charSequence.length() ? "" : ".....";
                StringBuilder p = f1.e.p(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length = charSequence.length();
                if (i3 > length) {
                    i3 = length;
                }
                p.append(charSequence.subSequence(i2, i3).toString());
                p.append(str2);
                return p.toString();
            }
            int length2 = charSequence.length() - 60;
            if (length2 > 0) {
                return "....." + charSequence.subSequence(length2, charSequence.length()).toString();
            }
        }
        return charSequence;
    }

    public static final void n(SerialDescriptor serialDescriptor, l81.c cVar) {
        k71.k.g(serialDescriptor, "<this>");
        k71.k.g(cVar, "json");
        k71.k.b(serialDescriptor.e(), i81.k.e);
    }

    public static final Object o(l81.c cVar, String str, kotlinx.serialization.json.c cVar2, KSerializer kSerializer) {
        k71.k.g(cVar, "<this>");
        k71.k.g(str, "discriminator");
        return new l(cVar, cVar2, str, kSerializer.getDescriptor()).u(kSerializer);
    }

    public static final u p(SerialDescriptor serialDescriptor, l81.c cVar) {
        k71.k.g(serialDescriptor, "desc");
        y9.a e = serialDescriptor.e();
        if (e instanceof i81.d) {
            return u.w;
        }
        if (k71.k.b(e, i81.k.f)) {
            return u.u;
        }
        if (!k71.k.b(e, i81.k.g)) {
            return u.t;
        }
        SerialDescriptor f = f(serialDescriptor.j(0), cVar.b);
        y9.a e2 = f.e();
        if ((e2 instanceof i81.f) || k71.k.b(e2, i81.j.e)) {
            return u.v;
        }
        throw c(f);
    }

    public static final void q(a7.q qVar, Number number) {
        a7.q.s(qVar, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
        throw null;
    }

    public static final String r(byte b) {
        return b == 1 ? "quotation mark '\"'" : b == 2 ? "string escape sequence '\\'" : b == 4 ? "comma ','" : b == 5 ? "colon ':'" : b == 6 ? "start of the object '{'" : b == 7 ? "end of the object '}'" : b == 8 ? "start of the array '['" : b == 9 ? "end of the array ']'" : b == 10 ? "end of the input" : b == Byte.MAX_VALUE ? "invalid token" : "valid token";
    }
}
