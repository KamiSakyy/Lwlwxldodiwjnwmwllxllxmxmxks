package ca1;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.jsoup.SerializationException;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class l {
    public static final char[] a = {',', ';'};
    public static final HashMap b = new HashMap();
    public static final ArrayList c = new ArrayList(106);
    public static final ThreadLocal d = ThreadLocal.withInitial(new ba1.b(2));
    public static final ThreadLocal e = new ThreadLocal();

    public static void a(ba1.a aVar, k kVar, int i) {
        String str;
        int binarySearch = Arrays.binarySearch(kVar.t, i);
        if (binarySearch >= 0) {
            String[] strArr = kVar.u;
            if (binarySearch < strArr.length - 1) {
                int i2 = binarySearch + 1;
                if (kVar.t[i2] == i) {
                    str = strArr[i2];
                }
            }
            str = strArr[binarySearch];
        } else {
            str = "";
        }
        if ("".equals(str)) {
            aVar.b("&#x").b(Integer.toHexString(i)).a(';');
        } else {
            aVar.a('&').b(str).a(';');
        }
    }

    public static boolean b(int i, char c2, CharsetEncoder charsetEncoder) {
        int b2 = y3.a.b(i);
        if (b2 != 0) {
            if (b2 != 1) {
                return charsetEncoder.canEncode(c2);
            }
            if (c2 >= 55296 && c2 < 57344) {
                return false;
            }
        } else if (c2 >= 128) {
            return false;
        }
        return true;
    }

    public static void c(ba1.a aVar, String str, f fVar, int i) {
        k kVar = fVar.r;
        Charset charset = fVar.s;
        String name = charset.name();
        int i2 = name.equals("US-ASCII") ? 1 : name.startsWith("UTF-") ? 2 : 3;
        ThreadLocal threadLocal = e;
        CharsetEncoder charsetEncoder = (CharsetEncoder) threadLocal.get();
        if (charsetEncoder == null || !charsetEncoder.charset().equals(charset)) {
            charsetEncoder = charset.newEncoder();
            threadLocal.set(charsetEncoder);
        }
        int length = str.length();
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (i3 < length) {
            int codePointAt = str.codePointAt(i3);
            if ((i & 4) != 0) {
                if (ba1.h.h(codePointAt)) {
                    if (((i & 8) == 0 || z2) && !z3) {
                        if ((i & 16) != 0) {
                            z = true;
                        } else {
                            aVar.a(' ');
                            z3 = true;
                        }
                    }
                    i3 += Character.charCount(codePointAt);
                } else {
                    if (z) {
                        aVar.a(' ');
                        z = false;
                    }
                    z2 = true;
                    z3 = false;
                }
            }
            k kVar2 = k.v;
            if (kVar2 != kVar || codePointAt == 9 || codePointAt == 10 || codePointAt == 13 || ((codePointAt >= 32 && codePointAt <= 55295) || ((codePointAt >= 57344 && codePointAt <= 65533) || (codePointAt >= 65536 && codePointAt <= 1114111)))) {
                char c2 = (char) codePointAt;
                if (codePointAt < 65536) {
                    if (c2 == '\t' || c2 == '\n' || c2 == '\r') {
                        aVar.a(c2);
                    } else if (c2 != '\"') {
                        if (c2 == '<') {
                            aVar.b("&lt;");
                        } else if (c2 == '>') {
                            aVar.b("&gt;");
                        } else if (c2 != 160) {
                            if (c2 == '&') {
                                aVar.b("&amp;");
                            } else if (c2 != '\'') {
                                if (c2 < ' ' || !b(i2, c2, charsetEncoder)) {
                                    a(aVar, kVar, codePointAt);
                                } else {
                                    aVar.a(c2);
                                }
                            } else if ((i & 2) == 0 || (i & 1) == 0) {
                                aVar.a('\'');
                            } else if (kVar == kVar2) {
                                aVar.b("&#x27;");
                            } else {
                                aVar.b("&apos;");
                            }
                        } else if (kVar != kVar2) {
                            aVar.b("&nbsp;");
                        } else {
                            aVar.b("&#xa0;");
                        }
                    } else if ((i & 2) != 0) {
                        aVar.b("&quot;");
                    } else {
                        aVar.a(c2);
                    }
                } else if (b(i2, c2, charsetEncoder)) {
                    char[] cArr = (char[]) d.get();
                    int chars = Character.toChars(codePointAt, cArr, 0);
                    switch (aVar.a) {
                        case 0:
                            try {
                                aVar.b.append(new String(cArr, 0, chars));
                                break;
                            } catch (IOException e2) {
                                throw new SerializationException(e2);
                            }
                        default:
                            ((StringBuilder) aVar.b).append(cArr, 0, chars);
                            break;
                    }
                } else {
                    a(aVar, kVar, codePointAt);
                }
            }
            i3 += Character.charCount(codePointAt);
        }
    }
}
