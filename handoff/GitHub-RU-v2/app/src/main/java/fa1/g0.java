package fa1;

import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes5.dex */
public final class g0 extends x0 {
    public final Method d;
    public final int e;
    public final String f;
    public final b g;
    public final boolean h;

    public g0(Method method, int i, String str, boolean z) {
        b bVar = b.s;
        this.d = method;
        this.e = i;
        Objects.requireNonNull(str, "name == null");
        this.f = str;
        this.g = bVar;
        this.h = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fe  */
    @Override // fa1.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(n0 n0Var, Object obj) {
        String str;
        String replace;
        char c;
        String str2 = this.f;
        if (obj == null) {
            throw x0.n(this.d, this.e, f1.e.z("Path parameter \"", str2, "\" value must not be null."), new Object[0]);
        }
        this.g.getClass();
        String obj2 = obj.toString();
        if (n0Var.c == null) {
            throw new AssertionError();
        }
        int length = obj2.length();
        int i = 0;
        while (i < length) {
            int codePointAt = obj2.codePointAt(i);
            boolean z = this.h;
            int i2 = 47;
            int i3 = -1;
            int i4 = 127;
            int i5 = 32;
            if (codePointAt < 32 || codePointAt >= 127 || " \"<>^`{}|\\?#".indexOf(codePointAt) != -1 || (!z && (codePointAt == 47 || codePointAt == 37))) {
                h91.h hVar = new h91.h();
                hVar.O0(0, obj2, i);
                h91.h hVar2 = null;
                while (i < length) {
                    int codePointAt2 = obj2.codePointAt(i);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 < i5 || codePointAt2 >= i4 || " \"<>^`{}|\\?#".indexOf(codePointAt2) != i3 || (!z && (codePointAt2 == i2 || codePointAt2 == 37))) {
                            if (hVar2 == null) {
                                hVar2 = new h91.h();
                            }
                            hVar2.Q0(codePointAt2);
                            long j = hVar2.s;
                            for (long j2 = 0; j2 < j; j2++) {
                                byte F = hVar2.F(j2);
                                hVar.J0(37);
                                char[] cArr = n0.l;
                                hVar.J0(cArr[((F & 255) >> 4) & 15]);
                                hVar.J0(cArr[F & 15]);
                            }
                            c = '%';
                            hVar2.r();
                            i += Character.charCount(codePointAt2);
                            i2 = 47;
                            i3 = -1;
                            i4 = 127;
                            i5 = 32;
                        } else {
                            hVar.Q0(codePointAt2);
                        }
                    }
                    c = '%';
                    i += Character.charCount(codePointAt2);
                    i2 = 47;
                    i3 = -1;
                    i4 = 127;
                    i5 = 32;
                }
                str = hVar.o0();
                replace = n0Var.c.replace("{" + str2 + "}", str);
                if (!n0.m.matcher(replace).matches()) {
                    throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): ".concat(obj2));
                }
                n0Var.c = replace;
                return;
            }
            i += Character.charCount(codePointAt);
        }
        str = obj2;
        replace = n0Var.c.replace("{" + str2 + "}", str);
        if (!n0.m.matcher(replace).matches()) {
        }
    }
}
