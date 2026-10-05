package oi;

import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.Locale;
import k71.k;
import pi.m;
import pi.n;
import pi.o;
import pi.p;
import q71.g;
import t71.j;
import t71.l;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b extends c {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(String str, int i) {
        super(str);
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r2 == null) goto L11;
     */
    @Override // oi.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final m a(l lVar) {
        p nVar;
        pi.l lVar2;
        p pVar;
        switch (this.b) {
            case 0:
                k.g(lVar, "match");
                g b = lVar.b();
                j b2 = lVar.c.b(1);
                if (b2 != null) {
                    pi.k kVar = pi.l.Companion;
                    String str = b2.a;
                    kVar.getClass();
                    pi.l[] values = pi.l.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            lVar2 = values[i];
                            String str2 = lVar2.r;
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            k.f(lowerCase, "toLowerCase(...)");
                            if (!str2.equals(lowerCase)) {
                                i++;
                            }
                        } else {
                            lVar2 = null;
                        }
                    }
                    if (lVar2 != null) {
                        nVar = new pi.j(lVar.c(), lVar2);
                        return new m(b, nVar);
                    }
                }
                nVar = new n(lVar.c());
                return new m(b, nVar);
            default:
                k.g(lVar, "match");
                g b3 = lVar.b();
                j b4 = lVar.c.b(1);
                if (b4 != null) {
                    try {
                        String c = lVar.c();
                        ZonedDateTime parse = ZonedDateTime.parse(b4.a);
                        k.f(parse, "parse(...)");
                        pVar = new o(c, parse);
                        break;
                    } catch (DateTimeParseException unused) {
                        pVar = null;
                        break;
                    }
                }
                pVar = new n(lVar.c());
                return new m(b3, pVar);
        }
    }
}
